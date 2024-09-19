import java.util.Comparator;

public class CompareApplicationDate 
    implements Comparator<Application>
{
    // Fields

    // Constructors

    // Methods
    /**
     * A method to compare the company name of two Application objects.
     * @param leftApplication
     *  The application used on the left side of the function call
     * @param rightApplication
     *  The application used on the right side of the function call
     * @return
     *  int, The integer representation of which application is lesser/greater than the
     *  other. Positive if left is comes before right, negative is right comes before
     *  left.
     */
    public int compare(Application leftApplication, Application rightApplication)
    {
        Date leftDate = leftApplication.getApplicationDate();
        Date rightDate = rightApplication.getApplicationDate();
        return leftDate.compare(rightDate);
    }
}
