class Solution
{
    //Function to count nodes of a linked list.
    public static int getCount(Node head)
    {
        
        Node temp = head;
        int count = 0;
        while(temp!=null)
        {
            count++;
            temp = temp.next;
        }
        return count;
    }
}