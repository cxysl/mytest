package JavaSE_07_obj;

public class Players {
    public static  int num = 0;
    public Players(){
        num++;
    }
    public static Players test(){
        Players players = null;
        players = new Players();
        System.out.println("Good Night!"+num);
        return players;
    }
}
class main{
    public static void main(String[] args) {
        Players.test().test().test().test().test().test().test().test().test().test().test();
    }
}
