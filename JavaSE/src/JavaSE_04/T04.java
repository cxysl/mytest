package JavaSE_04;

public class T04 {
    public static void main(String[] args) {
        double[][] a = new double[][]{{4,5,6,7},{88,66,55,44},{10.2,55.6,55.1,55.55},{44,75,95,66},{88,61,641,11}};
        for (int i = 0; i <5 ; i++) {
            for(int j= 0;j<4;j++){
                System.out.print(a[i][j]+"   ");
            }
            System.out.println(" ");
        }
    }
}
