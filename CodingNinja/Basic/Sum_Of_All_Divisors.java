// You are given an integer 'n'

// Function 'sumOfDivisors(n)' is defined as the sum of all divisors of 'n'.

// Find the sum of 'sumOfDivisros(i)' for all 'i' from 1 to 'n'.

// Input : 'n' = 5

// Output : 21

// (1) = 1
// (2) = 2+1=3
// (3) = 3+1=4
// (4) = 1+2+4=7
// (5) = 5+1=6

// SumOfAllDivisor = 1+3+4+7+6=21 

public class Sum_Of_All_Divisors {
    public static int sumOfAllDivisors(int n){
        // Write your code here.
        int sum = 0;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j*j<=i;j++)
            {
                if(i%j==0)
                {
                    sum +=j;
                    if(i/j!=j)
                    {
                        sum +=i/j;
                    }
                }
            }
        }
        return sum;
    }
}