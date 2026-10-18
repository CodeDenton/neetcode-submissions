/*
Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node cloneGraph(Node node) {
        HashMap<Node, Node> prevMap = new HashMap<>();
        
        return dfs(node, prevMap);
    }

    public Node dfs(Node node, Map<Node, Node> prevMap) {
        if(node == null) {
            return null;
        }

        if(prevMap.containsKey(node)) {
            return prevMap.get(node);
        }
        Node copy = new Node(node.val);
        prevMap.put(node, copy);

        for(Node n : node.neighbors) {
            copy.neighbors.add(dfs(n, prevMap));
        }

        return copy;
    }
}