package JavaSE_09_API.项目;

import java.util.Date;
import java.util.Scanner;
import java.text.SimpleDateFormat;
public class T_Date {
    public static void main(String[] args) {
        System.out.print("输入商品生产日期(格式:yyyy-mm-dd):");
        Scanner reader = new Scanner(System.in);
        String str1 = reader.next();
        System.out.print("输入商品的保质期:");
        int day = reader.nextInt();
        com(str1,day);
    }
    public static void com(String str1,int day){
        Date date = new Date();
        SimpleDateFormat sdf =  new SimpleDateFormat("yyyy-MM-dd");
        String time = sdf.format(date.getTime());
        System.out.println("今天的日期为:"+time);
        int s01 = Integer.parseInt(str1.substring(0,4));
        int s02 = Integer.parseInt(str1.substring(5,7));
        int s03 = Integer.parseInt(str1.substring(8,10));
        int s1 = Integer.parseInt(time.substring(0,4));
        int s2 = Integer.parseInt(time.substring(5,7));
        int s3 = Integer.parseInt(time.substring(8,10));
        int day1 = (s1-s01)*365+(s2-s02)*30+s3-s03;
        if (day>day1) System.out.println("商品没过期！");
        else System.out.println("商品已经过期！");
//        System.out.println(s1+" "+s2+" "+s3);
//        System.out.println(s01+" "+s02+" "+s03);
    }
}
//2019-08-25