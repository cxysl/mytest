package supermarket.UI;

import supermarket.entity.AttenceInfo_Entity;
import supermarket.entity.UserInfo_Entity;
import supermarket.service.AttenceInfo_Service;
import supermarket.service.UserInfo_Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 * 考勤
 */
public class AttenceInfo_UI {

    Scanner reader = new Scanner(System.in);
    private AttenceInfo_Service service = new AttenceInfo_Service();
    private UserInfo_Service service1 = new UserInfo_Service();

    /**
     * 显示考勤记录（查）
     */
    public void showAttenceInfo(){   //显示所有收营员
        List<AttenceInfo_Entity> list = service.queryAll();
        for (AttenceInfo_Entity e: list
                ) {
                System.out.println(e);
        }
    }

    /**
     * 插入考勤记录（增）上班
     */
    public void on_AttenceInfo(String userno){    //增加
        AttenceInfo_Entity attenceInfo = new AttenceInfo_Entity();
        final double d = Math.random();
        final int i = (int)(d*1000);
        String attenceno = String.valueOf(i);
        attenceInfo.setAttenceno(attenceno);         //考勤记录编号
        attenceInfo.setUserno(userno);            //员工编号
        attenceInfo.setIsonduty("y");           //员工上班是否打卡
        SimpleDateFormat dateFormat = new SimpleDateFormat(" yyyy-MM-dd HH:mm");
        String currentDate =   dateFormat.format( new Date() );
        attenceInfo.setOndutydate(currentDate);         //员工上班打卡时间
        attenceInfo.setIsoffduty(null);         //下班是否打卡
        attenceInfo.setOffdutydate(null);        //员工下班打卡时间
        int a = service.addUser(attenceInfo);
        String str = a>0?"打卡成功":"打卡失败";
        System.out.println(str);
        System.out.println("您今天的打卡号为："+attenceno+"，今天下班打卡时要使用。");
    }


    /**
     * 插入考勤记录（增）下班
     */
    public void off_AttenceInfo(String userno){    //增加
        System.out.println("请输入你今天的打卡号:");
        String attenceno = reader.next();

        List<AttenceInfo_Entity> list = service.queryAll();
        for (AttenceInfo_Entity e: list
                ) {
            if (e.getAttenceno().equals(attenceno)) {

                String is = "y";

                SimpleDateFormat dateFormat = new SimpleDateFormat(" yyyy-MM-dd HH:mm");
                String currentDate =   dateFormat.format( new Date() );
                String offdate = currentDate;

                int c = service.off_Duty(is,offdate,attenceno);
                String str = c>0?"修改成功":"修改失败";
                System.out.println(str);
                break;
            }
        }

    }

    /**
     * 考勤记录删除
     */
    public  void del_AttenceInfo(){   //删
        System.out.println("请输入要删除账户的用户编号:");
        int b = service.delUser(reader.next());
        String str = b>0?"删除成功":"删除失败";
        System.out.println(str);
    }

    /**
     * 考勤记录修改
     */
    public void update_AttenceInfo(){   //改

        System.out.println("请输入考勤记录编号:");
        String attenceno = reader.next();

        System.out.println("请输入员工编号:");
        String userno = reader.next();

        System.out.println("请输入员工上班是否打卡:");
        String isonduty = reader.next();

        System.out.println("请输入员工上班打卡时间:");
        String ondutydate = reader.next();

        System.out.println("请输入员工下班是否打卡:");
        String isoffduty = reader.next();

        System.out.println("请输入员工下班打卡时间:");
        String offdutydate = reader.next();

        List<AttenceInfo_Entity> list = service.queryAll();
        for (AttenceInfo_Entity e: list
                ) {
            if(e.getAttenceno().equals(attenceno)) {
                e.setUserno(userno);
                e.setIsonduty(isonduty);
                e.setOndutydate(ondutydate);
                e.setIsoffduty(isoffduty);
                e.setOffdutydate(offdutydate);

                int c = service.updateUser(e);
                String str = c>0?"修改成功":"修改失败";
                System.out.println(str);
                break;
            }
        }
    }
}
