n = 9
arr[] = {1,15,25,45,42,21,17,12,11}
Output: 45
Explanation: Maximum element is 45.

class Solution {
    int findMaximum(int[] arr, int n) {
        int max = arr[0];
        for (int i=0;i<n;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
       
    }
}