package blockcrush.ui;

import blockcrush.Main;

public class Text extends GUIObject {
    public String text;

    public Text(Main main, String string) {
        super(main);
        this.text = string;
    }

    @Override
    public void draw() {
        pApplet.text(this.text, x, y, width, height);
    }
}
