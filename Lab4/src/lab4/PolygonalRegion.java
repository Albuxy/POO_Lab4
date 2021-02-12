
package lab4;

import java.util.LinkedList;
import java.awt.Graphics;
import java.awt.Color;

public  class PolygonalRegion extends Region {
    
    LinkedList<Point> points;
    
    //Construcgor
    public PolygonalRegion() {
    }
    
    
    // <editor-fold defaultstate="collapsed" desc="getArea">
    public double getArea(){
        
        double max_size=this.points.size();
        double Area1 = 0;
        double Area2 = 0;
        
        //Calculará el Area1, sumando cada vez la multiplicacion entre el punto "x" de un poligono por el punto "y" del siguiente poligono 
        for (int i = 0; i < max_size-1 ; i++) {
            
            Area1 = Area1 + (this.points.get(i).getX() * this.points.get(i+1).getY());            
            
        }
        
        //Calculará el Area2, sumando cada vez la multiplicacion entre el punto "x" de un poligono por el punto "y" del anterior poligono 
        for (int i = 0; i < max_size-1 ; i++) {
            
            Area2 = Area2 + (this.points.get(i).getY() * this.points.get(i+1).getX());            
            
        }
        
        //Sumara los puntos finales de cada uno de las areas
        Area1 = Area1 + (this.points.get(this.points.size()-1).getX() * this.points.get(0).getY());
        Area2 = Area2 + (this.points.get(this.points.size()-1).getY() * this.points.get(0).getX());
        
        //Devolvera la area total
        return -(Area1-Area2)/2;

    }
    // </editor-fold>
    
    //Funcion que nos dibujará los poligonos
    public void draw(Graphics g){
        
        int[] puntosx = new int[points.size()];
        int[] puntosy = new int[points.size()];
        g.setColor(super.lineColor);
        for (int i = 0; i < this.points.size(); i++) {
            if (i == this.points.size() - 1) {
                g.drawLine((int) this.points.get(i).x, (int) this.points.get(i).y, (int) this.points.get(0).x, (int) this.points.get(0).y);
                puntosx[i] = (int) this.points.get(i).x;
                puntosy[i] = (int) this.points.get(i).y;
            } else {
                g.drawLine((int) this.points.get(i).x, (int) this.points.get(i).y, (int) this.points.get(i + 1).x, (int) this.points.get(i + 1).y);

                puntosx[i] = (int) this.points.get(i).x;
                puntosy[i] = (int) this.points.get(i).y;
            }
        }
        //Nos rellenará del color que le pasemos
        g.setColor(super.fillColor);
        g.fillPolygon(puntosx, puntosy, points.size());

    }
    
    //Función que nos permetira mover los rectangulos
    public void translate(Vector vector){
        
        int tamaño= points.size();
        
        for (int i = 0; i < tamaño; i++) {
             points.get(i).x = points.get(i).x + vector.x;
             points.get(i).y = points.get(i).y + vector.y;
        }
        
    }

    public boolean IsSelected (Point punto){
        
        return true;
    }

    public boolean isPointinside (Point punto){
        
        //Inicializamos los puntos a nulo
        Point punto1 = null;
        Point punto2 = null;
        Point point;

        double resultado;
        
        for(int i=0; i<this.points.size(); i++){
            if(i== this.points.size()-1){
                point= this.points.getFirst();
            }else{
                point= this.points.get(i+1);
            }
            
            punto1= this.points.get(i).diferencia(point);
            punto1= this.points.get(i).diferencia(punto);
            
            Vector vector1= new Vector (punto1.x, punto2.y);
            Vector vector2= new Vector (punto2.x, punto1.y);
            
            resultado = vector1.CrossProduct(vector2);

        }
        
        return true;
    }



}
