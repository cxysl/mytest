package supermarket.entity;

import java.io.Serializable;

public class AttenceInfo_Entity implements Serializable {       //考勤记录表
    private String attenceno;   //编号
    private String userno;      //员工编号
    private String isonduty;   //是否打卡
    private String ondutydate;   //打卡时间
    private String isoffduty;   //下班打卡
    private String offdutydate;   //下班打卡时间

    public String getAttenceno() {
        return attenceno;
    }

    public void setAttenceno(String attenceno) {
        this.attenceno = attenceno;
    }

    public String getUserno() {
        return userno;
    }

    public void setUserno(String userno) {
        this.userno = userno;
    }

    public String getIsonduty() {
        return isonduty;
    }

    public void setIsonduty(String isonduty) {
        this.isonduty = isonduty;
    }

    public String getOndutydate() {
        return ondutydate;
    }

    public void setOndutydate(String ondutydate) {
        this.ondutydate = ondutydate;
    }

    public String getIsoffduty() {
        return isoffduty;
    }

    public void setIsoffduty(String isoffduty) {
        this.isoffduty = isoffduty;
    }

    public String getOffdutydate() {
        return offdutydate;
    }

    public void setOffdutydate(String offdutydate) {
        this.offdutydate = offdutydate;
    }

    @Override
    public String toString() {
        return "AttenceInfo_Entity{" +
                "attenceno='" + attenceno + '\'' +
                ", userno='" + userno + '\'' +
                ", isonduty='" + isonduty + '\'' +
                ", ondutydate='" + ondutydate + '\'' +
                ", isoffduty='" + isoffduty + '\'' +
                ", offdutydate='" + offdutydate + '\'' +
                '}';
    }
}
