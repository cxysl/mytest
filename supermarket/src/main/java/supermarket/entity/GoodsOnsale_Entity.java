package supermarket.entity;

import java.io.Serializable;

public class GoodsOnsale_Entity implements Serializable {
    private String goodsoperaterid;      //上下架流水号
    private String userno;              // 操作员号
    private String goodscode;          //商品条码
    private String goodsname;          //商品名称
    private String onsaledate;           //上架时间
    private double onsaleprice;         //上架价格
    private String isonsale;        //上下架状态

    public String getGoodsoperaterid() {
        return goodsoperaterid;
    }

    public void setGoodsoperaterid(String goodsoperaterid) {
        this.goodsoperaterid = goodsoperaterid;
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

    public String  getOnsaledate() {
        return onsaledate;
    }

    public void setOnsaledate(String onsaledate) {
        this.onsaledate = onsaledate;
    }

    public double getOnsaleprice() {
        return onsaleprice;
    }

    public void setOnsaleprice(double onsaleprice) {
        this.onsaleprice = onsaleprice;
    }

    public String getIsonsale() {
        return isonsale;
    }

    public void setIsonsale(String isonsale) {
        this.isonsale = isonsale;
    }

    @Override
    public String toString() {
        return "GoodsOnsale_Entity{" +
                "goodsoperaterid='" + goodsoperaterid + '\'' +
                ", userno='" + userno + '\'' +
                ", goodscode='" + goodscode + '\'' +
                ", goodsname='" + goodsname + '\'' +
                ", onsaledate=" + onsaledate +
                ", onsaleprice=" + onsaleprice +
                ", isonsale='" + isonsale + '\'' +
                '}';
    }
}
