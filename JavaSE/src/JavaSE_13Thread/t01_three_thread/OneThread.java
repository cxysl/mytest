package JavaSE_13Thread.t01_three_thread;


import static java.lang.Thread.sleep;

public class OneThread implements Runnable {
    int a =1;
    int temp=0;
    @Override

    public void run() {
        while (a<=1000){
           if (issushu(a)) System.out.println(a+",");
            a++;
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

