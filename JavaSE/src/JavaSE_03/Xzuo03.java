//编写一个程序，计算邮局汇款的汇费。
//        如果汇款金额小于100元，汇费为一元，如果金额在100元与5000元之间，按1%收取汇费，
//        如果金额大于5000元，汇费为50元。汇款金额由命令行输入。（知识点：条件语句）
package JavaSE_03;
import java.util.*;
public class Xzuo03 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("请输入汇款金额：");
        double num = reader.nextDouble();
        double sum;
        if (num<100)sum = 1;
            else if(num<=5000) sum = num*0.01;
                else sum = 50;
        System.out.println("汇费为："+sum);
    }
}
