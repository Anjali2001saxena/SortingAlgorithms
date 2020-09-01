import java.util.*;
public class RadixSort {

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
 
        int[] a = new int[n]; 
        int max = 0;
        System.out.println("Enter the elements of array");
        for(int i=0; i<n; i++)
        {
            a[i] = sc.nextInt();

            if(max < a[i])
            max = a[i];
        }

        /*Transverse the array till every digit of maximum number is not considered */
        for(int exp=1; max/exp>0; exp = exp*10)
        {
        
        /*Perform Counting sort based on each digit */
        int[] output = new int[n];
        int[] count = new int[10];
        Arrays.fill(count,0);

        for(int i=0; i<n; i++)
        {
            count[ (a[i]/exp)%10 ]++; 
        }

        for(int i=1; i<10; i++)
        {
            count[i] = count[i-1] + count[i];
        }

        for (int i = n - 1; i >= 0; i--) 
        { 
            output[count[ (a[i]/exp)%10 ] - 1] = a[i]; 
            count[ (a[i]/exp)%10 ]--; 
        } 

        /*Copy the sorted array based on current digit */
        for(int i=0; i<n; i++)
        {
            a[i] = output[i];
        }
        }

        for(int i=0; i<n; i++)
        {
            System.out.print(a[i] + " ");
        }
        
        sc.close();


    }
    
}