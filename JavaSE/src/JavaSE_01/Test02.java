package JavaSE_01;

public class Test02 {
    public static void main(String[] args) {
        int i;
        int j;
        for (i=1;i<=9;i++){
            for(j=1;j<=i;j++){
                if(j==3&i<5){
                    System.out.print(" "+i+"×"+j+"="+i*j+" ");
                }else{
                    System.out.print(i+"×"+j+"="+i*j+" ");
                }
            }
            System.out.println("");
        }
    }
}