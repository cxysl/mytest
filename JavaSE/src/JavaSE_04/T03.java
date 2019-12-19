package JavaSE_04;

public class T03 {
    public static void main(String[] args) {
        int[] a = new int[]{1,6,2,3,9,4,5,7,8};
        System.out.print("排序前：");
        for (int i = 0; i <a.length ; i++) {
            System.out.print(a[i]+" ");
        }
        int x;
        for (int k = 1; k < a.length ; k++) {
            for (int l = 0; l <a.length-k ; l++) {
                if(a[l]>a[l+1]){
                    x = a[l+1];
                    a[l+1] = a[l];
                    a[l] = x;
                }
            }
        }
        System.out.print("\n排序后：");
        for (int i = 0; i <a.length ; i++) {
            System.out.print(a[i]+" ");
        }

    }
}
