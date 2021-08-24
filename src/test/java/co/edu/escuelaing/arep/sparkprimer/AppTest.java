package co.edu.escuelaing.arep.sparkprimer;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import java.net.*;  
import java.io.*;  
/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );

         
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
        String output  = getUrlContents("https://sparkwebapparep.herokuapp.com/facadealpha?symbol=IBM&time=TIME_SERIES_WEEKLY");  
        System.out.println(output); 
    }

    private static String getUrlContents(String theUrl)  
    {  
        StringBuilder content = new StringBuilder();  
    // Use try and catch to avoid the exceptions  
        try  
        {  
        URL url = new URL(theUrl); // creating a url object  
        URLConnection urlConnection = url.openConnection(); // creating a urlconnection object  
    
        // wrapping the urlconnection in a bufferedreader  
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));  
        String line;  
        // reading from the urlconnection using the bufferedreader  
        while ((line = bufferedReader.readLine()) != null)  
        {  
            content.append(line + "\n");  
        }  
        bufferedReader.close();  
        }  
        catch(Exception e)  
        {  
        e.printStackTrace();  
        }  
        return content.toString();  
    }  
}
