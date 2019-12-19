package supermarket.DAO.impl;

import supermarket.DAO.SupplierDAO;
import supermarket.common.BaseDAO;
import supermarket.entity.Supplier_Entity;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SupplierDAOlmpl extends BaseDAO<Supplier_Entity> implements SupplierDAO {
    /**
     * 查
     */
    public List<Supplier_Entity> queryAll() {
        String sql = "select * from supplier";
        return this.exec_Query(sql,null,"查询供应商表信息!!!!");
    }

    /**
     * 增
     */
    public int insert_Supplier(Supplier_Entity supplier) {
        String sql = "insert into supplier values(?,?,?,?,?,?)";
        Object[] objects = {
                supplier.getSupplierno()
                ,supplier.getSuppliername()
                ,supplier.getSuppliermanager()
                ,supplier.getSuppliercontact()
                ,supplier.getSuppliercontactphone()
                ,supplier.getSupplieraddress()
        };
        return this.exec_Update(sql,objects,"添加供应商表信息!!!!");
//        return 0;
    }

    /**
     *改
     */
    public int update_Supplier(Supplier_Entity supplier) {
        String sql = "update supplier set suppliername=?,suppliermanager=?,suppliercontact=?,suppliercontactphone=?,supplieraddress=? where supplierno=?";
        Object[] objects = {
                supplier.getSuppliername()
                ,supplier.getSuppliermanager()
                ,supplier.getSuppliercontact()
                ,supplier.getSuppliercontactphone()
                ,supplier.getSupplieraddress()
                ,supplier.getSupplierno()
        };
        return this.exec_Update(sql,objects,"修改供应商信息!!!!");
    }

    /**
     * 删
     */
    public int delete_Supplier(String supplierno) {
        String sql = "delete from supplier where supplierno=?";
        return this.exec_Update(sql,new Object[]{supplierno},"删除用户编号是"+supplierno+"的用户信息!!!!");
    }



    protected List<Supplier_Entity> resultToList(ResultSet rs) throws SQLException {
        List<Supplier_Entity> list = new ArrayList<>();
        while(rs.next())
        {
            Supplier_Entity supplier = new Supplier_Entity();
            supplier.setSupplierno(rs.getString("supplierno"));
            supplier.setSuppliername(rs.getString("suppliername"));
            supplier.setSuppliermanager(rs.getString("suppliermanager"));
            supplier.setSuppliercontact(rs.getString("suppliercontact"));
            supplier.setSuppliercontactphone(rs.getString("suppliercontactphone"));
            supplier.setSupplieraddress(rs.getString("supplieraddress"));

            list.add(supplier);
        }
        return list;
    }
}
