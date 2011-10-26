// $ANTLR 3.4 Resource.g 2011-10-26 12:44:18

 package tiemens.util.instancer.antlrlearn; 


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class ResourceLexer extends Lexer {
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

        List<RecognitionException> exceptions = new ArrayList<RecognitionException>();

        public List<RecognitionException> getExceptions() 
        {
            return exceptions;
        }

        @Override
        public void reportError(RecognitionException e) 
        {
            super.reportError(e);
            exceptions.add(e);
        }


    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public ResourceLexer() {} 
    public ResourceLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public ResourceLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "Resource.g"; }

    // $ANTLR start "T__9"
    public final void mT__9() throws RecognitionException {
        try {
            int _type = T__9;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Resource.g:21:6: ( '\"' )
            // Resource.g:21:8: '\"'
            {
            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__9"

    // $ANTLR start "T__10"
    public final void mT__10() throws RecognitionException {
        try {
            int _type = T__10;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Resource.g:22:7: ( '(' )
            // Resource.g:22:9: '('
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
    // $ANTLR end "T__10"

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Resource.g:23:7: ( ')' )
            // Resource.g:23:9: ')'
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
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Resource.g:24:7: ( '.' )
            // Resource.g:24:9: '.'
            {
            match('.'); 

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
            // Resource.g:25:7: ( '\\'' )
            // Resource.g:25:9: '\\''
            {
            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "COMMAND"
    public final void mCOMMAND() throws RecognitionException {
        String value = null;


        try {
            int _type = COMMAND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            CommonToken c=null;

            // Resource.g:109:5: (c= 'new' )
            // Resource.g:109:8: c= 'new'
            {
            int cStart = getCharIndex();
            match("new"); 
            int cStartLine75 = getLine();
            int cStartCharPos75 = getCharPositionInLine();
            c = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, cStart, getCharIndex()-1);
            c.setLine(cStartLine75);
            c.setCharPositionInLine(cStartCharPos75);


            value = c.getText();

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMMAND"

    // $ANTLR start "IDENTIFIER"
    public final void mIDENTIFIER() throws RecognitionException {
        try {
            int _type = IDENTIFIER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Resource.g:123:6: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )+ )
            // Resource.g:123:8: ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )+
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // Resource.g:123:28: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // Resource.g:
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
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
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

    // $ANTLR start "NUMBER"
    public final void mNUMBER() throws RecognitionException {
        try {
            int _type = NUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Resource.g:144:3: ( ( '0' .. '9' )+ )
            // Resource.g:144:6: ( '0' .. '9' )+
            {
            // Resource.g:144:6: ( '0' .. '9' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // Resource.g:
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
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
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

    // $ANTLR start "SPACE"
    public final void mSPACE() throws RecognitionException {
        try {
            int _type = SPACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Resource.g:158:3: ( ( ' ' | '\\t' ) )
            // Resource.g:158:6: ( ' ' | '\\t' )
            {
            if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            _channel = HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SPACE"

    // $ANTLR start "NEWLINE"
    public final void mNEWLINE() throws RecognitionException {
        try {
            int _type = NEWLINE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Resource.g:164:3: ( ( '\\r' )? '\\n' | '\\r' )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='\r') ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1=='\n') ) {
                    alt4=1;
                }
                else {
                    alt4=2;
                }
            }
            else if ( (LA4_0=='\n') ) {
                alt4=1;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }
            switch (alt4) {
                case 1 :
                    // Resource.g:164:6: ( '\\r' )? '\\n'
                    {
                    // Resource.g:164:6: ( '\\r' )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0=='\r') ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // Resource.g:164:6: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }


                    match('\n'); 

                    }
                    break;
                case 2 :
                    // Resource.g:165:6: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NEWLINE"

    public void mTokens() throws RecognitionException {
        // Resource.g:1:8: ( T__9 | T__10 | T__11 | T__12 | T__13 | COMMAND | IDENTIFIER | NUMBER | SPACE | NEWLINE )
        int alt5=10;
        switch ( input.LA(1) ) {
        case '\"':
            {
            alt5=1;
            }
            break;
        case '(':
            {
            alt5=2;
            }
            break;
        case ')':
            {
            alt5=3;
            }
            break;
        case '.':
            {
            alt5=4;
            }
            break;
        case '\'':
            {
            alt5=5;
            }
            break;
        case 'n':
            {
            int LA5_6 = input.LA(2);

            if ( (LA5_6=='e') ) {
                int LA5_11 = input.LA(3);

                if ( (LA5_11=='w') ) {
                    int LA5_12 = input.LA(4);

                    if ( ((LA5_12 >= '0' && LA5_12 <= '9')||(LA5_12 >= 'A' && LA5_12 <= 'Z')||(LA5_12 >= 'a' && LA5_12 <= 'z')) ) {
                        alt5=7;
                    }
                    else {
                        alt5=6;
                    }
                }
                else {
                    alt5=7;
                }
            }
            else if ( ((LA5_6 >= '0' && LA5_6 <= '9')||(LA5_6 >= 'A' && LA5_6 <= 'Z')||(LA5_6 >= 'a' && LA5_6 <= 'd')||(LA5_6 >= 'f' && LA5_6 <= 'z')) ) {
                alt5=7;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 6, input);

                throw nvae;

            }
            }
            break;
        case 'A':
        case 'B':
        case 'C':
        case 'D':
        case 'E':
        case 'F':
        case 'G':
        case 'H':
        case 'I':
        case 'J':
        case 'K':
        case 'L':
        case 'M':
        case 'N':
        case 'O':
        case 'P':
        case 'Q':
        case 'R':
        case 'S':
        case 'T':
        case 'U':
        case 'V':
        case 'W':
        case 'X':
        case 'Y':
        case 'Z':
        case 'a':
        case 'b':
        case 'c':
        case 'd':
        case 'e':
        case 'f':
        case 'g':
        case 'h':
        case 'i':
        case 'j':
        case 'k':
        case 'l':
        case 'm':
        case 'o':
        case 'p':
        case 'q':
        case 'r':
        case 's':
        case 't':
        case 'u':
        case 'v':
        case 'w':
        case 'x':
        case 'y':
        case 'z':
            {
            alt5=7;
            }
            break;
        case '0':
        case '1':
        case '2':
        case '3':
        case '4':
        case '5':
        case '6':
        case '7':
        case '8':
        case '9':
            {
            alt5=8;
            }
            break;
        case '\t':
        case ' ':
            {
            alt5=9;
            }
            break;
        case '\n':
        case '\r':
            {
            alt5=10;
            }
            break;
        default:
            NoViableAltException nvae =
                new NoViableAltException("", 5, 0, input);

            throw nvae;

        }

        switch (alt5) {
            case 1 :
                // Resource.g:1:10: T__9
                {
                mT__9(); 


                }
                break;
            case 2 :
                // Resource.g:1:15: T__10
                {
                mT__10(); 


                }
                break;
            case 3 :
                // Resource.g:1:21: T__11
                {
                mT__11(); 


                }
                break;
            case 4 :
                // Resource.g:1:27: T__12
                {
                mT__12(); 


                }
                break;
            case 5 :
                // Resource.g:1:33: T__13
                {
                mT__13(); 


                }
                break;
            case 6 :
                // Resource.g:1:39: COMMAND
                {
                mCOMMAND(); 


                }
                break;
            case 7 :
                // Resource.g:1:47: IDENTIFIER
                {
                mIDENTIFIER(); 


                }
                break;
            case 8 :
                // Resource.g:1:58: NUMBER
                {
                mNUMBER(); 


                }
                break;
            case 9 :
                // Resource.g:1:65: SPACE
                {
                mSPACE(); 


                }
                break;
            case 10 :
                // Resource.g:1:71: NEWLINE
                {
                mNEWLINE(); 


                }
                break;

        }

    }


 

}