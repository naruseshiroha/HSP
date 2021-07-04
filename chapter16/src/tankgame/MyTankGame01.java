package tankgame;

import javax.swing.JFrame;

public class MyTankGame01 extends JFrame {

    // 定义 MyPanel
    MyPanel mp = null;

    public static void main(String[] args) {
        new MyTankGame01();
    }

    public MyTankGame01() {
        mp = new MyPanel();
        add(mp);
        setSize(1000, 750);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

}
