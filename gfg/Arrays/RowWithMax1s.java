// Given a boolean 2D array of n x m dimensions where each row is sorted.
// Find the 0-based index of the first row that has the maximum number of 1's.

// Example 1:

// Input: 
// N = 4 , M = 4
// Arr[][] = {{0, 1, 1, 1},
//           {0, 0, 1, 1},
//           {1, 1, 1, 1},
//           {0, 0, 0, 0}}
// Output: 2
// Explanation: Row 2 contains 4 1's (0-based
// indexing).

// Example 2:

// Input: 
// N = 2, M = 2
// Arr[][] = {{0, 0}, {1, 1}}
// Output: 1
// Explanation: Row 1 contains 2 1's (0-based
// indexing).

import java.util.*;
class RowWithMax1s
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int arr[][] = new int[r][c];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        sc.close();
        Max1sInRow obj = new Max1sInRow();
        System.out.println(obj.Count1s(arr,r,c));
    }
}
class Max1sInRow
{
    public int Count1s(int arr[][],int r,int c)
    {
        int count = 0;
        int res = -1;
        int max = 0;
        for(int i=0;i<r;i++)
        {
            count = 0;
            for(int j=0;j<c;j++)
            {
                if(arr[i][j]==1)
                {
                    count++;
                }
            }
            if(count>max)
            {
                max = count;
                res = i;
            }
        }
        return res;
    }
}