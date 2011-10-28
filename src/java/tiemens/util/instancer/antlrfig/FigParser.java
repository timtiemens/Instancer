// $ANTLR 3.4 Fig.g 2011-10-28 15:29:41

    package tiemens.util.instancer.antlrfig;
 
    import java.util.Map;
    import java.util.HashMap;
    import java.util.ArrayList;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class FigParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "CMT", "ID", "INT", "STRING", "WS", "'$'", "','", "'.'", "';'", "'='", "'['", "']'", "'{'", "'}'"
    };

    public static final int EOF=-1;
    public static final int T__9=9;
    public static final int T__10=10;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int CMT=4;
    public static final int ID=5;
    public static final int INT=6;
    public static final int STRING=7;
    public static final int WS=8;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public FigParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public FigParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return FigParser.tokenNames; }
    public String getGrammarFileName() { return "Fig.g"; }


        Map instances = new HashMap();



    // $ANTLR start "file"
    // Fig.g:21:1: file returns [List objects] : ( object )+ ;
    public final List file() throws RecognitionException {
        List objects = null;


        Object object1 =null;


        try {
            // Fig.g:22:5: ( ( object )+ )
            // Fig.g:22:9: ( object )+
            {
            objects = new ArrayList();

            // Fig.g:23:9: ( object )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==ID) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // Fig.g:23:10: object
            	    {
            	    pushFollow(FOLLOW_object_in_file60);
            	    object1=object();

            	    state._fsp--;


            	    objects.add(object1);

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return objects;
    }
    // $ANTLR end "file"



    // $ANTLR start "object"
    // Fig.g:26:1: object returns [Object o] : qid (v= ID )? '{' ( assign[$o] )* '}' ;
    public final Object object() throws RecognitionException {
        Object o = null;


        Token v=null;
        FigParser.qid_return qid2 =null;


        try {
            // Fig.g:27:5: ( qid (v= ID )? '{' ( assign[$o] )* '}' )
            // Fig.g:27:9: qid (v= ID )? '{' ( assign[$o] )* '}'
            {
            pushFollow(FOLLOW_qid_in_object87);
            qid2=qid();

            state._fsp--;


            // Fig.g:27:14: (v= ID )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==ID) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // Fig.g:27:14: v= ID
                    {
                    v=(Token)match(input,ID,FOLLOW_ID_in_object91); 

                    }
                    break;

            }



                    o = RunFig.newInstance((qid2!=null?input.toString(qid2.start,qid2.stop):null));
                    if ( v!=null ) {
                        instances.put((v!=null?v.getText():null), o);
                    }
                    

            match(input,16,FOLLOW_16_in_object112); 

            // Fig.g:34:13: ( assign[$o] )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==ID) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // Fig.g:34:13: assign[$o]
            	    {
            	    pushFollow(FOLLOW_assign_in_object114);
            	    assign(o);

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            match(input,17,FOLLOW_17_in_object118); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return o;
    }
    // $ANTLR end "object"



    // $ANTLR start "assign"
    // Fig.g:37:1: assign[Object o] : ID '=' expr ';' ;
    public final void assign(Object o) throws RecognitionException {
        Token ID3=null;
        Object expr4 =null;


        try {
            // Fig.g:38:5: ( ID '=' expr ';' )
            // Fig.g:38:9: ID '=' expr ';'
            {
            ID3=(Token)match(input,ID,FOLLOW_ID_in_assign142); 

            match(input,13,FOLLOW_13_in_assign144); 

            pushFollow(FOLLOW_expr_in_assign146);
            expr4=expr();

            state._fsp--;


            match(input,12,FOLLOW_12_in_assign148); 

            RunFig.setObjectProperty(o,(ID3!=null?ID3.getText():null),expr4);

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "assign"



    // $ANTLR start "expr"
    // Fig.g:41:1: expr returns [Object value] : ( STRING | INT | '$' ID | '[' ']' | '[' e= expr ( ',' e= expr )* ']' );
    public final Object expr() throws RecognitionException {
        Object value = null;


        Token STRING5=null;
        Token INT6=null;
        Token ID7=null;
        Object e =null;


        try {
            // Fig.g:42:5: ( STRING | INT | '$' ID | '[' ']' | '[' e= expr ( ',' e= expr )* ']' )
            int alt5=5;
            switch ( input.LA(1) ) {
            case STRING:
                {
                alt5=1;
                }
                break;
            case INT:
                {
                alt5=2;
                }
                break;
            case 9:
                {
                alt5=3;
                }
                break;
            case 14:
                {
                int LA5_4 = input.LA(2);

                if ( (LA5_4==15) ) {
                    alt5=4;
                }
                else if ( ((LA5_4 >= INT && LA5_4 <= STRING)||LA5_4==9||LA5_4==14) ) {
                    alt5=5;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 4, input);

                    throw nvae;

                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }

            switch (alt5) {
                case 1 :
                    // Fig.g:42:9: STRING
                    {
                    STRING5=(Token)match(input,STRING,FOLLOW_STRING_in_expr177); 

                    value = (STRING5!=null?STRING5.getText():null);

                    }
                    break;
                case 2 :
                    // Fig.g:43:9: INT
                    {
                    INT6=(Token)match(input,INT,FOLLOW_INT_in_expr190); 

                    value = Integer.valueOf((INT6!=null?INT6.getText():null));

                    }
                    break;
                case 3 :
                    // Fig.g:44:9: '$' ID
                    {
                    match(input,9,FOLLOW_9_in_expr203); 

                    ID7=(Token)match(input,ID,FOLLOW_ID_in_expr205); 

                    value = instances.get((ID7!=null?ID7.getText():null));

                    }
                    break;
                case 4 :
                    // Fig.g:45:9: '[' ']'
                    {
                    match(input,14,FOLLOW_14_in_expr218); 

                    match(input,15,FOLLOW_15_in_expr220); 

                    value = new ArrayList();

                    }
                    break;
                case 5 :
                    // Fig.g:46:9: '[' e= expr ( ',' e= expr )* ']'
                    {
                    ArrayList elements = new ArrayList();

                    match(input,14,FOLLOW_14_in_expr242); 

                    pushFollow(FOLLOW_expr_in_expr246);
                    e=expr();

                    state._fsp--;


                    elements.add(e);

                    // Fig.g:48:13: ( ',' e= expr )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==10) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // Fig.g:48:14: ',' e= expr
                    	    {
                    	    match(input,10,FOLLOW_10_in_expr263); 

                    	    pushFollow(FOLLOW_expr_in_expr267);
                    	    e=expr();

                    	    state._fsp--;


                    	    elements.add(e);

                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);


                    match(input,15,FOLLOW_15_in_expr281); 

                    value = elements;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return value;
    }
    // $ANTLR end "expr"


    public static class qid_return extends ParserRuleReturnScope {
    };


    // $ANTLR start "qid"
    // Fig.g:53:1: qid : ID ( '.' ID )* ( '$' ID )? ;
    public final FigParser.qid_return qid() throws RecognitionException {
        FigParser.qid_return retval = new FigParser.qid_return();
        retval.start = input.LT(1);


        try {
            // Fig.g:53:5: ( ID ( '.' ID )* ( '$' ID )? )
            // Fig.g:53:9: ID ( '.' ID )* ( '$' ID )?
            {
            match(input,ID,FOLLOW_ID_in_qid310); 

            // Fig.g:53:12: ( '.' ID )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==11) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // Fig.g:53:13: '.' ID
            	    {
            	    match(input,11,FOLLOW_11_in_qid313); 

            	    match(input,ID,FOLLOW_ID_in_qid315); 

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            // Fig.g:53:22: ( '$' ID )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==9) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // Fig.g:53:23: '$' ID
                    {
                    match(input,9,FOLLOW_9_in_qid320); 

                    match(input,ID,FOLLOW_ID_in_qid322); 

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "qid"

    // Delegated rules


 

    public static final BitSet FOLLOW_object_in_file60 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_qid_in_object87 = new BitSet(new long[]{0x0000000000010020L});
    public static final BitSet FOLLOW_ID_in_object91 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_object112 = new BitSet(new long[]{0x0000000000020020L});
    public static final BitSet FOLLOW_assign_in_object114 = new BitSet(new long[]{0x0000000000020020L});
    public static final BitSet FOLLOW_17_in_object118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_assign142 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_assign144 = new BitSet(new long[]{0x00000000000042C0L});
    public static final BitSet FOLLOW_expr_in_assign146 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_assign148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_expr177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_expr190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_9_in_expr203 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_expr205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_expr218 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_expr220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_expr242 = new BitSet(new long[]{0x00000000000042C0L});
    public static final BitSet FOLLOW_expr_in_expr246 = new BitSet(new long[]{0x0000000000008400L});
    public static final BitSet FOLLOW_10_in_expr263 = new BitSet(new long[]{0x00000000000042C0L});
    public static final BitSet FOLLOW_expr_in_expr267 = new BitSet(new long[]{0x0000000000008400L});
    public static final BitSet FOLLOW_15_in_expr281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_qid310 = new BitSet(new long[]{0x0000000000000A02L});
    public static final BitSet FOLLOW_11_in_qid313 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_qid315 = new BitSet(new long[]{0x0000000000000A02L});
    public static final BitSet FOLLOW_9_in_qid320 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_qid322 = new BitSet(new long[]{0x0000000000000002L});

}