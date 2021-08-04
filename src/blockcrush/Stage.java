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

class Stage {
    final int maxBlockWCount = 10;
    final int maxBlockHCount = 4;
    final int blockSpace = 4;

    private final PApplet applet;
    Ball ball;
    Paddle paddle;
    Button button;
    Score score = new Score();
    List<GameObject> objects = new ArrayList<>();

    public Stage(PApplet applet) {
        this.applet = applet;
        this.ball = new Ball(applet, applet.width/2, applet.height/2);
        this.button = new Button(applet, "reStart");
        //this.paddle = new Paddle(main);
        button.setPosition(100, 100);
        button.setSize(50, 60);
        button.validate();

        this.button.setOnClickListener(new ClickListener() {
            @Override
            public void onClick(int x, int y) {
                System.out.println("On Clicked");
            }
        });

        objects.add(new Ball(applet, applet.width/2, applet.height/2));
        objects.add(new Paddle(applet));

        int blockW = this.applet.width/maxBlockWCount;
        int blockH = 30;
        for(int i=0; i<maxBlockHCount; i++) {
            for(int j=0; j<maxBlockWCount; j++) {
                int px = j*blockW + blockSpace;
                int py = i*blockH + blockSpace;
                objects.add(new Block(applet, px, py, blockW-blockSpace*2, blockH-blockSpace*2));
            }
        }
    }

    void draw() {
        applet.clear();
        //ball.draw();
        //paddle.draw();
        objects.forEach(o -> o.draw());

        button.draw();
    }

    void update() {
        //ball.update();
        //paddle.update();
        //ball.onHit(paddle);
        //button.update();

        objects.forEach(o -> o.update(objects));
    }
}
