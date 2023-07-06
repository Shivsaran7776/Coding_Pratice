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