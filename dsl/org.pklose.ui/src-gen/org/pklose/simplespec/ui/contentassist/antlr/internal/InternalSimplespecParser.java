package org.pklose.simplespec.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.pklose.simplespec.services.SimplespecGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSimplespecParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'1..N'", "'0..N'", "'1'", "'1..0'", "'Import'", "'.*'", "'Diagram'", "'{'", "'}'", "'Include'", "'with'", "'Enumeration'", "','", "'.'", "'Entity'", "'Domain'", "'Description: '", "'Relation'", "':'", "'Field'", "'Decimal'", "'Geld'", "'Text'", "'Boolean'", "'Int'", "'Enum'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalSimplespecParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSimplespecParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSimplespecParser.tokenNames; }
    public String getGrammarFileName() { return "../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g"; }


     
     	private SimplespecGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(SimplespecGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleModel"
    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:60:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:61:1: ( ruleModel EOF )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:62:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel61);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel68); 

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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:69:1: ruleModel : ( ( rule__Model__ElementsAssignment ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:73:2: ( ( ( rule__Model__ElementsAssignment ) ) )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:74:1: ( ( rule__Model__ElementsAssignment ) )
            {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:74:1: ( ( rule__Model__ElementsAssignment ) )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:75:1: ( rule__Model__ElementsAssignment )
            {
             before(grammarAccess.getModelAccess().getElementsAssignment()); 
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:76:1: ( rule__Model__ElementsAssignment )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:76:2: rule__Model__ElementsAssignment
            {
            pushFollow(FOLLOW_rule__Model__ElementsAssignment_in_ruleModel94);
            rule__Model__ElementsAssignment();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getElementsAssignment()); 

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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleElement"
    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:88:1: entryRuleElement : ruleElement EOF ;
    public final void entryRuleElement() throws RecognitionException {
        try {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:89:1: ( ruleElement EOF )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:90:1: ruleElement EOF
            {
             before(grammarAccess.getElementRule()); 
            pushFollow(FOLLOW_ruleElement_in_entryRuleElement121);
            ruleElement();

            state._fsp--;

             after(grammarAccess.getElementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleElement128); 

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
    // $ANTLR end "entryRuleElement"


    // $ANTLR start "ruleElement"
    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:97:1: ruleElement : ( ( rule__Element__Alternatives ) ) ;
    public final void ruleElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:101:2: ( ( ( rule__Element__Alternatives ) ) )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:102:1: ( ( rule__Element__Alternatives ) )
            {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:102:1: ( ( rule__Element__Alternatives ) )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:103:1: ( rule__Element__Alternatives )
            {
             before(grammarAccess.getElementAccess().getAlternatives()); 
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:104:1: ( rule__Element__Alternatives )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:104:2: rule__Element__Alternatives
            {
            pushFollow(FOLLOW_rule__Element__Alternatives_in_ruleElement154);
            rule__Element__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getElementAccess().getAlternatives()); 

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
    // $ANTLR end "ruleElement"


    // $ANTLR start "entryRuleImport"
    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:116:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:117:1: ( ruleImport EOF )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:118:1: ruleImport EOF
            {
             before(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport181);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getImportRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport188); 

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
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:125:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:129:2: ( ( ( rule__Import__Group__0 ) ) )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:130:1: ( ( rule__Import__Group__0 ) )
            {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:130:1: ( ( rule__Import__Group__0 ) )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:131:1: ( rule__Import__Group__0 )
            {
             before(grammarAccess.getImportAccess().getGroup()); 
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:132:1: ( rule__Import__Group__0 )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:132:2: rule__Import__Group__0
            {
            pushFollow(FOLLOW_rule__Import__Group__0_in_ruleImport214);
            rule__Import__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getGroup()); 

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
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleFqnWithWildCard"
    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:144:1: entryRuleFqnWithWildCard : ruleFqnWithWildCard EOF ;
    public final void entryRuleFqnWithWildCard() throws RecognitionException {
        try {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:145:1: ( ruleFqnWithWildCard EOF )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:146:1: ruleFqnWithWildCard EOF
            {
             before(grammarAccess.getFqnWithWildCardRule()); 
            pushFollow(FOLLOW_ruleFqnWithWildCard_in_entryRuleFqnWithWildCard241);
            ruleFqnWithWildCard();

            state._fsp--;

             after(grammarAccess.getFqnWithWildCardRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFqnWithWildCard248); 

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
    // $ANTLR end "entryRuleFqnWithWildCard"


    // $ANTLR start "ruleFqnWithWildCard"
    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:153:1: ruleFqnWithWildCard : ( ( rule__FqnWithWildCard__Group__0 ) ) ;
    public final void ruleFqnWithWildCard() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:157:2: ( ( ( rule__FqnWithWildCard__Group__0 ) ) )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:158:1: ( ( rule__FqnWithWildCard__Group__0 ) )
            {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:158:1: ( ( rule__FqnWithWildCard__Group__0 ) )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:159:1: ( rule__FqnWithWildCard__Group__0 )
            {
             before(grammarAccess.getFqnWithWildCardAccess().getGroup()); 
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:160:1: ( rule__FqnWithWildCard__Group__0 )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:160:2: rule__FqnWithWildCard__Group__0
            {
            pushFollow(FOLLOW_rule__FqnWithWildCard__Group__0_in_ruleFqnWithWildCard274);
            rule__FqnWithWildCard__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFqnWithWildCardAccess().getGroup()); 

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
    // $ANTLR end "ruleFqnWithWildCard"


    // $ANTLR start "entryRuleDiagram"
    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:172:1: entryRuleDiagram : ruleDiagram EOF ;
    public final void entryRuleDiagram() throws RecognitionException {
        try {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:173:1: ( ruleDiagram EOF )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:174:1: ruleDiagram EOF
            {
             before(grammarAccess.getDiagramRule()); 
            pushFollow(FOLLOW_ruleDiagram_in_entryRuleDiagram301);
            ruleDiagram();

            state._fsp--;

             after(grammarAccess.getDiagramRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDiagram308); 

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
    // $ANTLR end "entryRuleDiagram"


    // $ANTLR start "ruleDiagram"
    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:181:1: ruleDiagram : ( ( rule__Diagram__Group__0 ) ) ;
    public final void ruleDiagram() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:185:2: ( ( ( rule__Diagram__Group__0 ) ) )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:186:1: ( ( rule__Diagram__Group__0 ) )
            {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:186:1: ( ( rule__Diagram__Group__0 ) )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:187:1: ( rule__Diagram__Group__0 )
            {
             before(grammarAccess.getDiagramAccess().getGroup()); 
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:188:1: ( rule__Diagram__Group__0 )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:188:2: rule__Diagram__Group__0
            {
            pushFollow(FOLLOW_rule__Diagram__Group__0_in_ruleDiagram334);
            rule__Diagram__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDiagramAccess().getGroup()); 

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
    // $ANTLR end "ruleDiagram"


    // $ANTLR start "entryRuleInclude"
    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:200:1: entryRuleInclude : ruleInclude EOF ;
    public final void entryRuleInclude() throws RecognitionException {
        try {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:201:1: ( ruleInclude EOF )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:202:1: ruleInclude EOF
            {
             before(grammarAccess.getIncludeRule()); 
            pushFollow(FOLLOW_ruleInclude_in_entryRuleInclude361);
            ruleInclude();

            state._fsp--;

             after(grammarAccess.getIncludeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInclude368); 

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
    // $ANTLR end "entryRuleInclude"


    // $ANTLR start "ruleInclude"
    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:209:1: ruleInclude : ( ( rule__Include__Group__0 ) ) ;
    public final void ruleInclude() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:213:2: ( ( ( rule__Include__Group__0 ) ) )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:214:1: ( ( rule__Include__Group__0 ) )
            {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:214:1: ( ( rule__Include__Group__0 ) )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:215:1: ( rule__Include__Group__0 )
            {
             before(grammarAccess.getIncludeAccess().getGroup()); 
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:216:1: ( rule__Include__Group__0 )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:216:2: rule__Include__Group__0
            {
            pushFollow(FOLLOW_rule__Include__Group__0_in_ruleInclude394);
            rule__Include__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIncludeAccess().getGroup()); 

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
    // $ANTLR end "ruleInclude"


    // $ANTLR start "entryRuleEnumDeclaration"
    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:228:1: entryRuleEnumDeclaration : ruleEnumDeclaration EOF ;
    public final void entryRuleEnumDeclaration() throws RecognitionException {
        try {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:229:1: ( ruleEnumDeclaration EOF )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:230:1: ruleEnumDeclaration EOF
            {
             before(grammarAccess.getEnumDeclarationRule()); 
            pushFollow(FOLLOW_ruleEnumDeclaration_in_entryRuleEnumDeclaration421);
            ruleEnumDeclaration();

            state._fsp--;

             after(grammarAccess.getEnumDeclarationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumDeclaration428); 

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
    // $ANTLR end "entryRuleEnumDeclaration"


    // $ANTLR start "ruleEnumDeclaration"
    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:237:1: ruleEnumDeclaration : ( ( rule__EnumDeclaration__Group__0 ) ) ;
    public final void ruleEnumDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:241:2: ( ( ( rule__EnumDeclaration__Group__0 ) ) )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:242:1: ( ( rule__EnumDeclaration__Group__0 ) )
            {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:242:1: ( ( rule__EnumDeclaration__Group__0 ) )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:243:1: ( rule__EnumDeclaration__Group__0 )
            {
             before(grammarAccess.getEnumDeclarationAccess().getGroup()); 
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:244:1: ( rule__EnumDeclaration__Group__0 )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:244:2: rule__EnumDeclaration__Group__0
            {
            pushFollow(FOLLOW_rule__EnumDeclaration__Group__0_in_ruleEnumDeclaration454);
            rule__EnumDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEnumDeclarationAccess().getGroup()); 

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
    // $ANTLR end "ruleEnumDeclaration"


    // $ANTLR start "entryRuleFQN"
    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:256:1: entryRuleFQN : ruleFQN EOF ;
    public final void entryRuleFQN() throws RecognitionException {
        try {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:257:1: ( ruleFQN EOF )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:258:1: ruleFQN EOF
            {
             before(grammarAccess.getFQNRule()); 
            pushFollow(FOLLOW_ruleFQN_in_entryRuleFQN481);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getFQNRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFQN488); 

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
    // $ANTLR end "entryRuleFQN"


    // $ANTLR start "ruleFQN"
    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:265:1: ruleFQN : ( ( rule__FQN__Group__0 ) ) ;
    public final void ruleFQN() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:269:2: ( ( ( rule__FQN__Group__0 ) ) )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:270:1: ( ( rule__FQN__Group__0 ) )
            {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:270:1: ( ( rule__FQN__Group__0 ) )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:271:1: ( rule__FQN__Group__0 )
            {
             before(grammarAccess.getFQNAccess().getGroup()); 
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:272:1: ( rule__FQN__Group__0 )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:272:2: rule__FQN__Group__0
            {
            pushFollow(FOLLOW_rule__FQN__Group__0_in_ruleFQN514);
            rule__FQN__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFQNAccess().getGroup()); 

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
    // $ANTLR end "ruleFQN"


    // $ANTLR start "entryRuleEntity"
    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:284:1: entryRuleEntity : ruleEntity EOF ;
    public final void entryRuleEntity() throws RecognitionException {
        try {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:285:1: ( ruleEntity EOF )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:286:1: ruleEntity EOF
            {
             before(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_ruleEntity_in_entryRuleEntity541);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getEntityRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntity548); 

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
    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:293:1: ruleEntity : ( ( rule__Entity__Group__0 ) ) ;
    public final void ruleEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:297:2: ( ( ( rule__Entity__Group__0 ) ) )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:298:1: ( ( rule__Entity__Group__0 ) )
            {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:298:1: ( ( rule__Entity__Group__0 ) )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:299:1: ( rule__Entity__Group__0 )
            {
             before(grammarAccess.getEntityAccess().getGroup()); 
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:300:1: ( rule__Entity__Group__0 )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:300:2: rule__Entity__Group__0
            {
            pushFollow(FOLLOW_rule__Entity__Group__0_in_ruleEntity574);
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


    // $ANTLR start "entryRuleDomain"
    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:312:1: entryRuleDomain : ruleDomain EOF ;
    public final void entryRuleDomain() throws RecognitionException {
        try {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:313:1: ( ruleDomain EOF )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:314:1: ruleDomain EOF
            {
             before(grammarAccess.getDomainRule()); 
            pushFollow(FOLLOW_ruleDomain_in_entryRuleDomain601);
            ruleDomain();

            state._fsp--;

             after(grammarAccess.getDomainRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDomain608); 

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
    // $ANTLR end "entryRuleDomain"


    // $ANTLR start "ruleDomain"
    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:321:1: ruleDomain : ( ( rule__Domain__Group__0 ) ) ;
    public final void ruleDomain() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:325:2: ( ( ( rule__Domain__Group__0 ) ) )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:326:1: ( ( rule__Domain__Group__0 ) )
            {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:326:1: ( ( rule__Domain__Group__0 ) )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:327:1: ( rule__Domain__Group__0 )
            {
             before(grammarAccess.getDomainAccess().getGroup()); 
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:328:1: ( rule__Domain__Group__0 )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:328:2: rule__Domain__Group__0
            {
            pushFollow(FOLLOW_rule__Domain__Group__0_in_ruleDomain634);
            rule__Domain__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDomainAccess().getGroup()); 

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
    // $ANTLR end "ruleDomain"


    // $ANTLR start "entryRuleProperty"
    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:340:1: entryRuleProperty : ruleProperty EOF ;
    public final void entryRuleProperty() throws RecognitionException {
        try {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:341:1: ( ruleProperty EOF )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:342:1: ruleProperty EOF
            {
             before(grammarAccess.getPropertyRule()); 
            pushFollow(FOLLOW_ruleProperty_in_entryRuleProperty661);
            ruleProperty();

            state._fsp--;

             after(grammarAccess.getPropertyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProperty668); 

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
    // $ANTLR end "entryRuleProperty"


    // $ANTLR start "ruleProperty"
    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:349:1: ruleProperty : ( ( rule__Property__Alternatives ) ) ;
    public final void ruleProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:353:2: ( ( ( rule__Property__Alternatives ) ) )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:354:1: ( ( rule__Property__Alternatives ) )
            {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:354:1: ( ( rule__Property__Alternatives ) )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:355:1: ( rule__Property__Alternatives )
            {
             before(grammarAccess.getPropertyAccess().getAlternatives()); 
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:356:1: ( rule__Property__Alternatives )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:356:2: rule__Property__Alternatives
            {
            pushFollow(FOLLOW_rule__Property__Alternatives_in_ruleProperty694);
            rule__Property__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPropertyAccess().getAlternatives()); 

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
    // $ANTLR end "ruleProperty"


    // $ANTLR start "entryRuleAssociation"
    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:368:1: entryRuleAssociation : ruleAssociation EOF ;
    public final void entryRuleAssociation() throws RecognitionException {
        try {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:369:1: ( ruleAssociation EOF )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:370:1: ruleAssociation EOF
            {
             before(grammarAccess.getAssociationRule()); 
            pushFollow(FOLLOW_ruleAssociation_in_entryRuleAssociation721);
            ruleAssociation();

            state._fsp--;

             after(grammarAccess.getAssociationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssociation728); 

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
    // $ANTLR end "entryRuleAssociation"


    // $ANTLR start "ruleAssociation"
    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:377:1: ruleAssociation : ( ( rule__Association__Group__0 ) ) ;
    public final void ruleAssociation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:381:2: ( ( ( rule__Association__Group__0 ) ) )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:382:1: ( ( rule__Association__Group__0 ) )
            {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:382:1: ( ( rule__Association__Group__0 ) )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:383:1: ( rule__Association__Group__0 )
            {
             before(grammarAccess.getAssociationAccess().getGroup()); 
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:384:1: ( rule__Association__Group__0 )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:384:2: rule__Association__Group__0
            {
            pushFollow(FOLLOW_rule__Association__Group__0_in_ruleAssociation754);
            rule__Association__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAssociationAccess().getGroup()); 

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
    // $ANTLR end "ruleAssociation"


    // $ANTLR start "entryRuleMultiplicty"
    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:396:1: entryRuleMultiplicty : ruleMultiplicty EOF ;
    public final void entryRuleMultiplicty() throws RecognitionException {
        try {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:397:1: ( ruleMultiplicty EOF )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:398:1: ruleMultiplicty EOF
            {
             before(grammarAccess.getMultiplictyRule()); 
            pushFollow(FOLLOW_ruleMultiplicty_in_entryRuleMultiplicty781);
            ruleMultiplicty();

            state._fsp--;

             after(grammarAccess.getMultiplictyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiplicty788); 

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
    // $ANTLR end "entryRuleMultiplicty"


    // $ANTLR start "ruleMultiplicty"
    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:405:1: ruleMultiplicty : ( ( rule__Multiplicty__Alternatives ) ) ;
    public final void ruleMultiplicty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:409:2: ( ( ( rule__Multiplicty__Alternatives ) ) )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:410:1: ( ( rule__Multiplicty__Alternatives ) )
            {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:410:1: ( ( rule__Multiplicty__Alternatives ) )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:411:1: ( rule__Multiplicty__Alternatives )
            {
             before(grammarAccess.getMultiplictyAccess().getAlternatives()); 
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:412:1: ( rule__Multiplicty__Alternatives )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:412:2: rule__Multiplicty__Alternatives
            {
            pushFollow(FOLLOW_rule__Multiplicty__Alternatives_in_ruleMultiplicty814);
            rule__Multiplicty__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMultiplictyAccess().getAlternatives()); 

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
    // $ANTLR end "ruleMultiplicty"


    // $ANTLR start "entryRuleField"
    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:424:1: entryRuleField : ruleField EOF ;
    public final void entryRuleField() throws RecognitionException {
        try {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:425:1: ( ruleField EOF )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:426:1: ruleField EOF
            {
             before(grammarAccess.getFieldRule()); 
            pushFollow(FOLLOW_ruleField_in_entryRuleField841);
            ruleField();

            state._fsp--;

             after(grammarAccess.getFieldRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleField848); 

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
    // $ANTLR end "entryRuleField"


    // $ANTLR start "ruleField"
    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:433:1: ruleField : ( ( rule__Field__Group__0 ) ) ;
    public final void ruleField() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:437:2: ( ( ( rule__Field__Group__0 ) ) )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:438:1: ( ( rule__Field__Group__0 ) )
            {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:438:1: ( ( rule__Field__Group__0 ) )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:439:1: ( rule__Field__Group__0 )
            {
             before(grammarAccess.getFieldAccess().getGroup()); 
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:440:1: ( rule__Field__Group__0 )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:440:2: rule__Field__Group__0
            {
            pushFollow(FOLLOW_rule__Field__Group__0_in_ruleField874);
            rule__Field__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFieldAccess().getGroup()); 

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
    // $ANTLR end "ruleField"


    // $ANTLR start "entryRuleLiteral"
    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:452:1: entryRuleLiteral : ruleLiteral EOF ;
    public final void entryRuleLiteral() throws RecognitionException {
        try {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:453:1: ( ruleLiteral EOF )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:454:1: ruleLiteral EOF
            {
             before(grammarAccess.getLiteralRule()); 
            pushFollow(FOLLOW_ruleLiteral_in_entryRuleLiteral901);
            ruleLiteral();

            state._fsp--;

             after(grammarAccess.getLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteral908); 

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
    // $ANTLR end "entryRuleLiteral"


    // $ANTLR start "ruleLiteral"
    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:461:1: ruleLiteral : ( ( rule__Literal__Alternatives ) ) ;
    public final void ruleLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:465:2: ( ( ( rule__Literal__Alternatives ) ) )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:466:1: ( ( rule__Literal__Alternatives ) )
            {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:466:1: ( ( rule__Literal__Alternatives ) )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:467:1: ( rule__Literal__Alternatives )
            {
             before(grammarAccess.getLiteralAccess().getAlternatives()); 
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:468:1: ( rule__Literal__Alternatives )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:468:2: rule__Literal__Alternatives
            {
            pushFollow(FOLLOW_rule__Literal__Alternatives_in_ruleLiteral934);
            rule__Literal__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLiteralAccess().getAlternatives()); 

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
    // $ANTLR end "ruleLiteral"


    // $ANTLR start "entryRuleEnum"
    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:480:1: entryRuleEnum : ruleEnum EOF ;
    public final void entryRuleEnum() throws RecognitionException {
        try {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:481:1: ( ruleEnum EOF )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:482:1: ruleEnum EOF
            {
             before(grammarAccess.getEnumRule()); 
            pushFollow(FOLLOW_ruleEnum_in_entryRuleEnum961);
            ruleEnum();

            state._fsp--;

             after(grammarAccess.getEnumRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnum968); 

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
    // $ANTLR end "entryRuleEnum"


    // $ANTLR start "ruleEnum"
    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:489:1: ruleEnum : ( ( rule__Enum__Group__0 ) ) ;
    public final void ruleEnum() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:493:2: ( ( ( rule__Enum__Group__0 ) ) )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:494:1: ( ( rule__Enum__Group__0 ) )
            {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:494:1: ( ( rule__Enum__Group__0 ) )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:495:1: ( rule__Enum__Group__0 )
            {
             before(grammarAccess.getEnumAccess().getGroup()); 
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:496:1: ( rule__Enum__Group__0 )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:496:2: rule__Enum__Group__0
            {
            pushFollow(FOLLOW_rule__Enum__Group__0_in_ruleEnum994);
            rule__Enum__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEnumAccess().getGroup()); 

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
    // $ANTLR end "ruleEnum"


    // $ANTLR start "rule__Element__Alternatives"
    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:508:1: rule__Element__Alternatives : ( ( ruleEnumDeclaration ) | ( ruleDiagram ) | ( ruleDomain ) );
    public final void rule__Element__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:512:1: ( ( ruleEnumDeclaration ) | ( ruleDiagram ) | ( ruleDomain ) )
            int alt1=3;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:513:1: ( ruleEnumDeclaration )
                    {
                    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:513:1: ( ruleEnumDeclaration )
                    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:514:1: ruleEnumDeclaration
                    {
                     before(grammarAccess.getElementAccess().getEnumDeclarationParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleEnumDeclaration_in_rule__Element__Alternatives1030);
                    ruleEnumDeclaration();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getEnumDeclarationParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:519:6: ( ruleDiagram )
                    {
                    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:519:6: ( ruleDiagram )
                    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:520:1: ruleDiagram
                    {
                     before(grammarAccess.getElementAccess().getDiagramParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleDiagram_in_rule__Element__Alternatives1047);
                    ruleDiagram();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getDiagramParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:525:6: ( ruleDomain )
                    {
                    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:525:6: ( ruleDomain )
                    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:526:1: ruleDomain
                    {
                     before(grammarAccess.getElementAccess().getDomainParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleDomain_in_rule__Element__Alternatives1064);
                    ruleDomain();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getDomainParserRuleCall_2()); 

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
    // $ANTLR end "rule__Element__Alternatives"


    // $ANTLR start "rule__Property__Alternatives"
    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:536:1: rule__Property__Alternatives : ( ( ruleField ) | ( ruleAssociation ) );
    public final void rule__Property__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:540:1: ( ( ruleField ) | ( ruleAssociation ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==30) ) {
                alt2=1;
            }
            else if ( (LA2_0==28) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:541:1: ( ruleField )
                    {
                    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:541:1: ( ruleField )
                    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:542:1: ruleField
                    {
                     before(grammarAccess.getPropertyAccess().getFieldParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleField_in_rule__Property__Alternatives1096);
                    ruleField();

                    state._fsp--;

                     after(grammarAccess.getPropertyAccess().getFieldParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:547:6: ( ruleAssociation )
                    {
                    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:547:6: ( ruleAssociation )
                    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:548:1: ruleAssociation
                    {
                     before(grammarAccess.getPropertyAccess().getAssociationParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleAssociation_in_rule__Property__Alternatives1113);
                    ruleAssociation();

                    state._fsp--;

                     after(grammarAccess.getPropertyAccess().getAssociationParserRuleCall_1()); 

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
    // $ANTLR end "rule__Property__Alternatives"


    // $ANTLR start "rule__Multiplicty__Alternatives"
    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:558:1: rule__Multiplicty__Alternatives : ( ( '1..N' ) | ( '0..N' ) | ( '1' ) | ( '1..0' ) );
    public final void rule__Multiplicty__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:562:1: ( ( '1..N' ) | ( '0..N' ) | ( '1' ) | ( '1..0' ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt3=1;
                }
                break;
            case 12:
                {
                alt3=2;
                }
                break;
            case 13:
                {
                alt3=3;
                }
                break;
            case 14:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:563:1: ( '1..N' )
                    {
                    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:563:1: ( '1..N' )
                    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:564:1: '1..N'
                    {
                     before(grammarAccess.getMultiplictyAccess().getNKeyword_0()); 
                    match(input,11,FOLLOW_11_in_rule__Multiplicty__Alternatives1146); 
                     after(grammarAccess.getMultiplictyAccess().getNKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:571:6: ( '0..N' )
                    {
                    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:571:6: ( '0..N' )
                    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:572:1: '0..N'
                    {
                     before(grammarAccess.getMultiplictyAccess().getNKeyword_1()); 
                    match(input,12,FOLLOW_12_in_rule__Multiplicty__Alternatives1166); 
                     after(grammarAccess.getMultiplictyAccess().getNKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:579:6: ( '1' )
                    {
                    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:579:6: ( '1' )
                    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:580:1: '1'
                    {
                     before(grammarAccess.getMultiplictyAccess().getDigitOneKeyword_2()); 
                    match(input,13,FOLLOW_13_in_rule__Multiplicty__Alternatives1186); 
                     after(grammarAccess.getMultiplictyAccess().getDigitOneKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:587:6: ( '1..0' )
                    {
                    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:587:6: ( '1..0' )
                    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:588:1: '1..0'
                    {
                     before(grammarAccess.getMultiplictyAccess().getDigitOneFullStopFullStopDigitZeroKeyword_3()); 
                    match(input,14,FOLLOW_14_in_rule__Multiplicty__Alternatives1206); 
                     after(grammarAccess.getMultiplictyAccess().getDigitOneFullStopFullStopDigitZeroKeyword_3()); 

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
    // $ANTLR end "rule__Multiplicty__Alternatives"


    // $ANTLR start "rule__Literal__Alternatives"
    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:600:1: rule__Literal__Alternatives : ( ( ( rule__Literal__Group_0__0 ) ) | ( ( rule__Literal__Group_1__0 ) ) | ( ( rule__Literal__Group_2__0 ) ) | ( ( rule__Literal__Group_3__0 ) ) | ( ( rule__Literal__Group_4__0 ) ) | ( ruleEnum ) );
    public final void rule__Literal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:604:1: ( ( ( rule__Literal__Group_0__0 ) ) | ( ( rule__Literal__Group_1__0 ) ) | ( ( rule__Literal__Group_2__0 ) ) | ( ( rule__Literal__Group_3__0 ) ) | ( ( rule__Literal__Group_4__0 ) ) | ( ruleEnum ) )
            int alt4=6;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt4=1;
                }
                break;
            case 32:
                {
                alt4=2;
                }
                break;
            case 33:
                {
                alt4=3;
                }
                break;
            case 34:
                {
                alt4=4;
                }
                break;
            case 35:
                {
                alt4=5;
                }
                break;
            case 36:
                {
                alt4=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:605:1: ( ( rule__Literal__Group_0__0 ) )
                    {
                    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:605:1: ( ( rule__Literal__Group_0__0 ) )
                    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:606:1: ( rule__Literal__Group_0__0 )
                    {
                     before(grammarAccess.getLiteralAccess().getGroup_0()); 
                    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:607:1: ( rule__Literal__Group_0__0 )
                    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:607:2: rule__Literal__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Literal__Group_0__0_in_rule__Literal__Alternatives1240);
                    rule__Literal__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLiteralAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:611:6: ( ( rule__Literal__Group_1__0 ) )
                    {
                    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:611:6: ( ( rule__Literal__Group_1__0 ) )
                    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:612:1: ( rule__Literal__Group_1__0 )
                    {
                     before(grammarAccess.getLiteralAccess().getGroup_1()); 
                    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:613:1: ( rule__Literal__Group_1__0 )
                    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:613:2: rule__Literal__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Literal__Group_1__0_in_rule__Literal__Alternatives1258);
                    rule__Literal__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLiteralAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:617:6: ( ( rule__Literal__Group_2__0 ) )
                    {
                    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:617:6: ( ( rule__Literal__Group_2__0 ) )
                    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:618:1: ( rule__Literal__Group_2__0 )
                    {
                     before(grammarAccess.getLiteralAccess().getGroup_2()); 
                    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:619:1: ( rule__Literal__Group_2__0 )
                    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:619:2: rule__Literal__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Literal__Group_2__0_in_rule__Literal__Alternatives1276);
                    rule__Literal__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLiteralAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:623:6: ( ( rule__Literal__Group_3__0 ) )
                    {
                    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:623:6: ( ( rule__Literal__Group_3__0 ) )
                    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:624:1: ( rule__Literal__Group_3__0 )
                    {
                     before(grammarAccess.getLiteralAccess().getGroup_3()); 
                    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:625:1: ( rule__Literal__Group_3__0 )
                    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:625:2: rule__Literal__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Literal__Group_3__0_in_rule__Literal__Alternatives1294);
                    rule__Literal__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLiteralAccess().getGroup_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:629:6: ( ( rule__Literal__Group_4__0 ) )
                    {
                    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:629:6: ( ( rule__Literal__Group_4__0 ) )
                    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:630:1: ( rule__Literal__Group_4__0 )
                    {
                     before(grammarAccess.getLiteralAccess().getGroup_4()); 
                    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:631:1: ( rule__Literal__Group_4__0 )
                    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:631:2: rule__Literal__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Literal__Group_4__0_in_rule__Literal__Alternatives1312);
                    rule__Literal__Group_4__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLiteralAccess().getGroup_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:635:6: ( ruleEnum )
                    {
                    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:635:6: ( ruleEnum )
                    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:636:1: ruleEnum
                    {
                     before(grammarAccess.getLiteralAccess().getEnumParserRuleCall_5()); 
                    pushFollow(FOLLOW_ruleEnum_in_rule__Literal__Alternatives1330);
                    ruleEnum();

                    state._fsp--;

                     after(grammarAccess.getLiteralAccess().getEnumParserRuleCall_5()); 

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
    // $ANTLR end "rule__Literal__Alternatives"


    // $ANTLR start "rule__Import__Group__0"
    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:648:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:652:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:653:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__01360);
            rule__Import__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Import__Group__1_in_rule__Import__Group__01363);
            rule__Import__Group__1();

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
    // $ANTLR end "rule__Import__Group__0"


    // $ANTLR start "rule__Import__Group__0__Impl"
    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:660:1: rule__Import__Group__0__Impl : ( 'Import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:664:1: ( ( 'Import' ) )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:665:1: ( 'Import' )
            {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:665:1: ( 'Import' )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:666:1: 'Import'
            {
             before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            match(input,15,FOLLOW_15_in_rule__Import__Group__0__Impl1391); 
             after(grammarAccess.getImportAccess().getImportKeyword_0()); 

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
    // $ANTLR end "rule__Import__Group__0__Impl"


    // $ANTLR start "rule__Import__Group__1"
    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:679:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:683:1: ( rule__Import__Group__1__Impl )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:684:2: rule__Import__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__11422);
            rule__Import__Group__1__Impl();

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
    // $ANTLR end "rule__Import__Group__1"


    // $ANTLR start "rule__Import__Group__1__Impl"
    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:690:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:694:1: ( ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:695:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:695:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:696:1: ( rule__Import__ImportedNamespaceAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:697:1: ( rule__Import__ImportedNamespaceAssignment_1 )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:697:2: rule__Import__ImportedNamespaceAssignment_1
            {
            pushFollow(FOLLOW_rule__Import__ImportedNamespaceAssignment_1_in_rule__Import__Group__1__Impl1449);
            rule__Import__ImportedNamespaceAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 

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
    // $ANTLR end "rule__Import__Group__1__Impl"


    // $ANTLR start "rule__FqnWithWildCard__Group__0"
    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:711:1: rule__FqnWithWildCard__Group__0 : rule__FqnWithWildCard__Group__0__Impl rule__FqnWithWildCard__Group__1 ;
    public final void rule__FqnWithWildCard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:715:1: ( rule__FqnWithWildCard__Group__0__Impl rule__FqnWithWildCard__Group__1 )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:716:2: rule__FqnWithWildCard__Group__0__Impl rule__FqnWithWildCard__Group__1
            {
            pushFollow(FOLLOW_rule__FqnWithWildCard__Group__0__Impl_in_rule__FqnWithWildCard__Group__01483);
            rule__FqnWithWildCard__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FqnWithWildCard__Group__1_in_rule__FqnWithWildCard__Group__01486);
            rule__FqnWithWildCard__Group__1();

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
    // $ANTLR end "rule__FqnWithWildCard__Group__0"


    // $ANTLR start "rule__FqnWithWildCard__Group__0__Impl"
    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:723:1: rule__FqnWithWildCard__Group__0__Impl : ( ruleFQN ) ;
    public final void rule__FqnWithWildCard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:727:1: ( ( ruleFQN ) )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:728:1: ( ruleFQN )
            {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:728:1: ( ruleFQN )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:729:1: ruleFQN
            {
             before(grammarAccess.getFqnWithWildCardAccess().getFQNParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleFQN_in_rule__FqnWithWildCard__Group__0__Impl1513);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getFqnWithWildCardAccess().getFQNParserRuleCall_0()); 

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
    // $ANTLR end "rule__FqnWithWildCard__Group__0__Impl"


    // $ANTLR start "rule__FqnWithWildCard__Group__1"
    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:740:1: rule__FqnWithWildCard__Group__1 : rule__FqnWithWildCard__Group__1__Impl ;
    public final void rule__FqnWithWildCard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:744:1: ( rule__FqnWithWildCard__Group__1__Impl )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:745:2: rule__FqnWithWildCard__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__FqnWithWildCard__Group__1__Impl_in_rule__FqnWithWildCard__Group__11542);
            rule__FqnWithWildCard__Group__1__Impl();

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
    // $ANTLR end "rule__FqnWithWildCard__Group__1"


    // $ANTLR start "rule__FqnWithWildCard__Group__1__Impl"
    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:751:1: rule__FqnWithWildCard__Group__1__Impl : ( ( '.*' )? ) ;
    public final void rule__FqnWithWildCard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:755:1: ( ( ( '.*' )? ) )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:756:1: ( ( '.*' )? )
            {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:756:1: ( ( '.*' )? )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:757:1: ( '.*' )?
            {
             before(grammarAccess.getFqnWithWildCardAccess().getFullStopAsteriskKeyword_1()); 
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:758:1: ( '.*' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:759:2: '.*'
                    {
                    match(input,16,FOLLOW_16_in_rule__FqnWithWildCard__Group__1__Impl1571); 

                    }
                    break;

            }

             after(grammarAccess.getFqnWithWildCardAccess().getFullStopAsteriskKeyword_1()); 

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
    // $ANTLR end "rule__FqnWithWildCard__Group__1__Impl"


    // $ANTLR start "rule__Diagram__Group__0"
    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:774:1: rule__Diagram__Group__0 : rule__Diagram__Group__0__Impl rule__Diagram__Group__1 ;
    public final void rule__Diagram__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:778:1: ( rule__Diagram__Group__0__Impl rule__Diagram__Group__1 )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:779:2: rule__Diagram__Group__0__Impl rule__Diagram__Group__1
            {
            pushFollow(FOLLOW_rule__Diagram__Group__0__Impl_in_rule__Diagram__Group__01608);
            rule__Diagram__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Diagram__Group__1_in_rule__Diagram__Group__01611);
            rule__Diagram__Group__1();

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
    // $ANTLR end "rule__Diagram__Group__0"


    // $ANTLR start "rule__Diagram__Group__0__Impl"
    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:786:1: rule__Diagram__Group__0__Impl : ( ( rule__Diagram__ImportsAssignment_0 )* ) ;
    public final void rule__Diagram__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:790:1: ( ( ( rule__Diagram__ImportsAssignment_0 )* ) )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:791:1: ( ( rule__Diagram__ImportsAssignment_0 )* )
            {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:791:1: ( ( rule__Diagram__ImportsAssignment_0 )* )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:792:1: ( rule__Diagram__ImportsAssignment_0 )*
            {
             before(grammarAccess.getDiagramAccess().getImportsAssignment_0()); 
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:793:1: ( rule__Diagram__ImportsAssignment_0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==15) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:793:2: rule__Diagram__ImportsAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__Diagram__ImportsAssignment_0_in_rule__Diagram__Group__0__Impl1638);
            	    rule__Diagram__ImportsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getDiagramAccess().getImportsAssignment_0()); 

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
    // $ANTLR end "rule__Diagram__Group__0__Impl"


    // $ANTLR start "rule__Diagram__Group__1"
    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:803:1: rule__Diagram__Group__1 : rule__Diagram__Group__1__Impl rule__Diagram__Group__2 ;
    public final void rule__Diagram__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:807:1: ( rule__Diagram__Group__1__Impl rule__Diagram__Group__2 )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:808:2: rule__Diagram__Group__1__Impl rule__Diagram__Group__2
            {
            pushFollow(FOLLOW_rule__Diagram__Group__1__Impl_in_rule__Diagram__Group__11669);
            rule__Diagram__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Diagram__Group__2_in_rule__Diagram__Group__11672);
            rule__Diagram__Group__2();

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
    // $ANTLR end "rule__Diagram__Group__1"


    // $ANTLR start "rule__Diagram__Group__1__Impl"
    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:815:1: rule__Diagram__Group__1__Impl : ( 'Diagram' ) ;
    public final void rule__Diagram__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:819:1: ( ( 'Diagram' ) )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:820:1: ( 'Diagram' )
            {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:820:1: ( 'Diagram' )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:821:1: 'Diagram'
            {
             before(grammarAccess.getDiagramAccess().getDiagramKeyword_1()); 
            match(input,17,FOLLOW_17_in_rule__Diagram__Group__1__Impl1700); 
             after(grammarAccess.getDiagramAccess().getDiagramKeyword_1()); 

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
    // $ANTLR end "rule__Diagram__Group__1__Impl"


    // $ANTLR start "rule__Diagram__Group__2"
    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:834:1: rule__Diagram__Group__2 : rule__Diagram__Group__2__Impl rule__Diagram__Group__3 ;
    public final void rule__Diagram__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:838:1: ( rule__Diagram__Group__2__Impl rule__Diagram__Group__3 )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:839:2: rule__Diagram__Group__2__Impl rule__Diagram__Group__3
            {
            pushFollow(FOLLOW_rule__Diagram__Group__2__Impl_in_rule__Diagram__Group__21731);
            rule__Diagram__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Diagram__Group__3_in_rule__Diagram__Group__21734);
            rule__Diagram__Group__3();

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
    // $ANTLR end "rule__Diagram__Group__2"


    // $ANTLR start "rule__Diagram__Group__2__Impl"
    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:846:1: rule__Diagram__Group__2__Impl : ( ( rule__Diagram__NameAssignment_2 ) ) ;
    public final void rule__Diagram__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:850:1: ( ( ( rule__Diagram__NameAssignment_2 ) ) )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:851:1: ( ( rule__Diagram__NameAssignment_2 ) )
            {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:851:1: ( ( rule__Diagram__NameAssignment_2 ) )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:852:1: ( rule__Diagram__NameAssignment_2 )
            {
             before(grammarAccess.getDiagramAccess().getNameAssignment_2()); 
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:853:1: ( rule__Diagram__NameAssignment_2 )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:853:2: rule__Diagram__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Diagram__NameAssignment_2_in_rule__Diagram__Group__2__Impl1761);
            rule__Diagram__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDiagramAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__Diagram__Group__2__Impl"


    // $ANTLR start "rule__Diagram__Group__3"
    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:863:1: rule__Diagram__Group__3 : rule__Diagram__Group__3__Impl rule__Diagram__Group__4 ;
    public final void rule__Diagram__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:867:1: ( rule__Diagram__Group__3__Impl rule__Diagram__Group__4 )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:868:2: rule__Diagram__Group__3__Impl rule__Diagram__Group__4
            {
            pushFollow(FOLLOW_rule__Diagram__Group__3__Impl_in_rule__Diagram__Group__31791);
            rule__Diagram__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Diagram__Group__4_in_rule__Diagram__Group__31794);
            rule__Diagram__Group__4();

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
    // $ANTLR end "rule__Diagram__Group__3"


    // $ANTLR start "rule__Diagram__Group__3__Impl"
    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:875:1: rule__Diagram__Group__3__Impl : ( '{' ) ;
    public final void rule__Diagram__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:879:1: ( ( '{' ) )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:880:1: ( '{' )
            {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:880:1: ( '{' )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:881:1: '{'
            {
             before(grammarAccess.getDiagramAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,18,FOLLOW_18_in_rule__Diagram__Group__3__Impl1822); 
             after(grammarAccess.getDiagramAccess().getLeftCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__Diagram__Group__3__Impl"


    // $ANTLR start "rule__Diagram__Group__4"
    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:894:1: rule__Diagram__Group__4 : rule__Diagram__Group__4__Impl rule__Diagram__Group__5 ;
    public final void rule__Diagram__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:898:1: ( rule__Diagram__Group__4__Impl rule__Diagram__Group__5 )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:899:2: rule__Diagram__Group__4__Impl rule__Diagram__Group__5
            {
            pushFollow(FOLLOW_rule__Diagram__Group__4__Impl_in_rule__Diagram__Group__41853);
            rule__Diagram__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Diagram__Group__5_in_rule__Diagram__Group__41856);
            rule__Diagram__Group__5();

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
    // $ANTLR end "rule__Diagram__Group__4"


    // $ANTLR start "rule__Diagram__Group__4__Impl"
    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:906:1: rule__Diagram__Group__4__Impl : ( ( rule__Diagram__IncludesAssignment_4 )* ) ;
    public final void rule__Diagram__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:910:1: ( ( ( rule__Diagram__IncludesAssignment_4 )* ) )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:911:1: ( ( rule__Diagram__IncludesAssignment_4 )* )
            {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:911:1: ( ( rule__Diagram__IncludesAssignment_4 )* )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:912:1: ( rule__Diagram__IncludesAssignment_4 )*
            {
             before(grammarAccess.getDiagramAccess().getIncludesAssignment_4()); 
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:913:1: ( rule__Diagram__IncludesAssignment_4 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==20) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:913:2: rule__Diagram__IncludesAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Diagram__IncludesAssignment_4_in_rule__Diagram__Group__4__Impl1883);
            	    rule__Diagram__IncludesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getDiagramAccess().getIncludesAssignment_4()); 

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
    // $ANTLR end "rule__Diagram__Group__4__Impl"


    // $ANTLR start "rule__Diagram__Group__5"
    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:923:1: rule__Diagram__Group__5 : rule__Diagram__Group__5__Impl ;
    public final void rule__Diagram__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:927:1: ( rule__Diagram__Group__5__Impl )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:928:2: rule__Diagram__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Diagram__Group__5__Impl_in_rule__Diagram__Group__51914);
            rule__Diagram__Group__5__Impl();

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
    // $ANTLR end "rule__Diagram__Group__5"


    // $ANTLR start "rule__Diagram__Group__5__Impl"
    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:934:1: rule__Diagram__Group__5__Impl : ( '}' ) ;
    public final void rule__Diagram__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:938:1: ( ( '}' ) )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:939:1: ( '}' )
            {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:939:1: ( '}' )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:940:1: '}'
            {
             before(grammarAccess.getDiagramAccess().getRightCurlyBracketKeyword_5()); 
            match(input,19,FOLLOW_19_in_rule__Diagram__Group__5__Impl1942); 
             after(grammarAccess.getDiagramAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__Diagram__Group__5__Impl"


    // $ANTLR start "rule__Include__Group__0"
    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:965:1: rule__Include__Group__0 : rule__Include__Group__0__Impl rule__Include__Group__1 ;
    public final void rule__Include__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:969:1: ( rule__Include__Group__0__Impl rule__Include__Group__1 )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:970:2: rule__Include__Group__0__Impl rule__Include__Group__1
            {
            pushFollow(FOLLOW_rule__Include__Group__0__Impl_in_rule__Include__Group__01985);
            rule__Include__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Include__Group__1_in_rule__Include__Group__01988);
            rule__Include__Group__1();

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
    // $ANTLR end "rule__Include__Group__0"


    // $ANTLR start "rule__Include__Group__0__Impl"
    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:977:1: rule__Include__Group__0__Impl : ( 'Include' ) ;
    public final void rule__Include__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:981:1: ( ( 'Include' ) )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:982:1: ( 'Include' )
            {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:982:1: ( 'Include' )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:983:1: 'Include'
            {
             before(grammarAccess.getIncludeAccess().getIncludeKeyword_0()); 
            match(input,20,FOLLOW_20_in_rule__Include__Group__0__Impl2016); 
             after(grammarAccess.getIncludeAccess().getIncludeKeyword_0()); 

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
    // $ANTLR end "rule__Include__Group__0__Impl"


    // $ANTLR start "rule__Include__Group__1"
    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:996:1: rule__Include__Group__1 : rule__Include__Group__1__Impl rule__Include__Group__2 ;
    public final void rule__Include__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1000:1: ( rule__Include__Group__1__Impl rule__Include__Group__2 )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1001:2: rule__Include__Group__1__Impl rule__Include__Group__2
            {
            pushFollow(FOLLOW_rule__Include__Group__1__Impl_in_rule__Include__Group__12047);
            rule__Include__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Include__Group__2_in_rule__Include__Group__12050);
            rule__Include__Group__2();

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
    // $ANTLR end "rule__Include__Group__1"


    // $ANTLR start "rule__Include__Group__1__Impl"
    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1008:1: rule__Include__Group__1__Impl : ( ( rule__Include__EntityAssignment_1 ) ) ;
    public final void rule__Include__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1012:1: ( ( ( rule__Include__EntityAssignment_1 ) ) )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1013:1: ( ( rule__Include__EntityAssignment_1 ) )
            {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1013:1: ( ( rule__Include__EntityAssignment_1 ) )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1014:1: ( rule__Include__EntityAssignment_1 )
            {
             before(grammarAccess.getIncludeAccess().getEntityAssignment_1()); 
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1015:1: ( rule__Include__EntityAssignment_1 )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1015:2: rule__Include__EntityAssignment_1
            {
            pushFollow(FOLLOW_rule__Include__EntityAssignment_1_in_rule__Include__Group__1__Impl2077);
            rule__Include__EntityAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getIncludeAccess().getEntityAssignment_1()); 

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
    // $ANTLR end "rule__Include__Group__1__Impl"


    // $ANTLR start "rule__Include__Group__2"
    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1025:1: rule__Include__Group__2 : rule__Include__Group__2__Impl ;
    public final void rule__Include__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1029:1: ( rule__Include__Group__2__Impl )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1030:2: rule__Include__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Include__Group__2__Impl_in_rule__Include__Group__22107);
            rule__Include__Group__2__Impl();

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
    // $ANTLR end "rule__Include__Group__2"


    // $ANTLR start "rule__Include__Group__2__Impl"
    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1036:1: rule__Include__Group__2__Impl : ( ( rule__Include__Group_2__0 )? ) ;
    public final void rule__Include__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1040:1: ( ( ( rule__Include__Group_2__0 )? ) )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1041:1: ( ( rule__Include__Group_2__0 )? )
            {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1041:1: ( ( rule__Include__Group_2__0 )? )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1042:1: ( rule__Include__Group_2__0 )?
            {
             before(grammarAccess.getIncludeAccess().getGroup_2()); 
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1043:1: ( rule__Include__Group_2__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==21) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1043:2: rule__Include__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Include__Group_2__0_in_rule__Include__Group__2__Impl2134);
                    rule__Include__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getIncludeAccess().getGroup_2()); 

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
    // $ANTLR end "rule__Include__Group__2__Impl"


    // $ANTLR start "rule__Include__Group_2__0"
    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1059:1: rule__Include__Group_2__0 : rule__Include__Group_2__0__Impl rule__Include__Group_2__1 ;
    public final void rule__Include__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1063:1: ( rule__Include__Group_2__0__Impl rule__Include__Group_2__1 )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1064:2: rule__Include__Group_2__0__Impl rule__Include__Group_2__1
            {
            pushFollow(FOLLOW_rule__Include__Group_2__0__Impl_in_rule__Include__Group_2__02171);
            rule__Include__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Include__Group_2__1_in_rule__Include__Group_2__02174);
            rule__Include__Group_2__1();

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
    // $ANTLR end "rule__Include__Group_2__0"


    // $ANTLR start "rule__Include__Group_2__0__Impl"
    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1071:1: rule__Include__Group_2__0__Impl : ( 'with' ) ;
    public final void rule__Include__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1075:1: ( ( 'with' ) )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1076:1: ( 'with' )
            {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1076:1: ( 'with' )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1077:1: 'with'
            {
             before(grammarAccess.getIncludeAccess().getWithKeyword_2_0()); 
            match(input,21,FOLLOW_21_in_rule__Include__Group_2__0__Impl2202); 
             after(grammarAccess.getIncludeAccess().getWithKeyword_2_0()); 

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
    // $ANTLR end "rule__Include__Group_2__0__Impl"


    // $ANTLR start "rule__Include__Group_2__1"
    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1090:1: rule__Include__Group_2__1 : rule__Include__Group_2__1__Impl rule__Include__Group_2__2 ;
    public final void rule__Include__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1094:1: ( rule__Include__Group_2__1__Impl rule__Include__Group_2__2 )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1095:2: rule__Include__Group_2__1__Impl rule__Include__Group_2__2
            {
            pushFollow(FOLLOW_rule__Include__Group_2__1__Impl_in_rule__Include__Group_2__12233);
            rule__Include__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Include__Group_2__2_in_rule__Include__Group_2__12236);
            rule__Include__Group_2__2();

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
    // $ANTLR end "rule__Include__Group_2__1"


    // $ANTLR start "rule__Include__Group_2__1__Impl"
    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1102:1: rule__Include__Group_2__1__Impl : ( '{' ) ;
    public final void rule__Include__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1106:1: ( ( '{' ) )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1107:1: ( '{' )
            {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1107:1: ( '{' )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1108:1: '{'
            {
             before(grammarAccess.getIncludeAccess().getLeftCurlyBracketKeyword_2_1()); 
            match(input,18,FOLLOW_18_in_rule__Include__Group_2__1__Impl2264); 
             after(grammarAccess.getIncludeAccess().getLeftCurlyBracketKeyword_2_1()); 

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
    // $ANTLR end "rule__Include__Group_2__1__Impl"


    // $ANTLR start "rule__Include__Group_2__2"
    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1121:1: rule__Include__Group_2__2 : rule__Include__Group_2__2__Impl rule__Include__Group_2__3 ;
    public final void rule__Include__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1125:1: ( rule__Include__Group_2__2__Impl rule__Include__Group_2__3 )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1126:2: rule__Include__Group_2__2__Impl rule__Include__Group_2__3
            {
            pushFollow(FOLLOW_rule__Include__Group_2__2__Impl_in_rule__Include__Group_2__22295);
            rule__Include__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Include__Group_2__3_in_rule__Include__Group_2__22298);
            rule__Include__Group_2__3();

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
    // $ANTLR end "rule__Include__Group_2__2"


    // $ANTLR start "rule__Include__Group_2__2__Impl"
    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1133:1: rule__Include__Group_2__2__Impl : ( ( rule__Include__FieldsAssignment_2_2 )* ) ;
    public final void rule__Include__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1137:1: ( ( ( rule__Include__FieldsAssignment_2_2 )* ) )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1138:1: ( ( rule__Include__FieldsAssignment_2_2 )* )
            {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1138:1: ( ( rule__Include__FieldsAssignment_2_2 )* )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1139:1: ( rule__Include__FieldsAssignment_2_2 )*
            {
             before(grammarAccess.getIncludeAccess().getFieldsAssignment_2_2()); 
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1140:1: ( rule__Include__FieldsAssignment_2_2 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1140:2: rule__Include__FieldsAssignment_2_2
            	    {
            	    pushFollow(FOLLOW_rule__Include__FieldsAssignment_2_2_in_rule__Include__Group_2__2__Impl2325);
            	    rule__Include__FieldsAssignment_2_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getIncludeAccess().getFieldsAssignment_2_2()); 

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
    // $ANTLR end "rule__Include__Group_2__2__Impl"


    // $ANTLR start "rule__Include__Group_2__3"
    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1150:1: rule__Include__Group_2__3 : rule__Include__Group_2__3__Impl ;
    public final void rule__Include__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1154:1: ( rule__Include__Group_2__3__Impl )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1155:2: rule__Include__Group_2__3__Impl
            {
            pushFollow(FOLLOW_rule__Include__Group_2__3__Impl_in_rule__Include__Group_2__32356);
            rule__Include__Group_2__3__Impl();

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
    // $ANTLR end "rule__Include__Group_2__3"


    // $ANTLR start "rule__Include__Group_2__3__Impl"
    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1161:1: rule__Include__Group_2__3__Impl : ( '}' ) ;
    public final void rule__Include__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1165:1: ( ( '}' ) )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1166:1: ( '}' )
            {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1166:1: ( '}' )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1167:1: '}'
            {
             before(grammarAccess.getIncludeAccess().getRightCurlyBracketKeyword_2_3()); 
            match(input,19,FOLLOW_19_in_rule__Include__Group_2__3__Impl2384); 
             after(grammarAccess.getIncludeAccess().getRightCurlyBracketKeyword_2_3()); 

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
    // $ANTLR end "rule__Include__Group_2__3__Impl"


    // $ANTLR start "rule__EnumDeclaration__Group__0"
    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1188:1: rule__EnumDeclaration__Group__0 : rule__EnumDeclaration__Group__0__Impl rule__EnumDeclaration__Group__1 ;
    public final void rule__EnumDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1192:1: ( rule__EnumDeclaration__Group__0__Impl rule__EnumDeclaration__Group__1 )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1193:2: rule__EnumDeclaration__Group__0__Impl rule__EnumDeclaration__Group__1
            {
            pushFollow(FOLLOW_rule__EnumDeclaration__Group__0__Impl_in_rule__EnumDeclaration__Group__02423);
            rule__EnumDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumDeclaration__Group__1_in_rule__EnumDeclaration__Group__02426);
            rule__EnumDeclaration__Group__1();

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
    // $ANTLR end "rule__EnumDeclaration__Group__0"


    // $ANTLR start "rule__EnumDeclaration__Group__0__Impl"
    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1200:1: rule__EnumDeclaration__Group__0__Impl : ( 'Enumeration' ) ;
    public final void rule__EnumDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1204:1: ( ( 'Enumeration' ) )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1205:1: ( 'Enumeration' )
            {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1205:1: ( 'Enumeration' )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1206:1: 'Enumeration'
            {
             before(grammarAccess.getEnumDeclarationAccess().getEnumerationKeyword_0()); 
            match(input,22,FOLLOW_22_in_rule__EnumDeclaration__Group__0__Impl2454); 
             after(grammarAccess.getEnumDeclarationAccess().getEnumerationKeyword_0()); 

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
    // $ANTLR end "rule__EnumDeclaration__Group__0__Impl"


    // $ANTLR start "rule__EnumDeclaration__Group__1"
    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1219:1: rule__EnumDeclaration__Group__1 : rule__EnumDeclaration__Group__1__Impl rule__EnumDeclaration__Group__2 ;
    public final void rule__EnumDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1223:1: ( rule__EnumDeclaration__Group__1__Impl rule__EnumDeclaration__Group__2 )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1224:2: rule__EnumDeclaration__Group__1__Impl rule__EnumDeclaration__Group__2
            {
            pushFollow(FOLLOW_rule__EnumDeclaration__Group__1__Impl_in_rule__EnumDeclaration__Group__12485);
            rule__EnumDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumDeclaration__Group__2_in_rule__EnumDeclaration__Group__12488);
            rule__EnumDeclaration__Group__2();

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
    // $ANTLR end "rule__EnumDeclaration__Group__1"


    // $ANTLR start "rule__EnumDeclaration__Group__1__Impl"
    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1231:1: rule__EnumDeclaration__Group__1__Impl : ( ( rule__EnumDeclaration__NameAssignment_1 ) ) ;
    public final void rule__EnumDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1235:1: ( ( ( rule__EnumDeclaration__NameAssignment_1 ) ) )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1236:1: ( ( rule__EnumDeclaration__NameAssignment_1 ) )
            {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1236:1: ( ( rule__EnumDeclaration__NameAssignment_1 ) )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1237:1: ( rule__EnumDeclaration__NameAssignment_1 )
            {
             before(grammarAccess.getEnumDeclarationAccess().getNameAssignment_1()); 
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1238:1: ( rule__EnumDeclaration__NameAssignment_1 )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1238:2: rule__EnumDeclaration__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__EnumDeclaration__NameAssignment_1_in_rule__EnumDeclaration__Group__1__Impl2515);
            rule__EnumDeclaration__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEnumDeclarationAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__EnumDeclaration__Group__1__Impl"


    // $ANTLR start "rule__EnumDeclaration__Group__2"
    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1248:1: rule__EnumDeclaration__Group__2 : rule__EnumDeclaration__Group__2__Impl rule__EnumDeclaration__Group__3 ;
    public final void rule__EnumDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1252:1: ( rule__EnumDeclaration__Group__2__Impl rule__EnumDeclaration__Group__3 )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1253:2: rule__EnumDeclaration__Group__2__Impl rule__EnumDeclaration__Group__3
            {
            pushFollow(FOLLOW_rule__EnumDeclaration__Group__2__Impl_in_rule__EnumDeclaration__Group__22545);
            rule__EnumDeclaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumDeclaration__Group__3_in_rule__EnumDeclaration__Group__22548);
            rule__EnumDeclaration__Group__3();

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
    // $ANTLR end "rule__EnumDeclaration__Group__2"


    // $ANTLR start "rule__EnumDeclaration__Group__2__Impl"
    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1260:1: rule__EnumDeclaration__Group__2__Impl : ( '{' ) ;
    public final void rule__EnumDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1264:1: ( ( '{' ) )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1265:1: ( '{' )
            {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1265:1: ( '{' )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1266:1: '{'
            {
             before(grammarAccess.getEnumDeclarationAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,18,FOLLOW_18_in_rule__EnumDeclaration__Group__2__Impl2576); 
             after(grammarAccess.getEnumDeclarationAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__EnumDeclaration__Group__2__Impl"


    // $ANTLR start "rule__EnumDeclaration__Group__3"
    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1279:1: rule__EnumDeclaration__Group__3 : rule__EnumDeclaration__Group__3__Impl rule__EnumDeclaration__Group__4 ;
    public final void rule__EnumDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1283:1: ( rule__EnumDeclaration__Group__3__Impl rule__EnumDeclaration__Group__4 )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1284:2: rule__EnumDeclaration__Group__3__Impl rule__EnumDeclaration__Group__4
            {
            pushFollow(FOLLOW_rule__EnumDeclaration__Group__3__Impl_in_rule__EnumDeclaration__Group__32607);
            rule__EnumDeclaration__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumDeclaration__Group__4_in_rule__EnumDeclaration__Group__32610);
            rule__EnumDeclaration__Group__4();

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
    // $ANTLR end "rule__EnumDeclaration__Group__3"


    // $ANTLR start "rule__EnumDeclaration__Group__3__Impl"
    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1291:1: rule__EnumDeclaration__Group__3__Impl : ( ( rule__EnumDeclaration__ValuesAssignment_3 ) ) ;
    public final void rule__EnumDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1295:1: ( ( ( rule__EnumDeclaration__ValuesAssignment_3 ) ) )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1296:1: ( ( rule__EnumDeclaration__ValuesAssignment_3 ) )
            {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1296:1: ( ( rule__EnumDeclaration__ValuesAssignment_3 ) )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1297:1: ( rule__EnumDeclaration__ValuesAssignment_3 )
            {
             before(grammarAccess.getEnumDeclarationAccess().getValuesAssignment_3()); 
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1298:1: ( rule__EnumDeclaration__ValuesAssignment_3 )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1298:2: rule__EnumDeclaration__ValuesAssignment_3
            {
            pushFollow(FOLLOW_rule__EnumDeclaration__ValuesAssignment_3_in_rule__EnumDeclaration__Group__3__Impl2637);
            rule__EnumDeclaration__ValuesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getEnumDeclarationAccess().getValuesAssignment_3()); 

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
    // $ANTLR end "rule__EnumDeclaration__Group__3__Impl"


    // $ANTLR start "rule__EnumDeclaration__Group__4"
    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1308:1: rule__EnumDeclaration__Group__4 : rule__EnumDeclaration__Group__4__Impl rule__EnumDeclaration__Group__5 ;
    public final void rule__EnumDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1312:1: ( rule__EnumDeclaration__Group__4__Impl rule__EnumDeclaration__Group__5 )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1313:2: rule__EnumDeclaration__Group__4__Impl rule__EnumDeclaration__Group__5
            {
            pushFollow(FOLLOW_rule__EnumDeclaration__Group__4__Impl_in_rule__EnumDeclaration__Group__42667);
            rule__EnumDeclaration__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumDeclaration__Group__5_in_rule__EnumDeclaration__Group__42670);
            rule__EnumDeclaration__Group__5();

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
    // $ANTLR end "rule__EnumDeclaration__Group__4"


    // $ANTLR start "rule__EnumDeclaration__Group__4__Impl"
    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1320:1: rule__EnumDeclaration__Group__4__Impl : ( ( rule__EnumDeclaration__Group_4__0 )* ) ;
    public final void rule__EnumDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1324:1: ( ( ( rule__EnumDeclaration__Group_4__0 )* ) )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1325:1: ( ( rule__EnumDeclaration__Group_4__0 )* )
            {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1325:1: ( ( rule__EnumDeclaration__Group_4__0 )* )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1326:1: ( rule__EnumDeclaration__Group_4__0 )*
            {
             before(grammarAccess.getEnumDeclarationAccess().getGroup_4()); 
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1327:1: ( rule__EnumDeclaration__Group_4__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==23) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1327:2: rule__EnumDeclaration__Group_4__0
            	    {
            	    pushFollow(FOLLOW_rule__EnumDeclaration__Group_4__0_in_rule__EnumDeclaration__Group__4__Impl2697);
            	    rule__EnumDeclaration__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getEnumDeclarationAccess().getGroup_4()); 

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
    // $ANTLR end "rule__EnumDeclaration__Group__4__Impl"


    // $ANTLR start "rule__EnumDeclaration__Group__5"
    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1337:1: rule__EnumDeclaration__Group__5 : rule__EnumDeclaration__Group__5__Impl ;
    public final void rule__EnumDeclaration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1341:1: ( rule__EnumDeclaration__Group__5__Impl )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1342:2: rule__EnumDeclaration__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__EnumDeclaration__Group__5__Impl_in_rule__EnumDeclaration__Group__52728);
            rule__EnumDeclaration__Group__5__Impl();

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
    // $ANTLR end "rule__EnumDeclaration__Group__5"


    // $ANTLR start "rule__EnumDeclaration__Group__5__Impl"
    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1348:1: rule__EnumDeclaration__Group__5__Impl : ( '}' ) ;
    public final void rule__EnumDeclaration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1352:1: ( ( '}' ) )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1353:1: ( '}' )
            {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1353:1: ( '}' )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1354:1: '}'
            {
             before(grammarAccess.getEnumDeclarationAccess().getRightCurlyBracketKeyword_5()); 
            match(input,19,FOLLOW_19_in_rule__EnumDeclaration__Group__5__Impl2756); 
             after(grammarAccess.getEnumDeclarationAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__EnumDeclaration__Group__5__Impl"


    // $ANTLR start "rule__EnumDeclaration__Group_4__0"
    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1379:1: rule__EnumDeclaration__Group_4__0 : rule__EnumDeclaration__Group_4__0__Impl rule__EnumDeclaration__Group_4__1 ;
    public final void rule__EnumDeclaration__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1383:1: ( rule__EnumDeclaration__Group_4__0__Impl rule__EnumDeclaration__Group_4__1 )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1384:2: rule__EnumDeclaration__Group_4__0__Impl rule__EnumDeclaration__Group_4__1
            {
            pushFollow(FOLLOW_rule__EnumDeclaration__Group_4__0__Impl_in_rule__EnumDeclaration__Group_4__02799);
            rule__EnumDeclaration__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumDeclaration__Group_4__1_in_rule__EnumDeclaration__Group_4__02802);
            rule__EnumDeclaration__Group_4__1();

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
    // $ANTLR end "rule__EnumDeclaration__Group_4__0"


    // $ANTLR start "rule__EnumDeclaration__Group_4__0__Impl"
    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1391:1: rule__EnumDeclaration__Group_4__0__Impl : ( ',' ) ;
    public final void rule__EnumDeclaration__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1395:1: ( ( ',' ) )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1396:1: ( ',' )
            {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1396:1: ( ',' )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1397:1: ','
            {
             before(grammarAccess.getEnumDeclarationAccess().getCommaKeyword_4_0()); 
            match(input,23,FOLLOW_23_in_rule__EnumDeclaration__Group_4__0__Impl2830); 
             after(grammarAccess.getEnumDeclarationAccess().getCommaKeyword_4_0()); 

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
    // $ANTLR end "rule__EnumDeclaration__Group_4__0__Impl"


    // $ANTLR start "rule__EnumDeclaration__Group_4__1"
    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1410:1: rule__EnumDeclaration__Group_4__1 : rule__EnumDeclaration__Group_4__1__Impl ;
    public final void rule__EnumDeclaration__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1414:1: ( rule__EnumDeclaration__Group_4__1__Impl )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1415:2: rule__EnumDeclaration__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__EnumDeclaration__Group_4__1__Impl_in_rule__EnumDeclaration__Group_4__12861);
            rule__EnumDeclaration__Group_4__1__Impl();

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
    // $ANTLR end "rule__EnumDeclaration__Group_4__1"


    // $ANTLR start "rule__EnumDeclaration__Group_4__1__Impl"
    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1421:1: rule__EnumDeclaration__Group_4__1__Impl : ( RULE_ID ) ;
    public final void rule__EnumDeclaration__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1425:1: ( ( RULE_ID ) )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1426:1: ( RULE_ID )
            {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1426:1: ( RULE_ID )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1427:1: RULE_ID
            {
             before(grammarAccess.getEnumDeclarationAccess().getIDTerminalRuleCall_4_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EnumDeclaration__Group_4__1__Impl2888); 
             after(grammarAccess.getEnumDeclarationAccess().getIDTerminalRuleCall_4_1()); 

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
    // $ANTLR end "rule__EnumDeclaration__Group_4__1__Impl"


    // $ANTLR start "rule__FQN__Group__0"
    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1442:1: rule__FQN__Group__0 : rule__FQN__Group__0__Impl rule__FQN__Group__1 ;
    public final void rule__FQN__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1446:1: ( rule__FQN__Group__0__Impl rule__FQN__Group__1 )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1447:2: rule__FQN__Group__0__Impl rule__FQN__Group__1
            {
            pushFollow(FOLLOW_rule__FQN__Group__0__Impl_in_rule__FQN__Group__02921);
            rule__FQN__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FQN__Group__1_in_rule__FQN__Group__02924);
            rule__FQN__Group__1();

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
    // $ANTLR end "rule__FQN__Group__0"


    // $ANTLR start "rule__FQN__Group__0__Impl"
    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1454:1: rule__FQN__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1458:1: ( ( RULE_ID ) )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1459:1: ( RULE_ID )
            {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1459:1: ( RULE_ID )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1460:1: RULE_ID
            {
             before(grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FQN__Group__0__Impl2951); 
             after(grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__FQN__Group__0__Impl"


    // $ANTLR start "rule__FQN__Group__1"
    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1471:1: rule__FQN__Group__1 : rule__FQN__Group__1__Impl ;
    public final void rule__FQN__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1475:1: ( rule__FQN__Group__1__Impl )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1476:2: rule__FQN__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__FQN__Group__1__Impl_in_rule__FQN__Group__12980);
            rule__FQN__Group__1__Impl();

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
    // $ANTLR end "rule__FQN__Group__1"


    // $ANTLR start "rule__FQN__Group__1__Impl"
    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1482:1: rule__FQN__Group__1__Impl : ( ( rule__FQN__Group_1__0 )* ) ;
    public final void rule__FQN__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1486:1: ( ( ( rule__FQN__Group_1__0 )* ) )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1487:1: ( ( rule__FQN__Group_1__0 )* )
            {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1487:1: ( ( rule__FQN__Group_1__0 )* )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1488:1: ( rule__FQN__Group_1__0 )*
            {
             before(grammarAccess.getFQNAccess().getGroup_1()); 
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1489:1: ( rule__FQN__Group_1__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==24) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1489:2: rule__FQN__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__FQN__Group_1__0_in_rule__FQN__Group__1__Impl3007);
            	    rule__FQN__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getFQNAccess().getGroup_1()); 

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
    // $ANTLR end "rule__FQN__Group__1__Impl"


    // $ANTLR start "rule__FQN__Group_1__0"
    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1503:1: rule__FQN__Group_1__0 : rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 ;
    public final void rule__FQN__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1507:1: ( rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1508:2: rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1
            {
            pushFollow(FOLLOW_rule__FQN__Group_1__0__Impl_in_rule__FQN__Group_1__03042);
            rule__FQN__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FQN__Group_1__1_in_rule__FQN__Group_1__03045);
            rule__FQN__Group_1__1();

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
    // $ANTLR end "rule__FQN__Group_1__0"


    // $ANTLR start "rule__FQN__Group_1__0__Impl"
    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1515:1: rule__FQN__Group_1__0__Impl : ( '.' ) ;
    public final void rule__FQN__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1519:1: ( ( '.' ) )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1520:1: ( '.' )
            {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1520:1: ( '.' )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1521:1: '.'
            {
             before(grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            match(input,24,FOLLOW_24_in_rule__FQN__Group_1__0__Impl3073); 
             after(grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 

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
    // $ANTLR end "rule__FQN__Group_1__0__Impl"


    // $ANTLR start "rule__FQN__Group_1__1"
    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1534:1: rule__FQN__Group_1__1 : rule__FQN__Group_1__1__Impl ;
    public final void rule__FQN__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1538:1: ( rule__FQN__Group_1__1__Impl )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1539:2: rule__FQN__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__FQN__Group_1__1__Impl_in_rule__FQN__Group_1__13104);
            rule__FQN__Group_1__1__Impl();

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
    // $ANTLR end "rule__FQN__Group_1__1"


    // $ANTLR start "rule__FQN__Group_1__1__Impl"
    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1545:1: rule__FQN__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1549:1: ( ( RULE_ID ) )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1550:1: ( RULE_ID )
            {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1550:1: ( RULE_ID )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1551:1: RULE_ID
            {
             before(grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FQN__Group_1__1__Impl3131); 
             after(grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); 

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
    // $ANTLR end "rule__FQN__Group_1__1__Impl"


    // $ANTLR start "rule__Entity__Group__0"
    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1566:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1570:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1571:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
            {
            pushFollow(FOLLOW_rule__Entity__Group__0__Impl_in_rule__Entity__Group__03164);
            rule__Entity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__1_in_rule__Entity__Group__03167);
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
    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1578:1: rule__Entity__Group__0__Impl : ( 'Entity' ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1582:1: ( ( 'Entity' ) )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1583:1: ( 'Entity' )
            {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1583:1: ( 'Entity' )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1584:1: 'Entity'
            {
             before(grammarAccess.getEntityAccess().getEntityKeyword_0()); 
            match(input,25,FOLLOW_25_in_rule__Entity__Group__0__Impl3195); 
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
    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1597:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1601:1: ( rule__Entity__Group__1__Impl rule__Entity__Group__2 )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1602:2: rule__Entity__Group__1__Impl rule__Entity__Group__2
            {
            pushFollow(FOLLOW_rule__Entity__Group__1__Impl_in_rule__Entity__Group__13226);
            rule__Entity__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__2_in_rule__Entity__Group__13229);
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
    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1609:1: rule__Entity__Group__1__Impl : ( ( rule__Entity__NameAssignment_1 ) ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1613:1: ( ( ( rule__Entity__NameAssignment_1 ) ) )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1614:1: ( ( rule__Entity__NameAssignment_1 ) )
            {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1614:1: ( ( rule__Entity__NameAssignment_1 ) )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1615:1: ( rule__Entity__NameAssignment_1 )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment_1()); 
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1616:1: ( rule__Entity__NameAssignment_1 )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1616:2: rule__Entity__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Entity__NameAssignment_1_in_rule__Entity__Group__1__Impl3256);
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
    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1626:1: rule__Entity__Group__2 : rule__Entity__Group__2__Impl rule__Entity__Group__3 ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1630:1: ( rule__Entity__Group__2__Impl rule__Entity__Group__3 )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1631:2: rule__Entity__Group__2__Impl rule__Entity__Group__3
            {
            pushFollow(FOLLOW_rule__Entity__Group__2__Impl_in_rule__Entity__Group__23286);
            rule__Entity__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__3_in_rule__Entity__Group__23289);
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
    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1638:1: rule__Entity__Group__2__Impl : ( '{' ) ;
    public final void rule__Entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1642:1: ( ( '{' ) )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1643:1: ( '{' )
            {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1643:1: ( '{' )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1644:1: '{'
            {
             before(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,18,FOLLOW_18_in_rule__Entity__Group__2__Impl3317); 
             after(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_2()); 

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
    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1657:1: rule__Entity__Group__3 : rule__Entity__Group__3__Impl rule__Entity__Group__4 ;
    public final void rule__Entity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1661:1: ( rule__Entity__Group__3__Impl rule__Entity__Group__4 )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1662:2: rule__Entity__Group__3__Impl rule__Entity__Group__4
            {
            pushFollow(FOLLOW_rule__Entity__Group__3__Impl_in_rule__Entity__Group__33348);
            rule__Entity__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__4_in_rule__Entity__Group__33351);
            rule__Entity__Group__4();

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
    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1669:1: rule__Entity__Group__3__Impl : ( ( rule__Entity__PropertiesAssignment_3 )* ) ;
    public final void rule__Entity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1673:1: ( ( ( rule__Entity__PropertiesAssignment_3 )* ) )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1674:1: ( ( rule__Entity__PropertiesAssignment_3 )* )
            {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1674:1: ( ( rule__Entity__PropertiesAssignment_3 )* )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1675:1: ( rule__Entity__PropertiesAssignment_3 )*
            {
             before(grammarAccess.getEntityAccess().getPropertiesAssignment_3()); 
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1676:1: ( rule__Entity__PropertiesAssignment_3 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==28||LA12_0==30) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1676:2: rule__Entity__PropertiesAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Entity__PropertiesAssignment_3_in_rule__Entity__Group__3__Impl3378);
            	    rule__Entity__PropertiesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getEntityAccess().getPropertiesAssignment_3()); 

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


    // $ANTLR start "rule__Entity__Group__4"
    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1686:1: rule__Entity__Group__4 : rule__Entity__Group__4__Impl ;
    public final void rule__Entity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1690:1: ( rule__Entity__Group__4__Impl )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1691:2: rule__Entity__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Entity__Group__4__Impl_in_rule__Entity__Group__43409);
            rule__Entity__Group__4__Impl();

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
    // $ANTLR end "rule__Entity__Group__4"


    // $ANTLR start "rule__Entity__Group__4__Impl"
    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1697:1: rule__Entity__Group__4__Impl : ( '}' ) ;
    public final void rule__Entity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1701:1: ( ( '}' ) )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1702:1: ( '}' )
            {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1702:1: ( '}' )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1703:1: '}'
            {
             before(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_4()); 
            match(input,19,FOLLOW_19_in_rule__Entity__Group__4__Impl3437); 
             after(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__Entity__Group__4__Impl"


    // $ANTLR start "rule__Domain__Group__0"
    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1726:1: rule__Domain__Group__0 : rule__Domain__Group__0__Impl rule__Domain__Group__1 ;
    public final void rule__Domain__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1730:1: ( rule__Domain__Group__0__Impl rule__Domain__Group__1 )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1731:2: rule__Domain__Group__0__Impl rule__Domain__Group__1
            {
            pushFollow(FOLLOW_rule__Domain__Group__0__Impl_in_rule__Domain__Group__03478);
            rule__Domain__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Domain__Group__1_in_rule__Domain__Group__03481);
            rule__Domain__Group__1();

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
    // $ANTLR end "rule__Domain__Group__0"


    // $ANTLR start "rule__Domain__Group__0__Impl"
    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1738:1: rule__Domain__Group__0__Impl : ( ( rule__Domain__ImportsAssignment_0 )* ) ;
    public final void rule__Domain__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1742:1: ( ( ( rule__Domain__ImportsAssignment_0 )* ) )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1743:1: ( ( rule__Domain__ImportsAssignment_0 )* )
            {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1743:1: ( ( rule__Domain__ImportsAssignment_0 )* )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1744:1: ( rule__Domain__ImportsAssignment_0 )*
            {
             before(grammarAccess.getDomainAccess().getImportsAssignment_0()); 
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1745:1: ( rule__Domain__ImportsAssignment_0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==15) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1745:2: rule__Domain__ImportsAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__Domain__ImportsAssignment_0_in_rule__Domain__Group__0__Impl3508);
            	    rule__Domain__ImportsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getDomainAccess().getImportsAssignment_0()); 

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
    // $ANTLR end "rule__Domain__Group__0__Impl"


    // $ANTLR start "rule__Domain__Group__1"
    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1755:1: rule__Domain__Group__1 : rule__Domain__Group__1__Impl rule__Domain__Group__2 ;
    public final void rule__Domain__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1759:1: ( rule__Domain__Group__1__Impl rule__Domain__Group__2 )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1760:2: rule__Domain__Group__1__Impl rule__Domain__Group__2
            {
            pushFollow(FOLLOW_rule__Domain__Group__1__Impl_in_rule__Domain__Group__13539);
            rule__Domain__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Domain__Group__2_in_rule__Domain__Group__13542);
            rule__Domain__Group__2();

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
    // $ANTLR end "rule__Domain__Group__1"


    // $ANTLR start "rule__Domain__Group__1__Impl"
    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1767:1: rule__Domain__Group__1__Impl : ( 'Domain' ) ;
    public final void rule__Domain__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1771:1: ( ( 'Domain' ) )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1772:1: ( 'Domain' )
            {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1772:1: ( 'Domain' )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1773:1: 'Domain'
            {
             before(grammarAccess.getDomainAccess().getDomainKeyword_1()); 
            match(input,26,FOLLOW_26_in_rule__Domain__Group__1__Impl3570); 
             after(grammarAccess.getDomainAccess().getDomainKeyword_1()); 

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
    // $ANTLR end "rule__Domain__Group__1__Impl"


    // $ANTLR start "rule__Domain__Group__2"
    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1786:1: rule__Domain__Group__2 : rule__Domain__Group__2__Impl rule__Domain__Group__3 ;
    public final void rule__Domain__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1790:1: ( rule__Domain__Group__2__Impl rule__Domain__Group__3 )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1791:2: rule__Domain__Group__2__Impl rule__Domain__Group__3
            {
            pushFollow(FOLLOW_rule__Domain__Group__2__Impl_in_rule__Domain__Group__23601);
            rule__Domain__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Domain__Group__3_in_rule__Domain__Group__23604);
            rule__Domain__Group__3();

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
    // $ANTLR end "rule__Domain__Group__2"


    // $ANTLR start "rule__Domain__Group__2__Impl"
    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1798:1: rule__Domain__Group__2__Impl : ( ( rule__Domain__NameAssignment_2 ) ) ;
    public final void rule__Domain__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1802:1: ( ( ( rule__Domain__NameAssignment_2 ) ) )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1803:1: ( ( rule__Domain__NameAssignment_2 ) )
            {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1803:1: ( ( rule__Domain__NameAssignment_2 ) )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1804:1: ( rule__Domain__NameAssignment_2 )
            {
             before(grammarAccess.getDomainAccess().getNameAssignment_2()); 
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1805:1: ( rule__Domain__NameAssignment_2 )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1805:2: rule__Domain__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Domain__NameAssignment_2_in_rule__Domain__Group__2__Impl3631);
            rule__Domain__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDomainAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__Domain__Group__2__Impl"


    // $ANTLR start "rule__Domain__Group__3"
    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1815:1: rule__Domain__Group__3 : rule__Domain__Group__3__Impl rule__Domain__Group__4 ;
    public final void rule__Domain__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1819:1: ( rule__Domain__Group__3__Impl rule__Domain__Group__4 )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1820:2: rule__Domain__Group__3__Impl rule__Domain__Group__4
            {
            pushFollow(FOLLOW_rule__Domain__Group__3__Impl_in_rule__Domain__Group__33661);
            rule__Domain__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Domain__Group__4_in_rule__Domain__Group__33664);
            rule__Domain__Group__4();

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
    // $ANTLR end "rule__Domain__Group__3"


    // $ANTLR start "rule__Domain__Group__3__Impl"
    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1827:1: rule__Domain__Group__3__Impl : ( 'Description: ' ) ;
    public final void rule__Domain__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1831:1: ( ( 'Description: ' ) )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1832:1: ( 'Description: ' )
            {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1832:1: ( 'Description: ' )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1833:1: 'Description: '
            {
             before(grammarAccess.getDomainAccess().getDescriptionKeyword_3()); 
            match(input,27,FOLLOW_27_in_rule__Domain__Group__3__Impl3692); 
             after(grammarAccess.getDomainAccess().getDescriptionKeyword_3()); 

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
    // $ANTLR end "rule__Domain__Group__3__Impl"


    // $ANTLR start "rule__Domain__Group__4"
    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1846:1: rule__Domain__Group__4 : rule__Domain__Group__4__Impl rule__Domain__Group__5 ;
    public final void rule__Domain__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1850:1: ( rule__Domain__Group__4__Impl rule__Domain__Group__5 )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1851:2: rule__Domain__Group__4__Impl rule__Domain__Group__5
            {
            pushFollow(FOLLOW_rule__Domain__Group__4__Impl_in_rule__Domain__Group__43723);
            rule__Domain__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Domain__Group__5_in_rule__Domain__Group__43726);
            rule__Domain__Group__5();

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
    // $ANTLR end "rule__Domain__Group__4"


    // $ANTLR start "rule__Domain__Group__4__Impl"
    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1858:1: rule__Domain__Group__4__Impl : ( ( rule__Domain__DescriptionAssignment_4 ) ) ;
    public final void rule__Domain__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1862:1: ( ( ( rule__Domain__DescriptionAssignment_4 ) ) )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1863:1: ( ( rule__Domain__DescriptionAssignment_4 ) )
            {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1863:1: ( ( rule__Domain__DescriptionAssignment_4 ) )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1864:1: ( rule__Domain__DescriptionAssignment_4 )
            {
             before(grammarAccess.getDomainAccess().getDescriptionAssignment_4()); 
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1865:1: ( rule__Domain__DescriptionAssignment_4 )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1865:2: rule__Domain__DescriptionAssignment_4
            {
            pushFollow(FOLLOW_rule__Domain__DescriptionAssignment_4_in_rule__Domain__Group__4__Impl3753);
            rule__Domain__DescriptionAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getDomainAccess().getDescriptionAssignment_4()); 

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
    // $ANTLR end "rule__Domain__Group__4__Impl"


    // $ANTLR start "rule__Domain__Group__5"
    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1875:1: rule__Domain__Group__5 : rule__Domain__Group__5__Impl rule__Domain__Group__6 ;
    public final void rule__Domain__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1879:1: ( rule__Domain__Group__5__Impl rule__Domain__Group__6 )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1880:2: rule__Domain__Group__5__Impl rule__Domain__Group__6
            {
            pushFollow(FOLLOW_rule__Domain__Group__5__Impl_in_rule__Domain__Group__53783);
            rule__Domain__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Domain__Group__6_in_rule__Domain__Group__53786);
            rule__Domain__Group__6();

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
    // $ANTLR end "rule__Domain__Group__5"


    // $ANTLR start "rule__Domain__Group__5__Impl"
    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1887:1: rule__Domain__Group__5__Impl : ( '{' ) ;
    public final void rule__Domain__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1891:1: ( ( '{' ) )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1892:1: ( '{' )
            {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1892:1: ( '{' )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1893:1: '{'
            {
             before(grammarAccess.getDomainAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,18,FOLLOW_18_in_rule__Domain__Group__5__Impl3814); 
             after(grammarAccess.getDomainAccess().getLeftCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__Domain__Group__5__Impl"


    // $ANTLR start "rule__Domain__Group__6"
    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1906:1: rule__Domain__Group__6 : rule__Domain__Group__6__Impl rule__Domain__Group__7 ;
    public final void rule__Domain__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1910:1: ( rule__Domain__Group__6__Impl rule__Domain__Group__7 )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1911:2: rule__Domain__Group__6__Impl rule__Domain__Group__7
            {
            pushFollow(FOLLOW_rule__Domain__Group__6__Impl_in_rule__Domain__Group__63845);
            rule__Domain__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Domain__Group__7_in_rule__Domain__Group__63848);
            rule__Domain__Group__7();

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
    // $ANTLR end "rule__Domain__Group__6"


    // $ANTLR start "rule__Domain__Group__6__Impl"
    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1918:1: rule__Domain__Group__6__Impl : ( ( ( rule__Domain__EntitiesAssignment_6 ) ) ( ( rule__Domain__EntitiesAssignment_6 )* ) ) ;
    public final void rule__Domain__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1922:1: ( ( ( ( rule__Domain__EntitiesAssignment_6 ) ) ( ( rule__Domain__EntitiesAssignment_6 )* ) ) )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1923:1: ( ( ( rule__Domain__EntitiesAssignment_6 ) ) ( ( rule__Domain__EntitiesAssignment_6 )* ) )
            {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1923:1: ( ( ( rule__Domain__EntitiesAssignment_6 ) ) ( ( rule__Domain__EntitiesAssignment_6 )* ) )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1924:1: ( ( rule__Domain__EntitiesAssignment_6 ) ) ( ( rule__Domain__EntitiesAssignment_6 )* )
            {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1924:1: ( ( rule__Domain__EntitiesAssignment_6 ) )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1925:1: ( rule__Domain__EntitiesAssignment_6 )
            {
             before(grammarAccess.getDomainAccess().getEntitiesAssignment_6()); 
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1926:1: ( rule__Domain__EntitiesAssignment_6 )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1926:2: rule__Domain__EntitiesAssignment_6
            {
            pushFollow(FOLLOW_rule__Domain__EntitiesAssignment_6_in_rule__Domain__Group__6__Impl3877);
            rule__Domain__EntitiesAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getDomainAccess().getEntitiesAssignment_6()); 

            }

            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1929:1: ( ( rule__Domain__EntitiesAssignment_6 )* )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1930:1: ( rule__Domain__EntitiesAssignment_6 )*
            {
             before(grammarAccess.getDomainAccess().getEntitiesAssignment_6()); 
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1931:1: ( rule__Domain__EntitiesAssignment_6 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==25) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1931:2: rule__Domain__EntitiesAssignment_6
            	    {
            	    pushFollow(FOLLOW_rule__Domain__EntitiesAssignment_6_in_rule__Domain__Group__6__Impl3889);
            	    rule__Domain__EntitiesAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getDomainAccess().getEntitiesAssignment_6()); 

            }


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
    // $ANTLR end "rule__Domain__Group__6__Impl"


    // $ANTLR start "rule__Domain__Group__7"
    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1942:1: rule__Domain__Group__7 : rule__Domain__Group__7__Impl ;
    public final void rule__Domain__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1946:1: ( rule__Domain__Group__7__Impl )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1947:2: rule__Domain__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__Domain__Group__7__Impl_in_rule__Domain__Group__73922);
            rule__Domain__Group__7__Impl();

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
    // $ANTLR end "rule__Domain__Group__7"


    // $ANTLR start "rule__Domain__Group__7__Impl"
    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1953:1: rule__Domain__Group__7__Impl : ( '}' ) ;
    public final void rule__Domain__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1957:1: ( ( '}' ) )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1958:1: ( '}' )
            {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1958:1: ( '}' )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1959:1: '}'
            {
             before(grammarAccess.getDomainAccess().getRightCurlyBracketKeyword_7()); 
            match(input,19,FOLLOW_19_in_rule__Domain__Group__7__Impl3950); 
             after(grammarAccess.getDomainAccess().getRightCurlyBracketKeyword_7()); 

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
    // $ANTLR end "rule__Domain__Group__7__Impl"


    // $ANTLR start "rule__Association__Group__0"
    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1988:1: rule__Association__Group__0 : rule__Association__Group__0__Impl rule__Association__Group__1 ;
    public final void rule__Association__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1992:1: ( rule__Association__Group__0__Impl rule__Association__Group__1 )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:1993:2: rule__Association__Group__0__Impl rule__Association__Group__1
            {
            pushFollow(FOLLOW_rule__Association__Group__0__Impl_in_rule__Association__Group__03997);
            rule__Association__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Association__Group__1_in_rule__Association__Group__04000);
            rule__Association__Group__1();

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
    // $ANTLR end "rule__Association__Group__0"


    // $ANTLR start "rule__Association__Group__0__Impl"
    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2000:1: rule__Association__Group__0__Impl : ( 'Relation' ) ;
    public final void rule__Association__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2004:1: ( ( 'Relation' ) )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2005:1: ( 'Relation' )
            {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2005:1: ( 'Relation' )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2006:1: 'Relation'
            {
             before(grammarAccess.getAssociationAccess().getRelationKeyword_0()); 
            match(input,28,FOLLOW_28_in_rule__Association__Group__0__Impl4028); 
             after(grammarAccess.getAssociationAccess().getRelationKeyword_0()); 

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
    // $ANTLR end "rule__Association__Group__0__Impl"


    // $ANTLR start "rule__Association__Group__1"
    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2019:1: rule__Association__Group__1 : rule__Association__Group__1__Impl rule__Association__Group__2 ;
    public final void rule__Association__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2023:1: ( rule__Association__Group__1__Impl rule__Association__Group__2 )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2024:2: rule__Association__Group__1__Impl rule__Association__Group__2
            {
            pushFollow(FOLLOW_rule__Association__Group__1__Impl_in_rule__Association__Group__14059);
            rule__Association__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Association__Group__2_in_rule__Association__Group__14062);
            rule__Association__Group__2();

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
    // $ANTLR end "rule__Association__Group__1"


    // $ANTLR start "rule__Association__Group__1__Impl"
    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2031:1: rule__Association__Group__1__Impl : ( ( rule__Association__MultiplicityAssignment_1 ) ) ;
    public final void rule__Association__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2035:1: ( ( ( rule__Association__MultiplicityAssignment_1 ) ) )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2036:1: ( ( rule__Association__MultiplicityAssignment_1 ) )
            {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2036:1: ( ( rule__Association__MultiplicityAssignment_1 ) )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2037:1: ( rule__Association__MultiplicityAssignment_1 )
            {
             before(grammarAccess.getAssociationAccess().getMultiplicityAssignment_1()); 
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2038:1: ( rule__Association__MultiplicityAssignment_1 )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2038:2: rule__Association__MultiplicityAssignment_1
            {
            pushFollow(FOLLOW_rule__Association__MultiplicityAssignment_1_in_rule__Association__Group__1__Impl4089);
            rule__Association__MultiplicityAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAssociationAccess().getMultiplicityAssignment_1()); 

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
    // $ANTLR end "rule__Association__Group__1__Impl"


    // $ANTLR start "rule__Association__Group__2"
    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2048:1: rule__Association__Group__2 : rule__Association__Group__2__Impl rule__Association__Group__3 ;
    public final void rule__Association__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2052:1: ( rule__Association__Group__2__Impl rule__Association__Group__3 )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2053:2: rule__Association__Group__2__Impl rule__Association__Group__3
            {
            pushFollow(FOLLOW_rule__Association__Group__2__Impl_in_rule__Association__Group__24119);
            rule__Association__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Association__Group__3_in_rule__Association__Group__24122);
            rule__Association__Group__3();

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
    // $ANTLR end "rule__Association__Group__2"


    // $ANTLR start "rule__Association__Group__2__Impl"
    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2060:1: rule__Association__Group__2__Impl : ( ( rule__Association__NameAssignment_2 ) ) ;
    public final void rule__Association__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2064:1: ( ( ( rule__Association__NameAssignment_2 ) ) )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2065:1: ( ( rule__Association__NameAssignment_2 ) )
            {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2065:1: ( ( rule__Association__NameAssignment_2 ) )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2066:1: ( rule__Association__NameAssignment_2 )
            {
             before(grammarAccess.getAssociationAccess().getNameAssignment_2()); 
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2067:1: ( rule__Association__NameAssignment_2 )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2067:2: rule__Association__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Association__NameAssignment_2_in_rule__Association__Group__2__Impl4149);
            rule__Association__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAssociationAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__Association__Group__2__Impl"


    // $ANTLR start "rule__Association__Group__3"
    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2077:1: rule__Association__Group__3 : rule__Association__Group__3__Impl rule__Association__Group__4 ;
    public final void rule__Association__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2081:1: ( rule__Association__Group__3__Impl rule__Association__Group__4 )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2082:2: rule__Association__Group__3__Impl rule__Association__Group__4
            {
            pushFollow(FOLLOW_rule__Association__Group__3__Impl_in_rule__Association__Group__34179);
            rule__Association__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Association__Group__4_in_rule__Association__Group__34182);
            rule__Association__Group__4();

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
    // $ANTLR end "rule__Association__Group__3"


    // $ANTLR start "rule__Association__Group__3__Impl"
    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2089:1: rule__Association__Group__3__Impl : ( ':' ) ;
    public final void rule__Association__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2093:1: ( ( ':' ) )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2094:1: ( ':' )
            {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2094:1: ( ':' )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2095:1: ':'
            {
             before(grammarAccess.getAssociationAccess().getColonKeyword_3()); 
            match(input,29,FOLLOW_29_in_rule__Association__Group__3__Impl4210); 
             after(grammarAccess.getAssociationAccess().getColonKeyword_3()); 

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
    // $ANTLR end "rule__Association__Group__3__Impl"


    // $ANTLR start "rule__Association__Group__4"
    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2108:1: rule__Association__Group__4 : rule__Association__Group__4__Impl ;
    public final void rule__Association__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2112:1: ( rule__Association__Group__4__Impl )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2113:2: rule__Association__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Association__Group__4__Impl_in_rule__Association__Group__44241);
            rule__Association__Group__4__Impl();

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
    // $ANTLR end "rule__Association__Group__4"


    // $ANTLR start "rule__Association__Group__4__Impl"
    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2119:1: rule__Association__Group__4__Impl : ( ( rule__Association__TypeAssignment_4 ) ) ;
    public final void rule__Association__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2123:1: ( ( ( rule__Association__TypeAssignment_4 ) ) )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2124:1: ( ( rule__Association__TypeAssignment_4 ) )
            {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2124:1: ( ( rule__Association__TypeAssignment_4 ) )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2125:1: ( rule__Association__TypeAssignment_4 )
            {
             before(grammarAccess.getAssociationAccess().getTypeAssignment_4()); 
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2126:1: ( rule__Association__TypeAssignment_4 )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2126:2: rule__Association__TypeAssignment_4
            {
            pushFollow(FOLLOW_rule__Association__TypeAssignment_4_in_rule__Association__Group__4__Impl4268);
            rule__Association__TypeAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getAssociationAccess().getTypeAssignment_4()); 

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
    // $ANTLR end "rule__Association__Group__4__Impl"


    // $ANTLR start "rule__Field__Group__0"
    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2146:1: rule__Field__Group__0 : rule__Field__Group__0__Impl rule__Field__Group__1 ;
    public final void rule__Field__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2150:1: ( rule__Field__Group__0__Impl rule__Field__Group__1 )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2151:2: rule__Field__Group__0__Impl rule__Field__Group__1
            {
            pushFollow(FOLLOW_rule__Field__Group__0__Impl_in_rule__Field__Group__04308);
            rule__Field__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group__1_in_rule__Field__Group__04311);
            rule__Field__Group__1();

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
    // $ANTLR end "rule__Field__Group__0"


    // $ANTLR start "rule__Field__Group__0__Impl"
    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2158:1: rule__Field__Group__0__Impl : ( 'Field' ) ;
    public final void rule__Field__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2162:1: ( ( 'Field' ) )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2163:1: ( 'Field' )
            {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2163:1: ( 'Field' )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2164:1: 'Field'
            {
             before(grammarAccess.getFieldAccess().getFieldKeyword_0()); 
            match(input,30,FOLLOW_30_in_rule__Field__Group__0__Impl4339); 
             after(grammarAccess.getFieldAccess().getFieldKeyword_0()); 

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
    // $ANTLR end "rule__Field__Group__0__Impl"


    // $ANTLR start "rule__Field__Group__1"
    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2177:1: rule__Field__Group__1 : rule__Field__Group__1__Impl rule__Field__Group__2 ;
    public final void rule__Field__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2181:1: ( rule__Field__Group__1__Impl rule__Field__Group__2 )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2182:2: rule__Field__Group__1__Impl rule__Field__Group__2
            {
            pushFollow(FOLLOW_rule__Field__Group__1__Impl_in_rule__Field__Group__14370);
            rule__Field__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group__2_in_rule__Field__Group__14373);
            rule__Field__Group__2();

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
    // $ANTLR end "rule__Field__Group__1"


    // $ANTLR start "rule__Field__Group__1__Impl"
    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2189:1: rule__Field__Group__1__Impl : ( ( rule__Field__NameAssignment_1 ) ) ;
    public final void rule__Field__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2193:1: ( ( ( rule__Field__NameAssignment_1 ) ) )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2194:1: ( ( rule__Field__NameAssignment_1 ) )
            {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2194:1: ( ( rule__Field__NameAssignment_1 ) )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2195:1: ( rule__Field__NameAssignment_1 )
            {
             before(grammarAccess.getFieldAccess().getNameAssignment_1()); 
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2196:1: ( rule__Field__NameAssignment_1 )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2196:2: rule__Field__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Field__NameAssignment_1_in_rule__Field__Group__1__Impl4400);
            rule__Field__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFieldAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Field__Group__1__Impl"


    // $ANTLR start "rule__Field__Group__2"
    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2206:1: rule__Field__Group__2 : rule__Field__Group__2__Impl rule__Field__Group__3 ;
    public final void rule__Field__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2210:1: ( rule__Field__Group__2__Impl rule__Field__Group__3 )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2211:2: rule__Field__Group__2__Impl rule__Field__Group__3
            {
            pushFollow(FOLLOW_rule__Field__Group__2__Impl_in_rule__Field__Group__24430);
            rule__Field__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group__3_in_rule__Field__Group__24433);
            rule__Field__Group__3();

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
    // $ANTLR end "rule__Field__Group__2"


    // $ANTLR start "rule__Field__Group__2__Impl"
    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2218:1: rule__Field__Group__2__Impl : ( ':' ) ;
    public final void rule__Field__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2222:1: ( ( ':' ) )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2223:1: ( ':' )
            {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2223:1: ( ':' )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2224:1: ':'
            {
             before(grammarAccess.getFieldAccess().getColonKeyword_2()); 
            match(input,29,FOLLOW_29_in_rule__Field__Group__2__Impl4461); 
             after(grammarAccess.getFieldAccess().getColonKeyword_2()); 

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
    // $ANTLR end "rule__Field__Group__2__Impl"


    // $ANTLR start "rule__Field__Group__3"
    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2237:1: rule__Field__Group__3 : rule__Field__Group__3__Impl ;
    public final void rule__Field__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2241:1: ( rule__Field__Group__3__Impl )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2242:2: rule__Field__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Field__Group__3__Impl_in_rule__Field__Group__34492);
            rule__Field__Group__3__Impl();

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
    // $ANTLR end "rule__Field__Group__3"


    // $ANTLR start "rule__Field__Group__3__Impl"
    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2248:1: rule__Field__Group__3__Impl : ( ( rule__Field__LiteralAssignment_3 ) ) ;
    public final void rule__Field__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2252:1: ( ( ( rule__Field__LiteralAssignment_3 ) ) )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2253:1: ( ( rule__Field__LiteralAssignment_3 ) )
            {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2253:1: ( ( rule__Field__LiteralAssignment_3 ) )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2254:1: ( rule__Field__LiteralAssignment_3 )
            {
             before(grammarAccess.getFieldAccess().getLiteralAssignment_3()); 
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2255:1: ( rule__Field__LiteralAssignment_3 )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2255:2: rule__Field__LiteralAssignment_3
            {
            pushFollow(FOLLOW_rule__Field__LiteralAssignment_3_in_rule__Field__Group__3__Impl4519);
            rule__Field__LiteralAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getFieldAccess().getLiteralAssignment_3()); 

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
    // $ANTLR end "rule__Field__Group__3__Impl"


    // $ANTLR start "rule__Literal__Group_0__0"
    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2273:1: rule__Literal__Group_0__0 : rule__Literal__Group_0__0__Impl rule__Literal__Group_0__1 ;
    public final void rule__Literal__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2277:1: ( rule__Literal__Group_0__0__Impl rule__Literal__Group_0__1 )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2278:2: rule__Literal__Group_0__0__Impl rule__Literal__Group_0__1
            {
            pushFollow(FOLLOW_rule__Literal__Group_0__0__Impl_in_rule__Literal__Group_0__04557);
            rule__Literal__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Literal__Group_0__1_in_rule__Literal__Group_0__04560);
            rule__Literal__Group_0__1();

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
    // $ANTLR end "rule__Literal__Group_0__0"


    // $ANTLR start "rule__Literal__Group_0__0__Impl"
    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2285:1: rule__Literal__Group_0__0__Impl : ( () ) ;
    public final void rule__Literal__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2289:1: ( ( () ) )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2290:1: ( () )
            {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2290:1: ( () )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2291:1: ()
            {
             before(grammarAccess.getLiteralAccess().getLiteralAction_0_0()); 
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2292:1: ()
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2294:1: 
            {
            }

             after(grammarAccess.getLiteralAccess().getLiteralAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Group_0__0__Impl"


    // $ANTLR start "rule__Literal__Group_0__1"
    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2304:1: rule__Literal__Group_0__1 : rule__Literal__Group_0__1__Impl ;
    public final void rule__Literal__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2308:1: ( rule__Literal__Group_0__1__Impl )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2309:2: rule__Literal__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Literal__Group_0__1__Impl_in_rule__Literal__Group_0__14618);
            rule__Literal__Group_0__1__Impl();

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
    // $ANTLR end "rule__Literal__Group_0__1"


    // $ANTLR start "rule__Literal__Group_0__1__Impl"
    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2315:1: rule__Literal__Group_0__1__Impl : ( 'Decimal' ) ;
    public final void rule__Literal__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2319:1: ( ( 'Decimal' ) )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2320:1: ( 'Decimal' )
            {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2320:1: ( 'Decimal' )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2321:1: 'Decimal'
            {
             before(grammarAccess.getLiteralAccess().getDecimalKeyword_0_1()); 
            match(input,31,FOLLOW_31_in_rule__Literal__Group_0__1__Impl4646); 
             after(grammarAccess.getLiteralAccess().getDecimalKeyword_0_1()); 

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
    // $ANTLR end "rule__Literal__Group_0__1__Impl"


    // $ANTLR start "rule__Literal__Group_1__0"
    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2338:1: rule__Literal__Group_1__0 : rule__Literal__Group_1__0__Impl rule__Literal__Group_1__1 ;
    public final void rule__Literal__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2342:1: ( rule__Literal__Group_1__0__Impl rule__Literal__Group_1__1 )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2343:2: rule__Literal__Group_1__0__Impl rule__Literal__Group_1__1
            {
            pushFollow(FOLLOW_rule__Literal__Group_1__0__Impl_in_rule__Literal__Group_1__04681);
            rule__Literal__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Literal__Group_1__1_in_rule__Literal__Group_1__04684);
            rule__Literal__Group_1__1();

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
    // $ANTLR end "rule__Literal__Group_1__0"


    // $ANTLR start "rule__Literal__Group_1__0__Impl"
    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2350:1: rule__Literal__Group_1__0__Impl : ( () ) ;
    public final void rule__Literal__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2354:1: ( ( () ) )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2355:1: ( () )
            {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2355:1: ( () )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2356:1: ()
            {
             before(grammarAccess.getLiteralAccess().getLiteralAction_1_0()); 
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2357:1: ()
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2359:1: 
            {
            }

             after(grammarAccess.getLiteralAccess().getLiteralAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Group_1__0__Impl"


    // $ANTLR start "rule__Literal__Group_1__1"
    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2369:1: rule__Literal__Group_1__1 : rule__Literal__Group_1__1__Impl ;
    public final void rule__Literal__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2373:1: ( rule__Literal__Group_1__1__Impl )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2374:2: rule__Literal__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Literal__Group_1__1__Impl_in_rule__Literal__Group_1__14742);
            rule__Literal__Group_1__1__Impl();

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
    // $ANTLR end "rule__Literal__Group_1__1"


    // $ANTLR start "rule__Literal__Group_1__1__Impl"
    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2380:1: rule__Literal__Group_1__1__Impl : ( 'Geld' ) ;
    public final void rule__Literal__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2384:1: ( ( 'Geld' ) )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2385:1: ( 'Geld' )
            {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2385:1: ( 'Geld' )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2386:1: 'Geld'
            {
             before(grammarAccess.getLiteralAccess().getGeldKeyword_1_1()); 
            match(input,32,FOLLOW_32_in_rule__Literal__Group_1__1__Impl4770); 
             after(grammarAccess.getLiteralAccess().getGeldKeyword_1_1()); 

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
    // $ANTLR end "rule__Literal__Group_1__1__Impl"


    // $ANTLR start "rule__Literal__Group_2__0"
    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2403:1: rule__Literal__Group_2__0 : rule__Literal__Group_2__0__Impl rule__Literal__Group_2__1 ;
    public final void rule__Literal__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2407:1: ( rule__Literal__Group_2__0__Impl rule__Literal__Group_2__1 )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2408:2: rule__Literal__Group_2__0__Impl rule__Literal__Group_2__1
            {
            pushFollow(FOLLOW_rule__Literal__Group_2__0__Impl_in_rule__Literal__Group_2__04805);
            rule__Literal__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Literal__Group_2__1_in_rule__Literal__Group_2__04808);
            rule__Literal__Group_2__1();

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
    // $ANTLR end "rule__Literal__Group_2__0"


    // $ANTLR start "rule__Literal__Group_2__0__Impl"
    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2415:1: rule__Literal__Group_2__0__Impl : ( () ) ;
    public final void rule__Literal__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2419:1: ( ( () ) )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2420:1: ( () )
            {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2420:1: ( () )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2421:1: ()
            {
             before(grammarAccess.getLiteralAccess().getLiteralAction_2_0()); 
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2422:1: ()
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2424:1: 
            {
            }

             after(grammarAccess.getLiteralAccess().getLiteralAction_2_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Group_2__0__Impl"


    // $ANTLR start "rule__Literal__Group_2__1"
    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2434:1: rule__Literal__Group_2__1 : rule__Literal__Group_2__1__Impl ;
    public final void rule__Literal__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2438:1: ( rule__Literal__Group_2__1__Impl )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2439:2: rule__Literal__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Literal__Group_2__1__Impl_in_rule__Literal__Group_2__14866);
            rule__Literal__Group_2__1__Impl();

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
    // $ANTLR end "rule__Literal__Group_2__1"


    // $ANTLR start "rule__Literal__Group_2__1__Impl"
    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2445:1: rule__Literal__Group_2__1__Impl : ( 'Text' ) ;
    public final void rule__Literal__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2449:1: ( ( 'Text' ) )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2450:1: ( 'Text' )
            {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2450:1: ( 'Text' )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2451:1: 'Text'
            {
             before(grammarAccess.getLiteralAccess().getTextKeyword_2_1()); 
            match(input,33,FOLLOW_33_in_rule__Literal__Group_2__1__Impl4894); 
             after(grammarAccess.getLiteralAccess().getTextKeyword_2_1()); 

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
    // $ANTLR end "rule__Literal__Group_2__1__Impl"


    // $ANTLR start "rule__Literal__Group_3__0"
    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2468:1: rule__Literal__Group_3__0 : rule__Literal__Group_3__0__Impl rule__Literal__Group_3__1 ;
    public final void rule__Literal__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2472:1: ( rule__Literal__Group_3__0__Impl rule__Literal__Group_3__1 )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2473:2: rule__Literal__Group_3__0__Impl rule__Literal__Group_3__1
            {
            pushFollow(FOLLOW_rule__Literal__Group_3__0__Impl_in_rule__Literal__Group_3__04929);
            rule__Literal__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Literal__Group_3__1_in_rule__Literal__Group_3__04932);
            rule__Literal__Group_3__1();

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
    // $ANTLR end "rule__Literal__Group_3__0"


    // $ANTLR start "rule__Literal__Group_3__0__Impl"
    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2480:1: rule__Literal__Group_3__0__Impl : ( () ) ;
    public final void rule__Literal__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2484:1: ( ( () ) )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2485:1: ( () )
            {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2485:1: ( () )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2486:1: ()
            {
             before(grammarAccess.getLiteralAccess().getLiteralAction_3_0()); 
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2487:1: ()
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2489:1: 
            {
            }

             after(grammarAccess.getLiteralAccess().getLiteralAction_3_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Group_3__0__Impl"


    // $ANTLR start "rule__Literal__Group_3__1"
    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2499:1: rule__Literal__Group_3__1 : rule__Literal__Group_3__1__Impl ;
    public final void rule__Literal__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2503:1: ( rule__Literal__Group_3__1__Impl )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2504:2: rule__Literal__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Literal__Group_3__1__Impl_in_rule__Literal__Group_3__14990);
            rule__Literal__Group_3__1__Impl();

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
    // $ANTLR end "rule__Literal__Group_3__1"


    // $ANTLR start "rule__Literal__Group_3__1__Impl"
    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2510:1: rule__Literal__Group_3__1__Impl : ( 'Boolean' ) ;
    public final void rule__Literal__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2514:1: ( ( 'Boolean' ) )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2515:1: ( 'Boolean' )
            {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2515:1: ( 'Boolean' )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2516:1: 'Boolean'
            {
             before(grammarAccess.getLiteralAccess().getBooleanKeyword_3_1()); 
            match(input,34,FOLLOW_34_in_rule__Literal__Group_3__1__Impl5018); 
             after(grammarAccess.getLiteralAccess().getBooleanKeyword_3_1()); 

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
    // $ANTLR end "rule__Literal__Group_3__1__Impl"


    // $ANTLR start "rule__Literal__Group_4__0"
    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2533:1: rule__Literal__Group_4__0 : rule__Literal__Group_4__0__Impl rule__Literal__Group_4__1 ;
    public final void rule__Literal__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2537:1: ( rule__Literal__Group_4__0__Impl rule__Literal__Group_4__1 )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2538:2: rule__Literal__Group_4__0__Impl rule__Literal__Group_4__1
            {
            pushFollow(FOLLOW_rule__Literal__Group_4__0__Impl_in_rule__Literal__Group_4__05053);
            rule__Literal__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Literal__Group_4__1_in_rule__Literal__Group_4__05056);
            rule__Literal__Group_4__1();

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
    // $ANTLR end "rule__Literal__Group_4__0"


    // $ANTLR start "rule__Literal__Group_4__0__Impl"
    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2545:1: rule__Literal__Group_4__0__Impl : ( () ) ;
    public final void rule__Literal__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2549:1: ( ( () ) )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2550:1: ( () )
            {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2550:1: ( () )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2551:1: ()
            {
             before(grammarAccess.getLiteralAccess().getLiteralAction_4_0()); 
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2552:1: ()
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2554:1: 
            {
            }

             after(grammarAccess.getLiteralAccess().getLiteralAction_4_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Group_4__0__Impl"


    // $ANTLR start "rule__Literal__Group_4__1"
    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2564:1: rule__Literal__Group_4__1 : rule__Literal__Group_4__1__Impl ;
    public final void rule__Literal__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2568:1: ( rule__Literal__Group_4__1__Impl )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2569:2: rule__Literal__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Literal__Group_4__1__Impl_in_rule__Literal__Group_4__15114);
            rule__Literal__Group_4__1__Impl();

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
    // $ANTLR end "rule__Literal__Group_4__1"


    // $ANTLR start "rule__Literal__Group_4__1__Impl"
    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2575:1: rule__Literal__Group_4__1__Impl : ( 'Int' ) ;
    public final void rule__Literal__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2579:1: ( ( 'Int' ) )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2580:1: ( 'Int' )
            {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2580:1: ( 'Int' )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2581:1: 'Int'
            {
             before(grammarAccess.getLiteralAccess().getIntKeyword_4_1()); 
            match(input,35,FOLLOW_35_in_rule__Literal__Group_4__1__Impl5142); 
             after(grammarAccess.getLiteralAccess().getIntKeyword_4_1()); 

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
    // $ANTLR end "rule__Literal__Group_4__1__Impl"


    // $ANTLR start "rule__Enum__Group__0"
    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2598:1: rule__Enum__Group__0 : rule__Enum__Group__0__Impl rule__Enum__Group__1 ;
    public final void rule__Enum__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2602:1: ( rule__Enum__Group__0__Impl rule__Enum__Group__1 )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2603:2: rule__Enum__Group__0__Impl rule__Enum__Group__1
            {
            pushFollow(FOLLOW_rule__Enum__Group__0__Impl_in_rule__Enum__Group__05177);
            rule__Enum__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Enum__Group__1_in_rule__Enum__Group__05180);
            rule__Enum__Group__1();

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
    // $ANTLR end "rule__Enum__Group__0"


    // $ANTLR start "rule__Enum__Group__0__Impl"
    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2610:1: rule__Enum__Group__0__Impl : ( 'Enum' ) ;
    public final void rule__Enum__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2614:1: ( ( 'Enum' ) )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2615:1: ( 'Enum' )
            {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2615:1: ( 'Enum' )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2616:1: 'Enum'
            {
             before(grammarAccess.getEnumAccess().getEnumKeyword_0()); 
            match(input,36,FOLLOW_36_in_rule__Enum__Group__0__Impl5208); 
             after(grammarAccess.getEnumAccess().getEnumKeyword_0()); 

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
    // $ANTLR end "rule__Enum__Group__0__Impl"


    // $ANTLR start "rule__Enum__Group__1"
    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2629:1: rule__Enum__Group__1 : rule__Enum__Group__1__Impl ;
    public final void rule__Enum__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2633:1: ( rule__Enum__Group__1__Impl )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2634:2: rule__Enum__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Enum__Group__1__Impl_in_rule__Enum__Group__15239);
            rule__Enum__Group__1__Impl();

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
    // $ANTLR end "rule__Enum__Group__1"


    // $ANTLR start "rule__Enum__Group__1__Impl"
    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2640:1: rule__Enum__Group__1__Impl : ( ( rule__Enum__TypeAssignment_1 ) ) ;
    public final void rule__Enum__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2644:1: ( ( ( rule__Enum__TypeAssignment_1 ) ) )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2645:1: ( ( rule__Enum__TypeAssignment_1 ) )
            {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2645:1: ( ( rule__Enum__TypeAssignment_1 ) )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2646:1: ( rule__Enum__TypeAssignment_1 )
            {
             before(grammarAccess.getEnumAccess().getTypeAssignment_1()); 
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2647:1: ( rule__Enum__TypeAssignment_1 )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2647:2: rule__Enum__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__Enum__TypeAssignment_1_in_rule__Enum__Group__1__Impl5266);
            rule__Enum__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEnumAccess().getTypeAssignment_1()); 

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
    // $ANTLR end "rule__Enum__Group__1__Impl"


    // $ANTLR start "rule__Model__ElementsAssignment"
    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2662:1: rule__Model__ElementsAssignment : ( ruleElement ) ;
    public final void rule__Model__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2666:1: ( ( ruleElement ) )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2667:1: ( ruleElement )
            {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2667:1: ( ruleElement )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2668:1: ruleElement
            {
             before(grammarAccess.getModelAccess().getElementsElementParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleElement_in_rule__Model__ElementsAssignment5305);
            ruleElement();

            state._fsp--;

             after(grammarAccess.getModelAccess().getElementsElementParserRuleCall_0()); 

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
    // $ANTLR end "rule__Model__ElementsAssignment"


    // $ANTLR start "rule__Import__ImportedNamespaceAssignment_1"
    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2677:1: rule__Import__ImportedNamespaceAssignment_1 : ( ruleFqnWithWildCard ) ;
    public final void rule__Import__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2681:1: ( ( ruleFqnWithWildCard ) )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2682:1: ( ruleFqnWithWildCard )
            {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2682:1: ( ruleFqnWithWildCard )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2683:1: ruleFqnWithWildCard
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceFqnWithWildCardParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleFqnWithWildCard_in_rule__Import__ImportedNamespaceAssignment_15336);
            ruleFqnWithWildCard();

            state._fsp--;

             after(grammarAccess.getImportAccess().getImportedNamespaceFqnWithWildCardParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Import__ImportedNamespaceAssignment_1"


    // $ANTLR start "rule__Diagram__ImportsAssignment_0"
    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2692:1: rule__Diagram__ImportsAssignment_0 : ( ruleImport ) ;
    public final void rule__Diagram__ImportsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2696:1: ( ( ruleImport ) )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2697:1: ( ruleImport )
            {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2697:1: ( ruleImport )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2698:1: ruleImport
            {
             before(grammarAccess.getDiagramAccess().getImportsImportParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleImport_in_rule__Diagram__ImportsAssignment_05367);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getDiagramAccess().getImportsImportParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Diagram__ImportsAssignment_0"


    // $ANTLR start "rule__Diagram__NameAssignment_2"
    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2707:1: rule__Diagram__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Diagram__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2711:1: ( ( RULE_ID ) )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2712:1: ( RULE_ID )
            {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2712:1: ( RULE_ID )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2713:1: RULE_ID
            {
             before(grammarAccess.getDiagramAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Diagram__NameAssignment_25398); 
             after(grammarAccess.getDiagramAccess().getNameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Diagram__NameAssignment_2"


    // $ANTLR start "rule__Diagram__IncludesAssignment_4"
    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2722:1: rule__Diagram__IncludesAssignment_4 : ( ruleInclude ) ;
    public final void rule__Diagram__IncludesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2726:1: ( ( ruleInclude ) )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2727:1: ( ruleInclude )
            {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2727:1: ( ruleInclude )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2728:1: ruleInclude
            {
             before(grammarAccess.getDiagramAccess().getIncludesIncludeParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleInclude_in_rule__Diagram__IncludesAssignment_45429);
            ruleInclude();

            state._fsp--;

             after(grammarAccess.getDiagramAccess().getIncludesIncludeParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Diagram__IncludesAssignment_4"


    // $ANTLR start "rule__Include__EntityAssignment_1"
    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2737:1: rule__Include__EntityAssignment_1 : ( ( ruleFQN ) ) ;
    public final void rule__Include__EntityAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2741:1: ( ( ( ruleFQN ) ) )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2742:1: ( ( ruleFQN ) )
            {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2742:1: ( ( ruleFQN ) )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2743:1: ( ruleFQN )
            {
             before(grammarAccess.getIncludeAccess().getEntityEntityCrossReference_1_0()); 
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2744:1: ( ruleFQN )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2745:1: ruleFQN
            {
             before(grammarAccess.getIncludeAccess().getEntityEntityFQNParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_ruleFQN_in_rule__Include__EntityAssignment_15464);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getIncludeAccess().getEntityEntityFQNParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getIncludeAccess().getEntityEntityCrossReference_1_0()); 

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
    // $ANTLR end "rule__Include__EntityAssignment_1"


    // $ANTLR start "rule__Include__FieldsAssignment_2_2"
    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2756:1: rule__Include__FieldsAssignment_2_2 : ( ( ruleFQN ) ) ;
    public final void rule__Include__FieldsAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2760:1: ( ( ( ruleFQN ) ) )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2761:1: ( ( ruleFQN ) )
            {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2761:1: ( ( ruleFQN ) )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2762:1: ( ruleFQN )
            {
             before(grammarAccess.getIncludeAccess().getFieldsPropertyCrossReference_2_2_0()); 
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2763:1: ( ruleFQN )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2764:1: ruleFQN
            {
             before(grammarAccess.getIncludeAccess().getFieldsPropertyFQNParserRuleCall_2_2_0_1()); 
            pushFollow(FOLLOW_ruleFQN_in_rule__Include__FieldsAssignment_2_25503);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getIncludeAccess().getFieldsPropertyFQNParserRuleCall_2_2_0_1()); 

            }

             after(grammarAccess.getIncludeAccess().getFieldsPropertyCrossReference_2_2_0()); 

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
    // $ANTLR end "rule__Include__FieldsAssignment_2_2"


    // $ANTLR start "rule__EnumDeclaration__NameAssignment_1"
    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2775:1: rule__EnumDeclaration__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__EnumDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2779:1: ( ( RULE_ID ) )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2780:1: ( RULE_ID )
            {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2780:1: ( RULE_ID )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2781:1: RULE_ID
            {
             before(grammarAccess.getEnumDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EnumDeclaration__NameAssignment_15538); 
             after(grammarAccess.getEnumDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__EnumDeclaration__NameAssignment_1"


    // $ANTLR start "rule__EnumDeclaration__ValuesAssignment_3"
    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2790:1: rule__EnumDeclaration__ValuesAssignment_3 : ( RULE_ID ) ;
    public final void rule__EnumDeclaration__ValuesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2794:1: ( ( RULE_ID ) )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2795:1: ( RULE_ID )
            {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2795:1: ( RULE_ID )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2796:1: RULE_ID
            {
             before(grammarAccess.getEnumDeclarationAccess().getValuesIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EnumDeclaration__ValuesAssignment_35569); 
             after(grammarAccess.getEnumDeclarationAccess().getValuesIDTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__EnumDeclaration__ValuesAssignment_3"


    // $ANTLR start "rule__Entity__NameAssignment_1"
    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2805:1: rule__Entity__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Entity__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2809:1: ( ( RULE_ID ) )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2810:1: ( RULE_ID )
            {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2810:1: ( RULE_ID )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2811:1: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Entity__NameAssignment_15600); 
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


    // $ANTLR start "rule__Entity__PropertiesAssignment_3"
    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2820:1: rule__Entity__PropertiesAssignment_3 : ( ruleProperty ) ;
    public final void rule__Entity__PropertiesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2824:1: ( ( ruleProperty ) )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2825:1: ( ruleProperty )
            {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2825:1: ( ruleProperty )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2826:1: ruleProperty
            {
             before(grammarAccess.getEntityAccess().getPropertiesPropertyParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleProperty_in_rule__Entity__PropertiesAssignment_35631);
            ruleProperty();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getPropertiesPropertyParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Entity__PropertiesAssignment_3"


    // $ANTLR start "rule__Domain__ImportsAssignment_0"
    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2835:1: rule__Domain__ImportsAssignment_0 : ( ruleImport ) ;
    public final void rule__Domain__ImportsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2839:1: ( ( ruleImport ) )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2840:1: ( ruleImport )
            {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2840:1: ( ruleImport )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2841:1: ruleImport
            {
             before(grammarAccess.getDomainAccess().getImportsImportParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleImport_in_rule__Domain__ImportsAssignment_05662);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getDomainAccess().getImportsImportParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Domain__ImportsAssignment_0"


    // $ANTLR start "rule__Domain__NameAssignment_2"
    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2850:1: rule__Domain__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Domain__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2854:1: ( ( RULE_ID ) )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2855:1: ( RULE_ID )
            {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2855:1: ( RULE_ID )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2856:1: RULE_ID
            {
             before(grammarAccess.getDomainAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Domain__NameAssignment_25693); 
             after(grammarAccess.getDomainAccess().getNameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Domain__NameAssignment_2"


    // $ANTLR start "rule__Domain__DescriptionAssignment_4"
    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2865:1: rule__Domain__DescriptionAssignment_4 : ( RULE_STRING ) ;
    public final void rule__Domain__DescriptionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2869:1: ( ( RULE_STRING ) )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2870:1: ( RULE_STRING )
            {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2870:1: ( RULE_STRING )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2871:1: RULE_STRING
            {
             before(grammarAccess.getDomainAccess().getDescriptionSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Domain__DescriptionAssignment_45724); 
             after(grammarAccess.getDomainAccess().getDescriptionSTRINGTerminalRuleCall_4_0()); 

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
    // $ANTLR end "rule__Domain__DescriptionAssignment_4"


    // $ANTLR start "rule__Domain__EntitiesAssignment_6"
    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2880:1: rule__Domain__EntitiesAssignment_6 : ( ruleEntity ) ;
    public final void rule__Domain__EntitiesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2884:1: ( ( ruleEntity ) )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2885:1: ( ruleEntity )
            {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2885:1: ( ruleEntity )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2886:1: ruleEntity
            {
             before(grammarAccess.getDomainAccess().getEntitiesEntityParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleEntity_in_rule__Domain__EntitiesAssignment_65755);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getDomainAccess().getEntitiesEntityParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__Domain__EntitiesAssignment_6"


    // $ANTLR start "rule__Association__MultiplicityAssignment_1"
    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2895:1: rule__Association__MultiplicityAssignment_1 : ( ruleMultiplicty ) ;
    public final void rule__Association__MultiplicityAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2899:1: ( ( ruleMultiplicty ) )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2900:1: ( ruleMultiplicty )
            {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2900:1: ( ruleMultiplicty )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2901:1: ruleMultiplicty
            {
             before(grammarAccess.getAssociationAccess().getMultiplicityMultiplictyParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleMultiplicty_in_rule__Association__MultiplicityAssignment_15786);
            ruleMultiplicty();

            state._fsp--;

             after(grammarAccess.getAssociationAccess().getMultiplicityMultiplictyParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Association__MultiplicityAssignment_1"


    // $ANTLR start "rule__Association__NameAssignment_2"
    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2910:1: rule__Association__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Association__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2914:1: ( ( RULE_ID ) )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2915:1: ( RULE_ID )
            {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2915:1: ( RULE_ID )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2916:1: RULE_ID
            {
             before(grammarAccess.getAssociationAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Association__NameAssignment_25817); 
             after(grammarAccess.getAssociationAccess().getNameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Association__NameAssignment_2"


    // $ANTLR start "rule__Association__TypeAssignment_4"
    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2925:1: rule__Association__TypeAssignment_4 : ( ( ruleFQN ) ) ;
    public final void rule__Association__TypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2929:1: ( ( ( ruleFQN ) ) )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2930:1: ( ( ruleFQN ) )
            {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2930:1: ( ( ruleFQN ) )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2931:1: ( ruleFQN )
            {
             before(grammarAccess.getAssociationAccess().getTypeEntityCrossReference_4_0()); 
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2932:1: ( ruleFQN )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2933:1: ruleFQN
            {
             before(grammarAccess.getAssociationAccess().getTypeEntityFQNParserRuleCall_4_0_1()); 
            pushFollow(FOLLOW_ruleFQN_in_rule__Association__TypeAssignment_45852);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getAssociationAccess().getTypeEntityFQNParserRuleCall_4_0_1()); 

            }

             after(grammarAccess.getAssociationAccess().getTypeEntityCrossReference_4_0()); 

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
    // $ANTLR end "rule__Association__TypeAssignment_4"


    // $ANTLR start "rule__Field__NameAssignment_1"
    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2944:1: rule__Field__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Field__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2948:1: ( ( RULE_ID ) )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2949:1: ( RULE_ID )
            {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2949:1: ( RULE_ID )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2950:1: RULE_ID
            {
             before(grammarAccess.getFieldAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Field__NameAssignment_15887); 
             after(grammarAccess.getFieldAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Field__NameAssignment_1"


    // $ANTLR start "rule__Field__LiteralAssignment_3"
    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2959:1: rule__Field__LiteralAssignment_3 : ( ruleLiteral ) ;
    public final void rule__Field__LiteralAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2963:1: ( ( ruleLiteral ) )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2964:1: ( ruleLiteral )
            {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2964:1: ( ruleLiteral )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2965:1: ruleLiteral
            {
             before(grammarAccess.getFieldAccess().getLiteralLiteralParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleLiteral_in_rule__Field__LiteralAssignment_35918);
            ruleLiteral();

            state._fsp--;

             after(grammarAccess.getFieldAccess().getLiteralLiteralParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Field__LiteralAssignment_3"


    // $ANTLR start "rule__Enum__TypeAssignment_1"
    // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2974:1: rule__Enum__TypeAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Enum__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2978:1: ( ( ( RULE_ID ) ) )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2979:1: ( ( RULE_ID ) )
            {
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2979:1: ( ( RULE_ID ) )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2980:1: ( RULE_ID )
            {
             before(grammarAccess.getEnumAccess().getTypeEnumDeclarationCrossReference_1_0()); 
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2981:1: ( RULE_ID )
            // ../org.pklose.ui/src-gen/org/pklose/simplespec/ui/contentassist/antlr/internal/InternalSimplespec.g:2982:1: RULE_ID
            {
             before(grammarAccess.getEnumAccess().getTypeEnumDeclarationIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Enum__TypeAssignment_15953); 
             after(grammarAccess.getEnumAccess().getTypeEnumDeclarationIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getEnumAccess().getTypeEnumDeclarationCrossReference_1_0()); 

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
    // $ANTLR end "rule__Enum__TypeAssignment_1"

    // Delegated rules


    protected DFA1 dfa1 = new DFA1(this);
    static final String DFA1_eotS =
        "\11\uffff";
    static final String DFA1_eofS =
        "\11\uffff";
    static final String DFA1_minS =
        "\1\17\1\uffff\1\4\2\uffff\1\17\1\4\2\17";
    static final String DFA1_maxS =
        "\1\32\1\uffff\1\4\2\uffff\1\32\1\4\2\32";
    static final String DFA1_acceptS =
        "\1\uffff\1\1\1\uffff\1\2\1\3\4\uffff";
    static final String DFA1_specialS =
        "\11\uffff}>";
    static final String[] DFA1_transitionS = {
            "\1\2\1\uffff\1\3\4\uffff\1\1\3\uffff\1\4",
            "",
            "\1\5",
            "",
            "",
            "\1\2\1\7\1\3\6\uffff\1\6\1\uffff\1\4",
            "\1\10",
            "\1\2\1\uffff\1\3\10\uffff\1\4",
            "\1\2\1\7\1\3\6\uffff\1\6\1\uffff\1\4"
    };

    static final short[] DFA1_eot = DFA.unpackEncodedString(DFA1_eotS);
    static final short[] DFA1_eof = DFA.unpackEncodedString(DFA1_eofS);
    static final char[] DFA1_min = DFA.unpackEncodedStringToUnsignedChars(DFA1_minS);
    static final char[] DFA1_max = DFA.unpackEncodedStringToUnsignedChars(DFA1_maxS);
    static final short[] DFA1_accept = DFA.unpackEncodedString(DFA1_acceptS);
    static final short[] DFA1_special = DFA.unpackEncodedString(DFA1_specialS);
    static final short[][] DFA1_transition;

    static {
        int numStates = DFA1_transitionS.length;
        DFA1_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA1_transition[i] = DFA.unpackEncodedString(DFA1_transitionS[i]);
        }
    }

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = DFA1_eot;
            this.eof = DFA1_eof;
            this.min = DFA1_min;
            this.max = DFA1_max;
            this.accept = DFA1_accept;
            this.special = DFA1_special;
            this.transition = DFA1_transition;
        }
        public String getDescription() {
            return "508:1: rule__Element__Alternatives : ( ( ruleEnumDeclaration ) | ( ruleDiagram ) | ( ruleDomain ) );";
        }
    }
 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__ElementsAssignment_in_ruleModel94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElement_in_entryRuleElement121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElement128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Element__Alternatives_in_ruleElement154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__0_in_ruleImport214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFqnWithWildCard_in_entryRuleFqnWithWildCard241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFqnWithWildCard248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FqnWithWildCard__Group__0_in_ruleFqnWithWildCard274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDiagram_in_entryRuleDiagram301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDiagram308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Diagram__Group__0_in_ruleDiagram334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInclude_in_entryRuleInclude361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInclude368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Include__Group__0_in_ruleInclude394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumDeclaration_in_entryRuleEnumDeclaration421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumDeclaration428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumDeclaration__Group__0_in_ruleEnumDeclaration454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_entryRuleFQN481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFQN488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group__0_in_ruleFQN514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_entryRuleEntity541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntity548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__0_in_ruleEntity574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDomain_in_entryRuleDomain601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDomain608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domain__Group__0_in_ruleDomain634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_entryRuleProperty661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProperty668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Alternatives_in_ruleProperty694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssociation_in_entryRuleAssociation721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssociation728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__Group__0_in_ruleAssociation754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplicty_in_entryRuleMultiplicty781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiplicty788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplicty__Alternatives_in_ruleMultiplicty814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleField_in_entryRuleField841 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleField848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__0_in_ruleField874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral901 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteral908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Alternatives_in_ruleLiteral934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnum_in_entryRuleEnum961 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnum968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__Group__0_in_ruleEnum994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumDeclaration_in_rule__Element__Alternatives1030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDiagram_in_rule__Element__Alternatives1047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDomain_in_rule__Element__Alternatives1064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleField_in_rule__Property__Alternatives1096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssociation_in_rule__Property__Alternatives1113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Multiplicty__Alternatives1146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Multiplicty__Alternatives1166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Multiplicty__Alternatives1186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Multiplicty__Alternatives1206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Group_0__0_in_rule__Literal__Alternatives1240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Group_1__0_in_rule__Literal__Alternatives1258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Group_2__0_in_rule__Literal__Alternatives1276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Group_3__0_in_rule__Literal__Alternatives1294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Group_4__0_in_rule__Literal__Alternatives1312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnum_in_rule__Literal__Alternatives1330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__01360 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Import__Group__1_in_rule__Import__Group__01363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Import__Group__0__Impl1391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__11422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__ImportedNamespaceAssignment_1_in_rule__Import__Group__1__Impl1449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FqnWithWildCard__Group__0__Impl_in_rule__FqnWithWildCard__Group__01483 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__FqnWithWildCard__Group__1_in_rule__FqnWithWildCard__Group__01486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__FqnWithWildCard__Group__0__Impl1513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FqnWithWildCard__Group__1__Impl_in_rule__FqnWithWildCard__Group__11542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__FqnWithWildCard__Group__1__Impl1571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Diagram__Group__0__Impl_in_rule__Diagram__Group__01608 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Diagram__Group__1_in_rule__Diagram__Group__01611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Diagram__ImportsAssignment_0_in_rule__Diagram__Group__0__Impl1638 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_rule__Diagram__Group__1__Impl_in_rule__Diagram__Group__11669 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Diagram__Group__2_in_rule__Diagram__Group__11672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Diagram__Group__1__Impl1700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Diagram__Group__2__Impl_in_rule__Diagram__Group__21731 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Diagram__Group__3_in_rule__Diagram__Group__21734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Diagram__NameAssignment_2_in_rule__Diagram__Group__2__Impl1761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Diagram__Group__3__Impl_in_rule__Diagram__Group__31791 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_rule__Diagram__Group__4_in_rule__Diagram__Group__31794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Diagram__Group__3__Impl1822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Diagram__Group__4__Impl_in_rule__Diagram__Group__41853 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_rule__Diagram__Group__5_in_rule__Diagram__Group__41856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Diagram__IncludesAssignment_4_in_rule__Diagram__Group__4__Impl1883 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_rule__Diagram__Group__5__Impl_in_rule__Diagram__Group__51914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Diagram__Group__5__Impl1942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Include__Group__0__Impl_in_rule__Include__Group__01985 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Include__Group__1_in_rule__Include__Group__01988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Include__Group__0__Impl2016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Include__Group__1__Impl_in_rule__Include__Group__12047 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Include__Group__2_in_rule__Include__Group__12050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Include__EntityAssignment_1_in_rule__Include__Group__1__Impl2077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Include__Group__2__Impl_in_rule__Include__Group__22107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Include__Group_2__0_in_rule__Include__Group__2__Impl2134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Include__Group_2__0__Impl_in_rule__Include__Group_2__02171 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Include__Group_2__1_in_rule__Include__Group_2__02174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Include__Group_2__0__Impl2202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Include__Group_2__1__Impl_in_rule__Include__Group_2__12233 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_rule__Include__Group_2__2_in_rule__Include__Group_2__12236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Include__Group_2__1__Impl2264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Include__Group_2__2__Impl_in_rule__Include__Group_2__22295 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_rule__Include__Group_2__3_in_rule__Include__Group_2__22298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Include__FieldsAssignment_2_2_in_rule__Include__Group_2__2__Impl2325 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Include__Group_2__3__Impl_in_rule__Include__Group_2__32356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Include__Group_2__3__Impl2384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumDeclaration__Group__0__Impl_in_rule__EnumDeclaration__Group__02423 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EnumDeclaration__Group__1_in_rule__EnumDeclaration__Group__02426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__EnumDeclaration__Group__0__Impl2454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumDeclaration__Group__1__Impl_in_rule__EnumDeclaration__Group__12485 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__EnumDeclaration__Group__2_in_rule__EnumDeclaration__Group__12488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumDeclaration__NameAssignment_1_in_rule__EnumDeclaration__Group__1__Impl2515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumDeclaration__Group__2__Impl_in_rule__EnumDeclaration__Group__22545 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EnumDeclaration__Group__3_in_rule__EnumDeclaration__Group__22548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__EnumDeclaration__Group__2__Impl2576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumDeclaration__Group__3__Impl_in_rule__EnumDeclaration__Group__32607 = new BitSet(new long[]{0x0000000000880000L});
    public static final BitSet FOLLOW_rule__EnumDeclaration__Group__4_in_rule__EnumDeclaration__Group__32610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumDeclaration__ValuesAssignment_3_in_rule__EnumDeclaration__Group__3__Impl2637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumDeclaration__Group__4__Impl_in_rule__EnumDeclaration__Group__42667 = new BitSet(new long[]{0x0000000000880000L});
    public static final BitSet FOLLOW_rule__EnumDeclaration__Group__5_in_rule__EnumDeclaration__Group__42670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumDeclaration__Group_4__0_in_rule__EnumDeclaration__Group__4__Impl2697 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_rule__EnumDeclaration__Group__5__Impl_in_rule__EnumDeclaration__Group__52728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__EnumDeclaration__Group__5__Impl2756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumDeclaration__Group_4__0__Impl_in_rule__EnumDeclaration__Group_4__02799 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EnumDeclaration__Group_4__1_in_rule__EnumDeclaration__Group_4__02802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__EnumDeclaration__Group_4__0__Impl2830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumDeclaration__Group_4__1__Impl_in_rule__EnumDeclaration__Group_4__12861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EnumDeclaration__Group_4__1__Impl2888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group__0__Impl_in_rule__FQN__Group__02921 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__FQN__Group__1_in_rule__FQN__Group__02924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FQN__Group__0__Impl2951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group__1__Impl_in_rule__FQN__Group__12980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__0_in_rule__FQN__Group__1__Impl3007 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__0__Impl_in_rule__FQN__Group_1__03042 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__1_in_rule__FQN__Group_1__03045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__FQN__Group_1__0__Impl3073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__1__Impl_in_rule__FQN__Group_1__13104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FQN__Group_1__1__Impl3131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__0__Impl_in_rule__Entity__Group__03164 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Entity__Group__1_in_rule__Entity__Group__03167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Entity__Group__0__Impl3195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__1__Impl_in_rule__Entity__Group__13226 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Entity__Group__2_in_rule__Entity__Group__13229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__NameAssignment_1_in_rule__Entity__Group__1__Impl3256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__2__Impl_in_rule__Entity__Group__23286 = new BitSet(new long[]{0x0000000050080000L});
    public static final BitSet FOLLOW_rule__Entity__Group__3_in_rule__Entity__Group__23289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Entity__Group__2__Impl3317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__3__Impl_in_rule__Entity__Group__33348 = new BitSet(new long[]{0x0000000050080000L});
    public static final BitSet FOLLOW_rule__Entity__Group__4_in_rule__Entity__Group__33351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__PropertiesAssignment_3_in_rule__Entity__Group__3__Impl3378 = new BitSet(new long[]{0x0000000050000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__4__Impl_in_rule__Entity__Group__43409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Entity__Group__4__Impl3437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domain__Group__0__Impl_in_rule__Domain__Group__03478 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Domain__Group__1_in_rule__Domain__Group__03481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domain__ImportsAssignment_0_in_rule__Domain__Group__0__Impl3508 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_rule__Domain__Group__1__Impl_in_rule__Domain__Group__13539 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Domain__Group__2_in_rule__Domain__Group__13542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Domain__Group__1__Impl3570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domain__Group__2__Impl_in_rule__Domain__Group__23601 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Domain__Group__3_in_rule__Domain__Group__23604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domain__NameAssignment_2_in_rule__Domain__Group__2__Impl3631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domain__Group__3__Impl_in_rule__Domain__Group__33661 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Domain__Group__4_in_rule__Domain__Group__33664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Domain__Group__3__Impl3692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domain__Group__4__Impl_in_rule__Domain__Group__43723 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Domain__Group__5_in_rule__Domain__Group__43726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domain__DescriptionAssignment_4_in_rule__Domain__Group__4__Impl3753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domain__Group__5__Impl_in_rule__Domain__Group__53783 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Domain__Group__6_in_rule__Domain__Group__53786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Domain__Group__5__Impl3814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domain__Group__6__Impl_in_rule__Domain__Group__63845 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Domain__Group__7_in_rule__Domain__Group__63848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domain__EntitiesAssignment_6_in_rule__Domain__Group__6__Impl3877 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_rule__Domain__EntitiesAssignment_6_in_rule__Domain__Group__6__Impl3889 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_rule__Domain__Group__7__Impl_in_rule__Domain__Group__73922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Domain__Group__7__Impl3950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__Group__0__Impl_in_rule__Association__Group__03997 = new BitSet(new long[]{0x0000000000007800L});
    public static final BitSet FOLLOW_rule__Association__Group__1_in_rule__Association__Group__04000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Association__Group__0__Impl4028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__Group__1__Impl_in_rule__Association__Group__14059 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Association__Group__2_in_rule__Association__Group__14062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__MultiplicityAssignment_1_in_rule__Association__Group__1__Impl4089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__Group__2__Impl_in_rule__Association__Group__24119 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Association__Group__3_in_rule__Association__Group__24122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__NameAssignment_2_in_rule__Association__Group__2__Impl4149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__Group__3__Impl_in_rule__Association__Group__34179 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Association__Group__4_in_rule__Association__Group__34182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Association__Group__3__Impl4210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__Group__4__Impl_in_rule__Association__Group__44241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__TypeAssignment_4_in_rule__Association__Group__4__Impl4268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__0__Impl_in_rule__Field__Group__04308 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Field__Group__1_in_rule__Field__Group__04311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Field__Group__0__Impl4339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__1__Impl_in_rule__Field__Group__14370 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Field__Group__2_in_rule__Field__Group__14373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__NameAssignment_1_in_rule__Field__Group__1__Impl4400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__2__Impl_in_rule__Field__Group__24430 = new BitSet(new long[]{0x0000001F80000000L});
    public static final BitSet FOLLOW_rule__Field__Group__3_in_rule__Field__Group__24433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Field__Group__2__Impl4461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__3__Impl_in_rule__Field__Group__34492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__LiteralAssignment_3_in_rule__Field__Group__3__Impl4519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Group_0__0__Impl_in_rule__Literal__Group_0__04557 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Literal__Group_0__1_in_rule__Literal__Group_0__04560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Group_0__1__Impl_in_rule__Literal__Group_0__14618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Literal__Group_0__1__Impl4646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Group_1__0__Impl_in_rule__Literal__Group_1__04681 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Literal__Group_1__1_in_rule__Literal__Group_1__04684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Group_1__1__Impl_in_rule__Literal__Group_1__14742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Literal__Group_1__1__Impl4770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Group_2__0__Impl_in_rule__Literal__Group_2__04805 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__Literal__Group_2__1_in_rule__Literal__Group_2__04808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Group_2__1__Impl_in_rule__Literal__Group_2__14866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Literal__Group_2__1__Impl4894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Group_3__0__Impl_in_rule__Literal__Group_3__04929 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__Literal__Group_3__1_in_rule__Literal__Group_3__04932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Group_3__1__Impl_in_rule__Literal__Group_3__14990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Literal__Group_3__1__Impl5018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Group_4__0__Impl_in_rule__Literal__Group_4__05053 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__Literal__Group_4__1_in_rule__Literal__Group_4__05056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Group_4__1__Impl_in_rule__Literal__Group_4__15114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Literal__Group_4__1__Impl5142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__Group__0__Impl_in_rule__Enum__Group__05177 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Enum__Group__1_in_rule__Enum__Group__05180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Enum__Group__0__Impl5208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__Group__1__Impl_in_rule__Enum__Group__15239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__TypeAssignment_1_in_rule__Enum__Group__1__Impl5266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElement_in_rule__Model__ElementsAssignment5305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFqnWithWildCard_in_rule__Import__ImportedNamespaceAssignment_15336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_rule__Diagram__ImportsAssignment_05367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Diagram__NameAssignment_25398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInclude_in_rule__Diagram__IncludesAssignment_45429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__Include__EntityAssignment_15464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__Include__FieldsAssignment_2_25503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EnumDeclaration__NameAssignment_15538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EnumDeclaration__ValuesAssignment_35569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Entity__NameAssignment_15600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_rule__Entity__PropertiesAssignment_35631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_rule__Domain__ImportsAssignment_05662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Domain__NameAssignment_25693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Domain__DescriptionAssignment_45724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_rule__Domain__EntitiesAssignment_65755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplicty_in_rule__Association__MultiplicityAssignment_15786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Association__NameAssignment_25817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__Association__TypeAssignment_45852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Field__NameAssignment_15887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_rule__Field__LiteralAssignment_35918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Enum__TypeAssignment_15953 = new BitSet(new long[]{0x0000000000000002L});

}