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
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        if (nums == null || nums.length == 0) {
            return null;
        }

        int maxIndex = find(nums);

        TreeNode root = new TreeNode(nums[maxIndex]);

        int[] leftSubarray = Arrays.copyOfRange(nums, 0, maxIndex);
        int[] rightSubarray = Arrays.copyOfRange(nums, maxIndex + 1, nums.length);

        root.left = constructMaximumBinaryTree(leftSubarray);
        root.right = constructMaximumBinaryTree(rightSubarray);

        return root;
    }

    public int find(int[] num) {
        int maxIndex = 0; 
        for (int i = 1; i < num.length; i++) { 
            if (num[i] > num[maxIndex]) { 
                maxIndex = i; 
            }
        }
        return maxIndex;
    }
}