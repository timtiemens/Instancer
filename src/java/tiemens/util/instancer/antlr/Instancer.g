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
@lexer::header 
{
   package tiemens.util.instancer.antlr; 
}


@parser::members 
{
    private InstancerCode instancerCode = new InstancerCode();
    
    public static InstancerParser create(String[] args) throws Exception 
    {
        ANTLRReaderStream input = getReaderStream(args);
        InstancerLexer lexer = new InstancerLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        InstancerParser parser = new InstancerParser(tokens);
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
}

/*------------------------------------------------------------------
 * PARSER RULES
 *------------------------------------------------------------------*/

top returns [List<Object> toplist]
           @init { $toplist = new java.util.ArrayList<Object>(); }
    : initStatements? c=topInner { toplist.add($c.value); }
    ;
    
initStatements
    : '{' (initStatementChoice ';')* '}'
    ;

initStatementChoice
    : 'import'  clz=classname    { instancerCode.addImport($clz.value); }
    | 'logging' c=QUOTEDLITERAL  { instancerCode.configureLogging( 
                                        instancerCode.unescape($c.getText())); } /* see NOTE-4 */
    ;  
   
topInner returns [Object value]
    : '(' cmd=command clz=classname args=topInner? ')' { $value = instancerCode.create($cmd.value, $clz.value, $args.value); }
    | c=QUOTEDLITERAL                                  { $value = instancerCode.unescape(c.getText()); }
    ;
    
command returns [String value] 
    : c=IDENTIFIER { $value = $c.getText(); }
    ;

classname returns [String value]
    :  c=CLASSNAME  { $value = $c.getText(); } 
    |  c=IDENTIFIER { $value = $c.getText(); }   /* see NOTE-3 */
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
    
NUMBER  : (DIGIT)+ ;


QUOTEDLITERAL
    :   '"' 
        (   EscapeSequence
        |   ~( '\\' | '"' | '\r' | '\n' )        
        )* 
        '"'    { setText( getText().substring(1, getText().length() - 1)); }
    ;


fragment
EscapeSequence 
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

           
 
/*    [See Note-2]
STRING
   : '"' ( options {greedy=false;}:  ~'"' )*  '"';   */
   /*   : '"' ( options {greedy=false;}:  ~'"'  | '""')*  '"' */
/*
   : ('A' .. 'Z' | 'a' .. 'z') ('A' .. 'Z' | 'a' .. 'z' | DIGIT | '!' .. ')' )*
   */
   


WHITESPACE : ( '\t' | ' ' | '\r' | '\n'| '\u000C' )+    { $channel = HIDDEN; } ;

fragment DIGIT  : '0'..'9' ;


/* Reference URLs
     http://jnb.ociweb.com/jnb/jnbJun2008.html
     http://www.antlr.org/wiki/display/ANTLR3/Lexer+grammar+for+floating+point,+dot,+range,+time+specs 
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
     Any use of  QUOTEDLITERAL must call
        instancerCode.unescape($c.getText()));
     Because of the nifty-cool "EscapeSequence" target that allows the escape
         character '\'.
     That way, embedded quotations (") can be escaped as \", yet still
         make it to the program as just ".
  */         
