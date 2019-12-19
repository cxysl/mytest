package Test;
/*
* 14．定义一个类Order，在类中定义一个方法isOrder（）用于对字符串操作，判断集合中的字符串是否以str开头。
再定义一个类TestOrder，它是Order类的子类，类中有一个String数组，如下：
String[] str={“string“, “starting“, “strong“, “street“, “stir“, “student“, “Microsoft“, “sting“};
将数组str中的元素按顺序存入一个List集合中：List<String> strList；
在子类中定义一个方法isOrder（），统计集合中以st开头的字符串有哪些，并打印。
在子类中调用父类的方法isOrder（），统计集合中以str开头的字符串有哪些，并
* */
public class Order {
    public boolean isOrder(String str){
        if (str.substring(0,3).equals("str")){
            return true;
        }else  return false;
    }
}
