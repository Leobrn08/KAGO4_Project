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
    public House(){
        // Hier passiert momentan nichts - da muss auch anfangs nichts dran geändert werden.
    }


    /**
     * Diese Methode zeichnet den die optische Repräsentation eines House-Objekts. Wird vom Framework unaufhörlich automatisch mit jedem Frame aufgerufen.
     */
    @Override
    public void draw(DrawTool drawTool) {
        drawTool.setCurrentColor(Color.DARK_GRAY);
        drawTool.drawFilledRectangle(150,300,200,240);
        //Haus
        drawTool.setCurrentColor(Color.BLACK);
        drawTool.drawFilledRectangle(275,460,50,80);
        //Tür
        drawTool.setCurrentColor(Color.LIGHT_GRAY);
        drawTool.drawFilledRectangle(175,325,40,40);
        drawTool.setCurrentColor(Color.BLACK);
        drawTool.drawRectangle(175,325,20,20);
        drawTool.drawRectangle(195,325,20,20);
        drawTool.drawRectangle(175,345,20,20);
        drawTool.drawRectangle(175,345,20,20);
        drawTool.setCurrentColor(Color.BLACK);
        drawTool.drawRectangle(225,325,40,40);

        drawTool.setCurrentColor(Color.LIGHT_GRAY);
        drawTool.drawFilledRectangle(225,325,40,40);
        drawTool.setCurrentColor(Color.BLACK);
        drawTool.drawRectangle(225,325,20,20);
        drawTool.drawRectangle(245,325,20,20);
        drawTool.drawRectangle(225,345,20,20);
        drawTool.drawRectangle(245,345,20,20);

        drawTool.setCurrentColor(Color.RED);
        drawTool.drawFilledTriangle(150,300,250,200,350,300);
        drawTool.setCurrentColor(Color.black);
        drawTool.drawTriangle(150,300,250,200,350,300);


        drawTool.setCurrentColor(Color.yellow);
        drawTool.drawFilledCircle(285,500,3);
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
