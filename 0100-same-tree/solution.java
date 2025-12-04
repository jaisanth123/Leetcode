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
    private int flag=0;
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(q==null && p==null)   
            return true;
        if((q==null && p!=null) ||(p==null && q!=null) )
            return false;
        if((q.left==null && p.left!=null) ||(p.left==null && q.left!=null)|| (q.right==null && p.right!=null) ||(p.right==null && q.right!=null) ){
            flag=1;
            return false;}
         if(p.val != q.val)
            flag =1;

        isSameTree(p.left , q.left);
        isSameTree(p.right,q.right);
        if(flag==1)
            return false;
        return true;
    }
}
