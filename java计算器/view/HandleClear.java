package ch2.view;
import java.awt.event.*;
public class HandleClear extends HandleEvent{
    HandleClear(CalculatorWindow window) {
       super(window);
    }
    public void actionPerformed(ActionEvent e){
       window.computer.init();
       showMess();
    }
}