package JavaSE_04;

public class X03 {
    public static void main(String[] args) {
        int[] a = new int[]{4,5,4,6,8,7,6,5};
        System.out.print("原来数组为：");
        for (int i = 0; i <a.length ; i++) {
            System.out.print(a[i]+" ");
        }
        int x;
        for (int i = 0; i <a.length ; i++) {
            for (int j = i+1; j <a.length; j++) {
                if(a[i]==a[j]){
                    a[j] = 0;
                }
            }
        }
        System.out.print("\n现在数组为：");
        for (int i = 0; i <a.length ; i++) {
            System.out.print(a[i]+" ");
        }
    }
}
