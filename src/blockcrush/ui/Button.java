package blockcrush.ui;

import blockcrush.Main;
import processing.core.PApplet;

public class Button extends GUIObject{

    public Button(PApplet applet) {
        super(applet);
    }

    public void draw(){
        if(pApplet.mousePressed && isBetween(x, x + width, pApplet.mouseX) && isBetween(y, y + height, pApplet.mouseY)){
            pApplet.fill(0, 0, 255);
        } else {
            pApplet.fill(255, 0, 255);
        }
        pApplet.rect(x, y, width, height);
        pApplet.fill(255, 255, 255);
    }

    public void update(){
    }

    boolean isBetween(int min, int max, int num){
        if(min <= num && max >= num) return true;
        return false;
    }
}
