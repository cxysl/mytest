package JavaSE_12File.课后必做题;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;

public class FileT02 {

    /**
     * 编写一个java程序实现文件复制功能，
     * 要求将d:/io/copysrc.doc中的内容复制到d:/io/copydes.doc中
     *
     */
    public static void main(String[] args) throws IOException {
        File file1 = new File("F:\\temp\\a");
//        File file12 = new File("F:\\temp\\a\\Lucky.doc");
        file1.mkdirs();
//        file12.createNewFile();

        File f1=new File("F:\\temp\\a\\");//传入文件/目录的路径
        File f12=new File(f1,"Lucky.txt");//第一个参数为一个目录文件，第二个参数为要在当前f1目录下要创建的文件

        PrintWriter printWriter =new PrintWriter(new FileWriter(f12,true),true);//第二个参数为true，从文件末尾写入 为false则从开头写入
        printWriter.println("I am your father");
        printWriter.close();//记得关闭输入流


        File file2 = new File("F:\\temp\\b");
        File file22 = new File("F:\\temp\\b\\Lucky.txt");
        file2.mkdirs();

        Files.copy(f12.toPath(), file22.toPath());
        /*
        Files.copy(source, target, options)
        用法也很简单，源文件，目标文件File 获取path，在传入方法，options可以不传值，参数可以忽略。
    例如：D:/a.txt文件要复制到E:/xx/b.txt中，
    就要先将两文件的path得到，这里要求目标文件b.txt文件不存在，存在了就爆错了。
    但是目标文件的路径必须要有，源代码方法中没有创建dir的方法。
    */
    }
}

