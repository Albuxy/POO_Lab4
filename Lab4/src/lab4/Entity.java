
package lab4;

import java.awt.*;
import java.util.LinkedList;
import java.awt.Graphics;

abstract class Entity {
    
    protected Color lineColor;
    protected double alpha;

    //Constructor
    public Entity() {
    }
    
    //Getter para coger el color de la linea
    public Color getLineColor() {
        return lineColor;
    }
    
    //Setter para establecer el color de la linea
    public void setLineColor(Color lineColor) {
        this.lineColor = lineColor;
    }
    public void rotate(double a){
    }
    
    abstract public void draw(java.awt.Graphics g);
    abstract public void translate(Vector vector);
    abstract public boolean IsSelected(Point punto);
    

    
}
