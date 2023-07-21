Example 1:

Input:
N = 5
Output:
120
Explanation:
5*4*3*2*1 = 120
Example 2:

Input:
N = 4
Output:
24
Explanation:
4*3*2*1 = 24

class Solution{
    static long factorial(int N){
        int fact =1;
        if(N==1||N==0)
        {
            return 1;
        }
        return N*factorial(N-1);
    }
}