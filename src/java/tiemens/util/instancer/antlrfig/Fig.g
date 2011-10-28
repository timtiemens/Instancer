grammar Fig;
/*
   Based on: http://www.antlr.org/wiki/display/ANTLR3/Fig+-+Generic+configuration+language+interpreter
 */
 
@lexer::header 
{
    package tiemens.util.instancer.antlrfig; 
}
@parser::header 
{
    package tiemens.util.instancer.antlrfig;
 
    import java.util.Map;
    import java.util.HashMap;
    import java.util.ArrayList;
}

@parser::members 
{
    Map instances = new HashMap();
}

file returns [List objects]
    :   {$objects = new ArrayList();}
        (object {$objects.add($object.o);})+
    ;

object returns [Object o]
    :   qid v=ID?
        {
        $o = RunFig.newInstance($qid.text);
        if ( $v!=null ) {
            instances.put($v.text, $o);
        }
        }
        '{' assign[$o]* '}'
    ;
    
assign[Object o]
    :   ID '=' expr ';' {RunFig.setObjectProperty(o,$ID.text,$expr.value);}
    ;
    
expr returns [Object value]
    :   STRING    {$value = $STRING.text;}
    |   INT       {$value = Integer.valueOf($INT.text);}
    |   '$' ID    {$value = instances.get($ID.text);}
    |   '[' ']'   {$value = new ArrayList();}
    |   {ArrayList elements = new ArrayList();}
        '[' e=expr {elements.add($e.value);}
            (',' e=expr {elements.add($e.value);})*
        ']'
        {$value = elements;}
    ;
    
qid :   ID ('.' ID)* ('$' ID)?
    ;

STRING : '"' .* '"' {setText(getText().substring(1, getText().length()-1));} ;
INT :   '0'..'9'+ ;
ID  :   ('_'|'a'..'z'|'A'..'Z') ('_'|'a'..'z'|'A'..'Z'|'0'..'9')* ;
WS  :   (' '|'\n'|'\t')+ {$channel=HIDDEN;} ;
CMT :   '/*' .* '*/'     {$channel=HIDDEN;} ;
