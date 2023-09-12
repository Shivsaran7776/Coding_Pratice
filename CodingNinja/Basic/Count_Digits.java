//Find the number of the digits of 'n' that evenly divide ' n'.abstract

//Input: n = 336

//Output: 3

//336 is divisible by both '3' and '6'. Since '3' occurs twice it is counted two times.

import java.util.*;
public class Count_Digits{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int val = sc.nextInt();
        System.out.println(countDigits(val));
        sc.close();
    }
    public static int countDigits(int n){
        // Write your code here.
        int val = n;
        int count = 0;
        while(val>0)
        {
            int rem = val%10;
            if(rem!=0&&n%rem==0)
            {
                count++;
            }
            val = val/10;
        }
        return count;
    }
}