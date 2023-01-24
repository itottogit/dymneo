<<<<<<< HEAD
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


    public Wind(/**String filePath*/) //Unser Konstruktor
    {
        //super(filePath);
        xPosition = 80;
        yPosition = 100;
        farbe = Color.black;
        orientierung = 0;
        hoehe = 50;
        breite = 20;
        faktorHoehe  = 1;
        faktorBreite = 1;
        markiert = false;
        
        figur = gibAktuelleFigur();
    }
    
   
   
    
    
     
    
    protected Shape gibAktuelleFigur()
    {
       // einen GeneralPath definieren
        GeneralPath windkraftanlage = new GeneralPath();
        windkraftanlage.moveTo(0 , 0);
        windkraftanlage.lineTo(breite, 0);
        windkraftanlage.lineTo(breite+(breite/20+1)+5, hoehe+20);
        windkraftanlage.lineTo(-(breite/20+1+5), hoehe+20);
        windkraftanlage.lineTo(0 , 0);
        windkraftanlage.moveTo(0 , (breite/10+1));
       
       
        //Das ist die Nabe 
        Ellipse2D.Double circle = new Ellipse2D.Double(-10 , -50, breite+20, hoehe);
        windkraftanlage.append(circle, false);
        
        
        //Rotorblatt1
        Arc2D.Double circle1 = new Arc2D.Double(-60, hoehe-100, breite+30, hoehe+5, 200, 180, Arc2D.CHORD);
        windkraftanlage.append (circle1, false);
        
        //Rotorblatt2
        Arc2D.Double circle2 = new Arc2D.Double(30, hoehe-100, breite+30, hoehe+5, 165, 180, Arc2D.CHORD);
        windkraftanlage.append (circle2, false);
        
        //Rotorblatt 3
        Arc2D.Double circle3 = new Arc2D.Double(-8, hoehe-155, breite+30, hoehe+5, 90, 180, Arc2D.CHORD);
        windkraftanlage.append (circle3, false);
        

         
        // transformieren:
        
        Shape newShape = transformiere(windkraftanlage);
        return  newShape;
        
        // AffineTransform t = new AffineTransform();
        // t.translate(xPosition, yPosition);
        // Rectangle2D umriss = windkraftanlage.getBounds2D();
        // t.rotate(Math.toRadians(orientierung),umriss.getX()+umriss.getWidth()/2,umriss.getY()+umriss.getHeight()/2);
        // return  t.createTransformedShape(windkraftanlage);
    }


     }//erstelle Figur
     
     
      
      
    

=======
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


    public Wind(String filePath) //Unser Konstruktor
    {
        super(filePath);
        xPosition = 80;
        yPosition = 100;
        farbe = Color.black;
        orientierung = 0;
        hoehe = 50;
        breite = 20;
        faktorHoehe  = 1;
        faktorBreite = 1;
        markiert = false;
        
        figur = gibAktuelleFigur();
    }
    
   
   
    
    
     
    
    protected Shape gibAktuelleFigur()
    {
       // einen GeneralPath definieren
        GeneralPath windkraftanlage = new GeneralPath();
        windkraftanlage.moveTo(0 , 0);
        windkraftanlage.lineTo(breite, 0);
        windkraftanlage.lineTo(breite+(breite/20+1)+5, hoehe+20);
        windkraftanlage.lineTo(-(breite/20+1+5), hoehe+20);
        windkraftanlage.lineTo(0 , 0);
        windkraftanlage.moveTo(0 , (breite/10+1));
       
       
        //Das ist die Nabe 
        Ellipse2D.Double circle = new Ellipse2D.Double(-10 , -50, breite+20, hoehe);
        windkraftanlage.append(circle, false);
        
        
        //Rotorblatt1
        Arc2D.Double circle1 = new Arc2D.Double(-60, hoehe-100, breite+30, hoehe+5, 200, 180, Arc2D.CHORD);
        windkraftanlage.append (circle1, false);
        
        //Rotorblatt2
        Arc2D.Double circle2 = new Arc2D.Double(30, hoehe-100, breite+30, hoehe+5, 165, 180, Arc2D.CHORD);
        windkraftanlage.append (circle2, false);
        
        //Rotorblatt 3
        Arc2D.Double circle3 = new Arc2D.Double(-8, hoehe-155, breite+30, hoehe+5, 90, 180, Arc2D.CHORD);
        windkraftanlage.append (circle3, false);
        

         
        // transformieren:
        
        Shape newShape = transformiere(windkraftanlage);
        return  newShape;
        
        // AffineTransform t = new AffineTransform();
        // t.translate(xPosition, yPosition);
        // Rectangle2D umriss = windkraftanlage.getBounds2D();
        // t.rotate(Math.toRadians(orientierung),umriss.getX()+umriss.getWidth()/2,umriss.getY()+umriss.getHeight()/2);
        // return  t.createTransformedShape(windkraftanlage);
    }


     }//erstelle Figur
     
     
      
      
    

>>>>>>> 73bc759ecb3c3daabb25a62a3430a974e68a633b
