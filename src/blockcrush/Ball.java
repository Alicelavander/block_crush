package blockcrush;

import java.util.List;

class Ball extends GameObject {
    private final Main main;
    int x = 250;
    int y = 50;
    private float dx = 2.5f;
    private float dy = 2.5f;

    public Ball(Main main) {
        this.main = main;
    }

    @Override
    public void draw() {
        main.strokeWeight(10);
        main.stroke(255);
        main.point(x, y);
    }

    @Override
    public void update(List<GameObject> list) {

        list.forEach(o ->{
            if(o instanceof Collision){
                Collision collision = (Collision) o;
                if (collision.onHit((int)(x + dx), (int)(y + dy))) dy *= -1;
            }
        });

        x += dx;
        y += dy;

        if (x > main.width || x < 0) dx *= -1;
        if (y > main.height || y < 0) dy *= -1;
    }

    void onHit(Paddle paddle) {
        if (paddle.onHit(x, y)) dy *= -1;
    }
}
