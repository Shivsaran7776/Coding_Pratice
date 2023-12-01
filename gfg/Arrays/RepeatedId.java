// Geek is given a task to select at most 10 employees for a company project. Each employee is represented by a single digit ID number 
// which is unique for all the selected employees for the project. Geek has a technical problem in his system which printed ID number 
// multiple times. You are given array a[ ] of N elements having all printed IDs. Help him to get rid of the repeated IDs.

// Example 1:

// Input:
// N = 5
// a[ ] = {8, 8, 6, 2, 1}
// Output:
// 8 6 2 1
// Example 2:

// Input:
// N = 6
// a[ ] = {7, 6, 7, 4, 2, 7}
// Output:
// 7 6 4 2
// Your Task:  
// You don't need to read input or print anything. Your task is to complete the function uniqueId() which takes the array a[] and its 
// size N as input parameters and returns the list containing non repeated IDs of employees in the same sequence they appear.

import java.util.*;
class RepeatedIDs
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        long size = sc.nextInt();
        long array[] = new long[(int) size];
        for(int i=0;i<size;i++)
        {
            array[i] = sc.nextInt();
        }
        RemoveId obj = new RemoveId();
        long arr[] = obj.uniqueId(array,size);
        StringBuilder sb = new StringBuilder();
        for(long i:arr)
        {
            sb.append(i+" ");
        }
        System.out.println(sb);
        sc.close();
    }
}
class RemoveId
{
    public long[] uniqueId(long arr[],long n)
    {
        ArrayList<Long> al = new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            if(!(al.contains(arr[i])))
            {
                al.add(arr[i]);
            }
        }
        long arr2[] = new long[(int)al.size()];
        for(int i=0;i<al.size();i++)
        {
            arr2[i] = al.get(i);
        }
        return arr2;
    }
}