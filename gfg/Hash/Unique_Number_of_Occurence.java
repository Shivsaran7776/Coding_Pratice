// Input:
// N = 5
// arr = [1, 1, 2, 5, 5]
// Output:
// false
// Explanation:
// The array contains 2 (1’s), 1 (2’s) and 2 (5’s), since the number of frequency of 1 and 5 are the same i.e. 2 times. Therefore, this array does not satisfy the condition.

// Input:
// N = 10
// arr = [2, 2, 5, 10, 1, 2, 10, 5, 10, 2]
// Output:
// true
// Explanation:
// Number of 1’s -> 1
// Number of 2’s -> 4
// Number of 5’s -> 2
// Number of 10’s -> 3.
// Since, the number of occurrences of elements present in the array is unique. Therefore, this array satisfy the condition.

class Solution {
    public static boolean isFrequencyUnique(int n, int[] arr) {
        // code here
        HashMap<Integer,Integer> hm = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<n;i++)
        {
            if(hm.containsKey(arr[i]))
            {
                hm.put(arr[i],hm.get(arr[i])+1);
            }
            else
            {
                hm.put(arr[i],1);
            }
        }
        for(Map.Entry<Integer,Integer> e:hm.entrySet())
        {
            set.add(e.getValue());
        }
        return set.size()==hm.size();
    }
}