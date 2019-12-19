package JavaSE_10_Collection;

import java.util.ArrayList;
import static java.util.Collections.max;
import static java.util.Collections.min;
import static java.util.Collections.sort;


public class T1003_List {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("apple");
        arrayList.add("grape");
        arrayList.add("banana");
        arrayList.add("pear");
        System.out.print("列表中的元素为:");
        for (Object o:arrayList
             ) {
            System.out.print(o+"\t");
        }
        System.out.println("\n最大元素为:"+max(arrayList));
        System.out.println("\n最小元素为:"+min(arrayList));
//        Collections.short(arrayList);
        sort(arrayList);
        System.out.print("排序后列表中的元素为:");
        for (Object o:arrayList
                ) {
            System.out.print(o+"\t");
        }
    }

}
