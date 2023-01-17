  import java.awt.*;
  import java.awt.event.*;
  import javax.swing.*;
  import javax.swing.event.*;
  
  public class Controller extends MouseInputAdapter implements ActionListener, ListSelectionListener
  {
    
    private ToolFrame toolFrame;
    protected CanvasFrame canvasFrame;
    private SoundOutput soundOutput;
    
    private Elementverwaltung ev;
    
    private String auswahl;
    
    
    public Controller() 
    {
        toolFrame = new ToolFrame(this);
        toolFrame.setVisible(true);
        
        canvasFrame  = new CanvasFrame("Energiekarte",800,600,Color.white,this);
       
        soundOutput = new SoundOutput();
        
        ev = new Elementverwaltung(this); 
        Hamburg hh = new Hamburg(ev); canvasFrame.updateList(ev.getElementList());
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
           (((JButton) eventQuelle).getText().equals("Objekt hinzufügen")))
        {
          // Der Knopf "Objekt hinzufügen" wurde gedrückt. Es wird ein neues Möbel
          // im Modell erstellt.
          // System.out.println("Neues Kraftwerk ("+auswahl+") wird erstellt.");
          // if (auswahl == "Bett"){
              // Bett bett = new Bett();
              // ev.verwaltungsListeKraftwerkeEintragen(bett);
              // canvasFrame.neuesElement(bett);
              // System.out.println("Bett erstellt");
          // }  
          
        
        
          // if (auswahl == "Wind"){
              // Wind wind = new Wind();
              // ev.verwaltungsListeKraftwerkeEintragen(wind);
              // canvasFrame.neuesElement(wind);
              // System.out.println("Wind erstellt");
          // }  
          
         // if (auswahl == "Solar"){
              // Solar solar= new Solar();
              // ev.verwaltungsListeKraftwerkeEintragen(solar);
              // canvasFrame.neuesElement(solar);
              // System.out.println("Solar erstellt");
          // }  
          
          
            // if (auswahl == "Windpark"){
              // Windpark windpark= new Windpark();
              // ev.verwaltungsListeKraftwerkeEintragen(windpark);
              // canvasFrame.neuesElement(windpark);
              // System.out.println("Windpark erstellt");
          // }  
          
           // if (auswahl == "Wasser"){
              // Wasser wasser= new Wasser();
              // ev.verwaltungsListeKraftwerkeEintragen(wasser);
              // canvasFrame.neuesElement(wasser);
              // System.out.println("Wasser erstellt");
          // }  
          
          
          
           
      
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
          // Der Knopf Verschiebe links wurde gedr�ckt. 
          
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
          // Der Knopf Verschiebe unten wurde gedr�ckt. 
          
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
      
      switch (knopf) {
       case 1:  if (ev.markiereElemente(p))
                     {soundOutput.sonar();}
                     else 
                     {soundOutput.teeswing();};
                     System.out.println("Maustaste  " + knopf);
                     break;
                     
       case 2:   System.out.println("Maustaste  " + knopf);  
                 break;
      
       case 3:   System.out.println("Maustaste  " + knopf);  
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
