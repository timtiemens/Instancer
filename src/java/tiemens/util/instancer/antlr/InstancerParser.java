// $ANTLR 3.4 Instancer.g 2011-10-27 14:07:55
  
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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "CLASSNAME", "DIGIT", "EscapeSequence", "IDENTIFIER", "NUMBER", "QUOTEDLITERAL", "WHITESPACE", "'('", "')'", "';'", "'<'", "'>'", "'import'", "'logging'", "'{'", "'}'"
    };

    public static final int EOF=-1;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__19=19;
    public static final int CLASSNAME=4;
    public static final int DIGIT=5;
    public static final int EscapeSequence=6;
    public static final int IDENTIFIER=7;
    public static final int NUMBER=8;
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


        private final InstancerCode instancerCode = new InstancerCode();
        
        public static InstancerParser create(String[] args) throws Exception 
        {
            ANTLRReaderStream input = getReaderStream(args);
            return create(input);
        }
        public static InstancerParser create(ANTLRReaderStream input) throws Exception
        {
            InstancerLexer lexer = new InstancerLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            InstancerParser parser = new InstancerParser(tokens);
            
            lexer.setInstancerCode(parser.instancerCode);
            
            return parser;
        }
        
        public static void main(String[] args) throws Exception 

        {
            InstancerParser parser = create(args);

            try 
            {
                List<Object> thelist = parser.top();
                
                System.out.println("MAIN: toplist.size() = " + thelist.size());
                Object zero = thelist.get(0);
                System.out.println("MAIN: [0]=" + zero);
                System.out.println("MAIN: class name=" + zero.getClass().getName());
            } 
            catch (RecognitionException e)  
            {
                e.printStackTrace();
            }
        }
        
        public static ANTLRReaderStream getReaderStream(String[] args) throws Exception
        {
            ANTLRReaderStream input = null;
            if (args.length > 0)
            {
                String arg = args[0];
                if (arg.indexOf(" ") >= 0)
                {
                   System.out.println("STRING is " + arg);
                   StringReader stream = new StringReader(arg);
                   input = new ANTLRReaderStream(stream);
                }
                else
                {
                   input = new ANTLRReaderStream(new FileReader(arg));
                }
            }
            else
            {
                input = new ANTLRInputStream(System.in);
            }
            return input;
        }



    // $ANTLR start "top"
    // Instancer.g:124:1: top returns [List<Object> toplist] : ( initStatements )? c= topInner ;
    public final List<Object> top() throws RecognitionException {
        List<Object> toplist = null;


        Object c =null;


         toplist = new java.util.ArrayList<Object>(); 
        try {
            // Instancer.g:126:5: ( ( initStatements )? c= topInner )
            // Instancer.g:126:7: ( initStatements )? c= topInner
            {
            // Instancer.g:126:7: ( initStatements )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==18) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // Instancer.g:126:7: initStatements
                    {
                    pushFollow(FOLLOW_initStatements_in_top81);
                    initStatements();

                    state._fsp--;


                    }
                    break;

            }


            pushFollow(FOLLOW_topInner_in_top86);
            c=topInner();

            state._fsp--;


             toplist.add(c); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return toplist;
    }
    // $ANTLR end "top"



    // $ANTLR start "initStatements"
    // Instancer.g:129:1: initStatements : '{' ( initStatementChoice ';' )* '}' ;
    public final void initStatements() throws RecognitionException {
        try {
            // Instancer.g:130:5: ( '{' ( initStatementChoice ';' )* '}' )
            // Instancer.g:130:7: '{' ( initStatementChoice ';' )* '}'
            {
            match(input,18,FOLLOW_18_in_initStatements109); 

            // Instancer.g:130:11: ( initStatementChoice ';' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0 >= 16 && LA2_0 <= 17)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // Instancer.g:130:12: initStatementChoice ';'
            	    {
            	    pushFollow(FOLLOW_initStatementChoice_in_initStatements112);
            	    initStatementChoice();

            	    state._fsp--;


            	    match(input,13,FOLLOW_13_in_initStatements114); 

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            match(input,19,FOLLOW_19_in_initStatements118); 

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
    // $ANTLR end "initStatements"



    // $ANTLR start "initStatementChoice"
    // Instancer.g:133:1: initStatementChoice : ( 'import' clz= classname | 'logging' c= QUOTEDLITERAL );
    public final void initStatementChoice() throws RecognitionException {
        Token c=null;
        String clz =null;


        try {
            // Instancer.g:134:5: ( 'import' clz= classname | 'logging' c= QUOTEDLITERAL )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==16) ) {
                alt3=1;
            }
            else if ( (LA3_0==17) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;

            }
            switch (alt3) {
                case 1 :
                    // Instancer.g:134:7: 'import' clz= classname
                    {
                    match(input,16,FOLLOW_16_in_initStatementChoice135); 

                    pushFollow(FOLLOW_classname_in_initStatementChoice140);
                    clz=classname();

                    state._fsp--;


                     instancerCode.addImport(clz); 

                    }
                    break;
                case 2 :
                    // Instancer.g:135:7: 'logging' c= QUOTEDLITERAL
                    {
                    match(input,17,FOLLOW_17_in_initStatementChoice153); 

                    c=(Token)match(input,QUOTEDLITERAL,FOLLOW_QUOTEDLITERAL_in_initStatementChoice157); 

                     instancerCode.configureLogging(c.getText()); 

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
        return ;
    }
    // $ANTLR end "initStatementChoice"



    // $ANTLR start "topInner"
    // Instancer.g:138:1: topInner returns [Object value] : '<' cmd= command clz= classname args= arglist '>' ;
    public final Object topInner() throws RecognitionException {
        Object value = null;


        String cmd =null;

        String clz =null;

        List<Object> args =null;


        try {
            // Instancer.g:139:5: ( '<' cmd= command clz= classname args= arglist '>' )
            // Instancer.g:139:7: '<' cmd= command clz= classname args= arglist '>'
            {
            match(input,14,FOLLOW_14_in_topInner188); 

            pushFollow(FOLLOW_command_in_topInner192);
            cmd=command();

            state._fsp--;


            pushFollow(FOLLOW_classname_in_topInner196);
            clz=classname();

            state._fsp--;


            pushFollow(FOLLOW_arglist_in_topInner200);
            args=arglist();

            state._fsp--;


            match(input,15,FOLLOW_15_in_topInner202); 

             value = instancerCode.create(cmd, clz, args); 

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
    // $ANTLR end "topInner"



    // $ANTLR start "command"
    // Instancer.g:143:1: command returns [String value] : c= IDENTIFIER ;
    public final String command() throws RecognitionException {
        String value = null;


        Token c=null;

        try {
            // Instancer.g:144:5: (c= IDENTIFIER )
            // Instancer.g:144:7: c= IDENTIFIER
            {
            c=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_command240); 

             value = c.getText(); 

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
    // $ANTLR end "command"



    // $ANTLR start "classname"
    // Instancer.g:147:1: classname returns [String value] : (c= CLASSNAME |c= IDENTIFIER );
    public final String classname() throws RecognitionException {
        String value = null;


        Token c=null;

        try {
            // Instancer.g:148:5: (c= CLASSNAME |c= IDENTIFIER )
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
                    // Instancer.g:148:8: c= CLASSNAME
                    {
                    c=(Token)match(input,CLASSNAME,FOLLOW_CLASSNAME_in_classname266); 

                     value = c.getText(); 

                    }
                    break;
                case 2 :
                    // Instancer.g:149:8: c= IDENTIFIER
                    {
                    c=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_classname281); 

                     value = c.getText(); 

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
    // $ANTLR end "classname"



    // $ANTLR start "arglist"
    // Instancer.g:152:1: arglist returns [List<Object> list] : '(' ( (c= QUOTEDLITERAL ) | (a= topInner ) )* ')' ;
    public final List<Object> arglist() throws RecognitionException {
        List<Object> list = null;


        Token c=null;
        Object a =null;


          list = new ArrayList<Object>();   
        try {
            // Instancer.g:154:5: ( '(' ( (c= QUOTEDLITERAL ) | (a= topInner ) )* ')' )
            // Instancer.g:154:8: '(' ( (c= QUOTEDLITERAL ) | (a= topInner ) )* ')'
            {
            match(input,11,FOLLOW_11_in_arglist318); 

            // Instancer.g:155:9: ( (c= QUOTEDLITERAL ) | (a= topInner ) )*
            loop5:
            do {
                int alt5=3;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==QUOTEDLITERAL) ) {
                    alt5=1;
                }
                else if ( (LA5_0==14) ) {
                    alt5=2;
                }


                switch (alt5) {
            	case 1 :
            	    // Instancer.g:155:13: (c= QUOTEDLITERAL )
            	    {
            	    // Instancer.g:155:13: (c= QUOTEDLITERAL )
            	    // Instancer.g:155:15: c= QUOTEDLITERAL
            	    {
            	    c=(Token)match(input,QUOTEDLITERAL,FOLLOW_QUOTEDLITERAL_in_arglist336); 

            	    list.add(c.getText());  

            	    }


            	    }
            	    break;
            	case 2 :
            	    // Instancer.g:156:13: (a= topInner )
            	    {
            	    // Instancer.g:156:13: (a= topInner )
            	    // Instancer.g:156:15: a= topInner
            	    {
            	    pushFollow(FOLLOW_topInner_in_arglist359);
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


            match(input,12,FOLLOW_12_in_arglist390); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return list;
    }
    // $ANTLR end "arglist"

    // Delegated rules


 

    public static final BitSet FOLLOW_initStatements_in_top81 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_topInner_in_top86 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_initStatements109 = new BitSet(new long[]{0x00000000000B0000L});
    public static final BitSet FOLLOW_initStatementChoice_in_initStatements112 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_initStatements114 = new BitSet(new long[]{0x00000000000B0000L});
    public static final BitSet FOLLOW_19_in_initStatements118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_initStatementChoice135 = new BitSet(new long[]{0x0000000000000090L});
    public static final BitSet FOLLOW_classname_in_initStatementChoice140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_initStatementChoice153 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_QUOTEDLITERAL_in_initStatementChoice157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_topInner188 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_command_in_topInner192 = new BitSet(new long[]{0x0000000000000090L});
    public static final BitSet FOLLOW_classname_in_topInner196 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_arglist_in_topInner200 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_topInner202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_command240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CLASSNAME_in_classname266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_classname281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_arglist318 = new BitSet(new long[]{0x0000000000005200L});
    public static final BitSet FOLLOW_QUOTEDLITERAL_in_arglist336 = new BitSet(new long[]{0x0000000000005200L});
    public static final BitSet FOLLOW_topInner_in_arglist359 = new BitSet(new long[]{0x0000000000005200L});
    public static final BitSet FOLLOW_12_in_arglist390 = new BitSet(new long[]{0x0000000000000002L});

}