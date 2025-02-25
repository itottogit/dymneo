import java.io.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;

public class FeedbackFenster extends JFrame { 
    public static void main(String[] args) {
            ErstelleGUI();
    }
    
    protected static void ErstelleGUI() {
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
        panel.add(new JLabel("Schreibe dein Feedback hier:"), constraints);

      
        constraints.gridy++;
        panel.add(text, constraints);

     
        JLabel countLabel = new JLabel("Anzahl der Buchstaben: 0");
        constraints.gridy++;
        panel.add(countLabel, constraints);


        text.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {

                String textContent = text.getText();
                int letterCount = textContent.length();
                countLabel.setText("Anzahl der Buchstaben: " + letterCount);
            }
        });

        JButton testknopf = new JButton("Abschicken");
        testknopf.setPreferredSize(new Dimension(160, 45));
        constraints.gridy++;
        constraints.gridwidth = 3;
        constraints.fill = GridBagConstraints.HORIZONTAL;
        panel.add(testknopf, constraints);


        testknopf.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Writer writer = null;
                try {
                    writer = new BufferedWriter(new OutputStreamWriter(
                    new FileOutputStream("Feedbackliste.txt", true), "utf-8"));
                    writer.write(text.getText() + "\n");
                } catch (IOException ex) {
                    ex.printStackTrace();
                } finally {
                    try { writer.close(); } catch (Exception ex) { /* ignore */ }
                }
 
                //text.setText("");
            }
        });

    
        frame.setContentPane(panel);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
