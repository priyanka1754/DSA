https://www.geeksforgeeks.org/problems/bottom-view-of-binary-tree/1

Bottom View of Binary Tree
  
/*
class Node
{
    int data; //data of the node
    int hd; //horizontal distance of the node
    Node left, right; //left and right references

    // Constructor of tree node
    public Node(int key)
    {
        data = key;
        hd = Integer.MAX_VALUE;
        left = right = null;
    }
}
*/

class Solution {
    static class Pair {
        Node node;
        int hd;
        Pair(Node node, int hd) {
            this.node = node;
            this.hd = hd;
        }
    }
    public ArrayList<Integer> bottomView(Node root) {
        // Code here
         ArrayList<Integer> result = new ArrayList<>();
        if (root == null) return result;

        TreeMap<Integer, Integer> tm = new TreeMap<>();
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(root, 0));

        while(!q.isEmpty()){
            Pair cur = q.poll();
            Node node = cur.node;
            int hd = cur.hd;

            // For bottom view, we overwrite always
            tm.put(hd, node.data);

            if(node.left != null) q.add(new Pair(node.left, hd-1));
            if(node.right != null) q.add(new Pair(node.right, hd+1));
        }

        for(int val : tm.values()){
            result.add(val);
        }

        return result;
    }
}
