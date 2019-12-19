package supermarket.service;

import supermarket.DAO.SupplierDAO;
import supermarket.DAO.impl.SupplierDAOlmpl;
import supermarket.entity.Supplier_Entity;

import java.util.List;

public class Supplier_Service {

    private SupplierDAO dao = new SupplierDAOlmpl();

    public List<Supplier_Entity> queryAll(){  //查
        return dao.queryAll();
    }   //查

    public int addSupplier(Supplier_Entity supplier){  //增
        return dao.insert_Supplier(supplier);
    }   //增

    public int delSupplier(String supplierno){   //删
        return dao.delete_Supplier(supplierno);
    }   //删

    public int updateSupplier(Supplier_Entity supplier){  //改
        return dao.update_Supplier(supplier);
    }   //改
}
