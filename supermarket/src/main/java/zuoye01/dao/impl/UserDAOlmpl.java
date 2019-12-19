package zuoye01.dao.impl;

import zuoye01.comm.BaseDAO;
import zuoye01.dao.UserDAO;
import zuoye01.entity.User01;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDAOlmpl extends BaseDAO<User01> implements UserDAO {

    /**
     * 查
     */
    public List<User01> queryAll() {
        String sql = "select * from user01";
        return this.exec_Query(sql,null,"查询员工表信息!!!!");
    }

    /**
     * 增
     */
    public int insertUser01(User01 user01) {
        String sql = "insert into user01 values(?,?,?,?)";
        Object[] objects = {
                user01.getUname()
                ,user01.getPwd()
                ,user01.getEmail()
                ,user01.getBirthday()
        };
        return this.exec_Update(sql,objects,"添加员工表信息!!!!");
    }

    /**
     *改
     */
    public int updateUser01(User01 user01) {
        String sql = "update user01 set birthday=?,pwd=?,email=? where uname=?";
        Object[] objects = {
                 user01.getBirthday()
                ,user01.getPwd()
                ,user01.getEmail()
                ,user01.getUname()
        };
        return this.exec_Update(sql,objects,"修改员工信息!!!!");
    }

    /**
     * 删
     */
    public int deleteUser01(String uname) {
        String sql = "delete from user01 where uname=?";
        return this.exec_Update(sql,new Object[]{uname},"删除姓名是"+uname+"员工信息!!!!");
    }

    @Override
    protected List<User01> resultToList(ResultSet rs) throws SQLException {
        List<User01> list = new ArrayList<>();
        while(rs.next())
        {
            User01 user01 = new User01();
            user01.setUname(rs.getString("uname"));
            user01.setPwd(rs.getString("pwd"));
            user01.setEmail(rs.getString("email"));
            user01.setBirthday(rs.getString("birthday"));
            list.add(user01);
        }
        return list;
    }

}


