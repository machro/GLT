package nl.tue.glt;

import java.io.File;

import org.eclipse.epsilon.egl.EglFileGeneratingTemplateFactory;
import org.eclipse.epsilon.egl.EgxModule;
import org.eclipse.epsilon.emc.emf.EmfModel;
import org.eclipse.epsilon.emc.plainxml.PlainXmlModel;

import java.io.IOException;
import java.net.URISyntaxException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.resource.XtextResourceSet;

import com.google.inject.Injector;

public class App {
	
	public static String getPath(String path) throws URISyntaxException {
		return App.class.getResource("App.class").toURI().resolve("../../../../" + path).getPath();
	}
	
	public static void main(String[] args) throws Exception {
		Injector injector = (Injector) (new BoundingBoxStandaloneSetup()
	            .createInjectorAndDoEMFRegistration());
	    XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);
	    String inputURI = getPath("transform/bounding.boundingdsl");
	    String outputURI = getPath("transform/bounding.xmi");

	    URI uri = URI.createURI(inputURI);
	    Resource xtextResource = resourceSet.getResource(uri, true);

	    EcoreUtil.resolveAll(xtextResource);

	    Resource xmiResource = resourceSet
	            .createResource(URI.createURI(outputURI));
	    xmiResource.getContents().add(xtextResource.getContents().get(0));
	    try {
	        xmiResource.save(null);
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
		
		
		// Parse main.egx
		EgxModule module = new EgxModule(new EglFileGeneratingTemplateFactory());
		module.parse(new File(getPath("transform/main.egx")).getAbsoluteFile());
		
		if (!module.getParseProblems().isEmpty()) {
			System.out.println("Syntax errors found. Exiting.");
			return;
		}
		
		// Load the XML document
		EmfModel model = new EmfModel();
		model.setMetamodelFile("model/generated/BoundingBox.ecore");
		model.setModelFile("transform/bounding.xmi");
		model.setName("box");
		model.load();
		
		// Make the document visible to the EGX program
		module.getContext().getModelRepository().addModel(model);
		// ... and execute
		module.execute();
	}
	
}




