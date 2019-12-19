package java_product_11_02;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * author:程世林
 * Creative time：2019-11-02
 */


/**
 * 商品操作类
 */
public class Product_Operate extends Product{

    /**
     * 内部类调用创建对象
     */
    public static LinkedList product_list = new LinkedList();
    public static Scanner reader = new Scanner(System.in);
    Product product = new Product();
    public static Promote promote = new Promote();

    /**
     * 一级菜单中第1、2栏的子菜单
     */
    public static void menu_child(){
        System.out.println("\n\t1、返回上一级");
        System.out.println("\t2、退出程序");
        int i = reader.nextInt();
        switch (i){
            case 1:
                Main.menu();
                break;
            case 2:
                System.exit(0);
                break;
            default:
                System.out.println("输入错误请重新输入！");
                menu_child();
                break;
        }
    }



    /**
     * 显示全部商品信息
     * 主菜单中的第一栏
     */
    public void showAll(){
        for (Object o:product_list
                ) {
            System.out.print(o+",");
        }
    }


    /**
     * 添加商品对象
     * 主菜单中的第二栏
     */
    public void addProduct(){
        int i =0;
        i++;
        String a="000";
        a+=i;
        Product p = new Product();
        Scanner reader = new  Scanner(System.in);
        System.out.print("请输入商品名:");
        p.setProduct_name(reader.next());

        System.out.print("请输入商品价格:");
        p.setPrice(reader.nextDouble());

        System.out.print("请输入制造商:");
        p.setManufacturer(reader.next());

        System.out.print("请输入商品品牌:");
        p.setBrand(reader.next());

        p.setSku(a);

        product_list.add(p);
    }


    /**
     * 商品删除
     * 主菜单中的第三栏
     * 按商品编号删除
     */
    public void delProduct(){
        System.out.println("是否先打印已有商品（y/n）");
        String s = reader.next();
        if(s.equals("Y")||s.equals("y")) showAll();
        System.out.println("\n请输入要删除商品的商品编号:");
        String num = reader.next();
        for (Object o:product_list
             ) {
            Product p = new Product();
            p = (Product) o;
            if (((Product) o).sku.equals(num)){
                System.out.println(o);
                product_list.remove(o);
                System.out.println("删除成功");
            }
        }

    }
}