
package lab4;

import java.util.LinkedList;
import java.awt.Graphics;
import java.awt.Color;

public class EllipsoidalRegion extends Region{
    
    //Datos de una region elipsoide
    private Point centro;
    private double radio1;
    private double radio2;
    
    //Constructor 
    public EllipsoidalRegion(Point centro1, double radio3, double radio4){
        
        this.centro=centro1;
        this.radio1=radio3;
        this.radio2=radio4;
        
    } 
    
    public double getArea() {
        double result = Math.PI * this.radio1 * this.radio2;
        return result;
    }
    
    //Funcion que nos dibujara la region elipsoidal
    public void draw (Graphics g){
        
        g.setColor(super.lineColor);
        g.drawOval((int) centro.x, (int) centro.y,(int) radio1,(int) radio2);
        g.setColor(super.fillColor);
        g.fillOval((int) this.centro.x , (int) this.centro.y , (int) this.radio1, (int) this.radio2);

    }
    
    //Funcion que nos determina si un punto esta dentro de una region
    public boolean isPointinside (Point punto){
        
        double base1 = punto.x - this.centro.x;
        double base2 = punto.y - this.centro.y;
        
        double result = Math.pow(base1,2)/Math.pow(this.radio1, 2) + Math.pow(base2,2)/Math.pow(this.radio2, 2);
        
        if (result <=1){
            
            return true;
            
        } else {
            
            return false;
        }
    
    }

    //Nos permitira mover la entidad
    public void translate(Vector vector){
        
        centro.x = centro.x + vector.x;
        centro.y = centro.y + vector.y;
        
    }

    public boolean IsSelected(Point punto) {
        return true;
    }
}


