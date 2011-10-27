// $ANTLR 3.4 Instancer.g 2011-10-27 14:07:56

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
    public static final int T__18=18;
    public static final int T__19=19;
    public static final int CLASSNAME=4;
    public static final int DIGIT=5;
    public static final int EscapeSequence=6;
    public static final int IDENTIFIER=7;
    public static final int NUMBER=8;
    public static final int QUOTEDLITERAL=9;
    public static final int WHITESPACE=10;

        private InstancerCode instancerCode = null;
        public void setInstancerCode(InstancerCode in)
        {
            instancerCode = in;
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
            // Instancer.g:13:7: ( '(' )
            // Instancer.g:13:9: '('
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
            // Instancer.g:14:7: ( ')' )
            // Instancer.g:14:9: ')'
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
            // Instancer.g:15:7: ( ';' )
            // Instancer.g:15:9: ';'
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
            // Instancer.g:16:7: ( '<' )
            // Instancer.g:16:9: '<'
            {
            match('<'); 

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
            // Instancer.g:17:7: ( '>' )
            // Instancer.g:17:9: '>'
            {
            match('>'); 

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
            // Instancer.g:18:7: ( 'import' )
            // Instancer.g:18:9: 'import'
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
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Instancer.g:19:7: ( 'logging' )
            // Instancer.g:19:9: 'logging'
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
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Instancer.g:20:7: ( '{' )
            // Instancer.g:20:9: '{'
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
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Instancer.g:21:7: ( '}' )
            // Instancer.g:21:9: '}'
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
    // $ANTLR end "T__19"

    // $ANTLR start "IDENTIFIER"
    public final void mIDENTIFIER() throws RecognitionException {
        try {
            int _type = IDENTIFIER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Instancer.g:168:4: ( ( 'A' .. 'Z' | 'a' .. 'z' ) ( 'A' .. 'Z' | 'a' .. 'z' | DIGIT )* )
            // Instancer.g:168:6: ( 'A' .. 'Z' | 'a' .. 'z' ) ( 'A' .. 'Z' | 'a' .. 'z' | DIGIT )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // Instancer.g:168:32: ( 'A' .. 'Z' | 'a' .. 'z' | DIGIT )*
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
            // Instancer.g:172:4: ( IDENTIFIER ( '.' IDENTIFIER )* )
            // Instancer.g:172:6: IDENTIFIER ( '.' IDENTIFIER )*
            {
            mIDENTIFIER(); 


            // Instancer.g:172:17: ( '.' IDENTIFIER )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0=='.') ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // Instancer.g:172:19: '.' IDENTIFIER
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

    // $ANTLR start "NUMBER"
    public final void mNUMBER() throws RecognitionException {
        try {
            int _type = NUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Instancer.g:175:9: ( ( DIGIT )+ )
            // Instancer.g:175:11: ( DIGIT )+
            {
            // Instancer.g:175:11: ( DIGIT )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0 >= '0' && LA3_0 <= '9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
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
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NUMBER"

    // $ANTLR start "QUOTEDLITERAL"
    public final void mQUOTEDLITERAL() throws RecognitionException {
        try {
            int _type = QUOTEDLITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Instancer.g:179:5: ( '\"' ( EscapeSequence |~ ( '\\\\' | '\"' | '\\r' | '\\n' ) )* '\"' )
            // Instancer.g:179:9: '\"' ( EscapeSequence |~ ( '\\\\' | '\"' | '\\r' | '\\n' ) )* '\"'
            {
            match('\"'); 

            // Instancer.g:180:9: ( EscapeSequence |~ ( '\\\\' | '\"' | '\\r' | '\\n' ) )*
            loop4:
            do {
                int alt4=3;
                int LA4_0 = input.LA(1);

                if ( (LA4_0=='\\') ) {
                    alt4=1;
                }
                else if ( ((LA4_0 >= '\u0000' && LA4_0 <= '\t')||(LA4_0 >= '\u000B' && LA4_0 <= '\f')||(LA4_0 >= '\u000E' && LA4_0 <= '!')||(LA4_0 >= '#' && LA4_0 <= '[')||(LA4_0 >= ']' && LA4_0 <= '\uFFFF')) ) {
                    alt4=2;
                }


                switch (alt4) {
            	case 1 :
            	    // Instancer.g:180:13: EscapeSequence
            	    {
            	    mEscapeSequence(); 


            	    }
            	    break;
            	case 2 :
            	    // Instancer.g:181:13: ~ ( '\\\\' | '\"' | '\\r' | '\\n' )
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
            	    break loop4;
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

    // $ANTLR start "EscapeSequence"
    public final void mEscapeSequence() throws RecognitionException {
        try {
            // Instancer.g:192:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' | ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | ( '0' .. '7' ) ( '0' .. '7' ) | ( '0' .. '7' ) ) )
            // Instancer.g:192:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' | ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | ( '0' .. '7' ) ( '0' .. '7' ) | ( '0' .. '7' ) )
            {
            match('\\'); 

            // Instancer.g:192:14: ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' | ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | ( '0' .. '7' ) ( '0' .. '7' ) | ( '0' .. '7' ) )
            int alt5=11;
            switch ( input.LA(1) ) {
            case 'b':
                {
                alt5=1;
                }
                break;
            case 't':
                {
                alt5=2;
                }
                break;
            case 'n':
                {
                alt5=3;
                }
                break;
            case 'f':
                {
                alt5=4;
                }
                break;
            case 'r':
                {
                alt5=5;
                }
                break;
            case '\"':
                {
                alt5=6;
                }
                break;
            case '\'':
                {
                alt5=7;
                }
                break;
            case '\\':
                {
                alt5=8;
                }
                break;
            case '0':
            case '1':
            case '2':
            case '3':
                {
                int LA5_9 = input.LA(2);

                if ( ((LA5_9 >= '0' && LA5_9 <= '7')) ) {
                    int LA5_11 = input.LA(3);

                    if ( ((LA5_11 >= '0' && LA5_11 <= '7')) ) {
                        alt5=9;
                    }
                    else {
                        alt5=10;
                    }
                }
                else {
                    alt5=11;
                }
                }
                break;
            case '4':
            case '5':
            case '6':
            case '7':
                {
                int LA5_10 = input.LA(2);

                if ( ((LA5_10 >= '0' && LA5_10 <= '7')) ) {
                    alt5=10;
                }
                else {
                    alt5=11;
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
                    // Instancer.g:193:18: 'b'
                    {
                    match('b'); 

                    }
                    break;
                case 2 :
                    // Instancer.g:194:18: 't'
                    {
                    match('t'); 

                    }
                    break;
                case 3 :
                    // Instancer.g:195:18: 'n'
                    {
                    match('n'); 

                    }
                    break;
                case 4 :
                    // Instancer.g:196:18: 'f'
                    {
                    match('f'); 

                    }
                    break;
                case 5 :
                    // Instancer.g:197:18: 'r'
                    {
                    match('r'); 

                    }
                    break;
                case 6 :
                    // Instancer.g:198:18: '\\\"'
                    {
                    match('\"'); 

                    }
                    break;
                case 7 :
                    // Instancer.g:199:18: '\\''
                    {
                    match('\''); 

                    }
                    break;
                case 8 :
                    // Instancer.g:200:18: '\\\\'
                    {
                    match('\\'); 

                    }
                    break;
                case 9 :
                    // Instancer.g:201:18: ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
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
                    // Instancer.g:202:18: ( '0' .. '7' ) ( '0' .. '7' )
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
                    // Instancer.g:203:18: ( '0' .. '7' )
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
    // $ANTLR end "EscapeSequence"

    // $ANTLR start "WHITESPACE"
    public final void mWHITESPACE() throws RecognitionException {
        try {
            int _type = WHITESPACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Instancer.g:218:12: ( ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' )+ )
            // Instancer.g:218:14: ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' )+
            {
            // Instancer.g:218:14: ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0 >= '\t' && LA6_0 <= '\n')||(LA6_0 >= '\f' && LA6_0 <= '\r')||LA6_0==' ') ) {
                    alt6=1;
                }


                switch (alt6) {
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
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
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

    // $ANTLR start "DIGIT"
    public final void mDIGIT() throws RecognitionException {
        try {
            // Instancer.g:220:17: ( '0' .. '9' )
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
        // Instancer.g:1:8: ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | IDENTIFIER | CLASSNAME | NUMBER | QUOTEDLITERAL | WHITESPACE )
        int alt7=14;
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
                // Instancer.g:1:52: T__18
                {
                mT__18(); 


                }
                break;
            case 9 :
                // Instancer.g:1:58: T__19
                {
                mT__19(); 


                }
                break;
            case 10 :
                // Instancer.g:1:64: IDENTIFIER
                {
                mIDENTIFIER(); 


                }
                break;
            case 11 :
                // Instancer.g:1:75: CLASSNAME
                {
                mCLASSNAME(); 


                }
                break;
            case 12 :
                // Instancer.g:1:85: NUMBER
                {
                mNUMBER(); 


                }
                break;
            case 13 :
                // Instancer.g:1:92: QUOTEDLITERAL
                {
                mQUOTEDLITERAL(); 


                }
                break;
            case 14 :
                // Instancer.g:1:106: WHITESPACE
                {
                mWHITESPACE(); 


                }
                break;

        }

    }


    protected DFA7 dfa7 = new DFA7(this);
    static final String DFA7_eotS =
        "\6\uffff\2\20\2\uffff\1\20\3\uffff\2\20\2\uffff\7\20\1\33\1\20\1"+
        "\uffff\1\35\1\uffff";
    static final String DFA7_eofS =
        "\36\uffff";
    static final String DFA7_minS =
        "\1\11\5\uffff\2\56\2\uffff\1\56\3\uffff\2\56\2\uffff\11\56\1\uffff"+
        "\1\56\1\uffff";
    static final String DFA7_maxS =
        "\1\175\5\uffff\2\172\2\uffff\1\172\3\uffff\2\172\2\uffff\11\172"+
        "\1\uffff\1\172\1\uffff";
    static final String DFA7_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\2\uffff\1\10\1\11\1\uffff\1\14\1\15"+
        "\1\16\2\uffff\1\12\1\13\11\uffff\1\6\1\uffff\1\7";
    static final String DFA7_specialS =
        "\36\uffff}>";
    static final String[] DFA7_transitionS = {
            "\2\15\1\uffff\2\15\22\uffff\1\15\1\uffff\1\14\5\uffff\1\1\1"+
            "\2\6\uffff\12\13\1\uffff\1\3\1\4\1\uffff\1\5\2\uffff\32\12\6"+
            "\uffff\10\12\1\6\2\12\1\7\16\12\1\10\1\uffff\1\11",
            "",
            "",
            "",
            "",
            "",
            "\1\21\1\uffff\12\17\7\uffff\32\17\6\uffff\14\17\1\16\15\17",
            "\1\21\1\uffff\12\17\7\uffff\32\17\6\uffff\16\17\1\22\13\17",
            "",
            "",
            "\1\21\1\uffff\12\17\7\uffff\32\17\6\uffff\32\17",
            "",
            "",
            "",
            "\1\21\1\uffff\12\17\7\uffff\32\17\6\uffff\17\17\1\23\12\17",
            "\1\21\1\uffff\12\17\7\uffff\32\17\6\uffff\32\17",
            "",
            "",
            "\1\21\1\uffff\12\17\7\uffff\32\17\6\uffff\6\17\1\24\23\17",
            "\1\21\1\uffff\12\17\7\uffff\32\17\6\uffff\16\17\1\25\13\17",
            "\1\21\1\uffff\12\17\7\uffff\32\17\6\uffff\6\17\1\26\23\17",
            "\1\21\1\uffff\12\17\7\uffff\32\17\6\uffff\21\17\1\27\10\17",
            "\1\21\1\uffff\12\17\7\uffff\32\17\6\uffff\10\17\1\30\21\17",
            "\1\21\1\uffff\12\17\7\uffff\32\17\6\uffff\23\17\1\31\6\17",
            "\1\21\1\uffff\12\17\7\uffff\32\17\6\uffff\15\17\1\32\14\17",
            "\1\21\1\uffff\12\17\7\uffff\32\17\6\uffff\32\17",
            "\1\21\1\uffff\12\17\7\uffff\32\17\6\uffff\6\17\1\34\23\17",
            "",
            "\1\21\1\uffff\12\17\7\uffff\32\17\6\uffff\32\17",
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
            return "1:1: Tokens : ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | IDENTIFIER | CLASSNAME | NUMBER | QUOTEDLITERAL | WHITESPACE );";
        }
    }
 

}