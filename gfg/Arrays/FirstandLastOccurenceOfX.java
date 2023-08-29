// Given a sorted array arr containing n elements with possibly duplicate  is to find indexes of first elements, the taskand last occurrences of an element x in the given array.
// Note: If the number x is not found in the array then return both the indices as -1.

// Example 1:

// Input:
// n=9, x=5
// arr[] = { 1, 3, 5, 5, 5, 5, 67, 123, 125 }
// Output:  
// 2 5
// Explanation: 
// First occurrence of 5 is at index 2 and last occurrence of 5 is at index 5. 
// Example 2:

// Input:
// n=9, x=7
// arr[] = { 1, 3, 5, 5, 5, 5, 7, 123, 125 }
// Output:  
// 6 6
// Explanation: 
// First and last occurrence of 7 is at index 6.
// Your Task:
// Since, this is a function problem. You don't need to take any input, as it is already accomplished by the driver code. You just need to complete the function find() that takes array arr, integer n and integer x as parameters and returns the required answer.

import java.util.*;
class FirstandLastOccurrenceOfX
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t;
        int n;
        int x;
        t = sc.nextInt();
        n = sc.nextInt();
        x = sc.nextInt();
        sc.close();
        long arr[] = new long[n];
        while(t-->0)
        {
            for(int i=0;i<n;i++)
            {
                arr[i] = sc.nextLong();
            }
            Solution sol = new Solution();
            ArrayList<Long> res = sol.find(arr,n,x);
            System.out.println(res.get(0)+" "+res.get(1));
        }
    }
}
class Solution
{
    public ArrayList<Long> find(long arr[], int n, int x)
    {
        // code here
        ArrayList<Long> al = new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            if(x==arr[i])
            {
                al.add((long)i);
                break;
            }
        }
        for(int j=n-1;j>0;j--)
        {
            if(arr[j]==x)
            {
                al.add((long)j);
                break;
            }
        }
        for(int i=0;i<n;i++)
        {
            if(arr[i] != x)
            {
                al.add((long)-1);
                al.add((long)-1);
            }
        }
        if(al.size() <0)
        {
            al.add((long)-1);
        }
        return al;
    }
}