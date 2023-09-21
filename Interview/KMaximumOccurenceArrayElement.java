//Find the maximum number of occurence of digit in an array element

//For example:

//Input:

// k = 1
// n = 5

// arr = {11,121,1331,1111,1234}

//The maximum k digit occurence in array is 1111

import java.util.*;
class KMaximumOccurenceInArrayElement
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int cnt = 0;
        int k = sc.nextInt();
        int n = sc.nextInt();
        int arr[] = new int[n];
        int count = 0;
        int max = 0;
        int max_val = 0;
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        sc.close();
        for(int i=0;i<n;i++)
        {
            max = arr[i];
            count = 0;
            int val = max;
            while(val>0)
            {
                int rem = val % 10;
                if(rem==k)
                {
                    count++;
                }
                val /= 10;
            }
            if(count>cnt)
            {
                cnt = count;
                max_val = arr[i];
            }
        }
    System.out.println(cnt+" "+max_val);
    }
}
