package JavaSE_03;
import java.util.Random;
public class Tfive {
    public static void main(String[] args) {
        Random random = new Random();
        int x =random.nextInt(100);
        System.out.println(x);
        if (x%5==0&&x%6==0){
            System.out.println("能被5和6整除");
        }else if(x%5==0&&x%6!=0){
            System.out.println("能被5整除");
        }else if(x%5!=0&&x%6==0){
            System.out.println("能被6整除");
        }else {
            System.out.println("不能被5和6整除");
        }
    }
}
