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
