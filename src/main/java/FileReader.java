import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.Scanner;

public class FileReader
{
    // Fields
    private Application[] applicationList;

    public static final int APPLICATION_TOKENS = 6;

    // Constructors
    /**
     * A constructor to create a new FileReader object
     * @param applicationListFileName
     *  Represents the name of the file holding the application data
     */
    public FileReader(String applicationListFileName)
        throws ParseException,
        FileNotFoundException
    {
        applicationList = readApplicationFile(applicationListFileName);
    }

    // Methods
    public Application[] readApplicationFile(String applicationListFileName)
        throws ParseException,
        FileNotFoundException
    {
        int numberOfLines = countLines(applicationListFileName);
        ApplicationStorage applicationStorage = new ApplicationStorage(numberOfLines);
        try
        {
            File newFile = new File(applicationListFileName);
            Scanner file = new Scanner(newFile);
            while (file.hasNextLine())
            {
                String read = file.nextLine();
                String[] tokens = read.split(",\\s*", 6);
                if (tokens.length != APPLICATION_TOKENS)
                {
                    throw new ParseException("There is an incorrect number of tokens in a row. ", tokens.length);
                }
                String companyName = tokens[0];
                String companyLink = tokens[1];
                String jobName = tokens[2];
                String jobLink = tokens[3];
                Date applicationDate = convertDate(tokens[4]);
                Status applicationStatus = convertStatus(tokens[5]);
                Application app = new Application(companyName, companyLink, jobName, jobLink, applicationDate, applicationStatus);
                applicationStorage.record(app);
                
            }
            file.close();
        }
        catch (FileNotFoundException exception)
        {
            throw new FileNotFoundException("There seems to have been an error with loading a file.");
        }
        return applicationStorage.getApplicationList();
    }

    /**
     * A private helper method to run through the loaded file to check how many lines of
     * date there are.
     * @param applicationListFileName
     *  String, the name of the file to be checked
     * @return
     *  int, the number of lines in the file
     * @throws FileNotFoundException
     *  Thrown if the file cannot be found
     */
    private int countLines(String applicationListFileName)
        throws FileNotFoundException
    {
        int count = 0;
        try
        {
            File newFile = new File(applicationListFileName);
            Scanner file = new Scanner(newFile);
            file.nextLine();
            while (file.hasNext())
            {
                file.nextLine();
                count++;
            }
            file.close();
        }
        catch (FileNotFoundException exception)
        {
            throw new FileNotFoundException("There seems to have been an error with loading a file.");
        }
        return count;
    }

    /**
     * A private helper method to convert dates (9/19/2024) into Date objects.
     * @param strDate
     *  A string representation of the date
     * @return
     *  A Date object representation of the date
     */
    private Date convertDate(String strDate)
    {
        String[] dateTokens = strDate.split("/", 3);
        int month = Integer.valueOf(dateTokens[0]);
        int day = Integer.valueOf(dateTokens[1]);
        int year = Integer.valueOf(dateTokens[2]);
        Date date = new Date(year, month, day);
        return date;
    }

    /**
     * A private helper method to convert application status into Status enumerators.
     * @param strStatus
     *  A string representation of the status
     * @return
     *  An enumerator representation of the status
     */
    private Status convertStatus(String strStatus)
    {
        strStatus = strStatus.toLowerCase();
        switch (strStatus)
        {
            case "in process":
                return Status.IN_PROCESS;
            case "denied":
                return Status.DENIED;
            case "accepted":
                return Status.ACCEPTED;
            default:
                return null;
        }
    }
}