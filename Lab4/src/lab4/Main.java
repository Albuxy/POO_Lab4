
package lab4;

import java.util.LinkedList;
import java.awt.Graphics;
import java.awt.Color;


public class Main {
    public static void main(String args[]){
        
        //Creamos "entidades" que sera de la clase "EntityDrawer" para luego poder guardar los pligonos
        EntityDrawer entidades = new EntityDrawer();
        
        
        //TEXTO
        Point punto_texto = new Point (265,25);     
        //Creación del texto        
        Entity entidad_texto = new Text(punto_texto, "ENTIDADES");
        entidad_texto.setLineColor(Color.black);
        entidades.addDrawable(entidad_texto);
        
        
        //LINEA
        Point punto1_linea= new Point (300,100);
        Point punto2_linea= new Point (300,300);
        //Creación de la linea
        Entity entidad_linea = new Line(punto1_linea,punto2_linea);
        entidad_linea.setLineColor(Color.red);
        entidades.addDrawable(entidad_linea);

        
        //CIRCULO
        Point punto1_circulo= new Point (75,75);
        //Redio del circulo
        double radio= 125;
        //Creacion del circulo
        Entity entidad_circulo = new CircularRegion(punto1_circulo,radio);
        entidad_circulo.setLineColor(Color.blue);
            if(entidad_circulo instanceof Region){
                Region circ = (Region) entidad_circulo;
                circ.fillColor = Color.yellow;
                entidades.addDrawable(entidad_circulo);
            }
            
                
        //RECTANGULO 1
        Point punto1_rectang1 = new Point (50,250);
        Point punto2_rectang1 = new Point (50,350);
        Point punto3_rectang1 = new Point (250,350);
        Point punto4_rectang1 = new Point (250,250);
        //Creacion del rectangulo 1
        Entity entidad_rectang1 = new RectangularRegion(punto1_rectang1, punto2_rectang1,punto3_rectang1,punto4_rectang1);
        entidad_rectang1.setLineColor(Color.black);
            if(entidad_rectang1 instanceof Region){
                Region rec = (Region) entidad_rectang1;
                rec.fillColor = Color.white;
                entidades.addDrawable(entidad_rectang1);
            }
        
            
        //RECTANGULO 2
        Point punto1_rectang2 = new Point (350,250);
        Point punto2_rectang2 = new Point (350,350);
        Point punto3_rectang2 = new Point (550,350);
        Point punto4_rectang2 = new Point (550,250);  
        //Creacion del rectangulo 2
        Entity entidad_rectang2 = new RectangularRegion(punto1_rectang2, punto2_rectang2, punto3_rectang2, punto4_rectang2);
        entidad_rectang2.setLineColor(Color.black);
            if(entidad_rectang2 instanceof Region){
                Region rec = (Region) entidad_rectang2;
                rec.fillColor = Color.cyan;
                entidades.addDrawable(entidad_rectang2);
            }
            
            
        //TRIANGULO
        Point punto1_triang = new Point (400,150);
        Point punto2_triang = new Point (450,50);
        Point punto3_triang = new Point (500,150);
        //Creacion triangulo
        Entity entidad_triangulo = new TriangularRegion(punto1_triang,punto2_triang,punto3_triang);
        entidad_triangulo.setLineColor(Color.black);
            if(entidad_triangulo instanceof Region){
                Region triangle = (Region) entidad_triangulo;
                triangle.fillColor = Color.magenta;
                entidades.addDrawable(entidad_triangulo);
            }

    }
}
