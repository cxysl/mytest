package zuoye01.dao;

import zuoye01.entity.User01;

import java.util.List;

public interface UserDAO {

    public List<User01> queryAll();

    public int insertUser01(User01 user01);

    public int updateUser01(User01 user01);

    public int deleteUser01(String uname);
}
