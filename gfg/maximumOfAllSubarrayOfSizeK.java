class Solution
{
    //Function to find maximum of each subarray of size k.
    static ArrayList <Integer> max_of_subarrays(int arr[], int n, int k)
    {
        // Your code here
        ArrayList<Integer> a = new ArrayList<>(n-k+1);
        for(int i=0;i<=n-k;i++)
        {
            int max = arr[i];
            for(int j=1;j<k;j++)
            {
                max = arr[i+j] > max ? arr[i+j]:max;
            }
            a.add(max);
        }
        return a;
    }
}