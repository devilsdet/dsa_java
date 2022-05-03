package dsa_java.tree;

public class SearchAnElementUsingRecursion {
    public static void main(String[] args) {
        CommonNode root = TreeUtil.formTree();
        char element = 'e';
        boolean isPresent = searchAnElementUsingRecursive(root, element);
        System.out.println(isPresent);
    }

    private static boolean searchAnElementUsingRecursive(CommonNode root, char element) {
        if(root == null) return false;
        if((char)root.val == element) return true;
        return searchAnElementUsingRecursive(root.left, element) ||
                searchAnElementUsingRecursive(root.right, element);
    }
}
