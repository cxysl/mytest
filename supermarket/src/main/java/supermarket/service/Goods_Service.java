package supermarket.service;

import supermarket.DAO.GoodsDAO;
import supermarket.DAO.impl.GoodsDAOlmpl;
import supermarket.entity.Goods_Entity;

import java.util.List;

public class Goods_Service {

    private GoodsDAO dao = new GoodsDAOlmpl();

    public List<Goods_Entity> queryAll(){  //查
        return dao.queryAll();
    }   //查

    public List<Goods_Entity> queryOnAll(){
        return dao.queryOnAll();
    }

    public List<Goods_Entity> querySaleAll(){  //查
        return dao.querySaleAll();
    }   //查

    public int addUser(Goods_Entity goods){  //增
        return dao.insert_Goods(goods);
    }   //增

    public int delUser(String goodscode){   //删
        return dao.delete_Goods(goodscode);
    }   //删

    public int updateUser(Goods_Entity goods){  //改信息
        return dao.update_Goods(goods);
    }   //改

    public int updateGoodsOnsale(String a,String goodscode){       //改商品上下架信息信息
        return dao.update_OnSaleGoods(a,goodscode);
    }

    public int updateGoodsCount(int newcount,String goodscode){       //改商品库存量信息信息
        return dao.update_GoodsCount(newcount,goodscode);
    }
}
