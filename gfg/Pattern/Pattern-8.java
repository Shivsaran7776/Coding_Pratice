// Example 1:

// Input: 5

// Output:

// *********
//  *******
//   *****
//    ***
//     *

class Solution{
  void printTriangle(int n) {
        // code here
        int a = (n*2)-1;
        for(int i = 1;i<=n;i++)
        {
            for(int j = 1;j<=((n*2)-1);j++)
            {
                if(j<i)
                {
                    System.out.print(" ");
                }
                else if(j>a)
                {
                    System.out.print("");
                }
                else
                {
                    System.out.print("*");
                }
            }
                System.out.println();
                a--;
        }
    }
}