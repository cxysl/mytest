package Test;
//2、将100-200之间的质数放入一个数组中，打印数组

public class TT001 {

    public static void main(String[] args) {
        int[] a = new int[101];
        for (int i= 100;i<=200;i++){
            a[i-100] = 0;
            if(i%2==0) continue;
            else a[i-100] = i;
            if (a[i-100]>0) System.out.println(a[i-100]);
        }
    }

}
