package JavaSE_04;
import java.util.Random;
public class KTLX01 {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] a = new int[4][6];
//        int x =random.nextInt(15);
        int max=0;
        for (int i = 0; i <a.length ; i++) {
            for (int j = 0; j <a[1].length ; j++) {
                a[i][j] = random.nextInt(20);
                if(a[i][j]>max)max=a[i][j];
                System.out.print(a[i][j]+" ");
            }
            System.out.println(" ");
        }
        System.out.println("最大值为："+max);
    }
}