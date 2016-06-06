import beaver.*;
import java.util.ArrayList;

/**
 * This class is a LALR parser generated by
 * <a href="http://beaver.sourceforge.net">Beaver</a> v0.9.6.1
 * from the grammar specification "PicoJava.grammar".
 */
public class PicoJavaParser extends Parser {
	static public class Terminals {
		static public final short EOF = 0;
		static public final short IDENTIFIER = 1;
		static public final short LPAREN = 2;
		static public final short LBRACE = 3;
		static public final short TRUE = 4;
		static public final short FALSE = 5;
		static public final short LOGIC_AND = 6;
		static public final short KEYWORD_WHILE = 7;
		static public final short RBRACE = 8;
		static public final short LOGIC_OR = 9;
		static public final short POINT = 10;
		static public final short RPAREN = 11;
		static public final short KEYWORD_CLASS = 12;
		static public final short SEMICOLON = 13;
		static public final short ASSIGN = 14;
		static public final short KEYWORD_EXTENDS = 15;
	}

	static final ParsingTables PARSING_TABLES = new ParsingTables(
		"U9nrabjF544GXK$lx4KGvBBYxh8NK1O51I4#gJ6Qy4IY3qP3b3TZul$mloeeg83YNQJukka" +
		"PEYJRazDzwbJtcUgPalH6TVNjkuPrGmjQqQ8oNT2GgkXbZKUzfhvwNZVJ5ItQ4N5VLtLHyx" +
		"fE$4#b98RPkvnff62t0riEZfVLLKEpQgkYKRKqXd#cfYxXtzKqcQuwORxcTzcX9jareJcKM" +
		"q7vojcMfhH4fgSPtQHQXqSTxobSQl0MJctqBlwvxhYJryMxQjp9yPIeiambFcuaiMSp1NC5" +
		"6m$irD4HJL13bRCTlbmF$umxDV0$pQHpbPnZLvDlTQPKKKPHV6rD$ANLjmgZ0XfW4joDshH" +
		"VKp1MZC6w5kEdu3dOZF5zy2poDhWN#Hnu0HPY$1AyIdoNmPFpxqlohy4TiA4pRJZ9Z$YLqW" +
		"vo3Nuqm6i#ltUC7mxOjvJm$1uF4krnmXyDgZtPivw$$vo#gcBON$3V$jXl#nMLRt7z6EQ3C" +
		"E#3Js3NlZ1ls#UWxjW7sxBtzjD#57vxu1ZIeRySVyIZH9yAEFvu5ZerHpsY4quu#hTCdvNe" +
		"uemUBDE55Nh9HMG5cg4xFJ8wo0NCdW2tutf4");

	static final Action RETURN3 = new Action() {
		public Symbol reduce(Symbol[] _symbols, int offset) {
			return _symbols[offset + 3];
		}
	};

	static final Action RETURN4 = new Action() {
		public Symbol reduce(Symbol[] _symbols, int offset) {
			return _symbols[offset + 4];
		}
	};

	static final Action RETURN2 = new Action() {
		public Symbol reduce(Symbol[] _symbols, int offset) {
			return _symbols[offset + 2];
		}
	};

	static final Action RETURN5 = new Action() {
		public Symbol reduce(Symbol[] _symbols, int offset) {
			return _symbols[offset + 5];
		}
	};

	private final Action[] actions;

	public PicoJavaParser() {
		super(PARSING_TABLES);
		actions = new Action[] {
			Action.RETURN,	// [0] $goal = block
			new Action() {	// [1] lst$blockStatement = blockStatement
				public Symbol reduce(Symbol[] _symbols, int offset) {
					ArrayList lst = new ArrayList(); lst.add(_symbols[offset + 1]); return new Symbol(lst);
				}
			},
			new Action() {	// [2] lst$blockStatement = lst$blockStatement blockStatement
				public Symbol reduce(Symbol[] _symbols, int offset) {
					((ArrayList) _symbols[offset + 1].value).add(_symbols[offset + 2]); return _symbols[offset + 1];
				}
			},
			Action.NONE,  	// [3] opt$lst$blockStatement = 
			Action.RETURN,	// [4] opt$lst$blockStatement = lst$blockStatement
			RETURN3,	// [5] block = LBRACE opt$lst$blockStatement RBRACE; returns 'RBRACE' although none is marked
			Action.RETURN,	// [6] blockStatement = classDecl
			Action.RETURN,	// [7] blockStatement = varDecl
			Action.RETURN,	// [8] blockStatement = statement
			Action.RETURN,	// [9] statement = assignStatement
			Action.RETURN,	// [10] statement = whileStatement
			Action.NONE,  	// [11] opt$extends = 
			Action.RETURN,	// [12] opt$extends = extends
			RETURN4,	// [13] classDecl = KEYWORD_CLASS IDENTIFIER opt$extends block; returns 'block' although none is marked
			RETURN2,	// [14] extends = KEYWORD_EXTENDS use; returns 'use' although none is marked
			RETURN3,	// [15] varDecl = name IDENTIFIER SEMICOLON; returns 'SEMICOLON' although none is marked
			RETURN4,	// [16] assignStatement = name ASSIGN exp SEMICOLON; returns 'SEMICOLON' although none is marked
			RETURN5,	// [17] whileStatement = KEYWORD_WHILE LPAREN exp RPAREN statement; returns 'statement' although none is marked
			Action.RETURN,	// [18] exp = name
			Action.RETURN,	// [19] exp = booleanLiteral
			RETURN3,	// [20] exp = exp LOGIC_OR exp; returns 'exp' although none is marked
			RETURN3,	// [21] exp = exp LOGIC_AND exp; returns 'exp' although none is marked
			RETURN3,	// [22] exp = LPAREN exp RPAREN; returns 'RPAREN' although none is marked
			Action.RETURN,	// [23] use = IDENTIFIER
			Action.RETURN,	// [24] name = IDENTIFIER
			RETURN3,	// [25] name = name POINT use; returns 'use' although none is marked
			Action.RETURN,	// [26] booleanLiteral = TRUE
			Action.RETURN	// [27] booleanLiteral = FALSE
		};
	}

	protected Symbol invokeReduceAction(int rule_num, int offset) {
		return actions[rule_num].reduce(_symbols, offset);
	}
}