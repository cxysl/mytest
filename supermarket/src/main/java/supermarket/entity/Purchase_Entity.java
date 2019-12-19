package supermarket.entity;

import java.io.Serializable;

/**
 * 进货表
 */
public class Purchase_Entity implements Serializable {

    private String purchaseid;      //进货流水号
    private String goodscode;      //商品条码
    private String goosname;      //商品名称
    private String purchasetime;      //进货时间
    private int purchasecount;      //进货数量
    private double purchaseprice;      //进货价格
    private String supplierno;      //供应商号

    public String getPurchaseid() {
        return purchaseid;
    }

    public void setPurchaseid(String purchaseid) {
        this.purchaseid = purchaseid;
    }

    public String getGoodscode() {
        return goodscode;
    }

    public void setGoodscode(String goodscode) {
        this.goodscode = goodscode;
    }

    public String getGoosname() {
        return goosname;
    }

    public void setGoosname(String goosname) {
        this.goosname = goosname;
    }

    public String getPurchasetime() {
        return purchasetime;
    }

    public void setPurchasetime(String purchasetime) {
        this.purchasetime = purchasetime;
    }

    public int getPurchasecount() {
        return purchasecount;
    }

    public void setPurchasecount(int purchasecount) {
        this.purchasecount = purchasecount;
    }

    public double getPurchaseprice() {
        return purchaseprice;
    }

    public void setPurchaseprice(double purchaseprice) {
        this.purchaseprice = purchaseprice;
    }

    public String getSupplierno() {
        return supplierno;
    }

    public void setSupplierno(String supplierno) {
        this.supplierno = supplierno;
    }

    @Override
    public String toString() {
        return "Purchase_Entity{" +
                "purchaseid='" + purchaseid + '\'' +
                ", goodscode='" + goodscode + '\'' +
                ", goosname='" + goosname + '\'' +
                ", purchasetime='" + purchasetime + '\'' +
                ", purchasecount=" + purchasecount +
                ", purchaseprice=" + purchaseprice +
                ", supplierno='" + supplierno + '\'' +
                '}';
    }
}
