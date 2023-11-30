import java.util.*;
import java.lang.*;

class pair {
    public int first;
    public int second;

    public pair(int first, int second) {
        this.first = first;
        this.second = second;
    }
}
class TypeOfArrayInPair {
    public static void main(String args[])
 
{
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new
 
int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        MaxNType obj = new MaxNType();
        pair product = obj.TypeOfArray(arr, size);
        System.out.println(product.second + " " + product.first);
        sc.close();
    }
}

class MaxNType {
    static pair TypeOfArray(int arr[], int size) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int type = 0;

        for (int i = 0; i < size; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }

            if (arr[i] < min) {
                min = arr[i];
            }
        }

        if (arr[0] == min && arr[size - 1] == max) {
            type = 1;
        } else if (arr[0] == max && arr[size - 1] == min) {
            type = 2;
        } else if (arr[0] < arr[size - 1]) {
            type = 3; // Modified logic for case 3
        } else if (arr[0] > arr[size - 1]) {
            type = 4; // Modified logic for case 4
        }

        return new pair(type, max);
    }
}
