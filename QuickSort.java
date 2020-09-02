import java.util.*;
public class QuickSort 
{

    int partition(int arr[], int low, int high)
    {
        /*Select the last element as pivot element */
        int pivot = arr[high];
        int i = low-1;

        /*Compare all the elements in the range with pivot and if smaller then shift them to beginning */
        for(int j=low; j<high; j++)
        {
            if (arr[j] <= pivot) 
            { 
                i++; 
                int temp = arr[i]; 
                arr[i] = arr[j]; 
                arr[j] = temp; 
            } 
        }
        /*Place pivot to correct position so elements on left are smaller and on right are greater */
        int temp = arr[i+1]; 
        arr[i+1] = arr[high]; 
        arr[high] = temp; 
        /*Return the position of pivot */
        return i+1; 
    }


    void sort(int arr[], int low, int high)
    {
        if(low < high)
        {
            int pi = partition(arr, low, high);

            /*Recursively sort elements before and after the pivot */
            sort(arr, low, pi-1);
            sort(arr, pi+1, high);
        }
    }


    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
 
        int[] a = new int[n]; 
        System.out.println("Enter the elements of array");
        for(int i=0; i<n; i++)
        {
            a[i] = sc.nextInt();
        }
        
        QuickSort q = new QuickSort(); 
        q.sort(a, 0, n-1); 

        for(int i=0; i<n; i++)
        {
            System.out.print(a[i] + " ");
        }

        sc.close();
    }
    
}