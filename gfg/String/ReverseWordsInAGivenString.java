// Given a String S, reverse the string without reversing its individual words. Words are separated by dots.

// Example 1:

// Input:
// S = i.like.this.program.very.much
// Output: much.very.program.this.like.i
// Explanation: After reversing the whole
// string(not individual words), the input
// string becomes
// much.very.program.this.like.i
// Example 2:

// Input:
// S = pqr.mno
// Output: mno.pqr
// Explanation: After reversing the whole
// string , the input string becomes
// mno.pqr

import java.util.*;
class ReverseWordsInAString
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        ReverseWords obj = new ReverseWords();
        System.out.println(obj.reverse(str));
        sc.close();
    }
}
class ReverseWords
{
    public static String reverse(String str)
    {
        String arr[] = str.split("[.]");
        String rev = "";
        for(int i=arr.length-1;i>=0;i--)
        {
            if(i==0)
            {
                rev += arr[i];
            }
            else
            {
                rev +=arr[i]+".";
            }
        }
        return rev;
    }
}
