// You are climbing a staircase. It takes n steps to reach the top.

// Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

// Example 1:

// Input: n = 2
// Output: 2
// Explanation: There are two ways to climb to the top.
// 1. 1 step + 1 step
// 2. 2 steps
// Example 2:

// Input: n = 3
// Output: 3
// Explanation: There are three ways to climb to the top.
// 1. 1 step + 1 step + 1 step
// 2. 1 step + 2 steps
// 3. 2 steps + 1 step

class Solution {
    public int climbStairs(int n) {
        if(n<=3) {
            return n;
        }
        int climb1 = 3;
        int climb2 = 2;
        int curr = 0;
        for(int i=3;i<n;i++) {
            curr = climb1+climb2;
            climb2 = climb1;
            climb1 = curr;
        }
        return curr;
    }
}