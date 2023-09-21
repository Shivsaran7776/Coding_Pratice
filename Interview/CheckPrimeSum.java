//Number = 212
//extract each digit and find the number is prime or not
//Sum = 2+1+2 =5 [5 is a prime number]

import java.util.*;
class PrimeCheckSum
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean flag = false;
        int sum = 0;
        int val = n;
        while(val>0)
        {
            int rem = val%10;
            sum += rem;
            val /= 10;
        }
        for(int i=2;i<=sum/2;++i)
        {
            if(sum%i==0)
            {
                flag = true;
                break;
            }
        }
        if(!flag)
        {
            System.out.println("Hooray");
        }
        else
        {
            System.out.println("Not Hooray");
        }
    }
}