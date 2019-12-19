package supermarket.service;

import supermarket.DAO.PurchaseDAO;
import supermarket.DAO.impl.PurchaseDAOlmpl;
import supermarket.entity.Purchase_Entity;

import java.util.List;

public class Purchase_Service {

    private PurchaseDAO dao = new PurchaseDAOlmpl();

    public List<Purchase_Entity> queryAll(){  //查
        return dao.queryAll();
    }               //查

    public int addPurchase(Purchase_Entity purchase){           //增
        return dao.insert_Purchase(purchase);
    }   //增

    public int delPurchase(String purchaseid){           //删
        return dao.delete_Purchase(purchaseid);
    }   //删

    public int updatePurchase(Purchase_Entity purchase){            //改
        return dao.update_Purchase(purchase);
    }   //改
}
