// Example 1:

// Input:
// N = 5, S = 12
// A[] = {1,2,3,7,5}
// Output: 2 4
// Explanation: The sum of elements 
// from 2nd position to 4th position 
// is 12.
 

// Example 2:

// Input:
// N = 10, S = 15
// A[] = {1,2,3,4,5,6,7,8,9,10}
// Output: 1 5
// Explanation: The sum of elements 
// from 1st position to 5th position
// is 15.

class Solution
{
    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        int i=0,j=0,sum=0;
        ArrayList<Integer> res = new ArrayList<Integer>(2);
        while(i<n){
            if(s==0){
                res.add(-1);
                return res;
            }
            sum+=arr[i];
            if(sum>s){
                while(sum>s){
                sum-=arr[j];
                j++;
                }
            }
                    
            if(sum==s){
                res.add(j+1);
                res.add(i+1);
                return res;
            }
            if(sum<s){
                i++;
            }
        }
        res.add(-1);
        return res;
    }
}