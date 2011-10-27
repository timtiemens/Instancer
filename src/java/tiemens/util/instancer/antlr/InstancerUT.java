/*========================================================================
 * InstancerUT.java
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

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FilenameFilter;
import java.io.InputStream;
import java.io.StringReader;
import java.util.List;

import junit.framework.Assert;
import junit.framework.TestCase;

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.ANTLRReaderStream;
import org.antlr.runtime.RecognitionException;

public class InstancerUT
        extends TestCase
{
    public void testDoubleQuotes()
    {
        runOn("<new java.lang.String(\"1234567899\")>");
    }
    public void testList()
    {
        List<Object> ret = runOn("<list java.util.ArrayList(" +
                                    "<new java.lang.Long(\"132456789012\")>" +
                                    "<new java.util.Date " +
                                        "(<new java.lang.Long(\"132456789012\")> )>" +
                                     ")" +
                                     ">");
        Assert.assertEquals("size mismatch", 1, ret.size());
        Assert.assertEquals("type wrong", "java.util.ArrayList", ret.get(0).getClass().getName());
        java.util.ArrayList arraylist = (java.util.ArrayList) ret.get(0);
        Assert.assertEquals("inner size mismatch", 2, arraylist.size());
        Assert.assertEquals("[0] class wrong", "java.lang.Long", arraylist.get(0).getClass().getName());
        Assert.assertEquals("[1] class wrong", "java.util.Date", arraylist.get(1).getClass().getName());        
    }
    public void testAllInputFiles()
    {
        for (File f :  getInputFiles())
        {
            System.out.println("========== f is " + f);
            runOn(new String[] { f.toString() });
        }
    }
    private File[] getInputFiles() 
    {
        File dir = new File("src/test");
        File[] names = dir.listFiles((new FilenameFilter()
        {
            @Override
            public boolean accept(File dir, String name) 
            {
                if (name.startsWith("t-"))
                {
                    return true;
                }
                return false;
            }
        }));
        
        return names;
    }
   
    public void testSomeFails()
    {
        //runOnFails("(new fails 1 2 3)");
    }
    
    private void runOnFails(String s)
    {
        runOn(s);
    }
    
    private List<Object> runOn(String s)
    {
        return runOn(new String[] { s });
    }
    
    private List<Object> runOn(String[] input)
    {
        InstancerParser test;

        try 
        {
            test = InstancerParser.create(input);
            
            List<Object> thelist = test.top();

            Object zero = thelist.get(0);
            Assert.assertNotNull(zero);
            System.out.println("Test result=" + zero);
            
            return thelist;
        } 
        catch (RecognitionException e)  
        {
            e.printStackTrace();
            Assert.fail("Threw exception");
        }
        catch (Exception e)
        {
            Assert.fail("Did not parse, e=" + e);
        }
        return null;
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
               StringReader sr = new StringReader(arg);
               input = new ANTLRReaderStream(sr);
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
        
    public static ANTLRInputStream getInputStream(String[] args) throws Exception
    {
        ANTLRInputStream input = null;
        if (args.length > 0)
        {
            String arg = args[0];
            if (arg.indexOf(" ") >= 0)
            {
               System.out.println("STRING is " + arg);
               InputStream is = new ByteArrayInputStream(arg.getBytes("UTF-8"));
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
