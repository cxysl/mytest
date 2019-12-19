package JavaSE_13Thread.t01_three_thread;

public class TestMain {
    public static void main(String[] args) {
        Test1 t1  = new Test1(1,1000);
        t1.start();

        Test1 t2  = new Test1(1001,2000);
        t2.start();

        Test1 t3  = new Test1(2001,3000);
        t3.start();

    }
}
