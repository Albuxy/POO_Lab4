
package lab4;

import java.util.LinkedList;
import java.awt.Graphics;
import java.awt.Color;

public class Line extends Entity{
    
    private Point punto1;
    private Point punto2;

    //Constructor
    public Line(Point punto3, Point punto4) {
        this.punto1 = punto3;
        this.punto2 = punto4;
    }

    //Funcion que nos dibujara la linea
    public void draw(Graphics g) {
        g.setColor(lineColor);
        g.drawLine((int)punto1.x,(int) punto1.y, (int)punto2.x,(int) punto2.y);

    }

    public boolean IsSelected(Point punto) {
        return true;
    }
    public boolean IsPointClose(Point punto) {
        return true;
    }
    
    //Funcion que nos permitira mover la linea
    public void translate(Vector vector) {
        punto1.x = punto1.x + vector.x;
        punto1.y = punto1.y + vector.y;
        punto2.x = punto2.x + vector.x;
        punto2.y = punto2.y + vector.y;

    }
}


