package sorting;
import java.util.*;
public class SelectionSort 
{
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
        
        /*Transverse the array linearly till last second element */
        for(int i=0; i<n-1; i++)
        {
            int min = i;

            /*Transverse the unsorted array after ith position to find the minimum element */
            for(int j=i+1; j<n; j++)
            {
                if(a[j] < a[min])
                {
                    min = j;
                }
            }

            /*Swap the position of current and minimum element */
            int temp = a[i];
            a[i] = a[min];
            a[min] = temp;
        }

        for(int i=0; i<n; i++)
        {
            System.out.print(a[i] + " ");
        }
        
        sc.close();
    }
    
}