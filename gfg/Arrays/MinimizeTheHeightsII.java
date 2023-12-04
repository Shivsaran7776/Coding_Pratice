import java.util.*;
class MinimizeTheHeightsII
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int k = sc.nextInt();
        int arr[] = new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i] = sc.nextInt();
        }
        KthMinDifference obj = new KthMinDifference();
        int result = obj.GetMinDiff(arr,size,k);
        System.out.println(result);
        sc.close();
    }
}
class KthMinDifference
{
    public int GetMinDiff(int arr[],int n,int k)
    {
        int min = arr[0];
        int max = arr[n-1];
        int diff = max-min;
        for(int i=1;i<n;i++)
        {
            int a = arr[i-1]+k;
            int b = arr[i]-k;
            if(b<0)
            {
                continue;
            }
        max = Math.max(arr[n-1]-k,a);
        min = Math.min(arr[0]+k,b);
        diff = Math.min(max-min,diff);
        }
        return diff;
    }
}