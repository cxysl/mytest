//         假设某员工今年的年薪是30000元，年薪的年增长率6%。
//        编写一个Java应用程序计算该员工10年后的年薪，并统计未来10年（从今年算起）总收入。
//        （知识点：循环语句for）
package JavaSE_03;

public class Xzuo01 {
    public static void main(String[] args) {
        double i ,a = 30000,sum = 0;
        for(i=1;i<=10;i++){
            a = a*1.06;
            System.out.print(a+" ||  ");
            sum += a;
        }
        System.out.println("\n10年后它的年薪为："+a);
        System.out.println("总收入为："+sum);
    }
}
