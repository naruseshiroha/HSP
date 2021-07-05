package tankgame4;

public class Hero extends Tank {

    // 定义 Shot 对象,表示一个射击(线程)
    Shot shot;

    public Hero(Integer x, Integer y) {
        super(x, y);
    }

    // 射击
    public void shotEnemyTank() {

        // 根据当前 Hero 对象的位置和方向来创建 Shot
        switch (getDirect()) {
            case 0 -> shot = new Shot(getX() + 20, getY(), 0);
            case 1 -> shot = new Shot(getX() + 60, getY() + 20, 1);
            case 2 -> shot = new Shot(getX() + 20, getY() + 60, 2);
            case 3 -> shot = new Shot(getX(), getY() + 20, 3);
        }
        // 启动线程
        new Thread(shot).start();
    }
}
