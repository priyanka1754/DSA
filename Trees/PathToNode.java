https://www.interviewbit.com/problems/path-to-given-node/

Path to Given Node
    
/**
 * Definition for binary tree
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) {
 *      val = x;
 *      left=null;
 *      right=null;
 *     }
 * }
 */
public class Solution {
    public ArrayList<Integer> solve(TreeNode A, int B) {
        ArrayList<Integer> ar=new ArrayList<>();
        FindPath(A,B,ar);
        return ar;
    }
    
    public boolean FindPath(TreeNode A,int B,ArrayList<Integer> ar){
        if(A==null) return false;
        ar.add(A.val);
        if(A.val==B) return true;
        if(FindPath(A.left,B,ar) || FindPath(A.right,B,ar)) return true;
        ar.remove(ar.size()-1);
        return false;
    }
}
