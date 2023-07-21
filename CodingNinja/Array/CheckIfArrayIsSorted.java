package CodingNinja.Array;
Sample Input 1 :
4
0 0 0 1
Sample Output 1 :
1

public class Solution {
    public static int isSorted(int n, int []a) {
        // Write your code here.
        for(int i=1;i<n;i++)
        {
            if(a[i-1]>a[i])
            {
                return 0;
            }
        }
        return 1;
    }
}