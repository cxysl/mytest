package ch2.view;
import javax.swing.JButton; 
import java.awt.event.*;
public class HandleOperator extends HandleEvent{
    HandleOperator(CalculatorWindow window) {
       super(window);
    }
    public void actionPerformed(ActionEvent e){
       JButton b = (JButton)e.getSource();
       String  buttomName = b.getText().trim();//去除前后空白区
       char operator = buttomName.charAt(0);
       window.computer.setOperator(operator);
       showMess();
   }
}