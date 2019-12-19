package Test;

import java.util.Random;

public class Light01 {
    public static void main(String[] args) {
        int[] people = new int[100];

        boolean open = true;

        for (int j = 0; j <people.length ; j++) {
            people[j] = j+1;
        }

        Random random = new Random();
        for (int j = 0; j <people.length ; j++) {
               int x = random.nextInt(100);
            if (people[j]>x) open= !open;

        }

            System.out.println("open:"+open);

    }
}
