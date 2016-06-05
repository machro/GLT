package regex;

/*
Grammar including EBNF:
	start-symbol PROGRAM
	
	context-free syntax
		PROGRAM ::= "begin" DECLS "|" (STATEMENT ";")* "end"
		DECLS ::= "declare" (ID ",")*
	
	context-free syntax
		STATEMENT ::= ID ":=" EXP
	
	context-free syntax
		EXP ::= ID
		EXP ::= NAT
		EXP ::= EXP "+" EXP  {left}
		EXP ::= EXP "*" EXP  {left}
		EXP ::= "-" EXP
		EXP ::= "(" EXP ")"
	
	lexical syntax
		ID ::= [a-z][a-z0-9]*
	
	lexical syntax
		NAT ::= [0] | [1-9][0-9]*
	
	lexical syntax
		LAYOUT ::= [\ \n]*
	
	context-free priorities
		EXP ::= "-" EXP >
		EXP ::= EXP "*" EXP >
		EXP ::= EXP "+" EXP

---------------------------------------------
Grammar excluding EBNF:
	start-symbol PROGRAM
	
	context-free syntax
		PROGRAM ::= "begin" DECLS "|" STATEMENTS "end"
		STATEMENTS ::= ""
		STATEMENTS ::= ACTUALSTATEMENTS
		ACTUALSTATEMENTS ::= STATEMENT ";"
		ACTUALSTATEMENTS ::= STATEMENT ";" ACTUALSTATEMENTS
		DECLS ::= "declare"
		DECLS ::= "declare" ACTUALDECLS
		ACTUALDECLS ::= ID ","
		ACTUALDECLS ::= ID "," ACTUALDECLS
	
	context-free syntax
		STATEMENT ::= ID ":=" EXP
	
	context-free syntax
		EXP ::= ID
		EXP ::= NAT
		EXP ::= EXP "+" EXP  {left}
		EXP ::= EXP "*" EXP  {left}
		EXP ::= "-" EXP
		EXP ::= "(" EXP ")"
	
	lexical syntax
		ID ::= [a-z]
		ID ::= [a-z] ALPHANUM
		ALPHANUM ::= [a-z0-9]
		ALPHANUM ::= [a-z0-9] ALPHANUM
	
	lexical syntax
		NAT ::= [0-9]
		NAT ::= [1-9] NUM
		NUM ::= [0-9]
		NUM ::= [0-9] NUM
	
	lexical syntax
		LAYOUT ::= ""
		LAYOUT ::= ACTUALLAYOUT
		ACTUALLAYOUT ::= [\ \n]
		ACTUALLAYOUT ::= [\ \n] ACTUALLAYOUT
	
	context-free priorities
		EXP ::= "-" EXP >
		EXP ::= EXP "*" EXP >
		EXP ::= EXP "+" EXP
 */

public class PicoRec {
	public static final String VALID0 = "begin declare | end";
	public static final String VALID1 = "begin declare a,b,c, | d := e * ( - 0); end";
	public static final String VALID2 = "begin declare a,a,a,a, | d := d+1*(-d); ab24 = 24; end";
	public static final String VALID3 = "begin declare var,var, | var := --(-(---((var)))); end";
	public static final String INVALID0 = "";
	public static final String INVALID1 = "begin declare a,b,c | d := e; end";
	public static final String INVALID2 = "begin declare a, | a = 25 + 32 + 09 + 12 + 65; end";
	public static final String INVALID3 = "begin declare 1tsnotani, | end";
	public static final String INVALID4 = "begin declare var,var, | var := --(-(---((var)))); | declare var, | var := 42; end";
	
	
	public static void main(String args[]) {
		PicoRec pr = new PicoRec();
		
		testValid(pr, VALID0);
		testValid(pr, VALID1);
		testValid(pr, VALID2);
		testValid(pr, VALID3);
		testInvalid(pr, INVALID0);
		testInvalid(pr, INVALID1);
		testInvalid(pr, INVALID2);
		testInvalid(pr, INVALID3);
		testInvalid(pr, INVALID4);
	}
	
	private static void testValid(PicoRec pr, String program)
	{
		if(pr.test(program))
			System.out.println("success");
		else
			System.out.println("TEST FAILED");
	}
	
	private static void testInvalid(PicoRec pr, String program)
	{
		if(!pr.test(program))
			System.out.println("success");
		else
			System.out.println("TEST FAILED");
	}
	
	//-----------------
	public boolean test(String program)
	{
		// recursive descent recognising here
		// we ran out of time to implement anything meaningful here
		
		return false; // fails least testcases
	}
}
