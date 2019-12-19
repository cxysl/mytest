package supermarket.UI.child_menu;

import supermarket.UI.AdminUI;
import supermarket.UI.UserInfo_UI;

import java.util.Scanner;

/**
 * 1.1
 * 收营员管理
 */
public class EmployeeManager {

    Scanner sc = new Scanner(System.in);


    public void employeeManager()           //员工经理
    {
        System.out.println("1.收银员账号添加");
        System.out.println("2.收银员账号删除");
        System.out.println("3.收银员账号修改");
        System.out.println("4.收银员账号查询");
        System.out.println("5.收银员账号激活");
        System.out.println("6.收银员账号锁定");
        System.out.println("7.显示所有收营员信息");
        System.out.println("8.返回上级菜单");
        UserInfo_UI ui = new UserInfo_UI();
        String str = sc.next();
        int i = Integer.parseInt(str);
        switch(i) {
            case 1:             //账号添加
                ui.add_user();
                chileEmployeeManager();
                break;
            case 2:             //账号删除
                ui.del_user();
                chileEmployeeManager();
                break;
            case 3:             //账号修改
                ui.update_user();
                chileEmployeeManager();
                break;
            case 4:             //收银员账号查询
                ui.sel_CheckerAccount();
                chileEmployeeManager();
                break;
            case 5:             //收银员账号激活
                ui.activate_Account();
                chileEmployeeManager();
                break;
            case 6:             //收银员账号锁定
                ui.lock_Account();
                chileEmployeeManager();
                break;
            case 7:             //显示所有收营员信息
                ui.showUser();
                chileEmployeeManager();
                break;
            case 8:
                AdminUI a = new AdminUI();
                a.adminMenu();
                break;
            default :
                System.out.println("输入错误，请重新输入！");
                employeeManager();
        }
    }
    public void chileEmployeeManager(){
        System.out.println("1、返回上一级");
        System.out.println("2、返回主菜单");
        System.out.println("3、退出系统");
        String str = sc.next();
        int i = Integer.parseInt(str);
        switch(i) {
            case 1:
                employeeManager();
                break;
            case 2:
                AdminUI a = new AdminUI();
                a.adminMenu();
                break;
            case 3:
                System.exit(0);
                break;
            default :
                System.out.println("输入错误，请重新输入！");
                chileEmployeeManager();
        }
    }
}
