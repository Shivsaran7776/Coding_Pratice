// You are given two strings of equal lengths, s1 and s2. The task is to check if s2 is a rotated version of the string s1.

// Note: The characters in the strings are in lowercase.

// Example 1:

// Input:
// geeksforgeeks
// forgeeksgeeks
// Output: 
// 1
// Explanation: s1 is geeksforgeeks, s2 is
// forgeeksgeeks. Clearly, s2 is a rotated
// version of s1 as s2 can be obtained by
// left-rotating s1 by 5 units.
// Example 2:

// Input:
// mightandmagic
// andmagicmigth
// Output: 
// 0
// Explanation: Here with any amount of
// rotation s2 can't be obtained by s1.
// Your Task:
// You don't have to read or print anything. The task is to complete the function areRotations() which takes two strings, s1 and s2 as inputs and checks if the two strings are rotations of each other. The function returns true if s1 can be obtained by rotating s2, else it returns false.

// Expected Time Complexity: O( |s1| ).
// Expected Space Complexity: O( |s1| ).

import java.util.*;
class CheckIfStringsAreRotationsOrNot
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        Solution obj = new Solution();
        if(obj.check(str1,str2))
        {
         System.out.println("1");   
        }
        else
        {
            System.out.println("0");
        }
        sc.close();
    }
}
class Solution
{
    public static boolean check(String s1,String s2)
    {
        s1 = s1+s1;
        return s1.contains(s2);
    }
}