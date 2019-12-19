package JavaSE_12File.课后必做题;

import java.io.Serializable;

public class Dog implements Serializable {
    String name;
    String color;
    String breed;   //品种

    public Dog(String name, String color, String breed) {
        this.name = name;
        this.color = color;
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", breed='" + breed + '\'' +
                '}'+"\n";
    }
}
