
//编写一个程序，求整数n的阶乘，例如5的阶乘是1*2*3*4*5
package JavaSE_03;
import java.util.*;
public class Xzuo06 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("计算n的阶乘，请输入n:");
        int n = reader.nextInt();
        double i, s=1;
        for (i=1;i<=n;i++){
            s=s*i;
        }
        System.out.println(s);
    }
}
