package supermarket.DAO.impl;

import supermarket.DAO.AttenceInfoDAO;
import supermarket.common.BaseDAO;
import supermarket.entity.AttenceInfo_Entity;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AttenceInfoDAOlmpl extends BaseDAO<AttenceInfo_Entity> implements AttenceInfoDAO {

    /**
     * 查
     */
    @Override
    public List<AttenceInfo_Entity> queryAll() {
        String sql = "select * from attenceInfo";
        return this.exec_Query(sql,null,"查询考勤记录表信息!!!!");
    }

    /**
     * 增
     */
    @Override
    public int insert_AttenceInfo(AttenceInfo_Entity attenceInfo) {
        String sql = "insert into attenceInfo values(?,?,?,?,?,?)";
        Object[] objects = {
                attenceInfo.getAttenceno()
                ,attenceInfo.getUserno()
                ,attenceInfo.getIsonduty()
                ,attenceInfo.getOndutydate()
                ,attenceInfo.getIsoffduty()
                ,attenceInfo.getIsoffduty()
        };
        return this.exec_Update(sql,objects,"添加考勤记录表信息!!!!");
    }

    /**
     * 改 下班
     */
    @Override
    public int offDuty(String isoffduty, String offdutydate, String attenceno) {
        String sql = "update attenceInfo set isoffduty=?,offdutydate=? where attenceno=?";
        return this.exec_Update(sql,new Object[]{isoffduty,offdutydate,attenceno},"下班打卡!!!!");
    }

    /**
     *改
     */
    @Override
    public int update_AttenceInfo(AttenceInfo_Entity attenceInfo) {
        String sql = "update attenceInfo set userno=?,isonduty=?,ondutydate=?,isoffduty=?,offdutydate=?  where attenceno=?";
        Object[] objects = {
                attenceInfo.getUserno()
                ,attenceInfo.getIsonduty()
                ,attenceInfo.getOndutydate()
                ,attenceInfo.getIsoffduty()
                ,attenceInfo.getIsoffduty()
                ,attenceInfo.getAttenceno()
        };
        return this.exec_Update(sql,objects,"修改考勤记录表信息!!!!");
    }

    /**
     * 删
     */
    @Override
    public int delete_AttenceInfo(String attenceno) {
        String sql = "delete from attenceInfo where attenceno=?";
        return this.exec_Update(sql,new Object[]{attenceno},"删除编号是"+attenceno+"的考勤记录表信息!!!!");
    }

    @Override
    protected List<AttenceInfo_Entity> resultToList(ResultSet rs) throws SQLException {
        List<AttenceInfo_Entity> list = new ArrayList<>();
        while(rs.next())
        {
            AttenceInfo_Entity attenceInfo = new AttenceInfo_Entity();
            attenceInfo.setAttenceno(rs.getString("attenceno"));
            attenceInfo.setUserno(rs.getString("userno"));
            attenceInfo.setIsonduty(rs.getString("isonduty"));
            attenceInfo.setOndutydate(rs.getString("ondutydate"));
            attenceInfo.setIsoffduty(rs.getString("isoffduty"));
            attenceInfo.setOffdutydate(rs.getString("offdutydate"));

            list.add(attenceInfo);
        }
        return list;
    }
}
