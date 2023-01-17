
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

    /**
     * Constructor for objects of class Kraftwerk
     */
    public Kraftwerk()
    {
        // initialise instance variables
        status = true;
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
}
