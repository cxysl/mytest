package JavaSE_06;

public class T601_Point {
    int x;
    int y;

   public  T601_Point(int x1,int y1){
        this.x = x1;
        this.y = y1;
    }
    public void movePoint(int x2,int y2){
        this.x += x2;
        this.y += y2;
    }
    public void show(){
        System.out.println("该点的坐标为：("+this.x+","+this.y+");");
    }
    public static void main(String[] args) {
//        int a,b;
        T601_Point p1 = new T601_Point(5,5);
        p1.movePoint(3,3);
        p1.show();

        T601_Point p2 = new T601_Point(10,10);
        p2.movePoint(-2,-2);
        p2.show();
    }
}
