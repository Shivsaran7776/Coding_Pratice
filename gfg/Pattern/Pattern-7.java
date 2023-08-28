// Example 1:

// Input: 5

// Output:
//     *
//    ***  
//   *****
//  *******
// *********

class Solution {

    void printTriangle(int n) {
        // code here
        for(int i =0;i<n;i++)
        {
            for(int j=1;j<=n+i;j++)
            {
                if(j<n-i)
                {
                    System.out.print(" ");
                }
                else
                {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}