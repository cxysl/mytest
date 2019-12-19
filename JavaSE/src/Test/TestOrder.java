package Test;
/*
* 14．定义一个类Order，在类中定义一个方法isOrder（）用于对字符串操作，判断集合中的字符串是否以str开头。
再定义一个类TestOrder，它是Order类的子类，类中有一个String数组，如下：
String[] str={“string“, “starting“, “strong“, “street“, “stir“, “student“, “Microsoft“, “sting“};
将数组str中的元素按顺序存入一个List集合中：List<String> strList；
在子类中定义一个方法isOrder（），统计集合中以st开头的字符串有哪些，并打印。
在子类中调用父类的方法isOrder（），统计集合中以str开头的字符串有哪些，并
* */

import java.util.LinkedList;

public class TestOrder extends Order {
    public static void main(String[] args) {
        int sum1=0,sum2=0;
        Order oFather = new Order();
        TestOrder oSon = new TestOrder();
        String[] str={"string","starting","strong","street","stir","student","Microsoft","sting"};
        LinkedList list = new LinkedList();
        for (int i = 0; i <str.length ; i++) {
            list.add(str[i]);
        }

        for (Object s:list
                ) {
            if (oFather.isOrder((String) s)) {System.out.println("爸爸"+s) ;sum1++;}
            if(oSon.isOrder((String)s)) {System.out.println("儿子："+s);sum2++;}
        }
        System.out.println("爸爸:"+sum1+"\t\t儿子:"+sum2);
    }

    public boolean isOrder(String str){
        if (str.substring(0,2).equals("st")){
            return true;
        }else  return false;
    }
}