package JavaSE_06;
class Laptop{
    String color;
    int cpu;
    public Laptop(){}
    public Laptop(String color1,int cpu1){
        this.color = color1;
        this.cpu = cpu1;
    }
    public void show(){
        System.out.println("笔记本颜色:"+this.color+"\t笔记本型号:"+this.cpu);
    }
}

class test{
    public static void main(String[] args) {
        Laptop l1 = new Laptop("RED",1080);
        l1.show();
    }
}
public class T603_Laptop {

}