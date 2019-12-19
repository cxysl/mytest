package JavaSE_07_obj;

public class T01_Players {
}
class Player{
    private static int sum;
    public Player(){

    }
    public static Player create() {
        sum = 1;
        Player player = null;
        while(sum <= 11)
        {
            player = new Player();
            System.out.println("创建咯"+sum+"个对象");
            sum++;
        }
        System.out.println("对不起，已经创建咯11个对象，不能再创建对象了");
        return player;
    }
}
class Players_test{
    public static void main(String[] args) {
        Player.create();
    }
}