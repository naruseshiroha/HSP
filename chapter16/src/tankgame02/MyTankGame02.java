package tankgame02;

import javax.swing.JFrame;

public class MyTankGame02 extends JFrame {

    // 定义 MyPanel
    MyPanel mp = null;

    public static void main(String[] args) {
        new MyTankGame02();
    }

    public MyTankGame02() {
        mp = new MyPanel();
        add(mp);
        setSize(1000, 750);
        addKeyListener(mp);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

} 
