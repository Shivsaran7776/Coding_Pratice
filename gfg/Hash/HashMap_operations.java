// A query can be of four types:
// 1. a x y (adds an entry with key x and value y to the Hashmap)
// 2. b x (print value of  x if present in the Hashmap else print -1. )
// 3. c (prints the size of the Hashmap)
// 4. d x (removes an entry with key x from the Hashmap)

// Example 1 :

// Input:
// 5 
// a 1 2 a 66 3 b 66 d 1 c 

// Output:
// 3 1 

// Explanation :
// There are five queries. Queries are performed in this order
// 1. a 1 2  --->  map has a key 1 with value 2
// 2. a 66 3 ---> map has a key 66 with value 3
// 3. b 66   ---> prints the value of key 66 if its present in the map ie 3.
// 4. d 1    ---> removes an entry from map with key 1
// 5. c      ---> prints the size of the map ie 1
// Example 2 :

// Input: 
// 3 
// a 1 66 b 5 c

// Output: 
// -1 1

// Explanation :
// There are three queries. Queries are performed in this order
// 1. a 1 66 ---> adds a key 1 with a value of 66 in the map
// 2. b 5    --->  since the key 5 is not present in the map hence -1 is printed.
// 3. c      ---> prints the size of the map ie 1

class GfG
{
    /*Inserts an entry with key x and value y in map */
    void add_Value(HashMap<Integer,Integer> hm, int x, int y)
    {
	//Your code here
	hm.put(x,y);
    }
	
    /*Returns the value with key x from the map */
    int find_value(HashMap<Integer, Integer> hm, int x)
    {
        //Your code here
        return hm.getOrDefault(x,-1);
    }
	
    /*Returns the size of the map */
    int getSize(HashMap<Integer, Integer> hm)
    {
	    //Your code here
	    return hm.size();
    }
		
    /*Removes the entry with key x from the map */	
    void removeKey(HashMap<Integer, Integer> hm, int x)
    {
	    //Your code here
	    hm.remove(x);
    }
}