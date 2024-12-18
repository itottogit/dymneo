import java.awt.Color;

/**
 * Abstrakte Klasse Fahrzeug - beschreiben Sie hier die Klasse
 * 
 * @author (Ihr Name)
 * @version (eine Version-Nummer oder ein Datum)
 */
public abstract class Fahrzeug extends Element
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    protected Color farbe;
    private boolean status;

    /**
     * 
     * 
     * Ein Beispiel einer Methode - ersetzen Sie diesen Kommentar mit Ihrem eigenen
     * 
     * @param  y    ein Beispielparameter für eine Methode
     * @return        die Summe aus x und y
     */
    
    public Fahrzeug()
    {
        // initialise instance variables
        status = true;
    }

    /**
     * Status setzen 
     *
     * @param  neuerStatus  
     * @return -
     */
    public void setzeStatus(boolean neuerStatus)
    {
        status = neuerStatus;
    }
    
    public void markiertFarbe(String farbe){
        if(markiert=true){
            farbe  = "rot"; 
        }
        else{
            farbe = "schwarz"; 
        }
    }
}
