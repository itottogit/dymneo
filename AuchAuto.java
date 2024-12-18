import java.awt.geom.GeneralPath;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.AffineTransform;
import java.awt.*;

/**
 * Ein Auto, das manipuliert werden kann und sich selbst auf einer Leinwand zeichnet.
 * 
 * @author  Torsten Otto
 * @version 10/2022
 */
public class AuchAuto extends Fahrzeug
{

    /**
     * Erzeuge ein neues Cybertruck mit einer Standardfarbe und Standardgroesse
     * an einer Standardposition. (Standardkonstruktor)
     */
    public AuchAuto() {
        xPosition = 600;
        yPosition = 80;
        farbe = Color.black;
        orientierung = 0;
        istSichtbar = true;
        breite = 40;
        hoehe  = 40;
        faktorHoehe  = 1;
        faktorBreite = 1;
        
        figur = gibAktuelleFigur();
    }
    
    /**
     * Berechnet das zu zeichnende Shape anhand der gegebenen Daten
     * [ Zum Anzeigen der Attributwerte ueber Inspect muss hier die Sichtbarkeit 
     *  auf public gesetzt werden. ]
     */
    protected Shape gibAktuelleFigur() {
        // einen GeneralPath definieren
GeneralPath auto = new GeneralPath();
       auto.moveTo(0,0);
       auto.lineTo(breite,0);
       auto.lineTo(breite*1.5,-1*hoehe);
       auto.lineTo(breite*3,-1*hoehe);
       auto.lineTo(breite*3.5,0);
       auto.lineTo(breite*4.5,0);
       auto.lineTo(breite*4.5,hoehe);
       auto.lineTo(breite*3.5,hoehe);
       
       //provisorische Lösung bis Ellipse2D implementiert werden kann.
       double centerx1=breite*3;
       double centery1=hoehe;
       double centerx2=breite*1.3;
       double centery2=centery1;
       for(int i=0;i<361; i++){
           auto.lineTo(centerx1 + breite* 0.4375* Math.cos(i), centery1 + hoehe*0.4375 * Math.sin(i));
       }
       auto.moveTo(breite*2.625,hoehe);
       auto.lineTo(breite*1.875,hoehe);
   
       for(int i=0;i<361; i++){
           auto.lineTo(centerx2 + breite* 0.4375* Math.cos(i), centery2 + hoehe*0.4375 * Math.sin(i));
       }
       auto.moveTo(breite,hoehe);
       auto.lineTo(0,hoehe);
       auto.lineTo(0,0);
       AffineTransform t = new AffineTransform();
       t.translate(xPosition, yPosition);
       Rectangle2D umriss = auto.getBounds2D();

t.rotate(Math.toRadians(orientierung),umriss.getX()+umriss.getWidth()/2,umriss.getY()+umriss.getHeight()/2);
       return  t.createTransformedShape(auto);

    }
}
