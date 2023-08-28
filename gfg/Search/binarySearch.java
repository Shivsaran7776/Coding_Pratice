// Example 1:

// Input:
// N = 5
// arr[] = {1 2 3 4 5} 
// K = 4
// Output: 3
// Explanation: 4 appears at index 3.

// Example 2:

// Input:
// N = 5
// arr[] = {11 22 33 44 55} 
// K = 445
// Output: -1
// Explanation: 445 is not present.

package Search;
import java.util.*;
import java.io.*;

class Bsearch
{
    int Bsearch(int arr[],int n,int k)
    {
        for(int i=1;i<=n;i++)
        {
            if(arr[i]==k)
            {
                return i;
            }
        }
        return -1;
    }
}
public class binarySearch
{
    public static void main(String[] args)throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int times;
        int key;
        System.out.println("Enter the no of times loop should iterated:");
        times = sc.nextInt();
        while(times>0)
        {
            int size;
            System.out.println("Enter the size of the array:");
            size = sc.nextInt();
            int arr[] = new int[size];
            System.out.println("Enter the array elements:");
            for(int i=0;i<size;i++)
            {
                arr[i] = sc.nextInt();
            }
            System.out.println("Enter the key element to be searched in array:");
            key = sc.nextInt();
            Bsearch obj = new Bsearch();
            System.out.println(obj.Bsearch(arr, size, key));
            times--;
        }
        sc.close();
    }
}