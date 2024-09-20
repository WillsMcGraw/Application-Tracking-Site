public class Application
{
    // Fields
    private String companyName;
    private String companyLink;
    private String jobName;
    private String jobLink;
    private Date applicationDate;
    private Status applicationStatus;

    // Constructors
    /**
     * A constructor for the Influencer class. It sets each field of the class
     * equal to the parameter matching its resepctive name.
     * @param companyName
     * @param companyLink
     * @param jobName
     * @param jobLink
     * @param applicationDate
     * @param applicationStatus
     */
    public Application(String companyName, String companyLink, String jobName, 
                       String jobLink, Date applicationDate, Status applicationStatus) 
    {
        this.companyName = companyName;
        this.companyLink = companyLink;
        this.jobName = jobName;
        this.jobLink = jobLink;
        this.applicationDate = applicationDate;
        this.applicationStatus = applicationStatus;
    }

    // Methods
    /**
     * A getter method for the companyName field.
     * @return String, represents the company name
     */
    public String getCompanyName()
    {
        return this.companyName;
    }

    /**
     * A getter method for the companyLink field.
     * @return String, represents the company link
     */
    public String getCompanyLink()
    {
        return this.companyLink;
    }

    /**
     * A getter method for the jobName field.
     * @return String, represents the job name
     */
    public String getJobName()
    {
        return this.jobName;
    }

    /**
     * A getter method for the jobLink field.
     * @return String, represents the job link
     */
    public String getJobLink()
    {
        return this.jobLink;
    }

    /**
     * A getter method for the applicationDate field.
     * @return Date, represents the date
     */
    public Date getApplicationDate()
    {
        return this.applicationDate;
    }

    /**
     * A getter method for the applicationStatus field.
     * @return Status, represents the status of the application
     */
    public Status getApplicationStatus()
    {
        return this.applicationStatus;
    }
}