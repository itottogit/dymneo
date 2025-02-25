import java.util.ArrayList;

/**
 * Eine Klasse zur Verwaltung von beliebig langen Rezensionlisten.
 * Rezensionen sind nummeriert, um durch einen Benutzer referenziert
 * werden zu können.
 * In dieser Version starten die Rezensionnummern bei 0.
 * 
 * @author InfoProfil
 * @version 2020.09.21
 */
public class Rezensionliste 
{
    // Deklaration
    // Speicher fuer eine beliebige Anzahl an Rezensionen.
    protected ArrayList<Rezension> rezensionen;

    //Hier wird jetzt Rezension statt String genutzt.
    //Dafür sind auch an anderen Stellen Änderungen notwendig.

    /**
     * Konstruktor
     * Führe die Initialisierungen durch, die für ein Rezensionliste
     * notwendig sind.
     */
    public Rezensionliste()
    {
        rezensionen = new ArrayList<Rezension>();
    }

    /**
     * Speichere eine neue Rezension in diesem Rezensionliste.
     * @param Rezension die zu speichernde Rezension.
     */
    public void speichereRezension(String RezensionText, int nSterne)
    {
        Rezension neueRezension = new Rezension(RezensionText, nSterne);
       
        rezensionen.add(neueRezension);
    }

       /**
     * Speichere eine neue Rezension in diesem Rezensionliste.
     * @param Rezension die zu speichernde Rezension.
     */
    public void speichereRezension(Rezension rez)
    {
             
        rezensionen.add(rez);
    }
    
    /**
     * @return die Anzahl der Rezensionen in diesem Rezensionliste.
     */
    public int anzahlRezensionen()
    {
        return rezensionen.size();
    }

    /**
     * Zeige eine Rezension.
     * @param Rezensionnummer die Nummer der Rezension, die gezeigt werden soll.
     */
    public void zeigeRezension(int Rezensionnummer)
    {
        if(Rezensionnummer < 0) {
            // Keine gültige Nummer, nichts zu tun.
        }
        else if(Rezensionnummer < anzahlRezensionen()) {
            // Die Nummer ist gültig, wir können die Rezension ausgeben.
            Rezension aktuelleRezension = rezensionen.get(Rezensionnummer);
            String n = "Sterne: " + aktuelleRezension.gibSterne();
            
            
            String m = "Rezension: " + aktuelleRezension.gibtext();
            //Hier fehlen noch Gewicht und Text!
            System.out.println(n);
            System.out.println(m);
            
            
        }
        else {
            // Keine gültige Nummer, nichts zu tun.
        }
    }
    
    
    /**
     * Zeige alle Rezensionen.
     */
 
    public void zeigeRezensionen()
    {
        // Umsetzung mit expliziter for-Schleife
        //     Start   Bedingung         Schrittweite i++
        for(int i = 0; i < rezensionen.size(); i = i + 1) 
        {
            zeigeRezension(i);
        }
    }


    public int gibGesamtSterne()
    {
        int gesamtSterne = 0;
        
        // Umsetzung mit for-each-Schleife
        for(Rezension aktuelleRezension : rezensionen)
        {
            gesamtSterne = gesamtSterne + aktuelleRezension.gibSterne();
        }
        
        return gesamtSterne;
    }

    
    
// Uns fehlen: Gesamtgewicht, Liste aller Items

}
