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