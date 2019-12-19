package JavaSE_07_obj;

public class T03_Shape {
}
abstract class Shape{
    double area,per;
    String color;
    public  Shape(){}
    public Shape(String color){
        this.color = color;
    }
    public abstract double getArea();
    public abstract double getPer();
    public abstract void showAll();
    public String getColor() {
        return color;
    }
}
class Rectangle extends Shape{
    double width,height;
    public Rectangle(){}
    public Rectangle(double width,double height,String color){
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea(){
        return width*height;
    }
    public double getPer(){
        return 2*(width+height);
    }
    public void showAll(){
        System.out.println("我是矩形:\t\t长:"+width+"\t宽:"+height+"\t面积:"+getArea()+"\t周长"+getPer());
    }
}

class Circle extends Shape{
    double radius;
    public Circle(){}
    public Circle(double radius,String color){
        super(color);
        this.radius = radius;
    }
    @Override
    public double getArea(){
        return Math.PI*radius*radius;
    }
    public double getPer(){
        return 2*Math.PI*radius;
    }
    public void showAll(){
        System.out.println("我是圆:\t\t半径:"+radius+"\t面积:"+getArea()+"\t周长"+getPer());
    }
}

class test{
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(4.5,5.5,"靓红");
        Circle circle = new Circle(2.5,"靓黄");
        rectangle.showAll();
        circle.showAll();
    }
}