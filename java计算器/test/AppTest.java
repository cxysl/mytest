package ch2.test;
import ch2.data.*;
public class AppTest {
   public static void main(String [] args){
      Computer com = new Computer();
      com.setDataItem('3');
      com.setOperator('+');
      com.setDataItem('1');
      com.setDataItem('5');
      com.initDataItemByMath(new Sqrt()); 
      com.setOperator('/');
      com.setDataItem('2');
      System.out.println("TempResult="+com.getTempResult());
      System.out.println("DataItem="+com.computerDataItem());
      System.out.println("result="+com.getResult());
   }
}