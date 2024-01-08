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
    public boolean isValidBST(TreeNode root) {
        ArrayList<Integer> res = new ArrayList<>();
        inorder(root,res);
        for(int i = 1;i<res.size();i++){
            if(res.get(i) <= res.get(i-1)) return false;
        }
        return true;
    }
    public void inorder(TreeNode root,ArrayList<Integer> arr){
        if(root!=null) {
            inorder(root.left,arr);
            arr.add(root.val);
            inorder(root.right,arr);
        }
    }
}
