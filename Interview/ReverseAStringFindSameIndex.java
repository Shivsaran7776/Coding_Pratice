// Question : 01
// --------------
// Given a String S, find the number of characters resides in the same position after reversing a String S.

// Test Case : 01		Test Case : 02

// Input :			    Input :
// S = 'encyclopedia'	S = 'abcdecba'

// Output :		Output : 
// 0			6

import java.util.*;
class ReverseAStringFindSameIndex
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        String revword = "";
        char ch;
        for(int i=0;i<word.length();i++)
        {
            ch = word.charAt(i);
            revword = ch+revword;
        }
        System.out.println(revword);
        int count = 0;
        for(int i=0;i<word.length();i++)
        {
            if(word.charAt(i)==revword.charAt(i))
            {
                count++;
            }
        }
        System.out.println(count);
        sc.close();
    }
}