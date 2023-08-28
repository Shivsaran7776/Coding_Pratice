// Example 1:

// Input: 
// n = 4, arr1[] = [1 3 5 7] 
// m = 5, arr2[] = [0 2 6 8 9]
// Output: 
// arr1[] = [0 1 2 3]
// arr2[] = [5 6 7 8 9]
// Explanation:
// After merging the two 
// non-decreasing arrays, we get, 
// 0 1 2 3 5 6 7 8 9.
// Example 2:

// Input: 
// n = 2, arr1[] = [10 12] 
// m = 3, arr2[] = [5 18 20]
// Output: 
// arr1[] = [5 10]
// arr2[] = [12 18 20]
// Explanation:
// After merging two sorted arrays 
// we get 5 10 12 18 20.

//User function Template for Java

class Solution
{
    //Function to merge the arrays.
    public static void merge(long arr1[], long arr2[], int n, int m) 
    {
        // code here
        PriorityQueue<Long> pq = new PriorityQueue<Long>();
        for(int i=0;i<n;i++)
        {
            pq.add(arr1[i]);
        }
        for(int i=0;i<m;i++)
        {
            pq.add(arr2[i]);
        }
        for(int i=0;i<n;i++)
        {
            arr1[i]=pq.poll();
        }
        for(int i=0;i<m;i++)
        {
            arr2[i]=pq.poll();
        }
    }
}