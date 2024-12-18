 import java.util.ArrayList;
import java.util.Iterator;
import java.io.*;
import java.awt.*;
import java.lang.StringBuffer;
import java.lang.String;
import java.util.Arrays;
import java.awt.geom.Point2D; 

public class Elementverwaltung
{
    private Controller controller;
    private ArrayList<Element> verwaltungsListeElemente;
    private ArrayList<Fahrzeug> fahrzeugListe;
    public  FileWriter fw;
    private Arrays details;
    private File txt;


    public Elementverwaltung(Controller controller) 
    {
        verwaltungsListeElemente = new ArrayList<Element>();
        fahrzeugListe = new ArrayList<Fahrzeug>();
        this.controller = controller;
    }
   

    public String detailsLesen() {
    StringBuilder sb = new StringBuilder();
    try {

    DetailFenster fenster = new DetailFenster();
      
      // Öffne die Datei zum Lesen
     
            // Öffne die Datei zum Lesen
            BufferedReader reader = new BufferedReader(new FileReader("FahrzeugDetails.txt"));

            // Lese die erste Zeile
            String line = reader.readLine();

            // Solange es noch weitere Zeilen gibt, lies sie
            while (line != null) {
                // Verarbeite die aktuelle Zeile (z.B. füge sie dem StringBuilder hinzu)
                sb.append(line).append("\n");

                fenster.detailHinzufügen(line);

                // Lese die nächste Zeile
                line = reader.readLine();
            }

            // Schließe den Reader
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Gib den gelesenen Text zurück
        return sb.toString();
    }

    public void neuesElement(String typ)
    {
        System.out.println("Neues Element ("+typ+") wird erstellt.");

        if (typ == "Auto"){
            Auto auto = new Auto();
            this.verwaltungsListeElementeEintragen(auto);
        }  

        if (typ == "Fahrrad"){
             }  

        if (typ == "Bus"){
        }  

        if (typ == "Fähre"){
        }  

        controller.updateView();

    }

    public void verwaltungsListeElementeEintragen(Element element)
    {
        verwaltungsListeElemente.add(element);
    }
    
    public void fahrzeugListeElementEintragen(Fahrzeug fahrzeug)
    {
        fahrzeugListe.add(fahrzeug);
    }

    public void speichern()
    {
        System.out.println("Man müsste mal was programmieren, damit man seine Fahrzeuge auch speichern kann...");
    } 

    /**
     * Diese Methode wird vom Testbutton ausgeführt.
     * 
     * @param  
     * @return      
     */   

    public void testMethode()
    {
        System.out.println("Testmethode aufgerufen");

        for (Element aktuelles : verwaltungsListeElemente)
        {
            //if (aktuelles instanceof BMitte)
            {
                //aktuelles.drehe(90);
                //aktuelles.verschiebeElement(4,20);
                aktuelles.skaliere(1.5f,1.5f);
                aktuelles.figur = aktuelles.gibAktuelleFigur();
            }
        }
    }

    /**
     * löscht die save.txt datei und führt erneut speichern() aus
     * @param antwort | bestätigen mit antwort "ja"
     */    
    public void ueberschreiben()
    {
        //bei Gelegenheit zu implementieren
    }

    /**
     * lädt das Projekt
     */      

    public void laden()
    {  
        System.out.println("AUFRUF LADEN");

    }//laden

    public boolean markiereElemente(Point2D p)
    {

        boolean gefunden=false;    
        
        //Hier einmal ein Beispiel für eine for-Schleife mit Iterator
        for (Iterator i = verwaltungsListeElemente.iterator(); i.hasNext();)
        { 
            Element element = (Element) i.next();
            Shape aktuelleFigur = element.gibAktuelleFigur();
            if((aktuelleFigur.contains(p)) && (element instanceof Fahrzeug))
            {

                element.farbe = Color.red ;
                element.markiert = true; 
                System.out.println("true"); 
                gefunden = true; 
            }

            else  {
                element.farbe = Color.black;
                element.markiert = false; 
                System.out.println("false"); 
            }     

        }
        if(!gefunden) //oder if(gefunden==false)
        {
            for (Element element: verwaltungsListeElemente) //hier als for each
            { 

                Shape aktuelleFigur = element.gibAktuelleFigur();
                if((aktuelleFigur.contains(p)) && (element instanceof Bezirk) && (!(element instanceof Fahrzeug)) )
                {
                    element.farbe = Color.green;
                    element.markiert = true; 
                    System.out.println("true");  
                }
            }
        }
        return(true); 
    }

    
    public void verschiebeMarkierteElementeNachRechts()
    {
        for (Iterator i = verwaltungsListeElemente.iterator(); i.hasNext();)
        {
            Element element = (Element) i.next();

            if(element.markiert)
            {
                element.verschiebeElement(3,20);
                element.figur = element.gibAktuelleFigur();
            }       

        }
    } 
    
 


    public void verschiebeMarkierteElementeNachLinks()
    {
   
    } 

    public void verschiebeMarkierteElementeNachOben()
    {
    
    } 

    public void verschiebeMarkierteElementeNachUnten()
    {
    
    } 

 
    public ArrayList getElementList()
    {
        return verwaltungsListeElemente;    
    }
    
  
}

