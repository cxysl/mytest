package JavaSE_14_Server.Test;

import java.io.PrintWriter;
import java.net.Socket;


public class Client {

    public static void main(String[] args) {

        try {
            Socket s = new Socket("127.0.0.1", 8888);

            PrintWriter pw = new PrintWriter(s.getOutputStream());
            pw.write("hello server");
            pw.flush();

            pw.close();
            s.close();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

}