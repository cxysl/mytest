package JavaSE_06;

public class T604_Person {
}
class Person{
    String name;
    float height;
    float weight;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public void sayHello(){
        System.out.println("hello,my name is "+getName());
    }
}
class PersonCreate{
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "zhangsan";
        p1.height = 180;
        p1.weight = 75;
        p1.sayHello();

        Person p2 = new Person();
        p2.name = "lishi";
        p2.height = 160;
        p2.weight = 55;
        p2.sayHello();
    }
}