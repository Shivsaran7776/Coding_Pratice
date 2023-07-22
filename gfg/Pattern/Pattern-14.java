Example 1:

Input: 5

Output:
A
AB
ABC
ABCD
ABCDE

class Solution {

    void printTriangle(int n) {
        // code here
        for(char i ='A';i<'A'+n;i++)
        {
            for(char j = 'A';j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}