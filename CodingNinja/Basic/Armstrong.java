// You are given an integer 'n'.

// Return 'true' if 'n' is an Armstrong number,and 'false' otherwise.

// Input : 'n' = 1634

// Output : true

// 1^4+6^4+3^4+4^4=1634

import java.util.*;
public class Armstrong {
	
	public static void main(String[] args) {
		// Write your code here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = countDigits(n);
		System.out.println(Armstrong(n,k));
		sc.close();
	}
	public static int countDigits(int n)
	{
		int val = n;
		int count = 0;
		while(val>0)
		{
			int rem = val%10;
			count++;
			val /= 10;
		}
		return count;
	}
	public static boolean Armstrong(int n,int k)
	{
		int val = n;
		int arm = 0;
		while(val>0)
		{
			int rem = val%10;
			arm += Math.pow(rem,k);
			val /=10;
		}
		return(arm==n);
	}
}
