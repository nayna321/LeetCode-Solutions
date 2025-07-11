//recursive 

class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList();
        helper(root, list);
        return list;
    }

    public void helper(TreeNode root, List<Integer> list){
        if(root != null){
            helper(root.left, list);
            list.add(root.val);
            helper(root.right, list);
        }
    }
}


//iterative

class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList();
        Stack<TreeNode> stack = new Stack();
        TreeNode current = root;
        while(current != null || !stack.isEmpty()){
            while(current != null){
                stack.push(current);
                current = current.left;
            }
            current = stack.pop();
            list.add(current.val);
            current = current.right;
        }
        return list;
    }
}
