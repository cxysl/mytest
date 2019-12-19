package Test.Lambda;

public class Test2 {
    public void myTest(MyInterface myInterface){
        System.out.println(1);
        myInterface.test();
        System.out.println(2);
    }

    public static void main(String[] args) {
        Test2 test2 = new Test2();
        /*test2.myTest(new MyInterface() {
            @Override
            public void test() {
                System.out.println("Mytest: 函数");
            }
        });*/

//        /**下面改用Lambda表达式*/
        test2.myTest(()-> System.out.println("MyTest:Lambda表达式"));
        System.out.println("-----------------");
//        /**上面的Lamdba表达式的写法就是MyInterface的匿名实现类，所以程序可以这样写：*/
        MyInterface myInterface = ()-> System.out.println("MyTest:Lambda表达式2");
//        /**那咱们可以打印一下这个类和它父类名字，如下*/
        System.out.println(myInterface);
        System.out.println(myInterface.getClass().getSuperclass());
//        /**那这个myInterface类的具体实现的接口是哪些呢？接着可以打印一下：*/
        System.out.println(myInterface.getClass().getInterfaces().length);
//        那这接口是谁呢？继续打印：
        System.out.println(myInterface.getClass().getInterfaces()[0]);

    }
}
