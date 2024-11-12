package Banking.Software;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Bank_third_form extends JFrame implements ActionListener {

    JTextField adhar_field, pan_field, income_field;
    JButton clr_btn, Next_btn;
    JRadioButton r1, r2;
    JComboBox<String> occupationComboBox; // ComboBox for Occupation

    String fNumber;

    Bank_third_form(String fNumber) {
        this.fNumber = fNumber;

        JLabel label0 = new JLabel("Page: 3");
        label0.setBounds(900, 15, 350, 50);
        label0.setFont(new Font("Arial", Font.BOLD, 18));
        label0.setForeground(new Color(41, 40, 40));
        add(label0);

        JLabel label1 = new JLabel("Other Details");
        label1.setBounds(400, 30, 450, 60);
        label1.setFont(new Font("Arial", Font.BOLD, 35));
        label1.setForeground(new Color(9, 8, 7));
        add(label1);

        JLabel labela = new JLabel("Adhar Number:  ");
        labela.setBounds(250, 130, 350, 50);
        labela.setFont(new Font("Arial", Font.BOLD, 20));
        labela.setForeground(new Color(41, 40, 40));
        add(labela);

        adhar_field = new JTextField();
        adhar_field.setFont(new Font("Arial", Font.PLAIN, 20));
        adhar_field.setBackground(new Color(255, 255, 255));
        adhar_field.setBounds(450, 133, 380, 40);
        add(adhar_field);

        JLabel labelp = new JLabel("PAN Number:  ");
        labelp.setBounds(250, 200, 350, 50);
        labelp.setFont(new Font("Arial", Font.BOLD, 20));
        labelp.setForeground(new Color(41, 40, 40));
        add(labelp);

        pan_field = new JTextField();
        pan_field.setFont(new Font("Arial", Font.PLAIN, 20));
        pan_field.setBackground(new Color(255, 255, 255));
        pan_field.setBounds(450, 203, 380, 40);
        add(pan_field);

        JLabel label3 = new JLabel("Occupation:  ");
        label3.setBounds(250, 270, 350, 50);
        label3.setFont(new Font("Arial", Font.BOLD, 20));
        label3.setForeground(new Color(41, 40, 40));
        add(label3);

        // Occupation ComboBox
        String[] occupations = {"Select Options", "Student", "Employed", "Self Employed", "Businessman", "Farmer", "Other"};
        occupationComboBox = new JComboBox<>(occupations);
        occupationComboBox.setFont(new Font("Arial", Font.PLAIN, 20));
        occupationComboBox.setBounds(450, 273, 380, 40);
        add(occupationComboBox);

        JLabel status = new JLabel("Status:  ");
        status.setBounds(250, 340, 350, 50);
        status.setFont(new Font("Arial", Font.BOLD, 20));
        status.setForeground(new Color(41, 40, 40));
        add(status);

        r1 = new JRadioButton("Married");
        r1.setFont(new Font("Arial", Font.BOLD, 18));
        r1.setBounds(460, 340, 150, 50);
        r1.setBackground(new Color(88, 141, 214));
        add(r1);

        r2 = new JRadioButton("Unmarried");
        r2.setBackground(new Color(88, 141, 214));
        r2.setFont(new Font("Arial", Font.BOLD, 18));
        r2.setBounds(610, 340, 150, 50);
        add(r2);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);

        JLabel labelc = new JLabel("Yearly Income:  ");
        labelc.setBounds(250, 410, 350, 50);
        labelc.setFont(new Font("Arial", Font.BOLD, 20));
        labelc.setForeground(new Color(41, 40, 40));
        add(labelc);

        income_field = new JTextField();
        income_field.setFont(new Font("Arial", Font.PLAIN, 20));
        income_field.setBackground(new Color(255, 255, 255));
        income_field.setBounds(450, 413, 380, 40);
        add(income_field);

        clr_btn = new JButton("Clear");
        clr_btn.setForeground(new Color(0, 0, 0));
        clr_btn.setBackground(new Color(0xFDFDFD));
        clr_btn.setFont(new Font("Arial", Font.PLAIN, 18));
        clr_btn.setBounds(395, 515, 90, 40);
        clr_btn.addActionListener(this);
        add(clr_btn);

        Next_btn = new JButton("Next");
        Next_btn.setForeground(new Color(255, 255, 255));
        Next_btn.setBackground(new Color(0x6262DD));
        Next_btn.setFont(new Font("Arial", Font.BOLD, 25));
        Next_btn.setBounds(550, 515, 150, 40);
        Next_btn.addActionListener(this);
        add(Next_btn);

        getContentPane().setBackground(new Color(88, 141, 214));
        setLayout(null);
        setSize(1050, 650);
        setLocation(280, 100);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Type converting
        String adharNumber = adhar_field.getText().trim();
        String panNumber = pan_field.getText().trim();
        String income = income_field.getText().trim();
        String occupation = (String) occupationComboBox.getSelectedItem();
        String maritalStatus = r1.isSelected() ? "Married" : "Unmarried";
        String panRegex = "^[A-Z]{5}[0-9]{4}[A-Z]{1}$";  // PAN regex updated
        String adharRegex = "^[0-9]{12}$"; // Adhar regex updated (12 digit number)
        String incomeRegex = "^[0-9]+$"; // Income regex to allow only digits
        String formNumber = fNumber;

        if (e.getSource() == clr_btn) {
            adhar_field.setText("");
            pan_field.setText("");
            income_field.setText("");
            occupationComboBox.setSelectedIndex(0); // Reset combo box
            r1.setSelected(false);
            r2.setSelected(false);
        }

        if (e.getSource() == Next_btn) {
            if (adharNumber.isEmpty() || panNumber.isEmpty() || income.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please Enter All Details.", "Input Error", JOptionPane.ERROR_MESSAGE);
            } else if (occupationComboBox.getSelectedItem().equals("Select Options")) {
                JOptionPane.showMessageDialog(this, "Please select an occupation.", "Input Error", JOptionPane.ERROR_MESSAGE);
            } else if (!r1.isSelected() && !r2.isSelected()) {
                JOptionPane.showMessageDialog(this, "Please select marital status.", "Input Error", JOptionPane.ERROR_MESSAGE);
            } else if (!panNumber.matches(panRegex)) {
                JOptionPane.showMessageDialog(this, "Please Enter PAN Number correctly.", "Input Error", JOptionPane.ERROR_MESSAGE);
            } else if (!adharNumber.matches(adharRegex)) {
                JOptionPane.showMessageDialog(this, "Please Enter Adhar Number correctly.", "Input Error", JOptionPane.ERROR_MESSAGE);
            } else if (!income.matches(incomeRegex)) {
                JOptionPane.showMessageDialog(this, "Please Enter income correctly.", "Input Error", JOptionPane.ERROR_MESSAGE);
            } else {
                try {
                    // Database connection
                    DatabaseConnection con2 = new DatabaseConnection();
                    if (con2.connection == null) {
                        JOptionPane.showMessageDialog(this, "Database connection failed!", "Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }

                    // Check if formNumber exists in the account table (foreign key check)
                    String checkFormNumberQuery = "SELECT COUNT(*) FROM account WHERE formNumber = ?";
                    PreparedStatement checkStmt = con2.connection.prepareStatement(checkFormNumberQuery);
                    checkStmt.setString(1, formNumber);
                    ResultSet rs = checkStmt.executeQuery();
                    rs.next();
                    if (rs.getInt(1) == 0) {
                        JOptionPane.showMessageDialog(this, "Form number does not exist!", "Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }

                    // If formNumber exists, update data in the account table
                    String updateQuery = "UPDATE account SET adharNumber = ?, panNumber = ?, occupation = ?, status = ?, yearlyIncome = ? WHERE formNumber = ?";
                    PreparedStatement pstmt = con2.connection.prepareStatement(updateQuery);
                    pstmt.setString(1, adharNumber);
                    pstmt.setString(2, panNumber);
                    pstmt.setString(3, occupation);
                    pstmt.setString(4, maritalStatus);
                    pstmt.setString(5, income);
                    pstmt.setString(6, formNumber);  // Make sure to update based on formNumber

                    int rowsAffected = pstmt.executeUpdate();
                    if (rowsAffected > 0) {
                        new Bank_frth_form(formNumber);
                        setVisible(false);
                    } else {
                        JOptionPane.showMessageDialog(this, "Error updating data.");
                    }

                    checkStmt.close();
                    pstmt.close();
                    con2.connection.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(this, "Database error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }
}
