package supermarket.UI;

import supermarket.entity.Goods_Entity;
import supermarket.entity.SaleDetial_Entity;
import supermarket.service.Goods_Service;
import supermarket.service.SaleDetial_Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 * 销售明细/订单表
 */
public class SaleDetial_UI {

    Scanner reader = new Scanner(System.in);
    private SaleDetial_Service service = new SaleDetial_Service();
    private Goods_Service service1 = new Goods_Service();

    /**
     * 显示订单（查）
     */
    public void show_SaleDetial(){   //显示所有订单
        List<SaleDetial_Entity> list = service.queryAll();
        for (SaleDetial_Entity e: list
                ) {
            System.out.println(e);
        }
    }

    /**
     * 返回本次购买的总价（查）
     */
    public double show_SumPrice(){   //显示所有订单
        List<SaleDetial_Entity> list = service.queryAll();
        double sumPrice = 0;
        for (SaleDetial_Entity e: list
                ) {
            sumPrice = sumPrice + e.getSumprice();
        }
        return sumPrice;
    }

    /**
     * 插入订单（增）
     */
    public void add_SaleDetial(String userno,String goodsname,int count){    //增加
        SaleDetial_Entity saleDetial = new SaleDetial_Entity();

        final double d1 = Math.random();
        final int i1 = (int)(d1*100000);
        String detialid = String.valueOf(i1);
        saleDetial.setDetialid(detialid);       //明细序列号      OK
        saleDetial.setGoodsname(goodsname);        //商品名称      OK
        saleDetial.setUserno(userno);       //操作员号      OK
String goodscode = "";
Double  price = 0.0;
        List<Goods_Entity> list1 = service1.queryAll();
        for (Goods_Entity g :list1
                ) {
            if (g.getGoodsname().equals(goodsname)) {
                saleDetial.setGoodscode(g.getGoodscode());      //商品条码      OK
                goodscode = g.getGoodscode();
                  price = g.getPrice();     //单价      OK
                  saleDetial.setPrice(g.getPrice());
                saleDetial.setCount(count);     //数量      OK
                Goods_UI goods = new Goods_UI();
                goods.update_GoodsCount((-count), goodscode);    //售出后改库存      OK
            } }
        saleDetial.setSumprice(price*count);    //总价      OK
        SimpleDateFormat dateFormat = new SimpleDateFormat(" yyyy-MM-dd  HH:mm");
        String saledate =   dateFormat.format( new Date() );
        saleDetial.setSaledate(saledate);        //销售时间
        int x = service.addSaleDetial(saleDetial);
        String strx = x>0?"添加成功":"添加失败";
        System.out.println(strx);
    }

    /**
     * 订单删除
     */
    public  void del_SaleDetial(){   //删
//        System.out.println("请输入要删除明细序列号:");
        int b = service.delSaleDetial();
        String str = b>0?"删除成功":"删除失败";
        System.out.println(str);
    }

    /**
     * 订单修改
     */
    public void update_SaleDetial(){   //改
        System.out.println("请输入明细序列号:");
        String detialid = reader.next();

        System.out.println("请输入操作员号:");
        String userno = reader.next();

        System.out.println("请输入商品条码:");
        String goodscode = reader.next();

        System.out.println("请输入商品名称:");
        String goodsname = reader.next();

        System.out.println("请输入数量:");
        String count1 = reader.next();
        int count = Integer.parseInt(count1);

        System.out.println("请输入单价:");
        String price1 = reader.next();
        Double price = Double.parseDouble(price1);

        System.out.println("请输入总价:");
        String sumprice1 = reader.next();
        Double sumprice = Double.parseDouble(sumprice1);

        System.out.println("请输入销售时间:");
        String saledate = reader.next();

        List<SaleDetial_Entity> list = service.queryAll();
        for (SaleDetial_Entity e: list
                ) {
            if(e.getDetialid().equals(detialid)) {
                e.setUserno(userno);
                e.setGoodscode(goodscode);
                e.setGoodsname(goodsname);
                e.setCount(count);
                e.setPrice(price);
                e.setSumprice(sumprice);
                e.setSaledate(saledate);


                int c = service.updateSaleDetial(e);
                String str = c>0?"修改成功":"修改失败";
                System.out.println(str);
                break;
            }
        }
    }

}
