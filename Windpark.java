
/**
 * Diese Klasse ermöglicht es, einen Umriss von Windpark zu erstellen.
 * 
 * @author  Torsten Otto 
 * @version 1.0
 */
public class Windpark extends Wind
{
    // Deklaration der Instanz-Variablen
    // Windpark besteht symbolisch aus drei Anlagen.
    
    public Wind anlage1;
    public Wind anlage2;
    public Wind anlage3;
    
    protected int xPosition;
    protected int yPosition;
    protected int orientierung;
    protected String farbe;
    protected boolean istSichtbar;
    protected int breite;
    protected int tiefe;
    /**
     * Konstruktor für einen Umriss von Windpark
     */
    public Windpark(String filePath)
    {
        super(filePath);
        // initialise instance variables
        //anlage1 = new Wind(" ");
        //anlage2 = new Wind();
       // anlage3 = new Wind();
        
        anlage2.skaliere(0.5f,0.5f);
        anlage3.skaliere(0.5f,0.5f);
        
        anlage2.verschiebeElement(1,(int)(breite/2));
        anlage2.verschiebeElement(3,(int)(tiefe/2));
        
        anlage3.verschiebeElement(2,(int)(breite/2));
        anlage3.verschiebeElement(4,(int)(tiefe/2));
    }

    /**
     * Alle Anlagen werden gezeichnet.
     * 
     * @param      --
     * @return     void
     */
    public void zeige()
    {
    //anlage1.zeige();
    //anlage2.zeige();        
    //anlage3.zeige();       
    }

    /**
     * Alle Anlagen werden gelöscht.
     * 
     * @param      --
     * @return     void
     */
    public void verberge()
    {
        //anlage1.verberge();
        //anlage2.verberge();        
        //anlage3.verberge();       
    }    
    
    
}
