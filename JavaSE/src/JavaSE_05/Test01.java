package JavaSE_05;

public class Test01 {
    public static void main(String[] args) {
        Test01 t = new Test01();
       int s =  t.jieCheng(5);
        System.out.println(s);
    }
    //递归调用
    public int jieCheng(int n){
        if(n==0)    return 1;
        else return jieCheng(n-1)*n;
    }

}

