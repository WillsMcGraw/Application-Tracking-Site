/**
 * A class to represent the date (Year, Month, Day).
 */
public class Date
{
    // Fields
    private int year;
    private int month;
    private int day;

    // Constructor
    /**
     * A constructor for the Date class. It takes 3 ints, one for year, month and day.
     * The fields of the class are set to equal the parameters with the same name.
     * @param y 
     *  String, represents the year
     * @param m 
     *  String, represents the month
     * @param d 
     *  String, represents the day
     */
    public Date(int y, int m, int d)
    {
        this.year = y;
        this.month = m;
        this.day = d;
    }

    // Methods
    /**
     * A getter method for the year field
     * @return
     *  An int representing the year
     */
    public int getYear()
    {
        return this.year;
    }

    /**
     * A getter method for the month field
     * @return
     *  An int representing the month
     */
    public int getMonth()
    {
        return this.month;
    }

    /**
     * A getter method for the day field
     * @return
     *  An int representing the day
     */
    public int getDay()
    {
        return this.day;
    }

    /**
     * A toString method that prints out the Date object as a string.
     * It is printed out in the order Month/Day/Year.
     * @return
     *  A string that represents the date.
     */
    public String toString()
    {
        StringBuilder str = new StringBuilder();
        str.append(this.month + "/" + this.day + "/" + this.year);
        return str.toString();
    }

    /**
     * An equals method that checks to see if two Date objects are equal.
     * They are considered to be equal if the year, month, and day of both objects are
     * the same.
     * @param obj 
     *  Object, represents the object being compared to.
     * @return 
     *  Boolean, true if the objects are equal, false if not.
     */
    public boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;        
        }
        if (obj == null)
        {
            return false;
        }
        if (this.getClass() == obj.getClass())
        {
            Date other = (Date)obj;
            return (this.year == other.year && 
                    this.month == other.month && 
                    this.day == other.day);
        }
        return false;
    }
}