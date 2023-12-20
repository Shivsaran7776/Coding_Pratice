// Example 1:

// Input: 
// n = 5, arr1[] = {1, 2, 3, 4, 5}  
// m = 3, arr2 [] = {1, 2, 3}
// Output: 1 2 3 4 5
// Explanation: Distinct elements including 
// both the arrays are: 1 2 3 4 5.
 

// Example 2:

// Input: 
// n = 5, arr1[] = {2, 2, 3, 4, 5}  
// m = 5, arr2[] = {1, 1, 2, 3, 4}
// Output: 1 2 3 4 5
// Explanation: Distinct elements including 
// both the arrays are: 1 2 3 4 5.
 

// Example 3:

// Input:
// n = 5, arr1[] = {1, 1, 1, 1, 1}
// m = 5, arr2[] = {2, 2, 2, 2, 2}
// Output: 1 2
// Explanation: Distinct elements including 
// both the arrays are: 1 2.

// Your Task: 
// You do not need to read input or print anything. Complete the function findUnion() that takes two arrays arr1[], arr2[], and their 
//size n and m as input parameters and returns a list containing the union of the two arrays. 

import java.util.*;
class UnionOfTwoSortedArrays
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr1[] = new int[n];
        int arr2[] = new int[m];
        for(int i=0;i<n;i++)
        {
            arr1[i] = sc.nextInt();
        }
        for(int i=0;i<m;i++)
        {
            arr2[i] = sc.nextInt();
        }
        Solution obj = new Solution();
        ArrayList<Integer> res = new ArrayList<>();
        res = obj.findUnion(arr1,arr2,n,m);
        for(int i=0;i<res.size();i++)
        {
            System.out.print(res.get(i)+" ");
        }
        sc.close();
    }
}
class Solution
{
    public static ArrayList<Integer> findUnion(int arr1[],int arr2[],int n,int m)
    {
        ArrayList<Integer> al = new ArrayList<>();
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0;i<n;i++)
        {
            hs.add(arr1[i]);
        }
        for(int i=0;i<m;i++)
        {
            hs.add(arr2[i]);
        }
        al.addAll(hs);
        Collections.sort(al);
        return al;
    }
}