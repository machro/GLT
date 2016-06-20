package nl.tue.glt;

import java.io.File;

//import org.eclipse.epsilon.egl.EglFileGeneratingTemplateFactory;
//import org.eclipse.epsilon.egl.EgxModule;
//import org.eclipse.epsilon.emc.emf.EmfModel;
//import org.eclipse.epsilon.emc.plainxml.PlainXmlModel;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.epsilon.common.util.StringProperties;
import org.eclipse.epsilon.egl.EglFileGeneratingTemplateFactory;
import org.eclipse.epsilon.egl.EgxModule;
import org.eclipse.epsilon.emc.emf.EmfModel;
import org.eclipse.epsilon.eol.exceptions.models.EolModelLoadingException;
import org.eclipse.epsilon.eol.models.IModel;
import org.eclipse.epsilon.eol.models.IRelativePathResolver;
import org.eclipse.epsilon.etl.EtlModule;
import org.eclipse.xtext.resource.XtextResourceSet;

import com.google.common.io.Files;
import com.google.inject.Injector;

public class App {

	public static String getPath(String path) throws URISyntaxException {
		return App.class.getResource("App.class").toURI().resolve("../../../../" + path).getPath();
	}
	
	public static void toXText() throws URISyntaxException {
		Injector injector = (Injector) (new BoundingBoxStandaloneSetup()
	            .createInjectorAndDoEMFRegistration());
	    XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);
	    String inputURI = getPath("transform/bounding.xmi");
	    String outputURI = getPath("output/bounding.boundingdsl");

	    org.eclipse.emf.common.util.URI uri = org.eclipse.emf.common.util.URI.createURI(inputURI);
	    Resource xmi = resourceSet.getResource(uri, true);

	    EcoreUtil.resolveAll(xmi);

	    Resource xtext = resourceSet
	            .createResource(org.eclipse.emf.common.util.URI.createURI(outputURI));
	    xtext.getContents().add(xmi.getContents().get(0));
	    try {
	        xtext.save(null);
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	}
	
	public static void createXMI() throws URISyntaxException {
		Injector injector = (Injector) (new PlatoonStandaloneSetup()
	            .createInjectorAndDoEMFRegistration());
	    XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);
	    String inputURI = getPath("transform/input.platoondsl");
	    String outputURI = getPath("transform/platoon.xmi");

	    org.eclipse.emf.common.util.URI uri = org.eclipse.emf.common.util.URI.createURI(inputURI);
	    Resource xtextResource = resourceSet.getResource(uri, true);

	    EcoreUtil.resolveAll(xtextResource);

	    Resource xmiResource = resourceSet
	            .createResource(org.eclipse.emf.common.util.URI.createURI(outputURI));
	    xmiResource.getContents().add(xtextResource.getContents().get(0));
	    try {
	        xmiResource.save(null);
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	}
	
	public static void toNXC() throws Exception {
		// Parse main.egx
		EgxModule module = new EgxModule(new EglFileGeneratingTemplateFactory());
		module.parse(new File(getPath("transform/main.egx")).getAbsoluteFile());
		
		if (!module.getParseProblems().isEmpty()) {
			System.out.println("Syntax errors found. Exiting.");
			return;
		}
		
		// Load the XML document
		EmfModel model = new EmfModel();
		model.setMetamodelFile("model/generated/Platoon.ecore");
		model.setModelFile("transform/platoon.xmi");
		model.setName("platoon");
		model.load();
		
		// Make the document visible to the EGX program
		module.getContext().getModelRepository().addModel(model);
		// ... and execute
		module.execute();
	}
	
	public static void p2b() throws Exception {
		// Parse main.etl
	    EtlModule module = new EtlModule();
		module.parse(new File(getPath("transform/main.etl")).getAbsoluteFile());
		
		if (!module.getParseProblems().isEmpty()) {
			System.out.println("Syntax errors found. Exiting.");
			return;
		}
		
		List<IModel> models = new ArrayList<IModel>();
		module.getContext().getModelRepository().addModel(createEmfModel("Platoon", "transform/platoon.xmi", "model/generated/Platoon.ecore", true, true));
		module.getContext().getModelRepository().addModel(createEmfModel("BoundingBox", "transform/bounding.xmi", "model/BoundingBox.ecore", false, true));

		// ... and execute
		module.execute();
		module.getContext().getModelRepository().dispose();
	}

	public static void main(String[] args) throws Exception {
		createXMI();
		toNXC();
		p2b();
		toXText();
		
		new File(getPath("transform/bounding.xmi")).delete();
		new File(getPath("transform/platoon.xmi")).delete();
		System.out.println("Finished! The java code is created in the /output folder.");
	}
		
	// http://www.eclipse.org/epsilon/examples/index.php?example=org.eclipse.epsilon.examples.standalone
	protected static EmfModel createEmfModel(String name, String model, String metamodel, boolean readOnLoad, boolean storeOnDisposal) throws EolModelLoadingException, URISyntaxException {
		EmfModel emfModel = new EmfModel();
		StringProperties properties = new StringProperties();
		properties.put(EmfModel.PROPERTY_NAME, name);
		properties.put(EmfModel.PROPERTY_FILE_BASED_METAMODEL_URI,
		    getPath(metamodel));
		properties.put(EmfModel.PROPERTY_MODEL_URI, 
		    getPath(model));
		properties.put(EmfModel.PROPERTY_READONLOAD, readOnLoad + "");
		properties.put(EmfModel.PROPERTY_STOREONDISPOSAL, 
		    storeOnDisposal + "");
		emfModel.load(properties, (IRelativePathResolver) null);
		return emfModel;
	}

}
