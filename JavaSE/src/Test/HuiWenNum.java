package Test;

public class HuiWenNum {
    public static void main(String[] args) {
        int x = 10000;
        while (x<=20000){
            int x1 = x%10;
            int x2 = x/10%10;
            int x3 = x/100%10;
            int x4 = x/1000%10;
            int x5 = x/10000;
            if (x1==x5&&x2==x4) System.out.println(x+"\t");
            x++;
        }
    }
}
