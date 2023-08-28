// Given an array having both positive and negative integers. The task is to compute the length of the largest subarray with sum 0.

// Example 1:

// Input:
// N = 8
// A[] = {15,-2,2,-8,1,7,10,23}
// Output: 5
// Explanation: The largest subarray with
// sum 0 will be -2 2 -8 1 7.


import java.util.*;
class MaxSumToZero
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t;
        int n;
        t = sc.nextInt();
        n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        Solution sol = new Solution();
        System.out.println(sol.maxLenSum(arr,n));
    }
}
class Solution 
{
    public int maxLenSum(int arr[],int size)
    {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int cur_sum = 0;
        int max = 0;
        for(int i=0;i<size;i++)
        {
            cur_sum += arr[i];
            if(hm.containsKey(cur_sum))
            {
                max = Math.max(max,i-hm.get(cur_sum)); 
            }
            else
            {
                hm.put(cur_sum,i);
            }
        }
        return max;
    }
}