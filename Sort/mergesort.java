import java.util.*;
public class mergesort {
    void sort(int arr[],int l,int r)
    {
        if(l<r)
        {
            int mid =l+r/2;
            merge(arr,l,mid,r); 
        }
    }
    void merge(int arr[],int low,int mid,int high)
    {
        int h = low;
        int i = low;
        int j = mid+1;
        int l = mid-low+1;
        int r = high-mid;
        int left[] = new int[l];
        int right[] = new int[r];
        while(h <= mid && j <= high)
        {
            if(arr[h] < arr[j])
            {
                left[i] = arr[i];
                h = h+1;
            }
            else
            {
                right[i] = arr[j];
                j = j+1;
            }
            i = i+1;
        }
        if(h > mid)
        {
            for(int k =j;k<=high;k++)
            {
                arr[i] = left[k];
                i = i+1;
            }
        }
        else
        {
            for(int k =h;k<=mid;k++)
            {
                arr[i] = right[k];
                i = i+1;
            }
        }
    }
    void static printSort(int arr[])
    {

    }
    public static void main(String[] args)
    {
        int size;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter array elements:");
        for(int i=0;i<size;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("After merge sort:");
        mergesort obj = new mergesort();
        obj.sort(arr, 0, arr.length-1);
        
        sc.close();
    }
}
