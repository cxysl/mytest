package Test;
//2519
public class PeopleNumber {
    public static void main(String[] args) {
        int num = 11;
        while (true){
            if (num%3==2&&num%5==4&&num%7==6&&num%9==8&&num%11==0){
                System.out.println(num);
//                break;
            }
            num++;
        }
    }
}
