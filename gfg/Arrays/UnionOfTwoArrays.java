// Example 1:

// Input:
// 5 3
// 1 2 3 4 5
// 1 2 3
// Output: 
// 5
// Explanation: 
// 1, 2, 3, 4 and 5 are the
// elements which comes in the union set
// of both arrays. So count is 5.
// Example 2:

// Input:
// 6 2 
// 85 25 1 32 54 6
// 85 2 
// Output: 
// 7
// Explanation: 
// 85, 25, 1, 32, 54, 6, and
// 2 are the elements which comes in the
// union set of both arrays. So count is 7.
// Your Task:
// Complete doUnion function that takes a, n, b, m as parameters and returns the count of union elements of the two arrays. 
// The printing is done by the driver code.

import java.util.*;
class UnionOfTwoArrays
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a[] = new int[n];
        int b[] = new int[m];
        for(int i=0;i<n;i++)
        {
            a[i] = sc.nextInt();
        }
        for(int i=0;i<m;i++)
        {
            b[i] = sc.nextInt();
        }
        UnionOfArrays obj = new UnionOfArrays();
        int size = obj.doUnion(a,n,b,m);
        System.out.println(size);
    }
}
//Using ArrayList
class UnionOfArrays
{
    public int doUnion(int a[],int n,int b[],int m)
    {
        ArrayList<Integer> al = new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            if(!(al.contains(a[i])))
            {
                al.add(a[i]);
            }
        }
        for(int i=0;i<m;i++)
        {
            if(!(al.contains(b[i])))
            {
                al.add(b[i]);
            }
        }
        int size = al.size();
        return size;
    }
}
//Using HashSet
class Solution{
    public static int doUnion(int a[], int n, int b[], int m) 
    {
        //Your code here
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0;i<n;i++)
        {
            hs.add(a[i]);
        }
        for(int j=0;j<m;j++)
        {
            hs.add(b[j]);
        }
        return (hs.size());
    }
}