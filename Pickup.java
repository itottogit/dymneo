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
public class Pickup extends Fahrzeug
{

    /**
     * Erzeuge ein neues Cybertruck mit einer Standardfarbe und Standardgroesse
     * an einer Standardposition. (Standardkonstruktor)
     */
    public Pickup() {
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
             GeneralPath pickup = new GeneralPath();
        
        
        double wheel1x = 0;
        double wheel1y = 87.5;
        double diameter = 25;
        
        double wheel2x = 100;
        double wheel2y = 87.5;
        
        pickup.moveTo(-25, 100);
        pickup.lineTo(0,100);
        pickup.moveTo(25,100);
        
        
        Shape Wheel1= new Ellipse2D.Double(wheel1x, wheel1y, diameter, diameter);
        pickup.append(Wheel1, false);
        
        pickup.lineTo(100, 100);
        
        
        Shape Wheel2= new Ellipse2D.Double(wheel2x, wheel2y, diameter, diameter);
        pickup.append(Wheel2, false);
        pickup.closePath();

        pickup.moveTo(125, 100);
        pickup.lineTo(150,100);
        pickup.lineTo(150, 80);
        pickup.lineTo(80, 60);
        pickup.lineTo(20, 60);
        pickup.lineTo(20, 80);
        pickup.lineTo(-25, 80);
        pickup.lineTo(-25, 100);
        
        
        
        
        
       
        AffineTransform t = new AffineTransform();
        t.translate(xPosition, yPosition);
        Rectangle2D umriss = pickup.getBounds2D();
        t.rotate(Math.toRadians(orientierung), umriss.getX() + umriss.getWidth() / 2, umriss.getY() + umriss.getHeight() / 2);
        return t.createTransformedShape(pickup);
    }
}