
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
public class Fahrad extends Fahrzeug
{

    /**
     * Erzeuge ein neues Cybertruck mit einer Standardfarbe und Standardgroesse
     * an einer Standardposition. (Standardkonstruktor)
     */
    public Fahrad() {
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
       // Einen GeneralPath für das Fahrrad definieren
GeneralPath Fahrrad = new GeneralPath();

// Zwei Räder (Kreise) zeichnen
Fahrrad.append(new Ellipse2D.Double(-50, 150, 40, 40), false); // Linkes Rad
Fahrrad.append(new Ellipse2D.Double(10, 150, 40, 40), false);  // Rechtes Rad

// Rahmen zeichnen (Linien)
Fahrrad.moveTo(-50 + 20, 150 + 20);  // Startpunkt des Rahmens (linker Rad)
Fahrrad.lineTo(10 + 20, 150 + 20);   // Zur Mitte des Rahmens (Rechtsrad)
Fahrrad.lineTo(0, 100);              // Verbindungspunkt zum Sattel
Fahrrad.lineTo(-50 + 20, 150 + 20);  // Rückkehr zur linken Radachse (Rahmen)

Fahrrad.moveTo(10 + 20, 150 + 20);   // Punkt des rechten Rads
Fahrrad.lineTo(0, 100);              // Verbindung mit dem Sattel

// Sattel und Lenker zeichnen
Fahrrad.moveTo(0, 100);              // Verbindungspunkt des Rahmens
Fahrrad.lineTo(0, 70);               // Vertikale Linie für den Sattel
Fahrrad.moveTo(0, 70);               // Sattelpunkt
Fahrrad.lineTo(30, 70);              // Lenker (obere Linie)

// Jetzt eine Transformation anwenden
AffineTransform t = new AffineTransform();
t.translate(xPosition, yPosition); // Position des Fahrrads setzen
Rectangle2D umriss = Fahrrad.getBounds2D();
t.rotate(Math.toRadians(orientierung), umriss.getX() + umriss.getWidth() / 2, umriss.getY() + umriss.getHeight() / 2);

return t.createTransformedShape(Fahrrad);
    }
}