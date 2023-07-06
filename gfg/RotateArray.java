class Solution
{
    //Function to rotate an array by d elements in counter-clockwise direction. 
    static void rotateArr(int arr[], int d, int n)
    {
        // add your code here
        int k=d,j=0;
        int b[]=new int[n];
        while(k>n)
        {
            k=k-n;
        }
        for(int i=0;i<n;i++)
        {
            b[i]=arr[i];
        }
        for(int i=0;i<n;i++)
        {
         if(i+k<n)
         {
             arr[i]=arr[i+k];
         }
         else
         {
             arr[i]=b[j];
             j++;
         }
        }
    }
}