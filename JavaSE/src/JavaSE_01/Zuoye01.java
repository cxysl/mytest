package JavaSE_01;
public class Zuoye01 {
    public static void main(String[] args) {
        int a,b,c;
        a = 5;
        b = 6;
        System.out.println("a="+a+" b="+b);
        c = a;
        a = b;
        b = c;
        System.out.println("换值后：\na="+a+" b="+b);
    }
}
