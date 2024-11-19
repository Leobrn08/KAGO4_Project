package my_project.model;


import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;


import java.awt.*;








public class Tree extends GraphicalObject {




    public Tree(){

    }










    @Override
    public void draw(DrawTool drawTool) {
        //Code für einen Baum

        drawTool.setCurrentColor(new Color(165,42,42));
        drawTool.drawFilledRectangle(500,300,50,240);
        //Stamm
        drawTool.setCurrentColor(Color.GREEN);
        drawTool.drawFilledCircle(525,300,50);
        //Tür

    }












    @Override
    public void update(double dt){
        // Hier passiert momentan nichts - da muss auch anfangs nichts dran geändert werden.
    }

}