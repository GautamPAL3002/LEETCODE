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
class Solution { int ans;
    public int diameterOfBinaryTree(TreeNode root) {
getdiameter(root);
return ans;


        
    } public int getdiameter(TreeNode root){
        if(root==null) return 0;
        int l=getdiameter(root.left);
         int r=getdiameter(root.right);
         ans=Math.max(ans,(l+r));
         return Math.max(l,r)+1;
    }

}