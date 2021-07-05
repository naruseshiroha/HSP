package tankgame4;

public class Tank {
    private Integer x;
    private Integer y;
    private Integer direct = 0; // 坦克方向 0 上 1 右 2 下 3 左
    private Integer speed = 3;

    // 上右下左 移动
    public void moveUp() {
        y -= speed;
    }

    public void moveRight() {
        x += speed;
    }

    public void moveDown() {
        y += speed;
    }

    public void moveLeft() {
        x -= speed;
    }

    public Integer getSpeed() {
        return this.speed;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed;
    }

    public Tank() {
    }

    public Tank(Integer x, Integer y) {
        this.x = x;
        this.y = y;
    }

    public Integer getX() {
        return this.x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public Integer getY() {
        return this.y;
    }

    public void setY(Integer y) {
        this.y = y;
    }

    public Integer getDirect() {
        return this.direct;
    }

    public void setDirect(Integer direct) {
        this.direct = direct;
    }

}
