package Test;
public class MyTel {
    public static void main(String[] args) {



                            //0 1 2 3 4 5 6 7
        int[] num = new int[]{1,3,4,5,6,7,8,9};
        int[] index = new int[]{0,5,4,6,1,5,1,4,7,2,3};
        String myTel = "";
        for( int i: index){
            myTel += num[i];
        }
        System.out.println(myTel);




    }
}
