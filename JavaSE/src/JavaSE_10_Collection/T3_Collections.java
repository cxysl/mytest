package JavaSE_10_Collection;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Random;

public class T3_Collections {
    public static void main(String[] args) {
        Random random = new Random();
        LinkedList linkedList = new LinkedList();
        for (;;){
            linkedList.add(random.nextInt(100)+1);
            if(linkedList.size()==6) break;
        }
        for (Object c:linkedList
             ) {
            System.out.print(c+" ");
        }
        Collections.sort(linkedList);
        System.out.println("\n降序排序:");
        for (Object c:linkedList
                ) {
            System.out.print(c+" ");
        }
        System.out.println("\n升序排序:");
        Collections.reverse(linkedList);
        for (Object c:linkedList
                ) {
            System.out.print(c+" ");
        }
    }
}
