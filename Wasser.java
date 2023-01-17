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


    public Wasser() //Unser Konstruktor
    {
        xPosition = 70;
        yPosition = 30;
        farbe = Color.black;
        orientierung = 0;
        hoehe = 50;
        breite = 30;
        markiert = false;
        
        figur = gibAktuelleFigur();
    }
    
   
   
    
    
     
    
    protected Shape gibAktuelleFigur()
    {
          // einen GeneralPath definieren
        GeneralPath stuhl = new GeneralPath();
        stuhl.moveTo(0 , 0);
        stuhl.lineTo(breite, 0);
        stuhl.lineTo(breite+(breite/20+1), tiefe);
        stuhl.lineTo(-(breite/20+1), tiefe);
        stuhl.lineTo(0 , 0);
        // Das ist die Umrandung. Das Wasser bekommt noch eine Lehne:
        stuhl.moveTo(0 , (breite/10+1));
        stuhl.lineTo(breite, (breite/10+1));    
        // transformieren:
        AffineTransform t = new AffineTransform();
        t.translate(xPosition, yPosition);
        Rectangle2D umriss = stuhl.getBounds2D();
        t.rotate(Math.toRadians(orientierung),umriss.getX()+umriss.getWidth()/2,umriss.getY()+umriss.getHeight()/2);
        return  t.createTransformedShape(stuhl);
        

     }//erstelle Figur
     
     
      
      
    
}//Klasse

