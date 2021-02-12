
package lab4;

import java.util.LinkedList;

public class Point {
    
    protected int x;
    protected int y;

    //Constructor
    public Point (int x1, int x2){
       this.x = x1;
       this.y = x2 ;
    }
    
    //Getters 
    public int getX (){
         return this.x;     
    }
     public int getY (){
         return this.y;
    }
     
    //Funcion que movera los poligonos, cambiando su posicion, por la posicion actual mas la suma de los parametros que se pasan 
    public void translate(int xi, int yi){
        this.x = this.x + xi;
        this.y = this.y + yi;
    
    }
    
    //Funcion que nos permitira calcular la diferencia de los puntos
    public Vector diferencia(Point punto){

        int resultado1 = punto.x - this.x;
        int resultado2 = punto.y - this.y;
        return new Vector(resultado1,resultado2);
    }

}

