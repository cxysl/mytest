package supermarket.UI;

import supermarket.entity.UserInfo_Entity;
import supermarket.service.UserInfo_Service;

import java.util.List;
import java.util.Scanner;

public class UserInfo_UI {

    Scanner reader = new Scanner(System.in);
    private UserInfo_Service service = new UserInfo_Service();

    /**
     * 显示用户账号（查）
     */
    public void showUser(){   //显示所有收营员
        List<UserInfo_Entity> list = service.queryAll();
        for (UserInfo_Entity e: list
                ) {
            if (!e.getIsadmin().equals("y"))
            System.out.println(e);
        }
    }

    /**
     * 插入用户收营员账号（增）
     */
    public void add_user(){    //增加
        UserInfo_Entity user = new UserInfo_Entity();

        System.out.println("请输入用户编号:");
        user.setUserno(reader.next());

        System.out.println("请输入用户姓名:");
        user.setUname(reader.next());

        System.out.println("请输入用户电话:");
        user.setPhone(reader.next());

        System.out.println("请输入用户账号:");
        user.setAccount(reader.next());

        System.out.println("请输入用户密码:");
        user.setPassword(reader.next());

//        System.out.println("用户是否是管理员（y）是\t（n）否:");
        user.setIsadmin("n");

        System.out.println("用户账号是否激活（y）是\t（n）否:");
        user.setIsenable(reader.next());

        System.out.println("用户是否在职（y）是\t（n）否:");
        user.setIsonline(reader.next());

        int a = service.addUser(user);
        String str = a>0?"添加成功":"添加失败";
        System.out.println(str);
    }

    /**
     * 用户账号删除
     */
    public  void del_user(){   //删
        System.out.println("请输入要删除账户的用户编号:");
        int b = service.delUser(reader.next());
        String str = b>0?"删除成功":"删除失败";
        System.out.println(str);
    }

    /**
     * 用户账号修改
     */
    public void update_user(){   //改

        System.out.println("请输入信息要修改用户的编号:");
        String userno = reader.next();

        System.out.println("请输入信息要修改用户的姓名:");
        String uname = reader.next();

        System.out.println("请输入信息要修改用户的电话:");
        String phone = reader.next();

        System.out.println("请输入信息要修改用户的账号:");
        String account = reader.next();

        System.out.println("请输入信息要修改用户的密码:");
        String password = reader.next();

//        System.out.println("请输入信息要修改用户是否是管理员（y）是\t（n）否:");
//        String isadmin = reader.next();

        System.out.println("请输入信息要修改用户的账号是否激活（y）是\t（n）否:");
        String isenable = reader.next();

        System.out.println("请输入信息要修改用户是否在职（y）是\t（n）否:");
        String isonline = reader.next();



        List<UserInfo_Entity> list = service.queryAll();
        for (UserInfo_Entity e: list
                ) {
            if(e.getUserno().equals(userno)) {
                e.setUname(uname);
                e.setPhone(phone);
                e.setAccount(account);
                e.setPassword(password);
                e.setIsadmin("n");
                e.setIsenable(isenable);
                e.setIsonline(isonline);
                int c = service.updateUser(e);
                String str = c>0?"修改成功":"修改失败";
                System.out.println(str);
                break;
            }
        }
    }

    /**
     * 收银员账号查询
     */
    public void sel_CheckerAccount() {

        System.out.println("请输入要查找的收营员编号:");
        String userno = reader.next();

        List<UserInfo_Entity> list = service.queryAll();
        for (UserInfo_Entity e : list
                ) {
            if (e.getUserno().equals(userno)) {
                System.out.println(e);
            }
        }
    }

    /**
     * 激活收银员账号
     */
    public void activate_Account(){
        System.out.println("请输入要激活账号的收营员编号:");
        String userno = reader.next();

        List<UserInfo_Entity> list = service.queryAll();
        for (UserInfo_Entity e : list
                ) {
            if (e.getUserno().equals(userno)) {
                e.setIsenable("y");
                System.out.println("激活成功，该账户信息如下");
                System.out.println(e);
            }
        }
    }

    /**
     * 锁定收银员账号
     */
    public void lock_Account(){
        System.out.println("请输入要激活账号的收营员编号:");
        String userno = reader.next();

        List<UserInfo_Entity> list = service.queryAll();
        for (UserInfo_Entity e : list
                ) {
            if (e.getUserno().equals(userno)) {
                e.setIsenable("n");
                System.out.println("锁定成功，该账户信息如下");
                System.out.println(e);
            }
        }
    }
}
