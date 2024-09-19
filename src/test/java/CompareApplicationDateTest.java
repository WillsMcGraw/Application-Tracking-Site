import junit.framework.*;

public class CompareApplicationDateTest 
    extends TestCase
{
    // Fields
    private CompareApplicationDate comp;
    private Application app1;
    private Application app2;
    private Application app3;

    // Constructors

    // Methods
    /**
     * A set up method to be called before each test method.
     */
    public void setUp()
    {
        comp = new CompareApplicationDate();
        Date date1 = new Date(2024, 9, 19);
        Date date2 = new Date(2024, 10, 19);
        app1 = new Application(
            "Company 1", 
            "Fake Link", 
            "Job 1", 
            false, 
            date1, 
            null
        );
        app2 = new Application(
            "Company 2", 
            "Fake Link", 
            "Job 2", 
            false, 
            date2, 
            null
        );
        app3 = new Application(
            "Company 1", 
            "Fake Link", 
            "Job 1", 
            false, 
            date1, 
            null
        );
    }

    /**
     * 
     */
    public void testCompare()
    {
        assertTrue(0 < comp.compare(app1, app2));
        assertTrue(0 > comp.compare(app2, app1));
        assertTrue(0 == comp.compare(app1, app3));
    }
}
