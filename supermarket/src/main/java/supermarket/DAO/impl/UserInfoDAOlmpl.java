package supermarket.DAO.impl;

import supermarket.DAO.UserInfoDAO;
import supermarket.common.BaseDAO;
import supermarket.entity.UserInfo_Entity;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserInfoDAOlmpl extends BaseDAO<UserInfo_Entity> implements UserInfoDAO {

    /**
     * 查
     */
    public List<UserInfo_Entity> queryAll() {
        String sql = "select * from userinfo";
        return this.exec_Query(sql,null,"查询员工表信息!!!!");
    }

    /**
     * 增
     */
    public int insert_UserInfo(UserInfo_Entity user) {
        String sql = "insert into userinfo values(?,?,?,?,?,?,?,?)";
        Object[] objects = {
                user.getUserno()
                ,user.getUname()
                ,user.getPhone()
                ,user.getAccount()
                ,user.getPassword()
                ,user.getIsadmin()
                ,user.getIsenable()
                ,user.getIsonline()
        };
        return this.exec_Update(sql,objects,"添加员工表信息!!!!");
    }

    /**
     *改
     */
    public int update_UserInfo(UserInfo_Entity user) {
        String sql = "update userinfo set uname=?,phone=?,account=?,password=?,isadmin=?,isenable=?,isonline=? where userno=?";
        Object[] objects = {
                user.getUname()
                ,user.getPhone()
                ,user.getAccount()
                ,user.getPassword()
                ,user.getIsadmin()
                ,user.getIsenable()
                ,user.getIsonline()
                ,user.getUserno()
        };
        return this.exec_Update(sql,objects,"修改员工信息!!!!");
    }

    /**
     * 删
     */
    public int delete_UserInfo(String userno) {
        String sql = "delete from userinfo where userno=?";
        return this.exec_Update(sql,new Object[]{userno},"删除用户编号是"+userno+"的用户信息!!!!");
    }

    /**
     * 验证账户和密码（查部分）
     */
    public UserInfo_Entity loginByUser(String account, String password) {
        String sql = "select * from userinfo where account=? and password=?";
        Object[] objects = {account, password};
        List<UserInfo_Entity> list = exec_Query(sql,objects,"用户登录!!!");

        if(list.size()>0)
        {
            return list.get(0);
        }
        return null;
    }



    protected List<UserInfo_Entity> resultToList(ResultSet rs) throws SQLException {
        List<UserInfo_Entity> list = new ArrayList<>();
        while(rs.next())
        {
            UserInfo_Entity user = new UserInfo_Entity();
            user.setUserno(rs.getString("userno"));
            user.setUname(rs.getString("uname"));
            user.setPhone(rs.getString("phone"));
            user.setAccount(rs.getString("account"));
            user.setPassword(rs.getString("password"));
            user.setIsadmin(rs.getString("isadmin"));
            user.setIsenable(rs.getString("isenable"));
            user.setIsonline(rs.getString("isonline"));
            list.add(user);
        }
        return list;
    }
}