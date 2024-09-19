import junit.framework.*;

public class dateTest
    extends TestCase
{
    private Date test;
    /**
     * A set up method to be called before each test method.
     */
    public void setUp()
    {
        test = new Date(2024, 9, 19);
    }

    /**
     * A test method for the toString() method of Date objects
     */
    public void testToString()
    {
        String str = "9/19/2024";
        assertEquals(str, test.toString());
    }

    public void testEquals()
    {
        assertTrue(test.equals(test));
        assertFalse(test.equals(null));
        assertFalse(test.equals("9/19/2024"));
        Date wrongYear = new Date(2023, 9, 19);
        Date wrongMonth = new Date(2024, 10, 19);
        Date wrongDay = new Date(2024, 9, 20);
        Date correct = new Date(2024, 9, 19);
        assertFalse(test.equals(wrongYear));
        assertFalse(test.equals(wrongMonth));
        assertFalse(test.equals(wrongDay));
        assertTrue(test.equals(correct));
    }
}