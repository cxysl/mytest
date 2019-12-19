package supermarket.UI.child_menu;


import supermarket.UI.AdminUI;
import supermarket.UI.Goods_UI;

import java.util.Scanner;

/**
 * 2.1
 * 商品管理
 */
public class GoodsManager {

    Scanner sc = new Scanner(System.in);

    public void goodsManager(){           //商品管理

        System.out.println("1.商品添加");
        System.out.println("2.商品删除");
        System.out.println("3.商品修改");
        System.out.println("4.商品显示");
        System.out.println("5.查看商品所有信息");
        System.out.println("6.返回上级菜单");
        Goods_UI ui = new Goods_UI();
        String str = sc.next();
        int i = Integer.parseInt(str);
        switch(i) {
            case 1:             //商品添加
                ui.add_Goods();
                chileGoodsManager();
                break;
            case 2:             //商品删除
                ui.del_Goods();
                chileGoodsManager();
                break;
            case 3:             //商品修改
                ui.update_Goods();
                chileGoodsManager();
                break;
            case 4:             //商品显示
                ui.showGoods();
                chileGoodsManager();
                break;
            case 5:             //商品显示
                ui.showOnsaleGoods();
                chileGoodsManager();
                break;
            case 6:
                AdminUI a = new AdminUI();
                a.adminMenu();
                break;
            default :
                System.out.println("输入错误，请重新输入！");
                chileGoodsManager();
        }
    }



    public void chileGoodsManager(){
        System.out.println("1、返回上一级");
        System.out.println("2、返回主菜单");
        System.out.println("3、退出系统");
        String str = sc.next();
        int i = Integer.parseInt(str);
        switch(i) {
            case 1:
                goodsManager();
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
                chileGoodsManager();
        }
    }
}
