package BinaryTree;

public class MaxDepth {
	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		
		root.left.left = new TreeNode(4);
		root.right.right = new TreeNode(5);
		
		root.left.left.left = new TreeNode(6);
		
		System.out.println(maxDepth(root));

	}
    public static int maxDepth(TreeNode root) {
        if(root==null) return 0;
        int left=maxDepth(root.left);
        int right=maxDepth(root.right);
        return Math.max(left,right)+1;
    }
}