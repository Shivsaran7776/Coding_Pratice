// Given two arrays: a1[0..n-1] of size n and a2[0..m-1] of size m. Task is to check whether a2[] is a subset of a1[] or not. Both the arrays can be sorted or unsorted. There can be duplicate elements.
 

// Example 1:

// Input:
// a1[] = {11, 7, 1, 13, 21, 3, 7, 3}
// a2[] = {11, 3, 7, 1, 7}
// Output:
// Yes
// Explanation:
// a2[] is a subset of a1[]

// Example 2:

// Input:
// a1[] = {1, 2, 3, 4, 4, 5, 6}
// a2[] = {1, 2, 4}
// Output:
// Yes
// Explanation:
// a2[] is a subset of a1[]

// Example 3:

// Input:
// a1[] = {10, 5, 2, 23, 19}
// a2[] = {19, 5, 3}
// Output:
// No
// Explanation:
// a2[] is not a subset of a1[]
 

// Your Task:  
// You don't need to read input or print anything. Your task is to complete the function isSubset() which takes the array a1[], a2[], 
// its size n and m as inputs and return "Yes" if arr2 is subset of arr1 else return "No" if arr2 is not subset of arr1.

import java.util.*;
class ArraySubsetOfAnotherArray
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long m = sc.nextLong();
        long a1[] = new long[(int)n];
        long a2[] = new long[(int)m];
        for(int i=0;i<n;i++)
        {
            a1[i] = sc.nextLong();
        }
        for(int i=0;i<m;i++)
        {
            a2[i] = sc.nextLong();
        }
        Solution obj = new Solution();
        System.out.println(obj.isSubset(a1,a2,n,m));
        sc.close();
    }
}

class Solution
{
    public String isSubset(long a1[],long a2[],long n,long m)
    {
        HashMap<Long,Long> hm = new HashMap<>();
        for(int i=0;i<n;i++)
        {
            if(!hm.containsKey(a1[i]))
            {
                hm.put(a1[i],1L);
            }
            else
            {
                hm.put(a1[i],hm.get(a1[i])+1L);
            }
        }
        for(HashMap.Entry<Long,Long> res : hm.entrySet())
        {
            System.out.println(res.getKey()+":"+res.getValue());
        }
        for(int i=0;i<m;i++)
        {
            if(!hm.containsKey(a2[i]) || hm.get(a2[i])==0L)
            {
                return "No";
            }
            hm.put(a2[i],hm.get(a2[i])-1L);
        }
        return "Yes";
    }
}

// 11 7 1 13 21 3 7 3
// 11 3 7 1 7