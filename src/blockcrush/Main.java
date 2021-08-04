package blockcrush;

import blockcrush.ui.Button;
import blockcrush.ui.ClickListener;
import processing.core.PApplet;
import processing.event.MouseEvent;

public class Main extends PApplet {
    Stage stage;
    StartStage startStage;
    public boolean startGame = false;

    @Override
    public void settings(){
        size(640, 480);
    }

    @Override
    public void setup(){
        stage = new Stage(this);
        startStage = new StartStage(this);
    }

    @Override
    public void draw(){
        if(startGame){
            stage.update();
            stage.draw();
        }else{
            startStage.draw();
        }
    }

    public static void main (String[] args){
        PApplet.main("blockcrush.Main");
    }
}
