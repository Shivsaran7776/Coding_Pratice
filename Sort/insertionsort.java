import java.util.*;
public class insertionsort {
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
            for(int i=1;i<size;i++)
            {
                int j = i;
                int temp = arr[i];
                while(j>0 && arr[j-1]>temp)
                {
                    arr[j]=arr[j-1];
                    j--;
                }
                arr[j] = temp; 
            }
            System.out.println("After Insertion Sort:");
            for(int i=0;i<size;i++){
                System.out.println(arr[i]);
            }
            sc.close();
        }
}

