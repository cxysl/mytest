package supermarket.UI;

import supermarket.entity.GoodsOnsale_Entity;
import supermarket.entity.Goods_Entity;
import supermarket.service.GoodsOnsale_Service;
import supermarket.service.Goods_Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class GoodsOnsale_UI {

    Scanner reader = new Scanner(System.in);
    private GoodsOnsale_Service service = new GoodsOnsale_Service();
    private Goods_Service service1 = new Goods_Service();

    /**
     * 显示所有商品上下架信息（查）
     */
    public void showGoodsOnsale() {   //显示所有商品
        List<GoodsOnsale_Entity> list = service.queryAll();
        for (GoodsOnsale_Entity e : list
                ) {
            System.out.println(e);
        }
    }

    /**
     * 插入商品上下架信息（增）
     */
    public void add_GoodsOnsale(String goodscode,String goodsname,double price,String isonsale){    //增加
        GoodsOnsale_Entity onsale = new GoodsOnsale_Entity();

        final double d1 = Math.random();
        final int i1 = (int)(d1*100000);
        String goodsoperaterid = String.valueOf(i1);
//        System.out.println("请输入商品上下架流水号:");
        onsale.setGoodsoperaterid(goodsoperaterid);

//        System.out.println("请输入操作员号:");
        final double d = Math.random();
        final int i = (int)(d*1000);
        String userno = String.valueOf(i);
        onsale.setUserno(userno);

//        System.out.println("请输入商品条码:");
        onsale.setGoodscode(goodscode);

//        System.out.println("请输入商品名称:");
        onsale.setGoodsname(goodsname);

        SimpleDateFormat dateFormat = new SimpleDateFormat(" yyyy-MM-dd  HH:mm");
        String currentDate =   dateFormat.format( new Date() );
        onsale.setOnsaledate(currentDate);

        System.out.println("请输入商品上架价格:");
        onsale.setOnsaleprice(price);

//        System.out.println("请输入商品上架商品状态:");
        onsale.setIsonsale(isonsale);

        int a = service.addUser(onsale);
        String str = a>0?"添加成功":"添加失败";
        System.out.println(str);
    }

    /**
     * 商品上下架信息删除
     */
    public  void del_GoodsOnsale(){   //删
        System.out.println("请输入要删除上下架流水号:");
        int b = service.delUser(reader.next());
        String str = b>0?"删除成功":"删除失败";
        System.out.println(str);
    }

    /**
     * 商品修改
     */
    public void update_Goods(){   //改

        System.out.println("请输入信息要修改的商品上下架流水号:");
        String goodsoperaterid = reader.next();

        System.out.println("请输入信息操作员号:");
        String userno = reader.next();

        System.out.println("请输入信息商品编号:");
        String goodscode = reader.next();

        System.out.println("请输入信息商品名称:");
        String goodsname = reader.next();

        System.out.println("请输入上架时间:");
        String onsaledate = reader.next();

        System.out.println("请输入上架价格:");
        String isonsale = reader.next();


        List<GoodsOnsale_Entity> list = service.queryAll();
        for (GoodsOnsale_Entity e: list
                ) {
            if(e.getGoodsoperaterid().equals(goodsoperaterid)) {
                e.setUserno(userno);
                e.setGoodscode(goodscode);
                e.setGoodsname(goodsname);
                e.setOnsaledate(onsaledate);
                e.setIsonsale(isonsale);
                int c = service.updateUser(e);
                String str = c>0?"修改成功":"修改失败";
                System.out.println(str);
                break;
            }
        }
    }

    /**
     * 上架
     */
    public void onSale(){
        System.out.println("请输入信息商品编号:");
        String goodsno = reader.next();
        List<GoodsOnsale_Entity> list = service.queryAll();
        for (GoodsOnsale_Entity s: list
             ) {
            if (s.getGoodscode().equals(goodsno)){
                s.setIsonsale("y");
            }
        }
        Goods_UI ui = new Goods_UI();
        ui.update_GoodsOnsale(goodsno);

        List<Goods_Entity> list1 = service1.queryAll();
        for (Goods_Entity g :list1
                ) {
            if (g.getGoodscode().equals(goodsno)) {
                add_GoodsOnsale(goodsno,g.getGoodsname(),g.getPrice(),g.getIsonsale());
            }
        }
        /*List<Goods_Entity> list1 = service1.queryAll();
        for (Goods_Entity g :list1
                ) {
            if(g.getGoodscode().equals(goodsno)){

                int c = service1.updateGoodsOnsale()
                String str = c>0?"上架成功":"上架失败";
                System.out.println(str);
            }
        }*/
//        add_GoodsOnsale();
    }


    /**
     * 下架
     */
    public void downSale(){
        System.out.println("请输入信息商品编号:");
        String goodsno = reader.next();
        List<GoodsOnsale_Entity> list = service.queryAll();
        for (GoodsOnsale_Entity s: list
                ) {
            if (s.getGoodscode().equals(goodsno)){
                s.setIsonsale("n");
            }
        }
        Goods_UI ui = new Goods_UI();
        ui.update_GoodsOnsale(goodsno);

        List<Goods_Entity> list1 = service1.queryAll();
        for (Goods_Entity g :list1
                ) {
            if (g.getGoodscode().equals(goodsno)) {
                add_GoodsOnsale(goodsno,g.getGoodsname(),g.getPrice(),g.getIsonsale());
            }
        }
    }




}
