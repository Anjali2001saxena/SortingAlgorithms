import java.util.*;
public class BucketSort {

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
 
        int[] arr = new int[n]; 
        System.out.println("Enter the elements of array in the range 0-99");
        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }

        /*Create n buckets - array of size n having arraylist as elements*/
        ArrayList<Integer>[] b = new ArrayList[n];  
        /*Adding arraylist to every element of array */
        for(int i = 0; i < n; i++) 
        { 
           b[i] = new ArrayList<Integer>(); 
        } 
      
        /*Put array elements in respective buckets */
         for(int i = 0; i < n; i++) 
        { 
           int index=0;
           if(arr[i] < 10)
           {
            index = 0;
           }
           else
           {
            int m = arr[i];
            /*When element is in ten's range arrange according to its ten's position */
            while(!(m>=0 && m<=9))
           {
              m = m/10;
           }
           index = m;
           }
        b[index].add(arr[i]);
        } 
  
       /*Sort individual buckets*/ 
        for(int i = 0; i < n; i++) 
        { 
           Collections.sort(b[i]); 
        } 
  
        /*Concatenate all buckets*/
        int index = 0; 
        for(int i = 0; i < n; i++) 
        { 
           for(int j = 0; j < b[i].size(); j++) 
           { 
            arr[index++] = b[i].get(j); 
           } 
        } 

    for(int i=0; i<n; i++) 
    { 
        System.out.print(arr[i] + " "); 
    } 

        sc.close();
    }
    
}