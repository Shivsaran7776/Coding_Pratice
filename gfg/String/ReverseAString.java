// Example 1:

// Input:
// s = Geeks
// Output: skeeG
// Example 2:

// Input:
// s = for
// Output: rof

import java.util.*;
class ReverseAString
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        ReverseString obj = new ReverseString();
        System.out.println(obj.reverse(str));
    }
}
class ReverseString
{
    public static String reverse(String str)
    {
        String newstr = "";
        int len = str.length();
        for(int i=len-1;i>=0;i--)
        {
            newstr += str.charAt(i);
        }
        return newstr;
    }
}

