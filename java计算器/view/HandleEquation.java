package ch2.view;
import java.awt.event.*;
public class HandleEquation extends HandleEvent{
    HandleEquation(CalculatorWindow window) {
       super(window);
    }
    public void actionPerformed(ActionEvent e){
       String mess=" "+window.computer.getTempResult()+" "+
                     window.computer.getOperator()+" "+
                     window.computer.computerDataItem()+" = "+
                     window.computer.getResult();
       window.saveComputerProcess.append("\n"+mess);
   }
}