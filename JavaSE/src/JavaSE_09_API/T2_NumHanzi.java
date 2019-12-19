package JavaSE_09_API;

import java.util.Scanner;
//51002
public class T2_NumHanzi {
    public static void main(String[] args) {
        while (true){
            System.out.println("请输入你的财产数额：");
            Scanner reader = new Scanner(System.in);
            String money = reader.next();
            T_money(money);
        }

    }
    public static void T_money(String money){
        int h=0;
        String[] money_chinese ={"零","壹","贰","叁","肆","伍","陆","柒","捌","玖"};
        String[] num_chinese = {"","拾","佰","仟","萬","拾","佰","仟","亿","拾","佰","仟"};
        String result = "";
        for (int i = 0; i <money.length(); i++){
            int n = money.charAt(i)-'0';
            if (money.charAt(i)=='0') {
                if (money.charAt(i - 1) == '0')
                    result += "";
                else {
                    for (int j = i+1; j <money.length()-1 ; j++) {
                        if (money.charAt(j)=='0') h += 0;
                        else h++;
                    }
                    if (h==0) result += "";
                    else result += "零" + " ";
                }
            }
            else
            result += money_chinese[n]+num_chinese[money.length()-i-1]+" ";
        }
        System.out.println(result);
    }
}