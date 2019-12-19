package JavaSE_06;

class People{
    String name;    //名字
    String weapon;   //武器
    int fighting;    //战斗力
    int stamina;    // 耐力

    public int getFighting() {
        return fighting;
    }

    public int getStamina() {
        return stamina;
    }

    public String getName() {
        return name;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setFighting(int fighting) {
        this.fighting = fighting;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public void show(){
        System.out.println("名字："+getName()+"\t武器："+getWeapon()+"\t战斗力："+getFighting()+"\t\t耐力："+getStamina());
    }
}

public class KTLX01 {
    public static void main(String[] args) {
        People p1 = new People();
        p1.name = "唐僧";
        p1.weapon = null;
        p1.fighting = 0;
        p1.stamina = 5;
        p1.show();

        People p2 = new People();
        p2.name = "孙悟空";
        p2.weapon = "金箍棒";
        p2.fighting = 5;
        p2.stamina = 5;
        p2.show();

        People p3 = new People();
        p3.name = "猪八戒";
        p3.weapon = "九齿钉耙";
        p3.fighting = 4;
        p3.stamina = 2;
        p3.show();

        People p4 = new People();
        p4.name = "沙和尚";
        p4.weapon = "月牙铲";
        p4.fighting = 3;
        p4.stamina = 4;
        p4.show();
    }
}