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