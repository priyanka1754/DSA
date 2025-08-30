https://leetcode.com/problems/binary-tree-maximum-path-sum/

124. Binary Tree Maximum Path Sum

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
    static int ans;
    public int maxPathSum(TreeNode root) {
        ans=Integer.MIN_VALUE;
        helper(root);
        return ans;
    }
    public int helper(TreeNode root){
        if(root==null) return 0;
        int left=Math.max(helper(root.left),0);
        int right=Math.max(helper(root.right),0);
        ans=Math.max(ans,root.val+left+right);
        return root.val+Math.max(left,right);
    }
}
