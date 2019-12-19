package supermarket.DAO;

import supermarket.entity.AttenceInfo_Entity;

import java.util.List;

public interface AttenceInfoDAO {

    public List<AttenceInfo_Entity> queryAll();        //查

    public int insert_AttenceInfo(AttenceInfo_Entity attenceInfo);       //增(上班打卡)

    public int offDuty(String isoffduty,String offdutydate,String attenceno); //改（下班）

    public int update_AttenceInfo(AttenceInfo_Entity attenceInfo);       //改

    public int delete_AttenceInfo(String attenceno);      //删
}
