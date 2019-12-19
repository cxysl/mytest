package Test;

public class tt {
    public static void main(String[] args) {
        double h =100;
        double sum = 0;
        for(int  i=1;i<=10;i++){
            sum = sum + h;
            h = h/2;
            sum = sum+h;
            System.out.println(i+"\th:"+h+"\tsum:"+sum);
        }
        System.out.println(sum+","+h+"\t");
    }
}
