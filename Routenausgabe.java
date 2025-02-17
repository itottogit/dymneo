import java.util.ArrayList;
/**
 * Beschreiben Sie hier die Klasse CopyOfRoutenausgabe.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Routenausgabe
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private ArrayList<Ort> orte;
    private CanvasFrame canvas;
    private String name;
    /**
     * Konstruktor für Objekte der Klasse CopyOfRoutenausgabe
     */
    public Routenausgabe()
    {
        // Instanzvariable initialisieren
        orte = new ArrayList<>();
        initialisiereOrte();
    }
    public void initialisiereOrte() {
        
        String[] ortsNamen= {
         "Hamburg Hauptbahnhof",
         "Reeperbahn",
         "Hamburger Hafen",
         "Elbphilharmonie", 
        };
        for (String name: ortsNamen) {
            orte.add(new Ort (name));
            System.out.println("Initializiere");
            
            
        }
    }
        
    

    public Ort findeOrt (String name)
    {
      for (Ort ort: orte) {
          if (ort.getName()==(name)) {
          return ort;
          }
      }
    
      {
      return null;
    }
      
    
    }
    /**
     * Ein Beispiel einer Methode - ersetzen Sie diesen Kommentar mit Ihrem eigenen
     * 
     * @param  y    ein Beispielparameter für eine Methode
     * @return        die Summe aus x und y
     */
    public String getName()
    {
        // tragen Sie hier den Code ein
        return name;
    }
    public void findeRoute(String startname, String zielname){
        Ort startOrt= findeOrt(startname);
        Ort zielOrt= findeOrt(zielname);
        for (Ort ort :orte) {
        if (startOrt == null && zielOrt == null) {
           System.out.println("Ort[e] nicht gefunden");
           return;
         }
         else if (ort.getName().equals(startname) && ort.getName().equals(zielname))
         {
         
         System.out.println("Route von " + startOrt.getName() + " nach " + zielOrt.getName() + " :");
         } else if
    
          
        
        
             (!ort.getName().equals(startname) && !ort.getName().equals(zielname)){
                 System.out.println("Route von " + startOrt.getName() + " nach " + zielOrt.getName() + " :");
                 System.out.println("- Zwischenstops : " + ort.getName());
                 
            }
        }
        {
            System.out.println("Ziel erreicht :" + zielOrt.getName());
        }
    
     }
    
    public static void Routenausgabe(String[] args) 
    {
        Routenausgabe routenausgabe = new Routenausgabe();
        routenausgabe.findeRoute("Hamburg Hauptbahnhof", "Reeperbahn");
        
    
    }
}
