package supermarket.UI;

import supermarket.common.File_Uitl;
import supermarket.common.Init_DataBase;
import supermarket.entity.UserInfo_Entity;
import supermarket.service.UserInfo_Service;

import java.util.Scanner;

public class MainUI {

    Scanner sc = new Scanner(System.in);

    public void stup(){
        String str = File_Uitl.readFile("src/main/resources/stup.txt");
        if(null!=str&&str.equals("Y")){
            open_ststem();
        }else{
            init_system();
        }
    }

    public void init_system(){
        System.out.println("是否安装皇家首义超市收银系统");
        System.out.println("是（Y）\t否（N）");
        String str =sc.next();
        if(str.equals("Y")||str.equals("y")){
            Init_DataBase.exec_shellsql();
            File_Uitl.writeFile("src/main/resources/stup.txt");
        }else{
            System.out.println("程序没有安装成功，返回安装！！！");
            return;
        }
        System.out.println("程序安装完毕！！！");
        open_ststem();
    }

    public void open_ststem(){
        System.out.println("~~~~~~~~~~~~~~~是否立即打开皇家首义超市收银系统？(Y)是\t(N)否~~~~~~~~~~~~~~~\n");
        String str = sc.next();
        if(str.equals("Y")||str.equals("y")){
            mainMenu();
        }else{
            return;
        }
    }

    /**
     * 主菜单
     */

    public static int count = 0;

    public void mainMenu(){
        while (true){
            count++;
            if(count>3){
                System.out.println("您已经错误输入3次，程序将自动结束");
                System.exit(0);
                break;
            }
            login();
        }
    }
    public void login(){
        System.out.println("\t请输入用户：\t");
        String user = sc.next();
        System.out.println("\t请输入密码：\t");
        String pwd = sc.next();
        UserInfo_Service service = new UserInfo_Service();
        UserInfo_Entity userInfo = service.doLogin(user,pwd);

        if(null != userInfo) //用户存在
        {
            if(userInfo.getIsadmin().equals("Y")||userInfo.getIsadmin().equals("y"))    //是否是管理员
            {
                AdminUI admin = new AdminUI();
                admin.adminMenu();
            }else{          //不是管理员，即是收银员
                if (userInfo.getIsenable().equals("Y")||userInfo.getIsenable().equals("y"))     //是否被激活
                {
                    EmployeeUI employeeUI = new EmployeeUI();
                    employeeUI.employeeUI(userInfo.getUserno());
                }else{
                    System.out.println("账户被禁用,请使用其他账户登录");
                    mainMenu();
                }
            }
        }else{
            System.out.println("你输入的用户名或者密码错误!!!");
            mainMenu();
        }
    }
}