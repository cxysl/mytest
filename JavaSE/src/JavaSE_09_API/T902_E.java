package JavaSE_09_API;

import java.util.Scanner;

public class T902_E {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String str;
        System.out.println("请输入一个字符串：");
        str = reader.next();
        int count = 0;
        for (int i = 0; i <str.length() ; i++) {
            if(str.charAt(i)=='e') count++;
        }
        System.out.println("字符串中'e'出现了"+count+"次");
    }
}
