package blockcrush;
import java.util.ArrayList;
import java.util.List;
import java.lang.reflect.Array;

class Stage {
    final int maxBlockWCount = 10;
    final int maxBlockHCount = 4;
    final int blockSpace = 4;

    private final Main main;
    Ball ball;
    Paddle paddle;
    Score score = new Score();
    List<GameObject> objects = new ArrayList<>();

    public Stage(Main main) {
        this.main = main;
        this.ball = new Ball(main, main.width/2, main.height/2);
        //this.paddle = new Paddle(main);

        objects.add(new Ball(main, main.width/2, main.height/2));
        objects.add(new Paddle(main));

        int blockW = this.main.width/maxBlockWCount;
        int blockH = 30;
        for(int i=0; i<maxBlockHCount; i++) {
            for(int j=0; j<maxBlockWCount; j++) {
                int px = j*blockW + blockSpace;
                int py = i*blockH + blockSpace;
                objects.add(new Block(main, px, py, blockW-blockSpace*2, blockH-blockSpace*2));
            }
        }
    }

    void draw() {
        main.clear();
        //ball.draw();
        //paddle.draw();
        objects.forEach(o -> o.draw());
    }

    void update() {
        //ball.update();
        //paddle.update();
        //ball.onHit(paddle);

        objects.forEach(o -> o.update(objects));
    }
}
