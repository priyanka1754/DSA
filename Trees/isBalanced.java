https://www.geeksforgeeks.org/problems/check-for-balanced-tree/1

/* A binary tree node class
class Node
{
    int data;
    Node left,right;

    Node(int d)
    {
        data = d;
        left = right = null;
    }
} */

class Solution {
     public int height(Node root){
        if(root == null) return 0;
        return 1 + Math.max(height(root.left), height(root.right));
    }
    public boolean isBalanced(Node root) {
        // code here
        if(root==null) return true;
        
        int lh=height(root.left);
        int rh=height(root.right);
        
        int diff=Math.abs(lh-rh);
        
        if(diff>1) return false;
        
        return isBalanced(root.left) && isBalanced(root.right);
    }
}
