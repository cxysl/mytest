package JavaSE_01;

public class Test03 {
    public static void main(String[] args) {
        int i,j;
        for (i=1;i<7;i++){
            for (j=15;j>=i;j=j-2){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
