// A query can be of five types 
// 1. a x (Adds an element x to the ArrayList A at the end )
// 2. b (Sorts the ArrayList A in ascending order )
// 3. c (Reverses the ArrayList A)
// 4. d (prints the size of the ArrayList)
// 5. e (prints space separated values of the ArrayList)
// 5. f  (Sorts the ArrayList A in descending order)

// Example:

// Input
// 2
// 6
// a 4 a 6 a 7 b c e
// 4
// a 55 a 11 d e
 
// Output
// 7 6 4
// 2 55 11

// Explanation :
// For the first test case
// There are six queries. Queries are performed in this order
// 1. a 4 { ArrayList has 4  }
// 2. a 7 {ArrayList has 7 }
// 3. a 6 {ArrayList has 6}
// 4. b {sorts the ArrayList in ascending order, ArrayList now is 5 6 7}
// 5. c {reverse the ArrayList}
// 6. e {prints the element of the ArrayList 7 6 4}

// For the sec test case 
// There are four queries. Queries are performed in this order
// 1. a 55  (ArrayList A has 55}
// 2. a 11  (ArrayList A has 55 ,11}
// 3. d      (prints the size of the ArrayList A ie. 2 )
// 4. e      (prints the elements of the ArrayList A ie 55 11)

class GfG
{
    /*inserts an element x at 
    the back of the ArrayList A */
    void add_to_ArrayList(ArrayList<Integer> A, int x)
    {
	    // Your code here
	    A.add(x);
    }	
	
    /*sort the ArrayList A in ascending order*/
    void sort_ArrayList_Asc(ArrayList<Integer> A)
    {
	    // Your code here
	    A.sort(Comparator.naturalOrder());
    }
	
    /*reverses the ArrayList A*/
    void reverse_ArrayList(ArrayList<Integer> A)
    {
	    // Your code here
	    Collections.reverse(A);
    }
	
    /*returns the size of the ArrayList A */
    int size_Of_ArrayList(ArrayList<Integer> A)
    {
	    // Your code here
	    int d = A.size();
	    return d;
    }
	
    /*sorts the ArrayList A in descending order*/
    void sort_ArrayList_Desc(ArrayList<Integer> A)
    {
	    // Your code here
	    A.sort(Comparator.reverseOrder());
    }
	
    /*prints space separated 
    elements of ArrayList A*/
    void print_ArrayList(ArrayList<Integer> A)
    {
        // Your code here
        for(Integer i:A)
	    {
	        System.out.print(i+" ");
	    }
    }
}