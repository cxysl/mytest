package JavaSE_06;

public class T605_Person2 {
}
class Person2{
    String name;
    float height;
    float weight;
    public Person2(String name,float height,float weight){
        this.name = name;
        this.height = height;
        this.weight = weight;
    }
    public void sayHello(){
        System.out.println("hello,my name is "+this.name);
    }
}
class Constructor{
    public static void main(String[] args) {
        Person2 p1 = new Person2("zhangsan",173,65);
        Person2 p2 = new Person2("lishi",180,75);
        p1.sayHello();
        p2.sayHello();
    }
}