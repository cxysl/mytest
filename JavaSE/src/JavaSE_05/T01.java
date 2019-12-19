package JavaSE_05;
import java.util.Scanner;
public class T01 {
    public static void main(String[] args) {
        T01 t = new T01();
        System.out.print("请输入整数n：");
        Scanner reader = new Scanner(System.in);
        int n =reader.nextInt();
        long s =  t.jieCheng(n);
        System.out.println(n+"的阶乘为："+s);
    }

    //递归调用
    public long jieCheng(int n){
        if(n==0)    return 1;
        else return jieCheng(n-1)*n;
    }
}