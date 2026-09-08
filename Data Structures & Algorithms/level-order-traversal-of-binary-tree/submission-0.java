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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        addNodes(result, root, 0);
        return result;
    }

    public void addNodes(List<List<Integer>> list, TreeNode root, int depth) {
        if(root == null) {
            return;
        }

        if(depth == list.size()) {
            list.add(new ArrayList<>());
        }
        list.get(depth).add(root.val);
        addNodes(list, root.left, depth+1);
        addNodes(list, root.right, depth+1);

    }
}
