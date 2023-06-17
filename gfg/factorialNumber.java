import java.util.*;
import java.io.*;

class fNum
{
    int fNum(int fact)
    {
        int res = 1;
        if(fact==1||fact==2)
        {
            return 1;
        }
        for(int i=2;i<=fact;i++)
        {
            res *=i;
            if(fact==res)
            {
                return 1;
            }
        }
        return 0;
    }
}
public class factorialNumber {
    public static void main(String[] args)throws IOException 
    {
        Scanner sc = new Scanner(System.in);
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the no.of times loop to iterated:");
        int times = Integer.parseInt(read.readLine());
        while(times>0)
        {
            int fact = Integer.parseInt(read.readLine());
            fNum obj = new fNum();
            System.out.println(obj.fNum(fact));
            times--;
        }
        sc.close();
    }
}