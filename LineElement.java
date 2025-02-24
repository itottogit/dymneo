import java.awt.Shape;
import java.awt.geom.*;

/**
 * Beschreiben Sie hier die Klasse LineElement.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class LineElement extends Element
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private Line2D line;
    
    /**
     * Konstruktor für Objekte der Klasse LineElement
     */
    public LineElement(int x1, int y1, int x2, int y2)
    {
        // Instanzvariable initialisieren
        this.xPosition = x1;
        this.yPosition = y1;
        this.line = new Line2D.Double(x1, y1, x2, y2);
        this.figur = line;
        
        
        
        
        
    }


    
        protected Shape gibAktuelleFigur() {
        return this.line;
    }
}
