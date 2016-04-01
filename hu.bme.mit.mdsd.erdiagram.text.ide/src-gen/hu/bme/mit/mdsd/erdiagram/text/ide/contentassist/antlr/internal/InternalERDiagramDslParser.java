package hu.bme.mit.mdsd.erdiagram.text.ide.contentassist.antlr.internal;

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
import hu.bme.mit.mdsd.erdiagram.text.services.ERDiagramDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalERDiagramDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'int'", "'double'", "'string'", "'boolean'", "'datetime'", "'one'", "'many'", "'entity'", "'isA'", "'{'", "'}'", "','", "':'", "'is related with'", "'key'", "'nullable'"
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
    public static final int T__26=26;
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


        public InternalERDiagramDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalERDiagramDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalERDiagramDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalERDiagramDsl.g"; }


    	private ERDiagramDslGrammarAccess grammarAccess;

    	public void setGrammarAccess(ERDiagramDslGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleERDiagram"
    // InternalERDiagramDsl.g:53:1: entryRuleERDiagram : ruleERDiagram EOF ;
    public final void entryRuleERDiagram() throws RecognitionException {
        try {
            // InternalERDiagramDsl.g:54:1: ( ruleERDiagram EOF )
            // InternalERDiagramDsl.g:55:1: ruleERDiagram EOF
            {
             before(grammarAccess.getERDiagramRule()); 
            pushFollow(FOLLOW_1);
            ruleERDiagram();

            state._fsp--;

             after(grammarAccess.getERDiagramRule()); 
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
    // $ANTLR end "entryRuleERDiagram"


    // $ANTLR start "ruleERDiagram"
    // InternalERDiagramDsl.g:62:1: ruleERDiagram : ( ( rule__ERDiagram__Group__0 ) ) ;
    public final void ruleERDiagram() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalERDiagramDsl.g:66:2: ( ( ( rule__ERDiagram__Group__0 ) ) )
            // InternalERDiagramDsl.g:67:2: ( ( rule__ERDiagram__Group__0 ) )
            {
            // InternalERDiagramDsl.g:67:2: ( ( rule__ERDiagram__Group__0 ) )
            // InternalERDiagramDsl.g:68:3: ( rule__ERDiagram__Group__0 )
            {
             before(grammarAccess.getERDiagramAccess().getGroup()); 
            // InternalERDiagramDsl.g:69:3: ( rule__ERDiagram__Group__0 )
            // InternalERDiagramDsl.g:69:4: rule__ERDiagram__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ERDiagram__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getERDiagramAccess().getGroup()); 

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
    // $ANTLR end "ruleERDiagram"


    // $ANTLR start "entryRuleEntity"
    // InternalERDiagramDsl.g:78:1: entryRuleEntity : ruleEntity EOF ;
    public final void entryRuleEntity() throws RecognitionException {
        try {
            // InternalERDiagramDsl.g:79:1: ( ruleEntity EOF )
            // InternalERDiagramDsl.g:80:1: ruleEntity EOF
            {
             before(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_1);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getEntityRule()); 
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
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // InternalERDiagramDsl.g:87:1: ruleEntity : ( ( rule__Entity__Group__0 ) ) ;
    public final void ruleEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalERDiagramDsl.g:91:2: ( ( ( rule__Entity__Group__0 ) ) )
            // InternalERDiagramDsl.g:92:2: ( ( rule__Entity__Group__0 ) )
            {
            // InternalERDiagramDsl.g:92:2: ( ( rule__Entity__Group__0 ) )
            // InternalERDiagramDsl.g:93:3: ( rule__Entity__Group__0 )
            {
             before(grammarAccess.getEntityAccess().getGroup()); 
            // InternalERDiagramDsl.g:94:3: ( rule__Entity__Group__0 )
            // InternalERDiagramDsl.g:94:4: rule__Entity__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getGroup()); 

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
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleAttribute"
    // InternalERDiagramDsl.g:103:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // InternalERDiagramDsl.g:104:1: ( ruleAttribute EOF )
            // InternalERDiagramDsl.g:105:1: ruleAttribute EOF
            {
             before(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_1);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getAttributeRule()); 
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
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalERDiagramDsl.g:112:1: ruleAttribute : ( ( rule__Attribute__Group__0 ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalERDiagramDsl.g:116:2: ( ( ( rule__Attribute__Group__0 ) ) )
            // InternalERDiagramDsl.g:117:2: ( ( rule__Attribute__Group__0 ) )
            {
            // InternalERDiagramDsl.g:117:2: ( ( rule__Attribute__Group__0 ) )
            // InternalERDiagramDsl.g:118:3: ( rule__Attribute__Group__0 )
            {
             before(grammarAccess.getAttributeAccess().getGroup()); 
            // InternalERDiagramDsl.g:119:3: ( rule__Attribute__Group__0 )
            // InternalERDiagramDsl.g:119:4: rule__Attribute__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getGroup()); 

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
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleRelation"
    // InternalERDiagramDsl.g:128:1: entryRuleRelation : ruleRelation EOF ;
    public final void entryRuleRelation() throws RecognitionException {
        try {
            // InternalERDiagramDsl.g:129:1: ( ruleRelation EOF )
            // InternalERDiagramDsl.g:130:1: ruleRelation EOF
            {
             before(grammarAccess.getRelationRule()); 
            pushFollow(FOLLOW_1);
            ruleRelation();

            state._fsp--;

             after(grammarAccess.getRelationRule()); 
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
    // $ANTLR end "entryRuleRelation"


    // $ANTLR start "ruleRelation"
    // InternalERDiagramDsl.g:137:1: ruleRelation : ( ( rule__Relation__Group__0 ) ) ;
    public final void ruleRelation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalERDiagramDsl.g:141:2: ( ( ( rule__Relation__Group__0 ) ) )
            // InternalERDiagramDsl.g:142:2: ( ( rule__Relation__Group__0 ) )
            {
            // InternalERDiagramDsl.g:142:2: ( ( rule__Relation__Group__0 ) )
            // InternalERDiagramDsl.g:143:3: ( rule__Relation__Group__0 )
            {
             before(grammarAccess.getRelationAccess().getGroup()); 
            // InternalERDiagramDsl.g:144:3: ( rule__Relation__Group__0 )
            // InternalERDiagramDsl.g:144:4: rule__Relation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Relation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRelationAccess().getGroup()); 

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
    // $ANTLR end "ruleRelation"


    // $ANTLR start "entryRuleRelationEnding"
    // InternalERDiagramDsl.g:153:1: entryRuleRelationEnding : ruleRelationEnding EOF ;
    public final void entryRuleRelationEnding() throws RecognitionException {
        try {
            // InternalERDiagramDsl.g:154:1: ( ruleRelationEnding EOF )
            // InternalERDiagramDsl.g:155:1: ruleRelationEnding EOF
            {
             before(grammarAccess.getRelationEndingRule()); 
            pushFollow(FOLLOW_1);
            ruleRelationEnding();

            state._fsp--;

             after(grammarAccess.getRelationEndingRule()); 
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
    // $ANTLR end "entryRuleRelationEnding"


    // $ANTLR start "ruleRelationEnding"
    // InternalERDiagramDsl.g:162:1: ruleRelationEnding : ( ( rule__RelationEnding__Group__0 ) ) ;
    public final void ruleRelationEnding() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalERDiagramDsl.g:166:2: ( ( ( rule__RelationEnding__Group__0 ) ) )
            // InternalERDiagramDsl.g:167:2: ( ( rule__RelationEnding__Group__0 ) )
            {
            // InternalERDiagramDsl.g:167:2: ( ( rule__RelationEnding__Group__0 ) )
            // InternalERDiagramDsl.g:168:3: ( rule__RelationEnding__Group__0 )
            {
             before(grammarAccess.getRelationEndingAccess().getGroup()); 
            // InternalERDiagramDsl.g:169:3: ( rule__RelationEnding__Group__0 )
            // InternalERDiagramDsl.g:169:4: rule__RelationEnding__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RelationEnding__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRelationEndingAccess().getGroup()); 

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
    // $ANTLR end "ruleRelationEnding"


    // $ANTLR start "ruleAttributeType"
    // InternalERDiagramDsl.g:178:1: ruleAttributeType : ( ( rule__AttributeType__Alternatives ) ) ;
    public final void ruleAttributeType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalERDiagramDsl.g:182:1: ( ( ( rule__AttributeType__Alternatives ) ) )
            // InternalERDiagramDsl.g:183:2: ( ( rule__AttributeType__Alternatives ) )
            {
            // InternalERDiagramDsl.g:183:2: ( ( rule__AttributeType__Alternatives ) )
            // InternalERDiagramDsl.g:184:3: ( rule__AttributeType__Alternatives )
            {
             before(grammarAccess.getAttributeTypeAccess().getAlternatives()); 
            // InternalERDiagramDsl.g:185:3: ( rule__AttributeType__Alternatives )
            // InternalERDiagramDsl.g:185:4: rule__AttributeType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AttributeType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAttributeTypeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleAttributeType"


    // $ANTLR start "ruleMultiplicityType"
    // InternalERDiagramDsl.g:194:1: ruleMultiplicityType : ( ( rule__MultiplicityType__Alternatives ) ) ;
    public final void ruleMultiplicityType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalERDiagramDsl.g:198:1: ( ( ( rule__MultiplicityType__Alternatives ) ) )
            // InternalERDiagramDsl.g:199:2: ( ( rule__MultiplicityType__Alternatives ) )
            {
            // InternalERDiagramDsl.g:199:2: ( ( rule__MultiplicityType__Alternatives ) )
            // InternalERDiagramDsl.g:200:3: ( rule__MultiplicityType__Alternatives )
            {
             before(grammarAccess.getMultiplicityTypeAccess().getAlternatives()); 
            // InternalERDiagramDsl.g:201:3: ( rule__MultiplicityType__Alternatives )
            // InternalERDiagramDsl.g:201:4: rule__MultiplicityType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__MultiplicityType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicityTypeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleMultiplicityType"


    // $ANTLR start "rule__AttributeType__Alternatives"
    // InternalERDiagramDsl.g:209:1: rule__AttributeType__Alternatives : ( ( ( 'int' ) ) | ( ( 'double' ) ) | ( ( 'string' ) ) | ( ( 'boolean' ) ) | ( ( 'datetime' ) ) );
    public final void rule__AttributeType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalERDiagramDsl.g:213:1: ( ( ( 'int' ) ) | ( ( 'double' ) ) | ( ( 'string' ) ) | ( ( 'boolean' ) ) | ( ( 'datetime' ) ) )
            int alt1=5;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt1=1;
                }
                break;
            case 12:
                {
                alt1=2;
                }
                break;
            case 13:
                {
                alt1=3;
                }
                break;
            case 14:
                {
                alt1=4;
                }
                break;
            case 15:
                {
                alt1=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalERDiagramDsl.g:214:2: ( ( 'int' ) )
                    {
                    // InternalERDiagramDsl.g:214:2: ( ( 'int' ) )
                    // InternalERDiagramDsl.g:215:3: ( 'int' )
                    {
                     before(grammarAccess.getAttributeTypeAccess().getINTEnumLiteralDeclaration_0()); 
                    // InternalERDiagramDsl.g:216:3: ( 'int' )
                    // InternalERDiagramDsl.g:216:4: 'int'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getAttributeTypeAccess().getINTEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalERDiagramDsl.g:220:2: ( ( 'double' ) )
                    {
                    // InternalERDiagramDsl.g:220:2: ( ( 'double' ) )
                    // InternalERDiagramDsl.g:221:3: ( 'double' )
                    {
                     before(grammarAccess.getAttributeTypeAccess().getDOUBLEEnumLiteralDeclaration_1()); 
                    // InternalERDiagramDsl.g:222:3: ( 'double' )
                    // InternalERDiagramDsl.g:222:4: 'double'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getAttributeTypeAccess().getDOUBLEEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalERDiagramDsl.g:226:2: ( ( 'string' ) )
                    {
                    // InternalERDiagramDsl.g:226:2: ( ( 'string' ) )
                    // InternalERDiagramDsl.g:227:3: ( 'string' )
                    {
                     before(grammarAccess.getAttributeTypeAccess().getSTRINGEnumLiteralDeclaration_2()); 
                    // InternalERDiagramDsl.g:228:3: ( 'string' )
                    // InternalERDiagramDsl.g:228:4: 'string'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getAttributeTypeAccess().getSTRINGEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalERDiagramDsl.g:232:2: ( ( 'boolean' ) )
                    {
                    // InternalERDiagramDsl.g:232:2: ( ( 'boolean' ) )
                    // InternalERDiagramDsl.g:233:3: ( 'boolean' )
                    {
                     before(grammarAccess.getAttributeTypeAccess().getBOOLEANEnumLiteralDeclaration_3()); 
                    // InternalERDiagramDsl.g:234:3: ( 'boolean' )
                    // InternalERDiagramDsl.g:234:4: 'boolean'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getAttributeTypeAccess().getBOOLEANEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalERDiagramDsl.g:238:2: ( ( 'datetime' ) )
                    {
                    // InternalERDiagramDsl.g:238:2: ( ( 'datetime' ) )
                    // InternalERDiagramDsl.g:239:3: ( 'datetime' )
                    {
                     before(grammarAccess.getAttributeTypeAccess().getDATETIMEEnumLiteralDeclaration_4()); 
                    // InternalERDiagramDsl.g:240:3: ( 'datetime' )
                    // InternalERDiagramDsl.g:240:4: 'datetime'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getAttributeTypeAccess().getDATETIMEEnumLiteralDeclaration_4()); 

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
    // $ANTLR end "rule__AttributeType__Alternatives"


    // $ANTLR start "rule__MultiplicityType__Alternatives"
    // InternalERDiagramDsl.g:248:1: rule__MultiplicityType__Alternatives : ( ( ( 'one' ) ) | ( ( 'many' ) ) );
    public final void rule__MultiplicityType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalERDiagramDsl.g:252:1: ( ( ( 'one' ) ) | ( ( 'many' ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==16) ) {
                alt2=1;
            }
            else if ( (LA2_0==17) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalERDiagramDsl.g:253:2: ( ( 'one' ) )
                    {
                    // InternalERDiagramDsl.g:253:2: ( ( 'one' ) )
                    // InternalERDiagramDsl.g:254:3: ( 'one' )
                    {
                     before(grammarAccess.getMultiplicityTypeAccess().getOneEnumLiteralDeclaration_0()); 
                    // InternalERDiagramDsl.g:255:3: ( 'one' )
                    // InternalERDiagramDsl.g:255:4: 'one'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getMultiplicityTypeAccess().getOneEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalERDiagramDsl.g:259:2: ( ( 'many' ) )
                    {
                    // InternalERDiagramDsl.g:259:2: ( ( 'many' ) )
                    // InternalERDiagramDsl.g:260:3: ( 'many' )
                    {
                     before(grammarAccess.getMultiplicityTypeAccess().getManyEnumLiteralDeclaration_1()); 
                    // InternalERDiagramDsl.g:261:3: ( 'many' )
                    // InternalERDiagramDsl.g:261:4: 'many'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getMultiplicityTypeAccess().getManyEnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__MultiplicityType__Alternatives"


    // $ANTLR start "rule__ERDiagram__Group__0"
    // InternalERDiagramDsl.g:269:1: rule__ERDiagram__Group__0 : rule__ERDiagram__Group__0__Impl rule__ERDiagram__Group__1 ;
    public final void rule__ERDiagram__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalERDiagramDsl.g:273:1: ( rule__ERDiagram__Group__0__Impl rule__ERDiagram__Group__1 )
            // InternalERDiagramDsl.g:274:2: rule__ERDiagram__Group__0__Impl rule__ERDiagram__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__ERDiagram__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ERDiagram__Group__1();

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
    // $ANTLR end "rule__ERDiagram__Group__0"


    // $ANTLR start "rule__ERDiagram__Group__0__Impl"
    // InternalERDiagramDsl.g:281:1: rule__ERDiagram__Group__0__Impl : ( ( rule__ERDiagram__EntitiesAssignment_0 )* ) ;
    public final void rule__ERDiagram__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalERDiagramDsl.g:285:1: ( ( ( rule__ERDiagram__EntitiesAssignment_0 )* ) )
            // InternalERDiagramDsl.g:286:1: ( ( rule__ERDiagram__EntitiesAssignment_0 )* )
            {
            // InternalERDiagramDsl.g:286:1: ( ( rule__ERDiagram__EntitiesAssignment_0 )* )
            // InternalERDiagramDsl.g:287:2: ( rule__ERDiagram__EntitiesAssignment_0 )*
            {
             before(grammarAccess.getERDiagramAccess().getEntitiesAssignment_0()); 
            // InternalERDiagramDsl.g:288:2: ( rule__ERDiagram__EntitiesAssignment_0 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==18) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalERDiagramDsl.g:288:3: rule__ERDiagram__EntitiesAssignment_0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__ERDiagram__EntitiesAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getERDiagramAccess().getEntitiesAssignment_0()); 

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
    // $ANTLR end "rule__ERDiagram__Group__0__Impl"


    // $ANTLR start "rule__ERDiagram__Group__1"
    // InternalERDiagramDsl.g:296:1: rule__ERDiagram__Group__1 : rule__ERDiagram__Group__1__Impl ;
    public final void rule__ERDiagram__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalERDiagramDsl.g:300:1: ( rule__ERDiagram__Group__1__Impl )
            // InternalERDiagramDsl.g:301:2: rule__ERDiagram__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ERDiagram__Group__1__Impl();

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
    // $ANTLR end "rule__ERDiagram__Group__1"


    // $ANTLR start "rule__ERDiagram__Group__1__Impl"
    // InternalERDiagramDsl.g:307:1: rule__ERDiagram__Group__1__Impl : ( ( rule__ERDiagram__RelationAssignment_1 )* ) ;
    public final void rule__ERDiagram__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalERDiagramDsl.g:311:1: ( ( ( rule__ERDiagram__RelationAssignment_1 )* ) )
            // InternalERDiagramDsl.g:312:1: ( ( rule__ERDiagram__RelationAssignment_1 )* )
            {
            // InternalERDiagramDsl.g:312:1: ( ( rule__ERDiagram__RelationAssignment_1 )* )
            // InternalERDiagramDsl.g:313:2: ( rule__ERDiagram__RelationAssignment_1 )*
            {
             before(grammarAccess.getERDiagramAccess().getRelationAssignment_1()); 
            // InternalERDiagramDsl.g:314:2: ( rule__ERDiagram__RelationAssignment_1 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=16 && LA4_0<=17)||LA4_0==26) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalERDiagramDsl.g:314:3: rule__ERDiagram__RelationAssignment_1
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__ERDiagram__RelationAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getERDiagramAccess().getRelationAssignment_1()); 

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
    // $ANTLR end "rule__ERDiagram__Group__1__Impl"


    // $ANTLR start "rule__Entity__Group__0"
    // InternalERDiagramDsl.g:323:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalERDiagramDsl.g:327:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // InternalERDiagramDsl.g:328:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Entity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__1();

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
    // $ANTLR end "rule__Entity__Group__0"


    // $ANTLR start "rule__Entity__Group__0__Impl"
    // InternalERDiagramDsl.g:335:1: rule__Entity__Group__0__Impl : ( 'entity' ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalERDiagramDsl.g:339:1: ( ( 'entity' ) )
            // InternalERDiagramDsl.g:340:1: ( 'entity' )
            {
            // InternalERDiagramDsl.g:340:1: ( 'entity' )
            // InternalERDiagramDsl.g:341:2: 'entity'
            {
             before(grammarAccess.getEntityAccess().getEntityKeyword_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getEntityKeyword_0()); 

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
    // $ANTLR end "rule__Entity__Group__0__Impl"


    // $ANTLR start "rule__Entity__Group__1"
    // InternalERDiagramDsl.g:350:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalERDiagramDsl.g:354:1: ( rule__Entity__Group__1__Impl rule__Entity__Group__2 )
            // InternalERDiagramDsl.g:355:2: rule__Entity__Group__1__Impl rule__Entity__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Entity__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__2();

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
    // $ANTLR end "rule__Entity__Group__1"


    // $ANTLR start "rule__Entity__Group__1__Impl"
    // InternalERDiagramDsl.g:362:1: rule__Entity__Group__1__Impl : ( ( rule__Entity__NameAssignment_1 ) ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalERDiagramDsl.g:366:1: ( ( ( rule__Entity__NameAssignment_1 ) ) )
            // InternalERDiagramDsl.g:367:1: ( ( rule__Entity__NameAssignment_1 ) )
            {
            // InternalERDiagramDsl.g:367:1: ( ( rule__Entity__NameAssignment_1 ) )
            // InternalERDiagramDsl.g:368:2: ( rule__Entity__NameAssignment_1 )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment_1()); 
            // InternalERDiagramDsl.g:369:2: ( rule__Entity__NameAssignment_1 )
            // InternalERDiagramDsl.g:369:3: rule__Entity__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Entity__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Entity__Group__1__Impl"


    // $ANTLR start "rule__Entity__Group__2"
    // InternalERDiagramDsl.g:377:1: rule__Entity__Group__2 : rule__Entity__Group__2__Impl rule__Entity__Group__3 ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalERDiagramDsl.g:381:1: ( rule__Entity__Group__2__Impl rule__Entity__Group__3 )
            // InternalERDiagramDsl.g:382:2: rule__Entity__Group__2__Impl rule__Entity__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__Entity__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__3();

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
    // $ANTLR end "rule__Entity__Group__2"


    // $ANTLR start "rule__Entity__Group__2__Impl"
    // InternalERDiagramDsl.g:389:1: rule__Entity__Group__2__Impl : ( ( rule__Entity__Group_2__0 )* ) ;
    public final void rule__Entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalERDiagramDsl.g:393:1: ( ( ( rule__Entity__Group_2__0 )* ) )
            // InternalERDiagramDsl.g:394:1: ( ( rule__Entity__Group_2__0 )* )
            {
            // InternalERDiagramDsl.g:394:1: ( ( rule__Entity__Group_2__0 )* )
            // InternalERDiagramDsl.g:395:2: ( rule__Entity__Group_2__0 )*
            {
             before(grammarAccess.getEntityAccess().getGroup_2()); 
            // InternalERDiagramDsl.g:396:2: ( rule__Entity__Group_2__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==19) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalERDiagramDsl.g:396:3: rule__Entity__Group_2__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Entity__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getEntityAccess().getGroup_2()); 

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
    // $ANTLR end "rule__Entity__Group__2__Impl"


    // $ANTLR start "rule__Entity__Group__3"
    // InternalERDiagramDsl.g:404:1: rule__Entity__Group__3 : rule__Entity__Group__3__Impl ;
    public final void rule__Entity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalERDiagramDsl.g:408:1: ( rule__Entity__Group__3__Impl )
            // InternalERDiagramDsl.g:409:2: rule__Entity__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group__3__Impl();

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
    // $ANTLR end "rule__Entity__Group__3"


    // $ANTLR start "rule__Entity__Group__3__Impl"
    // InternalERDiagramDsl.g:415:1: rule__Entity__Group__3__Impl : ( ( rule__Entity__Group_3__0 )? ) ;
    public final void rule__Entity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalERDiagramDsl.g:419:1: ( ( ( rule__Entity__Group_3__0 )? ) )
            // InternalERDiagramDsl.g:420:1: ( ( rule__Entity__Group_3__0 )? )
            {
            // InternalERDiagramDsl.g:420:1: ( ( rule__Entity__Group_3__0 )? )
            // InternalERDiagramDsl.g:421:2: ( rule__Entity__Group_3__0 )?
            {
             before(grammarAccess.getEntityAccess().getGroup_3()); 
            // InternalERDiagramDsl.g:422:2: ( rule__Entity__Group_3__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==20) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalERDiagramDsl.g:422:3: rule__Entity__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Entity__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEntityAccess().getGroup_3()); 

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
    // $ANTLR end "rule__Entity__Group__3__Impl"


    // $ANTLR start "rule__Entity__Group_2__0"
    // InternalERDiagramDsl.g:431:1: rule__Entity__Group_2__0 : rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1 ;
    public final void rule__Entity__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalERDiagramDsl.g:435:1: ( rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1 )
            // InternalERDiagramDsl.g:436:2: rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1
            {
            pushFollow(FOLLOW_6);
            rule__Entity__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group_2__1();

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
    // $ANTLR end "rule__Entity__Group_2__0"


    // $ANTLR start "rule__Entity__Group_2__0__Impl"
    // InternalERDiagramDsl.g:443:1: rule__Entity__Group_2__0__Impl : ( 'isA' ) ;
    public final void rule__Entity__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalERDiagramDsl.g:447:1: ( ( 'isA' ) )
            // InternalERDiagramDsl.g:448:1: ( 'isA' )
            {
            // InternalERDiagramDsl.g:448:1: ( 'isA' )
            // InternalERDiagramDsl.g:449:2: 'isA'
            {
             before(grammarAccess.getEntityAccess().getIsAKeyword_2_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getIsAKeyword_2_0()); 

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
    // $ANTLR end "rule__Entity__Group_2__0__Impl"


    // $ANTLR start "rule__Entity__Group_2__1"
    // InternalERDiagramDsl.g:458:1: rule__Entity__Group_2__1 : rule__Entity__Group_2__1__Impl ;
    public final void rule__Entity__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalERDiagramDsl.g:462:1: ( rule__Entity__Group_2__1__Impl )
            // InternalERDiagramDsl.g:463:2: rule__Entity__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group_2__1__Impl();

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
    // $ANTLR end "rule__Entity__Group_2__1"


    // $ANTLR start "rule__Entity__Group_2__1__Impl"
    // InternalERDiagramDsl.g:469:1: rule__Entity__Group_2__1__Impl : ( ( rule__Entity__IsAAssignment_2_1 ) ) ;
    public final void rule__Entity__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalERDiagramDsl.g:473:1: ( ( ( rule__Entity__IsAAssignment_2_1 ) ) )
            // InternalERDiagramDsl.g:474:1: ( ( rule__Entity__IsAAssignment_2_1 ) )
            {
            // InternalERDiagramDsl.g:474:1: ( ( rule__Entity__IsAAssignment_2_1 ) )
            // InternalERDiagramDsl.g:475:2: ( rule__Entity__IsAAssignment_2_1 )
            {
             before(grammarAccess.getEntityAccess().getIsAAssignment_2_1()); 
            // InternalERDiagramDsl.g:476:2: ( rule__Entity__IsAAssignment_2_1 )
            // InternalERDiagramDsl.g:476:3: rule__Entity__IsAAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Entity__IsAAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getIsAAssignment_2_1()); 

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
    // $ANTLR end "rule__Entity__Group_2__1__Impl"


    // $ANTLR start "rule__Entity__Group_3__0"
    // InternalERDiagramDsl.g:485:1: rule__Entity__Group_3__0 : rule__Entity__Group_3__0__Impl rule__Entity__Group_3__1 ;
    public final void rule__Entity__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalERDiagramDsl.g:489:1: ( rule__Entity__Group_3__0__Impl rule__Entity__Group_3__1 )
            // InternalERDiagramDsl.g:490:2: rule__Entity__Group_3__0__Impl rule__Entity__Group_3__1
            {
            pushFollow(FOLLOW_6);
            rule__Entity__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group_3__1();

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
    // $ANTLR end "rule__Entity__Group_3__0"


    // $ANTLR start "rule__Entity__Group_3__0__Impl"
    // InternalERDiagramDsl.g:497:1: rule__Entity__Group_3__0__Impl : ( '{' ) ;
    public final void rule__Entity__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalERDiagramDsl.g:501:1: ( ( '{' ) )
            // InternalERDiagramDsl.g:502:1: ( '{' )
            {
            // InternalERDiagramDsl.g:502:1: ( '{' )
            // InternalERDiagramDsl.g:503:2: '{'
            {
             before(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3_0()); 

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
    // $ANTLR end "rule__Entity__Group_3__0__Impl"


    // $ANTLR start "rule__Entity__Group_3__1"
    // InternalERDiagramDsl.g:512:1: rule__Entity__Group_3__1 : rule__Entity__Group_3__1__Impl rule__Entity__Group_3__2 ;
    public final void rule__Entity__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalERDiagramDsl.g:516:1: ( rule__Entity__Group_3__1__Impl rule__Entity__Group_3__2 )
            // InternalERDiagramDsl.g:517:2: rule__Entity__Group_3__1__Impl rule__Entity__Group_3__2
            {
            pushFollow(FOLLOW_9);
            rule__Entity__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group_3__2();

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
    // $ANTLR end "rule__Entity__Group_3__1"


    // $ANTLR start "rule__Entity__Group_3__1__Impl"
    // InternalERDiagramDsl.g:524:1: rule__Entity__Group_3__1__Impl : ( ( rule__Entity__AttributesAssignment_3_1 ) ) ;
    public final void rule__Entity__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalERDiagramDsl.g:528:1: ( ( ( rule__Entity__AttributesAssignment_3_1 ) ) )
            // InternalERDiagramDsl.g:529:1: ( ( rule__Entity__AttributesAssignment_3_1 ) )
            {
            // InternalERDiagramDsl.g:529:1: ( ( rule__Entity__AttributesAssignment_3_1 ) )
            // InternalERDiagramDsl.g:530:2: ( rule__Entity__AttributesAssignment_3_1 )
            {
             before(grammarAccess.getEntityAccess().getAttributesAssignment_3_1()); 
            // InternalERDiagramDsl.g:531:2: ( rule__Entity__AttributesAssignment_3_1 )
            // InternalERDiagramDsl.g:531:3: rule__Entity__AttributesAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Entity__AttributesAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getAttributesAssignment_3_1()); 

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
    // $ANTLR end "rule__Entity__Group_3__1__Impl"


    // $ANTLR start "rule__Entity__Group_3__2"
    // InternalERDiagramDsl.g:539:1: rule__Entity__Group_3__2 : rule__Entity__Group_3__2__Impl rule__Entity__Group_3__3 ;
    public final void rule__Entity__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalERDiagramDsl.g:543:1: ( rule__Entity__Group_3__2__Impl rule__Entity__Group_3__3 )
            // InternalERDiagramDsl.g:544:2: rule__Entity__Group_3__2__Impl rule__Entity__Group_3__3
            {
            pushFollow(FOLLOW_9);
            rule__Entity__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group_3__3();

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
    // $ANTLR end "rule__Entity__Group_3__2"


    // $ANTLR start "rule__Entity__Group_3__2__Impl"
    // InternalERDiagramDsl.g:551:1: rule__Entity__Group_3__2__Impl : ( ( rule__Entity__Group_3_2__0 )* ) ;
    public final void rule__Entity__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalERDiagramDsl.g:555:1: ( ( ( rule__Entity__Group_3_2__0 )* ) )
            // InternalERDiagramDsl.g:556:1: ( ( rule__Entity__Group_3_2__0 )* )
            {
            // InternalERDiagramDsl.g:556:1: ( ( rule__Entity__Group_3_2__0 )* )
            // InternalERDiagramDsl.g:557:2: ( rule__Entity__Group_3_2__0 )*
            {
             before(grammarAccess.getEntityAccess().getGroup_3_2()); 
            // InternalERDiagramDsl.g:558:2: ( rule__Entity__Group_3_2__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==22) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalERDiagramDsl.g:558:3: rule__Entity__Group_3_2__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Entity__Group_3_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getEntityAccess().getGroup_3_2()); 

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
    // $ANTLR end "rule__Entity__Group_3__2__Impl"


    // $ANTLR start "rule__Entity__Group_3__3"
    // InternalERDiagramDsl.g:566:1: rule__Entity__Group_3__3 : rule__Entity__Group_3__3__Impl ;
    public final void rule__Entity__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalERDiagramDsl.g:570:1: ( rule__Entity__Group_3__3__Impl )
            // InternalERDiagramDsl.g:571:2: rule__Entity__Group_3__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group_3__3__Impl();

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
    // $ANTLR end "rule__Entity__Group_3__3"


    // $ANTLR start "rule__Entity__Group_3__3__Impl"
    // InternalERDiagramDsl.g:577:1: rule__Entity__Group_3__3__Impl : ( '}' ) ;
    public final void rule__Entity__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalERDiagramDsl.g:581:1: ( ( '}' ) )
            // InternalERDiagramDsl.g:582:1: ( '}' )
            {
            // InternalERDiagramDsl.g:582:1: ( '}' )
            // InternalERDiagramDsl.g:583:2: '}'
            {
             before(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_3_3()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_3_3()); 

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
    // $ANTLR end "rule__Entity__Group_3__3__Impl"


    // $ANTLR start "rule__Entity__Group_3_2__0"
    // InternalERDiagramDsl.g:593:1: rule__Entity__Group_3_2__0 : rule__Entity__Group_3_2__0__Impl rule__Entity__Group_3_2__1 ;
    public final void rule__Entity__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalERDiagramDsl.g:597:1: ( rule__Entity__Group_3_2__0__Impl rule__Entity__Group_3_2__1 )
            // InternalERDiagramDsl.g:598:2: rule__Entity__Group_3_2__0__Impl rule__Entity__Group_3_2__1
            {
            pushFollow(FOLLOW_6);
            rule__Entity__Group_3_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group_3_2__1();

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
    // $ANTLR end "rule__Entity__Group_3_2__0"


    // $ANTLR start "rule__Entity__Group_3_2__0__Impl"
    // InternalERDiagramDsl.g:605:1: rule__Entity__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__Entity__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalERDiagramDsl.g:609:1: ( ( ',' ) )
            // InternalERDiagramDsl.g:610:1: ( ',' )
            {
            // InternalERDiagramDsl.g:610:1: ( ',' )
            // InternalERDiagramDsl.g:611:2: ','
            {
             before(grammarAccess.getEntityAccess().getCommaKeyword_3_2_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getCommaKeyword_3_2_0()); 

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
    // $ANTLR end "rule__Entity__Group_3_2__0__Impl"


    // $ANTLR start "rule__Entity__Group_3_2__1"
    // InternalERDiagramDsl.g:620:1: rule__Entity__Group_3_2__1 : rule__Entity__Group_3_2__1__Impl ;
    public final void rule__Entity__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalERDiagramDsl.g:624:1: ( rule__Entity__Group_3_2__1__Impl )
            // InternalERDiagramDsl.g:625:2: rule__Entity__Group_3_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group_3_2__1__Impl();

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
    // $ANTLR end "rule__Entity__Group_3_2__1"


    // $ANTLR start "rule__Entity__Group_3_2__1__Impl"
    // InternalERDiagramDsl.g:631:1: rule__Entity__Group_3_2__1__Impl : ( ( rule__Entity__AttributesAssignment_3_2_1 ) ) ;
    public final void rule__Entity__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalERDiagramDsl.g:635:1: ( ( ( rule__Entity__AttributesAssignment_3_2_1 ) ) )
            // InternalERDiagramDsl.g:636:1: ( ( rule__Entity__AttributesAssignment_3_2_1 ) )
            {
            // InternalERDiagramDsl.g:636:1: ( ( rule__Entity__AttributesAssignment_3_2_1 ) )
            // InternalERDiagramDsl.g:637:2: ( rule__Entity__AttributesAssignment_3_2_1 )
            {
             before(grammarAccess.getEntityAccess().getAttributesAssignment_3_2_1()); 
            // InternalERDiagramDsl.g:638:2: ( rule__Entity__AttributesAssignment_3_2_1 )
            // InternalERDiagramDsl.g:638:3: rule__Entity__AttributesAssignment_3_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Entity__AttributesAssignment_3_2_1();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getAttributesAssignment_3_2_1()); 

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
    // $ANTLR end "rule__Entity__Group_3_2__1__Impl"


    // $ANTLR start "rule__Attribute__Group__0"
    // InternalERDiagramDsl.g:647:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalERDiagramDsl.g:651:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // InternalERDiagramDsl.g:652:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__Attribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__1();

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
    // $ANTLR end "rule__Attribute__Group__0"


    // $ANTLR start "rule__Attribute__Group__0__Impl"
    // InternalERDiagramDsl.g:659:1: rule__Attribute__Group__0__Impl : ( ( rule__Attribute__NameAssignment_0 ) ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalERDiagramDsl.g:663:1: ( ( ( rule__Attribute__NameAssignment_0 ) ) )
            // InternalERDiagramDsl.g:664:1: ( ( rule__Attribute__NameAssignment_0 ) )
            {
            // InternalERDiagramDsl.g:664:1: ( ( rule__Attribute__NameAssignment_0 ) )
            // InternalERDiagramDsl.g:665:2: ( rule__Attribute__NameAssignment_0 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_0()); 
            // InternalERDiagramDsl.g:666:2: ( rule__Attribute__NameAssignment_0 )
            // InternalERDiagramDsl.g:666:3: rule__Attribute__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__Attribute__Group__0__Impl"


    // $ANTLR start "rule__Attribute__Group__1"
    // InternalERDiagramDsl.g:674:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalERDiagramDsl.g:678:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // InternalERDiagramDsl.g:679:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__Attribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__2();

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
    // $ANTLR end "rule__Attribute__Group__1"


    // $ANTLR start "rule__Attribute__Group__1__Impl"
    // InternalERDiagramDsl.g:686:1: rule__Attribute__Group__1__Impl : ( ':' ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalERDiagramDsl.g:690:1: ( ( ':' ) )
            // InternalERDiagramDsl.g:691:1: ( ':' )
            {
            // InternalERDiagramDsl.g:691:1: ( ':' )
            // InternalERDiagramDsl.g:692:2: ':'
            {
             before(grammarAccess.getAttributeAccess().getColonKeyword_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getColonKeyword_1()); 

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
    // $ANTLR end "rule__Attribute__Group__1__Impl"


    // $ANTLR start "rule__Attribute__Group__2"
    // InternalERDiagramDsl.g:701:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl rule__Attribute__Group__3 ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalERDiagramDsl.g:705:1: ( rule__Attribute__Group__2__Impl rule__Attribute__Group__3 )
            // InternalERDiagramDsl.g:706:2: rule__Attribute__Group__2__Impl rule__Attribute__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__Attribute__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__3();

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
    // $ANTLR end "rule__Attribute__Group__2"


    // $ANTLR start "rule__Attribute__Group__2__Impl"
    // InternalERDiagramDsl.g:713:1: rule__Attribute__Group__2__Impl : ( ( rule__Attribute__TypeAssignment_2 ) ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalERDiagramDsl.g:717:1: ( ( ( rule__Attribute__TypeAssignment_2 ) ) )
            // InternalERDiagramDsl.g:718:1: ( ( rule__Attribute__TypeAssignment_2 ) )
            {
            // InternalERDiagramDsl.g:718:1: ( ( rule__Attribute__TypeAssignment_2 ) )
            // InternalERDiagramDsl.g:719:2: ( rule__Attribute__TypeAssignment_2 )
            {
             before(grammarAccess.getAttributeAccess().getTypeAssignment_2()); 
            // InternalERDiagramDsl.g:720:2: ( rule__Attribute__TypeAssignment_2 )
            // InternalERDiagramDsl.g:720:3: rule__Attribute__TypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getTypeAssignment_2()); 

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
    // $ANTLR end "rule__Attribute__Group__2__Impl"


    // $ANTLR start "rule__Attribute__Group__3"
    // InternalERDiagramDsl.g:728:1: rule__Attribute__Group__3 : rule__Attribute__Group__3__Impl ;
    public final void rule__Attribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalERDiagramDsl.g:732:1: ( rule__Attribute__Group__3__Impl )
            // InternalERDiagramDsl.g:733:2: rule__Attribute__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group__3__Impl();

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
    // $ANTLR end "rule__Attribute__Group__3"


    // $ANTLR start "rule__Attribute__Group__3__Impl"
    // InternalERDiagramDsl.g:739:1: rule__Attribute__Group__3__Impl : ( ( rule__Attribute__IsKeyAssignment_3 )? ) ;
    public final void rule__Attribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalERDiagramDsl.g:743:1: ( ( ( rule__Attribute__IsKeyAssignment_3 )? ) )
            // InternalERDiagramDsl.g:744:1: ( ( rule__Attribute__IsKeyAssignment_3 )? )
            {
            // InternalERDiagramDsl.g:744:1: ( ( rule__Attribute__IsKeyAssignment_3 )? )
            // InternalERDiagramDsl.g:745:2: ( rule__Attribute__IsKeyAssignment_3 )?
            {
             before(grammarAccess.getAttributeAccess().getIsKeyAssignment_3()); 
            // InternalERDiagramDsl.g:746:2: ( rule__Attribute__IsKeyAssignment_3 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==25) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalERDiagramDsl.g:746:3: rule__Attribute__IsKeyAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Attribute__IsKeyAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAttributeAccess().getIsKeyAssignment_3()); 

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
    // $ANTLR end "rule__Attribute__Group__3__Impl"


    // $ANTLR start "rule__Relation__Group__0"
    // InternalERDiagramDsl.g:755:1: rule__Relation__Group__0 : rule__Relation__Group__0__Impl rule__Relation__Group__1 ;
    public final void rule__Relation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalERDiagramDsl.g:759:1: ( rule__Relation__Group__0__Impl rule__Relation__Group__1 )
            // InternalERDiagramDsl.g:760:2: rule__Relation__Group__0__Impl rule__Relation__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__Relation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relation__Group__1();

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
    // $ANTLR end "rule__Relation__Group__0"


    // $ANTLR start "rule__Relation__Group__0__Impl"
    // InternalERDiagramDsl.g:767:1: rule__Relation__Group__0__Impl : ( ( rule__Relation__LeftEndingAssignment_0 ) ) ;
    public final void rule__Relation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalERDiagramDsl.g:771:1: ( ( ( rule__Relation__LeftEndingAssignment_0 ) ) )
            // InternalERDiagramDsl.g:772:1: ( ( rule__Relation__LeftEndingAssignment_0 ) )
            {
            // InternalERDiagramDsl.g:772:1: ( ( rule__Relation__LeftEndingAssignment_0 ) )
            // InternalERDiagramDsl.g:773:2: ( rule__Relation__LeftEndingAssignment_0 )
            {
             before(grammarAccess.getRelationAccess().getLeftEndingAssignment_0()); 
            // InternalERDiagramDsl.g:774:2: ( rule__Relation__LeftEndingAssignment_0 )
            // InternalERDiagramDsl.g:774:3: rule__Relation__LeftEndingAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Relation__LeftEndingAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getRelationAccess().getLeftEndingAssignment_0()); 

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
    // $ANTLR end "rule__Relation__Group__0__Impl"


    // $ANTLR start "rule__Relation__Group__1"
    // InternalERDiagramDsl.g:782:1: rule__Relation__Group__1 : rule__Relation__Group__1__Impl rule__Relation__Group__2 ;
    public final void rule__Relation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalERDiagramDsl.g:786:1: ( rule__Relation__Group__1__Impl rule__Relation__Group__2 )
            // InternalERDiagramDsl.g:787:2: rule__Relation__Group__1__Impl rule__Relation__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Relation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relation__Group__2();

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
    // $ANTLR end "rule__Relation__Group__1"


    // $ANTLR start "rule__Relation__Group__1__Impl"
    // InternalERDiagramDsl.g:794:1: rule__Relation__Group__1__Impl : ( 'is related with' ) ;
    public final void rule__Relation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalERDiagramDsl.g:798:1: ( ( 'is related with' ) )
            // InternalERDiagramDsl.g:799:1: ( 'is related with' )
            {
            // InternalERDiagramDsl.g:799:1: ( 'is related with' )
            // InternalERDiagramDsl.g:800:2: 'is related with'
            {
             before(grammarAccess.getRelationAccess().getIsRelatedWithKeyword_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getRelationAccess().getIsRelatedWithKeyword_1()); 

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
    // $ANTLR end "rule__Relation__Group__1__Impl"


    // $ANTLR start "rule__Relation__Group__2"
    // InternalERDiagramDsl.g:809:1: rule__Relation__Group__2 : rule__Relation__Group__2__Impl ;
    public final void rule__Relation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalERDiagramDsl.g:813:1: ( rule__Relation__Group__2__Impl )
            // InternalERDiagramDsl.g:814:2: rule__Relation__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Relation__Group__2__Impl();

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
    // $ANTLR end "rule__Relation__Group__2"


    // $ANTLR start "rule__Relation__Group__2__Impl"
    // InternalERDiagramDsl.g:820:1: rule__Relation__Group__2__Impl : ( ( rule__Relation__RightEndingAssignment_2 ) ) ;
    public final void rule__Relation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalERDiagramDsl.g:824:1: ( ( ( rule__Relation__RightEndingAssignment_2 ) ) )
            // InternalERDiagramDsl.g:825:1: ( ( rule__Relation__RightEndingAssignment_2 ) )
            {
            // InternalERDiagramDsl.g:825:1: ( ( rule__Relation__RightEndingAssignment_2 ) )
            // InternalERDiagramDsl.g:826:2: ( rule__Relation__RightEndingAssignment_2 )
            {
             before(grammarAccess.getRelationAccess().getRightEndingAssignment_2()); 
            // InternalERDiagramDsl.g:827:2: ( rule__Relation__RightEndingAssignment_2 )
            // InternalERDiagramDsl.g:827:3: rule__Relation__RightEndingAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Relation__RightEndingAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRelationAccess().getRightEndingAssignment_2()); 

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
    // $ANTLR end "rule__Relation__Group__2__Impl"


    // $ANTLR start "rule__RelationEnding__Group__0"
    // InternalERDiagramDsl.g:836:1: rule__RelationEnding__Group__0 : rule__RelationEnding__Group__0__Impl rule__RelationEnding__Group__1 ;
    public final void rule__RelationEnding__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalERDiagramDsl.g:840:1: ( rule__RelationEnding__Group__0__Impl rule__RelationEnding__Group__1 )
            // InternalERDiagramDsl.g:841:2: rule__RelationEnding__Group__0__Impl rule__RelationEnding__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__RelationEnding__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RelationEnding__Group__1();

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
    // $ANTLR end "rule__RelationEnding__Group__0"


    // $ANTLR start "rule__RelationEnding__Group__0__Impl"
    // InternalERDiagramDsl.g:848:1: rule__RelationEnding__Group__0__Impl : ( ( rule__RelationEnding__UnorderedGroup_0 ) ) ;
    public final void rule__RelationEnding__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalERDiagramDsl.g:852:1: ( ( ( rule__RelationEnding__UnorderedGroup_0 ) ) )
            // InternalERDiagramDsl.g:853:1: ( ( rule__RelationEnding__UnorderedGroup_0 ) )
            {
            // InternalERDiagramDsl.g:853:1: ( ( rule__RelationEnding__UnorderedGroup_0 ) )
            // InternalERDiagramDsl.g:854:2: ( rule__RelationEnding__UnorderedGroup_0 )
            {
             before(grammarAccess.getRelationEndingAccess().getUnorderedGroup_0()); 
            // InternalERDiagramDsl.g:855:2: ( rule__RelationEnding__UnorderedGroup_0 )
            // InternalERDiagramDsl.g:855:3: rule__RelationEnding__UnorderedGroup_0
            {
            pushFollow(FOLLOW_2);
            rule__RelationEnding__UnorderedGroup_0();

            state._fsp--;


            }

             after(grammarAccess.getRelationEndingAccess().getUnorderedGroup_0()); 

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
    // $ANTLR end "rule__RelationEnding__Group__0__Impl"


    // $ANTLR start "rule__RelationEnding__Group__1"
    // InternalERDiagramDsl.g:863:1: rule__RelationEnding__Group__1 : rule__RelationEnding__Group__1__Impl ;
    public final void rule__RelationEnding__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalERDiagramDsl.g:867:1: ( rule__RelationEnding__Group__1__Impl )
            // InternalERDiagramDsl.g:868:2: rule__RelationEnding__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RelationEnding__Group__1__Impl();

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
    // $ANTLR end "rule__RelationEnding__Group__1"


    // $ANTLR start "rule__RelationEnding__Group__1__Impl"
    // InternalERDiagramDsl.g:874:1: rule__RelationEnding__Group__1__Impl : ( ( rule__RelationEnding__TargetAssignment_1 ) ) ;
    public final void rule__RelationEnding__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalERDiagramDsl.g:878:1: ( ( ( rule__RelationEnding__TargetAssignment_1 ) ) )
            // InternalERDiagramDsl.g:879:1: ( ( rule__RelationEnding__TargetAssignment_1 ) )
            {
            // InternalERDiagramDsl.g:879:1: ( ( rule__RelationEnding__TargetAssignment_1 ) )
            // InternalERDiagramDsl.g:880:2: ( rule__RelationEnding__TargetAssignment_1 )
            {
             before(grammarAccess.getRelationEndingAccess().getTargetAssignment_1()); 
            // InternalERDiagramDsl.g:881:2: ( rule__RelationEnding__TargetAssignment_1 )
            // InternalERDiagramDsl.g:881:3: rule__RelationEnding__TargetAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__RelationEnding__TargetAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRelationEndingAccess().getTargetAssignment_1()); 

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
    // $ANTLR end "rule__RelationEnding__Group__1__Impl"


    // $ANTLR start "rule__RelationEnding__UnorderedGroup_0"
    // InternalERDiagramDsl.g:890:1: rule__RelationEnding__UnorderedGroup_0 : rule__RelationEnding__UnorderedGroup_0__0 {...}?;
    public final void rule__RelationEnding__UnorderedGroup_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getRelationEndingAccess().getUnorderedGroup_0());
        	
        try {
            // InternalERDiagramDsl.g:895:1: ( rule__RelationEnding__UnorderedGroup_0__0 {...}?)
            // InternalERDiagramDsl.g:896:2: rule__RelationEnding__UnorderedGroup_0__0 {...}?
            {
            pushFollow(FOLLOW_2);
            rule__RelationEnding__UnorderedGroup_0__0();

            state._fsp--;

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getRelationEndingAccess().getUnorderedGroup_0()) ) {
                throw new FailedPredicateException(input, "rule__RelationEnding__UnorderedGroup_0", "getUnorderedGroupHelper().canLeave(grammarAccess.getRelationEndingAccess().getUnorderedGroup_0())");
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getRelationEndingAccess().getUnorderedGroup_0());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationEnding__UnorderedGroup_0"


    // $ANTLR start "rule__RelationEnding__UnorderedGroup_0__Impl"
    // InternalERDiagramDsl.g:904:1: rule__RelationEnding__UnorderedGroup_0__Impl : ( ({...}? => ( ( ( rule__RelationEnding__MultiplicityAssignment_0_0 ) ) ) ) | ({...}? => ( ( ( rule__RelationEnding__NullableAssignment_0_1 ) ) ) ) ) ;
    public final void rule__RelationEnding__UnorderedGroup_0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalERDiagramDsl.g:909:1: ( ( ({...}? => ( ( ( rule__RelationEnding__MultiplicityAssignment_0_0 ) ) ) ) | ({...}? => ( ( ( rule__RelationEnding__NullableAssignment_0_1 ) ) ) ) ) )
            // InternalERDiagramDsl.g:910:3: ( ({...}? => ( ( ( rule__RelationEnding__MultiplicityAssignment_0_0 ) ) ) ) | ({...}? => ( ( ( rule__RelationEnding__NullableAssignment_0_1 ) ) ) ) )
            {
            // InternalERDiagramDsl.g:910:3: ( ({...}? => ( ( ( rule__RelationEnding__MultiplicityAssignment_0_0 ) ) ) ) | ({...}? => ( ( ( rule__RelationEnding__NullableAssignment_0_1 ) ) ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( LA9_0 >= 16 && LA9_0 <= 17 && getUnorderedGroupHelper().canSelect(grammarAccess.getRelationEndingAccess().getUnorderedGroup_0(), 0) ) {
                alt9=1;
            }
            else if ( LA9_0 == 26 && getUnorderedGroupHelper().canSelect(grammarAccess.getRelationEndingAccess().getUnorderedGroup_0(), 1) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalERDiagramDsl.g:911:3: ({...}? => ( ( ( rule__RelationEnding__MultiplicityAssignment_0_0 ) ) ) )
                    {
                    // InternalERDiagramDsl.g:911:3: ({...}? => ( ( ( rule__RelationEnding__MultiplicityAssignment_0_0 ) ) ) )
                    // InternalERDiagramDsl.g:912:4: {...}? => ( ( ( rule__RelationEnding__MultiplicityAssignment_0_0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRelationEndingAccess().getUnorderedGroup_0(), 0) ) {
                        throw new FailedPredicateException(input, "rule__RelationEnding__UnorderedGroup_0__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getRelationEndingAccess().getUnorderedGroup_0(), 0)");
                    }
                    // InternalERDiagramDsl.g:912:110: ( ( ( rule__RelationEnding__MultiplicityAssignment_0_0 ) ) )
                    // InternalERDiagramDsl.g:913:5: ( ( rule__RelationEnding__MultiplicityAssignment_0_0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getRelationEndingAccess().getUnorderedGroup_0(), 0);
                    				

                    					selected = true;
                    				
                    // InternalERDiagramDsl.g:919:5: ( ( rule__RelationEnding__MultiplicityAssignment_0_0 ) )
                    // InternalERDiagramDsl.g:920:6: ( rule__RelationEnding__MultiplicityAssignment_0_0 )
                    {
                     before(grammarAccess.getRelationEndingAccess().getMultiplicityAssignment_0_0()); 
                    // InternalERDiagramDsl.g:921:6: ( rule__RelationEnding__MultiplicityAssignment_0_0 )
                    // InternalERDiagramDsl.g:921:7: rule__RelationEnding__MultiplicityAssignment_0_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RelationEnding__MultiplicityAssignment_0_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getRelationEndingAccess().getMultiplicityAssignment_0_0()); 

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalERDiagramDsl.g:926:3: ({...}? => ( ( ( rule__RelationEnding__NullableAssignment_0_1 ) ) ) )
                    {
                    // InternalERDiagramDsl.g:926:3: ({...}? => ( ( ( rule__RelationEnding__NullableAssignment_0_1 ) ) ) )
                    // InternalERDiagramDsl.g:927:4: {...}? => ( ( ( rule__RelationEnding__NullableAssignment_0_1 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRelationEndingAccess().getUnorderedGroup_0(), 1) ) {
                        throw new FailedPredicateException(input, "rule__RelationEnding__UnorderedGroup_0__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getRelationEndingAccess().getUnorderedGroup_0(), 1)");
                    }
                    // InternalERDiagramDsl.g:927:110: ( ( ( rule__RelationEnding__NullableAssignment_0_1 ) ) )
                    // InternalERDiagramDsl.g:928:5: ( ( rule__RelationEnding__NullableAssignment_0_1 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getRelationEndingAccess().getUnorderedGroup_0(), 1);
                    				

                    					selected = true;
                    				
                    // InternalERDiagramDsl.g:934:5: ( ( rule__RelationEnding__NullableAssignment_0_1 ) )
                    // InternalERDiagramDsl.g:935:6: ( rule__RelationEnding__NullableAssignment_0_1 )
                    {
                     before(grammarAccess.getRelationEndingAccess().getNullableAssignment_0_1()); 
                    // InternalERDiagramDsl.g:936:6: ( rule__RelationEnding__NullableAssignment_0_1 )
                    // InternalERDiagramDsl.g:936:7: rule__RelationEnding__NullableAssignment_0_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__RelationEnding__NullableAssignment_0_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getRelationEndingAccess().getNullableAssignment_0_1()); 

                    }


                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	if (selected)
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getRelationEndingAccess().getUnorderedGroup_0());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationEnding__UnorderedGroup_0__Impl"


    // $ANTLR start "rule__RelationEnding__UnorderedGroup_0__0"
    // InternalERDiagramDsl.g:949:1: rule__RelationEnding__UnorderedGroup_0__0 : rule__RelationEnding__UnorderedGroup_0__Impl ( rule__RelationEnding__UnorderedGroup_0__1 )? ;
    public final void rule__RelationEnding__UnorderedGroup_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalERDiagramDsl.g:953:1: ( rule__RelationEnding__UnorderedGroup_0__Impl ( rule__RelationEnding__UnorderedGroup_0__1 )? )
            // InternalERDiagramDsl.g:954:2: rule__RelationEnding__UnorderedGroup_0__Impl ( rule__RelationEnding__UnorderedGroup_0__1 )?
            {
            pushFollow(FOLLOW_5);
            rule__RelationEnding__UnorderedGroup_0__Impl();

            state._fsp--;

            // InternalERDiagramDsl.g:955:2: ( rule__RelationEnding__UnorderedGroup_0__1 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( LA10_0 >= 16 && LA10_0 <= 17 && getUnorderedGroupHelper().canSelect(grammarAccess.getRelationEndingAccess().getUnorderedGroup_0(), 0) ) {
                alt10=1;
            }
            else if ( LA10_0 == 26 && getUnorderedGroupHelper().canSelect(grammarAccess.getRelationEndingAccess().getUnorderedGroup_0(), 1) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalERDiagramDsl.g:955:2: rule__RelationEnding__UnorderedGroup_0__1
                    {
                    pushFollow(FOLLOW_2);
                    rule__RelationEnding__UnorderedGroup_0__1();

                    state._fsp--;


                    }
                    break;

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
    // $ANTLR end "rule__RelationEnding__UnorderedGroup_0__0"


    // $ANTLR start "rule__RelationEnding__UnorderedGroup_0__1"
    // InternalERDiagramDsl.g:961:1: rule__RelationEnding__UnorderedGroup_0__1 : rule__RelationEnding__UnorderedGroup_0__Impl ;
    public final void rule__RelationEnding__UnorderedGroup_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalERDiagramDsl.g:965:1: ( rule__RelationEnding__UnorderedGroup_0__Impl )
            // InternalERDiagramDsl.g:966:2: rule__RelationEnding__UnorderedGroup_0__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RelationEnding__UnorderedGroup_0__Impl();

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
    // $ANTLR end "rule__RelationEnding__UnorderedGroup_0__1"


    // $ANTLR start "rule__ERDiagram__EntitiesAssignment_0"
    // InternalERDiagramDsl.g:973:1: rule__ERDiagram__EntitiesAssignment_0 : ( ruleEntity ) ;
    public final void rule__ERDiagram__EntitiesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalERDiagramDsl.g:977:1: ( ( ruleEntity ) )
            // InternalERDiagramDsl.g:978:2: ( ruleEntity )
            {
            // InternalERDiagramDsl.g:978:2: ( ruleEntity )
            // InternalERDiagramDsl.g:979:3: ruleEntity
            {
             before(grammarAccess.getERDiagramAccess().getEntitiesEntityParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getERDiagramAccess().getEntitiesEntityParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__ERDiagram__EntitiesAssignment_0"


    // $ANTLR start "rule__ERDiagram__RelationAssignment_1"
    // InternalERDiagramDsl.g:988:1: rule__ERDiagram__RelationAssignment_1 : ( ruleRelation ) ;
    public final void rule__ERDiagram__RelationAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalERDiagramDsl.g:992:1: ( ( ruleRelation ) )
            // InternalERDiagramDsl.g:993:2: ( ruleRelation )
            {
            // InternalERDiagramDsl.g:993:2: ( ruleRelation )
            // InternalERDiagramDsl.g:994:3: ruleRelation
            {
             before(grammarAccess.getERDiagramAccess().getRelationRelationParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRelation();

            state._fsp--;

             after(grammarAccess.getERDiagramAccess().getRelationRelationParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__ERDiagram__RelationAssignment_1"


    // $ANTLR start "rule__Entity__NameAssignment_1"
    // InternalERDiagramDsl.g:1003:1: rule__Entity__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Entity__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalERDiagramDsl.g:1007:1: ( ( RULE_ID ) )
            // InternalERDiagramDsl.g:1008:2: ( RULE_ID )
            {
            // InternalERDiagramDsl.g:1008:2: ( RULE_ID )
            // InternalERDiagramDsl.g:1009:3: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Entity__NameAssignment_1"


    // $ANTLR start "rule__Entity__IsAAssignment_2_1"
    // InternalERDiagramDsl.g:1018:1: rule__Entity__IsAAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Entity__IsAAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalERDiagramDsl.g:1022:1: ( ( ( RULE_ID ) ) )
            // InternalERDiagramDsl.g:1023:2: ( ( RULE_ID ) )
            {
            // InternalERDiagramDsl.g:1023:2: ( ( RULE_ID ) )
            // InternalERDiagramDsl.g:1024:3: ( RULE_ID )
            {
             before(grammarAccess.getEntityAccess().getIsAEntityCrossReference_2_1_0()); 
            // InternalERDiagramDsl.g:1025:3: ( RULE_ID )
            // InternalERDiagramDsl.g:1026:4: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getIsAEntityIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getIsAEntityIDTerminalRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getEntityAccess().getIsAEntityCrossReference_2_1_0()); 

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
    // $ANTLR end "rule__Entity__IsAAssignment_2_1"


    // $ANTLR start "rule__Entity__AttributesAssignment_3_1"
    // InternalERDiagramDsl.g:1037:1: rule__Entity__AttributesAssignment_3_1 : ( ruleAttribute ) ;
    public final void rule__Entity__AttributesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalERDiagramDsl.g:1041:1: ( ( ruleAttribute ) )
            // InternalERDiagramDsl.g:1042:2: ( ruleAttribute )
            {
            // InternalERDiagramDsl.g:1042:2: ( ruleAttribute )
            // InternalERDiagramDsl.g:1043:3: ruleAttribute
            {
             before(grammarAccess.getEntityAccess().getAttributesAttributeParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getAttributesAttributeParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__Entity__AttributesAssignment_3_1"


    // $ANTLR start "rule__Entity__AttributesAssignment_3_2_1"
    // InternalERDiagramDsl.g:1052:1: rule__Entity__AttributesAssignment_3_2_1 : ( ruleAttribute ) ;
    public final void rule__Entity__AttributesAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalERDiagramDsl.g:1056:1: ( ( ruleAttribute ) )
            // InternalERDiagramDsl.g:1057:2: ( ruleAttribute )
            {
            // InternalERDiagramDsl.g:1057:2: ( ruleAttribute )
            // InternalERDiagramDsl.g:1058:3: ruleAttribute
            {
             before(grammarAccess.getEntityAccess().getAttributesAttributeParserRuleCall_3_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getAttributesAttributeParserRuleCall_3_2_1_0()); 

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
    // $ANTLR end "rule__Entity__AttributesAssignment_3_2_1"


    // $ANTLR start "rule__Attribute__NameAssignment_0"
    // InternalERDiagramDsl.g:1067:1: rule__Attribute__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Attribute__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalERDiagramDsl.g:1071:1: ( ( RULE_ID ) )
            // InternalERDiagramDsl.g:1072:2: ( RULE_ID )
            {
            // InternalERDiagramDsl.g:1072:2: ( RULE_ID )
            // InternalERDiagramDsl.g:1073:3: RULE_ID
            {
             before(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__Attribute__NameAssignment_0"


    // $ANTLR start "rule__Attribute__TypeAssignment_2"
    // InternalERDiagramDsl.g:1082:1: rule__Attribute__TypeAssignment_2 : ( ruleAttributeType ) ;
    public final void rule__Attribute__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalERDiagramDsl.g:1086:1: ( ( ruleAttributeType ) )
            // InternalERDiagramDsl.g:1087:2: ( ruleAttributeType )
            {
            // InternalERDiagramDsl.g:1087:2: ( ruleAttributeType )
            // InternalERDiagramDsl.g:1088:3: ruleAttributeType
            {
             before(grammarAccess.getAttributeAccess().getTypeAttributeTypeEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAttributeType();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getTypeAttributeTypeEnumRuleCall_2_0()); 

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
    // $ANTLR end "rule__Attribute__TypeAssignment_2"


    // $ANTLR start "rule__Attribute__IsKeyAssignment_3"
    // InternalERDiagramDsl.g:1097:1: rule__Attribute__IsKeyAssignment_3 : ( ( 'key' ) ) ;
    public final void rule__Attribute__IsKeyAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalERDiagramDsl.g:1101:1: ( ( ( 'key' ) ) )
            // InternalERDiagramDsl.g:1102:2: ( ( 'key' ) )
            {
            // InternalERDiagramDsl.g:1102:2: ( ( 'key' ) )
            // InternalERDiagramDsl.g:1103:3: ( 'key' )
            {
             before(grammarAccess.getAttributeAccess().getIsKeyKeyKeyword_3_0()); 
            // InternalERDiagramDsl.g:1104:3: ( 'key' )
            // InternalERDiagramDsl.g:1105:4: 'key'
            {
             before(grammarAccess.getAttributeAccess().getIsKeyKeyKeyword_3_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getIsKeyKeyKeyword_3_0()); 

            }

             after(grammarAccess.getAttributeAccess().getIsKeyKeyKeyword_3_0()); 

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
    // $ANTLR end "rule__Attribute__IsKeyAssignment_3"


    // $ANTLR start "rule__Relation__LeftEndingAssignment_0"
    // InternalERDiagramDsl.g:1116:1: rule__Relation__LeftEndingAssignment_0 : ( ruleRelationEnding ) ;
    public final void rule__Relation__LeftEndingAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalERDiagramDsl.g:1120:1: ( ( ruleRelationEnding ) )
            // InternalERDiagramDsl.g:1121:2: ( ruleRelationEnding )
            {
            // InternalERDiagramDsl.g:1121:2: ( ruleRelationEnding )
            // InternalERDiagramDsl.g:1122:3: ruleRelationEnding
            {
             before(grammarAccess.getRelationAccess().getLeftEndingRelationEndingParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleRelationEnding();

            state._fsp--;

             after(grammarAccess.getRelationAccess().getLeftEndingRelationEndingParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Relation__LeftEndingAssignment_0"


    // $ANTLR start "rule__Relation__RightEndingAssignment_2"
    // InternalERDiagramDsl.g:1131:1: rule__Relation__RightEndingAssignment_2 : ( ruleRelationEnding ) ;
    public final void rule__Relation__RightEndingAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalERDiagramDsl.g:1135:1: ( ( ruleRelationEnding ) )
            // InternalERDiagramDsl.g:1136:2: ( ruleRelationEnding )
            {
            // InternalERDiagramDsl.g:1136:2: ( ruleRelationEnding )
            // InternalERDiagramDsl.g:1137:3: ruleRelationEnding
            {
             before(grammarAccess.getRelationAccess().getRightEndingRelationEndingParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleRelationEnding();

            state._fsp--;

             after(grammarAccess.getRelationAccess().getRightEndingRelationEndingParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Relation__RightEndingAssignment_2"


    // $ANTLR start "rule__RelationEnding__MultiplicityAssignment_0_0"
    // InternalERDiagramDsl.g:1146:1: rule__RelationEnding__MultiplicityAssignment_0_0 : ( ruleMultiplicityType ) ;
    public final void rule__RelationEnding__MultiplicityAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalERDiagramDsl.g:1150:1: ( ( ruleMultiplicityType ) )
            // InternalERDiagramDsl.g:1151:2: ( ruleMultiplicityType )
            {
            // InternalERDiagramDsl.g:1151:2: ( ruleMultiplicityType )
            // InternalERDiagramDsl.g:1152:3: ruleMultiplicityType
            {
             before(grammarAccess.getRelationEndingAccess().getMultiplicityMultiplicityTypeEnumRuleCall_0_0_0()); 
            pushFollow(FOLLOW_2);
            ruleMultiplicityType();

            state._fsp--;

             after(grammarAccess.getRelationEndingAccess().getMultiplicityMultiplicityTypeEnumRuleCall_0_0_0()); 

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
    // $ANTLR end "rule__RelationEnding__MultiplicityAssignment_0_0"


    // $ANTLR start "rule__RelationEnding__NullableAssignment_0_1"
    // InternalERDiagramDsl.g:1161:1: rule__RelationEnding__NullableAssignment_0_1 : ( ( 'nullable' ) ) ;
    public final void rule__RelationEnding__NullableAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalERDiagramDsl.g:1165:1: ( ( ( 'nullable' ) ) )
            // InternalERDiagramDsl.g:1166:2: ( ( 'nullable' ) )
            {
            // InternalERDiagramDsl.g:1166:2: ( ( 'nullable' ) )
            // InternalERDiagramDsl.g:1167:3: ( 'nullable' )
            {
             before(grammarAccess.getRelationEndingAccess().getNullableNullableKeyword_0_1_0()); 
            // InternalERDiagramDsl.g:1168:3: ( 'nullable' )
            // InternalERDiagramDsl.g:1169:4: 'nullable'
            {
             before(grammarAccess.getRelationEndingAccess().getNullableNullableKeyword_0_1_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getRelationEndingAccess().getNullableNullableKeyword_0_1_0()); 

            }

             after(grammarAccess.getRelationEndingAccess().getNullableNullableKeyword_0_1_0()); 

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
    // $ANTLR end "rule__RelationEnding__NullableAssignment_0_1"


    // $ANTLR start "rule__RelationEnding__TargetAssignment_1"
    // InternalERDiagramDsl.g:1180:1: rule__RelationEnding__TargetAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__RelationEnding__TargetAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalERDiagramDsl.g:1184:1: ( ( ( RULE_ID ) ) )
            // InternalERDiagramDsl.g:1185:2: ( ( RULE_ID ) )
            {
            // InternalERDiagramDsl.g:1185:2: ( ( RULE_ID ) )
            // InternalERDiagramDsl.g:1186:3: ( RULE_ID )
            {
             before(grammarAccess.getRelationEndingAccess().getTargetEntityCrossReference_1_0()); 
            // InternalERDiagramDsl.g:1187:3: ( RULE_ID )
            // InternalERDiagramDsl.g:1188:4: RULE_ID
            {
             before(grammarAccess.getRelationEndingAccess().getTargetEntityIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRelationEndingAccess().getTargetEntityIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getRelationEndingAccess().getTargetEntityCrossReference_1_0()); 

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
    // $ANTLR end "rule__RelationEnding__TargetAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000004030000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000004030002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x000000000000F800L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000001000000L});

}
