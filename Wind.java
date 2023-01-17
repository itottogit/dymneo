import java.math.*;
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
 * Klasse Wind.
 *
 *
 */
public class Wind extends Kraftwerk implements Serializable{


    public Wind() //Unser Konstruktor
    {
        xPosition = 80;
        yPosition = 100;
        farbe = Color.black;
        orientierung = 0;
        hoehe = 50;
      
        breite = 20;
        //tiefe  = 50;


        markiert = false;
        
        figur = gibAktuelleFigur();
    }
    
   
   
    
    
     
    
    protected Shape gibAktuelleFigur()
    {
       // einen GeneralPath definieren
        GeneralPath Windkraftanlage = new GeneralPath();
        Windkraftanlage.moveTo(0 , 0);
        Windkraftanlage.lineTo(breite, 0);
        Windkraftanlage.lineTo(breite+(breite/20+1)+5, hoehe+20);
        Windkraftanlage.lineTo(-(breite/20+1+5), hoehe+20);
        Windkraftanlage.lineTo(0 , 0);
        Windkraftanlage.moveTo(0 , (breite/10+1));
       
       
        //Das ist die Nabe 
        Ellipse2D.Double circle = new Ellipse2D.Double(-10 , -50, breite+20, hoehe);
        Windkraftanlage.append(circle, false);
        
        
        //Rotorblatt1
        Arc2D.Double circle1 = new Arc2D.Double(-60, hoehe-100, breite+30, hoehe+5, 200, 180, Arc2D.CHORD);
        Windkraftanlage.append (circle1, false);
        
        //Rotorblatt2
        Arc2D.Double circle2 = new Arc2D.Double(30, hoehe-100, breite+30, hoehe+5, 165, 180, Arc2D.CHORD);
        Windkraftanlage.append (circle2, false);
        
        //Rotorblatt 3
        Arc2D.Double circle3 = new Arc2D.Double(-8, hoehe-155, breite+30, hoehe+5, 90, 180, Arc2D.CHORD);
        Windkraftanlage.append (circle3, false);
        

         
        // transformieren:
        AffineTransform t = new AffineTransform();
        t.translate(xPosition, yPosition);
        Rectangle2D umriss = Windkraftanlage.getBounds2D();
        t.rotate(Math.toRadians(orientierung),umriss.getX()+umriss.getWidth()/2,umriss.getY()+umriss.getHeight()/2);
        return  t.createTransformedShape(Windkraftanlage);
    }


     }//erstelle Figur
     
     
      
      
    

