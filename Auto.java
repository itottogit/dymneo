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
public class Auto extends Fahrzeug
{

    /**
     * Erzeuge ein neues Auto mit einer Standardfarbe und Standardgroesse
     * an einer Standardposition. (Standardkonstruktor)
     */
    public Auto() {
        xPosition = 180;
        yPosition = 40;
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
        GeneralPath stuhl = new GeneralPath();
        stuhl.moveTo(0 , 0);
        stuhl.lineTo(breite, 0);
        stuhl.lineTo(breite+(breite/10+50), hoehe);
        stuhl.lineTo(-(breite/10 +50), hoehe);
        stuhl.lineTo(0 , 0);
        
        Ellipse2D rad = new Ellipse2D.Double (-40, 40, breite/2, hoehe/2);
        stuhl.append(rad, false);

        
        Ellipse2D radchen = new Ellipse2D.Double (60, 40, breite/2, hoehe/2);
        stuhl.append(radchen, false);
        
        
        // transformieren:
        AffineTransform t = new AffineTransform();
        t.translate(xPosition, yPosition);
        Rectangle2D umrisss = stuhl.getBounds2D();
        t.rotate(Math.toRadians(orientierung),umrisss.getX()+umrisss.getWidth()/2,umrisss.getY()+umrisss.getHeight()/2);
        return  t.createTransformedShape(stuhl);
        // keine Ahnung:
                // transfohhdsjrmieren
        // AffineTransform s = new AffineTransform();
        // s.translate(xPosition, yPosition);
        // Rectangle2D umriss = Rad.getBounds2D();
        // s.rotate(Math.toRadians(orientierung),umriss.getX()+umriss.getWidth()/2,umriss.getY()+umriss.getHeight()/2);
        // return  s.createTransformedShape(Rad);
    }
}