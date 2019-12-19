package JavaSE_13Thread.t01_three_thread;

public class Test1 extends  Thread  {
    private int beg;
    private int end;

    public Test1(int beg, int end) {
        super();
        this.beg = beg;
        this.end = end;
    }

    @Override
    public void run() {
        //如果是素数就输出
        while(true){
            if(beg>end){
                return;
            }
            if(issushu(beg)){
                System.out.println(beg);
            }
            beg++;
        }
    }
    //方法判断
    public boolean issushu(long beg){
        if(beg == 2){
            return true;
        }
        for(int i = 2 ;i<beg;i++){
            if((beg % i)==0 ){
                return false;
            }
        }
        return true;
    }

}