

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class GranjaTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class GranjaTest
{
    private Granja granja1;
    private Vaca vaca1;
    private Cerdo cerdo1;
    private Pollo pollo1;
    private Pato pato1;

    /**
     * Default constructor for test class GranjaTest
     */
    public GranjaTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        granja1 = new Granja();
        vaca1 = new Vaca();
        cerdo1 = new Cerdo();
        pollo1 = new Pollo();
        pato1 = new Pato();
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
}
