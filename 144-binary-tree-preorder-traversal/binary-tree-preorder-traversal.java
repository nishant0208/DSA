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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
       preorder(root,result);
       return result;
    }
    static void preorder(TreeNode root, List<Integer> res)
    {
        if (root == null) return;
        res.add(root.val);
        preorder(root.left,res);
        preorder(root.right,res);
        // return res;
    }
}