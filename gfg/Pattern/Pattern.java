// For Input: 
// 5
// Your Output: 
//     *
//    * *
//   * * *
//  * * * *
// * * * * *
// * * * * *
//  * * * *
//   * * *
//    * *
//     *

class Solution {

    void printDiamond(int n) {
        // Your code here
        for(int i=n;i>0;i--)
        {
            for(int j=1;j<=n;j++)
            {
                if(j<i)
                {
                    System.out.print(" ");
                }
                else if(j>=i)
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("");
                }
            }
            System.out.println();
        }
        
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(j<i)
                {
                    System.out.print(" ");
                }
                else if(j>=i)
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("");
                }
            }
            System.out.println();
        }
    }
}
