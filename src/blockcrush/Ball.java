package blockcrush;

import processing.core.PApplet;

import java.util.List;

class Ball extends GameObject {
    int x = 250;
    int y = 50;
    private float dx = 2.5f;
    private float dy = 2.5f;

    public Ball(PApplet applet, int x, int y) {
        super(applet);
        this.x = x;
        this.y = y;
    }

    @Override
    public void draw() {
        pApplet.strokeWeight(10);
        pApplet.stroke(255);
        pApplet.point(x, y);
    }

    @Override
    public void update(List<GameObject> list) {

        list.forEach(o ->{
            if(o instanceof Collision){
                Collision collision = (Collision) o;
                if (collision.onHit((int)(x + dx), (int)(y + dy))){
                    dy *= -1;
                }
            }
        });

        x += dx;
        y += dy;

        if (x > pApplet.width || x < 0) dx *= -1;
        if (y > pApplet.height || y < 0) dy *= -1;
    }

    void onHit(Paddle paddle) {
        if (paddle.onHit(x, y)) dy *= -1;
    }
}
