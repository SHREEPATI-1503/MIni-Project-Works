package Banking.Software;

import javax.swing.*;
import javax.swing.table.TableColumn;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame implements ActionListener{
 //DECLARING GLOBAL LABEL AND BUTTONS VARIABLE TO ACCESS IN THE J PANEL
    JLabel label1,label2,label3;
    JTextField textField;
    JPasswordField passwordField;
    JButton button1,button2,button3;

    Login(){
        super("Internet Banking "); //FOR TITLE OF THE PAGE
        label1 = new JLabel("Login");
        label1.setForeground(Color.black);
        label1.setFont(new Font("calibri", Font.BOLD,50));
        label1.setBounds(445,45,350,60);
        add(label1); // ADDS LABEL IN TO THE PANEL


        //ADDING LABEL CODE FOR ENTER_USERNAME LABEL
        label2 = new JLabel("Enter Username");
        label2.setForeground(Color.black);
        label2.setFont(new Font("calibri", Font.BOLD,20));
        label2.setBounds(270,105,350,80);
        add(label2);


        // ADDING THE TEXTFIELD FOR THE ENTER THE USER_NAME
        textField = new JTextField(15);
        textField.setBounds(270,170,450,45);
        textField.setFont(new Font("Arial",Font.BOLD,18));
        add(textField);


        //ADDING LABEL CODE FOR ENTER_PASSWORD LABEL
        label3 = new JLabel("Enter Password");
        label3.setForeground(Color.black);
        label3.setFont(new Font("calibri", Font.BOLD,20));
        label3.setBounds(270,220,350,80);
        add(label3);


        // ADDING THE PASSWORD FIELD FOR THE ENTER THE PASSWORD COLUMN
        passwordField = new JPasswordField(15);
        passwordField.setBounds(270,285,450,45);
        passwordField.setFont(new Font("Arial",Font.BOLD,25));
        add(passwordField);


        //ADDING LOGIN BUTTONS AND CREATING BUTTON
        button1 = new JButton("Login");
        button1.setFont(new Font("arial",Font.BOLD,20));
        button1.setForeground(Color.white);
        button1.setBounds(390,350,230,50);
        button1.setBackground(Color.black);
        button1.addActionListener(this);
        add(button1);

        // OR TEXT
        label3 = new JLabel("or");
        label3.setForeground(Color.black);
        label3.setFont(new Font("calibri", Font.PLAIN,25));
        label3.setBounds(490,390,350,80);
        add(label3);

        // CREATING FORGOT PASSWORD BUTTON FOR THE LOGIN PAGE
        button2 = new JButton("Forgot Password?");
        button2.setFont(new Font("arial",Font.PLAIN,20));
        button2.setForeground(Color.blue);
        button2.setBounds(390,450,230,50);//LOCATION AND SIZE OF THE BUTTONS
        button2.setBackground(Color.WHITE);
        button2.addActionListener(this); //ADDING THE ACTION LISTENER
        add(button2);


        // TRYING TO ADD THE CLEAR BUTTON TO THE J PANEL
        button3 = new JButton("Clear");
        button3.setFont(new Font("arial",Font.PLAIN,17));
        button3.setForeground(Color.BLACK);
        button3.setBounds(0,0,80,38);
        button3.setBackground(Color.WHITE);
        button3.addActionListener(this);
        add(button3);



        //ADDING LOGIN BACKGROUND IMAGES FOR LOGIN PAGE
        ImageIcon lbi1 = new ImageIcon(ClassLoader.getSystemResource("icon/login-back-image.jpg")); // ADDING IMAGE LOCATION PATH IN THE QUOTES
        Image lbi2 = lbi1.getImage().getScaledInstance(650,540, Image.SCALE_DEFAULT);
        ImageIcon lbi3 = new ImageIcon(lbi2);
        JLabel image = new JLabel(lbi3);
        image.setBounds(210,30,650,530);
        add(image);



        //ADDING BACKGROUND IMAGE INTO THE JFRAME OR PANEL
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("")); // ADDING IMAGE LOCATION PATH IN THE QUOTES
        Image i2 = i1.getImage().getScaledInstance(1050,650, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel login_images = new JLabel(i3);
        login_images.setBounds(0,0,1050,650);
        add(login_images);



        //SETTING THE J PANEL SIZE AND VISIBLE AND ALSO SET THE LOCATION OF THE PAGE
        setBackground(Color.WHITE);
        setLayout(null);
        setSize(1050,650);
        setLocation(280,100);
        setVisible(true);

    }
// HANDLING THE EVENT LISTENER AND PERFORMING OF 3 BUTTONS
    @Override
    public void actionPerformed(ActionEvent e) {

        try{

            if(e.getSource() ==button1)
            {
                String username = textField.getText().trim();
                String password = new String(passwordField.getPassword());

                if (username.isEmpty() || password.isEmpty()) {
                    JOptionPane.showMessageDialog(this, "All fields must be filled out.");
                    return;
                }
                
            } else if (e.getSource() == button2) {
                
            }

            else if (e.getSource() == button3) {
                //CLEARING THE BOTH TEXT FIELD
                textField.setText("");
                passwordField.setText("");
            }
        }catch (Exception E){   //IF THE EXCEPTION OCCURS THEN HANDLING USING CATCH
            E.fillInStackTrace();
        }
    }

    public static void main(String [] args){
        new Login();
    }
}
