package JavaSE_12File.Java_Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Test03 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("f:/temp/a/a.txt");
        FileReader fin1 = new FileReader(file);
        FileReader fin2 = new FileReader("f:/temp/a/b.txt");
        System.out.println(fin2);
    }
}
