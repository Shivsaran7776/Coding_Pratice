package String;
class Solution
{
    //Function to find the first non-repeating character in a string.
    static char nonrepeatingCharacter(String S)
    {
        //Your code here
        int count =1;
        for(int i=0;i<S.length();i++)
        {
            if(S.charAt(i)==S.charAt(i+1))
            {
                continue;
            }
            else
            {
                return (S.charAt(i));
            }
        }
        return '$';
    }
}