package blockcrush;

import processing.core.PApplet;

public class Main extends PApplet {
    Stage stage;

    @Override
    public void settings(){
        size(640, 480);
    }

    @Override
    public void setup(){
        stage = new Stage(this);
    }

    @Override
    public void draw(){
        stage.update();
        stage.draw();
    }

    public static void main (String[] args){
        PApplet.main("blockcrush.Main");

    }

}
