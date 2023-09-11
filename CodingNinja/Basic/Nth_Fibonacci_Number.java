// The nth term of the Fibonacci series F(n),where F(n) 
// is a function, is calculated using the following formula

// F(n) = F(n-1) + F(n-2),
// Where, F(1) = 1, F(2) = 1

// Input :  6
// Output : 8

import java.util.*;
public class Nth_Fibonacci_Number {

	static int Fib(int n)
	{
		if(n==1||n==2)
		{
			return 1;
		}
		else
		{
			return Fib(n-1) + Fib(n-2);
		}
	}
	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
		Scanner sc = new Scanner(System.in);
		int n;
		n = sc.nextInt();
		System.out.println(Fib(n));
	}
}
