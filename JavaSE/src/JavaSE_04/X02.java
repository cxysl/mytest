package JavaSE_04;

public class X02 {
    public static void main(String[] args) {
        int[] a =new int[]{1,2,3,4,5,8,6};
        int[] b =new int[a.length];
        System.out.print("原来的数组为：");
        for (int i = 0; i <a.length ; i++) {
            System.out.print(a[i]+"  ");
        }
        System.out.print("\n逆序后数组为：");
        for (int i =0; i<a.length; i++) {
            b[i] = a[a.length-i-1];
            System.out.print(b[i]+"  ");
        }
    }
}
