package JavaSE_13Thread.t4_time;

import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Time implements Runnable {

    public static void clear() throws AWTException
    {
        Robot r = new Robot();
        r.mousePress(InputEvent.BUTTON3_MASK);       // 按下鼠标右键
        r.mouseRelease(InputEvent.BUTTON3_MASK);    // 释放鼠标右键
        r.keyPress(KeyEvent.VK_CONTROL);             // 按下Ctrl键
        r.keyPress(KeyEvent.VK_R);                    // 按下R键
        r.keyRelease(KeyEvent.VK_R);                  // 释放R键
        r.keyRelease(KeyEvent.VK_CONTROL);            // 释放Ctrl键
        r.delay(100);

    }

    @Override
    public void run() {
        /*try {
            clear();
        } catch (AWTException e) {
            e.printStackTrace();
        }*/
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Date date = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String time = sdf.format(date.getTime());
            System.out.println(time);
        }
    }
}
