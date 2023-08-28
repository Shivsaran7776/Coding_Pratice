import java.util.*;
import java.math.*;
class Main{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            String a = sc.next();
            String b = sc.next();
            Solution sol = new Solution();
            System.out.println(sol.multiplyString(a,b));
        }
    }
}
class Solution{
    public String multiplyString(String a,String b)
    {
        BigInteger i1 = new BigInteger(a);
        BigInteger i2 = new BigInteger(b);
        BigInteger res = i1.multiply(i2);
        return res.toString();
    }
} 