package blockcrush.ui;

import blockcrush.GameObject;
import blockcrush.Main;
import processing.core.PApplet;

public class GUIObject extends GameObject {
    int x;
    int y;
    int width;
    int height;

    public GUIObject(PApplet applet){
        super(applet);
    }

    public void setPosition(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void setSize(int w, int h){
        this.width = w;
        this.height = h;
    }
}
