package JavaSE_13Thread.t3;

public class TestThread implements Runnable {
    int num;
    int sum = 0;
    public TestThread (int num,int sum){
        this.num = num;
    }
    @Override
    public void run() {
        while (true){
            sum++;
            if(sum>200)return;
            System.out.println("线程"+num+"正在运行！"+sum);
        }
    }
}
