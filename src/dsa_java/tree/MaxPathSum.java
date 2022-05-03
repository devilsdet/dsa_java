package dsa_java.tree;

public class MaxPathSum {
    public static void main(String[] args) {
        CommonNode<Integer> root = TreeUtil.formIntegerTree();
        int sum = findMaxPathFromRootNode(root);
        System.out.println(sum);
    }

    private static int findMaxPathFromRootNode(CommonNode<Integer> root) {
        if(root == null) return Integer.MIN_VALUE;
        if(root.left == null || root.val == null) return root.val;
        return root.val + Math.max(findMaxPathFromRootNode(root.left),
                findMaxPathFromRootNode(root.right));
    }
}
