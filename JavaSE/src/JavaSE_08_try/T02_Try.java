package JavaSE_08_try;
import java.util.*;
public class T02_Try {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("请输入两个字符串:");
        String a = reader.next();
        String b = reader.next();
        String c = null;
        try{
            if(c.equals(b)) System.out.println("两字符串相等。");
        }catch (NullPointerException e){
            System.out.println("出错，字符串不能为空。");
        }
    }
}