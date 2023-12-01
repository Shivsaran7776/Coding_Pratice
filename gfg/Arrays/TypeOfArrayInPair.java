// You are given an array of size N having no duplicate elements. The array can be categorized into the following:
// 1.  Ascending
// 2.  Descending
// 3.  Descending Rotated
// 4.  Ascending Rotated
// Your task is to return which type of array it is and the maximum element of that array.

 

// Example 1:

// Input :
// N = 5 
// A[] = { 2, 1, 5, 4, 3}
// Output :
// 5 3
// Explanation:
// Descending rotated with maximum
// element 5 

// Example 2:

// Input :
// N = 5
// A[] = { 3, 4, 5, 1, 2}
// Output : 
// 5 4
// Explanation:
// Ascending rotated with maximum element 5 

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
