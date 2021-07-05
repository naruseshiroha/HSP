package tankgame4;

import java.util.Vector;

public class EnemyTank extends Tank {

    //在敌人坦克类,使用 Vector 保存多个 Shot
    Vector<Shot> shots = new Vector<>();

    public EnemyTank(Integer x, Integer y) {
        super(x, y);
    }

}
