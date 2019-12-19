package JavaSE_14_Server.t1num;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server01 {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(8888);
            System.out.println("服务端本地IP地址:"+serverSocket.getLocalSocketAddress());
            System.out.println("服务端端口号:"+serverSocket.getLocalPort());

            Socket socket = serverSocket.accept();  //准备就绪，开始等待客户端请求
            InputStream inputStream = socket.getInputStream();      //输入流 获取客户端传过来的流
            DataInputStream in = new DataInputStream(inputStream);      //数据输入流
            String str = in.readUTF();
            System.out.println("获得的数据为:"+str);
//            in.close();

            Socket scoket = new Socket("127.0.0.1",8888);
            OutputStream outputStream = scoket.getOutputStream();
            DataOutputStream out = new DataOutputStream(outputStream);
            String str1 = "9 8 6 5 3 2 1";
            out.writeUTF(str1);
            System.out.println("发送的数据为:"+str1);

            serverSocket.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
