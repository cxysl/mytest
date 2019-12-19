package JavaSE_03;

import java.util.Scanner;

public class Tsix {
        public static void main(String[] args) {
            Scanner reader = new Scanner(System.in);
            int year = reader.nextInt();
            if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
                System.out.println(year+"是闰年！");
            }else{
                System.out.println(year+"不是闰年！");
            }
        }
    }

