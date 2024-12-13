package my_project.model;


import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;


import java.awt.*;








public class Tree extends GraphicalObject {




    public Tree(double x, double y, double width, double height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;

    }










    @Override
    public void draw(DrawTool drawTool) {
        //Code für einen Baum
        //500,300,50,240
        //Stamm
        drawTool.setCurrentColor(new Color(165,42,42));
        drawTool.drawFilledRectangle(x,y,width,height);
        drawTool.setCurrentColor(Color.GREEN);
        drawTool.drawFilledCircle(x + width/2,y,width*2);
        //Baumkrone

    }












    @Override
    public void update(double dt){
        // Hier passiert momentan nichts - da muss auch anfangs nichts dran geändert werden.
    }

}