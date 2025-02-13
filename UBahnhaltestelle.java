import java.awt.geom.Rectangle2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.AffineTransform;
import java.awt.*;
import java.awt.Color;
import java.awt.geom.GeneralPath;
/**
 * Beschreiben Sie hier die Klasse UBahnhaltestelle.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class UBahnhaltestelle extends Haltestelle {
    public UBahnhaltestelle(){
        xPosition = 100;
        yPosition = 100;
        name = "U-Bahn";
        farbe = Color.black;
        orientierung = 0;
        istSichtbar  = true;
        breite = 15;
        hoehe = 15;
        figur = gibAktuelleFigur();
    }
    public UBahnhaltestelle(String n, int x, int y){
        xPosition = x;
        yPosition = y;
        name = n;
        farbe = Color.black;
        orientierung = 0;
        istSichtbar  = true;
        breite = 15;
        hoehe = 15;
        figur = gibAktuelleFigur(); 
    }
    protected Shape gibAktuelleFigur() {
        // einen GeneralPath definieren
        GeneralPath shape = new GeneralPath();
        GeneralPath uBahnhaltestelle = new GeneralPath();
        Rectangle2D rahmen = new Rectangle2D.Double(0, 0, breite, hoehe);
        uBahnhaltestelle.append(rahmen, false);
        
        AffineTransform t = new AffineTransform();
        
        Rectangle2D umriss = uBahnhaltestelle.getBounds2D();
        t.translate(xPosition, yPosition);
        t.rotate(Math.toRadians(orientierung),umriss.getX()+umriss.getWidth()/2,umriss.getY()+umriss.getHeight()/2);
        return  t.createTransformedShape(uBahnhaltestelle);
    }
}
    
