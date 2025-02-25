

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
 
public class SoundPlayer {
    
    
    public void applaus(){
    
        try {
            File soundFile = new File("C:/Users/Schueler/downloads/Auto_hupt.wav"); // Sounddatei laden
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(soundFile);
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            clip.start(); // Sound abspielen
 
            // Warten, bis der Sound fertig ist (optional)
            Thread.sleep(clip.getMicrosecondLength() / 1000);
 
            clip.close();
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException | InterruptedException e) {
            e.printStackTrace();
        }
    }
    
    public void sonar(){
    
        System.out.println("Hello");
    }
        
    public void teeswing(){
    
        System.out.println("Hello");
    }    
}

