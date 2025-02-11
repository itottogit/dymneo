/**
 * Beschreiben Sie hier die Klasse Rezension.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Rezension
{
    // Instanzvariablen 
    // Eine Rezension kann jetzt auch das Gewicht und den Sterne des Einkaufs speichern.
    private String  text;
    private int     Sterne;

    /**
     * Konstruktor für Objekte der Klasse Rezension
     */
    public Rezension(String RezensionText, int RezensionSterne)
    {
        // Instanzvariable initialisieren
        text    = RezensionText;
        Sterne   = RezensionSterne;
    }

    /**
     * Auf den Sterne muss man von außen wieder zugreifen können.
     * 
     * @param  
     * @return        der gespeicherte Sterne
     */
    public int gibSterne()
    {
        // zurückgegeben wird der gespeicherte Sterne
        return Sterne;
    }
    
    /**
     * Auf den Sterne muss man von außen wieder zugreifen können.
     * 
     * @param  
     * @return        der gespeicherte Sterne
     */
    public String gibtext()
    {
        // zurückgegeben wird der gespeicherte Sterne
        return text;
    }
    

    //Getter Setter

    
    
    /**
     * Alle Werte werden ausgegeben.
     * 
     * @param         -
     * @return        -
     */
    public void zeigeInhalt()
    {
        // zurückgegeben wird die gespeicherte Information
        System.out.println(text+"   "+Sterne);
    }
}
