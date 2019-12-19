package JavaSE_07_obj.多态;

public class Cat extends  Animal{
    public static void main(String[] args) {
        Animal a = new Cat();
        boolean b = a instanceof Cat;
        System.out.println(b);
    }
}
