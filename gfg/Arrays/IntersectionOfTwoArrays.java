// Example 1:

// Input:
// n = 5, m = 3
// a[] = {89, 24, 75, 11, 23}
// b[] = {89, 2, 4}

// Output: 1

// Explanation: 
// 89 is the only element 
// in the intersection of two arrays.
// Example 2:

// Input:
// n = 6, m = 5
// a[] = {1, 2, 3, 4, 5, 6}
// b[] = {3, 4, 5, 6, 7} 

// Output: 4

// Explanation: 
// 3 4 5 and 6 are the elements 
// in the intersection of two arrays.
// Your Task:
// You don't need to read input or print anything. Your task is to complete the function NumberofElementsInIntersection() which takes 
// two integers n and m and their respective arrays a[] and b[]  as input. The function should return the count of the number of elements 
// in the intersection.

import java.util.*;
class IntersectionOfTwoArrays
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
        IntersectionOfArrays obj = new IntersectionOfArrays();
        System.out.println(obj.NumberOfIntersectionElements(a,n,b,m));
    }
}
class IntersectionOfArrays
{
    public static int NumberOfIntersectionElements(int a[],int n,int b[],int m)
    {
        HashSet<Integer> hs = new HashSet<>();
        HashSet<Integer> hs2 = new HashSet<>();
        int count = 0;
        for(int i=0;i<n;i++)
        {
            hs.add(a[i]);
        }
        for(int i=0;i<m;i++)
        {
            if(hs.contains(b[i]))
            {
                hs2.add(b[i]);
            }
        }
        count = hs2.size();
        return count;
    }
}