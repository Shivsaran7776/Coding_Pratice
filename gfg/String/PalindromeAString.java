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