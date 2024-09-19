import junit.framework.*;

public class TestDate
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

    public void testCompare()
    {
        Date earlyYear = new Date(2023, 9, 19);
        Date lateYear = new Date(2025, 9, 19);
        Date earlyMonth = new Date(2024, 8, 19);
        Date lateMonth = new Date(2024, 10, 19);
        Date earlyDay = new Date(2024, 9, 18);
        Date lateDay = new Date(2024, 9, 20);
        assertTrue(0 == test.compare(test));
        assertTrue(0 > test.compare(earlyYear));
        assertTrue(0 < test.compare(lateYear));
        assertTrue(0 > test.compare(earlyMonth));
        assertTrue(0 < test.compare(lateMonth));
        assertTrue(0 > test.compare(earlyDay));
        assertTrue(0 < test.compare(lateDay));
    }

    /**
     * A test method for the equals() method of Date objects
     */
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