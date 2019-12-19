package supermarket.entity;

import java.io.Serializable;

/**
 * 销售明细
 */
public class SaleDetial_Entity implements Serializable {

    private String detialid;      //明细序列号
    private String userno;      //操作员号
    private String goodscode;      //商品条码
    private String goodsname;      //商品名称
    private int count;      //数量
    private double price;      //单价
    private double sumprice;      //总价
    private String saledate;      //销售时间

    public String getDetialid() {
        return detialid;
    }

    public void setDetialid(String detialid) {
        this.detialid = detialid;
    }

    public String getUserno() {
        return userno;
    }

    public void setUserno(String userno) {
        this.userno = userno;
    }

    public String getGoodscode() {
        return goodscode;
    }

    public void setGoodscode(String goodscode) {
        this.goodscode = goodscode;
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

    public double getSumprice() {
        return sumprice;
    }

    public void setSumprice(double sumprice) {
        this.sumprice = sumprice;
    }

    public String getSaledate() {
        return saledate;
    }

    public void setSaledate(String saledate) {
        this.saledate = saledate;
    }

    @Override
    public String toString() {
        return "SaleDetial_Entity{" +
                "detialid='" + detialid + '\'' +
                ", userno='" + userno + '\'' +
                ", goodscode='" + goodscode + '\'' +
                ", goodsname='" + goodsname + '\'' +
                ", count=" + count +
                ", price=" + price +
                ", sumprice=" + sumprice +
                ", saledate='" + saledate + '\'' +
                '}';
    }
}
