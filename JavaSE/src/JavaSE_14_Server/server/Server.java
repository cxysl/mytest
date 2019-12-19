package JavaSE_14_Server.server;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket =new ServerSocket(8888);
            Socket socket = new Socket();
            while (true){
                Socket s = serverSocket.accept();
                DataInputStream in = new DataInputStream(s.getInputStream());
                System.out.println(in.readUTF());
//                System.out.println("Hello,client"+s.getInetAddress()+":"+s.getPort());
                in.close();
                s.close();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
