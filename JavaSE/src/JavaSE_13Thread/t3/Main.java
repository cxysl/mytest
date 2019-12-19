package JavaSE_13Thread.t3;

public class Main {
    public static void main(String[] args) {
        Thread t1 = new Thread(new TestThread(1,200));
        Thread t2 = new Thread(new TestThread(2,200));
        t1.setPriority(10);
        t2.setPriority(6);
        t1.start();
        t2.start();
    }
}
