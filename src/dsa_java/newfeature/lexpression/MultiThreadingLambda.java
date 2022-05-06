package dsa_java.newfeature.lexpression;

public class MultiThreadingLambda {
    public static void main(String[] args) {
        Thread childThread = new Thread(()-> System.out.println("child thread running"));
        childThread.start();
        childThread.run();
        childThread.stop();
    }
}
