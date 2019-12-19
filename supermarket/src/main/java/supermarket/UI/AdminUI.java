package supermarket.UI;


import supermarket.UI.child_menu.*;

import java.util.Scanner;

public class AdminUI {

    Scanner sc = new Scanner(System.in);

    public void  adminMenu()
    {
        System.out.println("~~~~~~~~~~~~你好，管理员大人！~~~~~~~~~~~~\n");
        System.out.println("\t1.1.收银员账号管理");          // √
        System.out.println("\t1.2.收银员考勤记录");          // √

        System.out.println("\t2.1.商品管理 ");          // √
        System.out.println("\t2.2.商品上架和下架");          // √

        System.out.println("\t3.1.供应商管理");          // √

        System.out.println("\t3.3.商品进货");          // √
        System.out.println("\t3.4.进货信息报表");          // √
//        System.out.println("3.5.库存记录报表(二期)");// ✘
//        System.out.println("3.6.缺货记录报表(二期)");// ✘
//        System.out.println("3.7.超市营业额报表(二期)");// ✘

        System.out.println("\t4.返回登录界面");

        System.out.println("\t5.退出");



        String str = sc.next();
        if(str.equals("1.1"))   {
            EmployeeManager e = new EmployeeManager();          //收营员管理菜单        1.1
            e.employeeManager();
        }

        else if(str.equals("1.2"))  {
            AttenceInfoManager a = new AttenceInfoManager();          //收银员考勤记录        1.2
            a.attenceInfoManager();
        }

        else if(str.equals("2.1"))  {
            GoodsManager g = new GoodsManager();                //商品管理菜单         2.1
            g.goodsManager();
        }
        else if(str.equals("2.2"))  {
            GoodsOnsale g = new GoodsOnsale();                  //商品上下架菜单         2.2
            g.goosOnsale();
        }
        else if(str.equals("3.1"))  {                            //商品上下架菜单         3.1
            SupplierManager s = new SupplierManager();
            s.supplierManager();
        }
        else if(str.equals("3.2"))  {
            System.out.println("抱歉，此模块还未开发");
            adminMenu();
        }
        else if(str.equals("3.3"))  {                            //商品进货         3.3
            ADDGoods a = new ADDGoods();
            a.purchase();

        }
        else if(str.equals("3.4"))  {
            Purchase_UI ui = new Purchase_UI();
            ui.showPurchase();
            chileMenu();
        }
        else if(str.equals("3.5"))  {
            System.out.println("抱歉，此模块还未开发");
            adminMenu();
        }
        else if(str.equals("3.6"))  {
            System.out.println("抱歉，此模块还未开发");
            adminMenu();
        }
        else if(str.equals("3.7"))  {
            System.out.println("抱歉，此模块还未开发");
            adminMenu();
        }
        else if(str.equals("4"))  {
            MainUI mainUI = new MainUI(); //登录界面
            mainUI.stup();
        }
        else if(str.equals("5"))  {
            System.exit(0);
        }
        else{
            System.out.println("输入错误，请重新输入！");
            adminMenu();
        }
    }

    public void chileMenu(){
        System.out.println("1、返回上一级");
        System.out.println("2、返回登录界面");
        System.out.println("3、退出系统");
        String str = sc.next();
        int i = Integer.parseInt(str);
        switch(i) {
            case 1:
                adminMenu();
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
                chileMenu();
        }
    }

}
