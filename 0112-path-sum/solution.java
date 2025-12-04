/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
        boolean flag = false;
    public boolean hasPathSum(TreeNode root, int ts) {
        int sum =0;
        
        helper(root,ts,sum);
        return flag;
    }
    public void helper(TreeNode root, int ts, int sum) {
        if(flag==true)
            return;
        if(root==null )
            return ;
        
        sum+=root.val;
        if (sum ==ts && root.left==null && root.right==null){
            flag=true;
            return ;
            }
        
        helper(root.left,ts,sum);
        helper(root.right,ts,sum);
    }
}
