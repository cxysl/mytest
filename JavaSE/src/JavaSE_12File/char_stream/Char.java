package JavaSE_12File.char_stream;

import sun.dc.pr.PRError;

import javax.imageio.IIOException;
import java.io.*;

public class Char {
    public static void main(String[] args) {
        Char c = new Char();
        File file = new File("TXT\\char.txt");
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            c.fileWrite(file);
            c.fileRead(file);
        }catch (java.io.IOException e){
            e.printStackTrace();
        }
    }

    private void fileWrite(File file){
        String str = "在那山的那边海的那边有一群蓝精灵,它们活泼又聪明它们调皮又灵敏,它们自由自在生活在那绿色的大森林,它们善良勇敢相互都欢喜！\n";
        try {
            FileWriter writer = new FileWriter(file,true);
            writer.write(str);
            writer.flush();
            writer.write("笔出名US看大V黑奴表格\n");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void fileRead(File file){
        try {
            FileReader reader = new FileReader(file);
            char[] chars = new  char[reader.read()];
            reader.read(chars);
            System.out.println(chars);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
