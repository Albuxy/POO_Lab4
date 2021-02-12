
package lab4;

import java.util.LinkedList;
import java.awt.Graphics;


public class RectangularRegion extends PolygonalRegion {
    
    private Point punto1;
    private Point punto2;
    private Point punto3;
    private Point punto4;
    private LinkedList<Point> puntos;

    public RectangularRegion(Point punto5, Point punto6, Point punto7, Point punto8) {
        
        super();
        
        //Creamos una lista de puntos
        puntos = new LinkedList();
        
        //Los 4 puntos del rectangulo
        this.punto1 = punto5;
        this.punto2 = punto6; 
        this.punto3 = punto7;
        this.punto4 = punto8;
        
        //Añadimos los puntos para poder luego crear el rectangulo
        this.puntos.add(punto1);
        this.puntos.add(punto2);
        this.puntos.add(punto3);
        this.puntos.add(punto4);
        
        super.points = this.puntos;
    }

    public double getArea(){
        return(super.getArea());
    }

}
