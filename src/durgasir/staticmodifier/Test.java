package durgasir.staticmodifier;

public class Test {
    static int x = 10;
    int y;

    public static void main(String[] args) {
        Test t1 = new Test();
        // Test.x = 123;
        t1.y = 30;
        Test t2 = new Test();
        t2.y = 40;
        System.out.println(x + " " + t2.y);
    }
}
