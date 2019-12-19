package JavaSE_01;
import java.util.*;
public class Zuoye03 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("请输入华氏温度");
        float a = reader.nextFloat();
        float a1 = (a-32)*5/9;
        System.out.println("换成摄氏温度为："+a1+"\n");

        System.out.print("请输入摄氏温度");
        float b = reader.nextFloat();
        float b1 = b*9/5+32;
        System.out.println("\n换成华氏温度为："+b1);
    }
}
