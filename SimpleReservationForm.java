import javax.swing.*;  // Import Swing for GUI components
import java.awt.event.*;  // Import for handling actions (button click)

public class SimpleReservationForm extends JFrame implements ActionListener {

    // Declare the UI components
    private JLabel nameLabel, trainNumberLabel, fromLabel, toLabel, dateLabel;
    private JTextField nameText, trainNumberText, fromText, toText, dateText;
    private JButton reserveButton;

    // Constructor to create and set up the form
    public SimpleReservationForm() {
        // Set the title of the form window
        setTitle("Reservation Form");

        // Disable layout managers so we can manually place components
        setLayout(null);

        // Initialize the components
        nameLabel = new JLabel("Name:");          // Label for user's name
        trainNumberLabel = new JLabel("Train No:"); // Label for train number
        fromLabel = new JLabel("From:");           // Label for starting point
        toLabel = new JLabel("To:");               // Label for destination
        dateLabel = new JLabel("Date:");           // Label for journey date

        nameText = new JTextField();               // Text field for name input
        trainNumberText = new JTextField();        // Text field for train number
        fromText = new JTextField();               // Text field for starting point
        toText = new JTextField();                 // Text field for destination
        dateText = new JTextField();               // Text field for journey date

        reserveButton = new JButton("Reserve");    // Button to reserve ticket

        // Set the position and size of components
        nameLabel.setBounds(50, 30, 100, 30);      // (x, y, width, height)
        nameText.setBounds(150, 30, 150, 30);
        trainNumberLabel.setBounds(50, 70, 100, 30);
        trainNumberText.setBounds(150, 70, 150, 30);
        fromLabel.setBounds(50, 110, 100, 30);
        fromText.setBounds(150, 110, 150, 30);
        toLabel.setBounds(50, 150, 100, 30);
        toText.setBounds(150, 150, 150, 30);
        dateLabel.setBounds(50, 190, 100, 30);
        dateText.setBounds(150, 190, 150, 30);
        reserveButton.setBounds(150, 230, 100, 30);

        // Add components to the frame (form window)
        add(nameLabel);
        add(nameText);
        add(trainNumberLabel);
        add(trainNumberText);
        add(fromLabel);
        add(fromText);
        add(toLabel);
        add(toText);
        add(dateLabel);
        add(dateText);
        add(reserveButton);

        // Attach the action listener to the reserve button
        reserveButton.addActionListener(this);

        // Set the size of the window
        setSize(400, 350);

        // Make the window visible
        setVisible(true);

        // Close the application when the window is closed
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    // This method is called when the reserve button is clicked
    @Override
    public void actionPerformed(ActionEvent e) {
        // Get the entered details
        String name = nameText.getText();
        String trainNumber = trainNumberText.getText();
        String from = fromText.getText();
        String to = toText.getText();
        String date = dateText.getText();

        // Show a confirmation message
        JOptionPane.showMessageDialog(this, "Reservation Successful for " + name);
    }

    // Main method to run the program
    public static void main(String[] args) {
        // Create and show the reservation form
        new SimpleReservationForm();
    }
}
