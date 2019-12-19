package JavaSE_03;
import java.util.*;
public class Ttwo {
    public static void main(String[] args) {
        System.out.print("请输入你的成绩：");
        Scanner reader = new Scanner(System.in);
        int num = reader.nextInt();
        int i;
        if (num>=90) i=1;
        else if (num>=80) i=2;
        else if (num>=70) i=3;
        else if (num>=60) i=4;
        else  i=5;
        switch (i){
            case 5:
                System.out.println("E");
                break;
            case 4:
                System.out.println("D");
                break;
            case 3:
                System.out.println("C");
                break;
            case 2:
                System.out.println("B");
                break;
            case 1:
                System.out.println("A");
                break;
        }
    }
}
