package JavaSE_09_API;

import java.lang.reflect.Type;
import java.util.Scanner;

public class T901Scanner {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("请输入两个数字字符串");
        String s1,s2;
        s1 = reader.next();
        s2 = reader.next();
        sum(s1,s2);
    }
    public static void sum(String str1,String str2){   //算两字符数的数值和
        int a = Integer.parseInt(str1);
        int b = Integer.parseInt(str2);
        int c = a+b;
        System.out.println("和为:"+c);
    }
}
