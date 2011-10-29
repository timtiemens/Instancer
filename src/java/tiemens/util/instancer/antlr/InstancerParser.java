// $ANTLR 3.4 Instancer.g 2011-10-29 12:00:55
  
   package tiemens.util.instancer.antlr;
   
   import java.util.HashMap; 
   import java.util.List; 
   import java.util.ArrayList; 
   import java.io.InputStream;
   import java.io.StringReader;
   import java.io.FileReader; 


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class InstancerParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "CLASSNAME", "COMMENT", "DIGIT", "ESCAPESEQUENCE", "IDENTIFIER", "QUOTEDLITERAL", "WHITESPACE", "'('", "')'", "';'", "'import'", "'logging'", "'{'", "'}'"
    };

    public static final int EOF=-1;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int CLASSNAME=4;
    public static final int COMMENT=5;
    public static final int DIGIT=6;
    public static final int ESCAPESEQUENCE=7;
    public static final int IDENTIFIER=8;
    public static final int QUOTEDLITERAL=9;
    public static final int WHITESPACE=10;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public InstancerParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public InstancerParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return InstancerParser.tokenNames; }
    public String getGrammarFileName() { return "Instancer.g"; }


        
        /* ============================================================
         *  Use this factory.
         *      Do not use new InstancerParser() directly.
         * ============================================================
         */
        public static InstancerParser create(ANTLRReaderStream input) throws Exception
        {
            InstancerLexer lexer = new InstancerLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            InstancerParser parser = new InstancerParser(tokens);
            
            lexer.setInstancerCode(parser.instancerCode);
            parser.rememberLexer(lexer);
            
            return parser;
        }

        /* ============================================================
         *  Use this return method.
         *      Do not use parser.top() directly.
         * ============================================================
         */
        public List<Object> getResultOrThrow() throws Exception
        {
            if (result == null)
            {
                result = this.top();
            }
            if (getLexerExceptions().size() != 0)
            {
                throw getLexerExceptions().get(0);
            }
            else if (getNumberOfSyntaxErrors() != 0)
            {
                throw new IllegalStateException("Number of syntax errors: " + 
                                                getNumberOfSyntaxErrors());
            }
            else
            {
                return result;
            }
        }
        public static void main(String[] args) throws Exception 
        {
            InstancerParser parser = create(args);

            try 
            {
                List<Object> list = parser.getResultOrThrow();
                
                System.out.println("MAIN: toplist.size() = " + list.size());
                Object zero = list.get(0);
                System.out.println("MAIN: [0]=" + zero);
                System.out.println("MAIN: class name=" + zero.getClass().getName());
            } 
            catch (RecognitionException e)  
            {
                System.out.println("MAIN: failed to parse");
                System.out.println("MAIN: stack trace follows");
                e.printStackTrace(System.out);
            }
        }


        private List<Object> result = null;
        private final InstancerCode instancerCode = new InstancerCode();
        private InstancerLexer theLexer;
        private void rememberLexer(InstancerLexer in)
        { 
            theLexer = in;
        }
        public List<RecognitionException> getLexerExceptions() 
        {
            return theLexer.getExceptions();
        }
        /*
            if you do this   ... it works, but is not necessary
         *
        @Override
        public void reportError(RecognitionException re)
        {
            theLexer.addException(re);
        }
        */
        /*
            if you do this, it still prints
                line 1:0 null
         *
        @Override
        public String getErrorMessage(RecognitionException e, String[] tokenNames) 
        {
            return null; 
        }
        */
        
        public static ANTLRReaderStream getReaderStream(String[] args) throws Exception
        {
            return InstancerCode.MainUtils.getReaderStream(args);
        }
        public static InstancerParser create(String[] args) throws Exception 
        {
            ANTLRReaderStream input = getReaderStream(args);
            return create(input);
        }



    // $ANTLR start "top"
    // Instancer.g:201:1: top returns [List<Object> toplist] : ( initStatements )? c= topInner ;
    public final List<Object> top() throws RecognitionException {
        List<Object> toplist = null;


        Object c =null;


         toplist = new java.util.ArrayList<Object>(); 
        try {
            // Instancer.g:203:5: ( ( initStatements )? c= topInner )
            // Instancer.g:203:7: ( initStatements )? c= topInner
            {
            // Instancer.g:203:7: ( initStatements )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==16) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // Instancer.g:203:7: initStatements
                    {
                    pushFollow(FOLLOW_initStatements_in_top92);
                    initStatements();

                    state._fsp--;


                    }
                    break;

            }


            pushFollow(FOLLOW_topInner_in_top97);
            c=topInner();

            state._fsp--;


             toplist.add(c); 

            }

        }

            catch (RecognitionException e) 
            {
                throw e;
            }

        finally {
        	// do for sure before leaving
        }
        return toplist;
    }
    // $ANTLR end "top"



    // $ANTLR start "initStatements"
    // Instancer.g:209:1: initStatements : '{' ( initStatementChoice ';' )* '}' ;
    public final void initStatements() throws RecognitionException {
        try {
            // Instancer.g:210:5: ( '{' ( initStatementChoice ';' )* '}' )
            // Instancer.g:210:7: '{' ( initStatementChoice ';' )* '}'
            {
            match(input,16,FOLLOW_16_in_initStatements127); 

            // Instancer.g:210:11: ( initStatementChoice ';' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0 >= 14 && LA2_0 <= 15)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // Instancer.g:210:12: initStatementChoice ';'
            	    {
            	    pushFollow(FOLLOW_initStatementChoice_in_initStatements130);
            	    initStatementChoice();

            	    state._fsp--;


            	    match(input,13,FOLLOW_13_in_initStatements132); 

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            match(input,17,FOLLOW_17_in_initStatements136); 

            }

        }

            catch (RecognitionException e) 
            {
                throw e;
            }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "initStatements"



    // $ANTLR start "initStatementChoice"
    // Instancer.g:213:1: initStatementChoice : ( 'import' clz= classname | 'logging' c= QUOTEDLITERAL );
    public final void initStatementChoice() throws RecognitionException {
        Token c=null;
        String clz =null;


        try {
            // Instancer.g:214:5: ( 'import' clz= classname | 'logging' c= QUOTEDLITERAL )
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
                    // Instancer.g:214:7: 'import' clz= classname
                    {
                    match(input,14,FOLLOW_14_in_initStatementChoice153); 

                    pushFollow(FOLLOW_classname_in_initStatementChoice158);
                    clz=classname();

                    state._fsp--;


                     instancerCode.addImport(clz); 

                    }
                    break;
                case 2 :
                    // Instancer.g:215:7: 'logging' c= QUOTEDLITERAL
                    {
                    match(input,15,FOLLOW_15_in_initStatementChoice171); 

                    c=(Token)match(input,QUOTEDLITERAL,FOLLOW_QUOTEDLITERAL_in_initStatementChoice175); 

                     instancerCode.configureLogging(c.getText()); 

                    }
                    break;

            }
        }

            catch (RecognitionException e) 
            {
                throw e;
            }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "initStatementChoice"



    // $ANTLR start "topInner"
    // Instancer.g:218:1: topInner returns [Object value] : '(' cmd= command clz= classname args= arglist ')' ;
    public final Object topInner() throws RecognitionException {
        Object value = null;


        String cmd =null;

        String clz =null;

        List<Object> args =null;


        try {
            // Instancer.g:219:5: ( '(' cmd= command clz= classname args= arglist ')' )
            // Instancer.g:219:7: '(' cmd= command clz= classname args= arglist ')'
            {
            match(input,11,FOLLOW_11_in_topInner206); 

            pushFollow(FOLLOW_command_in_topInner210);
            cmd=command();

            state._fsp--;


            pushFollow(FOLLOW_classname_in_topInner214);
            clz=classname();

            state._fsp--;


            pushFollow(FOLLOW_arglist_in_topInner218);
            args=arglist();

            state._fsp--;


            match(input,12,FOLLOW_12_in_topInner220); 

             value = instancerCode.create(cmd, clz, args); 

            }

        }

            catch (RecognitionException e) 
            {
                throw e;
            }

        finally {
        	// do for sure before leaving
        }
        return value;
    }
    // $ANTLR end "topInner"



    // $ANTLR start "command"
    // Instancer.g:223:1: command returns [String value] : c= IDENTIFIER ;
    public final String command() throws RecognitionException {
        String value = null;


        Token c=null;

        try {
            // Instancer.g:224:5: (c= IDENTIFIER )
            // Instancer.g:224:7: c= IDENTIFIER
            {
            c=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_command258); 

             value = c.getText(); 

            }

        }

            catch (RecognitionException e) 
            {
                throw e;
            }

        finally {
        	// do for sure before leaving
        }
        return value;
    }
    // $ANTLR end "command"



    // $ANTLR start "classname"
    // Instancer.g:227:1: classname returns [String value] : (c= CLASSNAME |c= IDENTIFIER );
    public final String classname() throws RecognitionException {
        String value = null;


        Token c=null;

        try {
            // Instancer.g:228:5: (c= CLASSNAME |c= IDENTIFIER )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==CLASSNAME) ) {
                alt4=1;
            }
            else if ( (LA4_0==IDENTIFIER) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }
            switch (alt4) {
                case 1 :
                    // Instancer.g:228:8: c= CLASSNAME
                    {
                    c=(Token)match(input,CLASSNAME,FOLLOW_CLASSNAME_in_classname285); 

                     value = c.getText(); 

                    }
                    break;
                case 2 :
                    // Instancer.g:229:8: c= IDENTIFIER
                    {
                    c=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_classname300); 

                     value = c.getText(); 

                    }
                    break;

            }
        }

            catch (RecognitionException e) 
            {
                throw e;
            }

        finally {
        	// do for sure before leaving
        }
        return value;
    }
    // $ANTLR end "classname"



    // $ANTLR start "arglist"
    // Instancer.g:232:1: arglist returns [List<Object> list] : ( (c= QUOTEDLITERAL ) | (a= topInner ) )* ;
    public final List<Object> arglist() throws RecognitionException {
        List<Object> list = null;


        Token c=null;
        Object a =null;


          list = new ArrayList<Object>();   
        try {
            // Instancer.g:234:5: ( ( (c= QUOTEDLITERAL ) | (a= topInner ) )* )
            // Instancer.g:235:9: ( (c= QUOTEDLITERAL ) | (a= topInner ) )*
            {
            // Instancer.g:235:9: ( (c= QUOTEDLITERAL ) | (a= topInner ) )*
            loop5:
            do {
                int alt5=3;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==QUOTEDLITERAL) ) {
                    alt5=1;
                }
                else if ( (LA5_0==11) ) {
                    alt5=2;
                }


                switch (alt5) {
            	case 1 :
            	    // Instancer.g:235:13: (c= QUOTEDLITERAL )
            	    {
            	    // Instancer.g:235:13: (c= QUOTEDLITERAL )
            	    // Instancer.g:235:15: c= QUOTEDLITERAL
            	    {
            	    c=(Token)match(input,QUOTEDLITERAL,FOLLOW_QUOTEDLITERAL_in_arglist358); 

            	    list.add(c.getText());  

            	    }


            	    }
            	    break;
            	case 2 :
            	    // Instancer.g:236:13: (a= topInner )
            	    {
            	    // Instancer.g:236:13: (a= topInner )
            	    // Instancer.g:236:15: a= topInner
            	    {
            	    pushFollow(FOLLOW_topInner_in_arglist381);
            	    a=topInner();

            	    state._fsp--;


            	    list.add(a);     

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }

        }

            catch (RecognitionException e) 
            {
                throw e;
            }

        finally {
        	// do for sure before leaving
        }
        return list;
    }
    // $ANTLR end "arglist"

    // Delegated rules


 

    public static final BitSet FOLLOW_initStatements_in_top92 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_topInner_in_top97 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_initStatements127 = new BitSet(new long[]{0x000000000002C000L});
    public static final BitSet FOLLOW_initStatementChoice_in_initStatements130 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_initStatements132 = new BitSet(new long[]{0x000000000002C000L});
    public static final BitSet FOLLOW_17_in_initStatements136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_initStatementChoice153 = new BitSet(new long[]{0x0000000000000110L});
    public static final BitSet FOLLOW_classname_in_initStatementChoice158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_initStatementChoice171 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_QUOTEDLITERAL_in_initStatementChoice175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_topInner206 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_command_in_topInner210 = new BitSet(new long[]{0x0000000000000110L});
    public static final BitSet FOLLOW_classname_in_topInner214 = new BitSet(new long[]{0x0000000000001A00L});
    public static final BitSet FOLLOW_arglist_in_topInner218 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_topInner220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_command258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CLASSNAME_in_classname285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_classname300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUOTEDLITERAL_in_arglist358 = new BitSet(new long[]{0x0000000000000A02L});
    public static final BitSet FOLLOW_topInner_in_arglist381 = new BitSet(new long[]{0x0000000000000A02L});

}