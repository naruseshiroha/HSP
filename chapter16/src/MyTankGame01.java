import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Graphics;

public class MyTankGame01 extends JFrame {

    private MyPanel2 mp = null;

    public static void main(String[] args) {
        new MyTankGame01();
    }

    public MyTankGame01() {
        mp = new MyPanel2();
        add(mp);
        setSize(400, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

}

class MyPanel2 extends JPanel {
    @Override
    // 绘图方法
    public void paint(Graphics g) {
        g.setColor(Color.BLUE);
        g.fillRect(100, 100, 10, 60);
        g.fillRect(130, 100, 10, 60);
        g.fillRect(110, 110, 30, 40);
        g.drawLine(120, 130, 120, 100);
        g.setColor(Color.MAGENTA);
        g.fillOval(110, 120, 20, 20);
    }
}