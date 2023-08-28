// Example 1:

// Input: 5

// Output:
// 1 
// 2 3 
// 4 5 6 
// 7 8 9 10 
// 11 12 13 14 15

class Solution {

    void printTriangle(int n) 
    {
        int num = 0;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                
                num +=1;
                System.out.print(num+" ");
            }
            System.out.println();
        }
    }
}