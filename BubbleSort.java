package sorting;
import java.util.*;
public class BubbleSort
{
    public static void main( String args[])
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the size of array");
       int n = sc.nextInt();

       int[] a = new int[n]; 
       System.out.println(" Enter the elements of array");
       for(int i=0; i<n; i++)
       {
           a[i] = sc.nextInt();
       }

       /* Iterate through the array n-1 times so that n elements get to their position */
       for(int i=0; i<n-1; i++)
       {   
           /*In each iteration iterate to elements one lesser than previous  */
        for(int j=0; j<n-i-1; j++)
        {
            /* Swap the elements if previous element is larger than the later */
           if(a[j] > a[j+1])
           {
               int temp = a[j];
               a[j] = a[j+1];
               a[j+1] = temp;
           }
        }   
       }

       for(int i=0; i<n; i++)
       {
           System.out.print(a[i] + " ");
       }

       sc.close();
    }

}