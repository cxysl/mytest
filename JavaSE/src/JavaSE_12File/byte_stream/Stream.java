package JavaSE_12File.byte_stream;

import java.io.*;

public class Stream {
    public static void main(String[] args) {
        File file = new File("TXT\\test01.txt");
        try {
        if (!file.exists())
        {
                file.createNewFile();
        }
        outStream(file);
//        inputStream(file);
        inputStream2(file);
            } catch (IOException e) {
                e.printStackTrace();
            }

    }


    public static void inputStream2(File file) throws IOException{
        FileInputStream inputStream = new FileInputStream(file);
        byte[] bytes = new byte[inputStream.available()];
        inputStream.read(bytes);
        String str = new String(bytes);
        System.out.println(str);
        inputStream.close();
    }



    public static void inputStream(File file){
        try {
            FileInputStream inputStream = new FileInputStream(file);
            int b;
            while((b=inputStream.read())!=-1)
            {
                System.out.print((char)b);
            }
            inputStream.close();


        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }


    public static void outStream(File file){
        String str = "在那山的那边海的那边有一群蓝精灵,它们活泼又聪明它们调皮又灵敏,它们自由自在生活在那绿色的大森林,它们善良勇敢相互都欢喜！\n";
        try {
            FileOutputStream outputStream = new FileOutputStream(file,true);    //append表示继续添加
            outputStream.write(str.getBytes(),0,str.getBytes().length);
            outputStream.flush();

            String str1 = "我考试网盘又写了一段!!!\n";
            outputStream.write(str1.getBytes(),0,str1.getBytes().length);

            outputStream.close();
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }
}
