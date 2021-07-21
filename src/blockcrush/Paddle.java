package blockcrush;

import processing.core.PConstants;

import java.util.List;

class Paddle extends GameObject implements Collision {
    private final Main main;
    int x = 255;
    int y = 400;

    public Paddle(Main main) {
        this.main = main;
    }

    @Override
    public void draw() {
        main.strokeWeight(2);
        main.rectMode(PConstants.RADIUS);
        main.rect(x, y, 25, 10);
    }

    @Override
    public void update(List<GameObject> list) {
        if (main.keyPressed == true && main.keyCode == 37) x -= 5;
        else if (main.keyPressed == true && main.keyCode == 39) x += 5;
    }

    @Override
    public boolean onHit(int bx, int by) {
        if ((x - 25) <= bx && bx <= (x + 25) && (y - 10) <= by && by <= (y + 10)) {
            return true;
        }
        return false;
    }
}
