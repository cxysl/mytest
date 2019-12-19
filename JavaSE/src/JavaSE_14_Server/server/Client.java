package JavaSE_14_Server.server;


import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        try {
            Socket s = new Socket("127.0.0.1",8888);
            OutputStream os = s.getOutputStream();
            DataOutputStream dos = new DataOutputStream(os);
            dos.writeUTF("你好服务器!我是来自"+s.getInetAddress()+"客户端");
            dos.flush();
            dos.close();
            s.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
