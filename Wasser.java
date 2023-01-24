
import java.math.*;
import java.awt.*;
import java.io.*;
import java.awt.Shape.*;
import java.awt.geom.*;
import java.lang.Readable;
import java.awt.Graphics2D; 

/**
 * Klasse Wind.
 *
 *
 */
public class Wasser extends Kraftwerk implements Serializable{


    public Wasser(/**String filePath*/) //Unser Konstruktor
    {
        //super(filePath);
        xPosition = 70;
        yPosition = 30;
        farbe = Color.black;
        orientierung = 0;
        hoehe  = 50;
        breite = 30;
        markiert = false;
        faktorHoehe  = 1;
        faktorBreite = 1;
        figur = gibAktuelleFigur();
    }
    
   
   
    
    
     
    
    protected Shape gibAktuelleFigur()
    {
          // einen GeneralPath definieren
        GeneralPath shape = new GeneralPath();
        shape.moveTo(0 , 0);
        shape.lineTo(breite, 0);
        shape.lineTo(breite+(breite/20+1), tiefe);
        shape.lineTo(-(breite/20+1), tiefe);
        shape.lineTo(0 , 0);
        // Das ist die Umrandung. Das Wasser bekommt noch eine Lehne:
        shape.moveTo(0 , (breite/10+1));
        shape.lineTo(breite, (breite/10+1));    
        // transformieren:
        Shape newShape = transformiere(shape);
        return  newShape;
        

     }//erstelle Figur
     
     
      
      
    
}//Klasse
