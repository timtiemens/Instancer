// $ANTLR 3.4 Instancer.g 2011-10-28 18:11:59

   package tiemens.util.instancer.antlr; 


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class InstancerLexer extends Lexer {
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

        private InstancerCode instancerCode = null;
        public void setInstancerCode(InstancerCode in)
        {
            instancerCode = in;
        }
        
        
        List<RecognitionException> exceptions = new ArrayList<RecognitionException>();
        public List<RecognitionException> getExceptions() 
        {
            return exceptions;
        }
        public void addException(RecognitionException e)
        {
            exceptions.add(e);
        }
        @Override
        public void reportError(RecognitionException e) 
        {
            super.reportError(e);
            addException(e);
        }


    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public InstancerLexer() {} 
    public InstancerLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InstancerLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "Instancer.g"; }

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Instancer.g:30:7: ( '(' )
            // Instancer.g:30:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Instancer.g:31:7: ( ')' )
            // Instancer.g:31:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Instancer.g:32:7: ( ';' )
            // Instancer.g:32:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Instancer.g:33:7: ( 'import' )
            // Instancer.g:33:9: 'import'
            {
            match("import"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Instancer.g:34:7: ( 'logging' )
            // Instancer.g:34:9: 'logging'
            {
            match("logging"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Instancer.g:35:7: ( '{' )
            // Instancer.g:35:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Instancer.g:36:7: ( '}' )
            // Instancer.g:36:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "IDENTIFIER"
    public final void mIDENTIFIER() throws RecognitionException {
        try {
            int _type = IDENTIFIER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Instancer.g:231:4: ( ( 'A' .. 'Z' | 'a' .. 'z' ) ( 'A' .. 'Z' | 'a' .. 'z' | DIGIT )* )
            // Instancer.g:231:6: ( 'A' .. 'Z' | 'a' .. 'z' ) ( 'A' .. 'Z' | 'a' .. 'z' | DIGIT )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // Instancer.g:231:32: ( 'A' .. 'Z' | 'a' .. 'z' | DIGIT )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // Instancer.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IDENTIFIER"

    // $ANTLR start "CLASSNAME"
    public final void mCLASSNAME() throws RecognitionException {
        try {
            int _type = CLASSNAME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Instancer.g:235:4: ( IDENTIFIER ( '.' IDENTIFIER )* )
            // Instancer.g:235:6: IDENTIFIER ( '.' IDENTIFIER )*
            {
            mIDENTIFIER(); 


            // Instancer.g:235:17: ( '.' IDENTIFIER )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0=='.') ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // Instancer.g:235:19: '.' IDENTIFIER
            	    {
            	    match('.'); 

            	    mIDENTIFIER(); 


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CLASSNAME"

    // $ANTLR start "QUOTEDLITERAL"
    public final void mQUOTEDLITERAL() throws RecognitionException {
        try {
            int _type = QUOTEDLITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Instancer.g:242:5: ( '\"' ( ESCAPESEQUENCE |~ ( '\\\\' | '\"' | '\\r' | '\\n' ) )* '\"' )
            // Instancer.g:242:9: '\"' ( ESCAPESEQUENCE |~ ( '\\\\' | '\"' | '\\r' | '\\n' ) )* '\"'
            {
            match('\"'); 

            // Instancer.g:243:9: ( ESCAPESEQUENCE |~ ( '\\\\' | '\"' | '\\r' | '\\n' ) )*
            loop3:
            do {
                int alt3=3;
                int LA3_0 = input.LA(1);

                if ( (LA3_0=='\\') ) {
                    alt3=1;
                }
                else if ( ((LA3_0 >= '\u0000' && LA3_0 <= '\t')||(LA3_0 >= '\u000B' && LA3_0 <= '\f')||(LA3_0 >= '\u000E' && LA3_0 <= '!')||(LA3_0 >= '#' && LA3_0 <= '[')||(LA3_0 >= ']' && LA3_0 <= '\uFFFF')) ) {
                    alt3=2;
                }


                switch (alt3) {
            	case 1 :
            	    // Instancer.g:243:13: ESCAPESEQUENCE
            	    {
            	    mESCAPESEQUENCE(); 


            	    }
            	    break;
            	case 2 :
            	    // Instancer.g:244:13: ~ ( '\\\\' | '\"' | '\\r' | '\\n' )
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            match('\"'); 

             setText( getText().substring(1, getText().length() - 1) );
                             setText( instancerCode.unescape(getText()) );
                           

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "QUOTEDLITERAL"

    // $ANTLR start "ESCAPESEQUENCE"
    public final void mESCAPESEQUENCE() throws RecognitionException {
        try {
            // Instancer.g:253:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' | ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | ( '0' .. '7' ) ( '0' .. '7' ) | ( '0' .. '7' ) ) )
            // Instancer.g:253:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' | ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | ( '0' .. '7' ) ( '0' .. '7' ) | ( '0' .. '7' ) )
            {
            match('\\'); 

            // Instancer.g:253:14: ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' | ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | ( '0' .. '7' ) ( '0' .. '7' ) | ( '0' .. '7' ) )
            int alt4=11;
            switch ( input.LA(1) ) {
            case 'b':
                {
                alt4=1;
                }
                break;
            case 't':
                {
                alt4=2;
                }
                break;
            case 'n':
                {
                alt4=3;
                }
                break;
            case 'f':
                {
                alt4=4;
                }
                break;
            case 'r':
                {
                alt4=5;
                }
                break;
            case '\"':
                {
                alt4=6;
                }
                break;
            case '\'':
                {
                alt4=7;
                }
                break;
            case '\\':
                {
                alt4=8;
                }
                break;
            case '0':
            case '1':
            case '2':
            case '3':
                {
                int LA4_9 = input.LA(2);

                if ( ((LA4_9 >= '0' && LA4_9 <= '7')) ) {
                    int LA4_11 = input.LA(3);

                    if ( ((LA4_11 >= '0' && LA4_11 <= '7')) ) {
                        alt4=9;
                    }
                    else {
                        alt4=10;
                    }
                }
                else {
                    alt4=11;
                }
                }
                break;
            case '4':
            case '5':
            case '6':
            case '7':
                {
                int LA4_10 = input.LA(2);

                if ( ((LA4_10 >= '0' && LA4_10 <= '7')) ) {
                    alt4=10;
                }
                else {
                    alt4=11;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }

            switch (alt4) {
                case 1 :
                    // Instancer.g:254:18: 'b'
                    {
                    match('b'); 

                    }
                    break;
                case 2 :
                    // Instancer.g:255:18: 't'
                    {
                    match('t'); 

                    }
                    break;
                case 3 :
                    // Instancer.g:256:18: 'n'
                    {
                    match('n'); 

                    }
                    break;
                case 4 :
                    // Instancer.g:257:18: 'f'
                    {
                    match('f'); 

                    }
                    break;
                case 5 :
                    // Instancer.g:258:18: 'r'
                    {
                    match('r'); 

                    }
                    break;
                case 6 :
                    // Instancer.g:259:18: '\\\"'
                    {
                    match('\"'); 

                    }
                    break;
                case 7 :
                    // Instancer.g:260:18: '\\''
                    {
                    match('\''); 

                    }
                    break;
                case 8 :
                    // Instancer.g:261:18: '\\\\'
                    {
                    match('\\'); 

                    }
                    break;
                case 9 :
                    // Instancer.g:262:18: ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    if ( (input.LA(1) >= '0' && input.LA(1) <= '3') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;
                case 10 :
                    // Instancer.g:263:18: ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;
                case 11 :
                    // Instancer.g:264:18: ( '0' .. '7' )
                    {
                    if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;

            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ESCAPESEQUENCE"

    // $ANTLR start "WHITESPACE"
    public final void mWHITESPACE() throws RecognitionException {
        try {
            int _type = WHITESPACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Instancer.g:270:12: ( ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' )+ )
            // Instancer.g:270:14: ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' )+
            {
            // Instancer.g:270:14: ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0 >= '\t' && LA5_0 <= '\n')||(LA5_0 >= '\f' && LA5_0 <= '\r')||LA5_0==' ') ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // Instancer.g:
            	    {
            	    if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||(input.LA(1) >= '\f' && input.LA(1) <= '\r')||input.LA(1)==' ' ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);


             _channel = HIDDEN; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WHITESPACE"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Instancer.g:272:12: ( '/*' ( . )* '*/' )
            // Instancer.g:272:14: '/*' ( . )* '*/'
            {
            match("/*"); 



            // Instancer.g:272:19: ( . )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0=='*') ) {
                    int LA6_1 = input.LA(2);

                    if ( (LA6_1=='/') ) {
                        alt6=2;
                    }
                    else if ( ((LA6_1 >= '\u0000' && LA6_1 <= '.')||(LA6_1 >= '0' && LA6_1 <= '\uFFFF')) ) {
                        alt6=1;
                    }


                }
                else if ( ((LA6_0 >= '\u0000' && LA6_0 <= ')')||(LA6_0 >= '+' && LA6_0 <= '\uFFFF')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // Instancer.g:272:19: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            match("*/"); 



             _channel = HIDDEN; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMMENT"

    // $ANTLR start "DIGIT"
    public final void mDIGIT() throws RecognitionException {
        try {
            // Instancer.g:274:17: ( '0' .. '9' )
            // Instancer.g:
            {
            if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DIGIT"

    public void mTokens() throws RecognitionException {
        // Instancer.g:1:8: ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | IDENTIFIER | CLASSNAME | QUOTEDLITERAL | WHITESPACE | COMMENT )
        int alt7=12;
        alt7 = dfa7.predict(input);
        switch (alt7) {
            case 1 :
                // Instancer.g:1:10: T__11
                {
                mT__11(); 


                }
                break;
            case 2 :
                // Instancer.g:1:16: T__12
                {
                mT__12(); 


                }
                break;
            case 3 :
                // Instancer.g:1:22: T__13
                {
                mT__13(); 


                }
                break;
            case 4 :
                // Instancer.g:1:28: T__14
                {
                mT__14(); 


                }
                break;
            case 5 :
                // Instancer.g:1:34: T__15
                {
                mT__15(); 


                }
                break;
            case 6 :
                // Instancer.g:1:40: T__16
                {
                mT__16(); 


                }
                break;
            case 7 :
                // Instancer.g:1:46: T__17
                {
                mT__17(); 


                }
                break;
            case 8 :
                // Instancer.g:1:52: IDENTIFIER
                {
                mIDENTIFIER(); 


                }
                break;
            case 9 :
                // Instancer.g:1:63: CLASSNAME
                {
                mCLASSNAME(); 


                }
                break;
            case 10 :
                // Instancer.g:1:73: QUOTEDLITERAL
                {
                mQUOTEDLITERAL(); 


                }
                break;
            case 11 :
                // Instancer.g:1:87: WHITESPACE
                {
                mWHITESPACE(); 


                }
                break;
            case 12 :
                // Instancer.g:1:98: COMMENT
                {
                mCOMMENT(); 


                }
                break;

        }

    }


    protected DFA7 dfa7 = new DFA7(this);
    static final String DFA7_eotS =
        "\4\uffff\2\16\2\uffff\1\16\3\uffff\2\16\2\uffff\7\16\1\31\1\16\1"+
        "\uffff\1\33\1\uffff";
    static final String DFA7_eofS =
        "\34\uffff";
    static final String DFA7_minS =
        "\1\11\3\uffff\2\56\2\uffff\1\56\3\uffff\2\56\2\uffff\11\56\1\uffff"+
        "\1\56\1\uffff";
    static final String DFA7_maxS =
        "\1\175\3\uffff\2\172\2\uffff\1\172\3\uffff\2\172\2\uffff\11\172"+
        "\1\uffff\1\172\1\uffff";
    static final String DFA7_acceptS =
        "\1\uffff\1\1\1\2\1\3\2\uffff\1\6\1\7\1\uffff\1\12\1\13\1\14\2\uffff"+
        "\1\10\1\11\11\uffff\1\4\1\uffff\1\5";
    static final String DFA7_specialS =
        "\34\uffff}>";
    static final String[] DFA7_transitionS = {
            "\2\12\1\uffff\2\12\22\uffff\1\12\1\uffff\1\11\5\uffff\1\1\1"+
            "\2\5\uffff\1\13\13\uffff\1\3\5\uffff\32\10\6\uffff\10\10\1\4"+
            "\2\10\1\5\16\10\1\6\1\uffff\1\7",
            "",
            "",
            "",
            "\1\17\1\uffff\12\15\7\uffff\32\15\6\uffff\14\15\1\14\15\15",
            "\1\17\1\uffff\12\15\7\uffff\32\15\6\uffff\16\15\1\20\13\15",
            "",
            "",
            "\1\17\1\uffff\12\15\7\uffff\32\15\6\uffff\32\15",
            "",
            "",
            "",
            "\1\17\1\uffff\12\15\7\uffff\32\15\6\uffff\17\15\1\21\12\15",
            "\1\17\1\uffff\12\15\7\uffff\32\15\6\uffff\32\15",
            "",
            "",
            "\1\17\1\uffff\12\15\7\uffff\32\15\6\uffff\6\15\1\22\23\15",
            "\1\17\1\uffff\12\15\7\uffff\32\15\6\uffff\16\15\1\23\13\15",
            "\1\17\1\uffff\12\15\7\uffff\32\15\6\uffff\6\15\1\24\23\15",
            "\1\17\1\uffff\12\15\7\uffff\32\15\6\uffff\21\15\1\25\10\15",
            "\1\17\1\uffff\12\15\7\uffff\32\15\6\uffff\10\15\1\26\21\15",
            "\1\17\1\uffff\12\15\7\uffff\32\15\6\uffff\23\15\1\27\6\15",
            "\1\17\1\uffff\12\15\7\uffff\32\15\6\uffff\15\15\1\30\14\15",
            "\1\17\1\uffff\12\15\7\uffff\32\15\6\uffff\32\15",
            "\1\17\1\uffff\12\15\7\uffff\32\15\6\uffff\6\15\1\32\23\15",
            "",
            "\1\17\1\uffff\12\15\7\uffff\32\15\6\uffff\32\15",
            ""
    };

    static final short[] DFA7_eot = DFA.unpackEncodedString(DFA7_eotS);
    static final short[] DFA7_eof = DFA.unpackEncodedString(DFA7_eofS);
    static final char[] DFA7_min = DFA.unpackEncodedStringToUnsignedChars(DFA7_minS);
    static final char[] DFA7_max = DFA.unpackEncodedStringToUnsignedChars(DFA7_maxS);
    static final short[] DFA7_accept = DFA.unpackEncodedString(DFA7_acceptS);
    static final short[] DFA7_special = DFA.unpackEncodedString(DFA7_specialS);
    static final short[][] DFA7_transition;

    static {
        int numStates = DFA7_transitionS.length;
        DFA7_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA7_transition[i] = DFA.unpackEncodedString(DFA7_transitionS[i]);
        }
    }

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = DFA7_eot;
            this.eof = DFA7_eof;
            this.min = DFA7_min;
            this.max = DFA7_max;
            this.accept = DFA7_accept;
            this.special = DFA7_special;
            this.transition = DFA7_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | IDENTIFIER | CLASSNAME | QUOTEDLITERAL | WHITESPACE | COMMENT );";
        }
    }
 

}