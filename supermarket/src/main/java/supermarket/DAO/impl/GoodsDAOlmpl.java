package supermarket.DAO.impl;

import supermarket.DAO.GoodsDAO;
import supermarket.common.BaseDAO;
import supermarket.entity.Goods_Entity;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class GoodsDAOlmpl extends BaseDAO<Goods_Entity> implements GoodsDAO {


    /**
     * 查
     */
    @Override
    public List<Goods_Entity> queryAll() {
        String sql = "select * from goods";
        return this.exec_Query(sql,null,"查询商品表信息!!!!");
    }

    /**
     * 只展示上架商品
     * @return
     */
    @Override
    public List<Goods_Entity> queryOnAll() {
        String sql = "select * from goods";
        return this.exec_Query(sql,null,"查询商品表信息!!!!");
    }

    /**
     * 查(上架状态)
     */
    @Override
    public List<Goods_Entity> querySaleAll() {
        String sql = "select * from goods";
        return this.exec_Query(sql,null,"查询商品表信息!!!!");
    }

    /**
     * 增
     */
    @Override
    public int insert_Goods(Goods_Entity goods) {
        String sql = "insert into goods values(?,?,?,?,?,?)";
        Object[] objects = {
                goods.getGoodscode()
                ,goods.getBarcode()
                ,goods.getGoodsname()
                ,goods.getIsonsale()
                ,goods.getPrice()
                ,goods.getCount()
        };
        return this.exec_Update(sql,objects,"添加商品表信息!!!!");
    }

    /**
     *改
     */
    @Override
    public int update_Goods(Goods_Entity goods) {
        String sql = "update goods set barcode=?,goodsname=?,isonsale=?,price=?,count=? where goodscode=?";
        Object[] objects = {
                goods.getBarcode()
                ,goods.getGoodsname()
                ,goods.getIsonsale()
                ,goods.getPrice()
                ,goods.getCount()
                ,goods.getGoodscode()
        };
        return this.exec_Update(sql,objects,"修改商品信息!!!!");
    }

    /**
     *改上下架
     */
    @Override
    public int update_OnSaleGoods(String a,String goodscode){
        String sql = "update goods set isonsale=? where goodscode=?";
        return this.exec_Update(sql,new Object[]{a,goodscode},"修改商品信息!!!!");
    }

    /**
     *改库存量
     */
    @Override
    public int update_GoodsCount(int a,String goodscode){
        String sql = "update goods set count=? where goodscode=?";
        /*Object[] objects = {
                goods.getCount()
                ,goods.getGoodscode()
        };*/
        return this.exec_Update(sql,new Object[]{a,goodscode},"修改商品信息!!!!");
    }
    /**
     * 删
     */
    @Override
    public int delete_Goods(String goodscode) {
        String sql = "delete from goods where goodscode=?";
        return this.exec_Update(sql,new Object[]{goodscode},"删除商品编号是"+goodscode+"的商品信息信息!!!!");
    }

    @Override
    protected List<Goods_Entity> resultToList(ResultSet rs) throws SQLException {
        List<Goods_Entity> list = new ArrayList<>();
        while(rs.next())
        {
            Goods_Entity goods = new Goods_Entity();
            goods.setGoodscode(rs.getString("goodscode"));
            goods.setBarcode(rs.getString("barcode"));
            goods.setGoodsname(rs.getString("goodsname"));
            goods.setIsonsale(rs.getString("isonsale"));
            goods.setPrice(rs.getDouble("price"));
            goods.setCount(rs.getInt("count"));
            list.add(goods);
        }
        return list;
    }
}
