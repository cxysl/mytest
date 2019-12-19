package supermarket.DAO;

import supermarket.entity.SaleDetial_Entity;

import java.util.List;

public interface SaleDetialDAO {

    public List<SaleDetial_Entity> queryAll();        //查

    public int insert_SaleDetial(SaleDetial_Entity saleDetial);       //增

    public int update_SaleDetial(SaleDetial_Entity saleDetial);       //改

    public int delete_SaleDetial();      //删
}
