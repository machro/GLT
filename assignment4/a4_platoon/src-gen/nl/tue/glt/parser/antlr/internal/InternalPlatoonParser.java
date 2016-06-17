package nl.tue.glt.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import nl.tue.glt.services.PlatoonGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPlatoonParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'platoon:'", "'FV'", "'front'", "'runner'", "'LV'", "'route'", "':'", "'turn'", "'forward('", "')'", "'Left'", "'Right'", "'constraints:'", "'<='", "'headway'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalPlatoonParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalPlatoonParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalPlatoonParser.tokenNames; }
    public String getGrammarFileName() { return "InternalPlatoon.g"; }



     	private PlatoonGrammarAccess grammarAccess;

        public InternalPlatoonParser(TokenStream input, PlatoonGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected PlatoonGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalPlatoon.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalPlatoon.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalPlatoon.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalPlatoon.g:71:1: ruleModel returns [EObject current=null] : ( ( (lv_platoons_0_0= rulePlatoon ) ) ( (lv_routes_1_0= ruleRoute ) ) ( (lv_constraints_2_0= ruleConstraints ) ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_platoons_0_0 = null;

        EObject lv_routes_1_0 = null;

        EObject lv_constraints_2_0 = null;



        	enterRule();

        try {
            // InternalPlatoon.g:77:2: ( ( ( (lv_platoons_0_0= rulePlatoon ) ) ( (lv_routes_1_0= ruleRoute ) ) ( (lv_constraints_2_0= ruleConstraints ) ) ) )
            // InternalPlatoon.g:78:2: ( ( (lv_platoons_0_0= rulePlatoon ) ) ( (lv_routes_1_0= ruleRoute ) ) ( (lv_constraints_2_0= ruleConstraints ) ) )
            {
            // InternalPlatoon.g:78:2: ( ( (lv_platoons_0_0= rulePlatoon ) ) ( (lv_routes_1_0= ruleRoute ) ) ( (lv_constraints_2_0= ruleConstraints ) ) )
            // InternalPlatoon.g:79:3: ( (lv_platoons_0_0= rulePlatoon ) ) ( (lv_routes_1_0= ruleRoute ) ) ( (lv_constraints_2_0= ruleConstraints ) )
            {
            // InternalPlatoon.g:79:3: ( (lv_platoons_0_0= rulePlatoon ) )
            // InternalPlatoon.g:80:4: (lv_platoons_0_0= rulePlatoon )
            {
            // InternalPlatoon.g:80:4: (lv_platoons_0_0= rulePlatoon )
            // InternalPlatoon.g:81:5: lv_platoons_0_0= rulePlatoon
            {

            					newCompositeNode(grammarAccess.getModelAccess().getPlatoonsPlatoonParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_platoons_0_0=rulePlatoon();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModelRule());
            					}
            					set(
            						current,
            						"platoons",
            						lv_platoons_0_0,
            						"nl.tue.glt.Platoon.Platoon");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPlatoon.g:98:3: ( (lv_routes_1_0= ruleRoute ) )
            // InternalPlatoon.g:99:4: (lv_routes_1_0= ruleRoute )
            {
            // InternalPlatoon.g:99:4: (lv_routes_1_0= ruleRoute )
            // InternalPlatoon.g:100:5: lv_routes_1_0= ruleRoute
            {

            					newCompositeNode(grammarAccess.getModelAccess().getRoutesRouteParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_routes_1_0=ruleRoute();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModelRule());
            					}
            					set(
            						current,
            						"routes",
            						lv_routes_1_0,
            						"nl.tue.glt.Platoon.Route");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPlatoon.g:117:3: ( (lv_constraints_2_0= ruleConstraints ) )
            // InternalPlatoon.g:118:4: (lv_constraints_2_0= ruleConstraints )
            {
            // InternalPlatoon.g:118:4: (lv_constraints_2_0= ruleConstraints )
            // InternalPlatoon.g:119:5: lv_constraints_2_0= ruleConstraints
            {

            					newCompositeNode(grammarAccess.getModelAccess().getConstraintsConstraintsParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_constraints_2_0=ruleConstraints();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModelRule());
            					}
            					set(
            						current,
            						"constraints",
            						lv_constraints_2_0,
            						"nl.tue.glt.Platoon.Constraints");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRulePlatoon"
    // InternalPlatoon.g:140:1: entryRulePlatoon returns [EObject current=null] : iv_rulePlatoon= rulePlatoon EOF ;
    public final EObject entryRulePlatoon() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlatoon = null;


        try {
            // InternalPlatoon.g:140:48: (iv_rulePlatoon= rulePlatoon EOF )
            // InternalPlatoon.g:141:2: iv_rulePlatoon= rulePlatoon EOF
            {
             newCompositeNode(grammarAccess.getPlatoonRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePlatoon=rulePlatoon();

            state._fsp--;

             current =iv_rulePlatoon; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePlatoon"


    // $ANTLR start "rulePlatoon"
    // InternalPlatoon.g:147:1: rulePlatoon returns [EObject current=null] : (otherlv_0= 'platoon:' ( (lv_first_1_0= ruleLV ) ) ( (lv_followers_2_0= ruleFV ) )* ) ;
    public final EObject rulePlatoon() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_first_1_0 = null;

        EObject lv_followers_2_0 = null;



        	enterRule();

        try {
            // InternalPlatoon.g:153:2: ( (otherlv_0= 'platoon:' ( (lv_first_1_0= ruleLV ) ) ( (lv_followers_2_0= ruleFV ) )* ) )
            // InternalPlatoon.g:154:2: (otherlv_0= 'platoon:' ( (lv_first_1_0= ruleLV ) ) ( (lv_followers_2_0= ruleFV ) )* )
            {
            // InternalPlatoon.g:154:2: (otherlv_0= 'platoon:' ( (lv_first_1_0= ruleLV ) ) ( (lv_followers_2_0= ruleFV ) )* )
            // InternalPlatoon.g:155:3: otherlv_0= 'platoon:' ( (lv_first_1_0= ruleLV ) ) ( (lv_followers_2_0= ruleFV ) )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getPlatoonAccess().getPlatoonKeyword_0());
            		
            // InternalPlatoon.g:159:3: ( (lv_first_1_0= ruleLV ) )
            // InternalPlatoon.g:160:4: (lv_first_1_0= ruleLV )
            {
            // InternalPlatoon.g:160:4: (lv_first_1_0= ruleLV )
            // InternalPlatoon.g:161:5: lv_first_1_0= ruleLV
            {

            					newCompositeNode(grammarAccess.getPlatoonAccess().getFirstLVParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_6);
            lv_first_1_0=ruleLV();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPlatoonRule());
            					}
            					set(
            						current,
            						"first",
            						lv_first_1_0,
            						"nl.tue.glt.Platoon.LV");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPlatoon.g:178:3: ( (lv_followers_2_0= ruleFV ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalPlatoon.g:179:4: (lv_followers_2_0= ruleFV )
            	    {
            	    // InternalPlatoon.g:179:4: (lv_followers_2_0= ruleFV )
            	    // InternalPlatoon.g:180:5: lv_followers_2_0= ruleFV
            	    {

            	    					newCompositeNode(grammarAccess.getPlatoonAccess().getFollowersFVParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_followers_2_0=ruleFV();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPlatoonRule());
            	    					}
            	    					add(
            	    						current,
            	    						"followers",
            	    						lv_followers_2_0,
            	    						"nl.tue.glt.Platoon.FV");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePlatoon"


    // $ANTLR start "entryRuleFV"
    // InternalPlatoon.g:201:1: entryRuleFV returns [EObject current=null] : iv_ruleFV= ruleFV EOF ;
    public final EObject entryRuleFV() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFV = null;


        try {
            // InternalPlatoon.g:201:43: (iv_ruleFV= ruleFV EOF )
            // InternalPlatoon.g:202:2: iv_ruleFV= ruleFV EOF
            {
             newCompositeNode(grammarAccess.getFVRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFV=ruleFV();

            state._fsp--;

             current =iv_ruleFV; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFV"


    // $ANTLR start "ruleFV"
    // InternalPlatoon.g:208:1: ruleFV returns [EObject current=null] : ( () otherlv_1= 'FV' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'front' otherlv_4= 'runner' ( (otherlv_5= RULE_ID ) ) ) ;
    public final EObject ruleFV() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalPlatoon.g:214:2: ( ( () otherlv_1= 'FV' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'front' otherlv_4= 'runner' ( (otherlv_5= RULE_ID ) ) ) )
            // InternalPlatoon.g:215:2: ( () otherlv_1= 'FV' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'front' otherlv_4= 'runner' ( (otherlv_5= RULE_ID ) ) )
            {
            // InternalPlatoon.g:215:2: ( () otherlv_1= 'FV' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'front' otherlv_4= 'runner' ( (otherlv_5= RULE_ID ) ) )
            // InternalPlatoon.g:216:3: () otherlv_1= 'FV' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'front' otherlv_4= 'runner' ( (otherlv_5= RULE_ID ) )
            {
            // InternalPlatoon.g:216:3: ()
            // InternalPlatoon.g:217:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFVAccess().getFVAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getFVAccess().getFVKeyword_1());
            		
            // InternalPlatoon.g:227:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalPlatoon.g:228:4: (lv_name_2_0= RULE_ID )
            {
            // InternalPlatoon.g:228:4: (lv_name_2_0= RULE_ID )
            // InternalPlatoon.g:229:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_2_0, grammarAccess.getFVAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFVRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getFVAccess().getFrontKeyword_3());
            		
            otherlv_4=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getFVAccess().getRunnerKeyword_4());
            		
            // InternalPlatoon.g:253:3: ( (otherlv_5= RULE_ID ) )
            // InternalPlatoon.g:254:4: (otherlv_5= RULE_ID )
            {
            // InternalPlatoon.g:254:4: (otherlv_5= RULE_ID )
            // InternalPlatoon.g:255:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFVRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_5, grammarAccess.getFVAccess().getPulledByVehicleCrossReference_5_0());
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFV"


    // $ANTLR start "entryRuleLV"
    // InternalPlatoon.g:270:1: entryRuleLV returns [EObject current=null] : iv_ruleLV= ruleLV EOF ;
    public final EObject entryRuleLV() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLV = null;


        try {
            // InternalPlatoon.g:270:43: (iv_ruleLV= ruleLV EOF )
            // InternalPlatoon.g:271:2: iv_ruleLV= ruleLV EOF
            {
             newCompositeNode(grammarAccess.getLVRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLV=ruleLV();

            state._fsp--;

             current =iv_ruleLV; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLV"


    // $ANTLR start "ruleLV"
    // InternalPlatoon.g:277:1: ruleLV returns [EObject current=null] : ( () otherlv_1= 'LV' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'route' ( (otherlv_4= RULE_ID ) ) ) ;
    public final EObject ruleLV() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalPlatoon.g:283:2: ( ( () otherlv_1= 'LV' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'route' ( (otherlv_4= RULE_ID ) ) ) )
            // InternalPlatoon.g:284:2: ( () otherlv_1= 'LV' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'route' ( (otherlv_4= RULE_ID ) ) )
            {
            // InternalPlatoon.g:284:2: ( () otherlv_1= 'LV' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'route' ( (otherlv_4= RULE_ID ) ) )
            // InternalPlatoon.g:285:3: () otherlv_1= 'LV' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'route' ( (otherlv_4= RULE_ID ) )
            {
            // InternalPlatoon.g:285:3: ()
            // InternalPlatoon.g:286:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLVAccess().getLVAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getLVAccess().getLVKeyword_1());
            		
            // InternalPlatoon.g:296:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalPlatoon.g:297:4: (lv_name_2_0= RULE_ID )
            {
            // InternalPlatoon.g:297:4: (lv_name_2_0= RULE_ID )
            // InternalPlatoon.g:298:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(lv_name_2_0, grammarAccess.getLVAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLVRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,16,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getLVAccess().getRouteKeyword_3());
            		
            // InternalPlatoon.g:318:3: ( (otherlv_4= RULE_ID ) )
            // InternalPlatoon.g:319:4: (otherlv_4= RULE_ID )
            {
            // InternalPlatoon.g:319:4: (otherlv_4= RULE_ID )
            // InternalPlatoon.g:320:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLVRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_4, grammarAccess.getLVAccess().getRouteRouteCrossReference_4_0());
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLV"


    // $ANTLR start "entryRuleRoute"
    // InternalPlatoon.g:335:1: entryRuleRoute returns [EObject current=null] : iv_ruleRoute= ruleRoute EOF ;
    public final EObject entryRuleRoute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoute = null;


        try {
            // InternalPlatoon.g:335:46: (iv_ruleRoute= ruleRoute EOF )
            // InternalPlatoon.g:336:2: iv_ruleRoute= ruleRoute EOF
            {
             newCompositeNode(grammarAccess.getRouteRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRoute=ruleRoute();

            state._fsp--;

             current =iv_ruleRoute; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRoute"


    // $ANTLR start "ruleRoute"
    // InternalPlatoon.g:342:1: ruleRoute returns [EObject current=null] : (otherlv_0= 'route' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_actions_3_0= ruleAction ) )+ ) ;
    public final EObject ruleRoute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_actions_3_0 = null;



        	enterRule();

        try {
            // InternalPlatoon.g:348:2: ( (otherlv_0= 'route' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_actions_3_0= ruleAction ) )+ ) )
            // InternalPlatoon.g:349:2: (otherlv_0= 'route' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_actions_3_0= ruleAction ) )+ )
            {
            // InternalPlatoon.g:349:2: (otherlv_0= 'route' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_actions_3_0= ruleAction ) )+ )
            // InternalPlatoon.g:350:3: otherlv_0= 'route' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_actions_3_0= ruleAction ) )+
            {
            otherlv_0=(Token)match(input,16,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getRouteAccess().getRouteKeyword_0());
            		
            // InternalPlatoon.g:354:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalPlatoon.g:355:4: (lv_name_1_0= RULE_ID )
            {
            // InternalPlatoon.g:355:4: (lv_name_1_0= RULE_ID )
            // InternalPlatoon.g:356:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(lv_name_1_0, grammarAccess.getRouteAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRouteRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getRouteAccess().getColonKeyword_2());
            		
            // InternalPlatoon.g:376:3: ( (lv_actions_3_0= ruleAction ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=18 && LA2_0<=19)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalPlatoon.g:377:4: (lv_actions_3_0= ruleAction )
            	    {
            	    // InternalPlatoon.g:377:4: (lv_actions_3_0= ruleAction )
            	    // InternalPlatoon.g:378:5: lv_actions_3_0= ruleAction
            	    {

            	    					newCompositeNode(grammarAccess.getRouteAccess().getActionsActionParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_12);
            	    lv_actions_3_0=ruleAction();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRouteRule());
            	    					}
            	    					add(
            	    						current,
            	    						"actions",
            	    						lv_actions_3_0,
            	    						"nl.tue.glt.Platoon.Action");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRoute"


    // $ANTLR start "entryRuleAction"
    // InternalPlatoon.g:399:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalPlatoon.g:399:47: (iv_ruleAction= ruleAction EOF )
            // InternalPlatoon.g:400:2: iv_ruleAction= ruleAction EOF
            {
             newCompositeNode(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAction=ruleAction();

            state._fsp--;

             current =iv_ruleAction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // InternalPlatoon.g:406:1: ruleAction returns [EObject current=null] : (this_Turn_0= ruleTurn | this_Forward_1= ruleForward ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        EObject this_Turn_0 = null;

        EObject this_Forward_1 = null;



        	enterRule();

        try {
            // InternalPlatoon.g:412:2: ( (this_Turn_0= ruleTurn | this_Forward_1= ruleForward ) )
            // InternalPlatoon.g:413:2: (this_Turn_0= ruleTurn | this_Forward_1= ruleForward )
            {
            // InternalPlatoon.g:413:2: (this_Turn_0= ruleTurn | this_Forward_1= ruleForward )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==18) ) {
                alt3=1;
            }
            else if ( (LA3_0==19) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalPlatoon.g:414:3: this_Turn_0= ruleTurn
                    {

                    			newCompositeNode(grammarAccess.getActionAccess().getTurnParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Turn_0=ruleTurn();

                    state._fsp--;


                    			current = this_Turn_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalPlatoon.g:423:3: this_Forward_1= ruleForward
                    {

                    			newCompositeNode(grammarAccess.getActionAccess().getForwardParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Forward_1=ruleForward();

                    state._fsp--;


                    			current = this_Forward_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleTurn"
    // InternalPlatoon.g:435:1: entryRuleTurn returns [EObject current=null] : iv_ruleTurn= ruleTurn EOF ;
    public final EObject entryRuleTurn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTurn = null;


        try {
            // InternalPlatoon.g:435:45: (iv_ruleTurn= ruleTurn EOF )
            // InternalPlatoon.g:436:2: iv_ruleTurn= ruleTurn EOF
            {
             newCompositeNode(grammarAccess.getTurnRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTurn=ruleTurn();

            state._fsp--;

             current =iv_ruleTurn; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTurn"


    // $ANTLR start "ruleTurn"
    // InternalPlatoon.g:442:1: ruleTurn returns [EObject current=null] : (otherlv_0= 'turn' (this_Left_1= ruleLeft | this_Right_2= ruleRight ) ) ;
    public final EObject ruleTurn() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_Left_1 = null;

        EObject this_Right_2 = null;



        	enterRule();

        try {
            // InternalPlatoon.g:448:2: ( (otherlv_0= 'turn' (this_Left_1= ruleLeft | this_Right_2= ruleRight ) ) )
            // InternalPlatoon.g:449:2: (otherlv_0= 'turn' (this_Left_1= ruleLeft | this_Right_2= ruleRight ) )
            {
            // InternalPlatoon.g:449:2: (otherlv_0= 'turn' (this_Left_1= ruleLeft | this_Right_2= ruleRight ) )
            // InternalPlatoon.g:450:3: otherlv_0= 'turn' (this_Left_1= ruleLeft | this_Right_2= ruleRight )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getTurnAccess().getTurnKeyword_0());
            		
            // InternalPlatoon.g:454:3: (this_Left_1= ruleLeft | this_Right_2= ruleRight )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==21) ) {
                alt4=1;
            }
            else if ( (LA4_0==22) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalPlatoon.g:455:4: this_Left_1= ruleLeft
                    {

                    				newCompositeNode(grammarAccess.getTurnAccess().getLeftParserRuleCall_1_0());
                    			
                    pushFollow(FOLLOW_2);
                    this_Left_1=ruleLeft();

                    state._fsp--;


                    				current = this_Left_1;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 2 :
                    // InternalPlatoon.g:464:4: this_Right_2= ruleRight
                    {

                    				newCompositeNode(grammarAccess.getTurnAccess().getRightParserRuleCall_1_1());
                    			
                    pushFollow(FOLLOW_2);
                    this_Right_2=ruleRight();

                    state._fsp--;


                    				current = this_Right_2;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTurn"


    // $ANTLR start "entryRuleForward"
    // InternalPlatoon.g:477:1: entryRuleForward returns [EObject current=null] : iv_ruleForward= ruleForward EOF ;
    public final EObject entryRuleForward() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForward = null;


        try {
            // InternalPlatoon.g:477:48: (iv_ruleForward= ruleForward EOF )
            // InternalPlatoon.g:478:2: iv_ruleForward= ruleForward EOF
            {
             newCompositeNode(grammarAccess.getForwardRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleForward=ruleForward();

            state._fsp--;

             current =iv_ruleForward; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleForward"


    // $ANTLR start "ruleForward"
    // InternalPlatoon.g:484:1: ruleForward returns [EObject current=null] : ( () otherlv_1= 'forward(' ( (lv_distance_2_0= RULE_INT ) ) otherlv_3= ')' ) ;
    public final EObject ruleForward() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_distance_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalPlatoon.g:490:2: ( ( () otherlv_1= 'forward(' ( (lv_distance_2_0= RULE_INT ) ) otherlv_3= ')' ) )
            // InternalPlatoon.g:491:2: ( () otherlv_1= 'forward(' ( (lv_distance_2_0= RULE_INT ) ) otherlv_3= ')' )
            {
            // InternalPlatoon.g:491:2: ( () otherlv_1= 'forward(' ( (lv_distance_2_0= RULE_INT ) ) otherlv_3= ')' )
            // InternalPlatoon.g:492:3: () otherlv_1= 'forward(' ( (lv_distance_2_0= RULE_INT ) ) otherlv_3= ')'
            {
            // InternalPlatoon.g:492:3: ()
            // InternalPlatoon.g:493:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getForwardAccess().getForwardAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,19,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getForwardAccess().getForwardKeyword_1());
            		
            // InternalPlatoon.g:503:3: ( (lv_distance_2_0= RULE_INT ) )
            // InternalPlatoon.g:504:4: (lv_distance_2_0= RULE_INT )
            {
            // InternalPlatoon.g:504:4: (lv_distance_2_0= RULE_INT )
            // InternalPlatoon.g:505:5: lv_distance_2_0= RULE_INT
            {
            lv_distance_2_0=(Token)match(input,RULE_INT,FOLLOW_15); 

            					newLeafNode(lv_distance_2_0, grammarAccess.getForwardAccess().getDistanceINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getForwardRule());
            					}
            					setWithLastConsumed(
            						current,
            						"distance",
            						lv_distance_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_3=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getForwardAccess().getRightParenthesisKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleForward"


    // $ANTLR start "entryRuleLeft"
    // InternalPlatoon.g:529:1: entryRuleLeft returns [EObject current=null] : iv_ruleLeft= ruleLeft EOF ;
    public final EObject entryRuleLeft() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLeft = null;


        try {
            // InternalPlatoon.g:529:45: (iv_ruleLeft= ruleLeft EOF )
            // InternalPlatoon.g:530:2: iv_ruleLeft= ruleLeft EOF
            {
             newCompositeNode(grammarAccess.getLeftRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLeft=ruleLeft();

            state._fsp--;

             current =iv_ruleLeft; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLeft"


    // $ANTLR start "ruleLeft"
    // InternalPlatoon.g:536:1: ruleLeft returns [EObject current=null] : ( () otherlv_1= 'Left' ) ;
    public final EObject ruleLeft() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalPlatoon.g:542:2: ( ( () otherlv_1= 'Left' ) )
            // InternalPlatoon.g:543:2: ( () otherlv_1= 'Left' )
            {
            // InternalPlatoon.g:543:2: ( () otherlv_1= 'Left' )
            // InternalPlatoon.g:544:3: () otherlv_1= 'Left'
            {
            // InternalPlatoon.g:544:3: ()
            // InternalPlatoon.g:545:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLeftAccess().getLeftAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getLeftAccess().getLeftKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLeft"


    // $ANTLR start "entryRuleRight"
    // InternalPlatoon.g:559:1: entryRuleRight returns [EObject current=null] : iv_ruleRight= ruleRight EOF ;
    public final EObject entryRuleRight() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRight = null;


        try {
            // InternalPlatoon.g:559:46: (iv_ruleRight= ruleRight EOF )
            // InternalPlatoon.g:560:2: iv_ruleRight= ruleRight EOF
            {
             newCompositeNode(grammarAccess.getRightRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRight=ruleRight();

            state._fsp--;

             current =iv_ruleRight; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRight"


    // $ANTLR start "ruleRight"
    // InternalPlatoon.g:566:1: ruleRight returns [EObject current=null] : ( () otherlv_1= 'Right' ) ;
    public final EObject ruleRight() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalPlatoon.g:572:2: ( ( () otherlv_1= 'Right' ) )
            // InternalPlatoon.g:573:2: ( () otherlv_1= 'Right' )
            {
            // InternalPlatoon.g:573:2: ( () otherlv_1= 'Right' )
            // InternalPlatoon.g:574:3: () otherlv_1= 'Right'
            {
            // InternalPlatoon.g:574:3: ()
            // InternalPlatoon.g:575:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRightAccess().getRightAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getRightAccess().getRightKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRight"


    // $ANTLR start "entryRuleConstraints"
    // InternalPlatoon.g:589:1: entryRuleConstraints returns [EObject current=null] : iv_ruleConstraints= ruleConstraints EOF ;
    public final EObject entryRuleConstraints() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraints = null;


        try {
            // InternalPlatoon.g:589:52: (iv_ruleConstraints= ruleConstraints EOF )
            // InternalPlatoon.g:590:2: iv_ruleConstraints= ruleConstraints EOF
            {
             newCompositeNode(grammarAccess.getConstraintsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConstraints=ruleConstraints();

            state._fsp--;

             current =iv_ruleConstraints; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConstraints"


    // $ANTLR start "ruleConstraints"
    // InternalPlatoon.g:596:1: ruleConstraints returns [EObject current=null] : (otherlv_0= 'constraints:' ( (lv_minHeadway_1_0= RULE_INT ) ) otherlv_2= '<=' otherlv_3= 'headway' otherlv_4= '<=' ( (lv_maxHeadway_5_0= RULE_INT ) ) ) ;
    public final EObject ruleConstraints() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_minHeadway_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_maxHeadway_5_0=null;


        	enterRule();

        try {
            // InternalPlatoon.g:602:2: ( (otherlv_0= 'constraints:' ( (lv_minHeadway_1_0= RULE_INT ) ) otherlv_2= '<=' otherlv_3= 'headway' otherlv_4= '<=' ( (lv_maxHeadway_5_0= RULE_INT ) ) ) )
            // InternalPlatoon.g:603:2: (otherlv_0= 'constraints:' ( (lv_minHeadway_1_0= RULE_INT ) ) otherlv_2= '<=' otherlv_3= 'headway' otherlv_4= '<=' ( (lv_maxHeadway_5_0= RULE_INT ) ) )
            {
            // InternalPlatoon.g:603:2: (otherlv_0= 'constraints:' ( (lv_minHeadway_1_0= RULE_INT ) ) otherlv_2= '<=' otherlv_3= 'headway' otherlv_4= '<=' ( (lv_maxHeadway_5_0= RULE_INT ) ) )
            // InternalPlatoon.g:604:3: otherlv_0= 'constraints:' ( (lv_minHeadway_1_0= RULE_INT ) ) otherlv_2= '<=' otherlv_3= 'headway' otherlv_4= '<=' ( (lv_maxHeadway_5_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getConstraintsAccess().getConstraintsKeyword_0());
            		
            // InternalPlatoon.g:608:3: ( (lv_minHeadway_1_0= RULE_INT ) )
            // InternalPlatoon.g:609:4: (lv_minHeadway_1_0= RULE_INT )
            {
            // InternalPlatoon.g:609:4: (lv_minHeadway_1_0= RULE_INT )
            // InternalPlatoon.g:610:5: lv_minHeadway_1_0= RULE_INT
            {
            lv_minHeadway_1_0=(Token)match(input,RULE_INT,FOLLOW_16); 

            					newLeafNode(lv_minHeadway_1_0, grammarAccess.getConstraintsAccess().getMinHeadwayINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConstraintsRule());
            					}
            					setWithLastConsumed(
            						current,
            						"minHeadway",
            						lv_minHeadway_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_2=(Token)match(input,24,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getConstraintsAccess().getLessThanSignEqualsSignKeyword_2());
            		
            otherlv_3=(Token)match(input,25,FOLLOW_16); 

            			newLeafNode(otherlv_3, grammarAccess.getConstraintsAccess().getHeadwayKeyword_3());
            		
            otherlv_4=(Token)match(input,24,FOLLOW_14); 

            			newLeafNode(otherlv_4, grammarAccess.getConstraintsAccess().getLessThanSignEqualsSignKeyword_4());
            		
            // InternalPlatoon.g:638:3: ( (lv_maxHeadway_5_0= RULE_INT ) )
            // InternalPlatoon.g:639:4: (lv_maxHeadway_5_0= RULE_INT )
            {
            // InternalPlatoon.g:639:4: (lv_maxHeadway_5_0= RULE_INT )
            // InternalPlatoon.g:640:5: lv_maxHeadway_5_0= RULE_INT
            {
            lv_maxHeadway_5_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_maxHeadway_5_0, grammarAccess.getConstraintsAccess().getMaxHeadwayINTTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConstraintsRule());
            					}
            					setWithLastConsumed(
            						current,
            						"maxHeadway",
            						lv_maxHeadway_5_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConstraints"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000000000C0002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000002000000L});

}