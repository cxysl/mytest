package supermarket.DAO;

import supermarket.entity.GoodsOnsale_Entity;

import java.util.List;

public interface GoodsOnsaleDAO {
    public List<GoodsOnsale_Entity> queryAll();        //查

    public int insert_Goods(GoodsOnsale_Entity goodsOnsale);       //增

    public int update_Goods(GoodsOnsale_Entity goodsOnsale);       //改

    public int delete_Goods(String goodsoperaterid);      //删
}
