import java.util.*;
public class bubblesort{
    public static void main(String[] args)
    {
        int size;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        size = sc.nextInt();
        int arr[]= new int[size];
        System.out.println("Enter the array elements:");
        for(int i=0;i<size;i++)
        {
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<size;i++)
        {
            int temp = 0;
            for(int j=1;j<size;j++)
            {
                if(arr[j-1]<arr[j])
                {
                    temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
        System.out.println("After Bubble Sort:");
        for(int i=size-1;i>=0;i--)
        {
            System.out.println(arr[i]);
        }
        sc.close();
    }
}