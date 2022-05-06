package dsa_java.newfeature.lexpression;
interface add {
    public void add(int a, int b);
}
public class Test_02 {
    public static void main(String[] args) {
        add m = (a, b) ->System.out.println(a +b ) ;
        m.add(21, 24);
    }
}
