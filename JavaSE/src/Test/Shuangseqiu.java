package Test;

import java.util.Random;

//     双色球：要求6个从1-32的随机整数，1个从1到16的随机整数
//     将7个数放入数组中，要7个数没有重复。打印数组。
public class Shuangseqiu {
    public static int[] a = new int[]{0,0,0,0,0,0,0};
    public static void main(String[] args) {
        Random random = new Random();
        for(int i=0;i<6;i++){
            int x = random.nextInt(32)+1;
            if(isduli(x)) a[i] = x;
            else i--;
        }
        while (true){
            int x = random.nextInt(16)+1;
            if(isduli(x)) {a[6] = x;break;}
        }

        for (int i = 0; i <7; i++) {
            System.out.print(a[i]+",");
        }
    }
    public  static boolean isduli(int x){
        for (int i = 0; i <a.length; i++) {
            if(a[i]==x){
                for (int j = 0; j <a.length; j++) {
                    if(a[j]==x) return false;
                }
            }
        }
        return true;
    }
}
