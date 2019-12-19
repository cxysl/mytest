package Test;
import java.util.Scanner;


public class Demo01 {
    private static int ascNum;
    private static char strChar;

    public static void main(String[] args) {
        while (true){
            System.out.println("请输入你要加密的字符:");
            Scanner reader = new Scanner(System.in);
            String  a = reader.next();
            System.out.println(backchar(getAsc(a)+3));
            if (a=="esc")break;
        }
    }

    /**
     * 字符转ASC
     *
     * @param st
     * @return
     */
    public static int getAsc(String st) {
        byte[] gc = st.getBytes();
        ascNum = (int) gc[0];
        return ascNum;
    }

    /**
     * ASC转字符
     *
     * @param backnum
     * @return
     */
    public static char backchar(int backnum) {
        strChar = (char) backnum;
        return strChar;
    }

}
