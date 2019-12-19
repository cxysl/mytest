package supermarket.service;

import supermarket.DAO.SaleDetialDAO;
import supermarket.DAO.impl.SaleDetialDAOlmpl;
import supermarket.entity.SaleDetial_Entity;

import java.util.List;

public class SaleDetial_Service {


    private SaleDetialDAO dao = new SaleDetialDAOlmpl();

    public List<SaleDetial_Entity> queryAll(){  //查
        return dao.queryAll();
    }   //查

    public int addSaleDetial(SaleDetial_Entity saleDetial){  //增
        return dao.insert_SaleDetial(saleDetial);
    }   //增

    public int delSaleDetial(){   //删
        return dao.delete_SaleDetial();
    }   //删

    public int updateSaleDetial(SaleDetial_Entity saleDetial){  //改
        return dao.update_SaleDetial(saleDetial);
    }   //改
}
