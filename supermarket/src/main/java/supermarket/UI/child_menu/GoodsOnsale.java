package supermarket.UI.child_menu;

import supermarket.UI.AdminUI;
import supermarket.UI.GoodsOnsale_UI;
import supermarket.UI.Goods_UI;

import java.util.Scanner;

/**
 * 2.2
 * 商品上下架管理
 */
public class GoodsOnsale {
    Scanner sc = new Scanner(System.in);

    public void goosOnsale(){
        System.out.println("1.查看所有商品上下架信息");
        System.out.println("2.指定商品上架");
        System.out.println("3.指定商品下架");
        System.out.println("4.查看商品上下架信息表");
//        System.out.println("5.修改商品上下架信息表");
        System.out.println("5.返回上级菜单");

        GoodsOnsale_UI ui = new GoodsOnsale_UI();
        Goods_UI gi = new Goods_UI();
        String str = sc.next();
        int i = Integer.parseInt(str);
        switch(i) {
            case 1:             //商品所有信息
                gi.showOnsaleGoods();
                chileGoodsOnsale();
                break;
            case 2:             //指定商品上架
                ui.onSale();
                chileGoodsOnsale();
                break;
            case 3:             //指定商品下架
                ui.downSale();
                chileGoodsOnsale();
                break;
            case 4:             //查看商品上下架信息表
                ui.showGoodsOnsale();
                chileGoodsOnsale();
                break;
            case 6000:             //修改商品上下架信息表
                ui.update_Goods();
                chileGoodsOnsale();
                break;
            case 5:
                AdminUI a = new AdminUI();
                a.adminMenu();
                break;
            default :
                System.out.println("输入错误，请重新输入！");
                goosOnsale();
        }
    }

    public void chileGoodsOnsale(){
        System.out.println("1、返回上一级");
        System.out.println("2、返回主菜单");
        System.out.println("3、退出系统");
        String str = sc.next();
        int i = Integer.parseInt(str);
        switch(i) {
            case 1:
                goosOnsale();
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
                chileGoodsOnsale();
        }
    }

}
