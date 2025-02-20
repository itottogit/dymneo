import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import javafx.event.Event;



import javax.swing.JFrame;
import javax.swing.JProgressBar;

public class UserInterfaceMain extends JFrame {
    JMenuBar menubar;
    JMenu home_menu;
    JMenu about_menu;
    JMenu help_menu;
    JMenu contact_menu;
    
    JMenuItem ziele_item;
    JMenuItem email_item;
    JMenuItem telefon_item;
    JMenuItem partner_item;
    JMenuItem karte_item;
    JMenuItem fahrzeuge_item;

    
    JButton Karte = new JButton("Karte");
    JButton Fahrzeug = new JButton("Fahrzeuge");
    public CanvasFrame karte;
    public ToolFrame fahrzeuge;
    private Cybertruck cybertruck;
    private JFrame JFrame;
    
    
    UserInterfaceMain(Controller controller) {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600,600);
        setTitle("Menu");
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());
        
        
        menubar = new JMenuBar();
        
        home_menu = new JMenu("Home");
        about_menu = new JMenu("About us");
        help_menu = new JMenu("Help");
        contact_menu = new JMenu("Contact us");
        
        ziele_item = new JMenuItem("Unsere Ziele");
        email_item = new JMenuItem("Schreib uns eine Email");
        telefon_item = new JMenuItem("Rufen sie uns an");
        partner_item = new JMenuItem("Unsere Partner");
        karte_item = new JMenuItem("Karte");
        karte_item.addActionListener(controller);
        fahrzeuge_item = new JMenuItem("Fahrzeuge");
        fahrzeuge_item.addActionListener(controller);
        
        
        setJMenuBar(menubar);
        
        menubar.add(home_menu);
        menubar.add(about_menu);
        menubar.add(help_menu);
        menubar.add(contact_menu);
        
        about_menu.add(ziele_item);
        about_menu.add(partner_item);
        contact_menu.add(telefon_item);
        contact_menu.add(email_item);
        home_menu.add(karte_item);
        home_menu.add(fahrzeuge_item);
        
        
        
     
     
     fahrzeuge_item.addMouseListener(new java.awt.event.MouseAdapter() { // Ohr f?r ButtonClick
      public void mousePressed(MouseEvent e) {
        oeffneCybertruck();
        
       }
     });    
        
     setVisible(true);
   } 
   
   void oeffneFahrzeuge(Controller controller) {
       fahrzeuge = new ToolFrame(controller);
       fahrzeuge.setVisible(true);
   }
    
   void oeffneKarte(Controller controller) {
      karte  = new CanvasFrame("Mobilitätskarte",800,600,Color.white,controller);
      karte.setVisible(true);
      
   }
    
   void oeffneCybertruck() {
       cybertruck = new Cybertruck();
       
       
    }
   
      
}


