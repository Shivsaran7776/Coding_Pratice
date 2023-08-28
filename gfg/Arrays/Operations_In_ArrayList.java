// Input Format:
// First line of input contains number of testcase T. For each testcase, first line of input contains Q, number of queries. Next line contains Q queries as:

// a x : inserts the element x at the end of the list.

// i : arrange the list in increasing order.

// d : arrange the list in decreasing order.

// s y : search for the element y in the list and prints the first-index(for duplicate) (0-based indexing) of that in the list. -1 if not found.

// Your Task:
// Your task is to complete the functions insert(), IncOrder(), Search() and DecOrder() such that driver code will be able to perform required queries.

// Example:
// Input:
// 2
// 6
// a 2 a 3 a 4 a 2 i s 2
// 5
// a 2 a 3 a 3 d s 5

// Output:
// 0
// -1

// Helper class to handle functions insert(),
// IncOrder(), Search() and DecOrder()
class Geeks
{
    // Function to insert element into list
    public static void insert(ArrayList<Integer> list, int x)
    {
        // Your code here
        list.add(x);
    }
    
    // Function to sort list in Increasing order
    public static void IncOrder(ArrayList<Integer> list)
    {
        // Your code here
        Collections.sort(list);
    }
    
    // Function to search element in the lise
    // val : element to be searched
    public static void Search(ArrayList<Integer> list, int val)
    {
        
        
        int flag = -1;
        /*
        Your Code here
         * */
        if(list.contains(val))
        {
            flag = list.indexOf(val);
            System.out.println(flag);
        }
        if(flag == -1){
            System.out.println("-1");
        }
        
        
    }
    
    // Function to sort list in decreasing order
    public static void DecOrder(ArrayList<Integer> list)
    {
        // Your code here
        Collections.reverse(list);
    }
}