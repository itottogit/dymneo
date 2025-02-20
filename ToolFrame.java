import java.awt.Menu;

/**
 * Ein Fenster mit einer Liste und diversen Buttons
 *
 * @author iTOtto
 * @version 12/24
 */

  import java.awt.*;
  import javax.swing.event.*;
  import java.awt.event.*;
  import javax.swing.*;
  import java.util.*;
  
  public class ToolFrame extends JFrame {
      
    public JList list;
    
    
    
    public ToolFrame (Controller controller) {
      super ("Werkzeuge"); //Aufruf des Konstruktors von JFrame
        
      setSize(400, 350);
      getContentPane().setLayout(null); //Das Layout wird per Hand codiert.

    // Hier wird das Menü erzeugt:
    MenuBar menueLeiste = new MenuBar();
    // Ein Menue anlegen
    Menu datei = new Menu("Datei");
    // Einen Menueeintrag anlegen
    MenuItem beenden = new MenuItem("Beenden");
    beenden.setActionCommand("guibeende");
    beenden.addActionListener(controller);
    // Den Eintrag dem Menue hinzufuegen
    MenuItem lade = new MenuItem("Laden");
    lade.setActionCommand("guilade");
    lade.addActionListener(controller);
    MenuItem speicher = new MenuItem("Speichern");
    speicher.setActionCommand("guispeicher");
    speicher.addActionListener(controller);
    datei.add(lade);
    datei.add(speicher);
    datei.add (beenden);
    // Das Menue der Leiste hinzufuegen
    menueLeiste.add(datei);
    


    // Noch ein Menue anlegen
    Menu extra = new Menu ("Hilfe");
    // ... und noch ein Menue
    
    //...das Menue dem Extramenue als Untermenue hinzufuegen
    MenuItem ueber = new MenuItem("Über das Programm");
    ueber.setActionCommand("guiextra");
    ueber.addActionListener(controller);
    // Das Untermenue mit Eintraegen fuellen
    
    // Das Extramenü der Leiste hinzufügen
    extra.add(ueber);
    menueLeiste.add(extra);
    setMenuBar(menueLeiste);

      // Hier wird der Knopf für Testzwecke erstellt.
      JButton testKnopf = new JButton("Testknopf");
      testKnopf.setHorizontalAlignment(SwingConstants.CENTER);
      testKnopf.setBounds(0, 145, 90, 160);
      testKnopf.addActionListener(controller);
      getContentPane().add(testKnopf);
    
    
    
      // Hier wird der Knopf für die Erstellung eines neuen Elements
      // erstellt. 
      JButton neuesElementKnopf = new JButton("Objekt hinzufügen");
      neuesElementKnopf.setHorizontalAlignment(SwingConstants.CENTER);
      neuesElementKnopf.setBounds(120, 45, 160, 30);
      neuesElementKnopf.addActionListener(controller);
      getContentPane().add(neuesElementKnopf);
      
      
     // Hier wird der Knopf für das Rechtsverschieben eines markierten Elements
      // erstellt. 
      JButton verschiebeRechts = new JButton("rechts");
      verschiebeRechts.setHorizontalAlignment(SwingConstants.CENTER);
      verschiebeRechts.setBounds(200, 150, 80, 30);
      verschiebeRechts.addActionListener(controller);
      getContentPane().add(verschiebeRechts); 
      
      
      JButton verschiebeLinks = new JButton("links");
      verschiebeLinks.setHorizontalAlignment(SwingConstants.CENTER);
      verschiebeLinks.setBounds(100, 150, 80, 30);
      verschiebeLinks.addActionListener(controller);
      getContentPane().add(verschiebeLinks);  
      
      // Hier wird der Knopf für das Hochverschiebenverschieben eines markierten Elements
      // erstellt. 
      JButton verschiebeOben = new JButton("oben");
      verschiebeOben.setHorizontalAlignment(SwingConstants.CENTER);
      verschiebeOben.setBounds(150, 100, 80, 30);
      verschiebeOben.addActionListener(controller);
      getContentPane().add(verschiebeOben);
      
      // Hier wird der Knopf für das Abwärtsverschieben eines markierten Elements
      // erstellt. 
      JButton verschiebeUnten = new JButton("unten");
      verschiebeUnten.setHorizontalAlignment(SwingConstants.CENTER);
      verschiebeUnten.setBounds(150, 200, 80, 30);
      verschiebeUnten.addActionListener(controller);
      getContentPane().add(verschiebeUnten);
      
      //Button zum Anzeigen der Details
     
     JButton details = new JButton("Details");
     details.setHorizontalAlignment(SwingConstants.CENTER);
      details.setBounds(280, 200, 80, 30);
      details.addActionListener(controller);
      getContentPane().add(details);
     
      
     
     
     //JLIst für die verschiedenen Fahrzeuge
      String [] eintraege = {"Auto",  "Fahrrad", "Pickup", "Fähre"};
      list = new JList(eintraege);
      
      JScrollPane scroller = new JScrollPane(list);
      scroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
      scroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
      scroller.setBounds(10,10,100,95);
      getContentPane().add(scroller);
      
      list.setVisibleRowCount(5);
      list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
      
      list.addListSelectionListener(controller);
    }
  
  }
