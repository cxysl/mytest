package JavaSE_01;
import java.util.*;
public class Zuoye04 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("请输入大写字母");
        char c = reader.next().charAt(0);
        int c2 = c+32;
        System.out.println((char)c2);
    }
}