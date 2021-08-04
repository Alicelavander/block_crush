package blockcrush.ui;

import blockcrush.Main;
import processing.core.PApplet;

public class Button extends GUIObject{
    private ClickListener listener;
    private boolean onPressed = false;
    private Text text;

    public Button(PApplet applet) {
        super(applet);
    }
    public Button(PApplet applet, String text) {
        this(applet);

        this.text = new Text(applet, text);
    }


    public void setOnClickListener(ClickListener listener){
        this.listener = listener;
    }

    @Override
    public void validate(){
        if(text!=null){
            text.setPosition(x, y+height/2);
            text.setSize(width, height);
        }
    }

    public void draw(){
        if(!onPressed && pApplet.mousePressed){
            if(pApplet.mousePressed && isBetween(x, x + width, pApplet.mouseX) && isBetween(y, y + height, pApplet.mouseY)) {
                onPressed = true;
            }
        }
        else if(onPressed && !pApplet.mousePressed){
            if(listener != null) listener.onClick(pApplet.mouseX, pApplet.mouseY);
            onPressed = false;
        }

        if(onPressed){
            pApplet.fill(0, 0, 255);
        } else {
            pApplet.fill(255, 0, 255);
        }
        pApplet.rect(x, y, width, height);

        if(this.text!=null) this.text.draw();
    }

    public void update(){
    }

    boolean isBetween(int min, int max, int num){
        if(min <= num && max >= num) return true;
        return false;
    }
}
