package zuoye01.entity;
import java.io.Serializable;

public class User01 implements Serializable{
    private String uname;
    private String pwd;
    private String email;
    private String birthday;

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "员工: " +
                "\t姓名:'" + uname + '\'' +
                "\t代号:'" + pwd + '\'' +
                "\t邮箱:'" + email + '\'' +
                "\t生日:'" + birthday + '\'' +
                ' ';
    }
}
