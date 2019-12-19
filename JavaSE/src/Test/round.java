package Test;
// 约瑟夫环:100个人围成一个圈，从第一个人开始报数1,2,3 ，
// 报数是3的人出去，不停的报123， 最后这个圈剩下一个人，
// 求这个人最开始的位置。
public class round {
    public static void main(String[] args) {
        int p[] = new int[100];
        int num = 100;
        int x=0,s=0;
        int index[] = new int[100];
        for (int i = 0; i <100 ; i++) {
            p[i] = 1;
            index[i]=i;
        }

        while(true){
            for (int i=0;i<100;i++){
                x++;
                if(x==4) x=1;
                if(p[i]==0){x--;continue;}
                if(x==3){
                    p[i] = 0;
                    num--;
                    s++;
                    System.out.println((i+1)+","+p[i]+","+num+","+s);
                }
            }
            if(num==1)break;
        }

        for (int i = 0; i <100 ; i++) {
            if(p[i]==1) System.out.println("这个人最开始是第"+(i+1)+"人");
        }
    }
}
