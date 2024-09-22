import javax.swing.*;  // Import Swing for GUI components
import java.awt.event.*;  // Import for handling button actions

public class SimpleLoginForm extends JFrame implements ActionListener {

    // Declare UI components
    private JLabel userLabel, passwordLabel; // Labels for username and password
    private JTextField userText;             // Text field for username
    private JPasswordField passwordText;     // Password field to hide the password input
    private JButton loginButton;             // Button to submit the login

    // Constructor to set up the form
    public SimpleLoginForm() {
        // Set the title of the form window
        setTitle("Login Form");

        // Disable layout managers to manually position components
        setLayout(null);

        // Initialize the components
        userLabel = new JLabel("Username:");
        passwordLabel = new JLabel("Password:");
        userText = new JTextField();
        passwordText = new JPasswordField();  // Use JPasswordField to mask password input
        loginButton = new JButton("Login");

        // Set the position and size of the components (x, y, width, height)
        userLabel.setBounds(50, 30, 100, 30);
        userText.setBounds(150, 30, 150, 30);
        passwordLabel.setBounds(50, 70, 100, 30);
        passwordText.setBounds(150, 70, 150, 30);
        loginButton.setBounds(150, 110, 100, 30);

        // Add components to the form
        add(userLabel);
        add(userText);
        add(passwordLabel);
        add(passwordText);
        add(loginButton);

        // Attach the action listener to the login button
        loginButton.addActionListener(this);

        // Set the size of the window
        setSize(400, 200);

        // Make the window visible
        setVisible(true);

        // Close the application when the window is closed
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    // This method is called when the login button is clicked
    @Override
    public void actionPerformed(ActionEvent e) {
        // Get the username and password entered by the user
        String username = userText.getText();
        String password = new String(passwordText.getPassword()); // Get password as string

        // Hardcoded correct username and password
        String correctUsername = "admin";
        String correctPassword = "pass123";

        // Check if the entered credentials are correct
        if (username.equals(correctUsername) && password.equals(correctPassword)) {
            JOptionPane.showMessageDialog(this, "Login Successful!");
        } else {
            JOptionPane.showMessageDialog(this, "Login Failed: Incorrect Username or Password");
        }
    }

    // Main method to run the program
    public static void main(String[] args) {
        // Create and show the login form
        new SimpleLoginForm();
    }
}
