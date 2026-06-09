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
    private int count = 0;
    private int value = 0;
    public int kthSmallest(TreeNode root, int k) {
        travel(root, k);
        return value;
    }

    private void travel(TreeNode curr, int k) {
        if (curr == null) return;
        travel(curr.left, k);
        count++;
        if (count == k) {
            value = curr.val;
            return;
        }
        travel(curr.right, k);
        return;
    }
}