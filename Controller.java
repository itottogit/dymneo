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
    private   SoundPlayer soundPlayer;

    
    private   SoundPlayer soundplayer;
    private UserInterfaceMain menu;

    private   Elementverwaltung ev;
    
    private   String      auswahl;
    
    private Rezensionliste rl ;
    public Controller() 
    {
        
        //Beim Erzeugen des ToolFrame erhält dieser mittels des Parameters
        //"this" eine Referenz auf dieses Objekt, den Controller.
        rl = new Rezensionliste();
        menu = new UserInterfaceMain(this);
        
        
        //Sound ist deaktiviert.
        soundPlayer = new SoundPlayer();
        
        ev = new Elementverwaltung(this); 
        Hamburg hh = new Hamburg(ev); 
        menu.karte.updateList(ev.getElementList());
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
          soundPlayer.applaus();
      }
      
      if ( (klassennameDerEreignisQuelle.equals("javax.swing.JButton")) &&
           (((JButton) eventQuelle).getText().equals("Testknopf")))
      {
          // Der Testknopf wurde gedrückt. 
          
          ev.testMethode();
          menu.karte.updateList(ev.getElementList());
          System.out.println("Action Test");
      } 
                             if ( (klassennameDerEreignisQuelle.equals("javax.swing.JButton")) &&
           (((JButton) eventQuelle).getText().equals("Taxameter Öffnen")))
      {
          // Der Knopf "Objekt hinzufügen" wurde gedrückt. Es wird ein neues Element
          // im Modell erstellt.
          TaxameterApp app = new TaxameterApp();
          app.init();
          System.out.println("Taxameter geöffnet");  
      }

 


        if ((klassennameDerEreignisQuelle.equals("javax.swing.JButton")) &&

    (((JButton) eventQuelle).getText().equals("MOIA Rufen"))) {
    // Der Knopf "MOIA Rufen" wurde gedrückt. Ein Pop-up wird angezeigt.
    JOptionPane.showMessageDialog(null, "MOIA wurde zu ihrem Standort gerufen");
      }     
      if ( (klassennameDerEreignisQuelle.equals("javax.swing.JButton")) &&
           (((JButton) eventQuelle).getText().equals("Bewerte")))
      {
        //Der Button zum anzeigen der Details wurde gedrueckt
         
        System.out.println("Bewerte");
        rl.speichereRezension("Bewertung", 3);
        System.out.println(rl.anzahlRezensionen());
        
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
          menu.karte.updateList(ev.getElementList());
          System.out.println("Action Rechts");
      } 
    
      if ( (klassennameDerEreignisQuelle.equals("javax.swing.JButton")) &&
           (((JButton) eventQuelle).getText().equals("links")))
      {
          // Der Knopf Verschiebe links wurde gedrückt. 
          
          ev.verschiebeMarkierteElementeNachLinks();
          menu.karte.updateList(ev.getElementList());
          System.out.println("Action Links");
      }     
      if ( (klassennameDerEreignisQuelle.equals("javax.swing.JButton")) &&
           (((JButton) eventQuelle).getText().equals("oben")))
      {
          // Der Knopf Verschiebe oben wurde gedrückt. 
          
          ev.verschiebeMarkierteElementeNachOben();
          menu.karte.updateList(ev.getElementList());
          System.out.println("Action Oben");
      }       
      if ( (klassennameDerEreignisQuelle.equals("javax.swing.JButton")) &&
           (((JButton) eventQuelle).getText().equals("unten")))
      {
          // Der Knopf Verschiebe unten wurde gedrückt. 
          
          ev.verschiebeMarkierteElementeNachUnten();
          menu.karte.updateList(ev.getElementList());
          System.out.println("Action Unten");
      }
      if ( (klassennameDerEreignisQuelle.equals("javax.swing.JMenuItem")) &&
           (((JMenuItem) eventQuelle).getText().equals("Karte")))
      {
          // Der Knopf Verschiebe unten wurde gedrückt. 
          
          menu.oeffneKarte(this);
          menu.karte.updateList(ev.getElementList());
          System.out.println("Karte wurde gedrückt");
      }
      if ( (klassennameDerEreignisQuelle.equals("javax.swing.JMenuItem")) &&
           (((JMenuItem) eventQuelle).getText().equals("Fahrzeuge")))
      {
          // Der Knopf Verschiebe unten wurde gedrückt. 
          
          menu.oeffneFahrzeuge(this);
          menu.karte.updateList(ev.getElementList());
          System.out.println("Fahrzeuge wurde gedrückt");
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
                     {soundPlayer.sonar();}
                     else 
                     {soundPlayer.teeswing();};
                     System.out.println("Maustaste  " + knopf);
                     break;
                     
        case 2:  System.out.println("Maustaste  " + knopf);  
                 break;
      
        case 3:  System.out.println("Maustaste  " + knopf);  
                 break;
      
      }
         
      menu.karte.neuZeichnen();
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
        menu.karte.updateList(ev.getElementList());
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
