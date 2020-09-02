import java.util.*;

public class MergeSort {

    void merge(int arr[], int l, int m, int r)
    {
        /*Find size of subarrays to be formed */
        int n1 = m-l+1;
        int n2 = r-m;

        int[] L = new int[n1];
        int[] R = new int[n2];

        /*Assigning values to subarrays */
        for(int i=0; i<n1; i++)
        {
            L[i] = arr[l+i];
        }
        for(int i=0; i<n2; i++)
        {
            R[i] = arr[m+1+i];
        }

        int i=0;
        int j=0;
        int k=l;

        /*Merge the subarrays */
        while(i<n1 && j<n2)
        {
            if(L[i] < R[j])
            {
                arr[k] = L[i];
                i++;
            }
            else
            {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        /*Add remaining elements of subarrays to array */
        while (i < n1) 
        { 
            arr[k] = L[i]; 
            i++; 
            k++; 
        } 
        while (j < n2) { 
            arr[k] = R[j]; 
            j++; 
            k++; 
        }
    }

    void sort(int arr[], int l, int r) 
    { 
        if (l < r) { 
            int m = (l + r) / 2; 
  
            // Sort first and second halves 
            sort(arr, l, m); 
            sort(arr, m + 1, r); 
  
            // Merge the sorted halves 
            merge(arr, l, m, r); 
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

        MergeSort m = new MergeSort();
        m.sort(a, 0, a.length-1);

        for(int i=0; i<n; i++)
        {
            System.out.print(a[i] + " ");
        }

        sc.close();
    }
    
}