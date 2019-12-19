package supermarket.DAO.impl;

import supermarket.DAO.PurchaseDAO;
import supermarket.common.BaseDAO;
import supermarket.entity.Purchase_Entity;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PurchaseDAOlmpl extends BaseDAO<Purchase_Entity> implements PurchaseDAO {

    /**
     * 查
     */
    @Override
    public List<Purchase_Entity> queryAll() {
        String sql = "select * from Purchase";
        return this.exec_Query(sql,null,"查询进货表信息!!!!");
    }

    /**
     * 增
     */
    @Override
    public int insert_Purchase(Purchase_Entity purchase) {
        String sql = "insert into Purchase values(?,?,?,?,?,?,?)";
        Object[] objects = {
                purchase.getPurchaseid()
                ,purchase.getGoodscode()
                ,purchase.getGoosname()
                ,purchase.getPurchasetime()
                ,purchase.getPurchasecount()
                ,purchase.getPurchaseprice()
                ,purchase.getSupplierno()
        };
        return this.exec_Update(sql,objects,"添加进货表信息!!!!");
    }

    /**
     *改
     */
    @Override
    public int update_Purchase(Purchase_Entity purchase) {
        String sql = "update Purchase set goodscode=?,goosname=?,purchasetime=?,purchasecount=?,purchaseprice=?,supplierno=? where purchaseid=?";
        Object[] objects = {
                purchase.getGoodscode()
                ,purchase.getGoosname()
                ,purchase.getPurchasetime()
                ,purchase.getPurchasecount()
                ,purchase.getPurchaseprice()
                ,purchase.getSupplierno()
                ,purchase.getPurchaseid()
        };
        return this.exec_Update(sql,objects,"修改进货信息!!!!");
    }

    /**
     * 删
     */
    @Override
    public int delete_Purchase(String purchaseid) {
        String sql = "delete from Purchase where purchaseid=?";
        return this.exec_Update(sql,new Object[]{purchaseid},"删除进货id是"+purchaseid+"的进货信息!!!!");
    }

    @Override
    protected List<Purchase_Entity> resultToList(ResultSet rs) throws SQLException {
        List<Purchase_Entity> list = new ArrayList<>();
        while(rs.next())
        {
            Purchase_Entity purchase = new Purchase_Entity();
            purchase.setPurchaseid(rs.getString("purchaseid"));
            purchase.setGoodscode(rs.getString("goodscode"));
            purchase.setGoosname(rs.getString("goosname"));
            purchase.setPurchasetime(rs.getString("purchasetime"));
            purchase.setPurchasecount(rs.getInt("purchasecount"));
            purchase.setPurchaseprice(rs.getDouble("purchaseprice"));
            purchase.setSupplierno(rs.getString("supplierno"));

            list.add(purchase);
        }
        return list;
    }
}