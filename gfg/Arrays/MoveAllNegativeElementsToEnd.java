import java.util.*;

class MoveAllNegativeElementsToEnd {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        SegregateElements obj = new SegregateElements();
        obj.NegToEnd(arr, n); 

        StringBuilder sb = new StringBuilder();
        for (int i : arr) {
            sb.append(i + " ");
        }
        System.out.println(sb);
        sc.close();
    }
}

class SegregateElements {

    public void NegToEnd(int arr[], int n) {
        int arr2[] = new int[n];
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                arr2[j] = arr[i];
                j++;
            }
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                arr2[j] = arr[i];
                j++;
            }
        }
        for (int i = 0; i < n; i++) {
            arr[i] = arr2[i];
        }
    }
}