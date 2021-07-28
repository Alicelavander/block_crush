package blockcrush;

import processing.core.PApplet;
import processing.core.PConstants;

import java.util.List;

public class Block extends GameObject implements Collision {
    private final Main main;
    int x;
    int y;
    int w;
    int h;
    boolean visible = true;

    public Block(Main main, int x, int y, int w, int h) {
        this.main = main;
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
    }

    @Override
    public void draw() {
        if(visible) {
            main.rectMode(PConstants.CORNER);
            main.rect(x, y, w, h);
        }
    }

    @Override
    public void update(List<GameObject> list) {
    }

    @Override
    public boolean onHit(int bx, int by) {
        if (this.visible && x < bx && (bx + w) > bx && y < by && (y + h) > by){
            this.visible = false;
            return true;
        }
        return false;
    }
}
