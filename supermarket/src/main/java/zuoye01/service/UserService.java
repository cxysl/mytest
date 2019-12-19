package zuoye01.service;

import zuoye01.dao.UserDAO;
import zuoye01.dao.impl.UserDAOlmpl;
import zuoye01.entity.User01;

import java.util.List;

public class UserService {
    private UserDAO dao = new UserDAOlmpl();

    public List<User01> queryAll(){  //查
        return dao.queryAll();
    }

    public int addUser(User01 user01){  //增
        return dao.insertUser01(user01);
    }

    public int delUser(String uname){   //删
        return dao.deleteUser01(uname);
    }

    public int updateUser(User01 user01){  //改
        return dao.updateUser01(user01);
    }
}
