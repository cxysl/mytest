package JavaSE_13Thread.test;

public class Thread1  {
    public static void main(String[] args) {
        Test02 one = new Test02(1,1000);
        Test02 two = new Test02(1001,2000);
        Test02 three = new Test02(2001,3000);
        one.start();
        two.start();
        three.start();
    }
}
