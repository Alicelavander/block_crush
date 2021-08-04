package blockcrush;

import processing.core.PApplet;
import processing.core.PConstants;

import java.util.List;

public class Block extends GameObject implements Collision {
    int x;
    int y;
    int w;
    int h;
    boolean visible = true;

    public Block(PApplet applet, int x, int y, int w, int h) {
        super(applet);
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
    }

    @Override
    public void draw() {
        if(visible) {
            pApplet.fill(255, 255, 255);
            pApplet.rectMode(PConstants.CORNER);
            pApplet.rect(x, y, w, h);
        }
    }

    @Override
    public void update(List<GameObject> list) {
    }

    @Override
    public boolean onHit(int bx, int by) {
        if (visible && x < bx && (x + w) > bx && y < by && (y + h) > by){
            visible = false;
            return true;
        }
        return false;
    }
}
