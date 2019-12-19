package java_product_11_02;

/**
 * author:程世林
 * Creative time：2019-11-02
 */


import java.util.Random;
import static java_product_11_02.Product_Operate.promote;
import static java_product_11_02.Product_Operate.reader;

/**
 * 商品类
 */


public class Product {

    /*
    public  Promote promote;
    public Product(Promote promote){
        this.promote=promote;
    }
    */

    String manufacturer;  //制造商
    String brand;  //品牌
    String product_name;    //商品名
    String category;    //类别
    double price;   //价格
    String sku;    //商品编号

    String starting_time;       //开始时间
    String end_time;        //结束时间
    double promote_price;       //促销价格
    boolean isPromote;    //是否促销

    public void setPromote(boolean promote) {
       this.isPromote = promote;
    }

    public void setPromote_price(double promote_price) {
        this.promote_price = promote_price;
    }

    public void setStarting_time(String starting_time) {
        this.starting_time = starting_time;
    }

    public void setEnd_time(String end_time) {
        this.end_time = end_time;
    }

    public void setSku(String sku) {    //set商品编号
        this.sku = sku;
    }

    public Product(){}

    public void setManufacturer(String manufacturer) {      //set制造商
        this.manufacturer = manufacturer;
    }

    public void setBrand(String brand) {        //set品牌
        this.brand = brand;
    }

    public void setProduct_name(String product_name) {      //set商品名
        this.product_name = product_name;
    }

    public void setCategory(String category) {       //set类别
        this.category = category;
    }

    public void setPrice(double price) {        //set价格
        this.price = price;
    }

    public Product(String manufacturer, String brand, String product_name, double price,String sku) {
        this.manufacturer = manufacturer;   //制造商
        this.brand = brand; //品牌
        this.product_name = product_name;        //商品名
        this.price = price;     //价格
        this.sku = sku;      //商品编码
    }

    public Product(String manufacturer, String brand, String product_name, String category, double price, String sku, String starting_time, String end_time, double promote_price) {
        this.manufacturer = manufacturer;
        this.brand = brand;
        this.product_name = product_name;
        this.category = category;
        this.price = price;
        this.sku = sku;
        this.starting_time = starting_time;
        this.end_time = end_time;
        this.promote_price = promote_price;
    }

    @Override
    public String toString() {
        if(this.isPromote) {
            return "\n商品编码:" + sku + "\t\t商品名:" + product_name + "\t\t价格:" + price + "\t\t品牌:" + brand;
        }
        else {
            return "\n商品编码:" + sku + "\t\t商品名:" + product_name + "\t\t品牌:" + brand + "\t\t原价:" + price + "\t\t促销价格:" + promote_price
                    + "\t\t起始时间:" + starting_time + "\t\t结束时间:" + end_time;
        }
    }

    /**
     * 商品是否正在促销
     * 随机数
     */
    public boolean isPromote(){
//        Random random = new Random();
//        int x = random.nextInt(100)-1;
//        Product product = new  Product();
        System.out.println("该商品是否有促销活动(y/n)");
        String s = reader.next();
        if (s.equals("y")||s.equals("Y")){
            this.setPromote(true);
           /* System.out.println("该商品正在促销！");
            System.out.println("该商品打"+getPrice()*x*0.1+"折");
            setPrice(getPrice()*x*0.1);*/
            promote.promotion();
            return true;
        }
        else {
            this.setPromote(false);
//            System.out.println("抱歉，该商品没有促销活动。");
            return false;
        }
    }
}