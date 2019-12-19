package supermarket.UI.child_menu;

import supermarket.UI.AdminUI;
import supermarket.UI.Supplier_UI;

import java.util.Scanner;

public class SupplierManager {

    Scanner sc = new Scanner(System.in);


    public void supplierManager()           //员工经理
    {
        System.out.println("1.供应商添加");
        System.out.println("2.供应商删除");
        System.out.println("3.供应商修改");
        System.out.println("4.查看供应商");
        System.out.println("5.返回上级菜单");
        Supplier_UI ui = new Supplier_UI();
        String str = sc.next();
        int i = Integer.parseInt(str);
        switch(i) {
            case 1:             //供应商添加
                ui.add_supplier();
                chilesupplierManager();
                break;
            case 2:             //供应商删除
                ui.del_supplier();
                chilesupplierManager();
                break;
            case 3:             //供应商修改
                ui.update_supplier();
                chilesupplierManager();
                break;
            case 4:             //供应商查询
                ui.showsupplier();
                chilesupplierManager();
                break;
            case 5:
                AdminUI a = new AdminUI();
                a.adminMenu();
                break;
            default :
                System.out.println("输入错误，请重新输入！");
                supplierManager();
        }
    }
    public void chilesupplierManager(){
        System.out.println("1、返回上一级");
        System.out.println("2、返回主菜单");
        System.out.println("3、退出系统");
        String str = sc.next();
        int i = Integer.parseInt(str);
        switch(i) {
            case 1:
                supplierManager();
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
                chilesupplierManager();
        }
    }
}
