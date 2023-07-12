class Solution {

    
    // a: input array
    // n: size of array
    // Function to find equilibrium point in the array.
    public static int equilibriumPoint(long arr[], int n) {

        // Your code here
        int lsum=0,tot_sum = 0;
        for(int i=0;i<n;i++)
        {
            tot_sum +=arr[i];
        }
        for(int i=0;i<n;i++)
        {
            if(lsum==(tot_sum-arr[i]))
            {
                return i+1;
            }
            lsum +=arr[i];
            tot_sum -=arr[i];
        }
        return -1;
    }
}