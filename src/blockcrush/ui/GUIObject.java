package blockcrush.ui;

import blockcrush.GameObject;

public class GUIObject extends GameObject {
    int x;
    int y;
    int width;
    int height;

    public void setPosition(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void setSize(int w, int h){
        this.width = w;
        this.height = h;
    }
}
