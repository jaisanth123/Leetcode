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
    boolean flag = true ;
    public boolean isSymmetric(TreeNode root) {
        
        helper(root.left ,root.right );
        return flag;
    }
    void helper (TreeNode p , TreeNode q){
        if(!flag)
            return ;
        if(p==null || q==null)
        {
            if((p==null && q!=null) ||(q==null && p!=null)){
                flag = false;
                return;
            }
            return ;
        }
        if(q.val != p.val)
            flag = false;
        helper(p.left ,q.right);
        helper(p.right ,q.left);
    }
}
