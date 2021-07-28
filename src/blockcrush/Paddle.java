package blockcrush;

import processing.core.PConstants;

import java.util.List;

class Paddle extends GameObject implements Collision {
    int x = 255;
    int y = 400;

    public Paddle(Main main) {
        super(main);
    }

    @Override
    public void draw() {
        pApplet.strokeWeight(2);
        pApplet.rectMode(PConstants.RADIUS);
        pApplet.rect(x, y, 25, 10);
    }

    @Override
    public void update(List<GameObject> list) {
        if (pApplet.keyPressed == true && pApplet.keyCode == 37) x -= 5;
        else if (pApplet.keyPressed == true && pApplet.keyCode == 39) x += 5;
    }

    @Override
    public boolean onHit(int bx, int by) {
        if ((x - 25) <= bx && bx <= (x + 25) && (y - 10) <= by && by <= (y + 10)) {
            return true;
        }
        return false;
    }
}
