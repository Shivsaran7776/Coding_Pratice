// Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].

// The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

// You must write an algorithm that runs in O(n) time and without using the division operation.

// Example 1:
// Input: nums = [1,2,3,4]
// Output: [24,12,8,6]

// Example 2:
// Input: nums = [-1,1,0,-3,3]
// Output: [0,0,9,0,0]

//Brute Force Approach => Time Complexity: O(n^2) => but it fails time complexity wise
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int prod[] = new int[n];
        for (int i = 0; i < n; i++) {
            int mul = 1;
            for(int j=0;j<n;j++) {
                if(i==j) {
                    continue;
                }
                mul *= nums[j];
            }
            prod[i] = mul;
        }
        return prod;
    }
}