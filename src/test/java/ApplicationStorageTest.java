import junit.framework.*;

public class ApplicationStorageTest
    extends TestCase
{
    // Fields
    private ApplicationStorage applicationList;
    private Application[] sortedList;

    // Constructors

    // Methods
    /**
     * A method to be called before each test method.
     */
    public void setUp()
    {
        applicationList = new ApplicationStorage(5);
        Application app1 = new Application("Company 1", "Fake Link", 
            "Job 4", null, null, null);
        Application app2 = new Application("Company 2", "Fake Link", 
            "Job 3", null, null, null);
        Application app3 = new Application("Company 3", "Fake Link", 
            "Job 2", null, null, null);
        Application app4 = new Application("Company 4", "Fake Link", 
            "Job 1", null, null, null);
        applicationList.record(app3);
        applicationList.record(app1);
        applicationList.record(app4);
        applicationList.record(app2);
        applicationList.record(app4);
        sortedList = new Application[5];
        sortedList[0] = app1;
        sortedList[1] = app2;
        sortedList[2] = app3;
        sortedList[3] = app4;
        sortedList[4] = app4;
    }

    /**
     * A test method for the record() method.
     */
    public void testRecord()
    {
        ApplicationStorage test = new ApplicationStorage(5);
        Application app1 = new Application("Company 1", "Fake Link", 
            "Job 1", null, null, null);
        Application app2 = new Application("Company 2", "Fake Link", 
            "Job 1", null, null, null);
        test.record(app1);
        test.record(app2);
        Application[] arr = test.getApplicationList();
        assertEquals(app1, arr[0]);
        assertEquals(app2, arr[1]);
    }

    /**
     * A test method for the sort() method.
     */
    public void testSort()
    {
        CompareCompanyName comp = new CompareCompanyName();
        applicationList.sort(comp);
        Application[] testSort = applicationList.getApplicationList();
        for (Application app : testSort)
        {
            System.out.println(app.getCompanyName());
        }
        for (int i = 0; i < testSort.length; i++)
        {
            assertEquals(sortedList[i], testSort[i]);
        }
    }
}