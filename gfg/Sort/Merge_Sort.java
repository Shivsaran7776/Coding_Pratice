// Example 1:

// Input:
// N = 5
// arr[] = {4 1 3 9 7}
// Output:
// 1 3 4 7 9
// Example 2:

// Input:
// N = 10
// arr[] = {10 9 8 7 6 5 4 3 2 1}
// Output:
// 1 2 3 4 5 6 7 8 9 10

class Solution
{
    void merge(int arr[], int low, int mid, int high)
    {
         // Your code here
         
         //Setting up auxillary arrays
         
         int n1=mid-low+1;
         int n2=high-mid;
         
         int arr1[] = new int[n1];
         int arr2[] = new int[n2];
         
         for(int i=0;i<n1;i++){
             arr1[i]=arr[low+i];
         }
         
         for(int i=0;i<n2;i++){
             arr2[i]=arr[mid+1+i];
         }
         
         
         //merge two sorted arrays
         int i=0,j=0,k=low;
         while(i<n1 && j<n2){
             if(arr1[i]<=arr2[j]){
                 arr[k]=arr1[i];
                 i++;
                 k++;
             }
             else{
                 arr[k]=arr2[j];
                 j++;
                 k++;
             }
         }
         
         while(i<n1){
             arr[k]=arr1[i];
             i++;
             k++;
         }
         while(j<n2){
             arr[k]=arr2[j];
             j++;
             k++;
         }
    }
    void mergeSort(int arr[], int l, int r)
    {
        //code here
        if(l<r){
            int mid=(l+r)/2;
            mergeSort(arr,l,mid);
            mergeSort(arr,mid+1,r);
            merge(arr,l,mid,r);
        }
    }
}