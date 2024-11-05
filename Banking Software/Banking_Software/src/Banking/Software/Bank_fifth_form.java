package Banking.Software;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Bank_fifth_form extends JFrame implements ActionListener{

    Random accnumber = new Random();
    long accountnumber = (accnumber.nextLong() % 9000000L) + 22965680000000L;
    String accountNumber = " " + Math.abs(accountnumber);



    Random cardnumber = new Random();
    long cardnum = (accnumber.nextLong() % 90000L) + 325656900000L;
    String cardNumber = " " + Math.abs(cardnum);

    Random cardpin = new Random();
    long cardp = (accnumber.nextLong() % 9000L) + 5200L;
    String cardPinNumber = " " + Math.abs(cardnum);



    JComboBox<String> religionCombox, categoryCombobox, ifscCombobox;

    JRadioButton r1,r2,r3,r4;
    JCheckBox termsconditions;
    JButton submitBtn;

    Bank_fifth_form()
    {

        JLabel label1 = new JLabel("Additional Details");
        label1.setBounds(380, 30, 350, 60);
        label1.setFont(new Font("Arial", Font.BOLD, 30));
        label1.setForeground(new Color(9, 8, 7));
        add(label1);

        JLabel label3 = new JLabel("Religion        :");
        label3.setBounds(250, 120, 350, 50);
        label3.setFont(new Font("Arial", Font.BOLD, 20));
        label3.setForeground(new Color(41, 40, 40));
        add(label3);

        // Occupation ComboBox
        String[] religions = {"Select Options","Hindu","Muslim","Christ","Other"};
        religionCombox = new JComboBox<>(religions);
        religionCombox.setFont(new Font("Arial", Font.PLAIN, 20));
        religionCombox.setBounds(450, 123, 350, 40);
        add(religionCombox);


        JLabel label4 = new JLabel("Category        :");
        label4.setBounds(250, 190, 350, 50);
        label4.setFont(new Font("Arial", Font.BOLD, 20));
        label4.setForeground(new Color(41, 40, 40));
        add(label4);

        // Occupation ComboBox
        String[] category = {"Select Options","General","SC/ST","OBC","Other"};
        categoryCombobox = new JComboBox<>(category);
        categoryCombobox.setFont(new Font("Arial", Font.PLAIN, 20));
        categoryCombobox.setBounds(450, 193, 350, 40);
        add(categoryCombobox);


        JLabel label5= new JLabel("IFSC Code        :");
        label5.setBounds(250, 260, 350, 50);
        label5.setFont(new Font("Arial", Font.BOLD, 20));
        label5.setForeground(new Color(41, 40, 40));
        add(label5);

        // Occupation ComboBox
        String[] ifsccombo = {"Select Options","SBI00000432","SBI00000412","SBI00000442"};
        ifscCombobox = new JComboBox<>(ifsccombo);
        ifscCombobox.setFont(new Font("Arial", Font.PLAIN, 20));
        ifscCombobox.setBounds(450, 263, 350, 40);
        add(ifscCombobox);

        JLabel genderl = new JLabel("Senior Citizen   :");
        genderl.setBounds(250, 330, 350, 50);
        genderl.setFont(new Font("Arial", Font.BOLD, 20));
        genderl.setForeground(new Color(41, 40, 40));
        add(genderl);


        r1 = new JRadioButton("Yes");
        r1.setFont(new Font("Arial", Font.BOLD, 18));
        r1.setBounds(450, 330, 150, 50);
        r1.setBackground(new Color(88, 141, 214));
        add(r1);

        r2 = new JRadioButton("No");
        r2.setBackground(new Color(88, 141, 214));
        r2.setFont(new Font("Arial", Font.BOLD, 18));
        r2.setBounds(610, 330, 150, 50);
        add(r2);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);



        JLabel existinglabel = new JLabel("Existing Account   :");
        existinglabel.setBounds(250, 400, 350, 50);
        existinglabel.setFont(new Font("Arial", Font.BOLD, 20));
        existinglabel.setForeground(new Color(41, 40, 40));
        add(existinglabel);


        r3 = new JRadioButton("Yes");
        r3.setFont(new Font("Arial", Font.BOLD, 18));
        r3.setBounds(450, 400, 150, 50);
        r3.setBackground(new Color(88, 141, 214));
        add(r3);

        r3 = new JRadioButton("No");
        r3.setBackground(new Color(88, 141, 214));
        r3.setFont(new Font("Arial", Font.BOLD, 18));
        r3.setBounds(610, 400, 150, 50);
        add(r3);

        termsconditions = new JCheckBox("I hereby that I accept all your terms and Conditions");
        termsconditions.setForeground(new Color(0,0,0));
        termsconditions.setBackground(new Color(105, 105, 204));
        termsconditions.setFont(new Font("Arial", Font.PLAIN, 18));
        termsconditions.setBounds(350,475,500,50);
        add(termsconditions);

        submitBtn = new JButton("Submit");
        submitBtn.setForeground(new Color(255, 255, 255));
        submitBtn.setBackground(new Color(0x6262DD));
        submitBtn.setFont(new Font("Arial", Font.BOLD, 25));
        submitBtn.setBounds(450, 545, 150, 40);
        submitBtn.addActionListener(this);
        add(submitBtn);


        getContentPane().setBackground(new Color(105, 105, 204));
        setLayout(null);
        setSize(1050, 650);
        setLocation(280, 100);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public static void main(String args [])
    {
        new Bank_fifth_form();
    }
}
