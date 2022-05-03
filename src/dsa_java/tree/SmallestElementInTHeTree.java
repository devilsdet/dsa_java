package dsa_java.tree;

public class SmallestElementInTHeTree {
    public static void main(String[] args) {
        CommonNode<Integer> root = TreeUtil.formIntegerTree();
        int sum = findSmallestEleemntUsingRecursive(root);
        System.out.println(sum);
    }

    private static int findSmallestEleemntUsingRecursive(CommonNode<Integer> root) {
        int min = Integer.MAX_VALUE;
        if(root == null) return min;
        min = Math.min(root.val, findSmallestEleemntUsingRecursive(root.left));
        min = Math.min(min, findSmallestEleemntUsingRecursive(root.right));
        return min;
    }
}
