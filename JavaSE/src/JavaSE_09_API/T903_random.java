package JavaSE_09_API;

import java.sql.Array;
import java.util.Random;

public class T903_random {
    public static void main(String[] args) {
        tt();

    }
    public static void tt(){
        Random random = new Random();
        double[] a = new double[10];
        for (int k = 0; k < 10; k++) {
            a[k] = random.nextInt(100);
            System.out.print(a[k]+" ");
        }
        for (int i = 1; i <a.length ; i++) {
            for (int j = 0; j <a.length-i ; j++) {
                if(a[j]<a[i+1]){
                    double x = a[j];
                    a[j] = a[j+1];
                    a[j+1] = x;
                }
            }

        }
        for (int x = 0; x <10 ; x++) {
            System.out.println(a[x]+" ");
        }
    }
}
