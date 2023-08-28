// Example 1:

// Input:
// N = 6
// A[] = {3, 2, 1, 56, 10000, 167}
// Output:
// min = 1, max =  10000

// Example 2:

// Input:
// N = 5
// A[]  = {1, 345, 234, 21, 56789}
// Output:
// min = 1, max = 56789

package Arrays;
class Compute 
{
    static pair getMinMax(long a[], long n)  
    {
        //Write your code here
        Arrays.sort(a);
        pair data = new pair(a[0],a[(int)n-1]);
        return data;
    }
}