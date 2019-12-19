package JavaSE_04;

public class X01 {
    public static void main(String[] args) {
        int[][] a1 = new int[][]{{2,3,4},{4,6,8}};
        int[][] a2 = new int[][]{{1,5,2,8},{5,9,10,-3},{2,7,-5,-18}};
        int[][] a3 = new int[2][4];
        int i,j;
        for (i=0;i<2;i++){
            for(j=0;j<4;j++){
                a3[i][j] =   a1[i][0]*a2[0][j]+

                             a1[i][1]*a2[1][j]+

                             a1[i][2]*a2[2][j];

                System.out.print(a3[i][j]+"\t");
            }
            System.out.println(" ");
        }
    }
}
