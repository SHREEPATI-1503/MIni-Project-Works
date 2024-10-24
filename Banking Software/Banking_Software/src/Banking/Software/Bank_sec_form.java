package Banking.Software;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Bank_sec_form extends JFrame implements ActionListener {

    JButton Next_btn, Clr_btn;
    JTextField addr1_field, pincode_field,city_field,state_field,phone_field,email_field;
    JComboBox<String> occupationComboBox;
    Bank_sec_form(){

        JLabel label0 = new JLabel("Page: 2");
        label0.setBounds(900, 15, 350, 50);
        label0.setFont(new Font("Arial", Font.BOLD, 18));
        label0.setForeground(new Color(41, 40, 40));
        add(label0);


        JLabel label1 = new JLabel("Communication Details");
        label1.setBounds(330, 30, 450, 60);
        label1.setFont(new Font("Arial", Font.BOLD, 35));
        label1.setForeground(new Color(9, 8, 7));
        add(label1);


        JLabel labelp = new JLabel("Phone No:  ");
        labelp.setBounds(250, 130, 350, 50);
        labelp.setFont(new Font("Arial", Font.BOLD, 20));
        labelp.setForeground(new Color(41, 40, 40));
        add(labelp);

        String[] occupations = {"Country Code ","+91 india"};
        occupationComboBox = new JComboBox<>(occupations);
        occupationComboBox.setFont(new Font("Arial", Font.PLAIN, 15));
        occupationComboBox.setBounds(450, 133, 130, 40);
        add(occupationComboBox);

        phone_field = new JTextField();
        phone_field.setFont(new Font("Arial", Font.PLAIN, 20));
        phone_field.setBackground(new Color(255, 255, 255));
        phone_field.setBounds(585, 133, 250, 40);
        add(phone_field);

        JLabel labelE = new JLabel("Email Id:  ");
        labelE.setBounds(250, 200, 350, 50);
        labelE.setFont(new Font("Arial", Font.BOLD, 20));
        labelE.setForeground(new Color(41, 40, 40));
        add(labelE);

        email_field = new JTextField();
        email_field.setFont(new Font("Arial", Font.PLAIN, 20));
        email_field.setBackground(new Color(255, 255, 255));
        email_field.setBounds(450, 203, 380, 40);
        add(email_field);


        JLabel label3 = new JLabel("Address Line 1:  ");
        label3.setBounds(250, 270, 350, 50);
        label3.setFont(new Font("Arial", Font.BOLD, 20));
        label3.setForeground(new Color(41, 40, 40));
        add(label3);

        addr1_field = new JTextField();
        addr1_field.setFont(new Font("Arial", Font.PLAIN, 20));
        addr1_field.setBackground(new Color(255, 255, 255));
        addr1_field.setBounds(450, 273, 380, 40);
        add(addr1_field);


        JLabel label4 = new JLabel("Pincode:  ");
        label4.setBounds(250, 340, 350, 50);
        label4.setFont(new Font("Arial", Font.BOLD, 20));
        label4.setForeground(new Color(41, 40, 40));
        add(label4);

        pincode_field = new JTextField(6);
        pincode_field.setFont(new Font("Arial", Font.PLAIN, 20));
        pincode_field.setBackground(new Color(255, 255, 255));
        pincode_field.setBounds(450, 343, 380, 40);
        add(pincode_field);


        JLabel label5 = new JLabel("City:  ");
        label5.setBounds(250, 410, 350, 50);
        label5.setFont(new Font("Arial", Font.BOLD, 20));
        label5.setForeground(new Color(41, 40, 40));
        add(label5);

        city_field = new JTextField();
        city_field.setFont(new Font("Arial", Font.PLAIN, 20));
        city_field.setBackground(new Color(255, 255, 255));
        city_field.setBounds(450, 413, 380, 40);
        add(city_field);


        JLabel label6 = new JLabel("State:  ");
        label6.setBounds(250, 480, 350, 50);
        label6.setFont(new Font("Arial", Font.BOLD, 20));
        label6.setForeground(new Color(41, 40, 40));
        add(label6);


        state_field = new JTextField();
        state_field.setFont(new Font("Arial", Font.PLAIN, 20));
        state_field.setBackground(new Color(255, 255, 255));
        state_field.setBounds(450, 483, 380, 40);
        add(state_field);



        Clr_btn= new JButton("Clear");
        Clr_btn.setForeground(new Color(0, 0, 0));
        Clr_btn.setBackground(new Color(0xFDFDFD));
        Clr_btn.setFont(new Font("Arial", Font.PLAIN, 18));
        Clr_btn.setBounds(395, 545, 90, 40);
        Clr_btn.addActionListener(this);
        add(Clr_btn);

        Next_btn = new JButton("Next");
        Next_btn.setForeground(new Color(255, 255, 255));
        Next_btn.setBackground(new Color(0x6262DD));
        Next_btn.setFont(new Font("Arial", Font.BOLD, 25));
        Next_btn.setBounds(550, 545, 150, 40);
        Next_btn.addActionListener(this);
        add(Next_btn);




        getContentPane().setBackground(new Color(52, 111, 195));
        setLayout(null);
        setSize(1050, 650);
        setLocation(280, 100);
        setBackground(new Color(255, 255, 255));
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String phone_number = phone_field.getText().trim();
        String addr1 = addr1_field.getText().trim();
        String pincode = pincode_field.getText().trim();
        String city = city_field.getText().trim();
        String state = state_field.getText().trim();

        String email= email_field.getText().trim();
        String emailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        String phoneRegex = "^[0-9]+[0-9]+[0-9]$";

        try{

            if(e.getSource() == Clr_btn)
            {
               phone_field.setText("");
               email_field.setText("");
               addr1_field.setText("");
               pincode_field.setText("");
               city_field.setText("");
               state_field.setText("");
            }

            if (e.getSource() == Next_btn)
            {
                if (phone_number.isEmpty() || email.isEmpty() || addr1.isEmpty() || pincode.isEmpty() || city.isEmpty() || state.isEmpty())
                {
                    JOptionPane.showMessageDialog(this, "Please Enter all the Details");
                    return;
                }
                if (!email.matches(emailRegex)) {
                    JOptionPane.showMessageDialog(this, "Please enter a valid email address.", "Input Error", JOptionPane.ERROR_MESSAGE);
                }
                if (!phone_number.matches(phoneRegex)) {
                    JOptionPane.showMessageDialog(this, "Please enter a valid Phone Number.", "Input Error", JOptionPane.ERROR_MESSAGE);
                }



            }

        }catch (Exception E){
            E.fillInStackTrace();
        }
    }

    public static void main(String [] a)
    {
       new Bank_sec_form();
    }
}
