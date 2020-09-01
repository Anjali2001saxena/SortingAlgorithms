import java.util.*;
public class ShellSort 
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

        /*Start with interval of half the number of elements and reduce till 1 */
        for(int gap=n/2; gap>0; gap = gap/2)
        {
            /*Sort elements within this gap because previous elements will be sorted in next cases */
            for(int i=gap; i<n; i++)
            {
                int temp = a[i];
                int j;
                /*Shift all the elements to make space for a[i] */
                for(j = i; j >= gap && a[j - gap] > temp; j -= gap)
                {
                    a[j] = a[j - gap]; 
                }
                /*Put a[i] in the correct position */
                a[j] = temp;
            }
        }

        for(int i=0; i<n; i++)
        {
            System.out.print(a[i] + " ");
        }
        
        sc.close();


    }
    
}