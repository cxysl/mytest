package ch2.view;
import java.awt.event.*;
import ch2.data.Sqrt;
public class HandleSqrt extends HandleEvent{
    HandleSqrt(CalculatorWindow window) {
       super(window);
    }
    public void actionPerformed(ActionEvent e){
       window.computer.initDataItemByMath(new Sqrt());
       showMess();
    }
}