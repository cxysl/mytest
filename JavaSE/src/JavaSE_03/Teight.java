package JavaSE_03;

import java.util.Scanner;

public class Teight {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int a = reader.nextInt();
        int b = reader.nextInt();
        int c = reader.nextInt();
        int max,min;
        if (a>b)
            if (b>c){  //a>b>c
            System.out.println(c+"<"+b+"<"+a);
        }else if (a>c){  //a>c>b
                System.out.println(b+"<"+c+"<"+a);
            }else System.out.println(b+"<"+a+"<"+c);
        else //b>a
            if (a>c)System.out.println(c+"<"+a+"<"+b);
        else if(b>c) System.out.println(a+"<"+c+"<"+b);
        else System.out.println(a+"<"+b+"<"+c);
    }
}
