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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'entity'", "'key'", "'isA'", "'{'", "','", "'}'", "':'", "'transient'", "'is related with'", "'nullable'", "'int'", "'double'", "'string'", "'boolean'", "'datetime'", "'one'", "'many'"
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
    public static final int T__27=27;
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

                if ( (LA2_0==20||(LA2_0>=26 && LA2_0<=27)) ) {
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
    // InternalERDiagramDsl.g:129:1: ruleEntity returns [EObject current=null] : (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'key' ( (otherlv_3= RULE_ID ) ) )? (otherlv_4= 'isA' ( (otherlv_5= RULE_ID ) ) )* (otherlv_6= '{' ( (lv_attributes_7_0= ruleAttribute ) ) (otherlv_8= ',' ( (lv_attributes_9_0= ruleAttribute ) ) )* otherlv_10= '}' )? ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_attributes_7_0 = null;

        EObject lv_attributes_9_0 = null;



        	enterRule();

        try {
            // InternalERDiagramDsl.g:135:2: ( (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'key' ( (otherlv_3= RULE_ID ) ) )? (otherlv_4= 'isA' ( (otherlv_5= RULE_ID ) ) )* (otherlv_6= '{' ( (lv_attributes_7_0= ruleAttribute ) ) (otherlv_8= ',' ( (lv_attributes_9_0= ruleAttribute ) ) )* otherlv_10= '}' )? ) )
            // InternalERDiagramDsl.g:136:2: (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'key' ( (otherlv_3= RULE_ID ) ) )? (otherlv_4= 'isA' ( (otherlv_5= RULE_ID ) ) )* (otherlv_6= '{' ( (lv_attributes_7_0= ruleAttribute ) ) (otherlv_8= ',' ( (lv_attributes_9_0= ruleAttribute ) ) )* otherlv_10= '}' )? )
            {
            // InternalERDiagramDsl.g:136:2: (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'key' ( (otherlv_3= RULE_ID ) ) )? (otherlv_4= 'isA' ( (otherlv_5= RULE_ID ) ) )* (otherlv_6= '{' ( (lv_attributes_7_0= ruleAttribute ) ) (otherlv_8= ',' ( (lv_attributes_9_0= ruleAttribute ) ) )* otherlv_10= '}' )? )
            // InternalERDiagramDsl.g:137:3: otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'key' ( (otherlv_3= RULE_ID ) ) )? (otherlv_4= 'isA' ( (otherlv_5= RULE_ID ) ) )* (otherlv_6= '{' ( (lv_attributes_7_0= ruleAttribute ) ) (otherlv_8= ',' ( (lv_attributes_9_0= ruleAttribute ) ) )* otherlv_10= '}' )?
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

            // InternalERDiagramDsl.g:159:3: (otherlv_2= 'key' ( (otherlv_3= RULE_ID ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==12) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalERDiagramDsl.g:160:4: otherlv_2= 'key' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,12,FOLLOW_5); 

                    				newLeafNode(otherlv_2, grammarAccess.getEntityAccess().getKeyKeyword_2_0());
                    			
                    // InternalERDiagramDsl.g:164:4: ( (otherlv_3= RULE_ID ) )
                    // InternalERDiagramDsl.g:165:5: (otherlv_3= RULE_ID )
                    {
                    // InternalERDiagramDsl.g:165:5: (otherlv_3= RULE_ID )
                    // InternalERDiagramDsl.g:166:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEntityRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_7); 

                    						newLeafNode(otherlv_3, grammarAccess.getEntityAccess().getKeyAttributeCrossReference_2_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalERDiagramDsl.g:178:3: (otherlv_4= 'isA' ( (otherlv_5= RULE_ID ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==13) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalERDiagramDsl.g:179:4: otherlv_4= 'isA' ( (otherlv_5= RULE_ID ) )
            	    {
            	    otherlv_4=(Token)match(input,13,FOLLOW_5); 

            	    				newLeafNode(otherlv_4, grammarAccess.getEntityAccess().getIsAKeyword_3_0());
            	    			
            	    // InternalERDiagramDsl.g:183:4: ( (otherlv_5= RULE_ID ) )
            	    // InternalERDiagramDsl.g:184:5: (otherlv_5= RULE_ID )
            	    {
            	    // InternalERDiagramDsl.g:184:5: (otherlv_5= RULE_ID )
            	    // InternalERDiagramDsl.g:185:6: otherlv_5= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getEntityRule());
            	    						}
            	    					
            	    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_7); 

            	    						newLeafNode(otherlv_5, grammarAccess.getEntityAccess().getIsAEntityCrossReference_3_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // InternalERDiagramDsl.g:197:3: (otherlv_6= '{' ( (lv_attributes_7_0= ruleAttribute ) ) (otherlv_8= ',' ( (lv_attributes_9_0= ruleAttribute ) ) )* otherlv_10= '}' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==14) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalERDiagramDsl.g:198:4: otherlv_6= '{' ( (lv_attributes_7_0= ruleAttribute ) ) (otherlv_8= ',' ( (lv_attributes_9_0= ruleAttribute ) ) )* otherlv_10= '}'
                    {
                    otherlv_6=(Token)match(input,14,FOLLOW_5); 

                    				newLeafNode(otherlv_6, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_4_0());
                    			
                    // InternalERDiagramDsl.g:202:4: ( (lv_attributes_7_0= ruleAttribute ) )
                    // InternalERDiagramDsl.g:203:5: (lv_attributes_7_0= ruleAttribute )
                    {
                    // InternalERDiagramDsl.g:203:5: (lv_attributes_7_0= ruleAttribute )
                    // InternalERDiagramDsl.g:204:6: lv_attributes_7_0= ruleAttribute
                    {

                    						newCompositeNode(grammarAccess.getEntityAccess().getAttributesAttributeParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_8);
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

                    // InternalERDiagramDsl.g:221:4: (otherlv_8= ',' ( (lv_attributes_9_0= ruleAttribute ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==15) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalERDiagramDsl.g:222:5: otherlv_8= ',' ( (lv_attributes_9_0= ruleAttribute ) )
                    	    {
                    	    otherlv_8=(Token)match(input,15,FOLLOW_5); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getEntityAccess().getCommaKeyword_4_2_0());
                    	    				
                    	    // InternalERDiagramDsl.g:226:5: ( (lv_attributes_9_0= ruleAttribute ) )
                    	    // InternalERDiagramDsl.g:227:6: (lv_attributes_9_0= ruleAttribute )
                    	    {
                    	    // InternalERDiagramDsl.g:227:6: (lv_attributes_9_0= ruleAttribute )
                    	    // InternalERDiagramDsl.g:228:7: lv_attributes_9_0= ruleAttribute
                    	    {

                    	    							newCompositeNode(grammarAccess.getEntityAccess().getAttributesAttributeParserRuleCall_4_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_attributes_9_0=ruleAttribute();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEntityRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"attributes",
                    	    								lv_attributes_9_0,
                    	    								"hu.bme.mit.mdsd.erdiagram.text.ERDiagramDsl.Attribute");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,16,FOLLOW_2); 

                    				newLeafNode(otherlv_10, grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_4_3());
                    			

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
    // InternalERDiagramDsl.g:255:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalERDiagramDsl.g:255:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalERDiagramDsl.g:256:2: iv_ruleAttribute= ruleAttribute EOF
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
    // InternalERDiagramDsl.g:262:1: ruleAttribute returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleAttributeType ) ) ( (lv_isTransient_3_0= 'transient' ) )? ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_isTransient_3_0=null;
        Enumerator lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalERDiagramDsl.g:268:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleAttributeType ) ) ( (lv_isTransient_3_0= 'transient' ) )? ) )
            // InternalERDiagramDsl.g:269:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleAttributeType ) ) ( (lv_isTransient_3_0= 'transient' ) )? )
            {
            // InternalERDiagramDsl.g:269:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleAttributeType ) ) ( (lv_isTransient_3_0= 'transient' ) )? )
            // InternalERDiagramDsl.g:270:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleAttributeType ) ) ( (lv_isTransient_3_0= 'transient' ) )?
            {
            // InternalERDiagramDsl.g:270:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalERDiagramDsl.g:271:4: (lv_name_0_0= RULE_ID )
            {
            // InternalERDiagramDsl.g:271:4: (lv_name_0_0= RULE_ID )
            // InternalERDiagramDsl.g:272:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_9); 

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

            otherlv_1=(Token)match(input,17,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getAttributeAccess().getColonKeyword_1());
            		
            // InternalERDiagramDsl.g:292:3: ( (lv_type_2_0= ruleAttributeType ) )
            // InternalERDiagramDsl.g:293:4: (lv_type_2_0= ruleAttributeType )
            {
            // InternalERDiagramDsl.g:293:4: (lv_type_2_0= ruleAttributeType )
            // InternalERDiagramDsl.g:294:5: lv_type_2_0= ruleAttributeType
            {

            					newCompositeNode(grammarAccess.getAttributeAccess().getTypeAttributeTypeEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_11);
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

            // InternalERDiagramDsl.g:311:3: ( (lv_isTransient_3_0= 'transient' ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalERDiagramDsl.g:312:4: (lv_isTransient_3_0= 'transient' )
                    {
                    // InternalERDiagramDsl.g:312:4: (lv_isTransient_3_0= 'transient' )
                    // InternalERDiagramDsl.g:313:5: lv_isTransient_3_0= 'transient'
                    {
                    lv_isTransient_3_0=(Token)match(input,18,FOLLOW_2); 

                    					newLeafNode(lv_isTransient_3_0, grammarAccess.getAttributeAccess().getIsTransientTransientKeyword_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAttributeRule());
                    					}
                    					setWithLastConsumed(current, "isTransient", true, "transient");
                    				

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
    // InternalERDiagramDsl.g:329:1: entryRuleRelation returns [EObject current=null] : iv_ruleRelation= ruleRelation EOF ;
    public final EObject entryRuleRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelation = null;


        try {
            // InternalERDiagramDsl.g:329:49: (iv_ruleRelation= ruleRelation EOF )
            // InternalERDiagramDsl.g:330:2: iv_ruleRelation= ruleRelation EOF
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
    // InternalERDiagramDsl.g:336:1: ruleRelation returns [EObject current=null] : ( ( (lv_leftEnding_0_0= ruleRelationEnding ) ) otherlv_1= 'is related with' ( (lv_rightEnding_2_0= ruleRelationEnding ) ) ) ;
    public final EObject ruleRelation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_leftEnding_0_0 = null;

        EObject lv_rightEnding_2_0 = null;



        	enterRule();

        try {
            // InternalERDiagramDsl.g:342:2: ( ( ( (lv_leftEnding_0_0= ruleRelationEnding ) ) otherlv_1= 'is related with' ( (lv_rightEnding_2_0= ruleRelationEnding ) ) ) )
            // InternalERDiagramDsl.g:343:2: ( ( (lv_leftEnding_0_0= ruleRelationEnding ) ) otherlv_1= 'is related with' ( (lv_rightEnding_2_0= ruleRelationEnding ) ) )
            {
            // InternalERDiagramDsl.g:343:2: ( ( (lv_leftEnding_0_0= ruleRelationEnding ) ) otherlv_1= 'is related with' ( (lv_rightEnding_2_0= ruleRelationEnding ) ) )
            // InternalERDiagramDsl.g:344:3: ( (lv_leftEnding_0_0= ruleRelationEnding ) ) otherlv_1= 'is related with' ( (lv_rightEnding_2_0= ruleRelationEnding ) )
            {
            // InternalERDiagramDsl.g:344:3: ( (lv_leftEnding_0_0= ruleRelationEnding ) )
            // InternalERDiagramDsl.g:345:4: (lv_leftEnding_0_0= ruleRelationEnding )
            {
            // InternalERDiagramDsl.g:345:4: (lv_leftEnding_0_0= ruleRelationEnding )
            // InternalERDiagramDsl.g:346:5: lv_leftEnding_0_0= ruleRelationEnding
            {

            					newCompositeNode(grammarAccess.getRelationAccess().getLeftEndingRelationEndingParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_12);
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

            otherlv_1=(Token)match(input,19,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getRelationAccess().getIsRelatedWithKeyword_1());
            		
            // InternalERDiagramDsl.g:367:3: ( (lv_rightEnding_2_0= ruleRelationEnding ) )
            // InternalERDiagramDsl.g:368:4: (lv_rightEnding_2_0= ruleRelationEnding )
            {
            // InternalERDiagramDsl.g:368:4: (lv_rightEnding_2_0= ruleRelationEnding )
            // InternalERDiagramDsl.g:369:5: lv_rightEnding_2_0= ruleRelationEnding
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
    // InternalERDiagramDsl.g:390:1: entryRuleRelationEnding returns [EObject current=null] : iv_ruleRelationEnding= ruleRelationEnding EOF ;
    public final EObject entryRuleRelationEnding() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationEnding = null;


        try {
            // InternalERDiagramDsl.g:390:55: (iv_ruleRelationEnding= ruleRelationEnding EOF )
            // InternalERDiagramDsl.g:391:2: iv_ruleRelationEnding= ruleRelationEnding EOF
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
    // InternalERDiagramDsl.g:397:1: ruleRelationEnding returns [EObject current=null] : ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_multiplicity_1_0= ruleMultiplicityType ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_nullable_2_0= 'nullable' ) ) ) ) ) )+ {...}?) ) ) ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleRelationEnding() throws RecognitionException {
        EObject current = null;

        Token lv_nullable_2_0=null;
        Token otherlv_3=null;
        Enumerator lv_multiplicity_1_0 = null;



        	enterRule();

        try {
            // InternalERDiagramDsl.g:403:2: ( ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_multiplicity_1_0= ruleMultiplicityType ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_nullable_2_0= 'nullable' ) ) ) ) ) )+ {...}?) ) ) ( (otherlv_3= RULE_ID ) ) ) )
            // InternalERDiagramDsl.g:404:2: ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_multiplicity_1_0= ruleMultiplicityType ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_nullable_2_0= 'nullable' ) ) ) ) ) )+ {...}?) ) ) ( (otherlv_3= RULE_ID ) ) )
            {
            // InternalERDiagramDsl.g:404:2: ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_multiplicity_1_0= ruleMultiplicityType ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_nullable_2_0= 'nullable' ) ) ) ) ) )+ {...}?) ) ) ( (otherlv_3= RULE_ID ) ) )
            // InternalERDiagramDsl.g:405:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_multiplicity_1_0= ruleMultiplicityType ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_nullable_2_0= 'nullable' ) ) ) ) ) )+ {...}?) ) ) ( (otherlv_3= RULE_ID ) )
            {
            // InternalERDiagramDsl.g:405:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_multiplicity_1_0= ruleMultiplicityType ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_nullable_2_0= 'nullable' ) ) ) ) ) )+ {...}?) ) )
            // InternalERDiagramDsl.g:406:4: ( ( ( ({...}? => ( ({...}? => ( (lv_multiplicity_1_0= ruleMultiplicityType ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_nullable_2_0= 'nullable' ) ) ) ) ) )+ {...}?) )
            {
            // InternalERDiagramDsl.g:406:4: ( ( ( ({...}? => ( ({...}? => ( (lv_multiplicity_1_0= ruleMultiplicityType ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_nullable_2_0= 'nullable' ) ) ) ) ) )+ {...}?) )
            // InternalERDiagramDsl.g:407:5: ( ( ({...}? => ( ({...}? => ( (lv_multiplicity_1_0= ruleMultiplicityType ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_nullable_2_0= 'nullable' ) ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getRelationEndingAccess().getUnorderedGroup_0());
            				
            // InternalERDiagramDsl.g:410:5: ( ( ({...}? => ( ({...}? => ( (lv_multiplicity_1_0= ruleMultiplicityType ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_nullable_2_0= 'nullable' ) ) ) ) ) )+ {...}?)
            // InternalERDiagramDsl.g:411:6: ( ({...}? => ( ({...}? => ( (lv_multiplicity_1_0= ruleMultiplicityType ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_nullable_2_0= 'nullable' ) ) ) ) ) )+ {...}?
            {
            // InternalERDiagramDsl.g:411:6: ( ({...}? => ( ({...}? => ( (lv_multiplicity_1_0= ruleMultiplicityType ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_nullable_2_0= 'nullable' ) ) ) ) ) )+
            int cnt8=0;
            loop8:
            do {
                int alt8=3;
                int LA8_0 = input.LA(1);

                if ( LA8_0 >= 26 && LA8_0 <= 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getRelationEndingAccess().getUnorderedGroup_0(), 0) ) {
                    alt8=1;
                }
                else if ( LA8_0 == 20 && getUnorderedGroupHelper().canSelect(grammarAccess.getRelationEndingAccess().getUnorderedGroup_0(), 1) ) {
                    alt8=2;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalERDiagramDsl.g:412:4: ({...}? => ( ({...}? => ( (lv_multiplicity_1_0= ruleMultiplicityType ) ) ) ) )
            	    {
            	    // InternalERDiagramDsl.g:412:4: ({...}? => ( ({...}? => ( (lv_multiplicity_1_0= ruleMultiplicityType ) ) ) ) )
            	    // InternalERDiagramDsl.g:413:5: {...}? => ( ({...}? => ( (lv_multiplicity_1_0= ruleMultiplicityType ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRelationEndingAccess().getUnorderedGroup_0(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleRelationEnding", "getUnorderedGroupHelper().canSelect(grammarAccess.getRelationEndingAccess().getUnorderedGroup_0(), 0)");
            	    }
            	    // InternalERDiagramDsl.g:413:111: ( ({...}? => ( (lv_multiplicity_1_0= ruleMultiplicityType ) ) ) )
            	    // InternalERDiagramDsl.g:414:6: ({...}? => ( (lv_multiplicity_1_0= ruleMultiplicityType ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getRelationEndingAccess().getUnorderedGroup_0(), 0);
            	    					
            	    // InternalERDiagramDsl.g:417:9: ({...}? => ( (lv_multiplicity_1_0= ruleMultiplicityType ) ) )
            	    // InternalERDiagramDsl.g:417:10: {...}? => ( (lv_multiplicity_1_0= ruleMultiplicityType ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleRelationEnding", "true");
            	    }
            	    // InternalERDiagramDsl.g:417:19: ( (lv_multiplicity_1_0= ruleMultiplicityType ) )
            	    // InternalERDiagramDsl.g:417:20: (lv_multiplicity_1_0= ruleMultiplicityType )
            	    {
            	    // InternalERDiagramDsl.g:417:20: (lv_multiplicity_1_0= ruleMultiplicityType )
            	    // InternalERDiagramDsl.g:418:10: lv_multiplicity_1_0= ruleMultiplicityType
            	    {

            	    										newCompositeNode(grammarAccess.getRelationEndingAccess().getMultiplicityMultiplicityTypeEnumRuleCall_0_0_0());
            	    									
            	    pushFollow(FOLLOW_14);
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
            	    // InternalERDiagramDsl.g:440:4: ({...}? => ( ({...}? => ( (lv_nullable_2_0= 'nullable' ) ) ) ) )
            	    {
            	    // InternalERDiagramDsl.g:440:4: ({...}? => ( ({...}? => ( (lv_nullable_2_0= 'nullable' ) ) ) ) )
            	    // InternalERDiagramDsl.g:441:5: {...}? => ( ({...}? => ( (lv_nullable_2_0= 'nullable' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRelationEndingAccess().getUnorderedGroup_0(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleRelationEnding", "getUnorderedGroupHelper().canSelect(grammarAccess.getRelationEndingAccess().getUnorderedGroup_0(), 1)");
            	    }
            	    // InternalERDiagramDsl.g:441:111: ( ({...}? => ( (lv_nullable_2_0= 'nullable' ) ) ) )
            	    // InternalERDiagramDsl.g:442:6: ({...}? => ( (lv_nullable_2_0= 'nullable' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getRelationEndingAccess().getUnorderedGroup_0(), 1);
            	    					
            	    // InternalERDiagramDsl.g:445:9: ({...}? => ( (lv_nullable_2_0= 'nullable' ) ) )
            	    // InternalERDiagramDsl.g:445:10: {...}? => ( (lv_nullable_2_0= 'nullable' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleRelationEnding", "true");
            	    }
            	    // InternalERDiagramDsl.g:445:19: ( (lv_nullable_2_0= 'nullable' ) )
            	    // InternalERDiagramDsl.g:445:20: (lv_nullable_2_0= 'nullable' )
            	    {
            	    // InternalERDiagramDsl.g:445:20: (lv_nullable_2_0= 'nullable' )
            	    // InternalERDiagramDsl.g:446:10: lv_nullable_2_0= 'nullable'
            	    {
            	    lv_nullable_2_0=(Token)match(input,20,FOLLOW_14); 

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
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getRelationEndingAccess().getUnorderedGroup_0()) ) {
                throw new FailedPredicateException(input, "ruleRelationEnding", "getUnorderedGroupHelper().canLeave(grammarAccess.getRelationEndingAccess().getUnorderedGroup_0())");
            }

            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getRelationEndingAccess().getUnorderedGroup_0());
            				

            }

            // InternalERDiagramDsl.g:471:3: ( (otherlv_3= RULE_ID ) )
            // InternalERDiagramDsl.g:472:4: (otherlv_3= RULE_ID )
            {
            // InternalERDiagramDsl.g:472:4: (otherlv_3= RULE_ID )
            // InternalERDiagramDsl.g:473:5: otherlv_3= RULE_ID
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
    // InternalERDiagramDsl.g:488:1: ruleAttributeType returns [Enumerator current=null] : ( (enumLiteral_0= 'int' ) | (enumLiteral_1= 'double' ) | (enumLiteral_2= 'string' ) | (enumLiteral_3= 'boolean' ) | (enumLiteral_4= 'datetime' ) ) ;
    public final Enumerator ruleAttributeType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalERDiagramDsl.g:494:2: ( ( (enumLiteral_0= 'int' ) | (enumLiteral_1= 'double' ) | (enumLiteral_2= 'string' ) | (enumLiteral_3= 'boolean' ) | (enumLiteral_4= 'datetime' ) ) )
            // InternalERDiagramDsl.g:495:2: ( (enumLiteral_0= 'int' ) | (enumLiteral_1= 'double' ) | (enumLiteral_2= 'string' ) | (enumLiteral_3= 'boolean' ) | (enumLiteral_4= 'datetime' ) )
            {
            // InternalERDiagramDsl.g:495:2: ( (enumLiteral_0= 'int' ) | (enumLiteral_1= 'double' ) | (enumLiteral_2= 'string' ) | (enumLiteral_3= 'boolean' ) | (enumLiteral_4= 'datetime' ) )
            int alt9=5;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt9=1;
                }
                break;
            case 22:
                {
                alt9=2;
                }
                break;
            case 23:
                {
                alt9=3;
                }
                break;
            case 24:
                {
                alt9=4;
                }
                break;
            case 25:
                {
                alt9=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalERDiagramDsl.g:496:3: (enumLiteral_0= 'int' )
                    {
                    // InternalERDiagramDsl.g:496:3: (enumLiteral_0= 'int' )
                    // InternalERDiagramDsl.g:497:4: enumLiteral_0= 'int'
                    {
                    enumLiteral_0=(Token)match(input,21,FOLLOW_2); 

                    				current = grammarAccess.getAttributeTypeAccess().getINTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getAttributeTypeAccess().getINTEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalERDiagramDsl.g:504:3: (enumLiteral_1= 'double' )
                    {
                    // InternalERDiagramDsl.g:504:3: (enumLiteral_1= 'double' )
                    // InternalERDiagramDsl.g:505:4: enumLiteral_1= 'double'
                    {
                    enumLiteral_1=(Token)match(input,22,FOLLOW_2); 

                    				current = grammarAccess.getAttributeTypeAccess().getDOUBLEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getAttributeTypeAccess().getDOUBLEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalERDiagramDsl.g:512:3: (enumLiteral_2= 'string' )
                    {
                    // InternalERDiagramDsl.g:512:3: (enumLiteral_2= 'string' )
                    // InternalERDiagramDsl.g:513:4: enumLiteral_2= 'string'
                    {
                    enumLiteral_2=(Token)match(input,23,FOLLOW_2); 

                    				current = grammarAccess.getAttributeTypeAccess().getSTRINGEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getAttributeTypeAccess().getSTRINGEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalERDiagramDsl.g:520:3: (enumLiteral_3= 'boolean' )
                    {
                    // InternalERDiagramDsl.g:520:3: (enumLiteral_3= 'boolean' )
                    // InternalERDiagramDsl.g:521:4: enumLiteral_3= 'boolean'
                    {
                    enumLiteral_3=(Token)match(input,24,FOLLOW_2); 

                    				current = grammarAccess.getAttributeTypeAccess().getBOOLEANEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getAttributeTypeAccess().getBOOLEANEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalERDiagramDsl.g:528:3: (enumLiteral_4= 'datetime' )
                    {
                    // InternalERDiagramDsl.g:528:3: (enumLiteral_4= 'datetime' )
                    // InternalERDiagramDsl.g:529:4: enumLiteral_4= 'datetime'
                    {
                    enumLiteral_4=(Token)match(input,25,FOLLOW_2); 

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
    // InternalERDiagramDsl.g:539:1: ruleMultiplicityType returns [Enumerator current=null] : ( (enumLiteral_0= 'one' ) | (enumLiteral_1= 'many' ) ) ;
    public final Enumerator ruleMultiplicityType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalERDiagramDsl.g:545:2: ( ( (enumLiteral_0= 'one' ) | (enumLiteral_1= 'many' ) ) )
            // InternalERDiagramDsl.g:546:2: ( (enumLiteral_0= 'one' ) | (enumLiteral_1= 'many' ) )
            {
            // InternalERDiagramDsl.g:546:2: ( (enumLiteral_0= 'one' ) | (enumLiteral_1= 'many' ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==26) ) {
                alt10=1;
            }
            else if ( (LA10_0==27) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalERDiagramDsl.g:547:3: (enumLiteral_0= 'one' )
                    {
                    // InternalERDiagramDsl.g:547:3: (enumLiteral_0= 'one' )
                    // InternalERDiagramDsl.g:548:4: enumLiteral_0= 'one'
                    {
                    enumLiteral_0=(Token)match(input,26,FOLLOW_2); 

                    				current = grammarAccess.getMultiplicityTypeAccess().getOneEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getMultiplicityTypeAccess().getOneEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalERDiagramDsl.g:555:3: (enumLiteral_1= 'many' )
                    {
                    // InternalERDiagramDsl.g:555:3: (enumLiteral_1= 'many' )
                    // InternalERDiagramDsl.g:556:4: enumLiteral_1= 'many'
                    {
                    enumLiteral_1=(Token)match(input,27,FOLLOW_2); 

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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000000000C100802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000000C100002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000007002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000006002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000003E00000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x000000000C100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x000000000C100010L});

}
