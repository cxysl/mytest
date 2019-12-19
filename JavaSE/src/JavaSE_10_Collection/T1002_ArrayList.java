package JavaSE_10_Collection;

import java.util.ArrayList;

public class T1002_ArrayList {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(0,1);
        arrayList.add(1,2);
        arrayList.add(2,3);
        arrayList.add(3,4);
        arrayList.add(4,5);
        for (Object o:arrayList
             ) {
            System.out.print(o+"\t");
        }
    }
}
