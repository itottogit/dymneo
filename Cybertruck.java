import java.awt.geom.GeneralPath;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.AffineTransform;
import java.awt.*;

/**
 * Ein Cybertruck, das manipuliert werden kann und sich selbst auf einer Leinwand zeichnet.
 * 
 * @author  Torsten Otto
 * @version 10/2022
 */
public class Cybertruck extends Fahrzeug
{

    /**
     * Erzeuge ein neues Cybertruck mit einer Standardfarbe und Standardgroesse
     * an einer Standardposition. (Standardkonstruktor)
     * :):):)
     */
    public Cybertruck() {
        xPosition = 80;
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
        GeneralPath Cybertruck = new GeneralPath();
        Cybertruck.moveTo(-10 , 120); // Start
        Cybertruck.lineTo(150, 120); // "Boden"
        Cybertruck.moveTo(190,120); // Lücke für Wheel 2
        Cybertruck.lineTo(200,115); // "Stoßstange"
        Cybertruck.lineTo(200,95); // Vordere Seite (hier rechts)
        Cybertruck.lineTo(80,60); // Windschutzscheibe
        Cybertruck.lineTo(-65,80); // Kofferraum (oder wie man das nennt)
        Cybertruck.lineTo(-62.5,115); // Hintere Seite (hier links)
        Cybertruck.lineTo(-50,120); // "Stoßstange" für hinten 
        // Hier werden die Räder gezeichnet, für die einfachheit sind diese seperat:
        int wheel1x = 150;
        int wheel1y = 100;
        int diameter = 40;
        Shape Wheel1= new Ellipse2D.Double(wheel1x, wheel1y, diameter, diameter);
        Cybertruck.append(Wheel1, false);
        int wheel2x = -50;
        int wheel2y = 100;
        Shape Wheel2= new Ellipse2D.Double(wheel2x, wheel2y, diameter, diameter);
        Cybertruck.append(Wheel2, false);
        
    
        // transformieren:
        AffineTransform t = new AffineTransform();
        t.translate(xPosition, yPosition);
        Rectangle2D umriss = Cybertruck.getBounds2D();
        t.rotate(Math.toRadians(orientierung),umriss.getX()+umriss.getWidth()/2,umriss.getY()+umriss.getHeight()/2);
        return  t.createTransformedShape(Cybertruck);
    }
}
