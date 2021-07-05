package tankgame4;

import javax.swing.JFrame;

public class MyTankGame04 extends JFrame {

    // 定义 MyPanel
    MyPanel mp = null;

    public static void main(String[] args) {
        new MyTankGame04();
    }

    public MyTankGame04() {
        mp = new MyPanel();
        new Thread(mp).start();
        add(mp);
        setSize(1000, 750);
        addKeyListener(mp);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

}
