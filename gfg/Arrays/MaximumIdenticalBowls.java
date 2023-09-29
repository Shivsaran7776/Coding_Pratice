// There are N bowls containing cookies. In one operation, you can take one cookie from any of the non-empty bowls and put it into another bowl. If the bowl becomes empty you discard it. You can perform the above operation any number of times. You want to know the maximum number of bowls you can have with an identical number of cookies.

// Example 1:

// Input:
// N = 3
// arr[] = {3, 1, 5}
// Output: 3
// Explanation: We can put 2 cookies one by one from the 
// 3rd bowl and put them into the 2nd bowl.Now the array
// becomes {3, 3, 3}. Each bowl now contains 3 cookies.
// Example 2:

// Input:
// N = 4
// arr[] = {1, 2, 6, 5}
// Output: 2
// Explanation: We can take 6 cookies one by one from the 
// 3rd bowl and put them into 1st bowl, now the array becomes 
// {7, 2, 0, 5}. We discard the 3rd array as it becomes
//  empty. Hence, arr={7, 2, 5}. Now, we take 5 cookies 
// one by one from 3rd bowl and put them into the 2nd bowl. 
// Hence arr={7, 7, 0}. Discarding 3rd empty bowl, number of 
// bowls containing identical number of cookies i.e 7 is 2.

import java.util.*;
class MaximumIdenticalBowls
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i] = sc.nextInt();
        }
        MaximumValueBowls obj = new MaximumValueBowls();
        System.out.println(obj.GetMaximum(arr,size));
        sc.close();
    }
}
class MaximumValueBowls
{
    public static int GetMaximum(int arr[],int n)
    {
        long sum = 0;
        for(int i=0;i<n;i++)
        {
            sum += arr[i];
        }
        while(sum%n!=0)
        {
            n--;
        }
        return n;
    }
}