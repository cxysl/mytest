package JavaSE_12File.课后必做题;

import java.io.*;

/**
 * 1、在本机的磁盘系统中，找一个文件夹，利用File类的提供方法，列出该文件夹中的所有文件的文件名和文件的路径，执行效果如下：[必做题]
 * 路径是xxx的文件夹内的文件有：
 *  	文件名：abc.txt
 * 	路径名：c:\temp\abc.txt
 * 	--------------------------------------------
 * 	文件名：def.txt
 * 	路径名：c:\temp\def.txt
 */
public class FileT01 {

    public static void main(String[] args)
    {
        method_1();

//        method_2();
    }


    public static void method_1()
    {
        File fl=new File("E:\\学习资料\\Lucky\\C++");
        String[] files1=fl.list();
        File[] files2=fl.listFiles();
        int i=0;
        for(String str1 : files1 )
        {
            System.out.println("文件名:\t"+str1);
            for ( ;i <files2.length ; ) {
                System.out.println("路径名:\t"+files2[i]);
                break;
            }
            i++;
            System.out.println("*******************************");
        }
    }
}
/**
 *
 * String[] list( )         返回由此抽象路径名所表示的目录中的文件和目录的名称所组成字符串数组
 * File[] listFiles()       返回一个抽象路径名数组，这些路径名表示此抽象路径名所表示目录中的文件
 *
 */