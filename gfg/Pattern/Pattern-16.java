// Example 1:

// Input: 5

// Output:
// A
// BB
// CCC
// DDDD
// EEEEE

class Solution {

    void printTriangle(int n) {
        // code here
        for(char i = 'A';i<'A'+n;i++)
        {
            for(char j = 'A';j<=i;j++)
            {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}