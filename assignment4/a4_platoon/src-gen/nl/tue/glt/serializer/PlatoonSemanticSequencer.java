/*
 * generated by Xtext 2.10.0
 */
package nl.tue.glt.serializer;

import com.google.inject.Inject;
import java.util.Set;
import nl.tue.glt.platoon.Constraints;
import nl.tue.glt.platoon.FV;
import nl.tue.glt.platoon.Forward;
import nl.tue.glt.platoon.LV;
import nl.tue.glt.platoon.Left;
import nl.tue.glt.platoon.Model;
import nl.tue.glt.platoon.Platoon;
import nl.tue.glt.platoon.PlatoonPackage;
import nl.tue.glt.platoon.Right;
import nl.tue.glt.platoon.Route;
import nl.tue.glt.services.PlatoonGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class PlatoonSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private PlatoonGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == PlatoonPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case PlatoonPackage.CONSTRAINTS:
				sequence_Constraints(context, (Constraints) semanticObject); 
				return; 
			case PlatoonPackage.FV:
				sequence_FV(context, (FV) semanticObject); 
				return; 
			case PlatoonPackage.FORWARD:
				sequence_Forward(context, (Forward) semanticObject); 
				return; 
			case PlatoonPackage.LV:
				sequence_LV(context, (LV) semanticObject); 
				return; 
			case PlatoonPackage.LEFT:
				sequence_Left(context, (Left) semanticObject); 
				return; 
			case PlatoonPackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			case PlatoonPackage.PLATOON:
				sequence_Platoon(context, (Platoon) semanticObject); 
				return; 
			case PlatoonPackage.RIGHT:
				sequence_Right(context, (Right) semanticObject); 
				return; 
			case PlatoonPackage.ROUTE:
				sequence_Route(context, (Route) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Constraints returns Constraints
	 *
	 * Constraint:
	 *     (minHeadway=INT maxHeadway=INT)
	 */
	protected void sequence_Constraints(ISerializationContext context, Constraints semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, PlatoonPackage.Literals.CONSTRAINTS__MIN_HEADWAY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PlatoonPackage.Literals.CONSTRAINTS__MIN_HEADWAY));
			if (transientValues.isValueTransient(semanticObject, PlatoonPackage.Literals.CONSTRAINTS__MAX_HEADWAY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PlatoonPackage.Literals.CONSTRAINTS__MAX_HEADWAY));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getConstraintsAccess().getMinHeadwayINTTerminalRuleCall_1_0(), semanticObject.getMinHeadway());
		feeder.accept(grammarAccess.getConstraintsAccess().getMaxHeadwayINTTerminalRuleCall_5_0(), semanticObject.getMaxHeadway());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     FV returns FV
	 *     Vehicle returns FV
	 *
	 * Constraint:
	 *     (name=ID pulledBy=[Vehicle|ID])
	 */
	protected void sequence_FV(ISerializationContext context, FV semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, PlatoonPackage.Literals.VEHICLE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PlatoonPackage.Literals.VEHICLE__NAME));
			if (transientValues.isValueTransient(semanticObject, PlatoonPackage.Literals.FV__PULLED_BY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PlatoonPackage.Literals.FV__PULLED_BY));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getFVAccess().getNameIDTerminalRuleCall_2_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getFVAccess().getPulledByVehicleIDTerminalRuleCall_5_0_1(), semanticObject.getPulledBy());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Action returns Forward
	 *     Forward returns Forward
	 *
	 * Constraint:
	 *     distance=INT
	 */
	protected void sequence_Forward(ISerializationContext context, Forward semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, PlatoonPackage.Literals.FORWARD__DISTANCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PlatoonPackage.Literals.FORWARD__DISTANCE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getForwardAccess().getDistanceINTTerminalRuleCall_2_0(), semanticObject.getDistance());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     LV returns LV
	 *     Vehicle returns LV
	 *
	 * Constraint:
	 *     (name=ID route=[Route|ID])
	 */
	protected void sequence_LV(ISerializationContext context, LV semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, PlatoonPackage.Literals.VEHICLE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PlatoonPackage.Literals.VEHICLE__NAME));
			if (transientValues.isValueTransient(semanticObject, PlatoonPackage.Literals.LV__ROUTE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PlatoonPackage.Literals.LV__ROUTE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getLVAccess().getNameIDTerminalRuleCall_2_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getLVAccess().getRouteRouteIDTerminalRuleCall_4_0_1(), semanticObject.getRoute());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Action returns Left
	 *     Turn returns Left
	 *     Left returns Left
	 *
	 * Constraint:
	 *     {Left}
	 */
	protected void sequence_Left(ISerializationContext context, Left semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Model returns Model
	 *
	 * Constraint:
	 *     (platoons=Platoon routes=Route constraints=Constraints)
	 */
	protected void sequence_Model(ISerializationContext context, Model semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, PlatoonPackage.Literals.MODEL__PLATOONS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PlatoonPackage.Literals.MODEL__PLATOONS));
			if (transientValues.isValueTransient(semanticObject, PlatoonPackage.Literals.MODEL__ROUTES) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PlatoonPackage.Literals.MODEL__ROUTES));
			if (transientValues.isValueTransient(semanticObject, PlatoonPackage.Literals.MODEL__CONSTRAINTS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PlatoonPackage.Literals.MODEL__CONSTRAINTS));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getModelAccess().getPlatoonsPlatoonParserRuleCall_0_0(), semanticObject.getPlatoons());
		feeder.accept(grammarAccess.getModelAccess().getRoutesRouteParserRuleCall_1_0(), semanticObject.getRoutes());
		feeder.accept(grammarAccess.getModelAccess().getConstraintsConstraintsParserRuleCall_2_0(), semanticObject.getConstraints());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Platoon returns Platoon
	 *
	 * Constraint:
	 *     (first=LV followers+=FV*)
	 */
	protected void sequence_Platoon(ISerializationContext context, Platoon semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Action returns Right
	 *     Turn returns Right
	 *     Right returns Right
	 *
	 * Constraint:
	 *     {Right}
	 */
	protected void sequence_Right(ISerializationContext context, Right semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Route returns Route
	 *
	 * Constraint:
	 *     (name=ID actions+=Action+)
	 */
	protected void sequence_Route(ISerializationContext context, Route semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
