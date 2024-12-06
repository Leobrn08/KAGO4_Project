package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

import java.awt.*;
public class Cloud extends GraphicalObject {
    private double r;

    public Cloud(double x, double y, double r){
        this.x = x;
        this.y = y;
        this.r = r;
    }

    @Override
    public void draw(DrawTool drawTool) {

        drawTool.setCurrentColor(new Color(65, 58, 58));
        drawTool.drawCircle(x,y,r);
        drawTool.drawCircle(x+r,y+r*0.75,r);
        drawTool.drawCircle(x+r*0.5,y-r*0.5,r);
        drawTool.drawCircle(x+r*2,y+r*0.25,r);
        drawTool.drawCircle(x+r*2.5,y+r*0.75,r);
        drawTool.drawCircle(x+r*3,y,r);
        /**
         drawTool.drawCircle(100,50,40);
         drawTool.drawCircle(140,80,40);
         drawTool.drawCircle(160,30,40);
         drawTool.drawCircle(180,60,40);
         drawTool.drawCircle(200,80,40);
         drawTool.drawCircle(220,50,40);
         */

        drawTool.setCurrentColor(Color.lightGray);
        drawTool.drawFilledCircle(x,y,r);
        drawTool.drawFilledCircle(x+r,y+r*0.75,r);
        drawTool.drawFilledCircle(x+r*0.5,y-r*0.5,r);
        drawTool.drawFilledCircle(x+r*2,y+r*0.25,r);
        drawTool.drawFilledCircle(x+r*2.5,y+r*0.75,r);
        drawTool.drawFilledCircle(x+r*3,y,r);


    }
    @Override
    public void update(double dt){
        x = x + 200*dt;
        if (x > 800-r){
            x = -r * 6;
            y = (Math.random());
        }
    }
}