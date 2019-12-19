package JavaSE_13Thread.test;

public class Test02 extends Thread{

    private int befor,after;

    public  Test02(int befor,int after){
        super();
        this.befor = befor;
        this.after = after;
    }

    @Override
    public void run() {
        while (true){
            if (befor>after) return;
            if (isShusu(befor)) System.out.println("素数："+befor);
            befor++;
        }
    }

    public boolean isShusu(int num){
        if (num==2)return true;
        for (int i =2;i<num;i++){
            if (num%i==0)return false;
        }
        return true;
    }
}
