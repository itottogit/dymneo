
import java.awt.*;
import java.awt.geom.*;
import java.awt.geom.AffineTransform;
import java.io.*;
import java.util.Scanner;
import java.lang.Math.*;

/**
 * Klasse Element
 * Oberklasse Element, gibt alles, was die einzelnen Gegenstände, z. B. Möbel brauchen
 * Liefert Variablen die fuer die Moebel benoetigt werden
 * Bietet zudem alle Funktionen, die jedes Moebelstueck hat
 */

public abstract class Element implements Serializable{
    protected int xPosition;
    protected int yPosition;
    protected int orientierung;
    protected Color farbe;
    protected boolean istSichtbar;
    protected int breite;
    protected int hoehe;
    protected boolean markiert;
    protected Shape figur;
    

    /* Diese Klasse hat bewusst keinen Konstruktor.
     * Dieser haette auch gar keinen "Sinn" bzw. eine tiefere Bedeutung,
     * zumal die einzelnen Moebelstuecke beim Erstellen Werte zuweisen.
     */

    
    /**
     * Folgende Funktion ist gegeben, damit die Klasse mit den Figuren
     * der Unterklassen kommunizieren kann, sie also übernehmen kann
     */
    
    protected abstract Shape gibAktuelleFigur();
    
    /**
     * Funktion zur Rotation der Figur
     * Figur stammt aus einer der Unterklassen
     * Die eigentliche Funktion für den Nutzer ist eine andere
     */
    
    public Shape transformiere(Shape shape){
        AffineTransform t = new AffineTransform();
        t.translate(xPosition, yPosition);
        Rectangle2D randung = shape.getBounds2D();
        t.rotate(Math.toRadians(orientierung),randung.getX()+randung.getWidth()/2,randung.getY()+randung.getHeight()/2);
        return  t.createTransformedShape(shape);
    }
    
    /**
     * Funktion zur Rotaton der Figur.
     * Erh�lt einen neuen orientierung. Dieser ersetzt. Dann wird die Methode zeichneElement aufgerufen.
     * @param neugrad     Grad der Rotation
     */
    
    public void drehe(int neugrad) {
        
        orientierung = neugrad;
        hoehe= Math.round(hoehe*1.05f);
        zeichneElement();
    }
    
    /**
     * Funktion, die die Hoehe und Breite eines Objekts aendert
     * und es dann neu zeichnet
     * @param neueHoehe     Gewuenschte Hoehe
     * @param neueBreite    Gewuenschte Breite
     */
    public void hoeheBreite(int neueHoehe, int neueBreite)
    {
        hoehe = neueHoehe;
        breite = neueBreite;
        zeichneElement();
    }
    
    /**
     * Eigentliche Zeichenfunktion, die das Moebelstueck erstellt.
     * Sie dient dem Nutzer zum Ausfuehren und greift natuerlich auf die zeigende
     * Leinwand zu.
     * Eine Figur vom Typ Shape wird erstellt und erhalteNeueFigur wird aufgerufen.
     * Anschliessend wird diese neue Figur gezeichnet.
     */
    
    public void zeichneElement()
    {
        //   
    }
    
    
    /**
     * Funktion, die unsere Moebel bewegt.
     * Zur Uebersichtlichkeit werden hier Scanner benutzt, damit der Nutzer die Funktionen besser versteht.
     * In anderen Funktionen wird mit Parameteruebergaben gearbeitet, doch da wird auch maximal ein Parameter abgefragt.
     */
    
    public void verschiebeElement() 
    {
        
        Scanner nutzer =  new Scanner(System.in);
        System.out.println("---------------------------------------------");
       
        System.out.print("Die Richtung (1) hoch, (2) runter, (3) rechts, (4) links :");
        int userRichtung = nutzer.nextInt();
        nutzer.nextLine();
        System.out.println("\n Die Distanz:");
        int userWeite = nutzer.nextInt();
        nutzer.nextLine();
        verschiebeElement(userRichtung, userWeite);
    }
    
    /**
     * Ruft eine Leinwandfunktion auf, die die Moebel loeoescht
     */
    
public void entferneElement()
    {
//         Leinwand leinwand=Leinwand.gibLeinwand();
//         leinwand.entferne(this);
    }
    

    
    /**
     * Erhaelt die Eingaben von verschiebe_moebel
     * und aendert entsprechend die x- und y-Position.
     * Anschließend werden die Moebel neu gezeichnet.
     * 
     * 
     */
public void verschiebeElement(int richtung, int weite)
    {
        if(richtung == 1)//hoch
        {   
            yPosition -= weite;
        }
        else if(richtung == 2)//runter
        {
            yPosition += weite;
        }
        else if(richtung == 3)//rechts
        {
            xPosition += weite;
        }
        else if(richtung == 4)//links
        {
            xPosition -= weite;
        }
        else
        {
            System.err.print("Fehlerhafte Eingabe des Nutzers\n)" );
        }
        
        zeichneElement();
    }//funktion verschiebe
    
               
    /**
     * Die Methode gibt die Hoehe des Elements aus.
     */    
        public int getHoehe()
    {
        return this.hoehe;
    }
   
    /**
     * Die Methode gibt die Breite des Elements aus.
     */    
        public int getBreite()
    {
        return this.breite;
    }
    
    

    
    /**
     * Die Methode gibt die X-Position des Elements aus.
     */    
        public int getxPosition()
    {
        return this.xPosition;
    }
    
        /**
     * Die Methode gibt die Y-Position des Elements aus
     */    
        public int getyPosition()
    {
        return this.yPosition;
    }
    
    /**
     * Die Methode gibt die Farbe von dem Elements aus
     */    
        public Color getFarbe()
    {
        return this.farbe;
    }
    
    /**
     * Die Methode gibt den orientierung des Elements aus
     */    
        public int getorientierung()
    {
        return this.orientierung;
    }
}//class
    
    
    

    
    