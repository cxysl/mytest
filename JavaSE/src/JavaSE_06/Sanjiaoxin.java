package JavaSE_06;
import java.util.*;
public class Sanjiaoxin {
    int a;
    int b;
    int c;

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setC(int c) {
        this.c = c;
    }

    public boolean isBian(int x){
        if (x>0) return true;
        else {
            return false;
//            System.out.println("边长必须为正数");
        }
    }
    public boolean isSanjiaoxin(int a,int b,int c){
        if (a+b>c&&a+c>b&&b+c>a)    return true;
        else {
            return false;
//            System.out.println("三边不能构成三角形。");
        }
    }
}
class Test {
    public static void main(String[] args) {
        Sanjiaoxin s1 = new Sanjiaoxin();
        Scanner reader = new Scanner(System.in);
        for (int i = 1; i <=3 ; i++) {
            System.out.print("输入第"+i+"条边的长：");
            int a = reader.nextInt();
            if(s1.isBian(a)){
                if(i==1) s1.a = a;
                else if(i==2) s1.b = a;
                else if(i==3) s1.c = a;
            }else{
                System.out.print("边长必须为正数。\n请重新");
                i--;
                continue;
            }
        }
        if(s1.isSanjiaoxin(s1.a,s1.b,s1.c)){
            System.out.println("这三边能构成三角形，三边边长分别为：\na="+s1.a+"\tb="+s1.b+"\tc="+s1.c);
        }else{
            System.out.println("三边不能构成三角形。");
        }
    }
}
