https://leetcode.com/problems/diameter-of-binary-tree/description/

543. Diameter of Binary Tree

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
    public int height(TreeNode root){
        if(root==null) return 0;
        return 1+Math.max(height(root.left),height(root.right));
    }
    public int diameterOfBinaryTree(TreeNode root) {
        int ans=0;
        if(root==null) return 0;
        int lh=height(root.left);
        int rh=height(root.right);
        int diameter=lh+rh;
        int leftDiameter=diameterOfBinaryTree(root.left);
        int rightDiameter=diameterOfBinaryTree(root.right);
        return Math.max(diameter,Math.max(leftDiameter,rightDiameter));
    }
}
