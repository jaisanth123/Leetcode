class Solution {

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root == null)
            return res;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        boolean rf=true;

        while(!q.isEmpty()){
            int n = q.size();
            List<Integer> arr= new ArrayList<>();
            for(int i = 0 ; i < n ; i++){
                TreeNode curr = q.poll();
                arr.add(curr.val);
    
                if(curr.right != null )
                    q.add(curr.right);
                if(curr.left != null)
                    q.add(curr.left);
                }

            if(rf){
            Collections.reverse(arr);
            res.add(new ArrayList<>(arr));}
            else
                res.add(new ArrayList<>(arr));

            rf=!rf;
        }

        return res;}}
