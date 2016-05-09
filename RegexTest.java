/*
 * @author Marc Craenen, 0765781
 * @author Huib Donkers, 0769015
 */
package regex;

import dk.brics.automaton.RegExp;
import dk.brics.automaton.RunAutomaton;

public class RegexTest {

    private final RunAutomaton r;
    private boolean test = true;

    public RegexTest(String regex) {
        System.out.println("***********REGEXP TO TEST**************");
        System.out.println(regex.replaceAll("\n", "\\\\n"));
        System.out.println("***************************************");
        r = new RunAutomaton(new RegExp(regex).toAutomaton());
    }

    public long dfaMatch(String input, int index) {
        long start = System.nanoTime();
        int length = r.run(input, index);
        long end = System.nanoTime();

        if (length == -1) {
            System.out.println("No match found!");
        } else {
            String s = input.substring(index, index + length);
            System.out.println("Found: " + s);
        }

        return end - start;
    }

    void runTest(String input, int index) {
        System.out.println("input string = " + input);
        System.out.println("index = " + index);

        long dfaMatchTime = dfaMatch(input, index);
        System.out.println("dfaMatchTime " + dfaMatchTime);
    }

    /**
     * Method that checks if the given string matches the regular expression of
     * the automaton.
     *
     * @param string The string that should match the automaton.
     */
    void testInvalidString(String string) {
        System.out.println("***************************************");
        System.out.println("***************************************");
        System.out.println("**************TEST INVALID*************");
        System.out.println(string);
        if (!r.run(string)) {
            System.out.println("************NOT ACCEPTED OK************");
        } else {
            test = false;
            System.out.println("*************ACCEPTED FAIL*************");
        }
    }

    /**
     * Method that checks if the given string does not match the regular
     * expression of the automaton.
     *
     * @param string The string that should not match the automaton.
     */
    void testValidString(String string) {
        System.out.println("***************************************");
        System.out.println("***************************************");
        System.out.println("**************TEST VALID***************");
        System.out.println(string);
        if (r.run(string)) {
            System.out.println("**************ACCEPTED OK**************");
        } else {
            test = false;
            System.out.println("***********NOT ACCEPTED FAIL***********");
        }
    }

    /**
     * Test the regular expression for identifiers. Start with lowercase letter
     * from the alphabet and the rest of the string should be non-decimal
     * numbers or lowercase letters from the alphabet.
     */
    private static boolean testID() {
        System.out.println("***************************************");
        System.out.println("***********STARTING NEW TEST***********");
        System.out.println("***************************************");
        RegexTest id = new RegexTest("[a-z][a-z0-9]*");
        id.testInvalidString("1234");
        id.testInvalidString("1noid");
        id.testInvalidString("étést");
        id.testInvalidString("wrong-id");
        id.testInvalidString("µ234");
        id.testInvalidString("a-234");
        id.testInvalidString("é");
        id.testInvalidString("ai ai");
        id.testInvalidString("ai :)");
        id.testInvalidString("CAPTIAL");
        id.testInvalidString("");
        id.testValidString("thisisanid");
        id.testValidString("z");
        id.testValidString("a9129");
        id.testValidString("a1s2d3f4g5a6s7f8");
        id.testValidString("sm03l3nb03k");
        if (id.test) {
            System.out.println("***************************************");
            System.out.println("******THESE TESTS WHERE ACCEPTED.******");
            System.out.println("***************************************");
        } else {
            System.out.println("***************************************");
            System.out.println("**********THESE TESTS FAILED.**********");
            System.out.println("***************************************");
        }
        return id.test;
    }

    /**
     * Test the regular expression representing floating point numbers as
     * described in the lecture.
     */
    private static boolean testFloat() {
        System.out.println("***************************************");
        System.out.println("***********STARTING NEW TEST***********");
        System.out.println("***************************************");
        String unsignedInt = "[0]|([1-9][0-9]*)";
        String signedInt = "[+-]?(" + unsignedInt + ")";
        String unsignedReal1 = "(" + unsignedInt + ")\".\"[0-9]+([eE](" + signedInt + "))?";
        String unsignedReal2 = "(" + unsignedInt + ")[eE](" + signedInt + ")";
        String unsignedReal = "(" + unsignedReal1 + ")|(" + unsignedReal2 + ")";
        String number = "(" + unsignedInt + ")|(" + unsignedReal + ")";
        RegexTest fl = new RegexTest(number);
        fl.testInvalidString("-1");
        fl.testInvalidString("01");
        fl.testInvalidString("a123");
        fl.testInvalidString("+789");
        fl.testInvalidString(" 234");
        fl.testInvalidString("word");
        fl.testInvalidString("");
        fl.testInvalidString("2+4=6");
        fl.testInvalidString("00");
        fl.testInvalidString("02");
        fl.testInvalidString("04.1");
        fl.testInvalidString("3e04");
        fl.testInvalidString("3.14e-07");
        fl.testInvalidString("3ee4");
        fl.testValidString("0");
        fl.testValidString("1");
        fl.testValidString("14");
        fl.testValidString("0.1");
        fl.testValidString("3e4");
        fl.testValidString("3E4");
        fl.testValidString("3e+4");
        fl.testValidString("3.014e-7");
        fl.testValidString("3.014e+7");
        fl.testValidString("3.014E-7");
        if (fl.test) {
            System.out.println("***************************************");
            System.out.println("******THESE TESTS WHERE ACCEPTED.******");
            System.out.println("***************************************");
        } else {
            System.out.println("***************************************");
            System.out.println("**********THESE TESTS FAILED.**********");
            System.out.println("***************************************");
        }
        return fl.test;
    }

    /**
     * Test the regular expression representing natural numbers.
     */
    private static boolean testNat() {
        System.out.println("***************************************");
        System.out.println("***********STARTING NEW TEST***********");
        System.out.println("***************************************");
        RegexTest nat = new RegexTest("[0]|[1-9][0-9]*");
        nat.testInvalidString("-1");
        nat.testInvalidString("01");
        nat.testInvalidString("a123");
        nat.testInvalidString("+789");
        nat.testInvalidString(" 234");
        nat.testInvalidString("word");
        nat.testInvalidString("");
        nat.testInvalidString("2+4=6");
        nat.testInvalidString("5.234");
        nat.testInvalidString("5,234");
        nat.testInvalidString("5e04");
        nat.testValidString("0");
        nat.testValidString("12");
        nat.testValidString("105");
        nat.testValidString("99");
        if (nat.test) {
            System.out.println("***************************************");
            System.out.println("******THESE TESTS WHERE ACCEPTED.******");
            System.out.println("***************************************");
        } else {
            System.out.println("***************************************");
            System.out.println("**********THESE TESTS FAILED.**********");
            System.out.println("***************************************");
        }
        return nat.test;
    }

    /**
     * Test the regular expression that checks if a string only consists of
     * letters from the alphabet and double quotes. Empty strings are allowed.
     */
    private static boolean testStringWithQuotes() {
        System.out.println("***************************************");
        System.out.println("***********STARTING NEW TEST***********");
        System.out.println("***************************************");
        RegexTest string = new RegexTest("([a-z]|(\\\"))*");
        string.testInvalidString("-1");
        string.testInvalidString("01");
        string.testInvalidString("wrong\\\"because\"of\"the\"slash\"in\"it");
        string.testInvalidString("numb3r");
        string.testInvalidString("string with spaces");
        string.testInvalidString("áccent");
        string.testInvalidString("dot.");
        string.testInvalidString("a'b'c");
        string.testInvalidString("CAPITAL");

        string.testValidString("word");
        string.testValidString("");
        string.testValidString("abc");
        string.testValidString("a\"b\"c");
        string.testValidString("a\"b\"b\"c");
        string.testValidString("\"");
        string.testValidString("sentence\"with\"quotes\"in\"it");
        if (string.test) {
            System.out.println("***************************************");
            System.out.println("******THESE TESTS WHERE ACCEPTED.******");
            System.out.println("***************************************");
        } else {
            System.out.println("***************************************");
            System.out.println("**********THESE TESTS FAILED.**********");
            System.out.println("***************************************");
        }
        return string.test;
    }

    /**
     * This method tests the regular expression that matches Java or Mathlab
     * comments.
     *
     * We use two types of Java comments: (1) Those who start with // at the
     * beginning of the line. These slashes may be preceeded an arbitrary number
     * of whitespace characters. (2) Multi-lined comments that start with / *
     * and end with * /. These comments may also be preceeded and succeeded by
     * as many whitespace as you want.
     *
     * We also use two types of Mathlab comments: (1) Similar to the first type
     * of Java comments, but we use % instead of //. (2) Multi-lined comments
     * that start with %{ on the first line and %} on the last line. These are
     * the only characters (next to whitespace) that are allowed on these lines.
     * Other text first or last line of the comment is not allowed. In between
     * any other character can be used.
     */
    private static boolean testComments() {
        System.out.println("***************************************");
        System.out.println("***********STARTING NEW TEST***********");
        System.out.println("***************************************");
        String javaSingleLine = "\" \"*\"//\"[^\n]*(\n\" \"*\"//\"[^\n]*)*";
        String javaMultiLine = "\" \"*\"/*\".*\"*/\"\" \"*";
        String java = "(" + javaSingleLine + ")|(" + javaMultiLine + ")";

        String mathlabSingleLine = "\" \"*\"%\"[^\n]*(\n\" \"*\"%\"[^\n]*)*";
        String mathlabMultiLine = "\" \"*\"%{\"\" \"*\n.*\n\" \"*\"%}\"\" \"*";
        String mathlab = "(" + mathlabSingleLine + ")|(" + mathlabMultiLine + ")";
        String commentRegex = "(" + mathlab + ")|(" + java + ")";
        RegexTest comment = new RegexTest(commentRegex);

        // Single java an mathlab line testing
        comment.testInvalidString("/ This is not a comment");
        comment.testInvalidString("# This is not a comment");
        comment.testInvalidString("' This is not a comment");
        comment.testInvalidString("// multi lined \ncomment without adding new slashes");
        comment.testValidString("// multi lined \n//comment with adding new slashes");
        comment.testValidString("// multi lined \n   //comment with adding new slashes and whitespace");
        comment.testValidString("// Just a normal comment");
        comment.testValidString(" // Just a normal comment with whitespace");
        comment.testInvalidString("% multi lined mathlab \n// and java comment");
        comment.testInvalidString("// multi lined mathlab \n% and java comment");
        comment.testInvalidString("% multi lined \ncomment without adding new slashes");
        comment.testValidString("% multi lined \n%comment with adding new slashes");
        comment.testValidString("% multi lined \n   %comment with adding new slashes and whitespace");
        comment.testValidString("% Just a normal comment");
        comment.testValidString(" % Just a normal comment with whitespace");

        // Multi java line testing
        comment.testInvalidString("//*\nif (opt.equals (\"v\"))\nopt_verbose = true;\n// */");
        comment.testInvalidString("a/* simple wrong comment */");
        comment.testValidString("/*\nif (opt.equals (\"d\"))\nopt_debug = true;\n// */");
        comment.testValidString("/* simple comment */");
        comment.testValidString("/** simple comment */");
        comment.testValidString("/**\n * Registers the text to display in a tool tip.   The text \n  * displays when the cursor lingers over the component.\n  *\n  * @param text  the string to display.  If the text is null, \n  *              the tool tip is turned off for this component.\n  */");
        comment.testValidString("/* simple comment \n on multiple lines */");
        comment.testValidString("    /*    \n        withespace       \n   everywhere  \n        // */   ");
        comment.testInvalidString("/* simple wrong comment *}");

        // Multi mathlab line testing
        comment.testInvalidString("%%{\nif (opt.equals (\"v\"))\nopt_verbose = true;\n%% %}");
        comment.testInvalidString("a%{ simple wrong comment %}");
        comment.testInvalidString("%{\nif (opt.equals (\"d\"))\nopt_debug = true;\n%% %}");
        comment.testValidString("%{\nif (opt.equals (\"d\"))\nopt_debug = true;\n%%\n %}");
        comment.testInvalidString("%{ simple \ncomment %}");
        comment.testValidString("%{ \nsimple comment\n %}");
        comment.testInvalidString("%{ \nsimple comment\n }%");
        comment.testValidString("%{ \nsimple %}\n %}");
        comment.testValidString("%{{ simple comment\n %}"); // Valid because two lines starting with %
        comment.testInvalidString("%{{ simple\n comment\n %}");
        comment.testInvalidString("%{ for i = 1:10\ndisp(i)\nend %}");
        comment.testValidString("%{\nfor i = 1:10\n disp(i)\nend\n%}");
        comment.testInvalidString("    %{    \n        withespace       \n   everywhere  \n        %%   %}   ");
        comment.testValidString("    %{    \n        withespace       \n   everywhere  \n        %% \n   %}   ");
        if (comment.test) {
            System.out.println("***************************************");
            System.out.println("******THESE TESTS WHERE ACCEPTED.******");
            System.out.println("***************************************");
        } else {
            System.out.println("***************************************");
            System.out.println("**********THESE TESTS FAILED.**********");
            System.out.println("***************************************");
        }
        return comment.test;
    }

    public static void main(String[] args) {
        boolean test = true;
        test = test && RegexTest.testID();
        System.out.println("\n\n\n");
        test = test && RegexTest.testNat();
        System.out.println("\n\n\n");
        test = test && RegexTest.testFloat();
        System.out.println("\n\n\n");
        test = test && RegexTest.testStringWithQuotes();
        System.out.println("\n\n\n");
        test = test && RegexTest.testComments();
        System.out.println("\n\n\n");
        System.out.println("***************************************");
        System.out.println("************OVERALL RESULTS************");
        System.out.println("***************************************");
        if (test) {
            System.out.println("******ALL TESTS WHERE SUCCESSFUL.******");
        } else {
            System.out.println("****NOT ALL TESTS WHERE SUCCESSFUL.****");
        }
        System.out.println("***************************************");
    }
}
