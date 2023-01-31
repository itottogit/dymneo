
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
    private Wind wind;
    private Wind wind1;
    private Wind wind2;
    private Wind wind3;
    private Kohle kohle;
    private Solar solar;
    private Solar solar1;
    private Solar solar2;
    private Kohle kohle2;
    private Atom atom;
    private Wasser wasser;

    
    
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
        wind = new Wind("kraftwerkDetails.txt");
        wind1 = new Wind("kraftwerkDetails.txt");
        wind2 = new Wind("kraftwerkDetails.txt");
        wind3 = new Wind("kraftwerkDetails.txt");
        kohle = new Kohle("kraftwerkDetails.txt");
        kohle2 = new Kohle("kraftwerkDetails.txt");
        solar = new Solar("kraftwerkDetails.txt");
        solar1 = new Solar("kraftwerkDetails.txt");
        solar2 = new Solar("kraftwerkDetails.txt");
        atom = new Atom("kraftwerkDetails.txt");
        wasser = new Wasser("kraftwerkDetails.txt");
       
        
    }

    public Hamburg(Elementverwaltung ev)
    {
        mitte = new BMitte(); ev.verwaltungsListeElementeEintragen(mitte);
        nord = new BNord(); ev.verwaltungsListeElementeEintragen(nord);
        
        wind = new Wind(); ev.verwaltungsListeElementeEintragen(wind);
        wind.bewegeHorizontal(325);
        wind.bewegeVertikal(425);
        
        wind1 = new Wind(); ev.verwaltungsListeElementeEintragen(wind1);
        wind1.bewegeHorizontal(575);
        wind1.bewegeVertikal(450);
        
        wind2 = new Wind(); ev.verwaltungsListeElementeEintragen(wind2);
        wind2.bewegeHorizontal(366);
        wind2.bewegeVertikal(342);
        
        wind3 = new Wind(); ev.verwaltungsListeElementeEintragen(wind3);
        wind3.bewegeHorizontal(385);
        wind3.bewegeVertikal(355);
        
        kohle = new Kohle(); ev.verwaltungsListeElementeEintragen(kohle);
        kohle.bewegeHorizontal(465);
        kohle.bewegeVertikal(400);
        
        kohle2 = new Kohle(); ev.verwaltungsListeElementeEintragen(kohle2);
        kohle2.bewegeHorizontal(100);
        kohle2.bewegeVertikal(240);
        
        solar = new Solar(); ev.verwaltungsListeElementeEintragen(solar);
        solar.bewegeHorizontal(370);
        solar.bewegeVertikal(300);
        
        solar1 = new Solar(); ev.verwaltungsListeElementeEintragen(solar1);
        solar1.bewegeHorizontal(385);
        solar1.bewegeVertikal(285);
        
        solar2 = new Solar(); ev.verwaltungsListeElementeEintragen(solar2);
        solar2.bewegeHorizontal(390);
        solar2.bewegeVertikal(365);
        
        atom = new Atom(); ev.verwaltungsListeElementeEintragen(atom);
        atom.bewegeHorizontal(500);
        atom.bewegeVertikal(200);
        
        wasser = new Wasser(); ev.verwaltungsListeElementeEintragen(wasser);
        wasser.bewegeHorizontal(200);
        wasser.bewegeVertikal(300);
       

        eimsbuettel = new BEimsbuettel(); ev.verwaltungsListeElementeEintragen(eimsbuettel);
        altona = new BAltona(); ev.verwaltungsListeElementeEintragen(altona);
        harburg = new BHarburg(); ev.verwaltungsListeElementeEintragen(harburg);
        bergedorf = new BBergedorf(); ev.verwaltungsListeElementeEintragen(bergedorf);
        wandsbek = new BWandsbek(); ev.verwaltungsListeElementeEintragen(wandsbek);
    }
    
    
}
