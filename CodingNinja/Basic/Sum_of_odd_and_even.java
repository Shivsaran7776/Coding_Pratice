// Digits mean numbers ,not placed!
// That is,if the given integer is "123456",
// even digits are 2,4, and 6, and odd digits are 1,3 and 5.

import java.util.*;
public class Sum_of_odd_and_even {
	
	public static void main(String[] args) {
		// Write your code here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int odd = 0;
		int even = 0;
		sc.close();
		while(n>0)
		{
			int rem = n%10;
			if(rem % 2 == 0)
			{
				even += rem;
			}
			else
			{
				odd += rem;
			}
			n = n/10;
		}
		System.out.println(even+" "+odd);
	}
}
