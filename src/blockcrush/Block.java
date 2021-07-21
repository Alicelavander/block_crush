package blockcrush;

import processing.core.PApplet;
import processing.core.PConstants;

import java.util.List;

public class Block extends GameObject implements Collision{
    private final Main main;
    int x;
    int y;

    public Block(Main main, int x, int y) {
        this.main = main;
        this.x = x;
        this.y = y;
    }

    @Override
    public void draw() {
        for(int i=0; i<12; i++){
            for(int j=0; j<6; j++){
                main.rectMode(PConstants.CORNER);
                main.rect((main.width*i/12)+5, (main.height*j/18)+5, 45, 20);
            }
        }
    }

    @Override
    public void update(List<GameObject> list) {
    }

    @Override
    public boolean onHit(int bx, int by) {
        if ((x - 25) <= bx && bx <= (x + 25) && (y - 10) <= by && by <= (y + 10)) return true;
        return false;
    }
}
