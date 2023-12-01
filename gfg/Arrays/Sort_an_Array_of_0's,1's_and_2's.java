// Input: 
// N = 5
// arr[]= {0 2 1 2 0}
// Output:
// 0 0 1 2 2
// Explanation:
// 0s 1s and 2s are segregated 
// into ascending order.

class Solution
{
    public static void sort012(int a[], int n)
    {
        // code here
        Arrays.sort(a);
        return a;
        
    }
}
                                                             (or)

class Solution
{
    public static void sort012(int a[], int n)
    {
        // code here 
        int zeros = 0;
        int ones = 0;
        int twos = 0;
        for(int i=0;i<n;i++)
        {
            if(a[i] == 0)
            {
                zeros++;
            }
            else if(a[i] == 1)
            {
                ones++;
            }
            else
            {
                twos++;
            }
        }
        int i = 0;
        while(i<n)
        {
            if(i < zeros)
            {
                a[i++] = 0;
            }
            else if(i < zeros+ones)
            {
                a[i++] = 1;
            }
            else if(i < zeros+ones+twos)
            {
                a[i++] = 2;
            }
            
        }
    }
}                                                            