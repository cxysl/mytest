package JavaSE_10_Collection;

import java.lang.reflect.Array;
import java.util.LinkedList;

public class T1001_LinkList {
    static LinkedList list = new LinkedList();
    private static String[] str = {"one","two","three","four","five","six"};
    public static void main(String[] args) {

        for (int i=0;i<str.length;i++){
            put(str[i]);
        }
        System.out.print("放入:\t");
        for (Object o:list
             ) {
            System.out.print(o+",");
        }
        System.out.print("\n取出:\t");
        for (int i=0;i<str.length;i++){
            System.out.print(get()+",");
        }
        System.out.println("\n当前队列是否为空:\t"+isEmpty());

    }
    public static void put(Object o){
        list.add(o);
    }
    public static Object get(){
        return  list.removeLast();
    }
    public static boolean isEmpty(){
        return list.isEmpty();
    }
}
