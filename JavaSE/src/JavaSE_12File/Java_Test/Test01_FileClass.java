package JavaSE_12File.Java_Test;

import java.io.File;
import java.io.IOException;

public class Test01_FileClass {

    //  createNewFile() 创建文件
    //  mkdirs()    创建多级目录

    /**
     * File类
     *
     *boolean  createNewFile()      当且仅当不存在具有此抽象路径名指定的名称的文件时，原子地创建由此抽象路径名指定的一个新的空文件。
     *static File createTempFile(String prefix,String suffix)      在默认临时文件目录中创建一个空文件，使用给定前缀和后缀生成其名称
     *static File createTempFile(String prefix,Stirng suffix,File directory)        在指定目录中创建一个新的空文件，使用给定的前缀和后缀字符串生成其名称
     * boolean exists( )        测试此抽象路径名表示的文件或目录是否存在
     * boolean delete( )        删除此抽象路径名表示的文件或目录
     * boolean equals(Object obj)       测试此抽象路径名与给定对象是否相等
     * boolean canRead()        测试应用程序是否可以读取此抽象路径名表示的文件
     * boolean canWrite()       测试应用程序是否可以修改此抽象路径名表示的文件
     * String[] list( )     返回由此抽象路径名所表示的目录中的文件和目录的名称所组成字符串数组
     * String getAbsolutePath( )        返回抽象路径名的绝对路径名字符串
     * String getName( )        返回由此抽象路径名表示的文件或目录的名称，不包括路径名称
     * String getPath( )        将此抽象路径名转换为一个路径名字符串
     * File[] listFiles()       返回一个抽象路径名数组，这些路径名表示此抽象路径名所表示目录中的文件
     * boolean renameTo(File dest )     重新命名此抽象路径名表示的文件
     * long length( )       返回由此抽象路径名表示的文件的大小，以byte为单位
     * boolean mkdir( )     创建此抽象路径名指定的目录
     * boolean mkdirs( )        创建此抽象路径名指定的目录，包括创建必需但不存在的父目录。注意，如果此操作失败，可能已成功创建了一些必需的父目录
     *
     */
    public static void main(String[] args) throws IOException {

        String strPath="f:/temp/a/a.txt";
        File file = new File(strPath);
        File fileParent = file.getParentFile();
        if(!fileParent.exists()){   //exists() 测试此抽象路径名表示的文件或目录是否存在
            fileParent.mkdirs();    //mkdirs()创建此抽象路径名指定的目录，包括创建必需但不存在的父目录。注意，如果此操作失败，可能已成功创建了一些必需的父目录
        }
        file.createNewFile();   //createNewFile()当且仅当不存在具有此抽象路径名指定的名称的文件时，原子地创建由此抽象路径名指定的一个新的空文件。


        /*String strPath = "F:\\temp\\a";
        File file = new File(strPath);
        if(!file.exists()){     //exists() 测试此抽象路径名表示的文件或目录是否存在
            file.mkdirs();      //mkdirs()创建此抽象路径名指定的目录，包括创建必需但不存在的父目录。注意，如果此操作失败，可能已成功创建了一些必需的父目录
        }*/
    }

}
