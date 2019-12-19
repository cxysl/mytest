package java_product_11_02;


/**
 * author:程世林
 * Creative time：2019-11-02
 */
import static java_product_11_02.Product_Operate.product_list;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


/**
 * 促销类
 *
 */
public class Promote {


//    Promote promote = new Promote();
    Product product = new Product();
    Scanner reader = new Scanner(System.in);
    /**
     * 构造方法
     */
    public Promote(){}



    /**
     *主菜单中的第一栏
     */
    public void showAll_child(){
        Product_Operate Operate = new Product_Operate();
        System.out.println("\n\t1、刷新促销活动");
        System.out.println("\t2、返回上一级");
        System.out.println("\t3、退出程序");
        int x = reader.nextInt();
        switch (x){
            case 1:
                for (Object o:product_list
                        ) {
//                    Promote p = new Promote();
//                    p = (Promote) o;
                    ((Product) o).isPromote();
//                    ((Promote) o).promotion();
//                    if (((Promote) o).isPromote()){
//                        this.promotion((Promote) o);
//                    }

                    showAll_child();
                }
                break;
            case 2:
                Main.menu();
                break;
            case 3:
                System.exit(0);
                break;
            default:
                System.out.println("输入错误请重新输入！");
                showAll_child();
                break;
        }
    }


    /**
     * 促销商品价格
     */
    public void promote_price(){
//        Promote p1 =(Promote) p;
        System.out.print("请输入促销价格:");
        double new_price = reader.nextDouble();
        if (new_price>product.price){
            System.out.print("促销价格大于商品原价，请重新输入:");
            promote_price();
        }
        else{
            product.setPromote_price(new_price);
        }
//        return  p1;
    }


    /**
     * 促销商品时间
     */
    public void promote_time() {
//        Promote p1 =(Promote) p;
        System.out.print("请输入起始时间(格式:yyyy-mm-dd):");
        String starting_time = reader.next();
        product.setStarting_time(starting_time);
        System.out.print("请输入结束时间(格式:yyyy-mm-dd):");
        String end_time = reader.next();
        //获取今天的日期
        Date date = new Date();
        SimpleDateFormat sdf =  new SimpleDateFormat("yyyy-MM-dd");
        String time = sdf.format(date.getTime());
//            Date date2 = sdf.parse(end_time);
        System.out.println("今天的日期为:"+time);
        try {
            if (!date.after(sdf.parse(end_time))) {
                System.out.print("结束时间早于当前时间，请重新输入:");
                promote_time();
            }
            else{
                product.setEnd_time(end_time);
            }
        }
        catch (Exception e){
            System.out.println("出错");
            promote_time();
        }
//        return p1;
    }


    /**
     * 商品促销操作
     */
    public void promotion()  {
        promote_price();        //促销商品价格

    }

    public void showPreomote(){
        for (Object o:product_list
                ) {
            System.out.print(o+",");
        }
    }
}
