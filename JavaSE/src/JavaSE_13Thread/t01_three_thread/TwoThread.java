package JavaSE_13Thread.t01_three_thread;

import static java.lang.Thread.sleep;

public class TwoThread implements Runnable {
    int b =1001;
    int temp2=0;
    @Override
    public void run() {
        while (b<=2000){if (issushu(b)) System.out.println(b+",");
            b++;
        }
    }
    public boolean issushu(int s){
        if(s == 2){
            return true;
        }
        for(int i = 2 ;i<s;i++){
            if((s% i)==0 ){
                return false;
            }
        }
        return true;
    }
}
