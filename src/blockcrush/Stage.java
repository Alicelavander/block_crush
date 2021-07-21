package blockcrush;
import java.util.ArrayList;
import java.util.List;
import java.lang.reflect.Array;

class Stage {
    private final Main main;
    Ball ball;
    Paddle paddle;
    Score score = new Score();
    List<GameObject> objects = new ArrayList<>();

    public Stage(Main main) {
        this.main = main;
        //this.ball = new Ball(main);
        //this.paddle = new Paddle(main);
        objects.add(new Ball(main));
        objects.add(new Paddle(main));
        objects.add(new Block(main, 10, 10));
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
