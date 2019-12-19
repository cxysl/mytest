package supermarket.DAO;

import supermarket.entity.Goods_Entity;

import java.util.List;

public interface GoodsDAO {
    public List<Goods_Entity> queryAll();        //查

    public List<Goods_Entity> queryOnAll();        //只展示上架商品

    public List<Goods_Entity> querySaleAll();        //查上下架

    public int update_OnSaleGoods(String a,String goodscode);       //改上下架

    public int update_GoodsCount(int newcount,String goodscode);       //改库存量

    public int insert_Goods(Goods_Entity goods);       //增

    public int update_Goods(Goods_Entity goods);       //改

    public int delete_Goods(String goodscode);      //删

}
