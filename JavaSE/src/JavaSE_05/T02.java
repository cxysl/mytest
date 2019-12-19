package JavaSE_05;
import java.time.Year;
import java.util.Scanner;
public class T02 {
    public static void main(String[] args) {
        System.out.print("请输入年份year：");
        Scanner reader = new Scanner(System.in);
        int n =reader.nextInt();
        T02 t = new T02();
        t.isYear(n);
    }
    public void isYear(int year){
        if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            System.out.println(year+"是闰年！");
        }else{
            System.out.println(year+"不是闰年！");
        }
    }
}
