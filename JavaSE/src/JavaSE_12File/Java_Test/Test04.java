package JavaSE_12File.Java_Test;

import java.io.File;
import java.io.IOException;

public class Test04 {
    public static void main(String[] args) throws IOException, IOException {
        File ffu = new File("F:\\父目录");
        File ffu1 = new File("F:\\父目录\\父目录下的文件1.java");
        File ffu2 = new File("F:\\父目录\\父目录下的文件2.java");
        File ffua = new File("F:\\父目录\\a.txt");
        File ffub = new File("F:\\父目录\\b.txt");

        File fz = new File("F:\\父目录\\子目录");
        File fz1 = new File("F:\\父目录\\子目录\\子目录下的文件1.java");
        File fz2 = new File("F:\\父目录\\子目录\\子目录下的文件2.java");
        File fza = new File("F:\\父目录\\子目录\\a.txt");
        File fzb = new File("F:\\父目录\\子目录\\b.txt");
        // 创建目录、文件
        boolean bfu = ffu.mkdirs();
        boolean bffu1 = ffu1.createNewFile();
        boolean bffu2 = ffu2.createNewFile();
        boolean bffua = ffua.createNewFile();
        boolean bffub = ffub.createNewFile();

        boolean bfz = fz.mkdirs();
        boolean bfz1 = fz1.createNewFile();
        boolean bfz2 = fz2.createNewFile();
        boolean bfza = fza.createNewFile();
        boolean bfzb = fzb.createNewFile();

        System.out.println(bfu);
        System.out.println(bffu1);
        System.out.println(bffu2);
        System.out.println(bffua);
        System.out.println(bffub);

        System.out.println(bfz);
        System.out.println(bfz1);
        System.out.println(bfz2);
        System.out.println(bfza);
        System.out.println(bfzb);
    }
}
