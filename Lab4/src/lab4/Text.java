
package lab4;

import java.util.LinkedList;
import java.awt.Graphics;


public class Text extends Entity {
    
    private Point punto;
    private String text;

    //Constructot
    public Text(Point punto1, String texto){
        this.punto = punto1;
        this.text = texto;
    }
    
    //Funcion que nos dibujara el texto
    public void draw(Graphics g){
        g.setColor(super.lineColor);
        g.drawString(text, (int)punto.x, (int)punto.y);
    }
    
    //Funcion que nos movera el texto
    public void translate(Vector vector){
        
        punto.x += vector.x;
        punto.y += vector.y;

    }
    
    public boolean IsSelected(Point punto){
        return true;
    }
    public boolean IsPointClose(Point punto){
        return true;
    }
    

}

