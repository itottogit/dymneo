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
public class Fähre extends Fahrzeug
{

    /**
     * Erzeuge ein neues Cybertruck mit einer Standardfarbe und Standardgroesse
     * an einer Standardposition. (Standardkonstruktor)
     */
    public Fähre() {
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
        GeneralPath Schiff = new GeneralPath();
Schiff.moveTo(-50, 120); // Start, linke Seite des Schiffsrumpfes
Schiff.lineTo(50, 120);  // Rechte Seite des Schiffsrumpfes (Boden)
Schiff.lineTo(70, 100);  // Spitze des Schiffsrumpfes (vorderer Bereich)
Schiff.lineTo(-70, 100); // Hinterer Bereich des Schiffsrumpfes
Schiff.closePath();      // Schließt den Rumpf des Schiffs

// Mast zeichnen (eine Linie)
Schiff.moveTo(0, 100);   // Startposition des Masts
Schiff.lineTo(0, 50);    // Endposition des Masts (höher)


// Segel zeichnen (einfaches Dreieck)
Schiff.moveTo(0, 50);    // Startposition des Segels
Schiff.lineTo(40, 70);   // Rechter Punkt des Segels
Schiff.lineTo(0, 90);    // Linker Punkt des Segels
Schiff.closePath();      // Schließt das Segel

// Jetzt können wir die Transformation anwenden
AffineTransform t = new AffineTransform();
t.translate(xPosition, yPosition); // Position des Schiffs setzen
Rectangle2D umriss = Schiff.getBounds2D();
t.rotate(Math.toRadians(orientierung), umriss.getX() + umriss.getWidth() / 2, umriss.getY() + umriss.getHeight() / 2);

return t.createTransformedShape(Schiff);
    }
}
