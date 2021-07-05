package tankgame4;

public class Shot implements Runnable {
    int x;
    int y;
    int direct = 0;
    int speed = 2;
    private boolean live = true;

    public Shot() {

    }

    public Shot(int x, int y, int direct) {
        this.x = x;
        this.y = y;
        this.direct = direct;
    }

    @Override
    public void run() {
        while (true) {

            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            switch (direct) {
                case 0 -> y -= speed;
                case 1 -> x += speed;
                case 2 -> y += speed;
                case 3 -> x -= speed;
            }

            System.out.println("x:" + x + ",y:" + y);

            if (!(x >= 0 && x <= 1000 && y >= 0 && y <= 750)) {
                setLive(false);
                return;
            }
        }
    }

    public boolean isLive() {
        return this.live;
    }

    public void setLive(boolean live) {
        this.live = live;
    }

}
