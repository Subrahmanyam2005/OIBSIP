import javax.swing.*;  // Import Swing for GUI components
import java.awt.event.*;  // Import for handling button actions (button clicks)

public class SimpleCancellationForm extends JFrame implements ActionListener {

    // Declare the UI components
    private JLabel pnrLabel;           // Label for PNR number
    private JTextField pnrText;        // Text field for entering PNR number
    private JButton cancelButton;      // Button to cancel the reservation

    // Constructor to create and set up the form
    public SimpleCancellationForm() {
        // Set the title of the form window
        setTitle("Cancellation Form");

        // Disable layout managers to manually position components
        setLayout(null);

        // Initialize the components
        pnrLabel = new JLabel("PNR Number:");    // Label for PNR
        pnrText = new JTextField();              // Text field for PNR input
        cancelButton = new JButton("Cancel");    // Button for cancellation action

        // Set the position and size of the components (x, y, width, height)
        pnrLabel.setBounds(50, 30, 100, 30);     // PNR label at (50, 30) with width 100, height 30
        pnrText.setBounds(150, 30, 150, 30);     // PNR input box at (150, 30) with width 150, height 30
        cancelButton.setBounds(150, 70, 100, 30); // Cancel button at (150, 70) with width 100, height 30

        // Add the components to the frame (window)
        add(pnrLabel);
        add(pnrText);
        add(cancelButton);

        // Attach the action listener to the cancel button
        cancelButton.addActionListener(this);

        // Set the size of the window
        setSize(400, 200);

        // Make the window visible
        setVisible(true);

        // Close the application when the window is closed
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    // This method is called when the cancel button is clicked
    @Override
    public void actionPerformed(ActionEvent e) {
        // Get the PNR number entered by the user
        String pnr = pnrText.getText();

        // Show a confirmation message
        JOptionPane.showMessageDialog(this, "Cancellation Successful for PNR: " + pnr);
    }

    // Main method to run the program
    public static void main(String[] args) {
        // Create and show the cancellation form
        new SimpleCancellationForm();
    }
}
