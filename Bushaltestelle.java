import java.awt.geom.Rectangle2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.AffineTransform;
import java.awt.*;
import java.awt.Color;
import java.awt.geom.GeneralPath;
/**
 * Beschreiben Sie hier die Klasse Buhaltestelle.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Bushaltestelle extends Haltestelle {
    public Bushaltestelle() {
        xPosition = 100;
        yPosition = 100;
        name = "Bus";
        farbe = Color.black;
        orientierung = 0;
        istSichtbar  = true;
        breite = 5;
        hoehe = 5;
        figur = gibAktuelleFigur(); 
    }
    public Bushaltestelle(String n, int x, int y){
        xPosition = x;
        yPosition = y;
        name = n;
        farbe = Color.black;
        orientierung = 0;
        istSichtbar  = true;
        breite = 10;
        hoehe = 10;
        figur = gibAktuelleFigur();  
    }
    protected Shape gibAktuelleFigur() {
        // einen GeneralPath definieren
        Shape bushaltestelle = new Ellipse2D.Double(0 , 0, breite, hoehe);
        
        // transformieren
        AffineTransform t = new AffineTransform();
        t.translate(xPosition, yPosition);
        Rectangle2D umriss = bushaltestelle.getBounds2D();
        t.rotate(Math.toRadians(orientierung),umriss.getX()+umriss.getWidth()/2,umriss.getY()+umriss.getHeight()/2);
        return  t.createTransformedShape(bushaltestelle);
    }
}
    
