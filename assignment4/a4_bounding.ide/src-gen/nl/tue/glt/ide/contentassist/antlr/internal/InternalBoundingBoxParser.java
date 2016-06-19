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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalBoundingBoxParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Box:'", "'left'", "'right'", "'up'", "'down'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
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



    // $ANTLR start "entryRuleWorld"
    // InternalBoundingBox.g:53:1: entryRuleWorld : ruleWorld EOF ;
    public final void entryRuleWorld() throws RecognitionException {
        try {
            // InternalBoundingBox.g:54:1: ( ruleWorld EOF )
            // InternalBoundingBox.g:55:1: ruleWorld EOF
            {
             before(grammarAccess.getWorldRule()); 
            pushFollow(FOLLOW_1);
            ruleWorld();

            state._fsp--;

             after(grammarAccess.getWorldRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleWorld"


    // $ANTLR start "ruleWorld"
    // InternalBoundingBox.g:62:1: ruleWorld : ( ( rule__World__Group__0 ) ) ;
    public final void ruleWorld() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoundingBox.g:66:2: ( ( ( rule__World__Group__0 ) ) )
            // InternalBoundingBox.g:67:2: ( ( rule__World__Group__0 ) )
            {
            // InternalBoundingBox.g:67:2: ( ( rule__World__Group__0 ) )
            // InternalBoundingBox.g:68:3: ( rule__World__Group__0 )
            {
             before(grammarAccess.getWorldAccess().getGroup()); 
            // InternalBoundingBox.g:69:3: ( rule__World__Group__0 )
            // InternalBoundingBox.g:69:4: rule__World__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__World__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWorldAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWorld"


    // $ANTLR start "entryRuleMove"
    // InternalBoundingBox.g:78:1: entryRuleMove : ruleMove EOF ;
    public final void entryRuleMove() throws RecognitionException {
        try {
            // InternalBoundingBox.g:79:1: ( ruleMove EOF )
            // InternalBoundingBox.g:80:1: ruleMove EOF
            {
             before(grammarAccess.getMoveRule()); 
            pushFollow(FOLLOW_1);
            ruleMove();

            state._fsp--;

             after(grammarAccess.getMoveRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMove"


    // $ANTLR start "ruleMove"
    // InternalBoundingBox.g:87:1: ruleMove : ( ( rule__Move__Alternatives ) ) ;
    public final void ruleMove() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoundingBox.g:91:2: ( ( ( rule__Move__Alternatives ) ) )
            // InternalBoundingBox.g:92:2: ( ( rule__Move__Alternatives ) )
            {
            // InternalBoundingBox.g:92:2: ( ( rule__Move__Alternatives ) )
            // InternalBoundingBox.g:93:3: ( rule__Move__Alternatives )
            {
             before(grammarAccess.getMoveAccess().getAlternatives()); 
            // InternalBoundingBox.g:94:3: ( rule__Move__Alternatives )
            // InternalBoundingBox.g:94:4: rule__Move__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Move__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMoveAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMove"


    // $ANTLR start "entryRuleMoveX"
    // InternalBoundingBox.g:103:1: entryRuleMoveX : ruleMoveX EOF ;
    public final void entryRuleMoveX() throws RecognitionException {
        try {
            // InternalBoundingBox.g:104:1: ( ruleMoveX EOF )
            // InternalBoundingBox.g:105:1: ruleMoveX EOF
            {
             before(grammarAccess.getMoveXRule()); 
            pushFollow(FOLLOW_1);
            ruleMoveX();

            state._fsp--;

             after(grammarAccess.getMoveXRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMoveX"


    // $ANTLR start "ruleMoveX"
    // InternalBoundingBox.g:112:1: ruleMoveX : ( ( rule__MoveX__Alternatives ) ) ;
    public final void ruleMoveX() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoundingBox.g:116:2: ( ( ( rule__MoveX__Alternatives ) ) )
            // InternalBoundingBox.g:117:2: ( ( rule__MoveX__Alternatives ) )
            {
            // InternalBoundingBox.g:117:2: ( ( rule__MoveX__Alternatives ) )
            // InternalBoundingBox.g:118:3: ( rule__MoveX__Alternatives )
            {
             before(grammarAccess.getMoveXAccess().getAlternatives()); 
            // InternalBoundingBox.g:119:3: ( rule__MoveX__Alternatives )
            // InternalBoundingBox.g:119:4: rule__MoveX__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__MoveX__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMoveXAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMoveX"


    // $ANTLR start "entryRuleMoveY"
    // InternalBoundingBox.g:128:1: entryRuleMoveY : ruleMoveY EOF ;
    public final void entryRuleMoveY() throws RecognitionException {
        try {
            // InternalBoundingBox.g:129:1: ( ruleMoveY EOF )
            // InternalBoundingBox.g:130:1: ruleMoveY EOF
            {
             before(grammarAccess.getMoveYRule()); 
            pushFollow(FOLLOW_1);
            ruleMoveY();

            state._fsp--;

             after(grammarAccess.getMoveYRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMoveY"


    // $ANTLR start "ruleMoveY"
    // InternalBoundingBox.g:137:1: ruleMoveY : ( ( rule__MoveY__Alternatives ) ) ;
    public final void ruleMoveY() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoundingBox.g:141:2: ( ( ( rule__MoveY__Alternatives ) ) )
            // InternalBoundingBox.g:142:2: ( ( rule__MoveY__Alternatives ) )
            {
            // InternalBoundingBox.g:142:2: ( ( rule__MoveY__Alternatives ) )
            // InternalBoundingBox.g:143:3: ( rule__MoveY__Alternatives )
            {
             before(grammarAccess.getMoveYAccess().getAlternatives()); 
            // InternalBoundingBox.g:144:3: ( rule__MoveY__Alternatives )
            // InternalBoundingBox.g:144:4: rule__MoveY__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__MoveY__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMoveYAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMoveY"


    // $ANTLR start "entryRuleMoveLeft"
    // InternalBoundingBox.g:153:1: entryRuleMoveLeft : ruleMoveLeft EOF ;
    public final void entryRuleMoveLeft() throws RecognitionException {
        try {
            // InternalBoundingBox.g:154:1: ( ruleMoveLeft EOF )
            // InternalBoundingBox.g:155:1: ruleMoveLeft EOF
            {
             before(grammarAccess.getMoveLeftRule()); 
            pushFollow(FOLLOW_1);
            ruleMoveLeft();

            state._fsp--;

             after(grammarAccess.getMoveLeftRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMoveLeft"


    // $ANTLR start "ruleMoveLeft"
    // InternalBoundingBox.g:162:1: ruleMoveLeft : ( ( rule__MoveLeft__Group__0 ) ) ;
    public final void ruleMoveLeft() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoundingBox.g:166:2: ( ( ( rule__MoveLeft__Group__0 ) ) )
            // InternalBoundingBox.g:167:2: ( ( rule__MoveLeft__Group__0 ) )
            {
            // InternalBoundingBox.g:167:2: ( ( rule__MoveLeft__Group__0 ) )
            // InternalBoundingBox.g:168:3: ( rule__MoveLeft__Group__0 )
            {
             before(grammarAccess.getMoveLeftAccess().getGroup()); 
            // InternalBoundingBox.g:169:3: ( rule__MoveLeft__Group__0 )
            // InternalBoundingBox.g:169:4: rule__MoveLeft__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MoveLeft__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMoveLeftAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMoveLeft"


    // $ANTLR start "entryRuleMoveRight"
    // InternalBoundingBox.g:178:1: entryRuleMoveRight : ruleMoveRight EOF ;
    public final void entryRuleMoveRight() throws RecognitionException {
        try {
            // InternalBoundingBox.g:179:1: ( ruleMoveRight EOF )
            // InternalBoundingBox.g:180:1: ruleMoveRight EOF
            {
             before(grammarAccess.getMoveRightRule()); 
            pushFollow(FOLLOW_1);
            ruleMoveRight();

            state._fsp--;

             after(grammarAccess.getMoveRightRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMoveRight"


    // $ANTLR start "ruleMoveRight"
    // InternalBoundingBox.g:187:1: ruleMoveRight : ( ( rule__MoveRight__Group__0 ) ) ;
    public final void ruleMoveRight() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoundingBox.g:191:2: ( ( ( rule__MoveRight__Group__0 ) ) )
            // InternalBoundingBox.g:192:2: ( ( rule__MoveRight__Group__0 ) )
            {
            // InternalBoundingBox.g:192:2: ( ( rule__MoveRight__Group__0 ) )
            // InternalBoundingBox.g:193:3: ( rule__MoveRight__Group__0 )
            {
             before(grammarAccess.getMoveRightAccess().getGroup()); 
            // InternalBoundingBox.g:194:3: ( rule__MoveRight__Group__0 )
            // InternalBoundingBox.g:194:4: rule__MoveRight__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MoveRight__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMoveRightAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMoveRight"


    // $ANTLR start "entryRuleMoveUp"
    // InternalBoundingBox.g:203:1: entryRuleMoveUp : ruleMoveUp EOF ;
    public final void entryRuleMoveUp() throws RecognitionException {
        try {
            // InternalBoundingBox.g:204:1: ( ruleMoveUp EOF )
            // InternalBoundingBox.g:205:1: ruleMoveUp EOF
            {
             before(grammarAccess.getMoveUpRule()); 
            pushFollow(FOLLOW_1);
            ruleMoveUp();

            state._fsp--;

             after(grammarAccess.getMoveUpRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMoveUp"


    // $ANTLR start "ruleMoveUp"
    // InternalBoundingBox.g:212:1: ruleMoveUp : ( ( rule__MoveUp__Group__0 ) ) ;
    public final void ruleMoveUp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoundingBox.g:216:2: ( ( ( rule__MoveUp__Group__0 ) ) )
            // InternalBoundingBox.g:217:2: ( ( rule__MoveUp__Group__0 ) )
            {
            // InternalBoundingBox.g:217:2: ( ( rule__MoveUp__Group__0 ) )
            // InternalBoundingBox.g:218:3: ( rule__MoveUp__Group__0 )
            {
             before(grammarAccess.getMoveUpAccess().getGroup()); 
            // InternalBoundingBox.g:219:3: ( rule__MoveUp__Group__0 )
            // InternalBoundingBox.g:219:4: rule__MoveUp__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MoveUp__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMoveUpAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMoveUp"


    // $ANTLR start "entryRuleMoveDown"
    // InternalBoundingBox.g:228:1: entryRuleMoveDown : ruleMoveDown EOF ;
    public final void entryRuleMoveDown() throws RecognitionException {
        try {
            // InternalBoundingBox.g:229:1: ( ruleMoveDown EOF )
            // InternalBoundingBox.g:230:1: ruleMoveDown EOF
            {
             before(grammarAccess.getMoveDownRule()); 
            pushFollow(FOLLOW_1);
            ruleMoveDown();

            state._fsp--;

             after(grammarAccess.getMoveDownRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMoveDown"


    // $ANTLR start "ruleMoveDown"
    // InternalBoundingBox.g:237:1: ruleMoveDown : ( ( rule__MoveDown__Group__0 ) ) ;
    public final void ruleMoveDown() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoundingBox.g:241:2: ( ( ( rule__MoveDown__Group__0 ) ) )
            // InternalBoundingBox.g:242:2: ( ( rule__MoveDown__Group__0 ) )
            {
            // InternalBoundingBox.g:242:2: ( ( rule__MoveDown__Group__0 ) )
            // InternalBoundingBox.g:243:3: ( rule__MoveDown__Group__0 )
            {
             before(grammarAccess.getMoveDownAccess().getGroup()); 
            // InternalBoundingBox.g:244:3: ( rule__MoveDown__Group__0 )
            // InternalBoundingBox.g:244:4: rule__MoveDown__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MoveDown__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMoveDownAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMoveDown"


    // $ANTLR start "rule__Move__Alternatives"
    // InternalBoundingBox.g:252:1: rule__Move__Alternatives : ( ( ruleMoveX ) | ( ruleMoveY ) );
    public final void rule__Move__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoundingBox.g:256:1: ( ( ruleMoveX ) | ( ruleMoveY ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( ((LA1_0>=12 && LA1_0<=13)) ) {
                alt1=1;
            }
            else if ( ((LA1_0>=14 && LA1_0<=15)) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalBoundingBox.g:257:2: ( ruleMoveX )
                    {
                    // InternalBoundingBox.g:257:2: ( ruleMoveX )
                    // InternalBoundingBox.g:258:3: ruleMoveX
                    {
                     before(grammarAccess.getMoveAccess().getMoveXParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleMoveX();

                    state._fsp--;

                     after(grammarAccess.getMoveAccess().getMoveXParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBoundingBox.g:263:2: ( ruleMoveY )
                    {
                    // InternalBoundingBox.g:263:2: ( ruleMoveY )
                    // InternalBoundingBox.g:264:3: ruleMoveY
                    {
                     before(grammarAccess.getMoveAccess().getMoveYParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleMoveY();

                    state._fsp--;

                     after(grammarAccess.getMoveAccess().getMoveYParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__Alternatives"


    // $ANTLR start "rule__MoveX__Alternatives"
    // InternalBoundingBox.g:273:1: rule__MoveX__Alternatives : ( ( ruleMoveLeft ) | ( ruleMoveRight ) );
    public final void rule__MoveX__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoundingBox.g:277:1: ( ( ruleMoveLeft ) | ( ruleMoveRight ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==12) ) {
                alt2=1;
            }
            else if ( (LA2_0==13) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalBoundingBox.g:278:2: ( ruleMoveLeft )
                    {
                    // InternalBoundingBox.g:278:2: ( ruleMoveLeft )
                    // InternalBoundingBox.g:279:3: ruleMoveLeft
                    {
                     before(grammarAccess.getMoveXAccess().getMoveLeftParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleMoveLeft();

                    state._fsp--;

                     after(grammarAccess.getMoveXAccess().getMoveLeftParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBoundingBox.g:284:2: ( ruleMoveRight )
                    {
                    // InternalBoundingBox.g:284:2: ( ruleMoveRight )
                    // InternalBoundingBox.g:285:3: ruleMoveRight
                    {
                     before(grammarAccess.getMoveXAccess().getMoveRightParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleMoveRight();

                    state._fsp--;

                     after(grammarAccess.getMoveXAccess().getMoveRightParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoveX__Alternatives"


    // $ANTLR start "rule__MoveY__Alternatives"
    // InternalBoundingBox.g:294:1: rule__MoveY__Alternatives : ( ( ruleMoveUp ) | ( ruleMoveDown ) );
    public final void rule__MoveY__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoundingBox.g:298:1: ( ( ruleMoveUp ) | ( ruleMoveDown ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            else if ( (LA3_0==15) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalBoundingBox.g:299:2: ( ruleMoveUp )
                    {
                    // InternalBoundingBox.g:299:2: ( ruleMoveUp )
                    // InternalBoundingBox.g:300:3: ruleMoveUp
                    {
                     before(grammarAccess.getMoveYAccess().getMoveUpParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleMoveUp();

                    state._fsp--;

                     after(grammarAccess.getMoveYAccess().getMoveUpParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBoundingBox.g:305:2: ( ruleMoveDown )
                    {
                    // InternalBoundingBox.g:305:2: ( ruleMoveDown )
                    // InternalBoundingBox.g:306:3: ruleMoveDown
                    {
                     before(grammarAccess.getMoveYAccess().getMoveDownParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleMoveDown();

                    state._fsp--;

                     after(grammarAccess.getMoveYAccess().getMoveDownParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoveY__Alternatives"


    // $ANTLR start "rule__World__Group__0"
    // InternalBoundingBox.g:315:1: rule__World__Group__0 : rule__World__Group__0__Impl rule__World__Group__1 ;
    public final void rule__World__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoundingBox.g:319:1: ( rule__World__Group__0__Impl rule__World__Group__1 )
            // InternalBoundingBox.g:320:2: rule__World__Group__0__Impl rule__World__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__World__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__World__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__World__Group__0"


    // $ANTLR start "rule__World__Group__0__Impl"
    // InternalBoundingBox.g:327:1: rule__World__Group__0__Impl : ( () ) ;
    public final void rule__World__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoundingBox.g:331:1: ( ( () ) )
            // InternalBoundingBox.g:332:1: ( () )
            {
            // InternalBoundingBox.g:332:1: ( () )
            // InternalBoundingBox.g:333:2: ()
            {
             before(grammarAccess.getWorldAccess().getWorldAction_0()); 
            // InternalBoundingBox.g:334:2: ()
            // InternalBoundingBox.g:334:3: 
            {
            }

             after(grammarAccess.getWorldAccess().getWorldAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__World__Group__0__Impl"


    // $ANTLR start "rule__World__Group__1"
    // InternalBoundingBox.g:342:1: rule__World__Group__1 : rule__World__Group__1__Impl rule__World__Group__2 ;
    public final void rule__World__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoundingBox.g:346:1: ( rule__World__Group__1__Impl rule__World__Group__2 )
            // InternalBoundingBox.g:347:2: rule__World__Group__1__Impl rule__World__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__World__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__World__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__World__Group__1"


    // $ANTLR start "rule__World__Group__1__Impl"
    // InternalBoundingBox.g:354:1: rule__World__Group__1__Impl : ( 'Box:' ) ;
    public final void rule__World__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoundingBox.g:358:1: ( ( 'Box:' ) )
            // InternalBoundingBox.g:359:1: ( 'Box:' )
            {
            // InternalBoundingBox.g:359:1: ( 'Box:' )
            // InternalBoundingBox.g:360:2: 'Box:'
            {
             before(grammarAccess.getWorldAccess().getBoxKeyword_1()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getWorldAccess().getBoxKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__World__Group__1__Impl"


    // $ANTLR start "rule__World__Group__2"
    // InternalBoundingBox.g:369:1: rule__World__Group__2 : rule__World__Group__2__Impl ;
    public final void rule__World__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoundingBox.g:373:1: ( rule__World__Group__2__Impl )
            // InternalBoundingBox.g:374:2: rule__World__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__World__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__World__Group__2"


    // $ANTLR start "rule__World__Group__2__Impl"
    // InternalBoundingBox.g:380:1: rule__World__Group__2__Impl : ( ( rule__World__MoveCommandsAssignment_2 )* ) ;
    public final void rule__World__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoundingBox.g:384:1: ( ( ( rule__World__MoveCommandsAssignment_2 )* ) )
            // InternalBoundingBox.g:385:1: ( ( rule__World__MoveCommandsAssignment_2 )* )
            {
            // InternalBoundingBox.g:385:1: ( ( rule__World__MoveCommandsAssignment_2 )* )
            // InternalBoundingBox.g:386:2: ( rule__World__MoveCommandsAssignment_2 )*
            {
             before(grammarAccess.getWorldAccess().getMoveCommandsAssignment_2()); 
            // InternalBoundingBox.g:387:2: ( rule__World__MoveCommandsAssignment_2 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=12 && LA4_0<=15)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalBoundingBox.g:387:3: rule__World__MoveCommandsAssignment_2
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__World__MoveCommandsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getWorldAccess().getMoveCommandsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__World__Group__2__Impl"


    // $ANTLR start "rule__MoveLeft__Group__0"
    // InternalBoundingBox.g:396:1: rule__MoveLeft__Group__0 : rule__MoveLeft__Group__0__Impl rule__MoveLeft__Group__1 ;
    public final void rule__MoveLeft__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoundingBox.g:400:1: ( rule__MoveLeft__Group__0__Impl rule__MoveLeft__Group__1 )
            // InternalBoundingBox.g:401:2: rule__MoveLeft__Group__0__Impl rule__MoveLeft__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__MoveLeft__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MoveLeft__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoveLeft__Group__0"


    // $ANTLR start "rule__MoveLeft__Group__0__Impl"
    // InternalBoundingBox.g:408:1: rule__MoveLeft__Group__0__Impl : ( 'left' ) ;
    public final void rule__MoveLeft__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoundingBox.g:412:1: ( ( 'left' ) )
            // InternalBoundingBox.g:413:1: ( 'left' )
            {
            // InternalBoundingBox.g:413:1: ( 'left' )
            // InternalBoundingBox.g:414:2: 'left'
            {
             before(grammarAccess.getMoveLeftAccess().getLeftKeyword_0()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getMoveLeftAccess().getLeftKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoveLeft__Group__0__Impl"


    // $ANTLR start "rule__MoveLeft__Group__1"
    // InternalBoundingBox.g:423:1: rule__MoveLeft__Group__1 : rule__MoveLeft__Group__1__Impl ;
    public final void rule__MoveLeft__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoundingBox.g:427:1: ( rule__MoveLeft__Group__1__Impl )
            // InternalBoundingBox.g:428:2: rule__MoveLeft__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MoveLeft__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoveLeft__Group__1"


    // $ANTLR start "rule__MoveLeft__Group__1__Impl"
    // InternalBoundingBox.g:434:1: rule__MoveLeft__Group__1__Impl : ( ( rule__MoveLeft__DistanceAssignment_1 ) ) ;
    public final void rule__MoveLeft__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoundingBox.g:438:1: ( ( ( rule__MoveLeft__DistanceAssignment_1 ) ) )
            // InternalBoundingBox.g:439:1: ( ( rule__MoveLeft__DistanceAssignment_1 ) )
            {
            // InternalBoundingBox.g:439:1: ( ( rule__MoveLeft__DistanceAssignment_1 ) )
            // InternalBoundingBox.g:440:2: ( rule__MoveLeft__DistanceAssignment_1 )
            {
             before(grammarAccess.getMoveLeftAccess().getDistanceAssignment_1()); 
            // InternalBoundingBox.g:441:2: ( rule__MoveLeft__DistanceAssignment_1 )
            // InternalBoundingBox.g:441:3: rule__MoveLeft__DistanceAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__MoveLeft__DistanceAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMoveLeftAccess().getDistanceAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoveLeft__Group__1__Impl"


    // $ANTLR start "rule__MoveRight__Group__0"
    // InternalBoundingBox.g:450:1: rule__MoveRight__Group__0 : rule__MoveRight__Group__0__Impl rule__MoveRight__Group__1 ;
    public final void rule__MoveRight__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoundingBox.g:454:1: ( rule__MoveRight__Group__0__Impl rule__MoveRight__Group__1 )
            // InternalBoundingBox.g:455:2: rule__MoveRight__Group__0__Impl rule__MoveRight__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__MoveRight__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MoveRight__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoveRight__Group__0"


    // $ANTLR start "rule__MoveRight__Group__0__Impl"
    // InternalBoundingBox.g:462:1: rule__MoveRight__Group__0__Impl : ( 'right' ) ;
    public final void rule__MoveRight__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoundingBox.g:466:1: ( ( 'right' ) )
            // InternalBoundingBox.g:467:1: ( 'right' )
            {
            // InternalBoundingBox.g:467:1: ( 'right' )
            // InternalBoundingBox.g:468:2: 'right'
            {
             before(grammarAccess.getMoveRightAccess().getRightKeyword_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getMoveRightAccess().getRightKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoveRight__Group__0__Impl"


    // $ANTLR start "rule__MoveRight__Group__1"
    // InternalBoundingBox.g:477:1: rule__MoveRight__Group__1 : rule__MoveRight__Group__1__Impl ;
    public final void rule__MoveRight__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoundingBox.g:481:1: ( rule__MoveRight__Group__1__Impl )
            // InternalBoundingBox.g:482:2: rule__MoveRight__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MoveRight__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoveRight__Group__1"


    // $ANTLR start "rule__MoveRight__Group__1__Impl"
    // InternalBoundingBox.g:488:1: rule__MoveRight__Group__1__Impl : ( ( rule__MoveRight__DistanceAssignment_1 ) ) ;
    public final void rule__MoveRight__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoundingBox.g:492:1: ( ( ( rule__MoveRight__DistanceAssignment_1 ) ) )
            // InternalBoundingBox.g:493:1: ( ( rule__MoveRight__DistanceAssignment_1 ) )
            {
            // InternalBoundingBox.g:493:1: ( ( rule__MoveRight__DistanceAssignment_1 ) )
            // InternalBoundingBox.g:494:2: ( rule__MoveRight__DistanceAssignment_1 )
            {
             before(grammarAccess.getMoveRightAccess().getDistanceAssignment_1()); 
            // InternalBoundingBox.g:495:2: ( rule__MoveRight__DistanceAssignment_1 )
            // InternalBoundingBox.g:495:3: rule__MoveRight__DistanceAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__MoveRight__DistanceAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMoveRightAccess().getDistanceAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoveRight__Group__1__Impl"


    // $ANTLR start "rule__MoveUp__Group__0"
    // InternalBoundingBox.g:504:1: rule__MoveUp__Group__0 : rule__MoveUp__Group__0__Impl rule__MoveUp__Group__1 ;
    public final void rule__MoveUp__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoundingBox.g:508:1: ( rule__MoveUp__Group__0__Impl rule__MoveUp__Group__1 )
            // InternalBoundingBox.g:509:2: rule__MoveUp__Group__0__Impl rule__MoveUp__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__MoveUp__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MoveUp__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoveUp__Group__0"


    // $ANTLR start "rule__MoveUp__Group__0__Impl"
    // InternalBoundingBox.g:516:1: rule__MoveUp__Group__0__Impl : ( 'up' ) ;
    public final void rule__MoveUp__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoundingBox.g:520:1: ( ( 'up' ) )
            // InternalBoundingBox.g:521:1: ( 'up' )
            {
            // InternalBoundingBox.g:521:1: ( 'up' )
            // InternalBoundingBox.g:522:2: 'up'
            {
             before(grammarAccess.getMoveUpAccess().getUpKeyword_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getMoveUpAccess().getUpKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoveUp__Group__0__Impl"


    // $ANTLR start "rule__MoveUp__Group__1"
    // InternalBoundingBox.g:531:1: rule__MoveUp__Group__1 : rule__MoveUp__Group__1__Impl ;
    public final void rule__MoveUp__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoundingBox.g:535:1: ( rule__MoveUp__Group__1__Impl )
            // InternalBoundingBox.g:536:2: rule__MoveUp__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MoveUp__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoveUp__Group__1"


    // $ANTLR start "rule__MoveUp__Group__1__Impl"
    // InternalBoundingBox.g:542:1: rule__MoveUp__Group__1__Impl : ( ( rule__MoveUp__DistanceAssignment_1 ) ) ;
    public final void rule__MoveUp__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoundingBox.g:546:1: ( ( ( rule__MoveUp__DistanceAssignment_1 ) ) )
            // InternalBoundingBox.g:547:1: ( ( rule__MoveUp__DistanceAssignment_1 ) )
            {
            // InternalBoundingBox.g:547:1: ( ( rule__MoveUp__DistanceAssignment_1 ) )
            // InternalBoundingBox.g:548:2: ( rule__MoveUp__DistanceAssignment_1 )
            {
             before(grammarAccess.getMoveUpAccess().getDistanceAssignment_1()); 
            // InternalBoundingBox.g:549:2: ( rule__MoveUp__DistanceAssignment_1 )
            // InternalBoundingBox.g:549:3: rule__MoveUp__DistanceAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__MoveUp__DistanceAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMoveUpAccess().getDistanceAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoveUp__Group__1__Impl"


    // $ANTLR start "rule__MoveDown__Group__0"
    // InternalBoundingBox.g:558:1: rule__MoveDown__Group__0 : rule__MoveDown__Group__0__Impl rule__MoveDown__Group__1 ;
    public final void rule__MoveDown__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoundingBox.g:562:1: ( rule__MoveDown__Group__0__Impl rule__MoveDown__Group__1 )
            // InternalBoundingBox.g:563:2: rule__MoveDown__Group__0__Impl rule__MoveDown__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__MoveDown__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MoveDown__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoveDown__Group__0"


    // $ANTLR start "rule__MoveDown__Group__0__Impl"
    // InternalBoundingBox.g:570:1: rule__MoveDown__Group__0__Impl : ( 'down' ) ;
    public final void rule__MoveDown__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoundingBox.g:574:1: ( ( 'down' ) )
            // InternalBoundingBox.g:575:1: ( 'down' )
            {
            // InternalBoundingBox.g:575:1: ( 'down' )
            // InternalBoundingBox.g:576:2: 'down'
            {
             before(grammarAccess.getMoveDownAccess().getDownKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getMoveDownAccess().getDownKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoveDown__Group__0__Impl"


    // $ANTLR start "rule__MoveDown__Group__1"
    // InternalBoundingBox.g:585:1: rule__MoveDown__Group__1 : rule__MoveDown__Group__1__Impl ;
    public final void rule__MoveDown__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoundingBox.g:589:1: ( rule__MoveDown__Group__1__Impl )
            // InternalBoundingBox.g:590:2: rule__MoveDown__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MoveDown__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoveDown__Group__1"


    // $ANTLR start "rule__MoveDown__Group__1__Impl"
    // InternalBoundingBox.g:596:1: rule__MoveDown__Group__1__Impl : ( ( rule__MoveDown__DistanceAssignment_1 ) ) ;
    public final void rule__MoveDown__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoundingBox.g:600:1: ( ( ( rule__MoveDown__DistanceAssignment_1 ) ) )
            // InternalBoundingBox.g:601:1: ( ( rule__MoveDown__DistanceAssignment_1 ) )
            {
            // InternalBoundingBox.g:601:1: ( ( rule__MoveDown__DistanceAssignment_1 ) )
            // InternalBoundingBox.g:602:2: ( rule__MoveDown__DistanceAssignment_1 )
            {
             before(grammarAccess.getMoveDownAccess().getDistanceAssignment_1()); 
            // InternalBoundingBox.g:603:2: ( rule__MoveDown__DistanceAssignment_1 )
            // InternalBoundingBox.g:603:3: rule__MoveDown__DistanceAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__MoveDown__DistanceAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMoveDownAccess().getDistanceAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoveDown__Group__1__Impl"


    // $ANTLR start "rule__World__MoveCommandsAssignment_2"
    // InternalBoundingBox.g:612:1: rule__World__MoveCommandsAssignment_2 : ( ruleMove ) ;
    public final void rule__World__MoveCommandsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoundingBox.g:616:1: ( ( ruleMove ) )
            // InternalBoundingBox.g:617:2: ( ruleMove )
            {
            // InternalBoundingBox.g:617:2: ( ruleMove )
            // InternalBoundingBox.g:618:3: ruleMove
            {
             before(grammarAccess.getWorldAccess().getMoveCommandsMoveParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleMove();

            state._fsp--;

             after(grammarAccess.getWorldAccess().getMoveCommandsMoveParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__World__MoveCommandsAssignment_2"


    // $ANTLR start "rule__MoveLeft__DistanceAssignment_1"
    // InternalBoundingBox.g:627:1: rule__MoveLeft__DistanceAssignment_1 : ( RULE_INT ) ;
    public final void rule__MoveLeft__DistanceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoundingBox.g:631:1: ( ( RULE_INT ) )
            // InternalBoundingBox.g:632:2: ( RULE_INT )
            {
            // InternalBoundingBox.g:632:2: ( RULE_INT )
            // InternalBoundingBox.g:633:3: RULE_INT
            {
             before(grammarAccess.getMoveLeftAccess().getDistanceINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getMoveLeftAccess().getDistanceINTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoveLeft__DistanceAssignment_1"


    // $ANTLR start "rule__MoveRight__DistanceAssignment_1"
    // InternalBoundingBox.g:642:1: rule__MoveRight__DistanceAssignment_1 : ( RULE_INT ) ;
    public final void rule__MoveRight__DistanceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoundingBox.g:646:1: ( ( RULE_INT ) )
            // InternalBoundingBox.g:647:2: ( RULE_INT )
            {
            // InternalBoundingBox.g:647:2: ( RULE_INT )
            // InternalBoundingBox.g:648:3: RULE_INT
            {
             before(grammarAccess.getMoveRightAccess().getDistanceINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getMoveRightAccess().getDistanceINTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoveRight__DistanceAssignment_1"


    // $ANTLR start "rule__MoveUp__DistanceAssignment_1"
    // InternalBoundingBox.g:657:1: rule__MoveUp__DistanceAssignment_1 : ( RULE_INT ) ;
    public final void rule__MoveUp__DistanceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoundingBox.g:661:1: ( ( RULE_INT ) )
            // InternalBoundingBox.g:662:2: ( RULE_INT )
            {
            // InternalBoundingBox.g:662:2: ( RULE_INT )
            // InternalBoundingBox.g:663:3: RULE_INT
            {
             before(grammarAccess.getMoveUpAccess().getDistanceINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getMoveUpAccess().getDistanceINTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoveUp__DistanceAssignment_1"


    // $ANTLR start "rule__MoveDown__DistanceAssignment_1"
    // InternalBoundingBox.g:672:1: rule__MoveDown__DistanceAssignment_1 : ( RULE_INT ) ;
    public final void rule__MoveDown__DistanceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoundingBox.g:676:1: ( ( RULE_INT ) )
            // InternalBoundingBox.g:677:2: ( RULE_INT )
            {
            // InternalBoundingBox.g:677:2: ( RULE_INT )
            // InternalBoundingBox.g:678:3: RULE_INT
            {
             before(grammarAccess.getMoveDownAccess().getDistanceINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getMoveDownAccess().getDistanceINTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoveDown__DistanceAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000000000F000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000000F002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});

}