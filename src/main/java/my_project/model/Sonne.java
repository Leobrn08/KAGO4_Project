package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

import java.awt.*;
public class Sonne extends GraphicalObject {
    private double r;

    public Sonne(double x, double y, double r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }

    @Override
    public void draw(DrawTool drawTool) {

        drawTool.setCurrentColor(Color.YELLOW);
        drawTool.drawFilledCircle(x, y, r);

    }

    @Override
    public void update(double dt) {
        x = (-x) + 10 * dt;
        if (x > 1000 - r) {
            x = -r * 4;
            y = (Math.random());


        }


    }
}