package supermarket.DAO;

import supermarket.entity.Supplier_Entity;

import java.util.List;

public interface SupplierDAO {
    public List<Supplier_Entity> queryAll();        //查

    public int insert_Supplier(Supplier_Entity supplier);       //增

    public int update_Supplier(Supplier_Entity supplier);       //改

    public int delete_Supplier(String supplierno );      //删
}
