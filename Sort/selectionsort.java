import java.util.*;
public class selectionsort{
    public static void main(String[] args){
        int size;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        size = sc.nextInt();
        System.out.println("Enter the array elements:");
        int arr[] = new int[size];
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<size;i++)
        {
            int minIndex = i;
            for(int j=i+1;j<size;j++){
                if(arr[j]<arr[minIndex])
                {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] =  temp;
        }
        System.out.println("After Selection Sort");
        for(int i=0;i<size;i++)
        {
            System.out.println(arr[i]);
        }
        sc.close();
    }
}