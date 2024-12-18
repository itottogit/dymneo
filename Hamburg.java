
/**
 * Diese Klasse ermöglicht es, einen Umriss von Hamburg zu erstellen.
 * 
 * @author  Torsten Otto 
 * @version 1.0
 */
public class Hamburg
{
    // Deklaration der Instanz-Variablen
    // Hamburg besteht aus den Bezirken Mitte, Nord, Eimsbüttel, Altona, Harburg, Bergedorf und Wandsbek.
    
    private BMitte mitte;
    private BNord nord;
    private BEimsbuettel eimsbuettel;
    private BAltona altona;
    private BHarburg harburg;
    private BBergedorf bergedorf;
    private BWandsbek wandsbek;
    
 
    
    
    /**
     * Konstruktor für einen Umriss von Hamburg
     */
    public Hamburg()
    {
        // initialise instance variables
        
        mitte = new BMitte();  nord = new BNord();
        eimsbuettel = new BEimsbuettel();
        altona = new BAltona();
        harburg = new BHarburg();
        bergedorf = new BBergedorf();
        wandsbek = new BWandsbek();
        

    }

    public Hamburg(Elementverwaltung ev)
    {
        mitte = new BMitte(); ev.verwaltungsListeElementeEintragen(mitte);
        nord = new BNord(); ev.verwaltungsListeElementeEintragen(nord);
        eimsbuettel = new BEimsbuettel(); ev.verwaltungsListeElementeEintragen(eimsbuettel);
        altona = new BAltona(); ev.verwaltungsListeElementeEintragen(altona);
        harburg = new BHarburg(); ev.verwaltungsListeElementeEintragen(harburg);
        bergedorf = new BBergedorf(); ev.verwaltungsListeElementeEintragen(bergedorf);
        wandsbek = new BWandsbek(); ev.verwaltungsListeElementeEintragen(wandsbek);
    
     
    }
    
    
}
