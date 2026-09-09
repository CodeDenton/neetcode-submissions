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
    public int kthSmallest(TreeNode root, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        if(root == null) return 0; // edge case?
        addNodes(minHeap, root);   

        int count = 1;
        while(count < k) {
            minHeap.poll();
            count++;
        }
        int result = minHeap.poll();
        return result;   

    }

    public void addNodes(PriorityQueue<Integer> minHeap, TreeNode root) {
        if(root == null) return;

        minHeap.offer(root.val);
        addNodes(minHeap, root.left);
        addNodes(minHeap, root.right);
    }
}
