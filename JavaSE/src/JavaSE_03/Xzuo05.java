//输出0-9之间的数，但是不包括5。
package JavaSE_03;

public class Xzuo05 {
    public static void main(String[] args) {
        int i;
        for (i=0;i<=9;i++){
            if(i==5)continue;
            System.out.print(i+" ");
        }
    }
}
