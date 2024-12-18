// Given two integers a and b, return the sum of the two integers without using the operators + and -.

// Example 1:

// Input: a = 1, b = 2
// Output: 3
// Example 2:

// Input: a = 2, b = 3
// Output: 5
 

// Constraints:

// -1000 <= a, b <= 1000

//Loop way

class Solution {
    public int getSum(int a, int b) {
        if(b>0) {
            for(int i=0;i<b;i++) {
                a++;
            }
        }
        else if(b<0) {
            for(int i=0;i>b;i--) {
                a--;
            }
        }
        return a;
    }
}

//XOR Rule

// a b | XOR
// - - | - -
// 0 0 | 0
// 0 1 | 1
// 1 0 | 1
// 1 1 | 0

//AND Rule

// The & operator performs a bitwise AND operation.

// For two binary numbers, it compares each bit:

// If both bits are 1, the result is 1.

// Otherwise, the result is 0.

class Solution {
    public int getSum(int a, int b) {
        while(b != 0) {
            int temp = (a&b)<<1;
            a = a^b;
            b= temp;
        }
        return a;
    }
}