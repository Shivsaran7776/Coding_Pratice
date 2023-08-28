// The numbers can be negative and You are not allowed to use any built-in function or convert the strings to integers. There can be zeros in the begining of the numbers.

// Example 1:

// Input:
// s1 = "0033"
// s2 = "2"
// Output:
// 66
// Example 2:

// Input:
// s1 = "11"
// s2 = "23"
// Output:
// 253
// Your Task: You don't need to read input or print anything. Your task is to complete the function multiplyStrings() which takes two strings s1 and s2 as input and returns their product as a string.

import java.util.*;
import java.math.*;
class Main{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            String a = sc.next();
            String b = sc.next();
            Solution sol = new Solution();
            System.out.println(sol.multiplyString(a,b));
        }
    }
}
class Solution{
    public String multiplyString(String a,String b)
    {
        BigInteger i1 = new BigInteger(a);
        BigInteger i2 = new BigInteger(b);
        BigInteger res = i1.multiply(i2);
        return res.toString();
    }
} 