package supermarket.service;

import supermarket.DAO.AttenceInfoDAO;
import supermarket.DAO.impl.AttenceInfoDAOlmpl;
import supermarket.entity.AttenceInfo_Entity;

import java.util.List;

public class AttenceInfo_Service {
    private AttenceInfoDAO dao = new AttenceInfoDAOlmpl();

    public List<AttenceInfo_Entity> queryAll(){  //查
        return dao.queryAll();
    }   //查

    public int addUser(AttenceInfo_Entity attenceInfo){  //增
        return dao.insert_AttenceInfo(attenceInfo);
    }   //增

    public int delUser(String attenceno){   //删
        return dao.delete_AttenceInfo(attenceno);
    }   //删

    public int off_Duty(String isoffduty, String offdutydate, String attenceno){  //改
        return dao.offDuty(isoffduty,offdutydate,attenceno);
    }   //改

    public int updateUser(AttenceInfo_Entity attenceInfo){  //改
        return dao.update_AttenceInfo(attenceInfo);
    }   //改
}
