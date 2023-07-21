Example 1:

Input:
n = 5
arr[] = {1,2,3,4,5}
Output: 2 1 4 3 5
Explanation: Array elements after 
sorting it in wave form are 
2 1 4 3 5.
Example 2:

Input:
n = 6
arr[] = {2,4,7,8,9,10}
Output: 4 2 8 7 10 9
Explanation: Array elements after 
sorting it in wave form are 
4 2 8 7 10 9.

class Solution {
    public static void convertToWave(int n, int[] a) {
        // code here
        int temp=0;
        for(int i=0;i<n-1;i+=2)
        {
            temp = a[i+1];
            a[i+1] = a[i];
            a[i] = temp;
        }
    }
}