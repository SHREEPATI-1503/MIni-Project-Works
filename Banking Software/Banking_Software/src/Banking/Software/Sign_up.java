package Banking.Software;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.Random;

public class Sign_up extends JFrame implements ActionListener {

    Random ran = new Random();
    long first4 = (ran.nextLong() % 9000L) + 1000L;
    String first = " " + Math.abs(first4);
    // DECLARING THE GLOBAL VARIABLE FOR TEXTFIELE AND LABEL AND BUTTONS
    JLabel label1,label2,label3,label4,label5; // DECLARING THE LABEL
    JTextField emailfield, phonefield; // DECLARING THE 2 TEXT FIELD
    JPasswordField pa_passwordfield, rp_passwordfield; // DECLARING THE PASSWORD FIELD
    JButton clearbtn, signupbtn; // DECLARING BUTTON
           Sign_up(){
               super("Sign Up page"); // IT GIVES THE TITLE TO PAGE

               //ADDING THE RESITER LABEL
               label1 = new JLabel("Register");
               label1.setForeground(Color.black);
               label1.setFont(new Font("calibri", Font.BOLD,50));
               label1.setBounds(220,45,350,60);
               add(label1); // ADDS LABEL IN TO THE PANEL


              // ADDING THE ENTER EMAIL LABEL
               label2 = new JLabel("Enter Email Address");
               label2.setForeground(Color.black);
               label2.setFont(new Font("Calibri", Font.BOLD,20));
               label2.setBounds(70,95,350,80);
               add(label2);


              // ADDING THE EMAIL TEXT FIELD
               emailfield = new JTextField(15);
               emailfield.setBounds(70,155,450,45);
               emailfield.setFont(new Font("Arial",Font.PLAIN,20));
               add(emailfield);


               // ADDING THE ENTER PHONE LABEL
               label3 = new JLabel("Enter Phone Number");
               label3.setForeground(Color.black);
               label3.setFont(new Font("Calibri", Font.BOLD,20));
               label3.setBounds(70,195,350,80);
               add(label3);


               // ADDING THE PHONE TEXT FIELD
               phonefield = new JTextField(15);
               phonefield.setBounds(70,255,450,45);
               phonefield.setFont(new Font("Arial",Font.PLAIN,20));
               add(phonefield);


               // ADDING THE ENTER PASSWORD LABEL
               label4 = new JLabel("Enter Password");
               label4.setForeground(Color.black);
               label4.setFont(new Font("calibri", Font.BOLD,20));
               label4.setBounds(70,290,350,80);
               add(label4);


               // ADDING THE PASSWORD FIELD
               pa_passwordfield = new JPasswordField(15);
               pa_passwordfield.setBounds(70,350,450,45);
               pa_passwordfield.setFont(new Font("Arial",Font.BOLD,25));
               add(pa_passwordfield);


               // ADDING THE ENTER CONFIRM PASSWORD LABEL
               label5 = new JLabel("Confirm Password");
               label5.setForeground(Color.black);
               label5.setFont(new Font("calibri", Font.BOLD,20));
               label5.setBounds(70,390,350,80);
               add(label5);


               // ADDING THE CONFIRM PASSWORD FIELD
              rp_passwordfield = new JPasswordField(15);
              rp_passwordfield.setBounds(70,450,450,45);
              rp_passwordfield.setFont(new Font("Arial",Font.BOLD,25));
              add(rp_passwordfield);


              // ADDING THE SIGNUP BUTTON TO THE JPANEL
               signupbtn = new JButton("Register");
               signupbtn.setForeground(new Color(255,255,255));
               signupbtn.setBackground(Color.blue);
               signupbtn.setFont(new Font("Arial", Font.BOLD,20));
               signupbtn.setBounds(170,515,250,50);
               signupbtn.addActionListener(this);
               add(signupbtn);



               // ADDING THE CLEAR BUTTON THE JPANEL
               clearbtn = new JButton("Clear");
               clearbtn.setForeground(new Color(0,0,0));
               clearbtn.setBackground(Color.WHITE);
               clearbtn.setFont(new Font("Arial", Font.BOLD,20));
               clearbtn.setBounds(900,545,100,40);
               clearbtn.addActionListener(this);
               add(clearbtn);



               ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/signup.jpeg")); // ADDING IMAGE LOCATION PATH IN THE QUOTES
               Image i2 = i1.getImage().getScaledInstance(1050,650, Image.SCALE_DEFAULT);
               ImageIcon i3 = new ImageIcon(i2);
               JLabel login_images = new JLabel(i3);
               login_images.setBounds(0,0,1050,650);
               add(login_images);


               //SETTING THE J PANEL SIZE AND VISIBLE AND ALSO SET THE LOCATION OF THE PAGE
               setBackground(new Color(200,100,50));
               setLayout(null);
               setSize(1050,650);
               setLocation(280,100);
               setVisible(true);
           }

    @Override
    public void actionPerformed(ActionEvent e) {
        String email = emailfield.getText();
        String phone = phonefield.getText();
        String password = new String(pa_passwordfield.getPassword());
        String confirmPassword = new String(rp_passwordfield.getPassword());
        String emailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        String formNumber = first;





        if(e.getSource() == clearbtn) // CLEARING ALL TEXT AND PASSWORD FIELD
        {
            emailfield.setText("");
            phonefield.setText("");
            pa_passwordfield.setText("");
            rp_passwordfield.setText("");

        }

        try
        {
            if (email.isEmpty() || phone.isEmpty() || password.isEmpty() || confirmPassword.isEmpty()) {
                JOptionPane.showMessageDialog(this, "All fields must be filled out.");
            }

            else if(!password.equals(confirmPassword)) {
                JOptionPane.showMessageDialog(this, "Passwords do not match.");
            }

            else if (!email.matches(emailRegex)) {
                JOptionPane.showMessageDialog(this, "Please enter a valid email address.", "Input Error", JOptionPane.ERROR_MESSAGE);
            }
         else {
             DatabaseConnection con1 = new DatabaseConnection();
                String Signupquery = "INSERT INTO SignUp(formNumber, emailId, Phonenumber, Password_firld) VALUES(?, ?, ?, ?)";
                PreparedStatement pstmt = con1.connection.prepareStatement(Signupquery);
                pstmt.setString(1, formNumber);
                pstmt.setString(2, email);
                pstmt.setString(3, phone);
                pstmt.setString(4, password);
                pstmt.executeUpdate();
                pstmt.close();

                JOptionPane.showMessageDialog(this,"+formNummber+");


//                new Login();
//                setVisible(false);
//             new Open_new_account();
//             setVisible(false);


         }

        }catch (SQLException sqlException) {
            System.out.println("SQL Exception: " + sqlException.getMessage());
        }
    }

    public static void main(String [] a){
            new Sign_up();
    }
}
