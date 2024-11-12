package Banking.Software;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class Open_new_account extends JFrame implements ActionListener {
    JButton button, exitbtn;

    String emailid;
    String formNumber;  // Instance variable to store the form number

    // Constructor accepts emailId
    Open_new_account(String emailId) {
        this.emailid = emailId;  // Store the emailId passed to the constructor
        this.formNumber = null;  // Initialize formNumber to null

        // Set up the JFrame and its components
        JPanel panel = new JPanel();
        panel.setBackground(new Color(255, 255, 255));
        panel.setLayout(null);
        setContentPane(panel);

        button = new JButton("Open New Account");
        button.setForeground(new Color(255, 255, 255));
        button.setBackground(new Color(0x5757BC));
        button.setFont(new Font("Arial", Font.BOLD, 25));
        button.setBounds(500, 320, 290, 70);
        button.addActionListener(this);
        add(button);

        exitbtn = new JButton("Exit");
        exitbtn.setForeground(new Color(0, 0, 0));
        exitbtn.setBackground(Color.white);
        exitbtn.setFont(new Font("Arial", Font.BOLD, 11));
        exitbtn.setBounds(960, 560, 60, 40);
        exitbtn.addActionListener(this);
        add(exitbtn);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/man2-showing-image-transformed.jpeg"));
        Image i2 = i1.getImage().getScaledInstance(850, 450, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel login_images = new JLabel(i3);
        login_images.setBounds(0, 30, 650, 350);
        add(login_images);

        setLayout(null);
        setSize(1050, 650);
        setLocation(280, 100);
        setBackground(new Color(149, 14, 14));
        setVisible(true);

        fetchFormNumber(emailId);  // Fetch form number when the window is created
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            if (formNumber != null) {
                new Bank_first_form(formNumber);  // Pass the formNumber to Bank_first_form
            } else {
                JOptionPane.showMessageDialog(this, "Form number not found!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else if (e.getSource() == exitbtn) {
            System.exit(0); // Exit the application when the exit button is clicked
        }
    }

    private void fetchFormNumber(String emailId) {
        try {
            DatabaseConnection con1 = new DatabaseConnection();
            String query = "SELECT formNumber FROM SignUp WHERE emailId = ?";
            PreparedStatement pstmt = con1.connection.prepareStatement(query);
            pstmt.setString(1, emailId);  // Set emailId as the parameter

            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next())
                    formNumber = rs.getString("formNumber");  // Store the fetched form number
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Database error occurred: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}

