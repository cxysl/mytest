package JavaSE_03;

import java.util.Scanner;

public class Tthree {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("请输入整型变量x:");
        int x = reader.nextInt();
        if (x%2==0){
            System.out.println(x+"输入的值是偶数");
        }else{
            System.out.println(x+"输入的值是奇数");
        }
    }
}
