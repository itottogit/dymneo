
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


    public Wasser(String filePath, String bezirk) //Unser Konstruktor
    {
        super(filePath, bezirk);
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
        GeneralPath wasser = new GeneralPath();
        
        Shape arc1 = new Arc2D.Float(xPosition, yPosition-10, breite+60, tiefe+100, 190, 160, Arc2D.OPEN);
        wasser.append(arc1,true);
        
        wasser.moveTo(xPosition+1, yPosition+48);
        wasser.lineTo(yPosition-60, xPosition+50);
        
        wasser.moveTo(xPosition+89, yPosition+48);
        wasser.lineTo(yPosition-60, xPosition+50);
        
        // transformieren:
        Shape newShape = transformiere(wasser);
        return  newShape;

     }//erstelle Figur
     
     
      
      
    
}//Klasse
