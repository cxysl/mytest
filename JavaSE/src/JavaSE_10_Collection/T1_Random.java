package JavaSE_10_Collection;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class T1_Random {
    public static void main(String[] args) {
        Random random = new Random();
        Set set = new HashSet(7);
        for (int i = 0; i < 7; i++) {
            int a = (int)(1+Math.random()*(25-1+1));
            while (true) {
                if (set.contains(a))
                    a = (int)(1+Math.random()*(25-1+1));
                else break;
            }
            set.add(a);

        }
            System.out.println(set);
    }
}
