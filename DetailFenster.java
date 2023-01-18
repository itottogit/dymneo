import java.awt.BorderLayout;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class DetailFenster extends JFrame {
  private JTextArea textArea;

  public DetailFenster() {
    
    setTitle("Details");
    setSize(400, 200);
    setVisible(true);
    
    textArea = new JTextArea();
    add(textArea, BorderLayout.CENTER);
  }

  public void detailHinzufügen(String detail) {
    // Füge die übergebenen Daten zum Text-Feld hinzu
    textArea.append(detail + "\n");
  }
}