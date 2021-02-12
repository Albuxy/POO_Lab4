/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

import java.util.LinkedList;
import java.awt.Graphics;

public class TriangularRegion extends PolygonalRegion {
    
    private LinkedList<Point> points;
    private Point punto1;
    private Point punto2;
    private Point punto3;
    
    //Constructor
    public TriangularRegion(Point punto4, Point punto5, Point punto6) {
        
        super();
        
        //Creamos una lista de puntos
        points = new LinkedList();
        this.punto1 = punto4;
        this.punto2 = punto5;
        this.punto3 = punto6;
        
        //Añadimos los puntos a la lsita
        points.add(this.punto1);
        points.add(this.punto2);
        points.add(this.punto3);
        
        super.points = this.points;
        
    }
    
    public double getArea(){
        return(super.getArea());
    }
}
