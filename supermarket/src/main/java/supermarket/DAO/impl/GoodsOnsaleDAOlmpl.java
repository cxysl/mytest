package supermarket.DAO.impl;

import supermarket.DAO.GoodsOnsaleDAO;
import supermarket.common.BaseDAO;
import supermarket.entity.GoodsOnsale_Entity;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class GoodsOnsaleDAOlmpl extends BaseDAO<GoodsOnsale_Entity> implements GoodsOnsaleDAO {

    /**
     * 查
     */
    @Override
    public List<GoodsOnsale_Entity> queryAll() {
        String sql = "select * from GoodsOperater";
        return this.exec_Query(sql,null,"查询商品上下架表信息!!!!");
    }

    /**
     * 增
     */
    @Override
    public int insert_Goods(GoodsOnsale_Entity goodsOnsale) {
        String sql = "insert into GoodsOperater values(?,?,?,?,?,?,?)";
        Object[] objects = {
                goodsOnsale.getGoodsoperaterid()
                ,goodsOnsale.getUserno()
                ,goodsOnsale.getGoodscode()
                ,goodsOnsale.getGoodsname()
                ,goodsOnsale.getOnsaledate()
                ,goodsOnsale.getOnsaleprice()
                ,goodsOnsale.getIsonsale()
        };
        return this.exec_Update(sql,objects,"添加商品上下架信息!!!!");
    }

    /**
     *改
     */
    @Override
    public int update_Goods(GoodsOnsale_Entity goodsOnsale) {
        String sql = "update GoodsOperater set userno=?,goodscode=?,goodsname=?,onsaledate=?,onsaleprice=?,isonsale=? where goodsoperaterid=?";
        Object[] objects = {
                goodsOnsale.getUserno()
                ,goodsOnsale.getGoodscode()
                ,goodsOnsale.getGoodsname()
                ,goodsOnsale.getOnsaledate()
                ,goodsOnsale.getOnsaleprice()
                ,goodsOnsale.getIsonsale()
                ,goodsOnsale.getGoodsoperaterid()
        };
        return this.exec_Update(sql,objects,"修改商品上下架信息!!!!");
    }

    /**
     * 删
     */
    @Override
    public int delete_Goods(String goodsoperaterid) {
        String sql = "delete from GoodsOperater where goodscode=?";
        return this.exec_Update(sql,new Object[]{goodsoperaterid},"删除流水号是"+goodsoperaterid+"的商品上下架流水号信息信息!!!!");
    }

    @Override
    protected List<GoodsOnsale_Entity> resultToList(ResultSet rs) throws SQLException {
        List<GoodsOnsale_Entity> list = new ArrayList<>();
        while(rs.next())
        {
            GoodsOnsale_Entity goodsOnsale = new GoodsOnsale_Entity();
            goodsOnsale.setGoodsoperaterid(rs.getString("goodsoperaterid"));
            goodsOnsale.setUserno(rs.getString("userno"));
            goodsOnsale.setGoodscode(rs.getString("goodscode"));
            goodsOnsale.setGoodsname(rs.getString("goodsname"));
            goodsOnsale.setOnsaledate(rs.getString("onsaledate"));
            goodsOnsale.setOnsaleprice(rs.getDouble("onsaleprice"));
            goodsOnsale.setIsonsale(rs.getString("isonsale"));
            list.add(goodsOnsale);
        }
        return list;
    }
}
