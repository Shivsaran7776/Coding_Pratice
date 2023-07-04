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