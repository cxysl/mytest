package Test;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Lx02{
    public static void main(String[] args) throws InterruptedException {
        JFrame jf = new JFrame();
        jf.setSize(500, 500);
        jf.setLocation(500, 10);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(3);
        MyPanel jp1 = new MyPanel();

        jp1.setBackground(Color.black);
        jf.add(jp1);
        jp1.moveDown();
    }
}

class MyPanel extends JPanel {
    int x = 200;
    int y = 100;
    int w = 100;
    int h = 100;

    public void paint(Graphics g) {
        super.paint(g);//g是画笔
        g.setColor(new Color((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255)));
        g.fillOval(x, y, w, h);//g.fillOval()实心，填充 ，圆的坐标点为圆所在的矩形的左上角。
    }

    public void moveDown() throws InterruptedException{
        int m=1;
        int n=1;
        while(true){
            if (x==400||x==0) m=-m;
            if(y==350||y==0) n=-n;
            System.out.println(x+","+y);
            speed(m,n);
        }
    }

    public void speed(int m,int n) throws InterruptedException {
        x=x+m;
        y=y+n;
        repaint();      //更新打印画布
        Thread.sleep(1);
    }
}

