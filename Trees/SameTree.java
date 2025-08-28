https://leetcode.com/problems/same-tree/

100. Same Tree

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
    private void postorder(TreeNode root, List<Integer> list) {
        if (root == null) {
            list.add(null); 
            return;
        }
        postorder(root.left, list);
        postorder(root.right, list);
        list.add(root.val);
    }

    public boolean isSameTree(TreeNode p, TreeNode q) {
        List<Integer> plist = new ArrayList<>();
        List<Integer> qlist = new ArrayList<>();
        postorder(p, plist);
        postorder(q, qlist);
        return plist.equals(qlist);  
    }
}


//another method..
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null && q==null) return true;
        if(p==null || q==null) return false;
        if(p.val!=q.val) return false;
        return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
    }
}
