package blockcrush.ui;

import blockcrush.Main;

public class Button extends GUIObject{

    public Button(Main main) {
        super(main);
    }

    public void draw(){
        if(pApplet.mousePressed && isBetween(x, x + width, pApplet.mouseX) && isBetween(y, y + height, pApplet.mouseY)){
            pApplet.fill(0, 0, 255);
        } else {
            pApplet.fill(255, 0, 255);
        }
        pApplet.rect(x, y, width, height);
    }

    public void update(){
    }

    boolean isBetween(int min, int max, int num){
        if(min <= num && max >= num) return true;
        return false;
    }
}
