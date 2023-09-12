// Palindrome number are the number that don't change when reversed.

// Return boolean value true or false.

// Input : 'n' = 51415

// Output : true

import java.util.*;

class PalindromeNumber
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        System.out.println(PalindromeNum(n));
    }
    public static boolean PalindromeNum(int n)
    {
        int val = n;
        int rev = 0;
        while(val>0)
        {
            int rem = n%10;
             rev = (rev*10)+rem;
             val /= 10;
        }
        return(rev==n);
    }
}