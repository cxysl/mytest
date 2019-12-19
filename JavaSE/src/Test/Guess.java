package Test;

import java.util.Random;
import java.util.Scanner;

public class Guess {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner reader = new Scanner(System.in);
        int x = random.nextInt(100)-1;
        int sum = 0;
        int guess;
        while (true){
            sum++;
            System.out.print("请输入你猜的数:");
            guess = reader.nextInt();
            if (guess==x) { System.out.println("恭喜你猜了"+sum+"次猜对了"); break; }
            else if(guess>x) System.out.println("你猜大了");
            else if(guess<x) System.out.println("你猜小了");
        }
    }
}
