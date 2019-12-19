package JavaSE_13Thread.t01_three_thread;

public class Main {
    public static void main(String[] args) {
        OneThread targetOfOne = new OneThread();
        Thread one = new Thread(targetOfOne);

        TwoThread targetOfTwo = new TwoThread();
        Thread two = new Thread(targetOfOne);

        ThreeThread targetOfThree = new ThreeThread();
        Thread three = new Thread(targetOfThree);

        one.start();
        two.start();
        three.start();

    }
}
