package tankgame;

import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Graphics;

public class MyPanel extends JPanel {

    // 定义坦克
    Hero hero = null;

    public MyPanel() {
        hero = new Hero(100, 100);

    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillRect(0, 0, 1000, 750);

        // 画坦克
        drawTank(hero.getX(), hero.getY(), g, 0, 0);
    }

    /**
     * 画坦克
     * 
     * @param x      横坐标
     * @param y      纵坐标
     * @param g      画笔
     * @param direct 方向(上下左右)
     * @param type   类型(敌友)
     */
    public void drawTank(int x, int y, Graphics g, int direct, int type) {
        switch (type) {
            case 0 -> g.setColor(Color.cyan);
            case 1 -> g.setColor(Color.yellow);
        }

        // 0 1 2 3 上下左右
        switch (direct) {
            case 0 -> {
                g.fill3DRect(x, y, 10, 60, false);
                g.fill3DRect(x + 30, y, 10, 60, false);
                g.fill3DRect(x + 10, y + 10, 20, 40, false);
                g.fillOval(x + 10, y + 20, 20, 20);
                g.drawLine(x + 20, y + 30, x + 20, y);
            }
        }

    }
}
