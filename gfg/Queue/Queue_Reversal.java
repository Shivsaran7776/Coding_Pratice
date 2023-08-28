// Input:
// 6
// 4 3 1 10 2 6
// Output: 
// 6 2 10 1 3 4
// Explanation: 
// After reversing the given elements of the queue , the resultant queue will be 6 2 10 1 3 4.

class GfG{
    //Function to reverse the queue.
    public Queue<Integer> rev(Queue<Integer> q){
        //add code here.
        int size = q.size();
        int arr[] = new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i] = q.remove();
        }
        for(int i=size-1;i>=0;i--)
        {
            q.add(arr[i]);
        }
        return q;
    }
}