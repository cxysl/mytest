package supermarket.entity;

import java.io.Serializable;

public class Goods_Entity implements Serializable {

    private String goodscode;       //商品编号
    private String barcode;         //条形码
    private String goodsname;       //商品名称
    private String isonsale;        //上下架状态
    private int count;              //数量
    private double price;           //单价


    public String getIsonsale() {
        return isonsale;
    }

    public void setIsonsale(String isonsale) {
        this.isonsale = isonsale;
    }

    public String getGoodscode() {
        return goodscode;
    }

    public void setGoodscode(String goodscode) {
        this.goodscode = goodscode;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getGoodsname() {
        return goodsname;
    }

    public void setGoodsname(String goodsname) {
        this.goodsname = goodsname;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {

        /*if(getOut()==1){
            return "商品实体:\t" +
                    "商品编码='" + goodscode + '\'' +
                    ", 条形码='" + barcode + '\'' +
                    ", 商品名称='" + goodsname + '\'' +
                    ",上下架状态=" +isonsale +
                    ", 库存量=" + count +
                    ", 单价=" + price +
                    ' ';
        }*/

        return "商品实体:\t" +
                "商品编码='" + goodscode + '\'' +
                ", 条形码='" + barcode + '\'' +
                ", 商品名称='" + goodsname + '\'' +
                ", 库存量=" + count +
                ", 单价=" + price +
                ' ';
    }
}
