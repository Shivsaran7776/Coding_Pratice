// Example 1:

// Input: S="geeksforgeeks"
// Output: e
// Explanation: 'e' repeats at third position.
 

// Example 2:

// Input: S="hellogeeks"
// Output: l
// Explanation: 'l' repeats at fourth position.

class Solution 
{ 
    String firstRepChar(String s) 
    { 
        // code here
        String res = "";
        ArrayList<Character> al = new ArrayList<>();
        for(int i=0;i<s.length();i++)
        {
            if(al.contains(s.charAt(i))){
                res+=s.charAt(i);
                return res;
            }
            else
            {
                al.add(s.charAt(i));
            }
        }
        return "-1";
    }
} 