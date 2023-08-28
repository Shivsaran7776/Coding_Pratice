// Example 1:

// Input: 5

// Output:
// ABCDE
// ABCD
// ABC
// AB
// A

class Solution {

    void printTriangle(int n) {
        // code here
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-i;j++)
            {
                System.out.print((char)(65+j));
            }
            System.out.println();
        }
    }
}