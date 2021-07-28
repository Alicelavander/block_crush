package blockcrush.ui;

import blockcrush.GameObject;
import blockcrush.Main;

public class GUIObject extends GameObject {
    int x;
    int y;
    int width;
    int height;

    public GUIObject(Main main){
        super(main);
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
