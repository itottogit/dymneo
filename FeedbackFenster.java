import java.io.PrintWriter;
import java.nio.file.*;
import java.io.Writer;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Ein Fenster für das Feedback von verschiedenen Fahrzeugen.
 *
 * @author UnknownMemes
 * @version 02/25
 */

  import java.awt.*;
  import javax.swing.event.*;
  import java.awt.event.*;
  import javax.swing.*;
  import java.util.*;
  
  public class FeedbackFenster extends JFrame { 
    public static void main(String[] args) {
            ErstelleGUI();
    }
    
    private static void ErstelleGUI(){
        JFrame frame = new JFrame("Feedback");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(600, 400));
        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.insets = new Insets(10, 10, 10, 10);
   
        JTextField text = new JTextField();
        text.setColumns(30);
        text.setPreferredSize(new Dimension(400, 60)); 
        
        
        constraints.gridy++;
        panel.add(new JLabel("Schreibe deinen Feedback in hier:"));
        constraints.gridy++;
        panel.add(text,constraints);
        
    

        text.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 Writer writer = null;

                try {
                writer = new BufferedWriter(new OutputStreamWriter(
                new FileOutputStream("Feedbackliste.txt"), "utf-8"));
                writer.write(text.getText());
                } catch (IOException ex) {
                // Report
                } finally {
               try {writer.close();} catch (Exception ex) {/*ignore*/}
                }
            }
        });
        
    
        JButton testknopf = new JButton("Abschicken");
        testknopf.setPreferredSize(new Dimension(160, 45));
        constraints.gridy++; 
        constraints.gridwidth = 3;
        //testknopf.setBounds(0, 145, 90, 160);
        constraints.fill = GridBagConstraints.HORIZONTAL;
        panel.add(testknopf, constraints);

        frame.setContentPane(panel);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        
        
        
        
    }
}

