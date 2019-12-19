package JavaSE_06;

class Rectangle{
    int length;
    int width;
    public Rectangle(int length,int width){
        this.length = length;
        this.width = width;
    }
    public int getArea(){
        return this.length*this.width;
    }
    public int getPer(){
        return 2*(this.length+this.width);
    }
    public void showAll(){
        System.out.println("长:"+this.length+"\t\t宽："+this.width+"\t面积："+getArea()+"\t周长："+getPer());
    }
}

public class T602_Rectangle {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(4,5);
        r1.getArea();
        r1.getPer();
        r1.showAll();
    }
}
