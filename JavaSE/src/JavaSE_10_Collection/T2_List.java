package JavaSE_10_Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class
T2_List {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        ArrayList arrayList = new ArrayList();
        arrayList.add(0,"abc1");
        arrayList.add(1,"abc2");
        arrayList.add(2,"abc3");
        linkedList.add(0,"aaa1");
        linkedList.add(1,"aaa2");
        linkedList.add(2,"aaa3");
        for (Iterator i=arrayList.iterator();((Iterator) i).hasNext();){
            System.out.println(((Iterator) i).next());
        }
        for (Object o:linkedList
             ) {
            System.out.println(o);
        }
    }
}
