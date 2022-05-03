package dsa_java.tree;

public class AddTreeElementsUsingRecursion {
    public static void main(String[] args) {
        CommonNode<Integer> root = TreeUtil.formIntegerTree();
        int sum = addTreeElementUsingrecursion(root);
        System.out.println(sum);
    }

    private static int addTreeElementUsingrecursion(CommonNode<Integer> root) {
        if(root == null) return 0;
        return root.val + addTreeElementUsingrecursion(root.left) +
                addTreeElementUsingrecursion(root.right);
    }
}
