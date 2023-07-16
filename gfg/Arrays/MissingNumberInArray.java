Example 1:

Input:
N = 5
A[] = {1,2,3,5}
Output: 4
Example 2:

Input:
N = 10
A[] = {6,1,2,8,3,4,7,10,5}
Output: 9

package Arrays;
class Solution {
    int MissingNumber(int array[], int n) {
        Arrays.sort(array);
        int r = n*(n+1)/2;
        int tot = 0;
        for(int i=0;i<n-1;i++){
            tot = tot+array[i];
        }
        if(tot!=r){
            int result = r-tot;
            return result;
        }
        return 0;
        }
    }