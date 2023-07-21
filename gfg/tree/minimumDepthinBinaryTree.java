Example 1:

Input:
 root  -->     1
             /   \
            3     2
           /
          4           
Output: 3
Explanation:
Maximum depth is between nodes 1 and 4, which is 3.
Example 2:

Input:
 root -->    10
           /    \
          20    30
           \      \  
           40     60
                  /
                 2 
Output: 4
Explanation:
Maximum depth is between nodes 10 and 2, which is 4

package tree;
class Solution
{
	int minDepth(Node root)
	{
	    //code here
	    if(root==null)
	        return 0;
	    int left = minDepth(root.left);
	    int right = minDepth(root.right);
	    if(left==0||right==0)
	        return Math.max(left,right)+1;
	    return Math.min(left,right)+1;
	}
}