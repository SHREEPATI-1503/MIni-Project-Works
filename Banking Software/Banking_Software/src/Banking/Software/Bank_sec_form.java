package Banking.Software;

import javax.swing.*;
import java.awt.*;

public class Bank_sec_form extends JFrame {

    JRadioButton r1,r2;

    Bank_sec_form(){

        JLabel label1 = new JLabel("Page: 2");
        label1.setBounds(900, 30, 350, 50);
        label1.setFont(new Font("Arial", Font.BOLD, 18));
        label1.setForeground(new Color(41, 40, 40));
        add(label1);

        JLabel label2 = new JLabel("Gender:  ");
        label2.setBounds(250, 135, 350, 50);
        label2.setFont(new Font("Arial", Font.BOLD, 20));
        label2.setForeground(new Color(41, 40, 40));
        add(label2);


        r1 = new JRadioButton("Male");
        r1.setFont(new Font("Arial", Font.BOLD, 18));
        r1.setBounds(350, 135, 150, 50);
        r1.setBackground(new Color(52, 111, 195));
        add(r1);


        r2 = new JRadioButton("Female");
        r2.setBackground(new Color(52, 111, 195));
        r2.setFont(new Font("Arial", Font.BOLD, 18));
        r2.setBounds(450, 205, 150, 50);
        add(r2);


        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);


        getContentPane().setBackground(new Color(52, 111, 195));
        setLayout(null);
        setSize(1050, 650);
        setLocation(280, 100);
        setBackground(new Color(255, 255, 255));
        setVisible(true);
    }

    public static void main(String [] a)
    {
       new Bank_sec_form();
    }
}
