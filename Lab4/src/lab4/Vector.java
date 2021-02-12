
package lab4;

import java.util.LinkedList;
import java.awt.Graphics;

public class Vector extends Point{
    
    //Constructor
    public Vector(int xi, int yi) {
        super (xi,yi);
    }
    
    //Funcion que nos permetira calcular el producto vectorial
    
    public double CrossProduct(Vector vector){
        
        //Formula del producto vectorial= u × v = uxvy − uyvx 
        double result = vector.x * super.y - vector.y * super.x;
        
        return result;       
    }
    
}

