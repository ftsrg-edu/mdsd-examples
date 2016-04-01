package hu.bme.mit.mdsd.erdiagram.text.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import hu.bme.mit.mdsd.erdiagram.text.services.ERDiagramDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalERDiagramDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'entity'", "'isA'", "'{'", "','", "'}'", "':'", "'key'", "'is related with'", "'nullable'", "'int'", "'double'", "'string'", "'boolean'", "'datetime'", "'one'", "'many'"
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

        public InternalERDiagramDslParser(TokenStream input, ERDiagramDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "ERDiagram";
       	}

       	@Override
       	protected ERDiagramDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleERDiagram"
    // InternalERDiagramDsl.g:65:1: entryRuleERDiagram returns [EObject current=null] : iv_ruleERDiagram= ruleERDiagram EOF ;
    public final EObject entryRuleERDiagram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleERDiagram = null;


        try {
            // InternalERDiagramDsl.g:65:50: (iv_ruleERDiagram= ruleERDiagram EOF )
            // InternalERDiagramDsl.g:66:2: iv_ruleERDiagram= ruleERDiagram EOF
            {
             newCompositeNode(grammarAccess.getERDiagramRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleERDiagram=ruleERDiagram();

            state._fsp--;

             current =iv_ruleERDiagram; 
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
    // $ANTLR end "entryRuleERDiagram"


    // $ANTLR start "ruleERDiagram"
    // InternalERDiagramDsl.g:72:1: ruleERDiagram returns [EObject current=null] : ( ( (lv_entities_0_0= ruleEntity ) )* ( (lv_relation_1_0= ruleRelation ) )* ) ;
    public final EObject ruleERDiagram() throws RecognitionException {
        EObject current = null;

        EObject lv_entities_0_0 = null;

        EObject lv_relation_1_0 = null;



        	enterRule();

        try {
            // InternalERDiagramDsl.g:78:2: ( ( ( (lv_entities_0_0= ruleEntity ) )* ( (lv_relation_1_0= ruleRelation ) )* ) )
            // InternalERDiagramDsl.g:79:2: ( ( (lv_entities_0_0= ruleEntity ) )* ( (lv_relation_1_0= ruleRelation ) )* )
            {
            // InternalERDiagramDsl.g:79:2: ( ( (lv_entities_0_0= ruleEntity ) )* ( (lv_relation_1_0= ruleRelation ) )* )
            // InternalERDiagramDsl.g:80:3: ( (lv_entities_0_0= ruleEntity ) )* ( (lv_relation_1_0= ruleRelation ) )*
            {
            // InternalERDiagramDsl.g:80:3: ( (lv_entities_0_0= ruleEntity ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalERDiagramDsl.g:81:4: (lv_entities_0_0= ruleEntity )
            	    {
            	    // InternalERDiagramDsl.g:81:4: (lv_entities_0_0= ruleEntity )
            	    // InternalERDiagramDsl.g:82:5: lv_entities_0_0= ruleEntity
            	    {

            	    					newCompositeNode(grammarAccess.getERDiagramAccess().getEntitiesEntityParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_entities_0_0=ruleEntity();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getERDiagramRule());
            	    					}
            	    					add(
            	    						current,
            	    						"entities",
            	    						lv_entities_0_0,
            	    						"hu.bme.mit.mdsd.erdiagram.text.ERDiagramDsl.Entity");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalERDiagramDsl.g:99:3: ( (lv_relation_1_0= ruleRelation ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==19||(LA2_0>=25 && LA2_0<=26)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalERDiagramDsl.g:100:4: (lv_relation_1_0= ruleRelation )
            	    {
            	    // InternalERDiagramDsl.g:100:4: (lv_relation_1_0= ruleRelation )
            	    // InternalERDiagramDsl.g:101:5: lv_relation_1_0= ruleRelation
            	    {

            	    					newCompositeNode(grammarAccess.getERDiagramAccess().getRelationRelationParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_relation_1_0=ruleRelation();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getERDiagramRule());
            	    					}
            	    					add(
            	    						current,
            	    						"relation",
            	    						lv_relation_1_0,
            	    						"hu.bme.mit.mdsd.erdiagram.text.ERDiagramDsl.Relation");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
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
    // $ANTLR end "ruleERDiagram"


    // $ANTLR start "entryRuleEntity"
    // InternalERDiagramDsl.g:122:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // InternalERDiagramDsl.g:122:47: (iv_ruleEntity= ruleEntity EOF )
            // InternalERDiagramDsl.g:123:2: iv_ruleEntity= ruleEntity EOF
            {
             newCompositeNode(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntity=ruleEntity();

            state._fsp--;

             current =iv_ruleEntity; 
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
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // InternalERDiagramDsl.g:129:1: ruleEntity returns [EObject current=null] : (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'isA' ( (otherlv_3= RULE_ID ) ) )* (otherlv_4= '{' ( (lv_attributes_5_0= ruleAttribute ) ) (otherlv_6= ',' ( (lv_attributes_7_0= ruleAttribute ) ) )* otherlv_8= '}' )? ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_attributes_5_0 = null;

        EObject lv_attributes_7_0 = null;



        	enterRule();

        try {
            // InternalERDiagramDsl.g:135:2: ( (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'isA' ( (otherlv_3= RULE_ID ) ) )* (otherlv_4= '{' ( (lv_attributes_5_0= ruleAttribute ) ) (otherlv_6= ',' ( (lv_attributes_7_0= ruleAttribute ) ) )* otherlv_8= '}' )? ) )
            // InternalERDiagramDsl.g:136:2: (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'isA' ( (otherlv_3= RULE_ID ) ) )* (otherlv_4= '{' ( (lv_attributes_5_0= ruleAttribute ) ) (otherlv_6= ',' ( (lv_attributes_7_0= ruleAttribute ) ) )* otherlv_8= '}' )? )
            {
            // InternalERDiagramDsl.g:136:2: (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'isA' ( (otherlv_3= RULE_ID ) ) )* (otherlv_4= '{' ( (lv_attributes_5_0= ruleAttribute ) ) (otherlv_6= ',' ( (lv_attributes_7_0= ruleAttribute ) ) )* otherlv_8= '}' )? )
            // InternalERDiagramDsl.g:137:3: otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'isA' ( (otherlv_3= RULE_ID ) ) )* (otherlv_4= '{' ( (lv_attributes_5_0= ruleAttribute ) ) (otherlv_6= ',' ( (lv_attributes_7_0= ruleAttribute ) ) )* otherlv_8= '}' )?
            {
            otherlv_0=(Token)match(input,11,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getEntityAccess().getEntityKeyword_0());
            		
            // InternalERDiagramDsl.g:141:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalERDiagramDsl.g:142:4: (lv_name_1_0= RULE_ID )
            {
            // InternalERDiagramDsl.g:142:4: (lv_name_1_0= RULE_ID )
            // InternalERDiagramDsl.g:143:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEntityRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalERDiagramDsl.g:159:3: (otherlv_2= 'isA' ( (otherlv_3= RULE_ID ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==12) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalERDiagramDsl.g:160:4: otherlv_2= 'isA' ( (otherlv_3= RULE_ID ) )
            	    {
            	    otherlv_2=(Token)match(input,12,FOLLOW_5); 

            	    				newLeafNode(otherlv_2, grammarAccess.getEntityAccess().getIsAKeyword_2_0());
            	    			
            	    // InternalERDiagramDsl.g:164:4: ( (otherlv_3= RULE_ID ) )
            	    // InternalERDiagramDsl.g:165:5: (otherlv_3= RULE_ID )
            	    {
            	    // InternalERDiagramDsl.g:165:5: (otherlv_3= RULE_ID )
            	    // InternalERDiagramDsl.g:166:6: otherlv_3= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getEntityRule());
            	    						}
            	    					
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_6); 

            	    						newLeafNode(otherlv_3, grammarAccess.getEntityAccess().getIsAEntityCrossReference_2_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // InternalERDiagramDsl.g:178:3: (otherlv_4= '{' ( (lv_attributes_5_0= ruleAttribute ) ) (otherlv_6= ',' ( (lv_attributes_7_0= ruleAttribute ) ) )* otherlv_8= '}' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==13) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalERDiagramDsl.g:179:4: otherlv_4= '{' ( (lv_attributes_5_0= ruleAttribute ) ) (otherlv_6= ',' ( (lv_attributes_7_0= ruleAttribute ) ) )* otherlv_8= '}'
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3_0());
                    			
                    // InternalERDiagramDsl.g:183:4: ( (lv_attributes_5_0= ruleAttribute ) )
                    // InternalERDiagramDsl.g:184:5: (lv_attributes_5_0= ruleAttribute )
                    {
                    // InternalERDiagramDsl.g:184:5: (lv_attributes_5_0= ruleAttribute )
                    // InternalERDiagramDsl.g:185:6: lv_attributes_5_0= ruleAttribute
                    {

                    						newCompositeNode(grammarAccess.getEntityAccess().getAttributesAttributeParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_attributes_5_0=ruleAttribute();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEntityRule());
                    						}
                    						add(
                    							current,
                    							"attributes",
                    							lv_attributes_5_0,
                    							"hu.bme.mit.mdsd.erdiagram.text.ERDiagramDsl.Attribute");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalERDiagramDsl.g:202:4: (otherlv_6= ',' ( (lv_attributes_7_0= ruleAttribute ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==14) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalERDiagramDsl.g:203:5: otherlv_6= ',' ( (lv_attributes_7_0= ruleAttribute ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FOLLOW_5); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getEntityAccess().getCommaKeyword_3_2_0());
                    	    				
                    	    // InternalERDiagramDsl.g:207:5: ( (lv_attributes_7_0= ruleAttribute ) )
                    	    // InternalERDiagramDsl.g:208:6: (lv_attributes_7_0= ruleAttribute )
                    	    {
                    	    // InternalERDiagramDsl.g:208:6: (lv_attributes_7_0= ruleAttribute )
                    	    // InternalERDiagramDsl.g:209:7: lv_attributes_7_0= ruleAttribute
                    	    {

                    	    							newCompositeNode(grammarAccess.getEntityAccess().getAttributesAttributeParserRuleCall_3_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_attributes_7_0=ruleAttribute();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEntityRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"attributes",
                    	    								lv_attributes_7_0,
                    	    								"hu.bme.mit.mdsd.erdiagram.text.ERDiagramDsl.Attribute");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,15,FOLLOW_2); 

                    				newLeafNode(otherlv_8, grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_3_3());
                    			

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
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleAttribute"
    // InternalERDiagramDsl.g:236:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalERDiagramDsl.g:236:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalERDiagramDsl.g:237:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
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
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalERDiagramDsl.g:243:1: ruleAttribute returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleAttributeType ) ) ( (lv_isKey_3_0= 'key' ) )? ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_isKey_3_0=null;
        Enumerator lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalERDiagramDsl.g:249:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleAttributeType ) ) ( (lv_isKey_3_0= 'key' ) )? ) )
            // InternalERDiagramDsl.g:250:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleAttributeType ) ) ( (lv_isKey_3_0= 'key' ) )? )
            {
            // InternalERDiagramDsl.g:250:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleAttributeType ) ) ( (lv_isKey_3_0= 'key' ) )? )
            // InternalERDiagramDsl.g:251:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleAttributeType ) ) ( (lv_isKey_3_0= 'key' ) )?
            {
            // InternalERDiagramDsl.g:251:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalERDiagramDsl.g:252:4: (lv_name_0_0= RULE_ID )
            {
            // InternalERDiagramDsl.g:252:4: (lv_name_0_0= RULE_ID )
            // InternalERDiagramDsl.g:253:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_0_0, grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttributeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getAttributeAccess().getColonKeyword_1());
            		
            // InternalERDiagramDsl.g:273:3: ( (lv_type_2_0= ruleAttributeType ) )
            // InternalERDiagramDsl.g:274:4: (lv_type_2_0= ruleAttributeType )
            {
            // InternalERDiagramDsl.g:274:4: (lv_type_2_0= ruleAttributeType )
            // InternalERDiagramDsl.g:275:5: lv_type_2_0= ruleAttributeType
            {

            					newCompositeNode(grammarAccess.getAttributeAccess().getTypeAttributeTypeEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_10);
            lv_type_2_0=ruleAttributeType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttributeRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_2_0,
            						"hu.bme.mit.mdsd.erdiagram.text.ERDiagramDsl.AttributeType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalERDiagramDsl.g:292:3: ( (lv_isKey_3_0= 'key' ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalERDiagramDsl.g:293:4: (lv_isKey_3_0= 'key' )
                    {
                    // InternalERDiagramDsl.g:293:4: (lv_isKey_3_0= 'key' )
                    // InternalERDiagramDsl.g:294:5: lv_isKey_3_0= 'key'
                    {
                    lv_isKey_3_0=(Token)match(input,17,FOLLOW_2); 

                    					newLeafNode(lv_isKey_3_0, grammarAccess.getAttributeAccess().getIsKeyKeyKeyword_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAttributeRule());
                    					}
                    					setWithLastConsumed(current, "isKey", true, "key");
                    				

                    }


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
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleRelation"
    // InternalERDiagramDsl.g:310:1: entryRuleRelation returns [EObject current=null] : iv_ruleRelation= ruleRelation EOF ;
    public final EObject entryRuleRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelation = null;


        try {
            // InternalERDiagramDsl.g:310:49: (iv_ruleRelation= ruleRelation EOF )
            // InternalERDiagramDsl.g:311:2: iv_ruleRelation= ruleRelation EOF
            {
             newCompositeNode(grammarAccess.getRelationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRelation=ruleRelation();

            state._fsp--;

             current =iv_ruleRelation; 
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
    // $ANTLR end "entryRuleRelation"


    // $ANTLR start "ruleRelation"
    // InternalERDiagramDsl.g:317:1: ruleRelation returns [EObject current=null] : ( ( (lv_leftEnding_0_0= ruleRelationEnding ) ) otherlv_1= 'is related with' ( (lv_rightEnding_2_0= ruleRelationEnding ) ) ) ;
    public final EObject ruleRelation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_leftEnding_0_0 = null;

        EObject lv_rightEnding_2_0 = null;



        	enterRule();

        try {
            // InternalERDiagramDsl.g:323:2: ( ( ( (lv_leftEnding_0_0= ruleRelationEnding ) ) otherlv_1= 'is related with' ( (lv_rightEnding_2_0= ruleRelationEnding ) ) ) )
            // InternalERDiagramDsl.g:324:2: ( ( (lv_leftEnding_0_0= ruleRelationEnding ) ) otherlv_1= 'is related with' ( (lv_rightEnding_2_0= ruleRelationEnding ) ) )
            {
            // InternalERDiagramDsl.g:324:2: ( ( (lv_leftEnding_0_0= ruleRelationEnding ) ) otherlv_1= 'is related with' ( (lv_rightEnding_2_0= ruleRelationEnding ) ) )
            // InternalERDiagramDsl.g:325:3: ( (lv_leftEnding_0_0= ruleRelationEnding ) ) otherlv_1= 'is related with' ( (lv_rightEnding_2_0= ruleRelationEnding ) )
            {
            // InternalERDiagramDsl.g:325:3: ( (lv_leftEnding_0_0= ruleRelationEnding ) )
            // InternalERDiagramDsl.g:326:4: (lv_leftEnding_0_0= ruleRelationEnding )
            {
            // InternalERDiagramDsl.g:326:4: (lv_leftEnding_0_0= ruleRelationEnding )
            // InternalERDiagramDsl.g:327:5: lv_leftEnding_0_0= ruleRelationEnding
            {

            					newCompositeNode(grammarAccess.getRelationAccess().getLeftEndingRelationEndingParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_11);
            lv_leftEnding_0_0=ruleRelationEnding();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRelationRule());
            					}
            					set(
            						current,
            						"leftEnding",
            						lv_leftEnding_0_0,
            						"hu.bme.mit.mdsd.erdiagram.text.ERDiagramDsl.RelationEnding");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getRelationAccess().getIsRelatedWithKeyword_1());
            		
            // InternalERDiagramDsl.g:348:3: ( (lv_rightEnding_2_0= ruleRelationEnding ) )
            // InternalERDiagramDsl.g:349:4: (lv_rightEnding_2_0= ruleRelationEnding )
            {
            // InternalERDiagramDsl.g:349:4: (lv_rightEnding_2_0= ruleRelationEnding )
            // InternalERDiagramDsl.g:350:5: lv_rightEnding_2_0= ruleRelationEnding
            {

            					newCompositeNode(grammarAccess.getRelationAccess().getRightEndingRelationEndingParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_rightEnding_2_0=ruleRelationEnding();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRelationRule());
            					}
            					set(
            						current,
            						"rightEnding",
            						lv_rightEnding_2_0,
            						"hu.bme.mit.mdsd.erdiagram.text.ERDiagramDsl.RelationEnding");
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
    // $ANTLR end "ruleRelation"


    // $ANTLR start "entryRuleRelationEnding"
    // InternalERDiagramDsl.g:371:1: entryRuleRelationEnding returns [EObject current=null] : iv_ruleRelationEnding= ruleRelationEnding EOF ;
    public final EObject entryRuleRelationEnding() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationEnding = null;


        try {
            // InternalERDiagramDsl.g:371:55: (iv_ruleRelationEnding= ruleRelationEnding EOF )
            // InternalERDiagramDsl.g:372:2: iv_ruleRelationEnding= ruleRelationEnding EOF
            {
             newCompositeNode(grammarAccess.getRelationEndingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRelationEnding=ruleRelationEnding();

            state._fsp--;

             current =iv_ruleRelationEnding; 
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
    // $ANTLR end "entryRuleRelationEnding"


    // $ANTLR start "ruleRelationEnding"
    // InternalERDiagramDsl.g:378:1: ruleRelationEnding returns [EObject current=null] : ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_multiplicity_1_0= ruleMultiplicityType ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_nullable_2_0= 'nullable' ) ) ) ) ) )+ {...}?) ) ) ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleRelationEnding() throws RecognitionException {
        EObject current = null;

        Token lv_nullable_2_0=null;
        Token otherlv_3=null;
        Enumerator lv_multiplicity_1_0 = null;



        	enterRule();

        try {
            // InternalERDiagramDsl.g:384:2: ( ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_multiplicity_1_0= ruleMultiplicityType ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_nullable_2_0= 'nullable' ) ) ) ) ) )+ {...}?) ) ) ( (otherlv_3= RULE_ID ) ) ) )
            // InternalERDiagramDsl.g:385:2: ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_multiplicity_1_0= ruleMultiplicityType ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_nullable_2_0= 'nullable' ) ) ) ) ) )+ {...}?) ) ) ( (otherlv_3= RULE_ID ) ) )
            {
            // InternalERDiagramDsl.g:385:2: ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_multiplicity_1_0= ruleMultiplicityType ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_nullable_2_0= 'nullable' ) ) ) ) ) )+ {...}?) ) ) ( (otherlv_3= RULE_ID ) ) )
            // InternalERDiagramDsl.g:386:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_multiplicity_1_0= ruleMultiplicityType ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_nullable_2_0= 'nullable' ) ) ) ) ) )+ {...}?) ) ) ( (otherlv_3= RULE_ID ) )
            {
            // InternalERDiagramDsl.g:386:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_multiplicity_1_0= ruleMultiplicityType ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_nullable_2_0= 'nullable' ) ) ) ) ) )+ {...}?) ) )
            // InternalERDiagramDsl.g:387:4: ( ( ( ({...}? => ( ({...}? => ( (lv_multiplicity_1_0= ruleMultiplicityType ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_nullable_2_0= 'nullable' ) ) ) ) ) )+ {...}?) )
            {
            // InternalERDiagramDsl.g:387:4: ( ( ( ({...}? => ( ({...}? => ( (lv_multiplicity_1_0= ruleMultiplicityType ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_nullable_2_0= 'nullable' ) ) ) ) ) )+ {...}?) )
            // InternalERDiagramDsl.g:388:5: ( ( ({...}? => ( ({...}? => ( (lv_multiplicity_1_0= ruleMultiplicityType ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_nullable_2_0= 'nullable' ) ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getRelationEndingAccess().getUnorderedGroup_0());
            				
            // InternalERDiagramDsl.g:391:5: ( ( ({...}? => ( ({...}? => ( (lv_multiplicity_1_0= ruleMultiplicityType ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_nullable_2_0= 'nullable' ) ) ) ) ) )+ {...}?)
            // InternalERDiagramDsl.g:392:6: ( ({...}? => ( ({...}? => ( (lv_multiplicity_1_0= ruleMultiplicityType ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_nullable_2_0= 'nullable' ) ) ) ) ) )+ {...}?
            {
            // InternalERDiagramDsl.g:392:6: ( ({...}? => ( ({...}? => ( (lv_multiplicity_1_0= ruleMultiplicityType ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_nullable_2_0= 'nullable' ) ) ) ) ) )+
            int cnt7=0;
            loop7:
            do {
                int alt7=3;
                int LA7_0 = input.LA(1);

                if ( LA7_0 >= 25 && LA7_0 <= 26 && getUnorderedGroupHelper().canSelect(grammarAccess.getRelationEndingAccess().getUnorderedGroup_0(), 0) ) {
                    alt7=1;
                }
                else if ( LA7_0 == 19 && getUnorderedGroupHelper().canSelect(grammarAccess.getRelationEndingAccess().getUnorderedGroup_0(), 1) ) {
                    alt7=2;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalERDiagramDsl.g:393:4: ({...}? => ( ({...}? => ( (lv_multiplicity_1_0= ruleMultiplicityType ) ) ) ) )
            	    {
            	    // InternalERDiagramDsl.g:393:4: ({...}? => ( ({...}? => ( (lv_multiplicity_1_0= ruleMultiplicityType ) ) ) ) )
            	    // InternalERDiagramDsl.g:394:5: {...}? => ( ({...}? => ( (lv_multiplicity_1_0= ruleMultiplicityType ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRelationEndingAccess().getUnorderedGroup_0(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleRelationEnding", "getUnorderedGroupHelper().canSelect(grammarAccess.getRelationEndingAccess().getUnorderedGroup_0(), 0)");
            	    }
            	    // InternalERDiagramDsl.g:394:111: ( ({...}? => ( (lv_multiplicity_1_0= ruleMultiplicityType ) ) ) )
            	    // InternalERDiagramDsl.g:395:6: ({...}? => ( (lv_multiplicity_1_0= ruleMultiplicityType ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getRelationEndingAccess().getUnorderedGroup_0(), 0);
            	    					
            	    // InternalERDiagramDsl.g:398:9: ({...}? => ( (lv_multiplicity_1_0= ruleMultiplicityType ) ) )
            	    // InternalERDiagramDsl.g:398:10: {...}? => ( (lv_multiplicity_1_0= ruleMultiplicityType ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleRelationEnding", "true");
            	    }
            	    // InternalERDiagramDsl.g:398:19: ( (lv_multiplicity_1_0= ruleMultiplicityType ) )
            	    // InternalERDiagramDsl.g:398:20: (lv_multiplicity_1_0= ruleMultiplicityType )
            	    {
            	    // InternalERDiagramDsl.g:398:20: (lv_multiplicity_1_0= ruleMultiplicityType )
            	    // InternalERDiagramDsl.g:399:10: lv_multiplicity_1_0= ruleMultiplicityType
            	    {

            	    										newCompositeNode(grammarAccess.getRelationEndingAccess().getMultiplicityMultiplicityTypeEnumRuleCall_0_0_0());
            	    									
            	    pushFollow(FOLLOW_13);
            	    lv_multiplicity_1_0=ruleMultiplicityType();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getRelationEndingRule());
            	    										}
            	    										set(
            	    											current,
            	    											"multiplicity",
            	    											lv_multiplicity_1_0,
            	    											"hu.bme.mit.mdsd.erdiagram.text.ERDiagramDsl.MultiplicityType");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getRelationEndingAccess().getUnorderedGroup_0());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalERDiagramDsl.g:421:4: ({...}? => ( ({...}? => ( (lv_nullable_2_0= 'nullable' ) ) ) ) )
            	    {
            	    // InternalERDiagramDsl.g:421:4: ({...}? => ( ({...}? => ( (lv_nullable_2_0= 'nullable' ) ) ) ) )
            	    // InternalERDiagramDsl.g:422:5: {...}? => ( ({...}? => ( (lv_nullable_2_0= 'nullable' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRelationEndingAccess().getUnorderedGroup_0(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleRelationEnding", "getUnorderedGroupHelper().canSelect(grammarAccess.getRelationEndingAccess().getUnorderedGroup_0(), 1)");
            	    }
            	    // InternalERDiagramDsl.g:422:111: ( ({...}? => ( (lv_nullable_2_0= 'nullable' ) ) ) )
            	    // InternalERDiagramDsl.g:423:6: ({...}? => ( (lv_nullable_2_0= 'nullable' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getRelationEndingAccess().getUnorderedGroup_0(), 1);
            	    					
            	    // InternalERDiagramDsl.g:426:9: ({...}? => ( (lv_nullable_2_0= 'nullable' ) ) )
            	    // InternalERDiagramDsl.g:426:10: {...}? => ( (lv_nullable_2_0= 'nullable' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleRelationEnding", "true");
            	    }
            	    // InternalERDiagramDsl.g:426:19: ( (lv_nullable_2_0= 'nullable' ) )
            	    // InternalERDiagramDsl.g:426:20: (lv_nullable_2_0= 'nullable' )
            	    {
            	    // InternalERDiagramDsl.g:426:20: (lv_nullable_2_0= 'nullable' )
            	    // InternalERDiagramDsl.g:427:10: lv_nullable_2_0= 'nullable'
            	    {
            	    lv_nullable_2_0=(Token)match(input,19,FOLLOW_13); 

            	    										newLeafNode(lv_nullable_2_0, grammarAccess.getRelationEndingAccess().getNullableNullableKeyword_0_1_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getRelationEndingRule());
            	    										}
            	    										setWithLastConsumed(current, "nullable", true, "nullable");
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getRelationEndingAccess().getUnorderedGroup_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getRelationEndingAccess().getUnorderedGroup_0()) ) {
                throw new FailedPredicateException(input, "ruleRelationEnding", "getUnorderedGroupHelper().canLeave(grammarAccess.getRelationEndingAccess().getUnorderedGroup_0())");
            }

            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getRelationEndingAccess().getUnorderedGroup_0());
            				

            }

            // InternalERDiagramDsl.g:452:3: ( (otherlv_3= RULE_ID ) )
            // InternalERDiagramDsl.g:453:4: (otherlv_3= RULE_ID )
            {
            // InternalERDiagramDsl.g:453:4: (otherlv_3= RULE_ID )
            // InternalERDiagramDsl.g:454:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRelationEndingRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_3, grammarAccess.getRelationEndingAccess().getTargetEntityCrossReference_1_0());
            				

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
    // $ANTLR end "ruleRelationEnding"


    // $ANTLR start "ruleAttributeType"
    // InternalERDiagramDsl.g:469:1: ruleAttributeType returns [Enumerator current=null] : ( (enumLiteral_0= 'int' ) | (enumLiteral_1= 'double' ) | (enumLiteral_2= 'string' ) | (enumLiteral_3= 'boolean' ) | (enumLiteral_4= 'datetime' ) ) ;
    public final Enumerator ruleAttributeType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalERDiagramDsl.g:475:2: ( ( (enumLiteral_0= 'int' ) | (enumLiteral_1= 'double' ) | (enumLiteral_2= 'string' ) | (enumLiteral_3= 'boolean' ) | (enumLiteral_4= 'datetime' ) ) )
            // InternalERDiagramDsl.g:476:2: ( (enumLiteral_0= 'int' ) | (enumLiteral_1= 'double' ) | (enumLiteral_2= 'string' ) | (enumLiteral_3= 'boolean' ) | (enumLiteral_4= 'datetime' ) )
            {
            // InternalERDiagramDsl.g:476:2: ( (enumLiteral_0= 'int' ) | (enumLiteral_1= 'double' ) | (enumLiteral_2= 'string' ) | (enumLiteral_3= 'boolean' ) | (enumLiteral_4= 'datetime' ) )
            int alt8=5;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt8=1;
                }
                break;
            case 21:
                {
                alt8=2;
                }
                break;
            case 22:
                {
                alt8=3;
                }
                break;
            case 23:
                {
                alt8=4;
                }
                break;
            case 24:
                {
                alt8=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalERDiagramDsl.g:477:3: (enumLiteral_0= 'int' )
                    {
                    // InternalERDiagramDsl.g:477:3: (enumLiteral_0= 'int' )
                    // InternalERDiagramDsl.g:478:4: enumLiteral_0= 'int'
                    {
                    enumLiteral_0=(Token)match(input,20,FOLLOW_2); 

                    				current = grammarAccess.getAttributeTypeAccess().getINTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getAttributeTypeAccess().getINTEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalERDiagramDsl.g:485:3: (enumLiteral_1= 'double' )
                    {
                    // InternalERDiagramDsl.g:485:3: (enumLiteral_1= 'double' )
                    // InternalERDiagramDsl.g:486:4: enumLiteral_1= 'double'
                    {
                    enumLiteral_1=(Token)match(input,21,FOLLOW_2); 

                    				current = grammarAccess.getAttributeTypeAccess().getDOUBLEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getAttributeTypeAccess().getDOUBLEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalERDiagramDsl.g:493:3: (enumLiteral_2= 'string' )
                    {
                    // InternalERDiagramDsl.g:493:3: (enumLiteral_2= 'string' )
                    // InternalERDiagramDsl.g:494:4: enumLiteral_2= 'string'
                    {
                    enumLiteral_2=(Token)match(input,22,FOLLOW_2); 

                    				current = grammarAccess.getAttributeTypeAccess().getSTRINGEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getAttributeTypeAccess().getSTRINGEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalERDiagramDsl.g:501:3: (enumLiteral_3= 'boolean' )
                    {
                    // InternalERDiagramDsl.g:501:3: (enumLiteral_3= 'boolean' )
                    // InternalERDiagramDsl.g:502:4: enumLiteral_3= 'boolean'
                    {
                    enumLiteral_3=(Token)match(input,23,FOLLOW_2); 

                    				current = grammarAccess.getAttributeTypeAccess().getBOOLEANEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getAttributeTypeAccess().getBOOLEANEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalERDiagramDsl.g:509:3: (enumLiteral_4= 'datetime' )
                    {
                    // InternalERDiagramDsl.g:509:3: (enumLiteral_4= 'datetime' )
                    // InternalERDiagramDsl.g:510:4: enumLiteral_4= 'datetime'
                    {
                    enumLiteral_4=(Token)match(input,24,FOLLOW_2); 

                    				current = grammarAccess.getAttributeTypeAccess().getDATETIMEEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getAttributeTypeAccess().getDATETIMEEnumLiteralDeclaration_4());
                    			

                    }


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
    // $ANTLR end "ruleAttributeType"


    // $ANTLR start "ruleMultiplicityType"
    // InternalERDiagramDsl.g:520:1: ruleMultiplicityType returns [Enumerator current=null] : ( (enumLiteral_0= 'one' ) | (enumLiteral_1= 'many' ) ) ;
    public final Enumerator ruleMultiplicityType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalERDiagramDsl.g:526:2: ( ( (enumLiteral_0= 'one' ) | (enumLiteral_1= 'many' ) ) )
            // InternalERDiagramDsl.g:527:2: ( (enumLiteral_0= 'one' ) | (enumLiteral_1= 'many' ) )
            {
            // InternalERDiagramDsl.g:527:2: ( (enumLiteral_0= 'one' ) | (enumLiteral_1= 'many' ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==25) ) {
                alt9=1;
            }
            else if ( (LA9_0==26) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalERDiagramDsl.g:528:3: (enumLiteral_0= 'one' )
                    {
                    // InternalERDiagramDsl.g:528:3: (enumLiteral_0= 'one' )
                    // InternalERDiagramDsl.g:529:4: enumLiteral_0= 'one'
                    {
                    enumLiteral_0=(Token)match(input,25,FOLLOW_2); 

                    				current = grammarAccess.getMultiplicityTypeAccess().getOneEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getMultiplicityTypeAccess().getOneEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalERDiagramDsl.g:536:3: (enumLiteral_1= 'many' )
                    {
                    // InternalERDiagramDsl.g:536:3: (enumLiteral_1= 'many' )
                    // InternalERDiagramDsl.g:537:4: enumLiteral_1= 'many'
                    {
                    enumLiteral_1=(Token)match(input,26,FOLLOW_2); 

                    				current = grammarAccess.getMultiplicityTypeAccess().getManyEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getMultiplicityTypeAccess().getManyEnumLiteralDeclaration_1());
                    			

                    }


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
    // $ANTLR end "ruleMultiplicityType"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000006080802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000006080002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000003002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000001F00000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000006080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000006080010L});

}
