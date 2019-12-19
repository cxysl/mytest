//分别使用for循环，while循环，do循环求1到100之间所有能被3整除的整数的和。（知识点：循环语句）

package JavaSE_03;

public class Xzuo04 {
    public static void main(String[] args) {
        int i,sum = 0;
        for (i=0;i<=100;i++){
            if(i%3==0)  sum +=i;
        }
        System.out.println("for循环算出结果为："+sum);
        while (i<=100){
            if(i%3==0)  sum +=i;
            i++;
        }
        System.out.println("while循环算出结果为："+sum);
        do{
            if(i%3==0)  sum +=i;
            i++;
        }while (i<=100);
        System.out.println("do循环算出结果为："+sum);
    }
}
