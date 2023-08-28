// Example 1:

// Input:
// N = 6
// arr[] = {3,0,0,2,0,4}
// Output:
// 10 

// Example 2:

// Input:
// N = 4
// arr[] = {7,4,0,9}
// Output:
// 10
// Explanation:
// Water trapped by above 
// block of height 4 is 3 units and above 
// block of height 0 is 7 units. So, the 
// total unit of water trapped is 10 units.
// Example 3:

// Input:
// N = 3
// arr[] = {6,9,9}
// Output:
// 0
// Explanation:
// No water will be trapped.

class Solution{
    
    // arr: input array
    // n: size of array
    // Function to find the trapped water between the blocks.
    static long trappingWater(int arr[], int n) { 
        // Your code here
        int temp1 = arr[0],temp2=arr[n-1];
        int ngl[]= new int[n];
        int ngr[]= new int[n];
        int min;
        long sum=0;
        for(int i=0;i<n;i++)
        {
            if(temp1<arr[i])
            {
                temp1=arr[i];
            }
            ngl[i]=temp1;
        }
        
        for(int i=n-1;i>=0;i--)
        {
            if(temp2<arr[i])
            {
                temp2=arr[i];
            }
            ngr[i]=temp2;
        }
        
        for(int i=0;i<n;i++)
        {
            if(ngl[i]<ngr[i])
            {
                min=ngl[i];
            }
            else
            {
                min=ngr[i];
            }
            sum+=min-arr[i];
        }
        return sum;
    } 
}
