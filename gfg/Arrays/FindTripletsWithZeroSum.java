Example 1:

Input: n = 5, arr[] = {0, -1, 2, -3, 1}
Output: 1
Explanation: 0, -1 and 1 forms a triplet
with sum equal to 0.

Example 2:

Input: n = 3, arr[] = {1, 2, 3}
Output: 0
Explanation: No triplet with zero sum exists. 

class Solution
{
    // arr[]: input array
    // n: size of the array
    //Function to find triplets with zero sum.
	public boolean findTriplets(int arr[] , int n)
    {
        //add code here
        Arrays.sort(arr);
        for(int i=0;i<n;i++)
        {
            int a = i+1,b = n-1;
            while(a<b)
            {
                if(arr[i]+arr[a]+arr[b]==0)
                {
                    return true;
                }
                else if(arr[i]+arr[a]+arr[b]>0)
                {
                    b--;
                }
                else if(arr[i]+arr[a]+arr[b]<0)
                {
                    a++;
                }
            }
        }
        return false;
    }
}