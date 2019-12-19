package supermarket.UI.child_menu;

import supermarket.UI.AdminUI;
import supermarket.UI.EmployeeUI;
import supermarket.UI.Goods_UI;
import supermarket.UI.SaleDetial_UI;

import java.util.Scanner;

/**
 * 收银模块
 */
public class PayManager {

    Scanner reader = new Scanner(System.in);

    public void payMenu(String userno){
        System.out.println("1、买东西并结账");
        System.out.println("2、返回上一级");

        String str = reader.next();
        int i = Integer.parseInt(str);
        switch(i) {
            case 1:             //买东西并结账
                pay(userno);
                payChild(userno);
                break;
            case 2:             //返回上一级
                EmployeeUI e =new EmployeeUI();
                e.employeeUI(userno);
                break;
            default :
                System.out.println("输入错误，请重新输入！");
                payMenu(userno);
        }
    }

    public void pay(String userno){
        SaleDetial_UI ui = new SaleDetial_UI();
        ui.del_SaleDetial();
        System.out.println("是（y）否(n)先展示上架商品：");
        String str = reader.next();
        if (str.equals("y")||str.equals("Y")){
            Goods_UI ui1 = new Goods_UI();
            ui1.showOneyOngoods();      // 遍历商品表,展示已经上架的商品
        }
        while (true){       // 购买商品
            System.out.println("请输入要购买商品的名称：");
            String goodsname = reader.next();
            System.out.println("请输入购买该商品的数量");
            int count = reader.nextInt();
            /**将每种商品放入一个临时表，方便算账和查看订单*/
            ui.add_SaleDetial(userno,goodsname,count);
            System.out.println("是（y）否(n)继续购买");
            String flag = reader.next();
            if (!(flag.equals("Y")||flag.equals("y"))){
                break;
            }
        } //遍历临时表 计算总价
        System.out.println("您本次一共消费了"+ui.show_SumPrice()+"元，期待您的下次光临！");
    }



    public void payChild(String userno){
        System.out.println("1、显示该次购买账单");
        System.out.println("2、返回上一级");
        System.out.println("3、返回主菜单");
        System.out.println("4、退出系统");

        String str = reader.next();
        int i = Integer.parseInt(str);
        switch(i) {
            case 1:             //显示该次购买账单
                SaleDetial_UI ui = new SaleDetial_UI();
                ui.show_SaleDetial();
                break;
            case 2:             //返回上一级
                payMenu(userno);
                break;
            case 3:             //返回主菜单
                EmployeeUI e =new EmployeeUI();
                e.employeeUI(userno);
                break;
            case 4:             //退出系统
                System.exit(0);
                break;

            default :
                System.out.println("输入错误，请重新输入！");
                payChild(userno);
        }
    }

}
