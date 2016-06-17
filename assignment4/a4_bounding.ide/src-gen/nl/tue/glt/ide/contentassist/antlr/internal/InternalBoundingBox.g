/*
 * generated by Xtext 2.10.0
 */
grammar InternalBoundingBox;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package nl.tue.glt.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package nl.tue.glt.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import nl.tue.glt.services.BoundingBoxGrammarAccess;

}
@parser::members {
	private BoundingBoxGrammarAccess grammarAccess;

	public void setGrammarAccess(BoundingBoxGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}

	@Override
	protected Grammar getGrammar() {
		return grammarAccess.getGrammar();
	}

	@Override
	protected String getValueForTokenName(String tokenName) {
		return tokenName;
	}
}

// Entry rule entryRuleModel
entryRuleModel
:
{ before(grammarAccess.getModelRule()); }
	 ruleModel
{ after(grammarAccess.getModelRule()); } 
	 EOF 
;

// Rule Model
ruleModel 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getModelAccess().getGroup()); }
		(rule__Model__Group__0)
		{ after(grammarAccess.getModelAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleMove
entryRuleMove
:
{ before(grammarAccess.getMoveRule()); }
	 ruleMove
{ after(grammarAccess.getMoveRule()); } 
	 EOF 
;

// Rule Move
ruleMove 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getMoveAccess().getAlternatives()); }
		(rule__Move__Alternatives)
		{ after(grammarAccess.getMoveAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleMoveX
entryRuleMoveX
:
{ before(grammarAccess.getMoveXRule()); }
	 ruleMoveX
{ after(grammarAccess.getMoveXRule()); } 
	 EOF 
;

// Rule MoveX
ruleMoveX 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getMoveXAccess().getAlternatives()); }
		(rule__MoveX__Alternatives)
		{ after(grammarAccess.getMoveXAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleMoveY
entryRuleMoveY
:
{ before(grammarAccess.getMoveYRule()); }
	 ruleMoveY
{ after(grammarAccess.getMoveYRule()); } 
	 EOF 
;

// Rule MoveY
ruleMoveY 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getMoveYAccess().getAlternatives()); }
		(rule__MoveY__Alternatives)
		{ after(grammarAccess.getMoveYAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleMoveLeft
entryRuleMoveLeft
:
{ before(grammarAccess.getMoveLeftRule()); }
	 ruleMoveLeft
{ after(grammarAccess.getMoveLeftRule()); } 
	 EOF 
;

// Rule MoveLeft
ruleMoveLeft 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getMoveLeftAccess().getGroup()); }
		(rule__MoveLeft__Group__0)
		{ after(grammarAccess.getMoveLeftAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleMoveRight
entryRuleMoveRight
:
{ before(grammarAccess.getMoveRightRule()); }
	 ruleMoveRight
{ after(grammarAccess.getMoveRightRule()); } 
	 EOF 
;

// Rule MoveRight
ruleMoveRight 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getMoveRightAccess().getGroup()); }
		(rule__MoveRight__Group__0)
		{ after(grammarAccess.getMoveRightAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleMoveUp
entryRuleMoveUp
:
{ before(grammarAccess.getMoveUpRule()); }
	 ruleMoveUp
{ after(grammarAccess.getMoveUpRule()); } 
	 EOF 
;

// Rule MoveUp
ruleMoveUp 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getMoveUpAccess().getGroup()); }
		(rule__MoveUp__Group__0)
		{ after(grammarAccess.getMoveUpAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleMoveDown
entryRuleMoveDown
:
{ before(grammarAccess.getMoveDownRule()); }
	 ruleMoveDown
{ after(grammarAccess.getMoveDownRule()); } 
	 EOF 
;

// Rule MoveDown
ruleMoveDown 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getMoveDownAccess().getGroup()); }
		(rule__MoveDown__Group__0)
		{ after(grammarAccess.getMoveDownAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Move__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMoveAccess().getMoveXParserRuleCall_0()); }
		ruleMoveX
		{ after(grammarAccess.getMoveAccess().getMoveXParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getMoveAccess().getMoveYParserRuleCall_1()); }
		ruleMoveY
		{ after(grammarAccess.getMoveAccess().getMoveYParserRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__MoveX__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMoveXAccess().getMoveLeftParserRuleCall_0()); }
		ruleMoveLeft
		{ after(grammarAccess.getMoveXAccess().getMoveLeftParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getMoveXAccess().getMoveRightParserRuleCall_1()); }
		ruleMoveRight
		{ after(grammarAccess.getMoveXAccess().getMoveRightParserRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__MoveY__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMoveYAccess().getMoveUpParserRuleCall_0()); }
		ruleMoveUp
		{ after(grammarAccess.getMoveYAccess().getMoveUpParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getMoveYAccess().getMoveDownParserRuleCall_1()); }
		ruleMoveDown
		{ after(grammarAccess.getMoveYAccess().getMoveDownParserRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Model__Group__0__Impl
	rule__Model__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getModelAccess().getModelAction_0()); }
	()
	{ after(grammarAccess.getModelAccess().getModelAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Model__Group__1__Impl
	rule__Model__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getModelAccess().getBoxKeyword_1()); }
	'Box:'
	{ after(grammarAccess.getModelAccess().getBoxKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Model__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getModelAccess().getMoveCommandsAssignment_2()); }
	(rule__Model__MoveCommandsAssignment_2)*
	{ after(grammarAccess.getModelAccess().getMoveCommandsAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__MoveLeft__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MoveLeft__Group__0__Impl
	rule__MoveLeft__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MoveLeft__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMoveLeftAccess().getLeftKeyword_0()); }
	'left'
	{ after(grammarAccess.getMoveLeftAccess().getLeftKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__MoveLeft__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MoveLeft__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MoveLeft__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMoveLeftAccess().getDistanceAssignment_1()); }
	(rule__MoveLeft__DistanceAssignment_1)
	{ after(grammarAccess.getMoveLeftAccess().getDistanceAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__MoveRight__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MoveRight__Group__0__Impl
	rule__MoveRight__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MoveRight__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMoveRightAccess().getRightKeyword_0()); }
	'right'
	{ after(grammarAccess.getMoveRightAccess().getRightKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__MoveRight__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MoveRight__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MoveRight__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMoveRightAccess().getDistanceAssignment_1()); }
	(rule__MoveRight__DistanceAssignment_1)
	{ after(grammarAccess.getMoveRightAccess().getDistanceAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__MoveUp__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MoveUp__Group__0__Impl
	rule__MoveUp__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MoveUp__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMoveUpAccess().getUpKeyword_0()); }
	'up'
	{ after(grammarAccess.getMoveUpAccess().getUpKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__MoveUp__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MoveUp__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MoveUp__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMoveUpAccess().getDistanceAssignment_1()); }
	(rule__MoveUp__DistanceAssignment_1)
	{ after(grammarAccess.getMoveUpAccess().getDistanceAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__MoveDown__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MoveDown__Group__0__Impl
	rule__MoveDown__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MoveDown__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMoveDownAccess().getDownKeyword_0()); }
	'down'
	{ after(grammarAccess.getMoveDownAccess().getDownKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__MoveDown__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MoveDown__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MoveDown__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMoveDownAccess().getDistanceAssignment_1()); }
	(rule__MoveDown__DistanceAssignment_1)
	{ after(grammarAccess.getMoveDownAccess().getDistanceAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Model__MoveCommandsAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getModelAccess().getMoveCommandsMoveParserRuleCall_2_0()); }
		ruleMove
		{ after(grammarAccess.getModelAccess().getMoveCommandsMoveParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__MoveLeft__DistanceAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMoveLeftAccess().getDistanceINTTerminalRuleCall_1_0()); }
		RULE_INT
		{ after(grammarAccess.getMoveLeftAccess().getDistanceINTTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__MoveRight__DistanceAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMoveRightAccess().getDistanceINTTerminalRuleCall_1_0()); }
		RULE_INT
		{ after(grammarAccess.getMoveRightAccess().getDistanceINTTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__MoveUp__DistanceAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMoveUpAccess().getDistanceINTTerminalRuleCall_1_0()); }
		RULE_INT
		{ after(grammarAccess.getMoveUpAccess().getDistanceINTTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__MoveDown__DistanceAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMoveDownAccess().getDistanceINTTerminalRuleCall_1_0()); }
		RULE_INT
		{ after(grammarAccess.getMoveDownAccess().getDistanceINTTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
