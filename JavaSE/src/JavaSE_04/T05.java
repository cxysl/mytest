package JavaSE_04;

public class T05 {
    public static void main(String[] args) {
        int[] a = new int[]{18,25,7,36,13,2,89,63};
        System.out.print("数组为：");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+"  ");
        }
        int max=a[0],i;
        int j=0;
        for (i=1;i<a.length;i++){
            if(max<a[i]) {
                max = a[i];
                j=i;
            }
        }
        System.out.println("\n最大数为："+max+"  它的下标为："+j);
    }
}
