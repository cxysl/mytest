package JavaSE_03;

import java.util.Scanner;

public class Tseven {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int num = reader.nextInt();
        if (num>100||num<0){
            System.out.println("分数无效");
        }else if (num<60){
            System.out.println("E");
        }
        else if (num<70){
            System.out.println("D");
        }else if (num<80){
            System.out.println("C");
        }else if (num<90){
            System.out.println("B");
        }else {
            System.out.println("A");
        }

    }
}
