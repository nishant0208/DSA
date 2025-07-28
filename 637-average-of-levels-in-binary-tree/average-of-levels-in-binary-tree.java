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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> AvgLevel = new ArrayList<>();
        if(root==null)
        return AvgLevel;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        Double avg=0.0;
        while(!q.isEmpty())
        {
            int size= q.size();
            for(int i=0;i<size;i++)
            {
                TreeNode Curr= q.poll();
                avg =Curr.val+avg;
                if(Curr.left !=null){
                    q.offer(Curr.left);
                }
                if(Curr.right !=null){
                    q.offer(Curr.right);
                }

            }
            AvgLevel.add(avg/size);
            avg=0.0;
        }
        return AvgLevel;
    }
}