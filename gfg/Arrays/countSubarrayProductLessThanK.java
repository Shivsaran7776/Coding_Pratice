Example 1:

Input : 
n = 4, k = 10
a[] = {1, 2, 3, 4}
Output : 
7
Explanation:
The contiguous subarrays are {1}, {2}, {3}, {4} 
{1, 2}, {1, 2, 3} and {2, 3}, in all these subarrays
product of elements is less than 10, count of
such subarray is 7.
{2,3,4} will not be a valid subarray, because 
2*3*4=24 which is greater than 10.

Example 2:

Input:
n = 7 , k = 100
a[] = {1, 9, 2, 8, 6, 4, 3}
Output:
16

package Arrays;
class Solution {
    
    public int countSubArrayProductLessThanK(long a[], int n, long k)
    {
        int count = 0;
        int i =0,j = 0;
        long prod = 1;
        while(i<n)
        {
            prod*=a[i];
            while(j<=i && prod>=k)
            {
                prod /= a[j];
                j++;
            }
            count += (i-j+1);
            i++;
        }
        return count;
    }
}