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
 * Write a description of class Kohle here.
 *
 * @author Alex, Lemuel
 * @version (a version number or a date)
 */
public class Atom extends Kraftwerk implements Serializable{

    /**
     * Erzeuge einen neuen Stuhl mit einer Standardfarbe und Standardgroesse
     * an einer Standardposition. (Standardkonstruktor)
     */
    public Atom(String filePath, String bezirk) {
        super(filePath, bezirk);
        xPosition = 160;
        yPosition = 80;
        orientierung = 0;
        farbe = Color.black;
        breite = 80;
        hoehe  = 80;
        faktorHoehe  = 0.3f;
        faktorBreite = 0.3f;
        markiert = false;
   
    }
    
    /**
     * Berechnet das zu zeichnende Shape anhand der gegebenen Daten
     */
    protected Shape gibAktuelleFigur() {
        GeneralPath atom = new GeneralPath();
        atom.moveTo(0, 0);
        
        //groeßter Kreis
        Ellipse2D.Double circle = new Ellipse2D.Double(0+10 ,hoehe+80, breite,hoehe);
        atom.append(circle,false);
        
        //großer Kreis        
        Ellipse2D.Double circle3 = new Ellipse2D.Double(0+11.2 ,hoehe+81.2, breite-2.5,hoehe-2.5);
        atom.append(circle3,false);
        
        //kleinster Kreis
        Ellipse2D.Double circle2 = new Ellipse2D.Double(0+43 ,hoehe+111.5, breite-65,hoehe-65);
        atom.append(circle2,false);
        
        //Line unten-links
        Line2D.Double line1 = new Line2D.Double(32, 233.5, 44, 210);
        atom.append(line1,false);
        
        //Linie mitte-links
        Line2D.Double line2 = new Line2D.Double(15, 195, 39, 196.5);
        atom.append(line2,false);
        
        //Linie oben-links
        Line2D.Double line3 = new Line2D.Double(34, 166, 45, 188);
        atom.append(line3,false);
        
        //Linie oben-rechts
        Line2D.Double line4 = new Line2D.Double(66, 166, 57, 188);
        atom.append(line4, false);
        
        //Linie mitte-rechts
        Line2D.Double line5 = new Line2D.Double(86, 198, 64, 200);
        atom.append(line5, false);
        
        //Linie unten-rechts
        Line2D.Double line6 = new Line2D.Double(63, 233.5, 58, 210);
        atom.append(line6, false);
        
        //kurze Linie unten
        Line2D.Double line7 = new Line2D.Double(44, 210, 57.5, 210);
        atom.append(line7,false);
        
        //kurze Linie rechts
        Line2D.Double line8 = new Line2D.Double(57, 188, 64, 200);
        atom.append(line8,false);
        
        //kurze Linie links
        Line2D.Double line9 = new Line2D.Double(39, 196.5, 45, 188);
        atom.append(line9,false);
        
        
        /**QuadCurve2D.Double curve1 = new QuadCurve2D.Double();
        atom.append(curve1, false);
        */

        
        AffineTransform t = new AffineTransform();
        t.translate(xPosition, yPosition);
        Rectangle2D umriss = atom.getBounds2D();
        
        t.rotate(Math.toRadians(orientierung),umriss.getX()+umriss.getWidth()/2,umriss.getY()+umriss.getHeight()/2);
        Shape newShape = transformiere(atom);
        return  newShape;
         
    }
}