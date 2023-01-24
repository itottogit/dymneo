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
    public  FileWriter fw;
    private Arrays details;
    private File txt;
    private Kraftwerk kw;

    public Elementverwaltung(Controller controller) 
    {
        verwaltungsListeElemente = new ArrayList<Element>();
        this.controller = controller;
    }
<<<<<<< HEAD

    public static String detailsLesen() {
        StringBuilder sb = new StringBuilder();
        try {
=======
    
    public String detailsLesen() {
    StringBuilder sb = new StringBuilder();
    try {
        
      DetailFenster fenster = new DetailFenster();
      
      // Öffne die Datei zum Lesen
      BufferedReader reader = new BufferedReader(new FileReader(kw.getStringPath()));
>>>>>>> 73bc759ecb3c3daabb25a62a3430a974e68a633b

            DetailFenster fenster = new DetailFenster();

            // Öffne die Datei zum Lesen
            BufferedReader reader = new BufferedReader(new FileReader("kraftwerkDetails.txt"));

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
<<<<<<< HEAD

        if (typ == "Wind"){
            Wind wind = new Wind();
            this.verwaltungsListeElementeEintragen(wind);
        }  

        if (typ == "Solar"){
            Solar solar= new Solar();
            this.verwaltungsListeElementeEintragen(solar);
        }  

        if (typ == "Windpark"){
            Windpark windpark= new Windpark();
            this.verwaltungsListeElementeEintragen(windpark);
        }  

        if (typ == "Wasser"){
            Wasser wasser= new Wasser();
            this.verwaltungsListeElementeEintragen(wasser);
        }  
=======
               
          if (typ == "Wind"){
              Wind wind = new Wind("kraftwerkDetails.txt");
              this.verwaltungsListeElementeEintragen(wind);
         }  
          
         if (typ == "Solar"){
              Solar solar= new Solar("kraftwerkDetails.txt");
              this.verwaltungsListeElementeEintragen(solar);
         }  
          
         if (typ == "Windpark"){
              Windpark windpark= new Windpark("kraftwerkDetails.txt");
              this.verwaltungsListeElementeEintragen(windpark);
         }  
          
         if (typ == "Wasser"){
              Wasser wasser= new Wasser("kraftwerkDetails.txt");
              this.verwaltungsListeElementeEintragen(wasser);
         }  
>>>>>>> 73bc759ecb3c3daabb25a62a3430a974e68a633b

        controller.updateView();
    }

    public void verwaltungsListeElementeEintragen(Element element)
    {
        verwaltungsListeElemente.add(element);        
    }

    public void speichern()
    {
        System.out.println("Man müsste mal was programmieren, damit man seine Einrichtungen auch speichern kann...");
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

        boolean gefunden= false;    
        for (Iterator i = verwaltungsListeElemente.iterator(); i.hasNext();)
        { 
            Element element = (Element) i.next();
            Shape aktuelleFigur = element.gibAktuelleFigur();
            if((aktuelleFigur.contains(p)) && (element instanceof Kraftwerk))
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
        if(gefunden==false){
            for (Iterator i = verwaltungsListeElemente.iterator(); i.hasNext();)
            { 
                Element element = (Element) i.next();
                Shape aktuelleFigur = element.gibAktuelleFigur();
                if((aktuelleFigur.contains(p)) && (element instanceof Bezirk) && (!(element instanceof Kraftwerk)) )
                {
                    element.farbe = Color.red ;
                    element.markiert = true; 
                    System.out.println("true");  
                }
            }
        }
        return(true); 
    }

    // public boolean markiereElement(Point2D p){
    // for (Iterator i = verwaltungsListeElemente.iterator(); i.hasNext();)
    // { 
    // Element element = (Element) i.next();
    // Shape aktuelleFigur = element.gibAktuelleFigur();
    // if((aktuelleFigur.contains(p)) && (element instanceof Bezirk))
    // {
    // element.farbe = Color.red ;
    // element.markiert = true; 
    // System.out.println("true"); 
    // }

    // // if((aktuelleFigur.contains(p)) && (element instanceof Bezirk))
    // // {
    // //element.farbe = Color.red ;
    // //element.markiert = true; 
    // //System.out.println("true");  
    // // }

    // else  {

    // element.farbe = Color.black;
    // element.markiert = false; 
    // System.out.println("false"); 
    // }     

    // }
    // return(true);
    // }

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
        for (Iterator i = verwaltungsListeElemente.iterator(); i.hasNext();)
        {
            Element element = (Element) i.next();

            if(element.markiert)
            {
                element.verschiebeElement(4,20);
                element.figur = element.gibAktuelleFigur();
            }       

        }
    } 

    public void verschiebeMarkierteElementeNachOben()
    {
        for (Iterator i = verwaltungsListeElemente.iterator(); i.hasNext();)
        {
            Element element = (Element) i.next();

            if(element.markiert)
            {
                element.verschiebeElement(1,20);
                element.figur = element.gibAktuelleFigur();
            }       

        }
    } 

    public void verschiebeMarkierteElementeNachUnten()
    {
        for (Iterator i = verwaltungsListeElemente.iterator(); i.hasNext();)
        {
            Element element = (Element) i.next();

            if(element.markiert)
            {
                element.verschiebeElement(2,20);
                element.figur = element.gibAktuelleFigur();
            }       

        }
    } 

    public ArrayList getElementList()
    {
        return verwaltungsListeElemente;    
    }
}

