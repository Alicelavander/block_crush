package blockcrush;
import blockcrush.ui.Button;
import blockcrush.ui.ClickListener;
import blockcrush.ui.Text;
import processing.core.PApplet;
import processing.event.MouseEvent;

import java.applet.Applet;
import java.util.ArrayList;
import java.util.List;
import java.lang.reflect.Array;

class StartStage {
    Button button;

    public StartStage(Main main) {
        this.button = new Button(main, "Start");
        button.setPosition(300, 100);
        button.setSize(40, 30);
        button.validate();

        this.button.setOnClickListener(new ClickListener() {
            @Override
            public void onClick(int x, int y) {
                main.startGame = true;
            }
        });
    }

    void draw() {
        button.draw();
    }
}
