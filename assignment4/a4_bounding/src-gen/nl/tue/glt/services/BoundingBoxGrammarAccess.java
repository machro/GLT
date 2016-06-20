/*
 * generated by Xtext 2.10.0
 */
package nl.tue.glt.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class BoundingBoxGrammarAccess extends AbstractGrammarElementFinder {
	
	public class WorldElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "nl.tue.glt.BoundingBox.World");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cWorldAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cBoxKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cControl000aKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cMoveCommandsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cMoveCommandsMoveParserRuleCall_3_0 = (RuleCall)cMoveCommandsAssignment_3.eContents().get(0);
		
		//World:
		//	{World}
		//	'Box:' '\n'
		//	moveCommands+=Move*;
		@Override public ParserRule getRule() { return rule; }
		
		//{World} 'Box:' '\n' moveCommands+=Move*
		public Group getGroup() { return cGroup; }
		
		//{World}
		public Action getWorldAction_0() { return cWorldAction_0; }
		
		//'Box:'
		public Keyword getBoxKeyword_1() { return cBoxKeyword_1; }
		
		//'\n'
		public Keyword getControl000aKeyword_2() { return cControl000aKeyword_2; }
		
		//moveCommands+=Move*
		public Assignment getMoveCommandsAssignment_3() { return cMoveCommandsAssignment_3; }
		
		//Move
		public RuleCall getMoveCommandsMoveParserRuleCall_3_0() { return cMoveCommandsMoveParserRuleCall_3_0; }
	}
	public class MoveElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "nl.tue.glt.BoundingBox.Move");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cMoveXParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cMoveYParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//Move:
		//	MoveX | MoveY;
		@Override public ParserRule getRule() { return rule; }
		
		//MoveX | MoveY
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//MoveX
		public RuleCall getMoveXParserRuleCall_0() { return cMoveXParserRuleCall_0; }
		
		//MoveY
		public RuleCall getMoveYParserRuleCall_1() { return cMoveYParserRuleCall_1; }
	}
	public class MoveXElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "nl.tue.glt.BoundingBox.MoveX");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cMoveLeftParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cMoveRightParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//MoveX:
		//	MoveLeft | MoveRight;
		@Override public ParserRule getRule() { return rule; }
		
		//MoveLeft | MoveRight
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//MoveLeft
		public RuleCall getMoveLeftParserRuleCall_0() { return cMoveLeftParserRuleCall_0; }
		
		//MoveRight
		public RuleCall getMoveRightParserRuleCall_1() { return cMoveRightParserRuleCall_1; }
	}
	public class MoveYElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "nl.tue.glt.BoundingBox.MoveY");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cMoveUpParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cMoveDownParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//MoveY:
		//	MoveUp | MoveDown;
		@Override public ParserRule getRule() { return rule; }
		
		//MoveUp | MoveDown
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//MoveUp
		public RuleCall getMoveUpParserRuleCall_0() { return cMoveUpParserRuleCall_0; }
		
		//MoveDown
		public RuleCall getMoveDownParserRuleCall_1() { return cMoveDownParserRuleCall_1; }
	}
	public class MoveLeftElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "nl.tue.glt.BoundingBox.MoveLeft");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLeftKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cDistanceAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cDistanceINTTerminalRuleCall_1_0 = (RuleCall)cDistanceAssignment_1.eContents().get(0);
		private final Keyword cControl000aKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//MoveLeft:
		//	'left' distance=INT '\n';
		@Override public ParserRule getRule() { return rule; }
		
		//'left' distance=INT '\n'
		public Group getGroup() { return cGroup; }
		
		//'left'
		public Keyword getLeftKeyword_0() { return cLeftKeyword_0; }
		
		//distance=INT
		public Assignment getDistanceAssignment_1() { return cDistanceAssignment_1; }
		
		//INT
		public RuleCall getDistanceINTTerminalRuleCall_1_0() { return cDistanceINTTerminalRuleCall_1_0; }
		
		//'\n'
		public Keyword getControl000aKeyword_2() { return cControl000aKeyword_2; }
	}
	public class MoveRightElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "nl.tue.glt.BoundingBox.MoveRight");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cRightKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cDistanceAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cDistanceINTTerminalRuleCall_1_0 = (RuleCall)cDistanceAssignment_1.eContents().get(0);
		private final Keyword cControl000aKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//MoveRight:
		//	'right' distance=INT '\n';
		@Override public ParserRule getRule() { return rule; }
		
		//'right' distance=INT '\n'
		public Group getGroup() { return cGroup; }
		
		//'right'
		public Keyword getRightKeyword_0() { return cRightKeyword_0; }
		
		//distance=INT
		public Assignment getDistanceAssignment_1() { return cDistanceAssignment_1; }
		
		//INT
		public RuleCall getDistanceINTTerminalRuleCall_1_0() { return cDistanceINTTerminalRuleCall_1_0; }
		
		//'\n'
		public Keyword getControl000aKeyword_2() { return cControl000aKeyword_2; }
	}
	public class MoveUpElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "nl.tue.glt.BoundingBox.MoveUp");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cUpKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cDistanceAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cDistanceINTTerminalRuleCall_1_0 = (RuleCall)cDistanceAssignment_1.eContents().get(0);
		private final Keyword cControl000aKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//MoveUp:
		//	'up' distance=INT '\n';
		@Override public ParserRule getRule() { return rule; }
		
		//'up' distance=INT '\n'
		public Group getGroup() { return cGroup; }
		
		//'up'
		public Keyword getUpKeyword_0() { return cUpKeyword_0; }
		
		//distance=INT
		public Assignment getDistanceAssignment_1() { return cDistanceAssignment_1; }
		
		//INT
		public RuleCall getDistanceINTTerminalRuleCall_1_0() { return cDistanceINTTerminalRuleCall_1_0; }
		
		//'\n'
		public Keyword getControl000aKeyword_2() { return cControl000aKeyword_2; }
	}
	public class MoveDownElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "nl.tue.glt.BoundingBox.MoveDown");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cDownKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cDistanceAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cDistanceINTTerminalRuleCall_1_0 = (RuleCall)cDistanceAssignment_1.eContents().get(0);
		private final Keyword cControl000aKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//MoveDown:
		//	'down' distance=INT '\n';
		@Override public ParserRule getRule() { return rule; }
		
		//'down' distance=INT '\n'
		public Group getGroup() { return cGroup; }
		
		//'down'
		public Keyword getDownKeyword_0() { return cDownKeyword_0; }
		
		//distance=INT
		public Assignment getDistanceAssignment_1() { return cDistanceAssignment_1; }
		
		//INT
		public RuleCall getDistanceINTTerminalRuleCall_1_0() { return cDistanceINTTerminalRuleCall_1_0; }
		
		//'\n'
		public Keyword getControl000aKeyword_2() { return cControl000aKeyword_2; }
	}
	
	
	private final WorldElements pWorld;
	private final MoveElements pMove;
	private final MoveXElements pMoveX;
	private final MoveYElements pMoveY;
	private final MoveLeftElements pMoveLeft;
	private final MoveRightElements pMoveRight;
	private final MoveUpElements pMoveUp;
	private final MoveDownElements pMoveDown;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public BoundingBoxGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pWorld = new WorldElements();
		this.pMove = new MoveElements();
		this.pMoveX = new MoveXElements();
		this.pMoveY = new MoveYElements();
		this.pMoveLeft = new MoveLeftElements();
		this.pMoveRight = new MoveRightElements();
		this.pMoveUp = new MoveUpElements();
		this.pMoveDown = new MoveDownElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("nl.tue.glt.BoundingBox".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//World:
	//	{World}
	//	'Box:' '\n'
	//	moveCommands+=Move*;
	public WorldElements getWorldAccess() {
		return pWorld;
	}
	
	public ParserRule getWorldRule() {
		return getWorldAccess().getRule();
	}
	
	//Move:
	//	MoveX | MoveY;
	public MoveElements getMoveAccess() {
		return pMove;
	}
	
	public ParserRule getMoveRule() {
		return getMoveAccess().getRule();
	}
	
	//MoveX:
	//	MoveLeft | MoveRight;
	public MoveXElements getMoveXAccess() {
		return pMoveX;
	}
	
	public ParserRule getMoveXRule() {
		return getMoveXAccess().getRule();
	}
	
	//MoveY:
	//	MoveUp | MoveDown;
	public MoveYElements getMoveYAccess() {
		return pMoveY;
	}
	
	public ParserRule getMoveYRule() {
		return getMoveYAccess().getRule();
	}
	
	//MoveLeft:
	//	'left' distance=INT '\n';
	public MoveLeftElements getMoveLeftAccess() {
		return pMoveLeft;
	}
	
	public ParserRule getMoveLeftRule() {
		return getMoveLeftAccess().getRule();
	}
	
	//MoveRight:
	//	'right' distance=INT '\n';
	public MoveRightElements getMoveRightAccess() {
		return pMoveRight;
	}
	
	public ParserRule getMoveRightRule() {
		return getMoveRightAccess().getRule();
	}
	
	//MoveUp:
	//	'up' distance=INT '\n';
	public MoveUpElements getMoveUpAccess() {
		return pMoveUp;
	}
	
	public ParserRule getMoveUpRule() {
		return getMoveUpAccess().getRule();
	}
	
	//MoveDown:
	//	'down' distance=INT '\n';
	public MoveDownElements getMoveDownAccess() {
		return pMoveDown;
	}
	
	public ParserRule getMoveDownRule() {
		return getMoveDownAccess().getRule();
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' | "'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/ *'->'* /';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
