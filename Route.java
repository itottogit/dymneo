import java.awt.geom.GeneralPath;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.AffineTransform;
import java.awt.*;
/**
 * Write a description of class Route here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Route extends Element
{
    // instance variables - replace the example below with your own
    private int xpos1;
    private int ypos1;
    private int xpos2;
    private int ypos2;

    /**
     * Constructor for objects of class Route
     */
    public Route()
    {
        // initialise instance variables
        xpos1 = 20;
        ypos1 = 20;
        xpos2 = 120;
        ypos2 = 120;
        
        figur = gibAktuelleFigur();
    }
    protected Shape gibAktuelleFigur() {
       // einen GeneralPath definieren
        GeneralPath Route = new GeneralPath();
        Route.moveTo(xpos1,ypos1); // Start
        Route.lineTo(xpos2,ypos2); // Linie 
        
    
        // transformieren:
        AffineTransform t = new AffineTransform();
        t.translate(xPosition, yPosition);
        Rectangle2D umriss = Route.getBounds2D();
        t.rotate(Math.toRadians(orientierung),umriss.getX()+umriss.getWidth()/2,umriss.getY()+umriss.getHeight()/2);
        return  t.createTransformedShape(Route);
        }
    }