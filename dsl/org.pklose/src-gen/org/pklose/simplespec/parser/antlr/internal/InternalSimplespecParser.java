package org.pklose.simplespec.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.pklose.simplespec.services.SimplespecGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSimplespecParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Import'", "'.*'", "'Diagram'", "'{'", "'}'", "'Include'", "'with'", "'Enumeration'", "','", "'.'", "'Entity'", "'Domain'", "'Description: '", "'Relation'", "':'", "'1..N'", "'0..N'", "'1'", "'1..0'", "'Field'", "'Decimal'", "'Geld'", "'Text'", "'Boolean'", "'Int'", "'Enum'"
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
    public String getGrammarFileName() { return "../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g"; }



     	private SimplespecGrammarAccess grammarAccess;
     	
        public InternalSimplespecParser(TokenStream input, SimplespecGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected SimplespecGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:67:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:68:2: (iv_ruleModel= ruleModel EOF )
            // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:69:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel85); 

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
    // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:76:1: ruleModel returns [EObject current=null] : ( (lv_elements_0_0= ruleElement ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:79:28: ( ( (lv_elements_0_0= ruleElement ) ) )
            // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:80:1: ( (lv_elements_0_0= ruleElement ) )
            {
            // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:80:1: ( (lv_elements_0_0= ruleElement ) )
            // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:81:1: (lv_elements_0_0= ruleElement )
            {
            // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:81:1: (lv_elements_0_0= ruleElement )
            // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:82:3: lv_elements_0_0= ruleElement
            {
             
            	        newCompositeNode(grammarAccess.getModelAccess().getElementsElementParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleElement_in_ruleModel130);
            lv_elements_0_0=ruleElement();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getModelRule());
            	        }
                   		add(
                   			current, 
                   			"elements",
                    		lv_elements_0_0, 
                    		"Element");
            	        afterParserOrEnumRuleCall();
            	    

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


    // $ANTLR start "entryRuleElement"
    // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:106:1: entryRuleElement returns [EObject current=null] : iv_ruleElement= ruleElement EOF ;
    public final EObject entryRuleElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElement = null;


        try {
            // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:107:2: (iv_ruleElement= ruleElement EOF )
            // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:108:2: iv_ruleElement= ruleElement EOF
            {
             newCompositeNode(grammarAccess.getElementRule()); 
            pushFollow(FOLLOW_ruleElement_in_entryRuleElement165);
            iv_ruleElement=ruleElement();

            state._fsp--;

             current =iv_ruleElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleElement175); 

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
    // $ANTLR end "entryRuleElement"


    // $ANTLR start "ruleElement"
    // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:115:1: ruleElement returns [EObject current=null] : (this_EnumDeclaration_0= ruleEnumDeclaration | this_Diagram_1= ruleDiagram | this_Domain_2= ruleDomain ) ;
    public final EObject ruleElement() throws RecognitionException {
        EObject current = null;

        EObject this_EnumDeclaration_0 = null;

        EObject this_Diagram_1 = null;

        EObject this_Domain_2 = null;


         enterRule(); 
            
        try {
            // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:118:28: ( (this_EnumDeclaration_0= ruleEnumDeclaration | this_Diagram_1= ruleDiagram | this_Domain_2= ruleDomain ) )
            // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:119:1: (this_EnumDeclaration_0= ruleEnumDeclaration | this_Diagram_1= ruleDiagram | this_Domain_2= ruleDomain )
            {
            // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:119:1: (this_EnumDeclaration_0= ruleEnumDeclaration | this_Diagram_1= ruleDiagram | this_Domain_2= ruleDomain )
            int alt1=3;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:120:5: this_EnumDeclaration_0= ruleEnumDeclaration
                    {
                     
                            newCompositeNode(grammarAccess.getElementAccess().getEnumDeclarationParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleEnumDeclaration_in_ruleElement222);
                    this_EnumDeclaration_0=ruleEnumDeclaration();

                    state._fsp--;

                     
                            current = this_EnumDeclaration_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:130:5: this_Diagram_1= ruleDiagram
                    {
                     
                            newCompositeNode(grammarAccess.getElementAccess().getDiagramParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleDiagram_in_ruleElement249);
                    this_Diagram_1=ruleDiagram();

                    state._fsp--;

                     
                            current = this_Diagram_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:140:5: this_Domain_2= ruleDomain
                    {
                     
                            newCompositeNode(grammarAccess.getElementAccess().getDomainParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleDomain_in_ruleElement276);
                    this_Domain_2=ruleDomain();

                    state._fsp--;

                     
                            current = this_Domain_2; 
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
    // $ANTLR end "ruleElement"


    // $ANTLR start "entryRuleImport"
    // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:156:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:157:2: (iv_ruleImport= ruleImport EOF )
            // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:158:2: iv_ruleImport= ruleImport EOF
            {
             newCompositeNode(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport311);
            iv_ruleImport=ruleImport();

            state._fsp--;

             current =iv_ruleImport; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport321); 

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
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:165:1: ruleImport returns [EObject current=null] : (otherlv_0= 'Import' ( (lv_importedNamespace_1_0= ruleFqnWithWildCard ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:168:28: ( (otherlv_0= 'Import' ( (lv_importedNamespace_1_0= ruleFqnWithWildCard ) ) ) )
            // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:169:1: (otherlv_0= 'Import' ( (lv_importedNamespace_1_0= ruleFqnWithWildCard ) ) )
            {
            // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:169:1: (otherlv_0= 'Import' ( (lv_importedNamespace_1_0= ruleFqnWithWildCard ) ) )
            // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:169:3: otherlv_0= 'Import' ( (lv_importedNamespace_1_0= ruleFqnWithWildCard ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleImport358); 

                	newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
                
            // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:173:1: ( (lv_importedNamespace_1_0= ruleFqnWithWildCard ) )
            // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:174:1: (lv_importedNamespace_1_0= ruleFqnWithWildCard )
            {
            // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:174:1: (lv_importedNamespace_1_0= ruleFqnWithWildCard )
            // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:175:3: lv_importedNamespace_1_0= ruleFqnWithWildCard
            {
             
            	        newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceFqnWithWildCardParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleFqnWithWildCard_in_ruleImport379);
            lv_importedNamespace_1_0=ruleFqnWithWildCard();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getImportRule());
            	        }
                   		set(
                   			current, 
                   			"importedNamespace",
                    		lv_importedNamespace_1_0, 
                    		"FqnWithWildCard");
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
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleFqnWithWildCard"
    // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:199:1: entryRuleFqnWithWildCard returns [String current=null] : iv_ruleFqnWithWildCard= ruleFqnWithWildCard EOF ;
    public final String entryRuleFqnWithWildCard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFqnWithWildCard = null;


        try {
            // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:200:2: (iv_ruleFqnWithWildCard= ruleFqnWithWildCard EOF )
            // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:201:2: iv_ruleFqnWithWildCard= ruleFqnWithWildCard EOF
            {
             newCompositeNode(grammarAccess.getFqnWithWildCardRule()); 
            pushFollow(FOLLOW_ruleFqnWithWildCard_in_entryRuleFqnWithWildCard416);
            iv_ruleFqnWithWildCard=ruleFqnWithWildCard();

            state._fsp--;

             current =iv_ruleFqnWithWildCard.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFqnWithWildCard427); 

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
    // $ANTLR end "entryRuleFqnWithWildCard"


    // $ANTLR start "ruleFqnWithWildCard"
    // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:208:1: ruleFqnWithWildCard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_FQN_0= ruleFQN (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleFqnWithWildCard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_FQN_0 = null;


         enterRule(); 
            
        try {
            // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:211:28: ( (this_FQN_0= ruleFQN (kw= '.*' )? ) )
            // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:212:1: (this_FQN_0= ruleFQN (kw= '.*' )? )
            {
            // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:212:1: (this_FQN_0= ruleFQN (kw= '.*' )? )
            // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:213:5: this_FQN_0= ruleFQN (kw= '.*' )?
            {
             
                    newCompositeNode(grammarAccess.getFqnWithWildCardAccess().getFQNParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleFQN_in_ruleFqnWithWildCard474);
            this_FQN_0=ruleFQN();

            state._fsp--;


            		current.merge(this_FQN_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:223:1: (kw= '.*' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==12) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:224:2: kw= '.*'
                    {
                    kw=(Token)match(input,12,FOLLOW_12_in_ruleFqnWithWildCard493); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFqnWithWildCardAccess().getFullStopAsteriskKeyword_1()); 
                        

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
    // $ANTLR end "ruleFqnWithWildCard"


    // $ANTLR start "entryRuleDiagram"
    // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:237:1: entryRuleDiagram returns [EObject current=null] : iv_ruleDiagram= ruleDiagram EOF ;
    public final EObject entryRuleDiagram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDiagram = null;


        try {
            // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:238:2: (iv_ruleDiagram= ruleDiagram EOF )
            // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:239:2: iv_ruleDiagram= ruleDiagram EOF
            {
             newCompositeNode(grammarAccess.getDiagramRule()); 
            pushFollow(FOLLOW_ruleDiagram_in_entryRuleDiagram535);
            iv_ruleDiagram=ruleDiagram();

            state._fsp--;

             current =iv_ruleDiagram; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDiagram545); 

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
    // $ANTLR end "entryRuleDiagram"


    // $ANTLR start "ruleDiagram"
    // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:246:1: ruleDiagram returns [EObject current=null] : ( ( (lv_imports_0_0= ruleImport ) )* otherlv_1= 'Diagram' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_includes_4_0= ruleInclude ) )* otherlv_5= '}' ) ;
    public final EObject ruleDiagram() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_imports_0_0 = null;

        EObject lv_includes_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:249:28: ( ( ( (lv_imports_0_0= ruleImport ) )* otherlv_1= 'Diagram' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_includes_4_0= ruleInclude ) )* otherlv_5= '}' ) )
            // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:250:1: ( ( (lv_imports_0_0= ruleImport ) )* otherlv_1= 'Diagram' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_includes_4_0= ruleInclude ) )* otherlv_5= '}' )
            {
            // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:250:1: ( ( (lv_imports_0_0= ruleImport ) )* otherlv_1= 'Diagram' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_includes_4_0= ruleInclude ) )* otherlv_5= '}' )
            // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:250:2: ( (lv_imports_0_0= ruleImport ) )* otherlv_1= 'Diagram' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_includes_4_0= ruleInclude ) )* otherlv_5= '}'
            {
            // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:250:2: ( (lv_imports_0_0= ruleImport ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==11) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:251:1: (lv_imports_0_0= ruleImport )
            	    {
            	    // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:251:1: (lv_imports_0_0= ruleImport )
            	    // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:252:3: lv_imports_0_0= ruleImport
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDiagramAccess().getImportsImportParserRuleCall_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleImport_in_ruleDiagram591);
            	    lv_imports_0_0=ruleImport();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDiagramRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"imports",
            	            		lv_imports_0_0, 
            	            		"Import");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_1=(Token)match(input,13,FOLLOW_13_in_ruleDiagram604); 

                	newLeafNode(otherlv_1, grammarAccess.getDiagramAccess().getDiagramKeyword_1());
                
            // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:272:1: ( (lv_name_2_0= RULE_ID ) )
            // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:273:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:273:1: (lv_name_2_0= RULE_ID )
            // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:274:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDiagram621); 

            			newLeafNode(lv_name_2_0, grammarAccess.getDiagramAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDiagramRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleDiagram638); 

                	newLeafNode(otherlv_3, grammarAccess.getDiagramAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:294:1: ( (lv_includes_4_0= ruleInclude ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==16) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:295:1: (lv_includes_4_0= ruleInclude )
            	    {
            	    // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:295:1: (lv_includes_4_0= ruleInclude )
            	    // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:296:3: lv_includes_4_0= ruleInclude
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDiagramAccess().getIncludesIncludeParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleInclude_in_ruleDiagram659);
            	    lv_includes_4_0=ruleInclude();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDiagramRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"includes",
            	            		lv_includes_4_0, 
            	            		"Include");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleDiagram672); 

                	newLeafNode(otherlv_5, grammarAccess.getDiagramAccess().getRightCurlyBracketKeyword_5());
                

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
    // $ANTLR end "ruleDiagram"


    // $ANTLR start "entryRuleInclude"
    // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:324:1: entryRuleInclude returns [EObject current=null] : iv_ruleInclude= ruleInclude EOF ;
    public final EObject entryRuleInclude() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInclude = null;


        try {
            // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:325:2: (iv_ruleInclude= ruleInclude EOF )
            // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:326:2: iv_ruleInclude= ruleInclude EOF
            {
             newCompositeNode(grammarAccess.getIncludeRule()); 
            pushFollow(FOLLOW_ruleInclude_in_entryRuleInclude708);
            iv_ruleInclude=ruleInclude();

            state._fsp--;

             current =iv_ruleInclude; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInclude718); 

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
    // $ANTLR end "entryRuleInclude"


    // $ANTLR start "ruleInclude"
    // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:333:1: ruleInclude returns [EObject current=null] : (otherlv_0= 'Include' ( ( ruleFQN ) ) (otherlv_2= 'with' otherlv_3= '{' ( ( ruleFQN ) )* otherlv_5= '}' )? ) ;
    public final EObject ruleInclude() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;

         enterRule(); 
            
        try {
            // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:336:28: ( (otherlv_0= 'Include' ( ( ruleFQN ) ) (otherlv_2= 'with' otherlv_3= '{' ( ( ruleFQN ) )* otherlv_5= '}' )? ) )
            // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:337:1: (otherlv_0= 'Include' ( ( ruleFQN ) ) (otherlv_2= 'with' otherlv_3= '{' ( ( ruleFQN ) )* otherlv_5= '}' )? )
            {
            // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:337:1: (otherlv_0= 'Include' ( ( ruleFQN ) ) (otherlv_2= 'with' otherlv_3= '{' ( ( ruleFQN ) )* otherlv_5= '}' )? )
            // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:337:3: otherlv_0= 'Include' ( ( ruleFQN ) ) (otherlv_2= 'with' otherlv_3= '{' ( ( ruleFQN ) )* otherlv_5= '}' )?
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleInclude755); 

                	newLeafNode(otherlv_0, grammarAccess.getIncludeAccess().getIncludeKeyword_0());
                
            // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:341:1: ( ( ruleFQN ) )
            // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:342:1: ( ruleFQN )
            {
            // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:342:1: ( ruleFQN )
            // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:343:3: ruleFQN
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getIncludeRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getIncludeAccess().getEntityEntityCrossReference_1_0()); 
            	    
            pushFollow(FOLLOW_ruleFQN_in_ruleInclude778);
            ruleFQN();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:356:2: (otherlv_2= 'with' otherlv_3= '{' ( ( ruleFQN ) )* otherlv_5= '}' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:356:4: otherlv_2= 'with' otherlv_3= '{' ( ( ruleFQN ) )* otherlv_5= '}'
                    {
                    otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleInclude791); 

                        	newLeafNode(otherlv_2, grammarAccess.getIncludeAccess().getWithKeyword_2_0());
                        
                    otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleInclude803); 

                        	newLeafNode(otherlv_3, grammarAccess.getIncludeAccess().getLeftCurlyBracketKeyword_2_1());
                        
                    // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:364:1: ( ( ruleFQN ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==RULE_ID) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:365:1: ( ruleFQN )
                    	    {
                    	    // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:365:1: ( ruleFQN )
                    	    // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:366:3: ruleFQN
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getIncludeRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getIncludeAccess().getFieldsPropertyCrossReference_2_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleFQN_in_ruleInclude826);
                    	    ruleFQN();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleInclude839); 

                        	newLeafNode(otherlv_5, grammarAccess.getIncludeAccess().getRightCurlyBracketKeyword_2_3());
                        

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
    // $ANTLR end "ruleInclude"


    // $ANTLR start "entryRuleEnumDeclaration"
    // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:391:1: entryRuleEnumDeclaration returns [EObject current=null] : iv_ruleEnumDeclaration= ruleEnumDeclaration EOF ;
    public final EObject entryRuleEnumDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumDeclaration = null;


        try {
            // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:392:2: (iv_ruleEnumDeclaration= ruleEnumDeclaration EOF )
            // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:393:2: iv_ruleEnumDeclaration= ruleEnumDeclaration EOF
            {
             newCompositeNode(grammarAccess.getEnumDeclarationRule()); 
            pushFollow(FOLLOW_ruleEnumDeclaration_in_entryRuleEnumDeclaration877);
            iv_ruleEnumDeclaration=ruleEnumDeclaration();

            state._fsp--;

             current =iv_ruleEnumDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumDeclaration887); 

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
    // $ANTLR end "entryRuleEnumDeclaration"


    // $ANTLR start "ruleEnumDeclaration"
    // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:400:1: ruleEnumDeclaration returns [EObject current=null] : (otherlv_0= 'Enumeration' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_values_3_0= RULE_ID ) ) (otherlv_4= ',' this_ID_5= RULE_ID )* otherlv_6= '}' ) ;
    public final EObject ruleEnumDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_values_3_0=null;
        Token otherlv_4=null;
        Token this_ID_5=null;
        Token otherlv_6=null;

         enterRule(); 
            
        try {
            // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:403:28: ( (otherlv_0= 'Enumeration' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_values_3_0= RULE_ID ) ) (otherlv_4= ',' this_ID_5= RULE_ID )* otherlv_6= '}' ) )
            // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:404:1: (otherlv_0= 'Enumeration' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_values_3_0= RULE_ID ) ) (otherlv_4= ',' this_ID_5= RULE_ID )* otherlv_6= '}' )
            {
            // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:404:1: (otherlv_0= 'Enumeration' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_values_3_0= RULE_ID ) ) (otherlv_4= ',' this_ID_5= RULE_ID )* otherlv_6= '}' )
            // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:404:3: otherlv_0= 'Enumeration' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_values_3_0= RULE_ID ) ) (otherlv_4= ',' this_ID_5= RULE_ID )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleEnumDeclaration924); 

                	newLeafNode(otherlv_0, grammarAccess.getEnumDeclarationAccess().getEnumerationKeyword_0());
                
            // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:408:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:409:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:409:1: (lv_name_1_0= RULE_ID )
            // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:410:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumDeclaration941); 

            			newLeafNode(lv_name_1_0, grammarAccess.getEnumDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEnumDeclarationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleEnumDeclaration958); 

                	newLeafNode(otherlv_2, grammarAccess.getEnumDeclarationAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:430:1: ( (lv_values_3_0= RULE_ID ) )
            // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:431:1: (lv_values_3_0= RULE_ID )
            {
            // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:431:1: (lv_values_3_0= RULE_ID )
            // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:432:3: lv_values_3_0= RULE_ID
            {
            lv_values_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumDeclaration975); 

            			newLeafNode(lv_values_3_0, grammarAccess.getEnumDeclarationAccess().getValuesIDTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEnumDeclarationRule());
            	        }
                   		addWithLastConsumed(
                   			current, 
                   			"values",
                    		lv_values_3_0, 
                    		"ID");
            	    

            }


            }

            // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:448:2: (otherlv_4= ',' this_ID_5= RULE_ID )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==19) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:448:4: otherlv_4= ',' this_ID_5= RULE_ID
            	    {
            	    otherlv_4=(Token)match(input,19,FOLLOW_19_in_ruleEnumDeclaration993); 

            	        	newLeafNode(otherlv_4, grammarAccess.getEnumDeclarationAccess().getCommaKeyword_4_0());
            	        
            	    this_ID_5=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumDeclaration1004); 
            	     
            	        newLeafNode(this_ID_5, grammarAccess.getEnumDeclarationAccess().getIDTerminalRuleCall_4_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_6=(Token)match(input,15,FOLLOW_15_in_ruleEnumDeclaration1017); 

                	newLeafNode(otherlv_6, grammarAccess.getEnumDeclarationAccess().getRightCurlyBracketKeyword_5());
                

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
    // $ANTLR end "ruleEnumDeclaration"


    // $ANTLR start "entryRuleFQN"
    // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:468:1: entryRuleFQN returns [String current=null] : iv_ruleFQN= ruleFQN EOF ;
    public final String entryRuleFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQN = null;


        try {
            // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:469:2: (iv_ruleFQN= ruleFQN EOF )
            // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:470:2: iv_ruleFQN= ruleFQN EOF
            {
             newCompositeNode(grammarAccess.getFQNRule()); 
            pushFollow(FOLLOW_ruleFQN_in_entryRuleFQN1054);
            iv_ruleFQN=ruleFQN();

            state._fsp--;

             current =iv_ruleFQN.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFQN1065); 

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
    // $ANTLR end "entryRuleFQN"


    // $ANTLR start "ruleFQN"
    // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:477:1: ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:480:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:481:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:481:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:481:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFQN1105); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 
                
            // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:488:1: (kw= '.' this_ID_2= RULE_ID )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==20) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:489:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,20,FOLLOW_20_in_ruleFQN1124); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFQN1139); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop8;
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
    // $ANTLR end "ruleFQN"


    // $ANTLR start "entryRuleEntity"
    // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:509:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:510:2: (iv_ruleEntity= ruleEntity EOF )
            // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:511:2: iv_ruleEntity= ruleEntity EOF
            {
             newCompositeNode(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_ruleEntity_in_entryRuleEntity1186);
            iv_ruleEntity=ruleEntity();

            state._fsp--;

             current =iv_ruleEntity; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntity1196); 

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
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:518:1: ruleEntity returns [EObject current=null] : (otherlv_0= 'Entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_properties_3_0= ruleProperty ) )* otherlv_4= '}' ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_properties_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:521:28: ( (otherlv_0= 'Entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_properties_3_0= ruleProperty ) )* otherlv_4= '}' ) )
            // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:522:1: (otherlv_0= 'Entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_properties_3_0= ruleProperty ) )* otherlv_4= '}' )
            {
            // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:522:1: (otherlv_0= 'Entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_properties_3_0= ruleProperty ) )* otherlv_4= '}' )
            // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:522:3: otherlv_0= 'Entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_properties_3_0= ruleProperty ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_21_in_ruleEntity1233); 

                	newLeafNode(otherlv_0, grammarAccess.getEntityAccess().getEntityKeyword_0());
                
            // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:526:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:527:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:527:1: (lv_name_1_0= RULE_ID )
            // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:528:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEntity1250); 

            			newLeafNode(lv_name_1_0, grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEntityRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleEntity1267); 

                	newLeafNode(otherlv_2, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:548:1: ( (lv_properties_3_0= ruleProperty ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==24||LA9_0==30) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:549:1: (lv_properties_3_0= ruleProperty )
            	    {
            	    // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:549:1: (lv_properties_3_0= ruleProperty )
            	    // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:550:3: lv_properties_3_0= ruleProperty
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEntityAccess().getPropertiesPropertyParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleProperty_in_ruleEntity1288);
            	    lv_properties_3_0=ruleProperty();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEntityRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"properties",
            	            		lv_properties_3_0, 
            	            		"Property");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleEntity1301); 

                	newLeafNode(otherlv_4, grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleDomain"
    // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:578:1: entryRuleDomain returns [EObject current=null] : iv_ruleDomain= ruleDomain EOF ;
    public final EObject entryRuleDomain() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDomain = null;


        try {
            // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:579:2: (iv_ruleDomain= ruleDomain EOF )
            // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:580:2: iv_ruleDomain= ruleDomain EOF
            {
             newCompositeNode(grammarAccess.getDomainRule()); 
            pushFollow(FOLLOW_ruleDomain_in_entryRuleDomain1337);
            iv_ruleDomain=ruleDomain();

            state._fsp--;

             current =iv_ruleDomain; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDomain1347); 

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
    // $ANTLR end "entryRuleDomain"


    // $ANTLR start "ruleDomain"
    // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:587:1: ruleDomain returns [EObject current=null] : ( ( (lv_imports_0_0= ruleImport ) )* otherlv_1= 'Domain' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'Description: ' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= '{' ( (lv_entities_6_0= ruleEntity ) )+ otherlv_7= '}' ) ;
    public final EObject ruleDomain() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_description_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_imports_0_0 = null;

        EObject lv_entities_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:590:28: ( ( ( (lv_imports_0_0= ruleImport ) )* otherlv_1= 'Domain' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'Description: ' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= '{' ( (lv_entities_6_0= ruleEntity ) )+ otherlv_7= '}' ) )
            // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:591:1: ( ( (lv_imports_0_0= ruleImport ) )* otherlv_1= 'Domain' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'Description: ' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= '{' ( (lv_entities_6_0= ruleEntity ) )+ otherlv_7= '}' )
            {
            // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:591:1: ( ( (lv_imports_0_0= ruleImport ) )* otherlv_1= 'Domain' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'Description: ' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= '{' ( (lv_entities_6_0= ruleEntity ) )+ otherlv_7= '}' )
            // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:591:2: ( (lv_imports_0_0= ruleImport ) )* otherlv_1= 'Domain' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'Description: ' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= '{' ( (lv_entities_6_0= ruleEntity ) )+ otherlv_7= '}'
            {
            // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:591:2: ( (lv_imports_0_0= ruleImport ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==11) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:592:1: (lv_imports_0_0= ruleImport )
            	    {
            	    // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:592:1: (lv_imports_0_0= ruleImport )
            	    // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:593:3: lv_imports_0_0= ruleImport
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDomainAccess().getImportsImportParserRuleCall_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleImport_in_ruleDomain1393);
            	    lv_imports_0_0=ruleImport();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDomainRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"imports",
            	            		lv_imports_0_0, 
            	            		"Import");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_1=(Token)match(input,22,FOLLOW_22_in_ruleDomain1406); 

                	newLeafNode(otherlv_1, grammarAccess.getDomainAccess().getDomainKeyword_1());
                
            // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:613:1: ( (lv_name_2_0= RULE_ID ) )
            // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:614:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:614:1: (lv_name_2_0= RULE_ID )
            // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:615:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDomain1423); 

            			newLeafNode(lv_name_2_0, grammarAccess.getDomainAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDomainRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,23,FOLLOW_23_in_ruleDomain1440); 

                	newLeafNode(otherlv_3, grammarAccess.getDomainAccess().getDescriptionKeyword_3());
                
            // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:635:1: ( (lv_description_4_0= RULE_STRING ) )
            // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:636:1: (lv_description_4_0= RULE_STRING )
            {
            // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:636:1: (lv_description_4_0= RULE_STRING )
            // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:637:3: lv_description_4_0= RULE_STRING
            {
            lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDomain1457); 

            			newLeafNode(lv_description_4_0, grammarAccess.getDomainAccess().getDescriptionSTRINGTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDomainRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"description",
                    		lv_description_4_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleDomain1474); 

                	newLeafNode(otherlv_5, grammarAccess.getDomainAccess().getLeftCurlyBracketKeyword_5());
                
            // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:657:1: ( (lv_entities_6_0= ruleEntity ) )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==21) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:658:1: (lv_entities_6_0= ruleEntity )
            	    {
            	    // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:658:1: (lv_entities_6_0= ruleEntity )
            	    // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:659:3: lv_entities_6_0= ruleEntity
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDomainAccess().getEntitiesEntityParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEntity_in_ruleDomain1495);
            	    lv_entities_6_0=ruleEntity();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDomainRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"entities",
            	            		lv_entities_6_0, 
            	            		"Entity");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);

            otherlv_7=(Token)match(input,15,FOLLOW_15_in_ruleDomain1508); 

                	newLeafNode(otherlv_7, grammarAccess.getDomainAccess().getRightCurlyBracketKeyword_7());
                

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
    // $ANTLR end "ruleDomain"


    // $ANTLR start "entryRuleProperty"
    // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:687:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:688:2: (iv_ruleProperty= ruleProperty EOF )
            // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:689:2: iv_ruleProperty= ruleProperty EOF
            {
             newCompositeNode(grammarAccess.getPropertyRule()); 
            pushFollow(FOLLOW_ruleProperty_in_entryRuleProperty1544);
            iv_ruleProperty=ruleProperty();

            state._fsp--;

             current =iv_ruleProperty; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProperty1554); 

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
    // $ANTLR end "entryRuleProperty"


    // $ANTLR start "ruleProperty"
    // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:696:1: ruleProperty returns [EObject current=null] : (this_Field_0= ruleField | this_Association_1= ruleAssociation ) ;
    public final EObject ruleProperty() throws RecognitionException {
        EObject current = null;

        EObject this_Field_0 = null;

        EObject this_Association_1 = null;


         enterRule(); 
            
        try {
            // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:699:28: ( (this_Field_0= ruleField | this_Association_1= ruleAssociation ) )
            // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:700:1: (this_Field_0= ruleField | this_Association_1= ruleAssociation )
            {
            // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:700:1: (this_Field_0= ruleField | this_Association_1= ruleAssociation )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==30) ) {
                alt12=1;
            }
            else if ( (LA12_0==24) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:701:5: this_Field_0= ruleField
                    {
                     
                            newCompositeNode(grammarAccess.getPropertyAccess().getFieldParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleField_in_ruleProperty1601);
                    this_Field_0=ruleField();

                    state._fsp--;

                     
                            current = this_Field_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:711:5: this_Association_1= ruleAssociation
                    {
                     
                            newCompositeNode(grammarAccess.getPropertyAccess().getAssociationParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleAssociation_in_ruleProperty1628);
                    this_Association_1=ruleAssociation();

                    state._fsp--;

                     
                            current = this_Association_1; 
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
    // $ANTLR end "ruleProperty"


    // $ANTLR start "entryRuleAssociation"
    // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:727:1: entryRuleAssociation returns [EObject current=null] : iv_ruleAssociation= ruleAssociation EOF ;
    public final EObject entryRuleAssociation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssociation = null;


        try {
            // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:728:2: (iv_ruleAssociation= ruleAssociation EOF )
            // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:729:2: iv_ruleAssociation= ruleAssociation EOF
            {
             newCompositeNode(grammarAccess.getAssociationRule()); 
            pushFollow(FOLLOW_ruleAssociation_in_entryRuleAssociation1663);
            iv_ruleAssociation=ruleAssociation();

            state._fsp--;

             current =iv_ruleAssociation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssociation1673); 

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
    // $ANTLR end "entryRuleAssociation"


    // $ANTLR start "ruleAssociation"
    // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:736:1: ruleAssociation returns [EObject current=null] : (otherlv_0= 'Relation' ( (lv_multiplicity_1_0= ruleMultiplicty ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( ( ruleFQN ) ) ) ;
    public final EObject ruleAssociation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_multiplicity_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:739:28: ( (otherlv_0= 'Relation' ( (lv_multiplicity_1_0= ruleMultiplicty ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( ( ruleFQN ) ) ) )
            // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:740:1: (otherlv_0= 'Relation' ( (lv_multiplicity_1_0= ruleMultiplicty ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( ( ruleFQN ) ) )
            {
            // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:740:1: (otherlv_0= 'Relation' ( (lv_multiplicity_1_0= ruleMultiplicty ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( ( ruleFQN ) ) )
            // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:740:3: otherlv_0= 'Relation' ( (lv_multiplicity_1_0= ruleMultiplicty ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( ( ruleFQN ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_24_in_ruleAssociation1710); 

                	newLeafNode(otherlv_0, grammarAccess.getAssociationAccess().getRelationKeyword_0());
                
            // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:744:1: ( (lv_multiplicity_1_0= ruleMultiplicty ) )
            // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:745:1: (lv_multiplicity_1_0= ruleMultiplicty )
            {
            // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:745:1: (lv_multiplicity_1_0= ruleMultiplicty )
            // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:746:3: lv_multiplicity_1_0= ruleMultiplicty
            {
             
            	        newCompositeNode(grammarAccess.getAssociationAccess().getMultiplicityMultiplictyParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleMultiplicty_in_ruleAssociation1731);
            lv_multiplicity_1_0=ruleMultiplicty();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAssociationRule());
            	        }
                   		set(
                   			current, 
                   			"multiplicity",
                    		lv_multiplicity_1_0, 
                    		"Multiplicty");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:762:2: ( (lv_name_2_0= RULE_ID ) )
            // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:763:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:763:1: (lv_name_2_0= RULE_ID )
            // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:764:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAssociation1748); 

            			newLeafNode(lv_name_2_0, grammarAccess.getAssociationAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAssociationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,25,FOLLOW_25_in_ruleAssociation1765); 

                	newLeafNode(otherlv_3, grammarAccess.getAssociationAccess().getColonKeyword_3());
                
            // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:784:1: ( ( ruleFQN ) )
            // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:785:1: ( ruleFQN )
            {
            // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:785:1: ( ruleFQN )
            // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:786:3: ruleFQN
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getAssociationRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getAssociationAccess().getTypeEntityCrossReference_4_0()); 
            	    
            pushFollow(FOLLOW_ruleFQN_in_ruleAssociation1788);
            ruleFQN();

            state._fsp--;

             
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
    // $ANTLR end "ruleAssociation"


    // $ANTLR start "entryRuleMultiplicty"
    // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:807:1: entryRuleMultiplicty returns [String current=null] : iv_ruleMultiplicty= ruleMultiplicty EOF ;
    public final String entryRuleMultiplicty() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMultiplicty = null;


        try {
            // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:808:2: (iv_ruleMultiplicty= ruleMultiplicty EOF )
            // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:809:2: iv_ruleMultiplicty= ruleMultiplicty EOF
            {
             newCompositeNode(grammarAccess.getMultiplictyRule()); 
            pushFollow(FOLLOW_ruleMultiplicty_in_entryRuleMultiplicty1825);
            iv_ruleMultiplicty=ruleMultiplicty();

            state._fsp--;

             current =iv_ruleMultiplicty.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiplicty1836); 

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
    // $ANTLR end "entryRuleMultiplicty"


    // $ANTLR start "ruleMultiplicty"
    // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:816:1: ruleMultiplicty returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '1..N' | kw= '0..N' | kw= '1' | kw= '1..0' ) ;
    public final AntlrDatatypeRuleToken ruleMultiplicty() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:819:28: ( (kw= '1..N' | kw= '0..N' | kw= '1' | kw= '1..0' ) )
            // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:820:1: (kw= '1..N' | kw= '0..N' | kw= '1' | kw= '1..0' )
            {
            // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:820:1: (kw= '1..N' | kw= '0..N' | kw= '1' | kw= '1..0' )
            int alt13=4;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt13=1;
                }
                break;
            case 27:
                {
                alt13=2;
                }
                break;
            case 28:
                {
                alt13=3;
                }
                break;
            case 29:
                {
                alt13=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:821:2: kw= '1..N'
                    {
                    kw=(Token)match(input,26,FOLLOW_26_in_ruleMultiplicty1874); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getMultiplictyAccess().getNKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:828:2: kw= '0..N'
                    {
                    kw=(Token)match(input,27,FOLLOW_27_in_ruleMultiplicty1893); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getMultiplictyAccess().getNKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:835:2: kw= '1'
                    {
                    kw=(Token)match(input,28,FOLLOW_28_in_ruleMultiplicty1912); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getMultiplictyAccess().getDigitOneKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:842:2: kw= '1..0'
                    {
                    kw=(Token)match(input,29,FOLLOW_29_in_ruleMultiplicty1931); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getMultiplictyAccess().getDigitOneFullStopFullStopDigitZeroKeyword_3()); 
                        

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
    // $ANTLR end "ruleMultiplicty"


    // $ANTLR start "entryRuleField"
    // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:855:1: entryRuleField returns [EObject current=null] : iv_ruleField= ruleField EOF ;
    public final EObject entryRuleField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleField = null;


        try {
            // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:856:2: (iv_ruleField= ruleField EOF )
            // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:857:2: iv_ruleField= ruleField EOF
            {
             newCompositeNode(grammarAccess.getFieldRule()); 
            pushFollow(FOLLOW_ruleField_in_entryRuleField1971);
            iv_ruleField=ruleField();

            state._fsp--;

             current =iv_ruleField; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleField1981); 

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
    // $ANTLR end "entryRuleField"


    // $ANTLR start "ruleField"
    // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:864:1: ruleField returns [EObject current=null] : (otherlv_0= 'Field' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_literal_3_0= ruleLiteral ) ) ) ;
    public final EObject ruleField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_literal_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:867:28: ( (otherlv_0= 'Field' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_literal_3_0= ruleLiteral ) ) ) )
            // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:868:1: (otherlv_0= 'Field' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_literal_3_0= ruleLiteral ) ) )
            {
            // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:868:1: (otherlv_0= 'Field' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_literal_3_0= ruleLiteral ) ) )
            // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:868:3: otherlv_0= 'Field' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_literal_3_0= ruleLiteral ) )
            {
            otherlv_0=(Token)match(input,30,FOLLOW_30_in_ruleField2018); 

                	newLeafNode(otherlv_0, grammarAccess.getFieldAccess().getFieldKeyword_0());
                
            // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:872:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:873:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:873:1: (lv_name_1_0= RULE_ID )
            // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:874:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleField2035); 

            			newLeafNode(lv_name_1_0, grammarAccess.getFieldAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFieldRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,25,FOLLOW_25_in_ruleField2052); 

                	newLeafNode(otherlv_2, grammarAccess.getFieldAccess().getColonKeyword_2());
                
            // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:894:1: ( (lv_literal_3_0= ruleLiteral ) )
            // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:895:1: (lv_literal_3_0= ruleLiteral )
            {
            // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:895:1: (lv_literal_3_0= ruleLiteral )
            // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:896:3: lv_literal_3_0= ruleLiteral
            {
             
            	        newCompositeNode(grammarAccess.getFieldAccess().getLiteralLiteralParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleLiteral_in_ruleField2073);
            lv_literal_3_0=ruleLiteral();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFieldRule());
            	        }
                   		set(
                   			current, 
                   			"literal",
                    		lv_literal_3_0, 
                    		"Literal");
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
    // $ANTLR end "ruleField"


    // $ANTLR start "entryRuleLiteral"
    // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:920:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:921:2: (iv_ruleLiteral= ruleLiteral EOF )
            // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:922:2: iv_ruleLiteral= ruleLiteral EOF
            {
             newCompositeNode(grammarAccess.getLiteralRule()); 
            pushFollow(FOLLOW_ruleLiteral_in_entryRuleLiteral2109);
            iv_ruleLiteral=ruleLiteral();

            state._fsp--;

             current =iv_ruleLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteral2119); 

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
    // $ANTLR end "entryRuleLiteral"


    // $ANTLR start "ruleLiteral"
    // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:929:1: ruleLiteral returns [EObject current=null] : ( ( () otherlv_1= 'Decimal' ) | ( () otherlv_3= 'Geld' ) | ( () otherlv_5= 'Text' ) | ( () otherlv_7= 'Boolean' ) | ( () otherlv_9= 'Int' ) | this_Enum_10= ruleEnum ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject this_Enum_10 = null;


         enterRule(); 
            
        try {
            // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:932:28: ( ( ( () otherlv_1= 'Decimal' ) | ( () otherlv_3= 'Geld' ) | ( () otherlv_5= 'Text' ) | ( () otherlv_7= 'Boolean' ) | ( () otherlv_9= 'Int' ) | this_Enum_10= ruleEnum ) )
            // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:933:1: ( ( () otherlv_1= 'Decimal' ) | ( () otherlv_3= 'Geld' ) | ( () otherlv_5= 'Text' ) | ( () otherlv_7= 'Boolean' ) | ( () otherlv_9= 'Int' ) | this_Enum_10= ruleEnum )
            {
            // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:933:1: ( ( () otherlv_1= 'Decimal' ) | ( () otherlv_3= 'Geld' ) | ( () otherlv_5= 'Text' ) | ( () otherlv_7= 'Boolean' ) | ( () otherlv_9= 'Int' ) | this_Enum_10= ruleEnum )
            int alt14=6;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt14=1;
                }
                break;
            case 32:
                {
                alt14=2;
                }
                break;
            case 33:
                {
                alt14=3;
                }
                break;
            case 34:
                {
                alt14=4;
                }
                break;
            case 35:
                {
                alt14=5;
                }
                break;
            case 36:
                {
                alt14=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:933:2: ( () otherlv_1= 'Decimal' )
                    {
                    // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:933:2: ( () otherlv_1= 'Decimal' )
                    // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:933:3: () otherlv_1= 'Decimal'
                    {
                    // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:933:3: ()
                    // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:934:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getLiteralAccess().getLiteralAction_0_0(),
                                current);
                        

                    }

                    otherlv_1=(Token)match(input,31,FOLLOW_31_in_ruleLiteral2166); 

                        	newLeafNode(otherlv_1, grammarAccess.getLiteralAccess().getDecimalKeyword_0_1());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:944:6: ( () otherlv_3= 'Geld' )
                    {
                    // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:944:6: ( () otherlv_3= 'Geld' )
                    // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:944:7: () otherlv_3= 'Geld'
                    {
                    // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:944:7: ()
                    // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:945:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getLiteralAccess().getLiteralAction_1_0(),
                                current);
                        

                    }

                    otherlv_3=(Token)match(input,32,FOLLOW_32_in_ruleLiteral2195); 

                        	newLeafNode(otherlv_3, grammarAccess.getLiteralAccess().getGeldKeyword_1_1());
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:955:6: ( () otherlv_5= 'Text' )
                    {
                    // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:955:6: ( () otherlv_5= 'Text' )
                    // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:955:7: () otherlv_5= 'Text'
                    {
                    // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:955:7: ()
                    // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:956:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getLiteralAccess().getLiteralAction_2_0(),
                                current);
                        

                    }

                    otherlv_5=(Token)match(input,33,FOLLOW_33_in_ruleLiteral2224); 

                        	newLeafNode(otherlv_5, grammarAccess.getLiteralAccess().getTextKeyword_2_1());
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:966:6: ( () otherlv_7= 'Boolean' )
                    {
                    // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:966:6: ( () otherlv_7= 'Boolean' )
                    // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:966:7: () otherlv_7= 'Boolean'
                    {
                    // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:966:7: ()
                    // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:967:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getLiteralAccess().getLiteralAction_3_0(),
                                current);
                        

                    }

                    otherlv_7=(Token)match(input,34,FOLLOW_34_in_ruleLiteral2253); 

                        	newLeafNode(otherlv_7, grammarAccess.getLiteralAccess().getBooleanKeyword_3_1());
                        

                    }


                    }
                    break;
                case 5 :
                    // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:977:6: ( () otherlv_9= 'Int' )
                    {
                    // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:977:6: ( () otherlv_9= 'Int' )
                    // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:977:7: () otherlv_9= 'Int'
                    {
                    // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:977:7: ()
                    // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:978:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getLiteralAccess().getLiteralAction_4_0(),
                                current);
                        

                    }

                    otherlv_9=(Token)match(input,35,FOLLOW_35_in_ruleLiteral2282); 

                        	newLeafNode(otherlv_9, grammarAccess.getLiteralAccess().getIntKeyword_4_1());
                        

                    }


                    }
                    break;
                case 6 :
                    // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:989:5: this_Enum_10= ruleEnum
                    {
                     
                            newCompositeNode(grammarAccess.getLiteralAccess().getEnumParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleEnum_in_ruleLiteral2311);
                    this_Enum_10=ruleEnum();

                    state._fsp--;

                     
                            current = this_Enum_10; 
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
    // $ANTLR end "ruleLiteral"


    // $ANTLR start "entryRuleEnum"
    // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:1005:1: entryRuleEnum returns [EObject current=null] : iv_ruleEnum= ruleEnum EOF ;
    public final EObject entryRuleEnum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnum = null;


        try {
            // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:1006:2: (iv_ruleEnum= ruleEnum EOF )
            // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:1007:2: iv_ruleEnum= ruleEnum EOF
            {
             newCompositeNode(grammarAccess.getEnumRule()); 
            pushFollow(FOLLOW_ruleEnum_in_entryRuleEnum2346);
            iv_ruleEnum=ruleEnum();

            state._fsp--;

             current =iv_ruleEnum; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnum2356); 

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
    // $ANTLR end "entryRuleEnum"


    // $ANTLR start "ruleEnum"
    // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:1014:1: ruleEnum returns [EObject current=null] : (otherlv_0= 'Enum' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleEnum() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:1017:28: ( (otherlv_0= 'Enum' ( (otherlv_1= RULE_ID ) ) ) )
            // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:1018:1: (otherlv_0= 'Enum' ( (otherlv_1= RULE_ID ) ) )
            {
            // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:1018:1: (otherlv_0= 'Enum' ( (otherlv_1= RULE_ID ) ) )
            // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:1018:3: otherlv_0= 'Enum' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,36,FOLLOW_36_in_ruleEnum2393); 

                	newLeafNode(otherlv_0, grammarAccess.getEnumAccess().getEnumKeyword_0());
                
            // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:1022:1: ( (otherlv_1= RULE_ID ) )
            // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:1023:1: (otherlv_1= RULE_ID )
            {
            // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:1023:1: (otherlv_1= RULE_ID )
            // ../org.pklose/src-gen/org/pklose/simplespec/parser/antlr/internal/InternalSimplespec.g:1024:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getEnumRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnum2413); 

            		newLeafNode(otherlv_1, grammarAccess.getEnumAccess().getTypeEnumDeclarationCrossReference_1_0()); 
            	

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
    // $ANTLR end "ruleEnum"

    // Delegated rules


    protected DFA1 dfa1 = new DFA1(this);
    static final String DFA1_eotS =
        "\11\uffff";
    static final String DFA1_eofS =
        "\11\uffff";
    static final String DFA1_minS =
        "\1\13\1\uffff\1\4\2\uffff\1\13\1\4\2\13";
    static final String DFA1_maxS =
        "\1\26\1\uffff\1\4\2\uffff\1\26\1\4\2\26";
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
            return "119:1: (this_EnumDeclaration_0= ruleEnumDeclaration | this_Diagram_1= ruleDiagram | this_Domain_2= ruleDomain )";
        }
    }
 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElement_in_ruleModel130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElement_in_entryRuleElement165 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElement175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumDeclaration_in_ruleElement222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDiagram_in_ruleElement249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDomain_in_ruleElement276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport311 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleImport358 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFqnWithWildCard_in_ruleImport379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFqnWithWildCard_in_entryRuleFqnWithWildCard416 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFqnWithWildCard427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleFqnWithWildCard474 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_12_in_ruleFqnWithWildCard493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDiagram_in_entryRuleDiagram535 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDiagram545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_ruleDiagram591 = new BitSet(new long[]{0x0000000000002800L});
    public static final BitSet FOLLOW_13_in_ruleDiagram604 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDiagram621 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleDiagram638 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_ruleInclude_in_ruleDiagram659 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_15_in_ruleDiagram672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInclude_in_entryRuleInclude708 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInclude718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleInclude755 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleInclude778 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_ruleInclude791 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleInclude803 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleInclude826 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_15_in_ruleInclude839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumDeclaration_in_entryRuleEnumDeclaration877 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumDeclaration887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleEnumDeclaration924 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumDeclaration941 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleEnumDeclaration958 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumDeclaration975 = new BitSet(new long[]{0x0000000000088000L});
    public static final BitSet FOLLOW_19_in_ruleEnumDeclaration993 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumDeclaration1004 = new BitSet(new long[]{0x0000000000088000L});
    public static final BitSet FOLLOW_15_in_ruleEnumDeclaration1017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_entryRuleFQN1054 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFQN1065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFQN1105 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20_in_ruleFQN1124 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFQN1139 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_ruleEntity_in_entryRuleEntity1186 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntity1196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleEntity1233 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEntity1250 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleEntity1267 = new BitSet(new long[]{0x0000000041008000L});
    public static final BitSet FOLLOW_ruleProperty_in_ruleEntity1288 = new BitSet(new long[]{0x0000000041008000L});
    public static final BitSet FOLLOW_15_in_ruleEntity1301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDomain_in_entryRuleDomain1337 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDomain1347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_ruleDomain1393 = new BitSet(new long[]{0x0000000000402800L});
    public static final BitSet FOLLOW_22_in_ruleDomain1406 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDomain1423 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleDomain1440 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDomain1457 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleDomain1474 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_ruleEntity_in_ruleDomain1495 = new BitSet(new long[]{0x0000000000208000L});
    public static final BitSet FOLLOW_15_in_ruleDomain1508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_entryRuleProperty1544 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProperty1554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleField_in_ruleProperty1601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssociation_in_ruleProperty1628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssociation_in_entryRuleAssociation1663 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssociation1673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleAssociation1710 = new BitSet(new long[]{0x000000003C000000L});
    public static final BitSet FOLLOW_ruleMultiplicty_in_ruleAssociation1731 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAssociation1748 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleAssociation1765 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleAssociation1788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplicty_in_entryRuleMultiplicty1825 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiplicty1836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleMultiplicty1874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleMultiplicty1893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleMultiplicty1912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleMultiplicty1931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleField_in_entryRuleField1971 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleField1981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleField2018 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleField2035 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleField2052 = new BitSet(new long[]{0x0000001F80000000L});
    public static final BitSet FOLLOW_ruleLiteral_in_ruleField2073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral2109 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteral2119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleLiteral2166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleLiteral2195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleLiteral2224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleLiteral2253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleLiteral2282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnum_in_ruleLiteral2311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnum_in_entryRuleEnum2346 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnum2356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleEnum2393 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnum2413 = new BitSet(new long[]{0x0000000000000002L});

}