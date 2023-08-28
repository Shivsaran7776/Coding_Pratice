// Example 1:

// Input:
// N = 5
// arr[] = { 4, 1, 3, 9, 7}
// Output:
// 1 3 4 7 9
// Example 2:

// Input:
// N = 10
// arr[] = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1}
// Output:
// 1 2 3 4 5 6 7 8 9 10

class Solution
{
  static void insert(int arr[],int i,int n)
  {
       // Your code here
       for(i=1;i<n;i++)
       {
           int j=i;
           while(j>0 && arr[j-1]>=arr[j])
           {
               int temp = arr[j];
               arr[j] = arr[j-1];
               arr[j-1] = temp;
               
               j--;
           }
       }
  }
  //Function to sort the array using insertion sort algorithm.
  public void insertionSort(int arr[], int n)
  {
      //code here
      insert(arr,0,n);
  }
}