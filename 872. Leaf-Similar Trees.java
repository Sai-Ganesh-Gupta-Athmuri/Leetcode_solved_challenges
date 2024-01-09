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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        if(root1 == null || root2 == null) return false;
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        sumOfLeafNodes(root1,a);
        sumOfLeafNodes(root2,b);
        return a.equals(b);
        
    }
    public void sumOfLeafNodes(TreeNode root,ArrayList<Integer> arr)
    {
        if(root == null) return;
        if(root.left== null && root.right == null) {
            arr.add(root.val);
        }
        sumOfLeafNodes(root.left,arr);
        sumOfLeafNodes(root.right,arr);
    }
}
