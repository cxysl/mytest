package JavaSE_13Thread.t01_three_thread;


public class ThreeThread implements Runnable {
    int c =2001;
    int temp3=0;

    @Override
    public void run() {
        while (c<=3000) {
            if (issushu(c)) System.out.println(c+ ",");
            c++;
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
