class Solution {
    public boolean isSymmetric(TreeNode root) {
        return check(root.left, root.right);
    }
    private boolean check(TreeNode left_node, TreeNode right_node){
        if(left_node == null && right_node == null) return true;
        if(left_node == null || right_node == null) return false;
        return left_node.val == right_node.val && check(left_node.left, right_node.right) && check(left_node.right, right_node.left);
    }
}
