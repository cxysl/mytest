package JavaSE_03;
import java.util.*;
public class Tone {
    public static void main(String[] args) {
        System.out.print("请输入你的月利润：");
        Scanner reader = new Scanner(System.in);
        int money = reader.nextInt();
        double sum;
        if(money<=10){
            sum = money*0.1;
        }else if(money<=20){
            sum = 10*0.1+(money-10)*0.075;
        }else if(money<=40){
            sum = 10*0.1+(20-10)*0.075+(money-20)*0.05;
        }else if(money<=60){
            sum = 10*0.1+(20-10)*0.075+(40-20)*0.05+(money-40)*0.03;
        }else if(money<=100){
            sum = 10*0.1+(20-10)*0.075+(40-20)*0.05+(60-40)*0.03+(money-60)*0.015;
        }else {
            sum = 10*0.1+(20-10)*0.075+(40-20)*0.05+(60-40)*0.03+(100-60)*0.015+(money-100)*0.01;
        }
        System.out.println("你的奖金为："+sum);
    }
}
