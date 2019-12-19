package JavaSE_04;

public class T02 {
    public static void main(String[] args) {
        char[] c1 = new char[]{'l','u','c','k'};
        char[] c2 = new char[c1.length];
        int i ;
        for (i=0;i<c1.length;i++){
            c2[i] = c1[i];
            System.out.println(c2[i]);
        }
    }
}
