//编写一个程序，找出大于200的最小的质数
package JavaSE_03;

public class Xzuo07 {
    public static void main(String[] args) {
        int i,j,x;
        for (i=201; ;i++){
            x=0;
            for (j=2;i<201;j++){
                if (i%j==0) {
                    x++;break;
                }
            }
            if(x==0){
                System.out.println("大于200的最小质数是"+i);
                break;
            }

        }
    }
}
