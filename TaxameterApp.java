import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TaxameterApp {
    private static double price = 0.0; // Initial price
    private static boolean running = false; // To check if the taximeter is running
    private static Timer timer; // Zeitr to update the price
    private static int elapsedZeit = 0; // To keep track of elapsed time in seconds
    private static double pricePerMinute = 2.0; // Set the price increment per minute

    public static void main(String[] args) {
        // Create the frame
        JFrame frame = new JFrame("Taxameter");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10); // Add padding

        // Create a label to display the price
        JLabel priceLabel = new JLabel("Preis: 0.00€");
        priceLabel.setFont(new Font("Arial", Font.BOLD, 16));
        gbc.gridx = 0;
        gbc.gridy = 0;
        frame.add(priceLabel, gbc);

        // Create a label to display the elapsed time
        JLabel timeLabel = new JLabel("Zeit: 0 Stunden, 0 minuten, 0 sekunden");
        timeLabel.setFont(new Font("Arial", Font.PLAIN, 14));
        gbc.gridy = 1;
        frame.add(timeLabel, gbc);

        // Create a button to start the taximeter
        JButton startButton = new JButton("Start Taxameter");
        gbc.gridy = 2;
        startButton.setPreferredSize(new Dimension(150, 30));
        frame.add(startButton, gbc);
        
        // Create a button to stop the taximeter
        JButton stopButton = new JButton("Stop Taxameter");
        gbc.gridy = 3;
        stopButton.setPreferredSize(new Dimension(150, 30));
        frame.add(stopButton, gbc);
        
        // Create a panel for the price increment field and label
        JPanel pricePanel = new JPanel();
        pricePanel.setLayout(new FlowLayout());
        
        // Create a text field to change the price increment
        JTextField priceIncrementField = new JTextField("2.00", 5);
        priceIncrementField.setPreferredSize(new Dimension(70, 30));
        pricePanel.add(priceIncrementField);
        
        // Create a label for the price increment
        JLabel incrementLabel = new JLabel("€ pro Minute");
        pricePanel.add(incrementLabel);
        
        // Add the price panel to the frame
        gbc.gridy = 4;
        frame.add(pricePanel, gbc);

        // Action listener for the start button
        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!running) {
                    running = true; // Set running to true
                    // Reset price when starting again
                    price = 0.0; // Reset price
                    priceLabel.setText(String.format("Preis: %.2f€", price)); // Update the price label
                    startTaxameter(priceLabel, timeLabel, priceIncrementField); // Start the taxameter
                }
            }
        });

        // Action listener for the stop button
        stopButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent a) {
                if (running) { // Check if running is true
                    running = false; // Set running to false
                    stopTaxameter(); // Stop the taxameter
                }
            }
        });

        // Set the frame visibility
        frame.setVisible(true);
        frame.setLocationRelativeTo(null); // Center the frame on the screen
    }

    private static void startTaxameter(JLabel priceLabel, JLabel timeLabel, JTextField priceIncrementField) {
        // Create a timer that updates the price and time every second
        timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Update the elapsed time
                elapsedZeit++;

                // Calculate Stunden, minutes, and seconds
                int Stunden = elapsedZeit / 3600;
                int minutes = (elapsedZeit % 3600) / 60;
                int seconds = elapsedZeit % 60;

                // Update the time label
                timeLabel.setText(String.format("Zeit: %d Stunde, %d minute, %d sekunde", Stunden, minutes, seconds));

                // Update the price display every second
                double increment;
                try {
                    increment = Double.parseDouble(priceIncrementField.getText());
                } catch (NumberFormatException ex) {
                    increment = pricePerMinute; // Default increment if parsing fails
                }

                // Calculate the price per second based on the price per minute
                double pricePerSecond = increment / 60.0;

                // Update the displayed price
                price += pricePerSecond; // Increase price by the calculated price per second
                priceLabel.setText(String.format("Preis: %.2f€", price)); // Update the label

                // Increase price every minute
                if (elapsedZeit % 60 == 0 && elapsedZeit != 0) {
                    price += increment; // Increase price by the specified increment
                    priceLabel.setText(String.format("Preis: %.2f€", price));
                }
            }
        });
        timer.start(); // Start the timer
    }

    private static void stopTaxameter() {
        if (timer != null) {
            timer.stop(); // Stop the timer
            elapsedZeit = 0; // Reset elapsed time
        }
    }
}