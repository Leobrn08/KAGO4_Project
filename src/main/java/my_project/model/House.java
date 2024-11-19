package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

import java.awt.*;

/**
 * Repräsentiert ein Haus. Der Teil mit "extends" wird später erklärt und jetzt ignoriert - oder wurde schon erklärt.
 */
public class House extends GraphicalObject {

    /**
     * Erzeugt ein neues Objekt der Klasse House
     */
    public House(double x, double y, double width, double height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;

        // Hier passiert momentan nichts - da muss auch anfangs nichts dran geändert werden.
    }


    /**
     * Diese Methode zeichnet den die optische Repräsentation eines House-Objekts. Wird vom Framework unaufhörlich automatisch mit jedem Frame aufgerufen.
     */
    @Override
    public void draw(DrawTool drawTool) {
        drawTool.setCurrentColor(Color.DARK_GRAY);
        // 150, 300, 200, 240
        drawTool.drawFilledRectangle(x,y,200,240);
        //Haus
        drawTool.setCurrentColor(Color.BLACK);
        drawTool.drawFilledRectangle(x + 125,y + 160,50,80);
        //Tür
        drawTool.setCurrentColor(Color.LIGHT_GRAY);
        drawTool.drawFilledRectangle(x + 25,y + 25,40,40);
        drawTool.setCurrentColor(Color.BLACK);
        drawTool.drawRectangle(x + 25,y + 25,20,20);
        drawTool.drawRectangle(x + 45,y + 25,20,20);
        drawTool.drawRectangle(x + 25,y + 45,20,20);
        drawTool.drawRectangle(x + 45,y + 45,20,20);
        drawTool.setCurrentColor(Color.BLACK);
        drawTool.drawRectangle(x+ 75,y + 25,40,40);

        drawTool.setCurrentColor(Color.LIGHT_GRAY);
        drawTool.drawFilledRectangle(x + 75,y + 25,40,40);
        drawTool.setCurrentColor(Color.BLACK);
        drawTool.drawRectangle(x + 75,y + 25,20,20);
        drawTool.drawRectangle(x + 95,y + 25,20,20);
        drawTool.drawRectangle(x + 75,y + 45,20,20);
        drawTool.drawRectangle(x + 95,y + 45,20,20);

        drawTool.setCurrentColor(Color.RED);
        drawTool.drawFilledTriangle(x,y,x + 100,y -100,x + 200,y);
        drawTool.setCurrentColor(Color.black);
        drawTool.drawTriangle(x,y,x + 100,y - 100,x + 200,y);


        drawTool.setCurrentColor(Color.yellow);
        drawTool.drawFilledCircle(x + 135,y + 200,3);
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
