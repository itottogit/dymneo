import java.util.ArrayList;
import java.util.Iterator;
import java.io.*;
import java.awt.*;
import java.lang.StringBuffer;
import java.lang.String;


public class Elementverwaltung
{
    private Controller controller;
    private ArrayList  verwaltungsListeElemente;
    public  FileWriter fw;

    
    public Elementverwaltung(Controller controller) 
    {
        verwaltungsListeElemente = new ArrayList<Element>();
        this.controller = controller;
    }
    
    public void neuesElement(String typ)
    {
        System.out.println("Neues Element ("+typ+") wird erstellt.");
               
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

        controller.updateView();
    }

    public void zeichnen()
    {   
//     for (Iterator i = figuren.iterator(); i.hasNext();)
    {
        //if(figurZuShape.get(i.next()) != null)
       // {
//         ((ShapeMitFarbe) figurZuShape.get(i.next())).draw(graphic);
       // }
    }   
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

    
    
    
  
    public boolean markiereElemente(Point p)
    {
     //nur wie?
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

    
