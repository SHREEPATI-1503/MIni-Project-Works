package Banking.Software;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;

public class AdminPanelHome extends JFrame {

    JTextField accountNumber, namefield,pinCodefield, nationalityfield, genderfield, adderessfield, accountTypefield, mobilefield,occuptionfield, ifscfield, panfield,emailfield, guardianfield, adharfield, statefield;
    JDateChooser dateChooser;
    JButton accountSeeBtn, WithdrawBtn, CustomerListBtn, TransctionBtn, CheckBalanceBtn, DepositBtn, ProfileBtn, Transferbtn, EditBtn,SaveBtn;
    AdminPanelHome()
    {
        JLabel label1 = new JLabel("Account No: ");
        label1.setBounds(500, 10, 350, 60);
        label1.setFont(new Font("Arial", Font.BOLD, 18));
        label1.setForeground(new Color(9, 8, 7));
        add(label1);

        accountNumber = new JTextField();
        accountNumber.setFont(new Font("Arial", Font.PLAIN, 20));
        accountNumber.setBackground(new Color(255, 255, 255));
        accountNumber.setBounds(650, 22, 250, 30);
        add(accountNumber);

        JLabel label2 = new JLabel("Date of Bith: ");
        label2.setBounds(500, 50, 350, 60);
        label2.setFont(new Font("Arial", Font.BOLD, 18));
        label2.setForeground(new Color(9, 8, 7));
        add(label2);

        dateChooser = new JDateChooser(); // Initialize here
        dateChooser.setForeground(new Color(132, 250, 68));
        dateChooser.setBounds(650, 63, 250, 30);
        add(dateChooser);

        accountSeeBtn = new JButton("GO");
        accountSeeBtn.setForeground(new Color(0, 0, 0));
        accountSeeBtn.setBackground(new Color(0xFDFDFD));
        accountSeeBtn.setFont(new Font("Arial", Font.PLAIN, 18));
        accountSeeBtn.setBounds(920, 45, 70, 30);
//        accountSeeBtn.addActionListener(this);
        add(accountSeeBtn);



        WithdrawBtn = new JButton("Withdraw");
        WithdrawBtn.setForeground(new Color(0, 0, 0));
        WithdrawBtn.setBackground(new Color(0xFDFDFD));
        WithdrawBtn.setFont(new Font("Arial", Font.PLAIN, 18));
        WithdrawBtn.setBounds(110, 120, 200, 35);
//        accountSeeBtn.addActionListener(this);
        add(WithdrawBtn);



        CheckBalanceBtn = new JButton("View Balance");
        CheckBalanceBtn.setForeground(new Color(0, 0, 0));
        CheckBalanceBtn.setBackground(new Color(0xFDFDFD));
        CheckBalanceBtn.setFont(new Font("Arial", Font.PLAIN, 18));
        CheckBalanceBtn.setBounds(320, 120, 200, 35);
//        accountSeeBtn.addActionListener(this);
        add(CheckBalanceBtn);


        TransctionBtn = new JButton("Transctions");
        TransctionBtn.setForeground(new Color(0, 0, 0));
        TransctionBtn.setBackground(new Color(0xFDFDFD));
        TransctionBtn.setFont(new Font("Arial", Font.PLAIN, 18));
        TransctionBtn.setBounds(530, 120, 200, 35);
//        accountSeeBtn.addActionListener(this);
        add(TransctionBtn);


        DepositBtn = new JButton("Deposit");
        DepositBtn.setForeground(new Color(0, 0, 0));
        DepositBtn.setBackground(new Color(0xFDFDFD));
        DepositBtn.setFont(new Font("Arial", Font.PLAIN, 18));
        DepositBtn.setBounds(740, 120, 200, 35);
//        accountSeeBtn.addActionListener(this);
        add(DepositBtn);



        ProfileBtn = new JButton("Profile");
        ProfileBtn.setForeground(new Color(0, 0, 0));
        ProfileBtn.setBackground(new Color(0xFDFDFD));
        ProfileBtn.setFont(new Font("Arial", Font.PLAIN, 18));
        ProfileBtn.setBounds(130, 160, 250, 35);
//        accountSeeBtn.addActionListener(this);
        add(ProfileBtn);


        Transferbtn = new JButton("Transfer");
        Transferbtn.setForeground(new Color(0, 0, 0));
        Transferbtn.setBackground(new Color(0xFDFDFD));
        Transferbtn.setFont(new Font("Arial", Font.PLAIN, 18));
        Transferbtn.setBounds(410, 160, 250, 35);
//        accountSeeBtn.addActionListener(this);
        add(Transferbtn);


        CustomerListBtn = new JButton("Customer List");
        CustomerListBtn.setForeground(new Color(0, 0, 0));
        CustomerListBtn.setBackground(new Color(0xFDFDFD));
        CustomerListBtn.setFont(new Font("Arial", Font.PLAIN, 18));
        CustomerListBtn.setBounds(680, 160, 250, 35);
//        accountSeeBtn.addActionListener(this);
        add(CustomerListBtn);



        JLabel label01 = new JLabel("Name ");
        label01.setBounds(70, 220, 350, 60);
        label01.setFont(new Font("Arial", Font.BOLD, 20));
        label01.setForeground(new Color(9, 8, 7));
        add(label01);

        namefield= new JTextField();
        namefield.setFont(new Font("Arial", Font.PLAIN, 18));
        namefield.setBackground(new Color(255, 255, 255));
        namefield.setBounds(210, 235, 270, 30);
        add(namefield);

        JLabel label02 = new JLabel("Country Code ");
        label02.setBounds(70, 270, 350, 60);
        label02.setFont(new Font("Arial", Font.BOLD, 20));
        label02.setForeground(new Color(9, 8, 7));
        add(label02);

        nationalityfield= new JTextField();
        nationalityfield.setFont(new Font("Arial", Font.PLAIN, 18));
        nationalityfield.setBackground(new Color(255, 255, 255));
        nationalityfield.setBounds(210, 285, 270, 30);
        add(nationalityfield);


        JLabel label03 = new JLabel("Gender ");
        label03.setBounds(70, 320, 350, 60);
        label03.setFont(new Font("Arial", Font.BOLD, 20));
        label03.setForeground(new Color(9, 8, 7));
        add(label03);

        genderfield= new JTextField();
        genderfield.setFont(new Font("Arial", Font.PLAIN, 18));
        genderfield.setBackground(new Color(255, 255, 255));
        genderfield.setBounds(210, 335, 270, 30);
        add(genderfield);



        JLabel label04 = new JLabel("Address ");
        label04.setBounds(70, 370, 350, 60);
        label04.setFont(new Font("Arial", Font.BOLD, 20));
        label04.setForeground(new Color(9, 8, 7));
        add(label04);

        adderessfield= new JTextField();
        adderessfield.setFont(new Font("Arial", Font.PLAIN, 18));
        adderessfield.setBackground(new Color(255, 255, 255));
        adderessfield.setBounds(210, 385, 270, 30);
        add(adderessfield);

        JLabel label05 = new JLabel("Pincode ");
        label05.setBounds(70, 420, 350, 60);
        label05.setFont(new Font("Arial", Font.BOLD, 20));
        label05.setForeground(new Color(9, 8, 7));
        add(label05);

        pinCodefield= new JTextField();
        pinCodefield.setFont(new Font("Arial", Font.PLAIN, 18));
        pinCodefield.setBackground(new Color(255, 255, 255));
        pinCodefield.setBounds(210, 435, 270, 30);
        add(pinCodefield);


        JLabel label06 = new JLabel("State ");
        label06.setBounds(70, 470, 350, 60);
        label06.setFont(new Font("Arial", Font.BOLD, 20));
        label06.setForeground(new Color(9, 8, 7));
        add(label06);

        statefield= new JTextField();
        statefield.setFont(new Font("Arial", Font.PLAIN, 18));
        statefield.setBackground(new Color(255, 255, 255));
        statefield.setBounds(210, 485, 270, 30);
        add(statefield);


        JLabel label07 = new JLabel("Guardian ");
        label07.setBounds(70, 520, 350, 60);
        label07.setFont(new Font("Arial", Font.BOLD, 20));
        label07.setForeground(new Color(9, 8, 7));
        add(label07);

        guardianfield= new JTextField();
        guardianfield.setFont(new Font("Arial", Font.PLAIN, 18));
        guardianfield.setBackground(new Color(255, 255, 255));
        guardianfield.setBounds(210, 535, 270, 30);
        add(guardianfield);







        JLabel label = new JLabel("Account Type ");
        label.setBounds(550, 220, 350, 60);
        label.setFont(new Font("Arial", Font.BOLD, 20));
        label.setForeground(new Color(9, 8, 7));
        add(label);



        accountTypefield= new JTextField();
        accountTypefield.setFont(new Font("Arial", Font.PLAIN, 18));
        accountTypefield.setBackground(new Color(255, 255, 255));
        accountTypefield.setBounds(700, 235, 270, 30);
        add(accountTypefield);

        JLabel labelO = new JLabel("Occuption ");
        labelO.setBounds(550, 270, 350, 60);
        labelO.setFont(new Font("Arial", Font.BOLD, 20));
        labelO.setForeground(new Color(9, 8, 7));
        add(labelO);

        occuptionfield= new JTextField();
        occuptionfield.setFont(new Font("Arial", Font.PLAIN, 18));
        occuptionfield.setBackground(new Color(255, 255, 255));
        occuptionfield.setBounds(700, 285, 270, 30);
        add(occuptionfield);


        JLabel labelp = new JLabel("Phone  ");
        labelp.setBounds(550, 320, 350, 60);
        labelp.setFont(new Font("Arial", Font.BOLD, 20));
        labelp.setForeground(new Color(9, 8, 7));
        add(labelp);

        mobilefield= new JTextField();
        mobilefield.setFont(new Font("Arial", Font.PLAIN, 18));
        mobilefield.setBackground(new Color(255, 255, 255));
        mobilefield.setBounds(700, 335, 270, 30);
        add(mobilefield);

        JLabel labele = new JLabel("Email ");
        labele.setBounds(550, 370, 350, 60);
        labele.setFont(new Font("Arial", Font.BOLD, 20));
        labele.setForeground(new Color(9, 8, 7));
        add(labele);


        emailfield= new JTextField();
        emailfield.setFont(new Font("Arial", Font.PLAIN, 18));
        emailfield.setBackground(new Color(255, 255, 255));
        emailfield.setBounds(700, 385, 270, 30);
        add(emailfield);


        JLabel labelei = new JLabel("Pan No");
        labelei.setBounds(550, 420, 350, 60);
        labelei.setFont(new Font("Arial", Font.BOLD, 20));
        labelei.setForeground(new Color(9, 8, 7));
        add(labelei);


        panfield= new JTextField();
        panfield.setFont(new Font("Arial", Font.PLAIN, 18));
        panfield.setBackground(new Color(255, 255, 255));
        panfield.setBounds(700, 435, 270, 30);
        add(panfield);



        JLabel labeleA = new JLabel("Adhar No:");
        labeleA.setBounds(550, 470, 350, 60);
        labeleA.setFont(new Font("Arial", Font.BOLD, 20));
        labeleA.setForeground(new Color(9, 8, 7));
        add(labeleA);

        adharfield= new JTextField();
        adharfield.setFont(new Font("Arial", Font.PLAIN, 18));
        adharfield.setBackground(new Color(255, 255, 255));
        adharfield.setBounds(700, 485, 270, 30);
        add(adharfield);


        JLabel labeleifsc = new JLabel("IFSC");
        labeleifsc.setBounds(550, 520, 350, 60);
        labeleifsc.setFont(new Font("Arial", Font.BOLD, 20));
        labeleifsc.setForeground(new Color(9, 8, 7));
        add(labeleifsc);

        ifscfield= new JTextField();
        ifscfield.setFont(new Font("Arial", Font.PLAIN, 18));
        ifscfield.setBackground(new Color(255, 255, 255));
        ifscfield.setBounds(700, 535, 270, 30);
        add(ifscfield);


        EditBtn = new JButton("Edit");
        EditBtn.setForeground(new Color(0, 0, 0));
        EditBtn.setBackground(new Color(0xFDFDFD));
        EditBtn.setFont(new Font("Arial", Font.PLAIN, 18));
        EditBtn.setBounds(540, 575, 100, 30);
//        accountSeeBtn.addActionListener(this);
        add(EditBtn);


        SaveBtn = new JButton("Save");
        SaveBtn.setForeground(new Color(0, 0, 0));
        SaveBtn.setBackground(new Color(0xFDFDFD));
        SaveBtn.setFont(new Font("Arial", Font.PLAIN, 18));
        SaveBtn.setBounds(430, 575, 100, 30);
//        accountSeeBtn.addActionListener(this);
        add(SaveBtn);



        getContentPane().setBackground(new Color(52, 111, 195));
        setLayout(null);
        setSize(1050, 650);
        setLocation(280, 100);
        setBackground(new Color(255, 255, 255));
        setVisible(true);

    }
    public static void main(String a [])
    {
        new AdminPanelHome();
    }
}