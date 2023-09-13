// Print fibonacci series

// Given an integer 'n', return first n Fibonacci numbers using a generator function.

// Input : 'n' = 5

// Output : 0 1 1 2 3

public class Fibonacci_Series {
    public static int[] generateFibonacciNumbers(int n) {
        // Write your code here.
        int sum = 0;
        int arr[] = new int[n];
        arr[0] = 0;
        if(n<2)
        {
            return arr;
        }
        arr[1] = 1;
        for(int i=2;i<n;i++)
        {     
            arr[i] = arr[i-1]+arr[i-2];  
            if(arr[i]==sum)
            {
                arr[i] = sum;
            }
        }
        return arr;
    }
}