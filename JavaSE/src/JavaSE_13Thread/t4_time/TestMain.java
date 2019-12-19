package JavaSE_13Thread.t4_time;

public class TestMain {
    public static void main(String[] args) {
        Thread t = new Thread(new Time());
        t.start();
    }
}
