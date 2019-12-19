package supermarket.entity;

import java.io.Serializable;

public class UserInfo_Entity implements Serializable {

    private String userno;
    private String uname;
    private String phone;
    private String account;
    private String password;
    private String isadmin;
    private String isenable;
    private String isonline;

    public String getUserno() {
        return userno;
    }

    public void setUserno(String userno) {
        this.userno = userno;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getIsadmin() {
        return isadmin;
    }

    public void setIsadmin(String isadmin) {
        this.isadmin = isadmin;
    }

    public String getIsenable() {
        return isenable;
    }

    public void setIsenable(String isenable) {
        this.isenable = isenable;
    }

    public String getIsonline() {
        return isonline;
    }

    public void setIsonline(String isonline) {
        this.isonline = isonline;
    }

    @Override
    public String toString() {
        return "用户实体:\t" +
                "用户编号='" + userno + '\'' +
                ", 姓名='" + uname + '\'' +
                ", 手机号='" + phone + '\'' +
                ", 账号='" + account + '\'' +
                ", 密码='" + password + '\'' +
                ", 是否是管理员='" + isadmin + '\'' +
                ", 账号激活状态='" + isenable + '\'' +
                ", 是否在职='" + isonline + '\'' +
                ' ';
    }
}
