package JavaSE_12File.课后必做题;

/**
 * 3、创建c:/test01.txt文件并在其中输入"hello world"
 * 创建一个输入流读取该文件中的文本
 * 并且把小写的l变成大写L再利用输出流写入到d:\test01.txt中  [必做题]
 * 3.1 实现步骤：
 * 3.1.1 在本地硬盘C盘下创建一个文件test.txt
 * 3.1.2 创建一个包含main()方法的类，并在main中编写代码
 * 3.1.3 运行代码并且测试结果
 * 3.2 实现过滤器的功能
 * 效果显示：
 */

import java.io.*;

/**
 * Author:程世林
 * time:2019-11-04
 */

public class FileT03 {
    public static void main(String[] args) throws IOException {

        //定义指定磁盘的文件的File对象

        File src = new File("f://Alice//TXT.txt");// 源文件
        File  dest = new File("f://Alice//King//TXT.txt");// 目标文件
        // 定义文件输入输出流对象
        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
            fis = new FileInputStream(src);// 输入流对象
            fos = new FileOutputStream(dest);// 输出流对象
            while (true) {
                int len = fis.read();

                if (len == -1) {
                    break;
                } else {
                    if (len == 'l') {
                        fos.write((char) (len - 32));
                    } else {
                        fos.write((char) len);
                    }
                }
            }
            System.out.println("文件传输完成");
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            try {
                fos.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            try {
                fis.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

        /*try {
            FileInputStream input = new FileInputStream(file);

            byte[] bytes2 = new byte[1024];

            int len = input.read(bytes2);

            System.out.println("从文件"+file.getParent()+"中读取的信息是:\t" + new String(bytes2, 0, len));

            input.close();

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        if(! file.exists()){
            System.out.println("对不起，不包含指定路径的文件");
        }else{
            //根据指定路径的File对象创建FileReader对象
            try {
                File file2 = new File("f://Alice//King//TXT.txt");
                Files.move(file.toPath(),file2.toPath());

                FileReader fr = new FileReader(file2);

                char[] data = new char[23];			//定义char数组

                int length = 0;
                System.out.print("通过过滤器写到文件"+file2.getParent()+"的内容是:\t");
                while((length = fr.read(data))>0){			//循环读取文件中的数据
                    String str = new String(data,0,length);			//根据读取文件的内容创建String 对象
                    System.out.println(str);				//输出读取内容
                }
                fr.close();								//关闭流



            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

        }*/
//        File f = new File("f://Alice//TXT.txt");
        /*File file = new File("f://Alice//TXT.txt");  //创建文件对象

        try {
            if (!file.exists()) {				//如果文件不存在则新建文件
                file.createNewFile();

            }
            FileOutputStream output = new FileOutputStream(file);

            byte[] bytes = "hello world".getBytes();

            output.write(bytes);				//将数组的信息写入文件中

            output.close();

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        try {
            FileInputStream input = new FileInputStream(file);

            byte[] bytes2 = new byte[1024];

            int len = input.read(bytes2);

            System.out.println("文件中的信息是：" + new String(bytes2, 0, len));

            input.close();

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }*/


    }
}
/*
File src = new File("e:/test01.txt");// 源文件
    File dest = new File("g:/test01.txt");// 目标文件
    // 定义文件输入输出流对象
    FileInputStream fis = null;
    FileOutputStream fos = null;

    try {
        fis = new FileInputStream(src);// 输入流对象
        fos = new FileOutputStream(dest);// 输出流对象
        while (true) {
            int len = fis.read();
            System.out.print(len);

            if (len == -1) {
                break;
            } else {
                if (len == 'l') {
                    fos.write((char) (len - 32));
                } else {
                    fos.write((char) len);
                }
            }
        }
        System.out.println("文件传输完成");
    } catch (FileNotFoundException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    } finally {
        try {
            fos.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        try {
            fis.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
      }
*/