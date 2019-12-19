package JavaSE_01;
import java.util.Random;
public class Zuoye02 {
    public static void main(String[] args) {
        int a,b,c;
        int MAX,MIN;
        MIN = 100; MAX = 1000;
        Random random = new Random();
        int x =random.nextInt(MAX)%(MAX-MIN+1)+MIN;
        System.out.println("随机三位数为："+x);

        a = x%10;
        b = x/10%10;
        c = x/100;
        System.out.println("各位数的和为："+(a+b+c));
    }
}