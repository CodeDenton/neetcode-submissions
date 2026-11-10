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
    public List<Integer> rightSideView(TreeNode root) {
        /*
        bfs, add nodes at each level to queue
        while less than size make node rightMost
        add left first so right nodes overwrite

        O(N) time
        O(N) space
        */
        List<Integer> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if(root == null) return result;
        queue.offer(root);
        while(!queue.isEmpty()) {
            int size = queue.size();
            TreeNode rightMost = null;
            for(int i=0; i<size; i++) {
                TreeNode curr = queue.poll();
                if(curr != null) {
                    rightMost = curr;
                    queue.offer(curr.left);
                    queue.offer(curr.right);
                }
            }
            if(rightMost != null) result.add(rightMost.val);
        }
        return result;
    }
}
