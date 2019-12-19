package JavaSE_07_obj.X01_动态创建对象;

        import java.util.*;
public class main {
    public static void main(String[] args) {
        System.out.print("(输入esc退出)\n\n请输入要创建的对象名:");
        Scanner reader = new Scanner(System.in);
        while (true){
            String s = reader.next();
            if(s.equals("苹果")) new Apple(7, "green", "红富士");
            else if(s.equals("esc")){
                System.out.println("程序结束，欢迎下次再来");
                break;
            }
            else if(s.equals("香蕉")) new Banana();
            else if(s.equals("葡萄"))new Grape();
            else if(s.equals("园丁")) new Gardener();
            else System.out.println("输入错误！！");
        }

    }
}
