N = 5
A[] = {1,2,5,4,0}
B[] = {2,4,5,0,1}
Output: 1
Explanation: Both the array can be 
rearranged to {0,1,2,4,5}

Example 2:

Input:
N = 3
A[] = {1,2,5}
B[] = {2,4,15}
Output: 0
Explanation: A[] and B[] have only 
one common value.

package Arrays;
import java.util.*;
import java.io.*;
class TwoArraysAreEqualOrNot
{
    public static boolean check(int A[],int B[],int N)
    {
        Arrays.sort(A);
        Arrays.sort(B);
        int count = 0;
        for(int i=0;i<N;i++)
        {
            if (A[i]==B[i])
            {
                count++;
            }
        }
        return(count==N);
    }
}

public class checkIfTwoArrayAreEqualAreNot {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int times;
        System.out.println("Enter the no.of times loop to be iterated:");
        times = sc.nextInt();
        while(times>0)
        {
            int size;
            System.out.println("Enter the size of the array:");
            size = sc.nextInt();
            int arr[] = new int[size]; 
            int brr[] = new int[size];
            System.out.println("Enter first array elements:");
            for(int i=0;i<size;i++)
            {

                arr[i] = sc.nextInt();
            }
            System.out.println("Enter second array elements:");
            for(int i=0;i<size;i++)
            {

                brr[i] = sc.nextInt();
            }
            TwoArraysAreEqualOrNot obj = new TwoArraysAreEqualOrNot();
            System.out.println("Result of two array after check equal or not:");
            System.out.println(obj.check(arr, brr, size)==true?"1":"0");
            times--;
        }
        sc.close();
    }
}
