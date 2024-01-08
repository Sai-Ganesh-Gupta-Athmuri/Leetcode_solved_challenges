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
    public int kthSmallest(TreeNode root, int K) {
        ArrayList<Integer> arr = new ArrayList<>();
        inorder(root,arr);
        if(K>arr.size()) return -1;
        return arr.get(K-1);
    }
    public void inorder(TreeNode root,ArrayList<Integer> arr){
        if(root!=null) {
            inorder(root.left,arr);
            arr.add(root.val);
            inorder(root.right,arr);
        }
    }
}
