/*========================================================================
 * Instance.g
 * 2011 Oct 31 11:05:47 PM | ttiemens
 * Copyright (c) 2011 Tim Tiemens
 *========================================================================
 * This file is part of Instancer.
 * This is an antlr3 grammar file.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 *
 */

grammar Instancer;


@lexer::header 
{
   package tiemens.util.instancer.antlr; 
}
@lexer::members
{
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
}

/*
 *  if you use 'rulecatch', then you get Exceptions like:
 *       MismatchedTokenException(11!=14) at org.antlr.runtime...
 *  It is ok, just watch how you print the message and/or the stack trace.
 */
@parser::rulecatch
{
    catch (RecognitionException e) 
    {
        throw e;
    }
}


@parser::header 
{  
   package tiemens.util.instancer.antlr;
   
   import java.util.HashMap; 
   import java.util.List; 
   import java.util.ArrayList; 
   import java.io.InputStream;
   import java.io.StringReader;
   import java.io.FileReader; 
}



@parser::members 
{
    
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
}



/*------------------------------------------------------------------
 * PARSER RULES
 *------------------------------------------------------------------*/

top returns [List<Object> toplist]
        @init { $toplist = new java.util.ArrayList<Object>(); }
    : initStatements? c=topInner { toplist.add($c.value); }
    ;
    /* if you do this .. 
    catch [RecognitionException re] { reportError(re); }
     */
     
initStatements
    : '{' (initStatementChoice ';')* '}'
    ;

initStatementChoice
    : 'import'  clz=classname    { instancerCode.addImport($clz.value); }
    | 'logging' c=QUOTEDLITERAL  { instancerCode.configureLogging(c.getText()); } /* see NOTE-4 */
    ;  
   
topInner returns [Object value]
    : '(' cmd=command clz=classname args=arglist ')'   { $value = instancerCode.create($cmd.value, $clz.value, $args.list); }
    /* | c=QUOTEDLITERAL                               { $value = c.getText(); } */
    ;
    
command returns [String value] 
    : c=IDENTIFIER  { $value = $c.getText(); }
    ;

classname returns [String value]
    :  c=CLASSNAME  { $value = $c.getText(); } 
    |  c=IDENTIFIER { $value = $c.getText(); }   /* see NOTE-3 */
    ;

arglist returns [List<Object> list]
        @init {  $list = new ArrayList<Object>();   }
    :  
        (   ( c=QUOTEDLITERAL {$list.add(c.getText());  }  )
          | ( a=topInner      {$list.add($a.value);     }  )
        )*
       
    ;
  
     

/*------------------------------------------------------------------
 * LEXER RULES  [see Note-1]
 *------------------------------------------------------------------*/
   
IDENTIFIER 
   : ('A' .. 'Z' | 'a' .. 'z') ('A' .. 'Z' | 'a' .. 'z' | DIGIT )*
   ;
   
CLASSNAME
   : IDENTIFIER ( '.' IDENTIFIER )*
   ;
    
/*  {NUMBER is not used}   NUMBER  : (DIGIT)+ ; */


QUOTEDLITERAL
    :   '"' 
        (   ESCAPESEQUENCE
        |   ~( '\\' | '"' | '\r' | '\n' )        
        )* 
        '"'    { setText( getText().substring(1, getText().length() - 1) );
                 setText( instancerCode.unescape(getText()) );
               }
    ;


fragment ESCAPESEQUENCE
    :   '\\' (
                 'b' 
             |   't' 
             |   'n' 
             |   'f' 
             |   'r' 
             |   '\"' 
             |   '\'' 
             |   '\\' 
             |   ('0'..'3') ('0'..'7') ('0'..'7')
             |   ('0'..'7') ('0'..'7') 
             |   ('0'..'7')
             )          
    ;     



WHITESPACE : ( '\t' | ' ' | '\r' | '\n'| '\u000C' )+    { $channel = HIDDEN; } ;

COMMENT    : '/*' .* '*/'                               { $channel = HIDDEN; } ; /* see Note-5 */ 

fragment DIGIT  : '0'..'9' ;


           
 
/*    [See Note-2]
STRING
   : '"' ( options {greedy=false;}:  ~'"' )*  '"';   */
   /*   : '"' ( options {greedy=false;}:  ~'"'  | '""')*  '"' */
/*
   : ('A' .. 'Z' | 'a' .. 'z') ('A' .. 'Z' | 'a' .. 'z' | DIGIT | '!' .. ')' )*
   */
   


/* Reference URLs
     http://jnb.ociweb.com/jnb/jnbJun2008.html
     http://www.antlr.org/wiki/display/ANTLR3/Lexer+grammar+for+floating+point,+dot,+range,+time+specs
     http://www.antlr.org/wiki/display/ANTLR3/Migrating+from+ANTLR+2+to+ANTLR+3
     http://code.google.com/p/sfig/
 */
/* Note-1: IfItStartsWithUpper - it is a lexer rule
           ifItStartsWithLower - it is a parser rule
 */
/* Note-2: It turns out even if a rule isn't ''used'' it is still
           part of the global lexer space.
           So, having extra stuff is a bad idea..
 */
/* Note-3 - 
    started with just c=CLASSNAME. 
    then, when I tried input of << (new Date "12345") >>
       I got an error:     
          in.txt line 3:5 mismatched input 'Date' expecting CLASSNAME
    The tokens CLASSNAME and IDENTIFIER collide, so, of course,
       adding c=IDENTIFIER makes the error go away.
    Then, the "bare" Date matches IDENTIFIER.
 */
/* Note-4 -
     MODIFIED!! - now QUOTEDLITERAL does its own unescaping
     Previous note....
     Any use of  QUOTEDLITERAL must call
        instancerCode.unescape($c.getText()));
     Because of the nifty-cool "EscapeSequence" target that allows the escape
         character '\'.
     That way, embedded quotations (") can be escaped as \", yet still
         make it to the program as just ".
     
 */         
/* Note-5 -
     This rule was added very late in development.  
     So, independent from the other rules, this 1 line gave 
         the system the ability to parse out and ignore comment blocks.
 */
           