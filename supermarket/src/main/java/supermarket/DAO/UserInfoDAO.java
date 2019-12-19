package supermarket.DAO;

import supermarket.entity.UserInfo_Entity;

import java.util.List;

public interface UserInfoDAO {
    public List<UserInfo_Entity> queryAll();        //查

    public int insert_UserInfo(UserInfo_Entity user);       //增

    public int update_UserInfo(UserInfo_Entity user);       //改

    public int delete_UserInfo(String userno);      //删

    public UserInfo_Entity loginByUser(String account,String password);     //验证账户密码
}
