import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.*;

public class DrawCircle extends JFrame { // JFrame 对应窗口 可以理解成 画框

    // 定义一个面板
    private MyPanel mp = null;

    public static void main(String[] args) {
        new DrawCircle();
        System.out.println("退出程序");
    }

    public DrawCircle() {
        // 初始化面板
        mp = new MyPanel();
        // 把面板放入到窗口
        add(mp);
        // 设置窗口的大小
        setSize(800, 800);
        // 点击窗口的 x,退出程序
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

}

// 1.先定义一个 MyPanel,继承 Panel,画图形,就在面板上画
class MyPanel extends JPanel {

    @Override
    // 绘图方法
    public void paint(Graphics g) {
        // 调用父类的方法完成初始化
        super.paint(g);
        System.out.println("paint()...");

        // 直线
        // g.drawLine(0, 0, 30, 40);

        // 矩形边框
        // g.drawRect(10,20,90,100);

        // 填充矩形
        // g.setColor(Color.ORANGE);
        // g.fillRect(10, 10, 100, 100);

        // 椭圆
        // g.drawOval(10, 10, 170, 200);
        // g.drawOval(10, 10, 200, 200);

        // 画图片
        // Image image =
        // Toolkit.getDefaultToolkit().getImage(MyPanel.class.getResource("/avatar.png"));
        // g.drawImage(image, 10, 10, 776, 776, this);

        // 画字符串
        g.setColor(Color.green);
        g.setFont(new Font("宋体", Font.BOLD, 50));
        g.drawString("ToKyo", 100, 100);
    }
}