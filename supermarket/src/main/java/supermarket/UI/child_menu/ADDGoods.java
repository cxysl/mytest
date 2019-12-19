package supermarket.UI.child_menu;

import supermarket.UI.AdminUI;
import supermarket.UI.Purchase_UI;

import java.util.Scanner;

/**
 * 进货管理
 * Purchase
 */
public class ADDGoods {

    Scanner sc = new Scanner(System.in);

    public void purchase(){
        System.out.println("1.商品进货");
        System.out.println("2.查看进货表");
        System.out.println("3.修改进货表某条记录");
        System.out.println("4.删除进货表某条记录");
        System.out.println("5.返回上级菜单");

        Purchase_UI ui = new Purchase_UI();
        String str = sc.next();
        int i = Integer.parseInt(str);

        switch(i) {
            case 1:             //商品进货
                ui.add_Purchase();
                chilePurchase();
                break;
            case 2:             //查看进货表
                ui.showPurchase();
                chilePurchase();
                break;
            case 3:             //修改进货表某条记录
                ui.update_Purchase();
                chilePurchase();
                break;
            case 4:             //删除进货表某条记录
                ui.del_Purchase();
                chilePurchase();
                break;
            case 5:             //返回上级菜单
                AdminUI a = new AdminUI();
                a.adminMenu();
                break;
            default :
                System.out.println("输入错误，请重新输入！");
                purchase();
        }
    }

    public void chilePurchase(){
        System.out.println("1、返回上一级");
        System.out.println("2、返回主菜单");
        System.out.println("3、退出系统");
        String str = sc.next();
        int i = Integer.parseInt(str);
        switch(i) {
            case 1:
                purchase();
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
                chilePurchase();
        }
    }
}
