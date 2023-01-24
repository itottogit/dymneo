import java.io.File;

/**
 * Write a description of class Kraftwerk here.
 *
 * @author  iTOtto
 * @version 11/22
 */
public abstract class Kraftwerk extends Element
{
    // instance variables - replace the example below with your own
    private int aktuelleLeistung;
    private int maximaleLeistung;
    private boolean status;
    public int tiefe; 
    private File details;

    /**
     * Constructor for objects of class Kraftwerk
     */
    public Kraftwerk(/**String filePath*/)
    {
        // initialise instance variables
        status = true;
        
        //Kraftwerk kraftwerk = new Kraftwerk
    }

    /**
     * Status setzen 
     *
     * @param  neuerStatus  Ist das Kraftwerk aktiv?
     * @return -
     */
    public void setzeStatus(boolean neuerStatus)
    {
        status = neuerStatus;
    }
    
    public void markiertFarbe(String farbe){
        if(markiert=true){
            farbe  = "rot"; 
        }
        else{
            farbe = "schwarz"; 
        }
    }
}
