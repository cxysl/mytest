package JavaSE_01;
import java.util.*;
public class Sys {
    public static void main(String[] args) {
        Sys s = new Sys();
        s.menu();

    }

    private static void clearConsole()
    {
        try
        {
            String os = System.getProperty("os.name");

            if (os.contains("Windows"))
            {
                Runtime.getRuntime().exec("cls");
            }
            else
            {
                Runtime.getRuntime().exec("clear");
            }
        }
        catch (Exception exception)
        {
            //  Handle exception.
        }
    }


    public void menu(){
        System.out.println("********** 欢迎来到王者荣耀 **************");
        System.out.println("");
        System.out.println("*    1、买英雄                      ");
        System.out.println("*    2、买铭文                      ");
        System.out.println("*    3、买皮肤                      ");
        System.out.println("*    4、打排位                      ");
        System.out.println("*    5、退出游戏                      ");
        Scanner reader = new Scanner(System.in);
        System.out.print("您输入数字选择操作：");
        int i = reader.nextInt();
        Sys s = new Sys();
        switch (i){
            case 1:
                s.one();
                break;
            case 2:
                s.two();
                break;
            case 3:
                s.three();
                break;
            case 4:
                s.four();
                break;
            case 5:
                s.five();
                break;
            case 6:
                clearConsole();
                break;
            default:
                System.out.println("很抱歉，输入错误。");
                menu();
        }
    }

    public void one(){
        System.out.println("********** 1、听说你要买英雄 **********");
        System.out.println(" ");
        System.out.println("*    1、安其拉                       ");
        System.out.println("*    2、王昭君                       ");
        System.out.println("*    3、貂蝉                         ");
        System.out.println("*    4、诸葛亮                       ");
        System.out.println("*    5、返回主菜单                    ");
        Scanner reader = new Scanner(System.in);
        System.out.print("您输入数字选择操作：");
        int j = reader.nextInt();
        switch (j){
            case 5:
                menu();
                break;
            default:
                System.out.println("很抱歉，该模块还未开发。");
                one();
        }
    }
    public void two(){
        System.out.println("********** 2、有钱买铭文吗 **********");
        System.out.println("");
        System.out.println("*    1、加移速                      ");
        System.out.println("*    2、加暴击                      ");
        System.out.println("*    3、加法伤                      ");
        System.out.println("*    4、加防御                      ");
        System.out.println("*    5、返回主菜单                     ");
        Scanner reader = new Scanner(System.in);
        System.out.print("您输入数字选择操作：");
        int j = reader.nextInt();
        switch (j){
            case 5:
                menu();
                break;
            default:
                System.out.println("很抱歉，该模块还未开发。");
                two();
        }
    }
    public void three(){
        System.out.println("**********  3、土豪看上什么皮肤了 **********");
        System.out.println("");
        System.out.println("*    1、全都要                      ");
        System.out.println("*    2、至尊宝                      ");
        System.out.println("*    3、紫霞仙子                     ");
        System.out.println("*    4、地狱火                      ");
        System.out.println("*    5、返回主菜单                     ");
        Scanner reader = new Scanner(System.in);
        System.out.print("您输入数字选择操作：");
        int j = reader.nextInt();
        switch (j){
            case 5:
                menu();
                break;
            default:
                System.out.println("很抱歉，该模块还未开发。");
                three();
        }
    }
    public void four(){
        System.out.println("**********  4、今日上分冲王者 **********");
        System.out.println("");
        System.out.println("*    1、青铜局                      ");
        System.out.println("*    2、黄金局                      ");
        System.out.println("*    3、钻石局                      ");
        System.out.println("*    4、王者局                      ");
        System.out.println("*    5、返回主菜单                      ");
        Scanner reader = new Scanner(System.in);
        System.out.print("您输入数字选择操作：");
        int j = reader.nextInt();
        switch (j){
            case 5:
                menu();
                break;
            default:
                System.out.println("很抱歉，该模块还未开发。");
                four();
        }
    }
    public void five(){
        System.out.println("     再见，小妲己期待与你的再次相遇                    ");
        System.exit(1);

    }
}