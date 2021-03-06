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
import nl.tue.glt.services.BoundingBoxGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalBoundingBoxParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Box:'", "'\\n'", "'left'", "'right'", "'up'", "'down'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int RULE_INT=4;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalBoundingBoxParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalBoundingBoxParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalBoundingBoxParser.tokenNames; }
    public String getGrammarFileName() { return "InternalBoundingBox.g"; }



     	private BoundingBoxGrammarAccess grammarAccess;

        public InternalBoundingBoxParser(TokenStream input, BoundingBoxGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "World";
       	}

       	@Override
       	protected BoundingBoxGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleWorld"
    // InternalBoundingBox.g:64:1: entryRuleWorld returns [EObject current=null] : iv_ruleWorld= ruleWorld EOF ;
    public final EObject entryRuleWorld() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorld = null;


        try {
            // InternalBoundingBox.g:64:46: (iv_ruleWorld= ruleWorld EOF )
            // InternalBoundingBox.g:65:2: iv_ruleWorld= ruleWorld EOF
            {
             newCompositeNode(grammarAccess.getWorldRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWorld=ruleWorld();

            state._fsp--;

             current =iv_ruleWorld; 
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
    // $ANTLR end "entryRuleWorld"


    // $ANTLR start "ruleWorld"
    // InternalBoundingBox.g:71:1: ruleWorld returns [EObject current=null] : ( () otherlv_1= 'Box:' otherlv_2= '\\n' ( (lv_moveCommands_3_0= ruleMove ) )* ) ;
    public final EObject ruleWorld() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_moveCommands_3_0 = null;



        	enterRule();

        try {
            // InternalBoundingBox.g:77:2: ( ( () otherlv_1= 'Box:' otherlv_2= '\\n' ( (lv_moveCommands_3_0= ruleMove ) )* ) )
            // InternalBoundingBox.g:78:2: ( () otherlv_1= 'Box:' otherlv_2= '\\n' ( (lv_moveCommands_3_0= ruleMove ) )* )
            {
            // InternalBoundingBox.g:78:2: ( () otherlv_1= 'Box:' otherlv_2= '\\n' ( (lv_moveCommands_3_0= ruleMove ) )* )
            // InternalBoundingBox.g:79:3: () otherlv_1= 'Box:' otherlv_2= '\\n' ( (lv_moveCommands_3_0= ruleMove ) )*
            {
            // InternalBoundingBox.g:79:3: ()
            // InternalBoundingBox.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getWorldAccess().getWorldAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getWorldAccess().getBoxKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getWorldAccess().getControl000aKeyword_2());
            		
            // InternalBoundingBox.g:94:3: ( (lv_moveCommands_3_0= ruleMove ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=13 && LA1_0<=16)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalBoundingBox.g:95:4: (lv_moveCommands_3_0= ruleMove )
            	    {
            	    // InternalBoundingBox.g:95:4: (lv_moveCommands_3_0= ruleMove )
            	    // InternalBoundingBox.g:96:5: lv_moveCommands_3_0= ruleMove
            	    {

            	    					newCompositeNode(grammarAccess.getWorldAccess().getMoveCommandsMoveParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_moveCommands_3_0=ruleMove();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getWorldRule());
            	    					}
            	    					add(
            	    						current,
            	    						"moveCommands",
            	    						lv_moveCommands_3_0,
            	    						"nl.tue.glt.BoundingBox.Move");
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
    // $ANTLR end "ruleWorld"


    // $ANTLR start "entryRuleMove"
    // InternalBoundingBox.g:117:1: entryRuleMove returns [EObject current=null] : iv_ruleMove= ruleMove EOF ;
    public final EObject entryRuleMove() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMove = null;


        try {
            // InternalBoundingBox.g:117:45: (iv_ruleMove= ruleMove EOF )
            // InternalBoundingBox.g:118:2: iv_ruleMove= ruleMove EOF
            {
             newCompositeNode(grammarAccess.getMoveRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMove=ruleMove();

            state._fsp--;

             current =iv_ruleMove; 
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
    // $ANTLR end "entryRuleMove"


    // $ANTLR start "ruleMove"
    // InternalBoundingBox.g:124:1: ruleMove returns [EObject current=null] : (this_MoveX_0= ruleMoveX | this_MoveY_1= ruleMoveY ) ;
    public final EObject ruleMove() throws RecognitionException {
        EObject current = null;

        EObject this_MoveX_0 = null;

        EObject this_MoveY_1 = null;



        	enterRule();

        try {
            // InternalBoundingBox.g:130:2: ( (this_MoveX_0= ruleMoveX | this_MoveY_1= ruleMoveY ) )
            // InternalBoundingBox.g:131:2: (this_MoveX_0= ruleMoveX | this_MoveY_1= ruleMoveY )
            {
            // InternalBoundingBox.g:131:2: (this_MoveX_0= ruleMoveX | this_MoveY_1= ruleMoveY )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=13 && LA2_0<=14)) ) {
                alt2=1;
            }
            else if ( ((LA2_0>=15 && LA2_0<=16)) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalBoundingBox.g:132:3: this_MoveX_0= ruleMoveX
                    {

                    			newCompositeNode(grammarAccess.getMoveAccess().getMoveXParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_MoveX_0=ruleMoveX();

                    state._fsp--;


                    			current = this_MoveX_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalBoundingBox.g:141:3: this_MoveY_1= ruleMoveY
                    {

                    			newCompositeNode(grammarAccess.getMoveAccess().getMoveYParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_MoveY_1=ruleMoveY();

                    state._fsp--;


                    			current = this_MoveY_1;
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
    // $ANTLR end "ruleMove"


    // $ANTLR start "entryRuleMoveX"
    // InternalBoundingBox.g:153:1: entryRuleMoveX returns [EObject current=null] : iv_ruleMoveX= ruleMoveX EOF ;
    public final EObject entryRuleMoveX() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMoveX = null;


        try {
            // InternalBoundingBox.g:153:46: (iv_ruleMoveX= ruleMoveX EOF )
            // InternalBoundingBox.g:154:2: iv_ruleMoveX= ruleMoveX EOF
            {
             newCompositeNode(grammarAccess.getMoveXRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMoveX=ruleMoveX();

            state._fsp--;

             current =iv_ruleMoveX; 
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
    // $ANTLR end "entryRuleMoveX"


    // $ANTLR start "ruleMoveX"
    // InternalBoundingBox.g:160:1: ruleMoveX returns [EObject current=null] : (this_MoveLeft_0= ruleMoveLeft | this_MoveRight_1= ruleMoveRight ) ;
    public final EObject ruleMoveX() throws RecognitionException {
        EObject current = null;

        EObject this_MoveLeft_0 = null;

        EObject this_MoveRight_1 = null;



        	enterRule();

        try {
            // InternalBoundingBox.g:166:2: ( (this_MoveLeft_0= ruleMoveLeft | this_MoveRight_1= ruleMoveRight ) )
            // InternalBoundingBox.g:167:2: (this_MoveLeft_0= ruleMoveLeft | this_MoveRight_1= ruleMoveRight )
            {
            // InternalBoundingBox.g:167:2: (this_MoveLeft_0= ruleMoveLeft | this_MoveRight_1= ruleMoveRight )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            else if ( (LA3_0==14) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalBoundingBox.g:168:3: this_MoveLeft_0= ruleMoveLeft
                    {

                    			newCompositeNode(grammarAccess.getMoveXAccess().getMoveLeftParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_MoveLeft_0=ruleMoveLeft();

                    state._fsp--;


                    			current = this_MoveLeft_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalBoundingBox.g:177:3: this_MoveRight_1= ruleMoveRight
                    {

                    			newCompositeNode(grammarAccess.getMoveXAccess().getMoveRightParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_MoveRight_1=ruleMoveRight();

                    state._fsp--;


                    			current = this_MoveRight_1;
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
    // $ANTLR end "ruleMoveX"


    // $ANTLR start "entryRuleMoveY"
    // InternalBoundingBox.g:189:1: entryRuleMoveY returns [EObject current=null] : iv_ruleMoveY= ruleMoveY EOF ;
    public final EObject entryRuleMoveY() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMoveY = null;


        try {
            // InternalBoundingBox.g:189:46: (iv_ruleMoveY= ruleMoveY EOF )
            // InternalBoundingBox.g:190:2: iv_ruleMoveY= ruleMoveY EOF
            {
             newCompositeNode(grammarAccess.getMoveYRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMoveY=ruleMoveY();

            state._fsp--;

             current =iv_ruleMoveY; 
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
    // $ANTLR end "entryRuleMoveY"


    // $ANTLR start "ruleMoveY"
    // InternalBoundingBox.g:196:1: ruleMoveY returns [EObject current=null] : (this_MoveUp_0= ruleMoveUp | this_MoveDown_1= ruleMoveDown ) ;
    public final EObject ruleMoveY() throws RecognitionException {
        EObject current = null;

        EObject this_MoveUp_0 = null;

        EObject this_MoveDown_1 = null;



        	enterRule();

        try {
            // InternalBoundingBox.g:202:2: ( (this_MoveUp_0= ruleMoveUp | this_MoveDown_1= ruleMoveDown ) )
            // InternalBoundingBox.g:203:2: (this_MoveUp_0= ruleMoveUp | this_MoveDown_1= ruleMoveDown )
            {
            // InternalBoundingBox.g:203:2: (this_MoveUp_0= ruleMoveUp | this_MoveDown_1= ruleMoveDown )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            else if ( (LA4_0==16) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalBoundingBox.g:204:3: this_MoveUp_0= ruleMoveUp
                    {

                    			newCompositeNode(grammarAccess.getMoveYAccess().getMoveUpParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_MoveUp_0=ruleMoveUp();

                    state._fsp--;


                    			current = this_MoveUp_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalBoundingBox.g:213:3: this_MoveDown_1= ruleMoveDown
                    {

                    			newCompositeNode(grammarAccess.getMoveYAccess().getMoveDownParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_MoveDown_1=ruleMoveDown();

                    state._fsp--;


                    			current = this_MoveDown_1;
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
    // $ANTLR end "ruleMoveY"


    // $ANTLR start "entryRuleMoveLeft"
    // InternalBoundingBox.g:225:1: entryRuleMoveLeft returns [EObject current=null] : iv_ruleMoveLeft= ruleMoveLeft EOF ;
    public final EObject entryRuleMoveLeft() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMoveLeft = null;


        try {
            // InternalBoundingBox.g:225:49: (iv_ruleMoveLeft= ruleMoveLeft EOF )
            // InternalBoundingBox.g:226:2: iv_ruleMoveLeft= ruleMoveLeft EOF
            {
             newCompositeNode(grammarAccess.getMoveLeftRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMoveLeft=ruleMoveLeft();

            state._fsp--;

             current =iv_ruleMoveLeft; 
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
    // $ANTLR end "entryRuleMoveLeft"


    // $ANTLR start "ruleMoveLeft"
    // InternalBoundingBox.g:232:1: ruleMoveLeft returns [EObject current=null] : (otherlv_0= 'left' ( (lv_distance_1_0= RULE_INT ) ) otherlv_2= '\\n' ) ;
    public final EObject ruleMoveLeft() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_distance_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalBoundingBox.g:238:2: ( (otherlv_0= 'left' ( (lv_distance_1_0= RULE_INT ) ) otherlv_2= '\\n' ) )
            // InternalBoundingBox.g:239:2: (otherlv_0= 'left' ( (lv_distance_1_0= RULE_INT ) ) otherlv_2= '\\n' )
            {
            // InternalBoundingBox.g:239:2: (otherlv_0= 'left' ( (lv_distance_1_0= RULE_INT ) ) otherlv_2= '\\n' )
            // InternalBoundingBox.g:240:3: otherlv_0= 'left' ( (lv_distance_1_0= RULE_INT ) ) otherlv_2= '\\n'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getMoveLeftAccess().getLeftKeyword_0());
            		
            // InternalBoundingBox.g:244:3: ( (lv_distance_1_0= RULE_INT ) )
            // InternalBoundingBox.g:245:4: (lv_distance_1_0= RULE_INT )
            {
            // InternalBoundingBox.g:245:4: (lv_distance_1_0= RULE_INT )
            // InternalBoundingBox.g:246:5: lv_distance_1_0= RULE_INT
            {
            lv_distance_1_0=(Token)match(input,RULE_INT,FOLLOW_3); 

            					newLeafNode(lv_distance_1_0, grammarAccess.getMoveLeftAccess().getDistanceINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMoveLeftRule());
            					}
            					setWithLastConsumed(
            						current,
            						"distance",
            						lv_distance_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getMoveLeftAccess().getControl000aKeyword_2());
            		

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
    // $ANTLR end "ruleMoveLeft"


    // $ANTLR start "entryRuleMoveRight"
    // InternalBoundingBox.g:270:1: entryRuleMoveRight returns [EObject current=null] : iv_ruleMoveRight= ruleMoveRight EOF ;
    public final EObject entryRuleMoveRight() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMoveRight = null;


        try {
            // InternalBoundingBox.g:270:50: (iv_ruleMoveRight= ruleMoveRight EOF )
            // InternalBoundingBox.g:271:2: iv_ruleMoveRight= ruleMoveRight EOF
            {
             newCompositeNode(grammarAccess.getMoveRightRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMoveRight=ruleMoveRight();

            state._fsp--;

             current =iv_ruleMoveRight; 
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
    // $ANTLR end "entryRuleMoveRight"


    // $ANTLR start "ruleMoveRight"
    // InternalBoundingBox.g:277:1: ruleMoveRight returns [EObject current=null] : (otherlv_0= 'right' ( (lv_distance_1_0= RULE_INT ) ) otherlv_2= '\\n' ) ;
    public final EObject ruleMoveRight() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_distance_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalBoundingBox.g:283:2: ( (otherlv_0= 'right' ( (lv_distance_1_0= RULE_INT ) ) otherlv_2= '\\n' ) )
            // InternalBoundingBox.g:284:2: (otherlv_0= 'right' ( (lv_distance_1_0= RULE_INT ) ) otherlv_2= '\\n' )
            {
            // InternalBoundingBox.g:284:2: (otherlv_0= 'right' ( (lv_distance_1_0= RULE_INT ) ) otherlv_2= '\\n' )
            // InternalBoundingBox.g:285:3: otherlv_0= 'right' ( (lv_distance_1_0= RULE_INT ) ) otherlv_2= '\\n'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getMoveRightAccess().getRightKeyword_0());
            		
            // InternalBoundingBox.g:289:3: ( (lv_distance_1_0= RULE_INT ) )
            // InternalBoundingBox.g:290:4: (lv_distance_1_0= RULE_INT )
            {
            // InternalBoundingBox.g:290:4: (lv_distance_1_0= RULE_INT )
            // InternalBoundingBox.g:291:5: lv_distance_1_0= RULE_INT
            {
            lv_distance_1_0=(Token)match(input,RULE_INT,FOLLOW_3); 

            					newLeafNode(lv_distance_1_0, grammarAccess.getMoveRightAccess().getDistanceINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMoveRightRule());
            					}
            					setWithLastConsumed(
            						current,
            						"distance",
            						lv_distance_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getMoveRightAccess().getControl000aKeyword_2());
            		

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
    // $ANTLR end "ruleMoveRight"


    // $ANTLR start "entryRuleMoveUp"
    // InternalBoundingBox.g:315:1: entryRuleMoveUp returns [EObject current=null] : iv_ruleMoveUp= ruleMoveUp EOF ;
    public final EObject entryRuleMoveUp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMoveUp = null;


        try {
            // InternalBoundingBox.g:315:47: (iv_ruleMoveUp= ruleMoveUp EOF )
            // InternalBoundingBox.g:316:2: iv_ruleMoveUp= ruleMoveUp EOF
            {
             newCompositeNode(grammarAccess.getMoveUpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMoveUp=ruleMoveUp();

            state._fsp--;

             current =iv_ruleMoveUp; 
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
    // $ANTLR end "entryRuleMoveUp"


    // $ANTLR start "ruleMoveUp"
    // InternalBoundingBox.g:322:1: ruleMoveUp returns [EObject current=null] : (otherlv_0= 'up' ( (lv_distance_1_0= RULE_INT ) ) otherlv_2= '\\n' ) ;
    public final EObject ruleMoveUp() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_distance_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalBoundingBox.g:328:2: ( (otherlv_0= 'up' ( (lv_distance_1_0= RULE_INT ) ) otherlv_2= '\\n' ) )
            // InternalBoundingBox.g:329:2: (otherlv_0= 'up' ( (lv_distance_1_0= RULE_INT ) ) otherlv_2= '\\n' )
            {
            // InternalBoundingBox.g:329:2: (otherlv_0= 'up' ( (lv_distance_1_0= RULE_INT ) ) otherlv_2= '\\n' )
            // InternalBoundingBox.g:330:3: otherlv_0= 'up' ( (lv_distance_1_0= RULE_INT ) ) otherlv_2= '\\n'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getMoveUpAccess().getUpKeyword_0());
            		
            // InternalBoundingBox.g:334:3: ( (lv_distance_1_0= RULE_INT ) )
            // InternalBoundingBox.g:335:4: (lv_distance_1_0= RULE_INT )
            {
            // InternalBoundingBox.g:335:4: (lv_distance_1_0= RULE_INT )
            // InternalBoundingBox.g:336:5: lv_distance_1_0= RULE_INT
            {
            lv_distance_1_0=(Token)match(input,RULE_INT,FOLLOW_3); 

            					newLeafNode(lv_distance_1_0, grammarAccess.getMoveUpAccess().getDistanceINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMoveUpRule());
            					}
            					setWithLastConsumed(
            						current,
            						"distance",
            						lv_distance_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getMoveUpAccess().getControl000aKeyword_2());
            		

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
    // $ANTLR end "ruleMoveUp"


    // $ANTLR start "entryRuleMoveDown"
    // InternalBoundingBox.g:360:1: entryRuleMoveDown returns [EObject current=null] : iv_ruleMoveDown= ruleMoveDown EOF ;
    public final EObject entryRuleMoveDown() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMoveDown = null;


        try {
            // InternalBoundingBox.g:360:49: (iv_ruleMoveDown= ruleMoveDown EOF )
            // InternalBoundingBox.g:361:2: iv_ruleMoveDown= ruleMoveDown EOF
            {
             newCompositeNode(grammarAccess.getMoveDownRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMoveDown=ruleMoveDown();

            state._fsp--;

             current =iv_ruleMoveDown; 
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
    // $ANTLR end "entryRuleMoveDown"


    // $ANTLR start "ruleMoveDown"
    // InternalBoundingBox.g:367:1: ruleMoveDown returns [EObject current=null] : (otherlv_0= 'down' ( (lv_distance_1_0= RULE_INT ) ) otherlv_2= '\\n' ) ;
    public final EObject ruleMoveDown() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_distance_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalBoundingBox.g:373:2: ( (otherlv_0= 'down' ( (lv_distance_1_0= RULE_INT ) ) otherlv_2= '\\n' ) )
            // InternalBoundingBox.g:374:2: (otherlv_0= 'down' ( (lv_distance_1_0= RULE_INT ) ) otherlv_2= '\\n' )
            {
            // InternalBoundingBox.g:374:2: (otherlv_0= 'down' ( (lv_distance_1_0= RULE_INT ) ) otherlv_2= '\\n' )
            // InternalBoundingBox.g:375:3: otherlv_0= 'down' ( (lv_distance_1_0= RULE_INT ) ) otherlv_2= '\\n'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getMoveDownAccess().getDownKeyword_0());
            		
            // InternalBoundingBox.g:379:3: ( (lv_distance_1_0= RULE_INT ) )
            // InternalBoundingBox.g:380:4: (lv_distance_1_0= RULE_INT )
            {
            // InternalBoundingBox.g:380:4: (lv_distance_1_0= RULE_INT )
            // InternalBoundingBox.g:381:5: lv_distance_1_0= RULE_INT
            {
            lv_distance_1_0=(Token)match(input,RULE_INT,FOLLOW_3); 

            					newLeafNode(lv_distance_1_0, grammarAccess.getMoveDownAccess().getDistanceINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMoveDownRule());
            					}
            					setWithLastConsumed(
            						current,
            						"distance",
            						lv_distance_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getMoveDownAccess().getControl000aKeyword_2());
            		

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
    // $ANTLR end "ruleMoveDown"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000000001E002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});

}