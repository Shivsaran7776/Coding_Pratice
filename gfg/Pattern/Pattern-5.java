// Example 1:

// Input: 5

// Output:
// * * * * *
// * * * * 
// * * * 
// * *  
// * 

class Solution {

    void printTriangle(int n) {
        // code here
        for(int i=1;i<=n;i++)
        {
            for(int j = n-i;j>=0;j--)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}