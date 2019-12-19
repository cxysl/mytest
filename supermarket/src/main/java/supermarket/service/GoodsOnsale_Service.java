package supermarket.service;

import supermarket.DAO.GoodsOnsaleDAO;
import supermarket.DAO.impl.GoodsOnsaleDAOlmpl;
import supermarket.entity.GoodsOnsale_Entity;

import java.util.List;

public class GoodsOnsale_Service {
    private GoodsOnsaleDAO dao = new GoodsOnsaleDAOlmpl();

    public List<GoodsOnsale_Entity> queryAll(){  //查
        return dao.queryAll();
    }   //查

    public int addUser(GoodsOnsale_Entity goodsOnsale){  //增
        return dao.insert_Goods(goodsOnsale);
    }   //增

    public int delUser(String goodscode){   //删
        return dao.delete_Goods(goodscode);
    }   //删

    public int updateUser(GoodsOnsale_Entity goods){  //改
        return dao.update_Goods(goods);
    }   //改
}
