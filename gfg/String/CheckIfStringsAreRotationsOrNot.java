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