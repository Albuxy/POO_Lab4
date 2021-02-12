
package lab4;

import java.awt.Graphics;
import java.awt.Color;


public abstract class Region extends Entity{
    
    protected Color fillColor;
    
    //Constructor
    public Region() {
    }
    
    public abstract double getArea();
    
    //Rellenar la entidad pasandole el color
    public void setFillColor(Color c){
        this.fillColor=c;
    }
    
    public abstract boolean isPointinside(Point punto);
    
}