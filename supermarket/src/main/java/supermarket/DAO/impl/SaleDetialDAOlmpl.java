package supermarket.DAO.impl;

import supermarket.DAO.SaleDetialDAO;
import supermarket.common.BaseDAO;
import supermarket.entity.SaleDetial_Entity;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

//销售明细表
public class SaleDetialDAOlmpl extends BaseDAO<SaleDetial_Entity> implements SaleDetialDAO {


    /**
     * 查
     */
    @Override
    public List<SaleDetial_Entity> queryAll() {
        String sql = "select * from SaleDetial";
        return this.exec_Query(sql,null,"查询销售明细信息!!!!");
    }

    /**
     * 增
     */
    @Override
    public int insert_SaleDetial(SaleDetial_Entity saleDetial) {
        String sql = "insert into SaleDetial values(?,?,?,?,?,?,?,?)";
        Object[] objects = {
                saleDetial.getDetialid()
                ,saleDetial.getUserno()
                ,saleDetial.getGoodscode()
                ,saleDetial.getGoodsname()
                ,saleDetial.getCount()
                ,saleDetial.getPrice()
                ,saleDetial.getSumprice()
                ,saleDetial.getSaledate()
        };
        return this.exec_Update(sql,objects,"添加销售明细信息!!!!");
    }

    /**
     *改
     */
    @Override
    public int update_SaleDetial(SaleDetial_Entity saleDetial) {
        String sql = "update SaleDetial set userno=?,goodscode=?,goodsname=?,count=?,price=?,sumprice=?,saledate=?  where detialid=?";
        Object[] objects = {
                saleDetial.getUserno()
                ,saleDetial.getGoodscode()
                ,saleDetial.getGoodsname()
                ,saleDetial.getCount()
                ,saleDetial.getPrice()
                ,saleDetial.getSumprice()
                ,saleDetial.getSaledate()
                ,saleDetial.getDetialid()
        };
        return this.exec_Update(sql,objects,"修改销售明细信息!!!!");
    }

    /**
     * 删
     */
    @Override
    public int delete_SaleDetial() {
        String sql = "delete from SaleDetial";
        return this.exec_Update(sql,new Object[]{},"清空销售明细信息!!!!");
    }


    @Override
    protected List<SaleDetial_Entity> resultToList(ResultSet rs) throws SQLException {
        List<SaleDetial_Entity> list = new ArrayList<>();
        while(rs.next())
        {
            SaleDetial_Entity saleDetial = new SaleDetial_Entity();
            saleDetial.setDetialid(rs.getString("detialid"));
            saleDetial.setUserno(rs.getString("userno"));
            saleDetial.setGoodscode(rs.getString("goodscode"));
            saleDetial.setGoodsname(rs.getString("goodsname"));
            saleDetial.setCount(rs.getInt("count"));
            saleDetial.setPrice(rs.getDouble("price"));
            saleDetial.setSumprice(rs.getDouble("sumprice"));
            saleDetial.setSaledate(rs.getString("saledate"));
            list.add(saleDetial);
        }
        return list;
    }


}
