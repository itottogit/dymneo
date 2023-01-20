import java.math.*;
import java.awt.*;
import java.io.*;
import java.awt.Shape.*;
import java.awt.geom.*;
import java.lang.Readable;
import java.awt.Graphics2D; 
import java.awt.geom.GeneralPath;
import java.awt.geom.Rectangle2D;
import java.awt.geom.AffineTransform;



/**
 * Klasse solar.
 *
 */
public class Solar extends Kraftwerk implements Serializable{


    public Solar(/**String filePath*/) //Unser Konstruktor
    {
        //super(filePath);
        xPosition = 60;
        yPosition = 50;
        farbe = Color.black;
        orientierung = 0;
        hoehe = 50;
        breite = 75;
        faktorHoehe  = 1;
        faktorBreite = 1;
        markiert = true;
        
        figur = gibAktuelleFigur();
    }
    
   
    
    
    
    
    
    protected Shape gibAktuelleFigur()
    {
       // einen GeneralPath definieren
        GeneralPath path = new GeneralPath();
        path.moveTo(0 , 0);
        path.lineTo(breite, 0);
        path.lineTo(breite+(breite/20+1), tiefe);
        path.lineTo(-(breite/20+1), tiefe);
        path.lineTo(0 , 0);
        // Das ist die Umrandung. Das Solar bekommt noch eine Lehne:
        path.moveTo(0 , (breite/10+1));
        path.lineTo(breite, (breite/10+1));    
        // transformieren:
        Shape newShape = transformiere(path);
        return  newShape;
        
        
        

     }//erstelle Figur
     
     
      
      
    
}//Klasse