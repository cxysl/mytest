package JavaSE_10_Collection.java.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class T_Stream {
    public static void main(String[] args) {
        List<Apple> apples = new ArrayList<>();
        apples.add(new Apple(1,"red","红富士"));
        apples.add(new Apple(3,"red","红富士"));

        apples.add(new Apple(2,"red","山东苹果"));
        apples.add(new Apple(4,"red","山东苹果"));

        apples.add(new Apple(5,"green","红富士"));
        apples.add(new Apple(7,"green","红富士"));

        apples.add(new Apple(6,"green","山东苹果"));
        apples.add(new Apple(8,"green","山东苹果"));

        //filter  筛选符合条件的数据并返回一个新的流

        //collect将流中数据收集
        List<Apple> reds = apples.stream().filter(apple -> apple.getCatalog().equals("红富士")).collect(Collectors.toList());
        System.out.println(reds);

        //distinct  去重(根据对象的equals和hashcode方法比较两个对象是否是同一个对象)
        List<Apple> distincts = apples.stream().distinct().collect(Collectors.toList());
        System.out.println(distincts);

        //限制结果集的大小
        List<Apple>limits = apples.stream().limit(1).collect(Collectors.toList());
        System.out.println(limits);

    }
}
