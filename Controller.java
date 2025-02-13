import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.geom.Point2D;
import java.awt.Point; 
  
  public class Controller extends MouseInputAdapter implements ActionListener, ListSelectionListener
  {
    
    //Der Controller wird zunächst erzeugt und ist die zentrale Schaltstelle.
    //Hier werden daher die anderen wichtigen Objekte erzeugt.
      
    private   ToolFrame   toolFrame;
    protected CanvasFrame canvasFrame;
    private   SoundOutput soundOutput;
    private   Elementverwaltung ev;
    private   String      auswahl;
    
    public Controller() 
    {
        
        //Beim Erzeugen des ToolFrame erhält dieser mittels des Parameters
        //"this" eine Referenz auf dieses Objekt, den Controller.
        toolFrame = new ToolFrame(this);
        toolFrame.setVisible(true);
        
        canvasFrame  = new CanvasFrame("Mobilitätskarte",800,600,Color.white,this);
        
        //Sound ist deaktiviert.
        soundOutput = new SoundOutput();
        
        ev = new Elementverwaltung(this); 
        Hamburg hh = new Hamburg(ev); 
        canvasFrame.updateList(ev.getElementList());
        
        // erstellen von Bus/Bahn Haltestellen:
        Haltestelle bergedorfZOB = new Bushaltestelle("Bergedorf ZOB", 300, 350);
        showElement(bergedorfZOB);
        
        Haltestelle mümmelmannsberg = new Bushaltestelle("Mümmelmannsberg", 330, 330);
        showElement(mümmelmannsberg);
        
        Haltestelle jungfernstieg = new Bushaltestelle("Jungfernstieg", 410, 290);
        showElement(jungfernstieg);
        
        Haltestelle rathausmarkt = new Bushaltestelle("Rathausmarkt", 400, 300);
        showElement(rathausmarkt);
        
        Haltestelle gänsemarkt = new Bushaltestelle("Gänsemarkt", 440, 320);
        showElement(gänsemarkt);
        
        
        Haltestelle niendorfnord = new UBahnhaltestelle("Niendorf Nord", 460, 250);
        showElement(niendorfnord);
        
        Haltestelle hagenbeckstierpark = new UBahnhaltestelle("Hagenbecks Tierpark", 470, 260);
        showElement(hagenbeckstierpark);
        
        Haltestelle schlump = new UBahnhaltestelle("Schlump", 430, 280);
        showElement(schlump);
        
        Haltestelle hauptbahnhofnord = new UBahnhaltestelle("Hauptbahnhof Nord", 475, 310);
        showElement(hauptbahnhofnord);
        
        Haltestelle berlinertor = new UBahnhaltestelle("Berliner Tor", 500, 320);
        showElement(berlinertor);
        
        Haltestelle burgstraße = new UBahnhaltestelle("Burgstraße", 460, 330);
        showElement(burgstraße);
        
         
        Haltestelle hornerrennbahn = new UBahnhaltestelle("Horner Rennbahn", 500, 340);
        showElement(hornerrennbahn);
        
    }
    public void showElement(Element e) {
        ev.verwaltungsListeElementeEintragen(e);
        canvasFrame.updateList(ev.getElementList());
    }
    
    public void actionPerformed(ActionEvent evt)
    {
      System.out.println("Action passiert");
      Object eventQuelle=evt.getSource();
      String klassennameDerEreignisQuelle=eventQuelle.getClass().getName();
    
      if ( (klassennameDerEreignisQuelle.equals("javax.swing.JButton")) &&
           (((JButton) eventQuelle).getText().equals("Objekt hinzufügen")))
      {
          // Der Knopf "Objekt hinzufügen" wurde gedrückt. Es wird ein neues Element
          // im Modell erstellt.
          System.out.println("Neues Element ("+auswahl+") wird erstellt.");
          ev.neuesElement(auswahl);   
      }
      
      if ( (klassennameDerEreignisQuelle.equals("javax.swing.JButton")) &&
           (((JButton) eventQuelle).getText().equals("Testknopf")))
      {
          // Der Testknopf wurde gedrückt. 
          
          ev.testMethode();
          canvasFrame.updateList(ev.getElementList());
          System.out.println("Action Test");
      } 
     
     
      
    
    
    if ( (klassennameDerEreignisQuelle.equals("javax.swing.JButton")) &&
           (((JButton) eventQuelle).getText().equals("Details")))
      {
        //Der Button zum anzeigen der Details wurde gedrueckt
         
        ev.detailsLesen();
        
         
        }

  
    if ( (klassennameDerEreignisQuelle.equals("javax.swing.JButton")) &&
           (((JButton) eventQuelle).getText().equals("rechts")))
      {
          // Der Knopf Verschiebe rechts wurde gedrückt. 
          
          ev.verschiebeMarkierteElementeNachRechts();
          canvasFrame.updateList(ev.getElementList());
          System.out.println("Action Rechts");
      } 
    
      if ( (klassennameDerEreignisQuelle.equals("javax.swing.JButton")) &&
           (((JButton) eventQuelle).getText().equals("links")))
      {
          // Der Knopf Verschiebe links wurde gedrückt. 
          
          ev.verschiebeMarkierteElementeNachLinks();
          canvasFrame.updateList(ev.getElementList());
          System.out.println("Action Links");
      }     
      if ( (klassennameDerEreignisQuelle.equals("javax.swing.JButton")) &&
           (((JButton) eventQuelle).getText().equals("oben")))
      {
          // Der Knopf Verschiebe oben wurde gedrückt. 
          
          ev.verschiebeMarkierteElementeNachOben();
          canvasFrame.updateList(ev.getElementList());
          System.out.println("Action Oben");
      }       
      if ( (klassennameDerEreignisQuelle.equals("javax.swing.JButton")) &&
           (((JButton) eventQuelle).getText().equals("unten")))
      {
          // Der Knopf Verschiebe unten wurde gedrückt. 
          
          ev.verschiebeMarkierteElementeNachUnten();
          canvasFrame.updateList(ev.getElementList());
          System.out.println("Action Unten");
      }
     
      

      
      
      //Events des GUIS - MenueLeiste
      
            if(evt.getActionCommand() == "guibeende")
            {
                System.out.println("Beenden im GUI gewaehlt");
                //Hier ggf. Sicherheitsabfrage einbinden!
                System.exit(0);//Beendet das Programm! 
            }
            
            if(evt.getActionCommand() == "guilade")
            {
                System.out.println("Laden im GUI gewählt");
                ev.laden();
            }
            
            if(evt.getActionCommand() == "guispeicher")
            {
                System.out.println("Speichern im GUI gewählt");
                ev.speichern();
            }
            
            if(evt.getActionCommand() == "guiextra")
            {
                System.out.println("Extra --> Über wurde gewählt");
            }
      
       
      
        }
    
 
    public void mouseDragged(MouseEvent evt)
    
    {
      System.out.println("Maus gezogen");
          
    }      
    
    public void mouseClicked(MouseEvent evt) 
    {
      int knopf = evt.getButton();  
      Point p = new Point(evt.getX(), evt.getY());
      ev.markiereElemente(p); 
      switch (knopf) 
      {
        case 1:  if (ev.markiereElemente(p))
                     {soundOutput.sonar();}
                     else 
                     {soundOutput.teeswing();};
                     System.out.println("Maustaste  " + knopf);
                     break;
                     
        case 2:  System.out.println("Maustaste  " + knopf);  
                 break;
      
        case 3:  System.out.println("Maustaste  " + knopf);  
                 break;
      
      }
         
      canvasFrame.neuZeichnen();
      System.out.println("Maus geklickt bei Stelle: " + p.toString());
        
    }
    
    public void mouseReleased(MouseEvent evt)
    {
      System.out.println("Maus losgelassen");
    } 
    
    public void mouseEntered(MouseEvent evt)
    {
      System.out.println("Maus betritt die Fläche");
    }   
    
    public void mouseExited(MouseEvent evt)
    {
      System.out.println("Maus verlässt die Fläche");
    }    
    
    public void mousePressed(MouseEvent evt)
    {
      System.out.println("Maus gedrückt!");
//       int x = evt.getX();
//       int y = evt.getY();
//       Rectangle currentRect = new Rectangle(x,y,0,0);
//       updateDrawableRect(getWidth(), getHeight());
//       repaint();
    }   
     
    
    public void mouseMoved(MouseEvent evt)
    {
      System.out.println("Maus bewegt");
    }   

    public void valueChanged(ListSelectionEvent lse)
    {
        if (!lse.getValueIsAdjusting()){
            auswahl = (String) ((JList) lse.getSource()).getSelectedValue();
            System.out.println("Listenauswahl geändert zu:" + auswahl);
        }
    }  
    
    public void updateView()
    {
        canvasFrame.updateList(ev.getElementList());
    }
    
    public void speichern()
    {
        ev.speichern();
    }
    
    public void laden()
    {
        ev.laden();
    }
    

}  
