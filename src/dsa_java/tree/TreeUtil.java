package dsa_java.tree;

public final class TreeUtil<T> {
    private TreeUtil(){}

    public static CommonNode formTree() {
        CommonNode a = new CommonNode('a');
        CommonNode b = new CommonNode('b');
        CommonNode c = new CommonNode('c');
        CommonNode d = new CommonNode('d');
        CommonNode e = new CommonNode('e');
        CommonNode f = new CommonNode('f');
        a.left  = b;
        a.right = c;
        b.left  = d;
        b.right = e;
        c.right  = f;
        return a;
    }

    public static<T> CommonNode<T> formIntegerTree() {
        CommonNode a = new CommonNode(2);
        CommonNode b = new CommonNode(11);
        CommonNode c = new CommonNode(4);
        CommonNode d = new CommonNode(4);
        CommonNode e = new CommonNode(122);
        CommonNode f = new CommonNode(1);
        a.left  = b;
        a.right = c;
        b.left  = d;
        b.right = e;
        c.right  = f;
        return a;
    }
}
