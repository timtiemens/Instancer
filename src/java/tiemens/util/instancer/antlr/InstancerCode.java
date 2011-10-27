/*========================================================================
 * InstancerCode.java
 * 2011 Oct 31 11:05:47 PM | ttiemens
 * Copyright (c) 2011 Tim Tiemens
 *========================================================================
 * This file is part of Instancer.
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
package tiemens.util.instancer.antlr;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

import org.apache.commons.lang3.StringEscapeUtils;

public class InstancerCode
{
    // ==================================================
    // class static data
    // ==================================================
    private Logger logger = Logger.getLogger(InstancerCode.class.getName());
    
    // ==================================================
    // class static methods
    // ==================================================

    // ==================================================
    // instance data
    // ==================================================
    /**
     * Maps a short name (e.g. "Date") to the FQN (e.g. "java.util.Date")
     */
    private Map<String, String> importMap = new HashMap<String, String>();
    
    // ==================================================
    // factories
    // ==================================================

    // ==================================================
    // constructors
    // ==================================================

    // ==================================================
    // public methods
    // ==================================================

    public void addImport(final String fullyQualifiedName)
    {
        logger.fine("I see import of '" + fullyQualifiedName + "'");
        String[] pieces = fullyQualifiedName.split("\\.");
        logger.fine("#pieces = " + pieces.length);
        final String key = pieces[pieces.length - 1];
        logger.fine("Import '" + key + "' to '" + fullyQualifiedName + "'");
        importMap.put(key, fullyQualifiedName);
    }
    
    public void configureLogging(final String loggingConfigureString)
    {
        logger.info("I see logging of '" + loggingConfigureString + "'" +
                    " this is not yet implemented.");
    }
    
    public String unescape(final String input)
    {
        String ret = StringEscapeUtils.unescapeJava(input);
        
        return ret;
    }

    public Object create(final String command,
                         final String clzname,
                         final List<Object> arglist)
    {
        Object ret;
        ret = new String("**ERROR** InstancerCode[cmd='" + command + 
                         "' clzname='" + clzname + 
                         "' arg='" + arglist + "']");

        logger.fine("clzname='" + clzname + "'");
        logger.fine("arglist.class=");
        if (arglist != null)
        {
            // Note: this should always pring "java.util.ArrayList"
            logger.fine(arglist.getClass().getName());
        }
        else
        {
            logger.fine("null");
            logger.severe("somehow got null for arglist");
        }
        logger.fine("arglist=" + arglist);
        if (arglist.size() > 0)
        {
            for (int i = 0, n = arglist.size(); i < n; i++)
            {
                logger.fine("arglist[" + i + "].class=" + arglist.get(i).getClass().getName());
                logger.fine("arglist[" + i + "]='" + arglist.get(i).toString() + "'");
            }
        }

        if ("new".equals(command))
        {
            ret =  createNew(clzname, arglist);
        }
        else if ("list".equals(command))
        {
            ret = createList(clzname, arglist);
        }
        
        return ret;
    }

    
    // ==================================================
    // non public methods
    // ==================================================

    private Object createNew(String clzname, 
                             List<Object> arglist) 
    {
        Object ret = null;
        try 
        {
            Class<?> c                = getClassForName(clzname);
            Object[] parameters       = getParametersFromArgObj(arglist);
            Class<?>[] parameterTypes = getParameterTypesFromArgObj(parameters, arglist);
            
            
            Constructor<?> cons = getConstructor(c, parameterTypes);
            ret = cons.newInstance(parameters);
        } 
        catch (ClassNotFoundException e) 
        {
            logger.severe("Could not find class '" + clzname + "'");
            ret = null;
        }
        catch (SecurityException e) 
        {
            logger.severe("SecurityException on constructor for class '" + clzname + "'");
            ret = null;
        } 
        catch (NoSuchMethodException e) 
        {
            logger.severe("Could not find constructor for class '" + clzname + "'");
            ret = null;
        } catch (IllegalArgumentException e) 
        {
            logger.severe("Coulnd not invoke newInstance, IllegalArgument: " + e);
            ret = null;
        } catch (InstantiationException e) 
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        catch (IllegalAccessException e) 
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } 
        catch (InvocationTargetException e) 
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        return ret;
    }

    
    private Object createList(String clzname, 
                              List<Object> argobj) 
    {
        // set 'addto' to contain the elements we want in the list
        Object[] addto = null;
        
        if (argobj != null)
        {
//            if (argobj.getClass().isArray())
//            {
//                addto = (Object[]) argobj;
//            }
//            else 
//            {
                addto = argobj.toArray(new Object[0]);
//            }
        }
        
        
        Object container = createNew(clzname, null);
        if (container instanceof java.util.List)
        {
            List<Object> list = unsafe(container);
            
            for (Object a : addto)
            {
                logger.fine("ADDING TO LIST: " + a);
                list.add(a);
            }
        }
        else
        {
            logger.fine("NO IDEA HOW TO ADD to " +
                               container.getClass().getName());
        }
        return container;
    }

    @SuppressWarnings("unchecked")
    private List<Object> unsafe(final Object tolist)
    {
        return (List<Object>) tolist;
    }

    private Class<?> getClassForName(String clzname) 
        throws ClassNotFoundException
    {
        String usename = clzname;
        if (importMap.containsKey(usename))
        {
            usename = importMap.get(usename);
        }
        try
        {
            return Class.forName(usename);
        }
        catch (ClassNotFoundException e)
        {
            logger.severe("Failed to find class '" + usename + "' [from '" +
                          clzname + "']");
            throw e;
        }
    }

    private Constructor<?> getConstructor(Class<?> dclz,
            Class<?>[] parameterTypes)
                    throws NoSuchMethodException
    {
        // old, original: return getConstructorByFind(dclz, parameterTypes);

        return getConstructorBySelecting(dclz, parameterTypes);
    }
    
    /**
     * Loop through the constructors, find the best possible. 
     */
    private Constructor<?> getConstructorBySelecting(Class<?> dclz,
                                                     Class<?>[] parameterTypes)
        throws NoSuchMethodException
    {
        Constructor<?> ret = null;
        for (Constructor<?> candidate : dclz.getConstructors())
        {
            Class<?>[] types = candidate.getParameterTypes();
            boolean success = false;
            logger.fine(".Checking constructor for " +
                    dclz.getName() +
                    " [types=" + types + "]" +
                    " : " + 
                    Arrays.toString(types));
            if ((types == null) || (types.length == 0))
            {
                logger.fine("--Special case void");
                if ((parameterTypes == null) || (parameterTypes.length == 0))
                {
                    success = true;
                }
            }
            else if (parameterTypes == null)
            {
                success = false;
            }
            else  if (types.length == parameterTypes.length)
            {
                success = true;
                
                for (int i = 0, n = types.length; i < n; i++)
                {
                    if (! correctIsAssignableFrom(types[i], parameterTypes[i]))
                    {
                        success = false;
                    }
                }
            }
            if (success)
            {
                logger.fine("..success");
                ret = candidate;
                break;
            }
            else
            {
                logger.fine("..failed");
            }
        }
        return ret;
    }
    
    /**
     * For constructors, need a better "isAssignableFrom".
     * That method says 'false' for [[Long is not assignable to long]].
     * We need it so say 'true'
     * @param tothis
     * @param fromthis
     * @return
     */
    public static boolean correctIsAssignableFrom(Class<?> tothis,
                                                  Class<?> fromthis)
    {
        if (tothis.isAssignableFrom(fromthis))
        {
            return true;
        }
        
        if (tothis.isPrimitive()) 
        {
            Class<?> parameterWrapperClazz = getPrimitiveWrapper(tothis);
            if (parameterWrapperClazz != null) 
            {
                return parameterWrapperClazz.equals(fromthis);
            }
        }

        return false;
    }
   
    public static Class<?> getPrimitiveWrapper(Class<?> primitiveType) 
    {
        if (boolean.class.equals(primitiveType)) 
        {
            return Boolean.class;
        }
        else if (byte.class.equals(primitiveType)) 
        {
            return Byte.class;
        }
        else if (char.class.equals(primitiveType)) 
        {
            return Character.class;
        }
        else if (double.class.equals(primitiveType)) 
        {
            return Double.class;
        }
        else if (float.class.equals(primitiveType)) 
        {
            return Float.class;
        }
        else if (int.class.equals(primitiveType)) 
        {
            return Integer.class;
        }
        else if (long.class.equals(primitiveType)) 
        {
            return Long.class;
        }
        else if (short.class.equals(primitiveType)) 
        {
            return Short.class;
        }
        else 
        {
            return null;
        }
    }
    
    private Constructor<?> getConstructorByFind(Class<?> dclz,
                                                Class<?>[] parameterTypes)
        throws NoSuchMethodException
    {
        Constructor<?> ret = null;
        try
        {
            ret = dclz.getConstructor(parameterTypes);
        } 
        catch (SecurityException e) 
        {
            throw e;
        }
        catch (NoSuchMethodException e) 
        {
            //
            // try to correct java.lang.Long into java.lang.Type.long
            //  i.e. Long to long
            //
            for (int i = 0, n = parameterTypes.length; i < n; i++)
            {
                Class<?> c = parameterTypes[i];
                if (c.equals(Long.class))
                {
                    c = java.lang.Long.TYPE;
                }
                else if (c.equals(Integer.class))
                {
                    c = java.lang.Integer.TYPE;
                }
                else if (c.equals(Double.class))
                {
                    c = java.lang.Double.TYPE;
                }
                else if (c.equals(java.lang.Float.class))
                {
                    c = java.lang.Float.TYPE;
                }
                parameterTypes[i] = c;
            }
            
            ret = dclz.getConstructor(parameterTypes);
        }
        finally
        {
            
        }
        return ret;
    }

    private Object[] getParametersFromArgObj(List<Object> arglist) 
    {
        if ((arglist == null) || 
            (arglist.size() == 0))
        {
            return null;
        }
        else
        {
            List<Object> ret = new ArrayList<Object>();
        
            // BIG TODO
//            if (argobj instanceof Array)
//            {
//                
//            }
//            else
//            {
                ret.addAll(arglist);
//            }
            return ret.toArray(new Object[0]);
        }
    }

    private Class<?>[] getParameterTypesFromArgObj(Object[] parameters,
                                                   List<Object> arglist) 
    {   
        if ((arglist == null) ||
            (arglist.size() == 0))
        {
            return null;
        }
        else
        {
            List<Class<?>> ret = new ArrayList<Class<?>>();
            for (Object p : parameters)
            {
                if (p != null)
                {
                    ret.add(p.getClass());
                }
                else
                {
                    ret.add(Void.TYPE);
                }
            }
            return ret.toArray(new Class[0]);
        }
    }
}
