package dsa_java.tree;

public class CommonNode<T> {
    CommonNode left;
    CommonNode right;
    T val;

    public CommonNode(T val) {
        this.val = val;
    }
}
