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