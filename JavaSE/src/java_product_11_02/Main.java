package java_product_11_02;

import java.util.Scanner;
import static java_product_11_02.Product_Operate.product_list;
import static java_product_11_02.Product_Operate.promote;
/**
 * author:程世林
 * Creative time：2019-11-02
 */


/**
 * 主函数类
 * 系统初始化开始
 */
public class Main {

    public static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        Product p = new Product("卫龙集团","卫龙","亲嘴烧",5.5,"12138");
        p.isPromote = false;
        product_list.add(p);
        menu();
    }


    /**
     * 主菜单
     */
    public static void menu(){

        Product_Operate Operate = new Product_Operate();       //操作类对象创建

        System.out.println("***************欢迎来到皇家首义超市***************\n");
        System.out.println("\t1、查看已有商品");
        System.out.println("\t2、添加商品");
        System.out.println("\t3、删除商品");
        System.out.println("\t4、查看商品详细信息");
        System.out.println("\t5、退出系统");

        int x = reader.nextInt();
        switch (x){
            case 1:
                Operate.showAll();
                Product_Operate.menu_child();
                break;
            case 2:
                Operate.addProduct();
                Product_Operate.menu_child();
                break;
            case 3:
                Operate.delProduct();
                Product_Operate.menu_child();
                break;
            case 4:
                //
                Operate.showAll();
                promote.showAll_child();
                break;
            case 5:
                System.out.println("\n**************皇家首义欢迎您下次再来***************");
                System.exit(1);
                break;
            default:
                System.out.println("输入错误请重新输入！");
                menu();
                break;
        }
    }
}