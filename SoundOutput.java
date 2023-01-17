//import  sun.audio.*;    //import the sun.audio package
import  java.io.*;

/**
 * Write a description of class SoundOutput here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SoundOutput
{
    // instance variables - replace the example below with your own
    private InputStream in;
    //private AudioStream as;

    /**
     * Constructor for objects of class SoundOutput
     */
    public SoundOutput()
    {
        // initialise instance variables
    }

 
    public void sonar()
    {
       
        // Open an input stream  to the audio file.
        try{in = new FileInputStream("Sonar.au");}
        catch(Exception e){}
        // Create an AudioStream object from the input stream.
        try{//as = new AudioStream(in); 
        }
        catch(Exception e){}
        // Use the static class member "player" from class AudioPlayer to play
        // clip.
        //AudioPlayer.player.start(as);            
 
    }

   public void teeswing()
    {
       
        // Open an input stream  to the audio file.
        try{in = new FileInputStream("Teeswing.au");}
        catch(Exception e){}
        // Create an AudioStream object from the input stream.
        try{//as = new AudioStream(in); 
        }
        catch(Exception e){}
        // Use the static class member "player" from class AudioPlayer to play
        // clip.
        //AudioPlayer.player.start(as);            
 
    }

}
