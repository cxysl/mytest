package JavaSE_08_try;

import java.util.Scanner;

public class TryError {

    /*
     * 1、编写应用程序，从命令行传入两个整型数作为除数和被除数。 要求程序中捕获NumberFormatException
     * 异常和ArithmeticException 异常，而且无论在哪种情况下，“总是被执行”这句话都会在控制台输出。
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("please enter the first Number");

        String string1 = scanner.next();

        System.out.println("please enter the second Number");

        String string2 = scanner.next();

        int num1, num2;

        try {
            num1 = Integer.parseInt(string1);
            num2 = Integer.parseInt(string2);
            System.out.println(num1 / num2);
        } catch (NumberFormatException | ArithmeticException e) {
            e.printStackTrace();
        } finally {
            System.out.println("alaways doing ....");
        }
    }
}
