// Example 1:

// Input:
// N = 5
// A[] = {1, 2, 3, 4, 5}
// Output:
// 5 1 2 3 4
 

// Example 2:

// Input:
// N = 8
// A[] = {9, 8, 7, 6, 4, 2, 1, 3}
// Output:
// 3 9 8 7 6 4 2 1

import java.util.*;
class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        CyclicRotateOnce obj = new CyclicRotateOnce();
        obj.RotateArrayOnce(arr,n);
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<n;i++)
        {
            sb.append(arr[i]+" ");
        }
        System.out.println(sb);
        sc.close();
    }
}
class CyclicRotateOnce
{
    public void RotateArrayOnce(int arr[],int n)
    {
        int temp = arr[n-1];
        for(int i=n-1;i>0;i--)
        {
            arr[i] = arr[i-1];
        }
        arr[0] = temp;
    }
}