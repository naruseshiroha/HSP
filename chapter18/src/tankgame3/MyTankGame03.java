package tankgame3;

import javax.swing.JFrame;

public class MyTankGame03 extends JFrame {

    // 定义 MyPanel
    MyPanel mp = null;

    public static void main(String[] args) {
        new MyTankGame03();
    }

    public MyTankGame03() {
        mp = new MyPanel();
        new Thread(mp).start();
        add(mp);
        setSize(1000, 750);
        addKeyListener(mp);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

}
