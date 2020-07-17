package data;
import java.util.*;
public class Computer {
   public double result;    //�������ý��
   public Stack<Character>  dataItem;  //���������������
   public Stack<Double>  tempResult;   //�ö�ջ�����ʱ���
   public Stack<Character>  operator;  //����������
   public Computer(){  //�޲ι���
       init();  //����init����
   }                              
   public void init() { 
       dataItem = new Stack<Character>();  //����dataitem ��ʱ���ݶ���	
       tempResult = new Stack<Double>();  //��������������
       dataItem.push('0');    //ѹջ                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      
       operator = new Stack<Character>();  //��������ջ����
   }
   public void setDataItem(char c){   //��������
       if(c!='.')                    //��ջ
         dataItem.push(c);
       else {
          if(!dataItem.contains('.'))//�ж��ַ����Ƿ���С����
             dataItem.push(c);  //��ջ
       }
   }
   public void setOperator(char p){ //��������
       if(dataItem.empty()){   //���û��������
          operator.clear();//��ֹ�û����ϸ����򷴸�����һ�������
          operator.push(p);//��ջѹ����������������û����ȷ���������
          return;
       }
       if(operator.empty()) {     //���û�������
          operator.push(p);       //��ջѹ�������
          double m = computerDataItem(); //����������
          dataItem.removeAllElements();  //���������е��������
          tempResult.push(m);           //����ʱ���mѹ��tempResult
       } 
       else {                     //����������
          double mData = computerDataItem(); //����������
          dataItem.removeAllElements();  //���������е��������
          char yuansuan =operator.pop(); //�������е������
          double rTemp =tempResult.pop();     //������ʱ���
          if(yuansuan == '+'){
             rTemp = rTemp+mData;
          }
          else if(yuansuan == '-') {
             rTemp = rTemp-mData;
          }
          else if(yuansuan == '*') {
             rTemp = rTemp*mData;
          }
          else if(yuansuan == '/') {
             rTemp = rTemp/mData;
          }
          tempResult.push(rTemp);  //������ʱ���rTempѹ��tempResult
          operator.push(p);        //�������ѹ��operator
       }
   }
   public char getOperator() {
      if(operator.empty()){
         return '\0';//�ַ�������
      }
      return operator.peek();//��ȡջ�����ݣ���������
   }
   public void backspace() {//�˸񷽷�
      if(dataItem.size()>=1){//������ջ��������һ������
         dataItem.pop();//��ջ
      }
   }
   public void initDataItemByMath(MathComputer computer){ 
       computer.handle(this);     //��compter�е������������ѧ����
   }
   public double getResult() {    //�õ�������
      double endItem = 0;
      if(dataItem.empty()){
         endItem = tempResult.peek();
      }
      else {
         endItem = computerDataItem();
      }
      if(operator.empty()) {
         result = endItem;
         return result;
      }
      char yuansuan =operator.peek(); //���������
      if(yuansuan == '+'){
          result = tempResult.peek()+endItem;
      }
      else if(yuansuan == '-') {
          result = tempResult.peek()-endItem;
      }
      else if(yuansuan == '*') {
          result = tempResult.peek()*endItem;
      }
      else if(yuansuan == '/') {
          result = tempResult.peek()/endItem;
      }
      return result;
   }
   public double getTempResult() {    //�õ���ʱ���
      double r = 0;
      if(tempResult.empty()){
         r = computerDataItem();
      }
      else {
         r= tempResult.peek();
      }
      return r;
   }
   public double computerDataItem(){  //������������double�ͽ��
      if(dataItem.empty()){
         return tempResult.peek();
      }
      StringBuffer str = new StringBuffer();//�½��ַ������棨���޸ģ�
      double doubleData = 0; 
      for(int i=0;i<dataItem.size();i++) {
          str.append(dataItem.get(i));//��ȡ��ջ�е�����(������ջ)
      }
      try{
         doubleData = Double.parseDouble(str.toString());//ת��Ϊdouble����
      }
      catch(NumberFormatException exp){
          doubleData = 0;
      }
      return doubleData;
  }
}
