Example 1:

Input: S = "abba"
Output: 1
Explanation: S is a palindrome
Example 2:

Input: S = "abc" 
Output: 0
Explanation: S is not a palindrome

package String;
class Solution {
    int isPalindrome(String S) {
        // code here
        String reverse="";
        int length = S.length();
        for(int i=length-1;i>=0;i--)
        {
            reverse = reverse+S.charAt(i);   
        }
        if(S.equals(reverse))
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
}