package JavaSE_12File.课后必做题;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileT4 {

    public static List<Dog> list = new ArrayList<>();

    public static void main(String[] args) {

        Dog[] dog = {
                new Dog("二哈","黑白相间","傻子类"),
                new Dog("金毛","金色","贵族"),
                new Dog("萨摩耶","雪白","漂亮"),
                new Dog("藏獒","灰色","凶残类"),
                new Dog("灰太狼","雪白","异类"),
        };
        list.add(dog[0]);
        list.add(dog[1]);
        list.add(dog[2]);
        list.add(dog[3]);
        list.add(dog[4]);
        File file = new File("TXT\\dog.txt");
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            objectWrite(file);
            objectRead(file);
        }catch (IOException e){
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void objectWrite(File file) throws IOException {
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
        objectOutputStream.writeObject(list);
        objectOutputStream.close();
    }

    public static void objectRead(File file) throws IOException, ClassNotFoundException {
        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(file));
        Object object = inputStream.readObject();
        List<Dog> list  = (List<Dog>) object;
        list.forEach(o-> System.out.println(o));

        Dog[] dog2 = new Dog[5];
        int i=  0;
        for (Dog o:list
             ) {
            dog2[i] = o;
            System.out.println("copy:\t"+dog2[i]);
            i++;
        }
        inputStream.close();
    }
}