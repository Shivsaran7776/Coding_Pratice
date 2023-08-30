// Given an array A[] of N elements. The task is to count number of even and odd elements in the array.

// Example:

// Input:
// N = 5
// A[] = 1 2 3 4 5
// Output:
// 3 2
// Explanation:
// There are 3 odd elements (1, 3, 5)
// and 2 even elements (2 and 4).
// Your Task:
// Your task is to complete the function countOddEven() which should print number of odd and number of even elements in a single line seperated by space.
// Print a newline at the end of output.

import java.util.*;
class CountOddEven{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t;
        int n;
        t = sc.nextInt();
        n = sc.nextInt();
        sc.close();
        int arr[] = new int[n];
        while(t-- > 0)
        {
            for(int i=0;i<n;i++)
            {
                arr[i] = sc.nextInt();
            }
            Solution sol = new Solution();
            sol.FindCount(arr,n);
        }
    }
}
class Solution
{
    public void FindCount(int arr[],int s)
    {
        int o_count = 0;
        int e_count = 0;
        for(int i=0;i<s;i++)
        {
            if(arr[i]%2!=0)
            {
                o_count +=1;
            }
            else
            {
                e_count +=1;
            }
        }
        System.out.println(o_count+" "+e_count);
    }
}