package JavaSE_05;

public class X01 {
    public static void main(String[] args) {
        X01 t = new X01();
        t.num();
    }

    public void num() {
        int i, j, x;
        for (i = 201; ; i++) {
            x = 0;
            for (j = 2; i < 201; j++) {
                if (i % j == 0) {
                    x++;
                    break;
                }
            }
            if (x == 0) {
                System.out.println("大于200的最小质数是:" + i);
                break;
            }
        }
    }
}