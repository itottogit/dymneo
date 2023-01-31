import java.awt.*;
import java.io.*;
import java.awt.Shape.*;
import java.awt.geom.*;
import java.lang.Readable;
import java.awt.Graphics2D; 

import java.awt.Shape;
import java.awt.geom.AffineTransform;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.GeneralPath;
import java.awt.geom.Arc2D;
import java.awt.geom.CubicCurve2D;


/**
 * Klasse solar.
 *
 */
public class Kohle extends Kraftwerk implements Serializable{


    public Kohle(String filePath) {
        super(filePath);
        xPosition = 200;
    
        yPosition = 200;
        orientierung = 0;
        faktorHoehe  = 0.5f;
        faktorBreite = 0.5f;
        markiert =false;
        breite = 50;
        hoehe  = 15;
        figur = gibAktuelleFigur();
    }

    
   
    
    
    
    
    
       protected Shape gibAktuelleFigur() {
        //Figur eines Kohlewagens von Hiba, Anna
        // einen GeneralPath definieren
        GeneralPath Kohle = new GeneralPath();
        //Das ist der Wagen
        Kohle.moveTo(0 , 0);
        Kohle.lineTo(breite, 0);
        Kohle.lineTo(breite+(breite/20+1)+5, hoehe+20);
        Kohle.lineTo(-(breite/20+1+5), hoehe+20);
        Kohle.lineTo(0 , 0);
            Kohle.moveTo(0 , (breite/10+1));
        Kohle.lineTo(breite, (breite/10+1));
        orientierung = 180;
        //Das sind die Räder
        Ellipse2D.Double circle = new Ellipse2D.Double(0, hoehe-25, breite-40, hoehe-5);
        Kohle.append(circle, false);
        Ellipse2D.Double circle2 = new Ellipse2D.Double(0+40, hoehe-25, breite-40, hoehe-5);
        Kohle.append(circle2, false);
        // Das ist die Kohle im Wagen  
        Arc2D.Double circle3 = new Arc2D.Double(0-7, hoehe+10, breite+15, hoehe+8, 180, 180, Arc2D.OPEN);
        Kohle.append (circle3, false);// transformieren:
        AffineTransform t = new AffineTransform();
        t.translate(xPosition, yPosition);
        Rectangle2D umriss = Kohle.getBounds2D();
        t.rotate(Math.toRadians(orientierung),umriss.getX()+umriss.getWidth()/2,umriss.getY()+umriss.getHeight()/2);
         Shape newShape = transformiere(Kohle);
        return  newShape;
    }

 
     
      
      
    
}//Klasse