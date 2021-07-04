package event;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class BallMove extends JFrame {

    MyPanel mp = null;

    public static void main(String[] args) {
        // BallMove ballMove =
        new BallMove();
    }

    public BallMove() {
        mp = new MyPanel();
        add(mp);
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        addKeyListener(mp);
    }

}

class MyPanel extends JPanel implements KeyListener {

    int x = 10, y = 10;

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillOval(x, y, 30, 30);
    }

    @Override
    // 有字符输出时触发
    public void keyTyped(KeyEvent e) {

    }

    @Override
    // 当某个键按下时触发
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_DOWN -> y++;
            case KeyEvent.VK_UP -> y--;
            case KeyEvent.VK_RIGHT -> x++;
            case KeyEvent.VK_LEFT -> x--;
        }
        repaint();
    }

    @Override
    // 当某个键松开时触发
    public void keyReleased(KeyEvent e) {

    }
}
