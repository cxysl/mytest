package JavaSE_03;
import java.util.Random;
public class Tfour {
    public static void main(String[] args) {
        Random random = new Random();
        int x =random.nextInt(15);
        if (x==10){
            System.out.println("x="+x);
        }else if (x==1){
            System.out.println("x="+x);
        }else if (x==5){
            System.out.println("x="+x);
        }else {
            System.out.println("x=none");
        }
    }
}
