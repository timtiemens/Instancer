grammar Resource;

/* http://jnb.ociweb.com/jnb/jnbJun2008.html */

@parser::header {  
 package tiemens.util.instancer.antlrlearn;
 
 import java.util.HashMap; 
 import java.util.List; 
 import java.util.ArrayList; 
 import java.io.InputStream;
 import java.io.StringBufferInputStream;
 import java.io.FileInputStream;
}
@lexer::header {
 package tiemens.util.instancer.antlrlearn; 
}

@lexer::members 
{
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
}


@members {
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
    
}


prog
    :  instance+ ;
                
instance returns [List<Object> instances]
    :   '(' c=command name=classname  l=line ')'    
                         {System.out.println("command-is " + $c.value + 
                                             " classname=[" + $name.value + "]");
                          System.out.println("list.size=" + $l.row.size());
                          System.out.println(l);
                          Object a = new String("ab"); 
                          /* $instances.add(a);} )+ */ 
                         }
    ;

command returns [String value]
    :  c=COMMAND  {$value = $c.getText();}
    ;

/* The Upper first letter turns it into a lexer item */
COMMAND returns [String value]
    :  c='new'    {$value = $c.getText();} 
    ;
    
 
classname returns [String value]
    : '"'  c=identdotident '"'     {$value = $c.value;}
    | '\'' c=identdotident '\''    {$value = $c.value;}
    ;

identdotident returns [String value]  
     : c=IDENTIFIER ('.' IDENTIFIER)* {$value = $c.getText(); }
     ;
     
IDENTIFIER
     : ('a'..'z'|'A'..'Z') ('a'..'z'|'A'..'Z'|'0'..'9')+ 
     ;

    
 argslist returns [Object value]
    : 
    ;
    
    
  /* Hard lesson #1 : Things that aren't used but REFERENCE things still
      cause errors 
errorline : (NUMBER) +       
      */
      
  /* Hard lesson #2 :  [Start-With-Upper = LEX  start-With-Lower = PARSE] */
numberRetValue returns [Integer value]
  : (v=NUMBER {$value = new Integer(v.getText()); })
  ;


NUMBER
  :  ('0'..'9')+
  ;
  
  

line returns [List<Integer> row]
@init {  $row = new ArrayList<Integer>();   }
  :  ( a=numberRetValue {$row.add($a.value);} )+ 
  ;
  
    


SPACE
  :  (' ' | '\t') {$channel = HIDDEN;}
  ;
  
/* WS         :   (' '|'\t')+     {skip();} ; */

NEWLINE
  :  '\r'? '\n'
  |  '\r'
  ;
  

/*
ID         :   ('a'..'z'|'A'..'Z')+ ;
*/


