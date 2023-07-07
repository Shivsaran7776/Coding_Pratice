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