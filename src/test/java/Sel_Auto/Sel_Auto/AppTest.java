package Sel_Auto.Sel_Auto;

import static org.testng.Assert.assertTrue;

import com.beust.testng.TestNG;


/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestNG
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( );
    }

    /**
     * @return the suite of tests being tested
     */
    public static TestNG suite()
    {
        return new TestNG( );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
}
