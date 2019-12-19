package JavaSE_03;

import java.util.Random;

public class Tnine {
    public static void main(String[] args) {
        Random random = new Random();
        int x =random.nextInt(100000);
        System.out.println(x);
        int i,sum=0;
        int [] a = new int[5];
        a[4] = x/10000;
        a[3] = x/1000%10;
        a[2] = x/100%10;
        a[1] = x/10%10;
        a[0] = x%10;
        for (i=0;i<=4;i++){
            if(a[i]!=0){
                sum +=1;
                System.out.println("它的第"+(i+1)+"位是"+a[i]);
            }
        }
        System.out.println("它是"+sum+"位数");
    }
}
