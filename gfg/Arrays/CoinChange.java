// Example 1:

// Input:
// N = 3, sum = 4
// coins = {1,2,3}
// Output: 4
// Explanation: Four Possible ways are: {1,1,1,1},{1,1,2},{2,2},{1,3}.
// Example 2:

// Input:
// N = 4, Sum = 10
// coins = {2,5,3,6}
// Output: 5
// Explanation: Five Possible ways are: {2,2,2,2,2}, {2,2,3,3}, {2,2,6}, {2,3,5} and {5,5}.
// Your Task:
// You don't need to read input or print anything. Your task is to complete the function count() which accepts an array coins its size N and sum as input parameters and returns the number of ways to make change for given sum of money. 

import java.util.*;
class CoinChange{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t;
        int n;
        int sum;
        t = sc.nextInt();
        n = sc.nextInt();
        sum = sc.nextInt();
        sc.close();
        int arr[] = new int[n];
        while(t-- > 0)
        {
            for(int i=0;i<n;i++)
            {
                arr[i] = sc.nextInt();
            }
            Solution sol = new Solution();
            System.out.println(sol.count(arr,n,sum));
        }
    }
}
class Solution
{
    public int count(int arr[],int s,int sum)
    {
        int val[] = new int[sum+1];
        val[0] = 1;
        for(int coin:arr)
        {
            for(int i=coin;i<=sum;i++)
            {
                val[i] += val[i-coin];
            }
        }
        return val[sum];
    }
}