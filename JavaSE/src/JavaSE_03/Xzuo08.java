//由命令行输入一个4位整数，求将该数反转以后的数，如原数为1234，反转后的数位4321
package JavaSE_03;
import java.util.*;
public class Xzuo08 {
    public static void main(String[] args) {
        System.out.print("请输入一个四位数：");
        Scanner reader = new Scanner(System.in);
        int x = reader.nextInt();
        int s;
        int [] a = new int[4];
        a[3] = x/1000%10;
        a[2] = x/100%10;
        a[1] = x/10%10;
        a[0] = x%10;
        s = a[0]*1000+a[1]*100+a[2]*10+a[3];
        System.out.println("转换后为："+s);
    }
}
