// You are given an integer of 'n'.

// Return an array having "Coding Ninjas" 'n' times, without using a loop.

// Input : 'n' = 4

// Output: Coding Ninjas Coding Ninjas Coding Ninjas Coding ninjas

import java.util.List;
public class Print_n_times {
    public static void printNtimes(int n){
        // Write your code here.
        if(n==0)
        {
            return;
        }
        System.out.print("Coding Ninjas"+" ");
        printNtimes(n-1);
    }
}