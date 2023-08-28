// Example 1:

// Input:
// N = 5, D = 2
// arr[] = {1,2,3,4,5}
// Output: 3 4 5 1 2
// Explanation: 1 2 3 4 5  when rotated
// by 2 elements, it becomes 3 4 5 1 2.
// Example 2:

// Input:
// N = 10, D = 3
// arr[] = {2,4,6,8,10,12,14,16,18,20}
// Output: 8 10 12 14 16 18 20 2 4 6
// Explanation: 2 4 6 8 10 12 14 16 18 20 
// when rotated by 3 elements, it becomes 
// 8 10 12 14 16 18 20 2 4 6.

package Arrays;
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