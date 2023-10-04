// Example-1:
//     Input: 1+(3*6+(9-3))
//     Output: 2

// Example-2:
//    Input : (((((5))))) 
//    Output: 5
 
import java.util.*;                           
class MaximumNestingDepthOfTheParantheses
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(MaxDepthParanthesisChecker(str));
        sc.close();
    }
    
    public static int MaxDepthParanthesisChecker(String s)
    {
        int n = s.length();
        char checker[] = new char[n];
        for(int i=0;i<n;i++)
        {
            checker[i] = s.charAt(i);
        }
        int count = 0;
        int m = 0;
        for(int i=0;i<n;i++)
        {
            if(checker[i] == '(')
            {
                count++;
                m = Math.max(count,m);
            }
            else if(checker[i] == ')')
            {
                count--;
            }
        }
        if(count == 0)
        {
            return m;
        }
        return 0;
    }
}