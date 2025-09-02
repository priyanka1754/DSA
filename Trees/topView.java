https://www.geeksforgeeks.org/problems/top-view-of-binary-tree/1

Top View of Binary Tree

/*
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}
*/

class Solution {
    static class Pair {
        Node node;
        int hd;
        Pair(Node node, int hd){
            this.node = node;
            this.hd = hd;
        }
    }
    // Function to return a list of nodes visible from the top view
    // from left to right in Binary Tree.
    static ArrayList<Integer> topView(Node root) {
        ArrayList<Integer> result = new ArrayList<>();
        if (root == null) return result;

        // Map: horizontal distance → node data
        TreeMap<Integer, Integer> tm = new TreeMap<>();
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(root, 0));

        while(!q.isEmpty()){
            Pair cur = q.poll();
            Node node = cur.node;
            int hd = cur.hd;

            // only add the first node we see at this horizontal distance
            if(!tm.containsKey(hd)){
                tm.put(hd, node.data);
            }

            if(node.left != null) q.add(new Pair(node.left, hd-1));
            if(node.right != null) q.add(new Pair(node.right, hd+1));
        }

        // collect results in order
        for(int val : tm.values()){
            result.add(val);
        }

        return result;
    }
}
