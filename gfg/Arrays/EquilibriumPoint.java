Example 1:

Input: 
n = 5 
A[] = {1,3,5,2,2} 
Output: 3 
Explanation:  
equilibrium point is at position 3 
as elements before it (1+3) = 
elements after it (2+2). 

Example 2:

Input:
n = 1
A[] = {1}
Output: 1
Explanation:
Since its the only element hence
its the only equilibrium point.

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