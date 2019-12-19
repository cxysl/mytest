package zuoye01;

import java.util.Scanner;
import zuoye01.example_UI.User_UI;

public class Menu {
    public void menu(){
        System.out.println("~~~~~~~~~~~~~~~~~~欢迎来到东方国际人事管理系统~~~~~~~~~~~~~~~~~~\n");
        System.out.println("1、显示公司全部人员");
        System.out.println("2、添加人员信息");
        System.out.println("3、开除某员工");
        System.out.println("4、修改员工信息");
        System.out.println("5、退出系统");
        User_UI ui = new User_UI();
        Scanner reader = new Scanner(System.in);
        int i = reader.nextInt();
        switch(i){
            case 1:                 //显示
                ui.showUser();
                childMenu();
                break;
            case 2 :                //添加
                ui.add_user();
                childMenu();
                break;
            case 3 :                //开除
                ui.del_user();
                childMenu();
                break;
            case 4 :                //修改
                ui.update_user();
                childMenu();
                break;
            case 5:
                System.exit(1);
            default :
                System.out.println("很抱歉，输入错误。");
                menu();
        }
    }
    public  void childMenu() {
        System.out.println("1、返回上一级");
        System.out.println("2、退出系统");
        Scanner reader = new Scanner(System.in);
        int i = reader.nextInt();
        switch (i) {
            case 1:
                menu();
                break;
            case 2:
                System.exit(1);
            default:
                System.out.println("很抱歉，输入错误。");
                childMenu();
        }
    }
}
