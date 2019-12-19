package supermarket.UI;

import supermarket.UI.child_menu.PayManager;

import java.util.Scanner;

public class EmployeeUI {
    Scanner sc = new Scanner(System.in);

    public void employeeUI(String userno)
    {
        System.out.println("~~~~~~~~~~~~欢迎"+userno+"号收银员上线~~~~~~~~~~~~\n");
        System.out.println("\t1.收银员上班打卡");
        System.out.println("\t2.收银员下班打卡");
        System.out.println("\t3.收银结算");
        System.out.println("\t4.退出");

        AttenceInfo_UI ui = new AttenceInfo_UI();
        PayManager p = new PayManager();
        String str = sc.next();
        int i = Integer.parseInt(str);
        switch(i) {
            case 1:             //收银员上班打卡
                ui.on_AttenceInfo(userno);
                chileMenu(userno);
            case 2:             //收银员下班打卡
                ui.off_AttenceInfo(userno);
                chileMenu(userno);
            case 3:             //收银结算
                p.payMenu(userno);
                chileMenu(userno);
            case 4:             //退出
                System.exit(0);
                break;

            default :
                System.out.println("输入错误，请重新输入！");
                employeeUI(userno);
        }
    }

    public void chileMenu(String userno){
        System.out.println("1、返回上一级");
        System.out.println("2、返回登录界面");
        System.out.println("3、退出系统");
        String str = sc.next();
        int i = Integer.parseInt(str);
        switch(i) {
            case 1:
                employeeUI(userno);
                break;
            case 2:
                MainUI m = new MainUI();                            //登录菜单
                m.mainMenu();
                break;
            case 3:
                System.exit(0);
                break;
            default :
                System.out.println("输入错误，请重新输入！");
                chileMenu(userno);
        }
    }
}
