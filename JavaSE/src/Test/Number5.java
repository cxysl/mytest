package Test;

public class Number5 {
    public static void main(String[] args) {
        int x = 100;
        int i = 0;
        for (x=100;x<=10000;x++){
            int x1 = x%10;
            int x2 = x/10%10;
            int x3 = x/100%10;
            int x4 = x/1000%10;
            int x5 = x/10000;
            if (x1+x2+x3+x4+x5==5) {
                System.out.print(x+"\t");
                i++;
                if (i%5==0) System.out.println("");
            }

        }
    }
}
