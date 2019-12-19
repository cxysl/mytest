package JavaSE_09_API;

import java.util.Scanner;

public class T02_Phone {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("请输入11位手机号：");
        String num = reader.next();
        String str1,str2="****",str3;
        str1 = num.substring(0,3);
        str3 = num.substring(7,11);
        System.out.println(str1+str2+str3);
    }

}
