package tiemens.util.instancer.antlrfig;

import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.ANTLRFileStream;

import java.lang.reflect.Method;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.List;


public class RunFig {

    public static void main(String args[]) throws Exception {
        FigLexer lex = new FigLexer(new ANTLRFileStream(args[0]));
        CommonTokenStream tokens = new CommonTokenStream(lex);

        FigParser g = new FigParser(tokens);
        try {
            // begin parsing and get list of config'd objects
            List config_objects = g.file();
            for ( Object o : config_objects ) {
                System.out.println(o);
            }
        } catch (RecognitionException e) {
            e.printStackTrace();
        }
    }

    public static void setObjectProperty(Object o, String propertyName, Object value) {
        if (o == null)
        {
            System.err.println("Error.setObjectProperty, null obj, propertyName='" +
                               propertyName + "' value='" + value + "'");
        }
        Class c = o.getClass();

        // First see if name is a property ala javabeans
        String methodSuffix = Character.toUpperCase(propertyName.charAt(0))+
            propertyName.substring(1,propertyName.length());
        Method m = getMethod(c,"set"+methodSuffix, new Class[] {value.getClass()});
        if ( m != null ) {
            try {
                invokeMethod(m, o, value);
            }
            catch (Exception e) {
                System.err.println("Can't set property "+propertyName+" using method set"+methodSuffix+
                    " from "+c.getName()+" instance: "+e);
            }
        }
        else {
            // try for a visible field
            try {
                Field f = c.getField(propertyName);
                try {
                    f.set(o, value);
                }
                catch (IllegalAccessException iae) {
                    System.err.println("Can't access property "+propertyName+" using direct field access from "+
                            c.getName()+" instance: "+ iae);
                }
            }
            catch (NoSuchFieldException nsfe) {
                System.err.println("Class "+c.getName()+" has no such property/field: "+propertyName+
                    ": "+nsfe);
            }
        }
    }

    protected static Object newInstance(String name) {
        Object o = null;
        try {
            o = Class.forName(name).newInstance();
            System.err.println("newInstance(" + name + ") returning " + o);
        }
        catch (Exception e) {
            System.err.println("can't make instance of "+name);
        }
        return o;
    }

    protected static Method getMethod(Class c, String methodName, Class[] args) {
        Method m;
        try {
            m = c.getMethod(methodName, args);
        }
        catch (NoSuchMethodException nsme) {
            m = null;
        }
        return m;
    }

    protected static Object invokeMethod(Method m, Object o)
        throws IllegalAccessException, InvocationTargetException
    {
        return invokeMethod(m, o, null);
    }

    protected static Object invokeMethod(Method m, Object o, Object value)
        throws IllegalAccessException, InvocationTargetException
    {
        Object[] args = null;
        if ( value!=null ) {
            args = new Object[] {value};
        }
        value = m.invoke(o, args);
        return value;
    }
}
