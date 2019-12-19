package Test;

public class Num {
    public static void main(String[] args) {
        int x = 0;
        while (true){
            if(is(x+100)&&is(x+268)) {System.out.println(x);}
                x++;
        }
    }
    public static boolean is(int x){
        double d = Math.sqrt(x);
        int q = (int)d;
        if (x == Math.pow(q, 2))return true;
        else return false;


    }
}
