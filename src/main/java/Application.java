public class Application
{
    // Fields
    private String companyName;
    private String companyLink;
    private String jobName;
    private boolean jobType;
    private Date applicationDate;
    private Status applicationStatus;

    // Constructors
    /**
     * A constructor for the Influencer class. It sets each field of the class
     * equal to the parameter matching its resepctive name.
     * @param companyName
     * @param companyLink
     * @param jobName
     * @param jobType
     * @param applicationDate
     * @param applicationStatus
     */
    public Application (String companyName, String companyLink, String jobName, 
                        boolean jobType, Date applicationDate, Status applicationStatus) 
    {
        this.companyName = companyName;
        this.companyLink = companyLink;
        this.jobName = jobName;
        this.jobType = jobType;
        this.applicationDate = applicationDate;
        this.applicationStatus = applicationStatus;
    }

    // Methods
}