package JavaSE_14_Server.t1num;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Client01 {
    public static void main(String[] args) {
        try {
            Socket scoket = new Socket("127.0.0.1",8888);
            OutputStream outputStream = scoket.getOutputStream();
            DataOutputStream out = new DataOutputStream(outputStream);
            /*System.out.println("请输入一串数字:");
            Scanner reader = new Scanner(System.in);
            String str = reader.next();*/
            String str = "1 2 5 3 9 6 8";
            out.writeUTF(str);
            System.out.println(str);
            out.close();


            BufferedReader br=new BufferedReader(new InputStreamReader(scoket.getInputStream()));
            String str1=br.readLine();//接收服务端信息


            System.out.println("获得的数据为:"+str1);
            br.close();

            scoket.close();

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
