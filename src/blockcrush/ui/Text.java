package blockcrush.ui;

import blockcrush.Main;
import processing.core.PApplet;

public class Text extends GUIObject {
    public String text;

    public Text(PApplet applet, String string) {
        super(applet);
        this.text = string;
    }

    @Override
    public void draw() {
        pApplet.fill(255, 255, 255);
        pApplet.text(this.text, x, y, width, height);
    }
}
