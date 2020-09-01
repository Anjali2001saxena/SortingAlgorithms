import java.util.*;
public class CountSort {

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
 
        int[] a = new int[n]; 
        int max=0;
        System.out.println("Enter the elements of array");
        for(int i=0; i<n; i++)
        {
            a[i] = sc.nextInt();

            if(max < a[i])
            max= a[i];
        }

        /*Create array to have the sorted array */
        int[] output = new int[n];
        /*Create count array which stores the count of every element in array */
        int[] count = new int[max];
        for(int i=0; i<max; i++)
        {
            count[i]=0;
        }

        /*Store count of each element */
        for(int i=0; i<n; i++)
        {
            count[a[i]]++;
        }
        /*Change array so that now it contains actual position of element in array by storing their cumulative sum */
        for(int i=1; i<max; i++)
        {
            count[i] = count[i] + count[i-1];
        }

        /*Now put elements in output arrray and decrease their count with adding */
        for (int i = n-1; i>=0; i--) 
        { 
            output[count[a[i]]-1] = a[i]; 
            --count[a[i]]; 
        } 

        /*Copy the sorted array to input array */
        for(int i=0; i<n; i++)
        {
            a[i] = output[i];
        }

        for(int i=0; i<n; i++)
        {
            System.out.print(a[i] + " ");
        }
        
        sc.close();
    }
    
}