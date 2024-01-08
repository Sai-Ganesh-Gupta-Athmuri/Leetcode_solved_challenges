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
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        List<Integer> res = new ArrayList<>();
        inorder(root1,a);
        inorder(root2,b);
        int i = 0,j = 0;
        while(i<a.size() && j<b.size()){
            if(a.get(i) < b.get(j)){
                res.add(a.get(i));
                i++;
            }else{
                res.add(b.get(j));
                j++;
            }
        }
        while(i<a.size()){
            res.add(a.get(i));
            i++;
        }
        while(j<b.size()){
            res.add(b.get(j));
            j++;
        }
        return res;
    }
    public void inorder(TreeNode root,List<Integer> arr){
        if(root!=null) {
            inorder(root.left,arr);
            arr.add(root.val);
            inorder(root.right,arr);
        }
    }
}
