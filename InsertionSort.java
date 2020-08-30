package sorting;
import java.util.*;
public class InsertionSort 
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
        
        /*Iterate throughout the array linearly starting from 2nd element */
        for(int i=1; i<n; i++)
        {
            int j = i-1;
            int key = a[i];

            /*Take the key to right place in sorted portion of the array */
            while ( j >= 0 && a[j]>key) 
            { 
                a[j + 1] = a[j]; 
                j --; 
            } 
            a[j + 1] = key; 
        }

        for(int i=0; i<n; i++)
        {
            System.out.print(a[i] + " ");
        }
        
        sc.close();
    }
    
}