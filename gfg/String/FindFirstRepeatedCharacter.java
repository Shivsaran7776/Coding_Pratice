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