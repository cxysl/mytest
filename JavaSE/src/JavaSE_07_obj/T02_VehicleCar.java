package JavaSE_07_obj;
public class T02_VehicleCar {
}

class Vehicle{
    protected String brand;
    protected String color;
    protected static double speed = 0;

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public static double getSpeed() {
        return speed;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public static void setSpeed(double speed) {
        Vehicle.speed = speed;
    }

    public Vehicle(){}
    public Vehicle(String brand){
        super();
        this.brand = brand;
    }
    public void run(){
        System.out.println(brand+"牌子\t"+color+"跑车\t初始速度:"+speed+"km/h");
    }
}
class Car extends Vehicle{
    protected int loader;
    public Car(String brand){
        super(brand);
    }
    public int getLoader() {
        return loader;
    }

    public void setLoader(int loader) {
        this.loader = loader;
    }
    @Override
    public void run(){
        System.out.println(brand+"牌子\t"+color+"跑车,可载人:"+loader+"\t初始速度:"+speed+"km/h");
    }
}

class Main{
    public static  Object out;

    public static void main(String[] args) {
       Vehicle vehicle = new Vehicle("兰博基尼");
       vehicle.color = "靓红";
       vehicle.run();
       Car car = new Car("法拉利");
       car.color = "靓黄";
       car.loader = 2;
       car.run();
    }
}