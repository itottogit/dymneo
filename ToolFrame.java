  import java.awt.*;
  import javax.swing.event.*;
  import java.awt.event.*;
  import javax.swing.*;
  import java.util.*;
  
  public class ToolFrame extends JFrame {
      
//    private Zeichenbereich zeichenbereich;
    public JList list;
    
    
    public ToolFrame (Controller controller) {
      super ("Werkzeuge");
        
      setSize(410, 300);
      getContentPane().setLayout(null);

    // Hier wird das Men� erzeugt:
    MenuBar menueLeiste = new MenuBar();
    // Ein Menue anlegen
    Menu datei = new Menu("Datei");
    // Einen Menueeintrag anlegen
    MenuItem beenden = new MenuItem("Beenden");
  //  setCtrlAccelerator(datei, 'E');
    beenden.setActionCommand("guibeende");
    beenden.addActionListener(controller);
    // Den Eintrag dem Menue hinzufuegen
    MenuItem lade = new MenuItem("Laden");
  //  setCtrlAccelerator(datei, 'A');
    lade.setActionCommand("guilade");
    lade.addActionListener(controller);
    MenuItem speicher = new MenuItem("Speichern");
   // setCtrlAccelerator(datei, 'S');
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
    
    // Das Extramen� der Leiste hinzuf�gen
    extra.add(ueber);
    menueLeiste.add(extra);
    setMenuBar(menueLeiste);

      // Hier wird der Knopf f�r die Erstellung eines neuen Elements
      // erstellt. 
      JButton testKnopf = new JButton("Testknopf");
      testKnopf.setHorizontalAlignment(SwingConstants.CENTER);
      testKnopf.setBounds(0, 145, 90, 160);
      testKnopf.addActionListener(controller);
      getContentPane().add(testKnopf);
    
    
    
      // Hier wird der Knopf f�r die Erstellung eines neuen Elements
      // erstellt. 
      JButton neuesElementKnopf = new JButton("Objekt hinzufügen");
      neuesElementKnopf.setHorizontalAlignment(SwingConstants.CENTER);
      neuesElementKnopf.setBounds(120, 45, 160, 30);
      neuesElementKnopf.addActionListener(controller);
      getContentPane().add(neuesElementKnopf);
      
      
     // Hier wird der Knopf f�r das Rechtsverschieben eines markierten M�belst�cks
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
      
      // Hier wird der Knopf f�r das Hochverschiebenverschieben eines markierten M�belst�cks
      // erstellt. 
      JButton verschiebeOben = new JButton("oben");
      verschiebeOben.setHorizontalAlignment(SwingConstants.CENTER);
      verschiebeOben.setBounds(150, 100, 80, 30);
      verschiebeOben.addActionListener(controller);
      getContentPane().add(verschiebeOben);
      
      // Hier wird der Knopf f�r das Abwärtsverschieben eines markierten M�belst�cks
      // erstellt. 
      JButton verschiebeUnten = new JButton("unten");
      verschiebeUnten.setHorizontalAlignment(SwingConstants.CENTER);
      verschiebeUnten.setBounds(150, 200, 80, 30);
      verschiebeUnten.addActionListener(controller);
      getContentPane().add(verschiebeUnten);
      
      // Hier wird der Knopf f�r das Linksverschieben eines markierten M�belst�cks
      // erstellt. 

      
      // Hier wird der Knopf f�r das Hochverschiebenverschieben eines markierten M�belst�cks
      // erstellt. 

      
      // Hier wird der Knopf f�r das Abwärtsverschieben eines markierten M�belst�cks
      // erstellt. 
 
     
     //JLIst f�r die verschiedenen M�bel
      String [] eintraege = {"Wind",  "Windpark", "Solar", "Wasser"};
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
