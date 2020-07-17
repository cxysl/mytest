package ch2.view;
import javax.swing.JButton; 
import java.awt.event.*;
public class HandleOperator extends HandleEvent{
    HandleOperator(CalculatorWindow window) {
       super(window);
    }
    public void actionPerformed(ActionEvent e){
       JButton b = (JButton)e.getSource();
       String  buttomName = b.getText().trim();//ȥ��ǰ��հ���
       char operator = buttomName.charAt(0);
       window.computer.setOperator(operator);
       showMess();
   }
}