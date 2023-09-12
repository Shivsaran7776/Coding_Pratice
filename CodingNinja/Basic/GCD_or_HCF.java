// You are given two integers 'n' and 'm'

// Calculate 'gcd(n,m)', without using library functions.

// Input : 'n' = 6, 'm' = 4

public class GCD_or_HCF {
    public static int calcGCD(int n, int m){
        // Write your code here.
        while(n>0&&m>0)
        {
            if(n>m)
            {
                n = n%m;
            }
            else
            {
                m = m%n;
            }
        }
        if(n==0)
        {
            return m;
        }
        else
        {
            return n;
        }
    }
}