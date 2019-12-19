package zuoye01.example_UI;

import zuoye01.entity.User01;
import zuoye01.service.UserService;

import java.util.List;
import java.util.Scanner;

public class User_UI {

    Scanner reader = new Scanner(System.in);
    private UserService service = new UserService();

    public void showUser(){   //显示
        List<User01> list = service.queryAll();
        for (User01 e: list
                ) {
            System.out.println(e);
        }
//        list.forEach(emp-> System.out.println(emp));
    }

    public void add_user(){    //增加
        User01 user01 = new User01();

        System.out.println("请输入员工姓名:");
        user01.setUname(reader.next());

        System.out.println("请输入员工账户密码:");
        user01.setPwd(reader.next());

        System.out.println("请输入员工邮箱:");
        user01.setEmail(reader.next());

        System.out.println("请输入员工出生日期:");
        user01.setBirthday(reader.next());

        int a = service.addUser(user01);
        String str = a>0?"添加成功":"添加失败";
        System.out.println(str);
    }

    public  void del_user(){   //删
        System.out.println("请输入要开除员工的姓名:");
        int b = service.delUser(reader.next());
        String str = b>0?"删除成功":"删除失败";
        System.out.println(str);
    }

    public void update_user(){   //改

        System.out.println("被修改员工的出生日期:");
        String birthday = reader.next();

        System.out.println("被修改员工的账户密码:");
        String pwd = reader.next();

        System.out.println("被修改员工的邮箱:");
        String email = reader.next();

        System.out.println("被修改员工的姓名:");
        String uname = reader.next();

        List<User01> list = service.queryAll();
        for (User01 e: list
                ) {
            if(e.getUname().equals(uname)) {
                e.setBirthday(birthday);
                e.setPwd(pwd);
                e.setEmail(email);
                int c = service.updateUser(e);
                String str = c>0?"修改成功":"修改失败";
                System.out.println(str);
                break;
            }
        }
    }
}