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