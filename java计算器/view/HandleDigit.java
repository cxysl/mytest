package ch2.view;
import javax.swing.JButton;
import java.awt.event.*;
public class HandleDigit extends HandleEvent{
    HandleDigit(CalculatorWindow window) {
       super(window);
    }
    public void actionPerformed(ActionEvent e){
       JButton b = (JButton)e.getSource();
       String  buttomName = b.getText().trim();//去除前后空白区
       char digit = buttomName.charAt(0);
       window.computer.setDataItem(digit);
       showMess();
       if(digit == '.'){
         String s= get(window.computer.computerDataItem());
         window.showDataItem.setText("  "+s+"."); 
       } 
    }
}
