package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

import java.awt.*;

public class Busch extends GraphicalObject {

    private double r;
    public Busch(double x,double y,double r){
        this.x = x;
        this.y = y;
        this.r = r;
    }


    /**
     * Diese Methode zeichnet den die optische Repräsentation eines House-Objekts. Wird vom Framework unaufhörlich automatisch mit jedem Frame aufgerufen.
     */
    @Override
    public void draw(DrawTool drawTool) {
        drawTool.setCurrentColor(new Color(0, 0, 0));
        drawTool.drawFilledRectangle(0,0,800,800);
        drawTool.setCurrentColor(new Color(0,255,0));
        drawTool.drawFilledCircle(x,y,r);
        drawTool.drawFilledCircle(x-r,y,r*0.5);
        drawTool.drawFilledCircle(x+r,y,r*0.5);
        drawTool.setCurrentColor(new Color(255,255,255));
        drawTool.drawFilledRectangle(x-r*1.5,y,r*3,r);
    }

    /**
     * Wird mit jedem Frame vom Framework aufgerufen und dient zur Manipulation des Objekts im Verlauf
     * der Zeit.
     * @param dt die Sekunden, die seit dem letzten Aufruf von update vergangen sind
     */
    @Override
    public void update(double dt){
        // Hier passiert momentan nichts - da muss auch anfangs nichts dran geändert werden.
    }

}