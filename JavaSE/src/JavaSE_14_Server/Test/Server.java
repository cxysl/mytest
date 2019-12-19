package JavaSE_14_Server.Test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) {
        ServerSocket ss;
        Socket s;
        try {
            ss = new ServerSocket(8888);
            s = ss.accept();
            InputStreamReader isr = new InputStreamReader(s.getInputStream());
            BufferedReader br = new BufferedReader(isr);

            System.out.println(br.readLine());
            br.close();
            isr.close();
            ss.close();
            s.close();

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


    }

}
