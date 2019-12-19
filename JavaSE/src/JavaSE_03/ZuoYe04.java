package JavaSE_03;
import java.util.*;
public class ZuoYe04 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("请输入月份和号:  ");
        int m = reader.nextInt();
        int day = reader.nextInt();
        int month[] = {31,28,31,30,31,30,31,31,30,31,30,31};
        int sum = 0;
        for (int i=0;i<=m-2;i++){
            sum = sum + month[i];
        }
        sum += day;
        System.out.println("今天是今年的第："+sum+"天");
    }
}
