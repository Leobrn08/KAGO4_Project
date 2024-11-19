package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

import java.awt.*;
public class Cloud extends GraphicalObject {

    public Cloud(){

    }

    @Override
    public void draw(DrawTool drawTool) {

        drawTool.setCurrentColor(new Color(65, 58, 58));
        drawTool.drawCircle(100,50,40);
        drawTool.drawCircle(140,80,40);
        drawTool.drawCircle(160,30,40);
        drawTool.drawCircle(180,60,40);
        drawTool.drawCircle(200,80,40);
        drawTool.drawCircle(220,50,40);

        drawTool.drawCircle(350,50,40);
        drawTool.drawCircle(390,80,40);
        drawTool.drawCircle(410,30,40);
        drawTool.drawCircle(430,60,40);
        drawTool.drawCircle(450,80,40);
        drawTool.drawCircle(470,50,40);

        drawTool.drawCircle(600,50,40);
        drawTool.drawCircle(640,80,40);
        drawTool.drawCircle(660,30,40);
        drawTool.drawCircle(680,60,40);
        drawTool.drawCircle(700,80,40);
        drawTool.drawCircle(720,50,40);

        drawTool.setCurrentColor(Color.lightGray);
        drawTool.drawFilledCircle(100,50,40);
        drawTool.drawFilledCircle(140,80,40);
        drawTool.drawFilledCircle(160,30,40);
        drawTool.drawFilledCircle(180,60,40);
        drawTool.drawFilledCircle(200,80,40);
        drawTool.drawFilledCircle(220,50,40);

        drawTool.drawFilledCircle(350,50,40);
        drawTool.drawFilledCircle(390,80,40);
        drawTool.drawFilledCircle(410,30,40);
        drawTool.drawFilledCircle(430,60,40);
        drawTool.drawFilledCircle(450,80,40);
        drawTool.drawFilledCircle(470,50,40);

        drawTool.drawFilledCircle(600,50,40);
        drawTool.drawFilledCircle(640,80,40);
        drawTool.drawFilledCircle(660,30,40);
        drawTool.drawFilledCircle(680,60,40);
        drawTool.drawFilledCircle(700,80,40);
        drawTool.drawFilledCircle(720,50,40);



    }
    @Override
    public void update(double dt){

    }
}