import java.util.Comparator;

public class ApplicationStorage
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

   /**
    * A method to call helper methods to sort the application list according to the
    * passed in comparator.
    * @param comp
    *    Comparator<Application>, represents the comparator that the list is being
    *    sorted by
    */
   public void sort(Comparator<Application> comp)
   {
      quickSort(this.applicationList, 0, this.activeIndex - 1, comp);
   }

   /**
    * A private helper method to sort the application list.
    * @param arr
    * @param low
    * @param high
    * @param comp
    * @return
    */
   private int partition(Application[] arr, int low, int high, Comparator<Application> comp)
   {
      Application pivotApplication = arr[high];
      int i = low - 1;
      for (int j = low; j < high; j++)
      {
         if (0 < comp.compare(arr[j], pivotApplication))
         {
            i++;
            Application temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
         }
      } 
      Application temp = arr[i + 1];
      arr[i + 1] = arr[high];
      arr[high] = temp;
      return (i + 1);
   }

   /**
    * A private helper method to sort the application list.
    * @param arr
    * @param low
    * @param high
    * @param comp
    */
   private void quickSort(Application[] arr, int low, int high, Comparator<Application> comp)
   {
      if (low < high)
      {
         int pivot = partition(arr, low, high, comp);
         quickSort(arr, low, pivot - 1, comp);
         quickSort(arr, pivot + 1, high, comp);
      }
   }
}