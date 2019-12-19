package supermarket.UI;

import supermarket.entity.Goods_Entity;
import supermarket.entity.Purchase_Entity;
import supermarket.service.Goods_Service;
import supermarket.service.Purchase_Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 * 进货表
 */
public class Purchase_UI {

    Scanner reader = new Scanner(System.in);
    private Purchase_Service service = new Purchase_Service();
    private Goods_Service service1 = new Goods_Service();

    /**
     * 显示进货信息（查）
     */
    public void showPurchase(){   //显示所有供应商
        List<Purchase_Entity> list = service.queryAll();
        for (Purchase_Entity e: list
                ) {
            System.out.println(e);
        }
    }

    /**
     * 插入进货信息（增）
     */
    public void add_Purchase(){    //增加
        Purchase_Entity purchase = new Purchase_Entity();

        final double d = Math.random();
        final int i = (int)(d*10000);
        String purchaseid = String.valueOf(i);
//        System.out.println("请输入进货流水号:");                    //OK
        purchase.setPurchaseid(purchaseid);

        System.out.println("请输入商品条码:");                     //OK
        String goodscode = reader.next();
        purchase.setGoodscode(goodscode);

        List<Goods_Entity> list = service1.queryAll();
        for (Goods_Entity e: list
                ) {
            if (e.getGoodscode().equals(goodscode)) {
//                System.out.println("请输入商品名称:");                    //OK
                purchase.setGoosname(e.getGoodsname());
            }
        }


//        System.out.println("请输入进货时间:");                           //OK
        SimpleDateFormat dateFormat = new SimpleDateFormat(" yyyy-MM-dd HH:mm");
        String datetime =   dateFormat.format( new Date() );
        purchase.setPurchasetime(datetime);

        System.out.println("请输入进货数量:");                                 //OK
        int count = reader.nextInt();
        Goods_UI g = new Goods_UI();
        g.update_GoodsCount(count,goodscode);       //进货数量  增加库存量。
        purchase.setPurchasecount(count);

        System.out.println("请输入商品进价:");                                 //OK
        Double inprice = reader.nextDouble();
        purchase.setPurchaseprice(inprice);

        System.out.println("请输入供应商号:");                                 //OK
        String supplierno = reader.next();
        purchase.setSupplierno(supplierno);


        int a = service.addPurchase(purchase);
        String str = a>0?"添加成功":"添加失败";
        System.out.println(str);
    }

    /**
     * 进货信息删除
     */
    public  void del_Purchase(){   //删
        System.out.println("请输入要删除进货信息的流水号:");
        int b = service.delPurchase(reader.next());
        String str = b>0?"删除成功":"删除失败";
        System.out.println(str);
    }

    /**
     * 进货信息修改
     */
    public void update_Purchase(){   //改
        System.out.println("请输入进货流水号:");
        String purchaseid = reader.next();

        System.out.println("请输入商品条码:");
        String goodscode = reader.next();

        System.out.println("请输入商品名称:");
        String goosname = reader.next();

        System.out.println("请输入进货时间:");
        String purchasetime = reader.next();

        System.out.println("请输入进货数量:");
        String purchasecount1 = reader.next();
        int purchasecount = Integer.parseInt(purchasecount1);

        System.out.println("请输入进货价格:");
        String purchaseprice1 = reader.next();
        Double purchaseprice = Double.parseDouble(purchaseprice1);

        System.out.println("请输入供应商号:");
        String supplierno = reader.next();


        List<Purchase_Entity> list = service.queryAll();
        for (Purchase_Entity e: list
                ) {
            if(e.getPurchaseid().equals(purchaseid)) {
                e.setGoodscode(goodscode);
                e.setGoosname(goosname);
                e.setPurchasetime(purchasetime);
                e.setPurchasecount(purchasecount);
                e.setPurchaseprice(purchaseprice);
                e.setSupplierno(supplierno);

                int c = service.updatePurchase(e);
                String str = c>0?"修改成功":"修改失败";
                System.out.println(str);
                break;
            }
        }
    }


}
