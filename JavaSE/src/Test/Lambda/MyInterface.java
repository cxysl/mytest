package Test.Lambda;


/**
 *
 * 函数接口只能有一个抽象方法
 * 不够加一个Object类中的toString()方法没事
 * 该方法是复写的Object类的中方法，所以java编译器不认为该方法是一个抽象方法，所以当然整个接口还是满足只有一个抽象方法的条件，当然认为此时的接口还是一个函数式接口啦
 *
 */

@FunctionalInterface        //函数接口
public interface MyInterface {
    void test();
//    String myString();
    String toString();
}
