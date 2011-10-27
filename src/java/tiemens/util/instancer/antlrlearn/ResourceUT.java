package tiemens.util.instancer.antlrlearn;

import junit.framework.Assert;
import junit.framework.TestCase;

public class ResourceUT
        extends TestCase
{
    public void testDoubleQuotes()
    {
        runOn("(new 'java.util.Date' 1 2 3)");
        runOn("(new \"java.util.Date\" 15 233 3322)");

    }
    public void testSomeFails()
    {
        //runOnFails("(new fails 1 2 3)");
    }
    
    private void runOnFails(String s)
    {
        runOn(s);
    }
    private void runOn(String s)
    {
        String[] input = new String[] { s };

        try
        {
            ResourceParser.main(input);
        }
        catch (Exception e)
        {
            Assert.fail("Did not parse, e=" + e);
        }

    }
}
