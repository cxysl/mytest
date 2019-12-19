package JavaSE_12File.Java_Test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Test02_Java7Characteristic {

    /***
     * JAVA7特性
     *
     * getNameCount()   获取当前文件节点数
     * getFileName()    获取当前文件名称
     * getRoot()        获取当前文件根目录
     * getParent()      获取当前文件上级关联目录
     */

    public static void main(String[] args) {
        Path path = Paths.get("C:\\Program Files (x86)\\Adobe\\Adobe Creative Cloud\\ACC");
        System.out.println("文件节点数:" + path.getNameCount());
        System.out.println("文件名称:" + path.getFileName());
        System.out.println("文件根目录:" + path.getRoot());
        System.out.println("文件上级关联目录:" + path.getParent());

    }
}
