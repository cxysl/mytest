package supermarket.UI.child_menu;

import supermarket.UI.AdminUI;
import supermarket.UI.AttenceInfo_UI;

import java.util.Scanner;

/**
 * 考勤管理
 */
public class AttenceInfoManager {

    Scanner sc = new Scanner(System.in);

    public void attenceInfoManager(){
        System.out.println("1.查看考勤记录表");
        System.out.println("2.修改某条记录");
        System.out.println("3.删除某条记录");
        System.out.println("4.返回上级菜单");

        AttenceInfo_UI ui = new AttenceInfo_UI();
        String str = sc.next();
        int i = Integer.parseInt(str);

        switch(i) {
            case 1:             //查看考勤记录表
                ui.showAttenceInfo();
                chileAttence();
                break;
            case 2:             //修改某条记录
                ui.update_AttenceInfo();
                chileAttence();
                break;
            case 3:             //删除某条记录
                ui.del_AttenceInfo();
                chileAttence();
                break;
            case 4:             //返回上级菜单
                AdminUI a = new AdminUI();
                a.adminMenu();
                break;
            default :
                System.out.println("输入错误，请重新输入！");
                attenceInfoManager();
        }
    }

    public void chileAttence(){
        System.out.println("1、返回上一级");
        System.out.println("2、返回主菜单");
        System.out.println("3、退出系统");
        String str = sc.next();
        int i = Integer.parseInt(str);
        switch(i) {
            case 1:
                attenceInfoManager();
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
                chileAttence();
        }
    }
}
