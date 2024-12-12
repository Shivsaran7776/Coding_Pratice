// Given an integer array nums, find a subarray that has the largest product, and return the product.

// The test cases are generated so that the answer will fit in a 32-bit integer.

// Example 1:

// Input: nums = [2,3,-2,4]
// Output: 6
// Explanation: [2,3] has the largest product 6.
// Example 2:

// Input: nums = [-2,0,-1]
// Output: 0
// Explanation: The result cannot be 2, because [-2,-1] is not a subarray.

// Input: nums = [-3,-1,-1]
// Output: 3

// Input: nums = [0,2]
// Output: 2

// Input: nums = [3,-1,4]
// Output: 4

class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int max = nums[0];
        int min = nums[0];
        int res = nums[0];
        for(int i=1;i<n;i++) {
            int num = nums[i];
            int tempMax = Math.max(num, Math.max(num*max, num*min));
            min = Math.min(num, Math.min(num*min, num*max));
            max = tempMax;
            res = Math.max(res,max);
        }
        return res;
    }
}