package supermarket.DAO;

import supermarket.entity.Purchase_Entity;

import java.util.List;

public interface PurchaseDAO {

    public List<Purchase_Entity> queryAll();        //查

    public int insert_Purchase(Purchase_Entity purchase);       //增

    public int update_Purchase(Purchase_Entity purchase);       //改

    public int delete_Purchase(String purchaseid);      //删
}
