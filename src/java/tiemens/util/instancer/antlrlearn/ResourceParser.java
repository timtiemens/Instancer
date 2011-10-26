// $ANTLR 3.4 Resource.g 2011-10-26 12:44:17
  
 package tiemens.util.instancer.antlrlearn;
 
 import java.util.HashMap; 
 import java.util.List; 
 import java.util.ArrayList; 
 import java.io.InputStream;
 import java.io.StringBufferInputStream;
 import java.io.FileInputStream;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class ResourceParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "COMMAND", "IDENTIFIER", "NEWLINE", "NUMBER", "SPACE", "'\"'", "'('", "')'", "'.'", "'\\''"
    };

    public static final int EOF=-1;
    public static final int T__9=9;
    public static final int T__10=10;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int COMMAND=4;
    public static final int IDENTIFIER=5;
    public static final int NEWLINE=6;
    public static final int NUMBER=7;
    public static final int SPACE=8;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public ResourceParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public ResourceParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return ResourceParser.tokenNames; }
    public String getGrammarFileName() { return "Resource.g"; }


        /** Store arguments ?  */
        List argList = new ArrayList();

        
        public static void main(String[] args) throws Exception 
        {
            ANTLRInputStream input = getInputStream(args);

            ResourceLexer lexer = new ResourceLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);

            ResourceParser parser = new ResourceParser(tokens);

            try {
                parser.prog();
                if (lexer.getExceptions().size() > 0)
                {
                   System.out.println("There were exceptions.  Check output.");
                }
            } catch (RecognitionException e)  {
                e.printStackTrace();
            }
        }
        
        public static ANTLRInputStream getInputStream(String[] args) throws Exception
        {
            ANTLRInputStream input = null;
            if (args.length > 0)
            {
                String arg = args[0];
                if (arg.indexOf(" ") >= 0)
                {
                   System.out.println("STRING is " + arg);
                   InputStream is = new StringBufferInputStream(arg);
                   input = new ANTLRInputStream(is);
                }
                else
                {
                   input = new ANTLRInputStream(new FileInputStream(arg)); // ANTLRFileStream(arg);
                }
            }
            else
            {
                input = new ANTLRInputStream(System.in);
            }
            return input;
        }
        



    // $ANTLR start "prog"
    // Resource.g:89:1: prog : ( instance )+ ;
    public final void prog() throws RecognitionException {
        try {
            // Resource.g:90:5: ( ( instance )+ )
            // Resource.g:90:8: ( instance )+
            {
            // Resource.g:90:8: ( instance )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==10) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // Resource.g:90:8: instance
            	    {
            	    pushFollow(FOLLOW_instance_in_prog53);
            	    instance();

            	    state._fsp--;


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
        return ;
    }
    // $ANTLR end "prog"



    // $ANTLR start "instance"
    // Resource.g:92:1: instance returns [List<Object> instances] : '(' c= command name= classname l= line ')' ;
    public final List<Object> instance() throws RecognitionException {
        List<Object> instances = null;


        String c =null;

        String name =null;

        List<Integer> l =null;


        try {
            // Resource.g:93:5: ( '(' c= command name= classname l= line ')' )
            // Resource.g:93:9: '(' c= command name= classname l= line ')'
            {
            match(input,10,FOLLOW_10_in_instance89); 

            pushFollow(FOLLOW_command_in_instance93);
            c=command();

            state._fsp--;


            pushFollow(FOLLOW_classname_in_instance97);
            name=classname();

            state._fsp--;


            pushFollow(FOLLOW_line_in_instance102);
            l=line();

            state._fsp--;


            match(input,11,FOLLOW_11_in_instance104); 

            System.out.println("command-is " + c + 
                                                         " classname=[" + name + "]");
                                      System.out.println("list.size=" + l.size());
                                      System.out.println(l);
                                      Object a = new String("ab"); 
                                      /* instances.add(a);} )+ */ 
                                     

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return instances;
    }
    // $ANTLR end "instance"



    // $ANTLR start "command"
    // Resource.g:103:1: command returns [String value] : c= COMMAND ;
    public final String command() throws RecognitionException {
        String value = null;


        Token c=null;

        try {
            // Resource.g:104:5: (c= COMMAND )
            // Resource.g:104:8: c= COMMAND
            {
            c=(Token)match(input,COMMAND,FOLLOW_COMMAND_in_command159); 

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
    // Resource.g:113:1: classname returns [String value] : ( '\"' c= identdotident '\"' | '\\'' c= identdotident '\\'' );
    public final String classname() throws RecognitionException {
        String value = null;


        String c =null;


        try {
            // Resource.g:114:5: ( '\"' c= identdotident '\"' | '\\'' c= identdotident '\\'' )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==9) ) {
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
                    // Resource.g:114:7: '\"' c= identdotident '\"'
                    {
                    match(input,9,FOLLOW_9_in_classname221); 

                    pushFollow(FOLLOW_identdotident_in_classname226);
                    c=identdotident();

                    state._fsp--;


                    match(input,9,FOLLOW_9_in_classname228); 

                    value = c;

                    }
                    break;
                case 2 :
                    // Resource.g:115:7: '\\'' c= identdotident '\\''
                    {
                    match(input,13,FOLLOW_13_in_classname242); 

                    pushFollow(FOLLOW_identdotident_in_classname246);
                    c=identdotident();

                    state._fsp--;


                    match(input,13,FOLLOW_13_in_classname248); 

                    value = c;

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



    // $ANTLR start "identdotident"
    // Resource.g:118:1: identdotident returns [String value] : c= IDENTIFIER ( '.' IDENTIFIER )* ;
    public final String identdotident() throws RecognitionException {
        String value = null;


        Token c=null;

        try {
            // Resource.g:119:6: (c= IDENTIFIER ( '.' IDENTIFIER )* )
            // Resource.g:119:8: c= IDENTIFIER ( '.' IDENTIFIER )*
            {
            c=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_identdotident279); 

            // Resource.g:119:21: ( '.' IDENTIFIER )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==12) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // Resource.g:119:22: '.' IDENTIFIER
            	    {
            	    match(input,12,FOLLOW_12_in_identdotident282); 

            	    match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_identdotident284); 

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


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
    // $ANTLR end "identdotident"



    // $ANTLR start "argslist"
    // Resource.g:127:2: argslist returns [Object value] :;
    public final Object argslist() throws RecognitionException {
        Object value = null;


        try {
            // Resource.g:128:5: ()
            // Resource.g:129:5: 
            {
            }

        }
        finally {
        	// do for sure before leaving
        }
        return value;
    }
    // $ANTLR end "argslist"



    // $ANTLR start "numberRetValue"
    // Resource.g:138:1: numberRetValue returns [Integer value] : (v= NUMBER ) ;
    public final Integer numberRetValue() throws RecognitionException {
        Integer value = null;


        Token v=null;

        try {
            // Resource.g:139:3: ( (v= NUMBER ) )
            // Resource.g:139:5: (v= NUMBER )
            {
            // Resource.g:139:5: (v= NUMBER )
            // Resource.g:139:6: v= NUMBER
            {
            v=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_numberRetValue409); 

            value = new Integer(v.getText()); 

            }


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
    // $ANTLR end "numberRetValue"



    // $ANTLR start "line"
    // Resource.g:149:1: line returns [List<Integer> row] : (a= numberRetValue )+ ;
    public final List<Integer> line() throws RecognitionException {
        List<Integer> row = null;


        Integer a =null;


          row = new ArrayList<Integer>();   
        try {
            // Resource.g:151:3: ( (a= numberRetValue )+ )
            // Resource.g:151:6: (a= numberRetValue )+
            {
            // Resource.g:151:6: (a= numberRetValue )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==NUMBER) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // Resource.g:151:8: a= numberRetValue
            	    {
            	    pushFollow(FOLLOW_numberRetValue_in_line465);
            	    a=numberRetValue();

            	    state._fsp--;


            	    row.add(a);

            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
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
        return row;
    }
    // $ANTLR end "line"

    // Delegated rules


 

    public static final BitSet FOLLOW_instance_in_prog53 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_10_in_instance89 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_command_in_instance93 = new BitSet(new long[]{0x0000000000002200L});
    public static final BitSet FOLLOW_classname_in_instance97 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_line_in_instance102 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_instance104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMAND_in_command159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_9_in_classname221 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_identdotident_in_classname226 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_classname228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_classname242 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_identdotident_in_classname246 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_classname248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_identdotident279 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_12_in_identdotident282 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_IDENTIFIER_in_identdotident284 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_NUMBER_in_numberRetValue409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numberRetValue_in_line465 = new BitSet(new long[]{0x0000000000000082L});

}