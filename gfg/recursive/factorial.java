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