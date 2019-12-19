package JavaSE_08_try;
import java.util.*;
public class T01_Try {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
//        System.out.print("请输入除数和被除数:");
        System.out.println("总是被执行");
        String a = reader.next();
        String b = reader.next();
        int x,num1, num2;
        try{

            num1 = Integer.parseInt(a);
            num2 = Integer.parseInt(b);
             x = num1/num2;
            System.out.println(x);
        }catch (NumberFormatException e){
            System.out.println("数据格式异常！");
        }catch (ArithmeticException e){
            System.out.println("算术错误!");
        }catch (Exception e){
            System.out.println("有错误!");
        }

    }
}
