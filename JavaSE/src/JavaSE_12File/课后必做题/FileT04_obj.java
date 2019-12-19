package JavaSE_12File.课后必做题;

import java.io.*;

public class FileT04_obj {
    public static String str;
    public static void main(String[] args) {
        Dog[] dog = {
                new Dog("二哈","黑白相间","傻子类"),
                new Dog("金毛","金色","贵族"),
                new Dog("萨摩耶","雪白","漂亮"),
                new Dog("藏獒","灰色","凶残类"),
                new Dog("灰太狼","雪白","异类"),
        };
        try {

            File file = new File("F:\\Alice\\Lucky\\a.txt");
            File file2 = new File("F:\\Alice\\Lucky\\b.txt");
            FileInputStream fis = new FileInputStream(file2);
            FileOutputStream fos = new FileOutputStream(file);

            while (true){
                FileWriter writer = new FileWriter(file2);
                for (int i = 0; i <5 ; i++) {
                    writer.write("\n名字:");
                    writer.write((String)dog[i].name);
                    writer.write(",\t颜色:");
                    writer.write((String)dog[i].color);
                    writer.write(",\t品种:");
                    writer.write((String)dog[i].breed);
                }
                writer.flush();
                writer.close();
                int len = fis.read();
//                System.out.print(len);

                if (len == -1) {
                    break;
                } else {
                    str = str+(char)len;
//                    str1.concat(str);
                    if (len == 'l') {
                        fos.write((char) (len - 32));
                    } else {
                        fos.write((char) len);
                    }
                }

            }

            FileReader reader = new FileReader(file);//定义一个fileReader对象，用来初始化BufferedReader
            BufferedReader bReader = new BufferedReader(reader);//new一个BufferedReader对象，将文件内容读取到缓存
            StringBuilder b = new StringBuilder();//定义一个字符串缓存，将字符串存放缓存中
            String s = "";
            while ((s =bReader.readLine()) != null) {//逐行读取文件内容，不读取换行符和末尾的空格
                b.append(s + "\n");//将读取的字符串添加换行符后累加存放在缓存中
                System.out.println(s);
            }
            bReader.close();
            String str = b.toString();
            System.out.println(str );


        }catch (FileNotFoundException e){
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
