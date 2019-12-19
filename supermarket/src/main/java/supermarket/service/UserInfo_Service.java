package supermarket.service;

import supermarket.DAO.UserInfoDAO;
import supermarket.DAO.impl.UserInfoDAOlmpl;
import supermarket.entity.UserInfo_Entity;

import java.util.List;

public class UserInfo_Service {

    private UserInfoDAO dao = new UserInfoDAOlmpl();

    public UserInfo_Entity doLogin(String uname, String pwd){
        return dao.loginByUser(uname,pwd);
    }       //验证用户名和密码

    public List<UserInfo_Entity> queryAll(){  //查
        return dao.queryAll();
    }   //查

    public int addUser(UserInfo_Entity user){  //增
        return dao.insert_UserInfo(user);
    }   //增

    public int delUser(String userno){   //删
        return dao.delete_UserInfo(userno);
    }   //删

    public int updateUser(UserInfo_Entity user){  //改
        return dao.update_UserInfo(user);
    }   //改
}
