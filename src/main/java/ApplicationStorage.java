import java.util.Comparator;

public class ApplicationStorage<T>
{
   // Fields
   private Application[] applicationList;
   private int activeIndex;

   // Constructors
   /**
   * A constructor for the ApplicationStorage class
   * @param size
   */
   public ApplicationStorage(int size)
   {
      applicationList = new Application[size];
      activeIndex = 0;
   }

   // Methods
   /**
    * A getter method for the applicationList field.
    * @return Application[], an array storing different application objects
    */
   public Application[] getApplicationList()
   {
      return this.applicationList;
   }

   /**
    * A method to record an application in the applicationList field
    * @param app 
    */
   public void record(Application app)
   {
      applicationList[activeIndex] = app;
      activeIndex++;
   }

   public void quick_sort(Comparator<? super T> comparator)
   {
      // TO DO
   }
}