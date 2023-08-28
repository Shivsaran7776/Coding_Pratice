// Example 1:

// Input:
// S = hello
// Output: h
// Explanation: In the given string, the
// first character which is non-repeating
// is h, as it appears first and there is
// no other 'h' in the string.
// Example 2:

// Input:
// S = zxvczbtxyzvy
// Output: c
// Explanation: In the given string, 'c' is
// the character which is non-repeating.

class Solution
{
    //Function to find the first non-repeating character in a string.
    static char nonrepeatingCharacter(String S)
    {
        //Your code here
        LinkedHashMap<Character,Integer> map = new LinkedHashMap<>();
        for(int i=0; i<S.length(); i++){
            map.put(S.charAt(i),map.getOrDefault(S.charAt(i),0)+1);
        } 
        
        for(Map.Entry<Character,Integer>entry : map.entrySet()){
            if(entry.getValue()==1){
                return entry.getKey();
            }
        }
        return '$';
    }
}