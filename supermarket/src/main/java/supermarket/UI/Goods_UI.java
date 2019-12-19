package supermarket.UI;

import supermarket.entity.Goods_Entity;
import supermarket.service.Goods_Service;

import java.util.List;
import java.util.Scanner;

public class Goods_UI {

    Scanner reader = new Scanner(System.in);
    private Goods_Service service = new Goods_Service();

    /**
     * 显示所有商品（查）
     */
    public void showGoods() {   //显示所有商品
        List<Goods_Entity> list = service.queryAll();
        for (Goods_Entity e : list
                ) {
            System.out.println(e);
        }
    }

    /**
     * 显示商品上下架信息
     */
    public void showOneyOngoods(){
        List<Goods_Entity> list = service.querySaleAll();
        for (Goods_Entity e : list
                ) {
            if (e.getIsonsale().equals("y")||e.getIsonsale().equals("Y")){
                System.out.println(e);
            }
        }
    }

    /**
     * 显示商品上下架信息
     */
    public void showOnsaleGoods(){          //查看所有商品上下架信息
        List<Goods_Entity> list = service.querySaleAll();
        for (Goods_Entity e : list
                ) {

            System.out.println("商品实体:\t" +
                    "商品编码='" + e.getGoodscode() + '\'' +
                    ", 条形码='" + e.getBarcode() + '\'' +
                    ", 商品名称='" + e.getGoodsname() + '\'' +
                    ",上下架状态=" +e.getIsonsale() +
                    ", 库存量=" + e.getCount() +
                    ", 单价=" + e.getPrice() +
                    ' ');
        }
    }

    /**
     * 插入商品（增）
     */
    public void add_Goods(){    //增加
        Goods_Entity goods = new Goods_Entity();

        System.out.println("请输入商品编号:");
        goods.setGoodscode(reader.next());

        System.out.println("请输入商品条形码:");
        goods.setBarcode(reader.next());

        System.out.println("请输入商品名称:");
        goods.setGoodsname(reader.next());

        System.out.println("请输入商品数量:");
        goods.setCount(reader.nextInt());

        goods.setIsonsale("n");            /**上架*/

        System.out.println("请输入商品单价:");
        goods.setPrice(reader.nextDouble());

        int a = service.addUser(goods);
        String str = a>0?"添加成功":"添加失败";
        System.out.println(str);
    }

    /**
     * 商品删除
     */
    public  void del_Goods(){   //删
        System.out.println("请输入要删除的商品编号:");
        int b = service.delUser(reader.next());
        String str = b>0?"删除成功":"删除失败";
        System.out.println(str);
    }

    /**
     * 商品修改
     */
    public void update_Goods(){   //改

        System.out.println("请输入信息要修改的商品编号:");
        String goodscode = reader.next();

        System.out.println("请输入信息要修改的商品条形码:");
        String barcode = reader.next();

        System.out.println("请输入信息要修改的商品名称:");
        String goodsname = reader.next();

        System.out.println("请输入信息要修改的商品数量:");
        int count = reader.nextInt();

        System.out.println("请输入信息要修改的商品单价:");
        double price = reader.nextDouble();


        List<Goods_Entity> list = service.queryAll();
        for (Goods_Entity e: list
                ) {
            if(e.getGoodscode().equals(goodscode)) {
                e.setBarcode(barcode);
                e.setGoodsname(goodsname);
                e.setCount(count);
                e.setPrice(price);
                int c = service.updateUser(e);
                String str = c>0?"修改成功":"修改失败";
                System.out.println(str);
                break;
            }
        }
    }

    /**
     *改上下架
     */
    public void update_GoodsOnsale(String goodscode) {   //改
        List<Goods_Entity> list = service.queryAll();
        String s="";
        for (Goods_Entity e: list
                ) {
            if(e.getGoodscode().equals(goodscode)) {
                if(e.getIsonsale().equals("y")) s = "n";
//                if (e.getIsonsale()==null||e.getIsonsale().equals("")||e.getIsonsale().equals(null)) s="y";
                else if (e.getIsonsale().equals("n")) s = "y";
                else s="y";
                int c = service.updateGoodsOnsale(s,goodscode);
                String str = c>0?"修改成功":"修改失败";
                System.out.println(str);
                break;
            }//s == null || s.equals("")
        }
    }

    /**
     *改上库存量
     */
    public void update_GoodsCount(int count,String goodscode){

        List<Goods_Entity> list = service.queryAll();
        int s = 0;
        for (Goods_Entity e: list
                ) {
            if(e.getGoodscode().equals(goodscode)) {
                int newcount = count + e.getCount();
                int c = service.updateGoodsCount(newcount,goodscode);
                String str = c>0?"修改成功":"修改失败";
                System.out.println(str);
                break;
            }
        }
    }

}
