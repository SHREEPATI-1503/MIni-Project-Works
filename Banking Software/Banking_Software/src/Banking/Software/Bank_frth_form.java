package Banking.Software;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Bank_frth_form extends JFrame implements ActionListener {

    JComboBox<String> AccountOwner;
    JRadioButton Saving_Ac, Current_Ac, Fixed_Ac, Recurring_Ac;
    JButton Next_btn, Clr_btn;

    String fNumber;
    Bank_frth_form(String fNumber)
    {

        this.fNumber = fNumber;
        JLabel label0 = new JLabel(fNumber);
        label0.setBounds(900, 15, 350, 50);
        label0.setFont(new Font("Arial", Font.BOLD, 18));
        label0.setForeground(new Color(41, 40, 40));
        add(label0);

        JLabel label1 = new JLabel("Account Details");
        label1.setBounds(400, 30, 450, 60);
        label1.setFont(new Font("Arial", Font.BOLD, 35));
        label1.setForeground(new Color(9, 8, 7));
        add(label1);

        JLabel Account_type = new JLabel("Account Type:  ");
        Account_type.setBounds(200, 100, 350, 50);
        Account_type.setFont(new Font("Arial", Font.BOLD, 20));
        Account_type.setForeground(new Color(41, 40, 40));
        add(Account_type);

        Saving_Ac = new JRadioButton("Savings Account");
        Saving_Ac.setFont(new Font("Arial", Font.BOLD, 18));
        Saving_Ac.setBounds(250, 150, 250, 50);
        Saving_Ac.setBackground(new Color(105, 105, 204));
        add(Saving_Ac);

        Fixed_Ac = new JRadioButton("Fixed Desposite Account");
        Fixed_Ac.setFont(new Font("Arial", Font.BOLD, 18));
        Fixed_Ac.setBounds(550, 150, 250, 50);
        Fixed_Ac.setBackground(new Color(105, 105, 204));
        add(Fixed_Ac);


        Current_Ac = new JRadioButton("Current Account");
        Current_Ac.setFont(new Font("Arial", Font.BOLD, 18));
        Current_Ac.setBounds(250, 200, 250, 50);
        Current_Ac.setBackground(new Color(105, 105, 204));
        add(Current_Ac);


        Recurring_Ac = new JRadioButton("Recurring Deposite Account");
        Recurring_Ac.setFont(new Font("Arial", Font.BOLD, 18));
        Recurring_Ac.setBounds(550, 200, 300, 50);
        Recurring_Ac.setBackground(new Color(105, 105, 204));
        add(Recurring_Ac);

        ButtonGroup AccountType = new ButtonGroup();
        AccountType.add(Saving_Ac);
        AccountType.add(Current_Ac);
        AccountType.add(Fixed_Ac);
        AccountType.add(Recurring_Ac);


        JLabel status = new JLabel("Account Owner Type: ");
        status.setBounds(200, 285, 350, 50);
        status.setFont(new Font("Arial", Font.BOLD, 20));
        status.setForeground(new Color(41, 40, 40));
        add(status);


        String[] occupations = {"Select Options","INDIVIDUAL","BUSINESS","COMBINED","MINOR"};
        AccountOwner = new JComboBox<>(occupations);
        AccountOwner.setFont(new Font("Arial", Font.PLAIN, 20));
        AccountOwner.setBounds(470, 288, 380, 40);
        add(AccountOwner);


        JLabel service_r = new JLabel("Services Required: ");
        service_r.setBounds(200, 340, 350, 50);
        service_r.setFont(new Font("Arial", Font.BOLD, 20));
        service_r.setForeground(new Color(41, 40, 40));
        add(service_r);

        JCheckBox Atmcard = new JCheckBox("Atm Card");
        Atmcard.setForeground(new Color(0,0,0));
        Atmcard.setBackground(new Color(105, 105, 204));
        Atmcard.setFont(new Font("Arial", Font.PLAIN, 20));
        Atmcard.setBounds(250,390,300,50);
        add(Atmcard);

        JCheckBox Chequebook = new JCheckBox("Cheque Book");
        Chequebook.setForeground(new Color(0,0,0));
        Chequebook.setBackground(new Color(105, 105, 204));
        Chequebook.setFont(new Font("Arial", Font.PLAIN, 20));
        Chequebook.setBounds(550,390,300,50);
        add(Chequebook);


        JCheckBox statement = new JCheckBox("E-Statement");
        statement.setForeground(new Color(0,0,0));
        statement.setBackground(new Color(105, 105, 204));
        statement.setFont(new Font("Arial", Font.PLAIN, 20));
        statement.setBounds(250,435,300,50);
        add(statement);

        JCheckBox mblbanking = new JCheckBox("Internet Banking");
        mblbanking.setForeground(new Color(0,0,0));
        mblbanking.setBackground(new Color(105, 105, 204));
        mblbanking.setFont(new Font("Arial", Font.PLAIN, 20));
        mblbanking.setBounds(550,435,300,50);
        add(mblbanking);

        JCheckBox emailalt = new JCheckBox("Email ALert");
        emailalt.setForeground(new Color(0,0,0));
        emailalt.setBackground(new Color(105, 105, 204));
        emailalt.setFont(new Font("Arial", Font.PLAIN, 20));
        emailalt.setBounds(250,475,300,50);
        add(emailalt);

        JCheckBox smsAlert = new JCheckBox("Sms Alert");
        smsAlert.setForeground(new Color(0,0,0));
        smsAlert.setBackground(new Color(105, 105, 204));
        smsAlert.setFont(new Font("Arial", Font.PLAIN, 20));
        smsAlert.setBounds(550,475,300,50);
        add(smsAlert);


        Clr_btn = new JButton("Clear");
        Clr_btn.setForeground(new Color(0, 0, 0));
        Clr_btn.setBackground(new Color(0xFDFDFD));
        Clr_btn.setFont(new Font("Arial", Font.PLAIN, 18));
        Clr_btn.setBounds(395, 550, 90, 40);
        Clr_btn.addActionListener(this);
        add(Clr_btn);

        Next_btn = new JButton("Next");
        Next_btn.setForeground(new Color(255, 255, 255));
        Next_btn.setBackground(new Color(0x6262DD));
        Next_btn.setFont(new Font("Arial", Font.BOLD, 25));
        Next_btn.setBounds(550, 550, 150, 40);
        Next_btn.addActionListener(this);
        add(Next_btn);




        getContentPane().setBackground(new Color(105, 105, 204));
        setLayout(null);
        setSize(1050, 650);
        setLocation(280, 100);
        setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {

        String formNumber = fNumber;



        String ownerType = (String) AccountOwner.getSelectedItem();
        String accountTp = null;
        if (Saving_Ac.isSelected()) {
            accountTp = "Saving Account";
        }
        else if(Recurring_Ac.isSelected()) {
            accountTp = "Recurring Account";
        }
        else if (Fixed_Ac.isSelected()){
            accountTp = "Fixed Account";
        }else {
            accountTp = "Current Account";
        }

     



        if (AccountOwner.getSelectedItem().equals("Select Options")) {
            JOptionPane.showMessageDialog(this, "Please select an option.", "Input Error", JOptionPane.ERROR_MESSAGE);
        }else if (!Saving_Ac.isSelected() && !Fixed_Ac.isSelected() && !Recurring_Ac.isSelected() && !Current_Ac.isSelected())
        {
            JOptionPane.showMessageDialog(this, "Please select Account Type.", "Input Error", JOptionPane.ERROR_MESSAGE);
        }




        try{

            if (e.getSource() == Clr_btn)
            {

            }
        }catch (Exception E){
            E.fillInStackTrace();
        }
    }


}
