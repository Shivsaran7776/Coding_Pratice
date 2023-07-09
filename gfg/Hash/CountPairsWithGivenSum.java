class Solution {
    int getPairsCount(int[] arr, int n, int k) {
        // code here
        HashMap<Integer,Integer> hm = new HashMap<>();
        int count=0;
        for(int i=0;i<n;i++)
        {
            int complement = k-arr[i];
            
            if(hm.containsKey(complement))
            {
                count+=hm.get(complement);
            }
            hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
        }
        return count;
    }
}