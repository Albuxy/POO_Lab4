
package lab4;

import java.util.LinkedList;
import java.awt.Graphics;


public class CircularRegion extends EllipsoidalRegion{
    
    private Point centro;
    private double radio;
    
    //Constructor
    public CircularRegion(Point c, double r) {
        super(c,r,r);
    }
    
    public double getArea(){
        double result = Math.PI * this.radio * this.radio;
        return result;
    }
}

