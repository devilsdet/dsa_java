package dsa_java.tree;

import java.util.LinkedList;
import java.util.Queue;

public class SearchAnEleemntUsingBFS {
    public static void main(String[] args) {
        CommonNode<Character> root = TreeUtil.formTree();
        char element = 'h';
        boolean isPresent = searchAnElementUsingIterativeBFS(root, element);
        System.out.println(isPresent);
    }

    private static boolean searchAnElementUsingIterativeBFS(CommonNode<Character> root, char element) {
        Queue<CommonNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()) {
            CommonNode current = queue.remove();
            if((char)current.val == element) {
                return true;
            }
            if(current.left != null) {
                queue.add(current.left);
            }
            if(current.right != null) {
                queue.add(current.right);
            }
        }
        return false;
    }

}
