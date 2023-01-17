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


    public Solar() //Unser Konstruktor
    {
        xPosition = 60;
        yPosition = 50;
        farbe = Color.black;
        orientierung = 0;
        hoehe = 50;
        breite = 75;
        
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
        AffineTransform t = new AffineTransform();
        t.translate(xPosition, yPosition);
        Rectangle2D umriss = path.getBounds2D();
        t.rotate(Math.toRadians(orientierung),umriss.getX()+umriss.getWidth()/2,umriss.getY()+umriss.getHeight()/2);
        return  t.createTransformedShape(path);
        
        
        

     }//erstelle Figur
     
     
      
      
    
}//Klasse