import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

/**
 * Write a description of class CanvasFrame here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CanvasFrame extends JFrame
{
    // instance variables - replace the example below with your own
    private JFrame f;
    private CanvasPanel cp; 
    /**
     * Constructor for objects of class CanvasFrame
     */
    public CanvasFrame(String titel,int hoehe, int breite, Color farbe, Controller controller)
    {
        // initialise instance variables
        JFrame.setDefaultLookAndFeelDecorated(true);
        f = new JFrame(titel);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        cp = new CanvasPanel(hoehe, breite, farbe, controller);
        f.getContentPane().add(cp);
        f.pack();
        f.setVisible(true);
        f.setBounds(0,300,hoehe,breite);
    }


    public void neuesElement(Element element)
    {
        cp.addShape(element);
    }

     public void updateList(ArrayList elementListe)
     {
        cp.updateList(elementListe);
     }    
     
     public void neuZeichnen()
     {
        cp.repaint();
     }
    
/**
 * Write a description of class CanvasPanel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CanvasPanel extends JPanel
{
    // instance variables - replace the example below with your own
    private ArrayList shapes;

    /**
     * Constructor for objects of class CanvasPanel
     */
    public CanvasPanel(int hoehe, int breite, Color farbe, Controller controller)
    {
        // initialise instance variables
        setPreferredSize(new Dimension(hoehe, breite));
        addMouseListener(controller);
        
        shapes = new ArrayList();
               
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
     public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D)g;
        setBackground(Color.white);
    
        for (Iterator i = shapes.iterator(); i.hasNext();) {
            Element element = (Element) i.next();
            if (element.markiert)
            {
                g2d.setColor(Color.red);
            }    
            else
            {
                g2d.setColor((Color)element.farbe);
            }
            g2d.draw(element.figur); 
//          if (i == selectedIndex) {
//              drawInfo(g2d, i);
//          }   
        }
     }
     
     public void addShape(Element neuesElement) {
         shapes.add(neuesElement);
         repaint();
     }    
     
     public void updateList(ArrayList elementeListe)
     {
        shapes = elementeListe;
        repaint();
     }
     
     public void neuZeichnen()
     {
        repaint();
     }
      
     
}

}
