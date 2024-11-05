package Banking.Software;


import javax.swing.*;
import java.awt.*;
import java.beans.AppletInitializer;

public class UserHomePage extends JFrame {



    JButton accountSeeBtn, changepinBtn, TransctionBtn, CheckBalanceBtn, DepositBtn, ProfileBtn,
            Transferbtn, EditBtn,SaveBtn, depositBtn, updatePasswordBtn, BackBtn, transferPageBtn, ifscSearchBtn,addbalanceBtn;
    JTextField avalBalField, creditAmtField, viewBalanceField, loanBalanceField, trnasferAccField, transferIfscField,
            namefield,pinCodefield, nationalityfield, genderfield, adderessfield,
            accountTypefield, mobilefield,occuptionfield, ifscfield,
            panfield,emailfield, guardianfield, adharfield, statefield;

            JPasswordField  oldPassField,newPassField;
    JComboBox<String> occupationComboBox;
    JComboBox<String> passwordComboBox;
    JRadioButton r1,r2,r3;

    JLabel accountHolderName, accountHolderPhone, accountNumber, accountIfscNumber;

    JPanel depositJpanel, changePinPanel, viewBalance, transferPanel, profilePanel;
    UserHomePage()
    {


        JLabel label1 = new JLabel("FINANCE");
        label1.setBounds(435, 20, 450, 60);
        label1.setFont(new Font("Arial", Font.BOLD, 35));
        label1.setForeground(new Color(9, 8, 7));
        add(label1);

        ProfileBtn = new JButton("Profile");
        ProfileBtn.setForeground(new Color(0, 0, 0));
        ProfileBtn.setBackground(new Color(0xFDFDFD));
        ProfileBtn.setFont(new Font("Arial", Font.PLAIN, 18));
        ProfileBtn.setBounds(50, 100, 140, 35);
//        accountSeeBtn.addActionListener(this);
        add(ProfileBtn);

        Transferbtn = new JButton("Transfer");
        Transferbtn.setForeground(new Color(0, 0, 0));
        Transferbtn.setBackground(new Color(0xFDFDFD));
        Transferbtn.setFont(new Font("Arial", Font.PLAIN, 18));
        Transferbtn.setBounds(205, 100, 140, 35);
//        accountSeeBtn.addActionListener(this);
        add(Transferbtn);

        DepositBtn = new JButton("Deposit");
        DepositBtn.setForeground(new Color(0, 0, 0));
        DepositBtn.setBackground(new Color(0xFDFDFD));
        DepositBtn.setFont(new Font("Arial", Font.PLAIN, 18));
        DepositBtn.setBounds(360, 100, 140, 35);
//        accountSeeBtn.addActionListener(this);
        add(DepositBtn);


        TransctionBtn = new JButton("Passbook");
        TransctionBtn.setForeground(new Color(0, 0, 0));
        TransctionBtn.setBackground(new Color(0xFDFDFD));
        TransctionBtn.setFont(new Font("Arial", Font.PLAIN, 18));
        TransctionBtn.setBounds(520, 100, 140, 35);
//        accountSeeBtn.addActionListener(this);
        add(TransctionBtn);

        CheckBalanceBtn = new JButton("View Balance");
        CheckBalanceBtn.setForeground(new Color(0, 0, 0));
        CheckBalanceBtn.setBackground(new Color(0xFDFDFD));
        CheckBalanceBtn.setFont(new Font("Arial", Font.PLAIN, 16));
        CheckBalanceBtn.setBounds(685, 100, 140, 35);
//        accountSeeBtn.addActionListener(this);
        add(CheckBalanceBtn);

       changepinBtn = new JButton("Change pin");
       changepinBtn.setForeground(new Color(0, 0, 0));
       changepinBtn.setBackground(new Color(0xFDFDFD));
       changepinBtn.setFont(new Font("Arial", Font.PLAIN, 18));
       changepinBtn.setBounds(850, 100, 140, 35);
//      changepinBtn.addActionListener(this);
        add(changepinBtn);





        JPanel headerborder = new JPanel();
        headerborder.setBackground(Color.yellow);
        headerborder.setBounds(40,92,960,50);
        add(headerborder);

        depositJpanel = new JPanel();
        depositJpanel.setBackground(new Color(255, 255, 255));
        depositJpanel.setBounds(50,170,945,400);
        add(depositJpanel);
        depositJpanel.setLayout(null);
        depositJpanel.setVisible(false);

        changePinPanel = new JPanel();
        changePinPanel.setBackground(new Color(255, 255, 255));
        changePinPanel.setBounds(50,170,945,400);
        add(changePinPanel);
        changePinPanel.setLayout(null);
        changePinPanel.setVisible(false);


        viewBalance = new JPanel();
        viewBalance.setBackground(new Color(255, 255, 255));
        viewBalance.setBounds(50,170,945,400);
        add(viewBalance);
        viewBalance.setLayout(null);
        viewBalance.setVisible(true);

        transferPanel = new JPanel();
        transferPanel.setBackground(new Color(255, 255, 255));
        transferPanel.setBounds(50,170,945,400);
        add(transferPanel);
        transferPanel.setLayout(null);
        transferPanel.setVisible(false);


        profilePanel = new JPanel();
        profilePanel.setBackground(new Color(255, 255, 255));
        profilePanel.setBounds(50,170,945,400);
        add(profilePanel);
        profilePanel.setLayout(null);
        profilePanel.setVisible(false);



        JLabel accType = new JLabel("Account Type                     :");
        accType.setBounds(200, 60, 350, 60);
        accType.setFont(new Font("Arial", Font.BOLD, 20));
        accType.setForeground(new Color(9, 8, 7));
        depositJpanel.add(accType);


        String[] occupations = {"Select Options","Student","Employed","Self Employed","Businessman","Farmer","Other"};
        occupationComboBox = new JComboBox<>(occupations);
        occupationComboBox.setFont(new Font("Arial", Font.PLAIN, 18));
        occupationComboBox.setBounds(500, 75, 270, 30);
        depositJpanel.add(occupationComboBox);




        JLabel avlBal = new JLabel("Available Balance              :");
        avlBal.setBounds(200, 120, 350, 60);
        avlBal.setFont(new Font("Arial", Font.BOLD, 20));
        avlBal.setForeground(new Color(9, 8, 7));
        depositJpanel.add(avlBal);

        avalBalField= new JTextField();
        avalBalField.setFont(new Font("Arial", Font.PLAIN, 18));
        avalBalField.setBackground(new Color(255, 255, 255));
        avalBalField.setBounds(500, 135, 270, 30);
        depositJpanel.add(avalBalField);



        JLabel amt = new JLabel("Amount                                :");
        amt.setBounds(200, 180, 350, 60);
        amt.setFont(new Font("Arial", Font.BOLD, 20));
        amt.setForeground(new Color(9, 8, 7));
        depositJpanel.add(amt);

        creditAmtField= new JTextField();
        creditAmtField.setFont(new Font("Arial", Font.PLAIN, 18));
        creditAmtField.setBackground(new Color(255, 255, 255));
        creditAmtField.setBounds(500, 195, 270, 30);
        depositJpanel.add(creditAmtField);


        depositBtn = new JButton("Deposit");
        depositBtn.setForeground(new Color(0, 0, 0));
        depositBtn.setBackground(new Color(0xFDFDFD));
        depositBtn.setFont(new Font("Arial", Font.PLAIN, 18));
        depositBtn.setBounds(390, 270, 150, 40);
//        accountSeeBtn.addActionListener(this);
        depositJpanel.add(depositBtn);



        JLabel pinchange = new JLabel("Password Type                    :");
        pinchange.setBounds(200, 60, 350, 60);
        pinchange.setFont(new Font("Arial", Font.BOLD, 20));
        pinchange.setForeground(new Color(9, 8, 7));
        changePinPanel.add(pinchange);


        String[] pinchangetype = {"Select Options","Transction Password","Login Password"};
        passwordComboBox = new JComboBox<>(pinchangetype);
        passwordComboBox.setFont(new Font("Arial", Font.PLAIN, 15));
        passwordComboBox.setBounds(500, 75, 270, 30);
        changePinPanel.add(passwordComboBox);



        JLabel oldpasslable = new JLabel("Old Password                      :");
        oldpasslable.setBounds(200, 120, 350, 60);
        oldpasslable.setFont(new Font("Arial", Font.BOLD, 20));
        oldpasslable.setForeground(new Color(9, 8, 7));
        changePinPanel.add(oldpasslable);

        oldPassField = new JPasswordField();
        oldPassField.setForeground(new Color(3,5,3));
        oldPassField.setBounds(500, 135, 270, 30);
        oldPassField.setFont(new Font("Arial", Font.BOLD, 20));
        changePinPanel.add(oldPassField);


        JLabel newpasslable = new JLabel("New Password                     :");
        newpasslable.setBounds(200, 180, 350, 60);
        newpasslable.setFont(new Font("Arial", Font.BOLD, 20));
        newpasslable.setForeground(new Color(9, 8, 7));
        changePinPanel.add(newpasslable);

        newPassField = new JPasswordField();
        newPassField.setForeground(new Color(3,5,3));
        newPassField.setBounds(500, 195, 270, 30);
        newPassField.setFont(new Font("Arial", Font.BOLD, 20));
        changePinPanel.add(newPassField);


        updatePasswordBtn = new JButton("Update Password");
        updatePasswordBtn.setForeground(new Color(0, 0, 0));
        updatePasswordBtn.setBackground(new Color(0xFDFDFD));
        updatePasswordBtn.setFont(new Font("Arial", Font.PLAIN, 18));
        updatePasswordBtn.setBounds(370, 270, 200, 40);
//        accountSeeBtn.addActionListener(this);
        changePinPanel.add(updatePasswordBtn);

        JLabel yourBalance = new JLabel("Your Balance                  :");
        yourBalance.setBounds(200, 60, 350, 60);
        yourBalance.setFont(new Font("Arial", Font.BOLD, 20));
        yourBalance.setForeground(new Color(9, 8, 7));
        viewBalance.add(yourBalance);

        viewBalanceField = new JTextField();
        viewBalance.setFont(new Font("Arial", Font.PLAIN, 18));
        viewBalanceField.setBackground(new Color(255, 255, 255));
        viewBalanceField.setBounds(500, 75, 270, 30);
        viewBalance.add(viewBalanceField);


        JLabel loanBalance = new JLabel("Add Balance                   :");
        loanBalance.setBounds(200, 120, 350, 60);
        loanBalance.setFont(new Font("Arial", Font.BOLD, 20));
        loanBalance.setForeground(new Color(9, 8, 7));
        viewBalance.add(loanBalance);


     addbalanceBtn = new JButton("Add");
     addbalanceBtn.setForeground(new Color(0, 0, 0));
     addbalanceBtn.setBackground(new Color(0xFDFDFD));
     addbalanceBtn.setFont(new Font("Arial", Font.PLAIN, 18));
     addbalanceBtn.setBounds(820, 135, 100, 30);
//        accountSeeBtn.addActionListener(this);
     viewBalance.add(addbalanceBtn);

        loanBalanceField = new JTextField();
        loanBalanceField.setFont(new Font("Arial", Font.PLAIN, 18));
        loanBalanceField.setBackground(new Color(255, 255, 255));
        loanBalanceField.setBounds(500, 135, 270, 30);
        viewBalance.add(loanBalanceField);


        BackBtn = new JButton("Back");
        BackBtn.setForeground(new Color(0, 0, 0));
        BackBtn.setBackground(new Color(0xFDFDFD));
        BackBtn.setFont(new Font("Arial", Font.PLAIN, 18));
        BackBtn.setBounds(370, 250, 200, 40);
//        accountSeeBtn.addActionListener(this);
        viewBalance.add(BackBtn);



        JLabel paymentM = new JLabel("Payment Method         :");
        paymentM.setBounds(200, 60, 350, 60);
        paymentM.setFont(new Font("Arial", Font.BOLD, 18));
        paymentM.setForeground(new Color(9, 8, 7));
        transferPanel.add(paymentM);


        r1 = new JRadioButton("Neft");
        r1.setFont(new Font("Arial", Font.BOLD, 18));
        r1.setBounds(450, 75, 100, 30);
        r1.setBackground(new Color(220, 148, 148));
        transferPanel.add(r1);


        r2 = new JRadioButton("Imps");
        r2.setBackground(new Color(220, 148, 148));
        r2.setFont(new Font("Arial", Font.BOLD, 18));
        r2.setBounds(570, 75, 100, 30);
       transferPanel.add(r2);

        r3 = new JRadioButton("Rtgs");
        r3.setBackground(new Color(220, 148, 148));
        r3.setFont(new Font("Arial", Font.BOLD, 18));
        r3.setBounds(690, 75, 100, 30);
        transferPanel.add(r3);

        ButtonGroup paymentGroup = new ButtonGroup();
        paymentGroup.add(r1);
        paymentGroup.add(r2);
        paymentGroup.add(r3);


        JLabel acnumber = new JLabel("Account Number            :");
        acnumber.setBounds(200, 120, 350, 60);
        acnumber.setFont(new Font("Arial", Font.BOLD, 18));
        acnumber.setForeground(new Color(9, 8, 7));
        transferPanel.add(acnumber);


        trnasferAccField = new JTextField();
        trnasferAccField.setFont(new Font("Arial", Font.PLAIN, 18));
        trnasferAccField.setBackground(new Color(255, 255, 255));
        trnasferAccField.setBounds(450, 135, 360, 30);
        transferPanel.add(trnasferAccField);



        JLabel ifscnumber = new JLabel("IFSC Code                     :");
        ifscnumber.setBounds(200, 180, 350, 60);
        ifscnumber.setFont(new Font("Arial", Font.BOLD, 18));
        ifscnumber.setForeground(new Color(9, 8, 7));
        transferPanel.add(ifscnumber);




        transferIfscField = new JTextField();
        transferIfscField.setFont(new Font("Arial", Font.PLAIN, 18));
        transferIfscField.setBackground(new Color(255, 255, 255));
        transferIfscField.setBounds(450, 195, 350, 30);
        transferPanel.add(transferIfscField);





        ifscSearchBtn = new JButton("Search");
        ifscSearchBtn.setForeground(new Color(0, 0, 0));
        ifscSearchBtn.setBackground(new Color(0xFDFDFD));
        ifscSearchBtn.setFont(new Font("Arial", Font.PLAIN, 18));
        ifscSearchBtn.setBounds(820, 135, 100, 30);
//        accountSeeBtn.addActionListener(this);
        transferPanel.add(ifscSearchBtn);


        JLabel accname = new JLabel("Account Holder Name     :");
        accname.setBounds(200, 240, 350, 60);
        accname.setFont(new Font("Arial", Font.BOLD, 18));
        accname.setForeground(new Color(9, 8, 7));
        transferPanel.add(accname);


        JLabel accphone = new JLabel("Account Holder Phone    :");
        accphone.setBounds(200, 280, 350, 60);
        accphone.setFont(new Font("Arial", Font.BOLD, 18));
        accphone.setForeground(new Color(9, 8, 7));
        transferPanel.add(accphone);


        accountHolderPhone = new JLabel("XXXXXXXX ");
        accountHolderPhone.setBounds(450, 280, 350, 60);
        accountHolderPhone.setFont(new Font("Arial", Font.BOLD, 18));
        accountHolderPhone.setForeground(new Color(9, 8, 7));
        transferPanel.add(accountHolderPhone);


        accountHolderName = new JLabel("Account Holder Name ");
        accountHolderName.setBounds(450, 240, 350, 60);
        accountHolderName.setFont(new Font("Arial", Font.BOLD, 18));
        accountHolderName.setForeground(new Color(9, 8, 7));
        transferPanel.add(accountHolderName);


        transferPageBtn = new JButton("Transfer");
        transferPageBtn.setForeground(new Color(0, 0, 0));
        transferPageBtn.setBackground(new Color(0xFDFDFD));
        transferPageBtn.setFont(new Font("Arial", Font.PLAIN, 18));
        transferPageBtn.setBounds(370, 350, 150, 40);
//        accountSeeBtn.addActionListener(this);
        transferPanel.add(transferPageBtn);



        JLabel label01 = new JLabel("Name ");
        label01.setBounds(50, 10, 250, 60);
        label01.setFont(new Font("Arial", Font.BOLD, 20));
        label01.setForeground(new Color(9, 8, 7));
        profilePanel.add(label01);

        namefield= new JTextField();
        namefield.setFont(new Font("Arial", Font.PLAIN, 18));
        namefield.setBackground(new Color(255, 255, 255));
        namefield.setBounds(150, 25, 270, 30);
        profilePanel.add(namefield);


        JLabel labelp = new JLabel("Phone  ");
        labelp.setBounds(50, 60, 350, 60);
        labelp.setFont(new Font("Arial", Font.BOLD, 20));
        labelp.setForeground(new Color(9, 8, 7));
        profilePanel.add(labelp);

        mobilefield= new JTextField();
        mobilefield.setFont(new Font("Arial", Font.PLAIN, 18));
        mobilefield.setBackground(new Color(255, 255, 255));
        mobilefield.setBounds(150, 75, 270, 30);
        profilePanel.add(mobilefield);

        JLabel labele = new JLabel("Email ");
        labele.setBounds(50, 110, 350, 60);
        labele.setFont(new Font("Arial", Font.BOLD, 20));
        labele.setForeground(new Color(9, 8, 7));
        profilePanel.add(labele);


        emailfield= new JTextField();
        emailfield.setFont(new Font("Arial", Font.PLAIN, 18));
        emailfield.setBackground(new Color(255, 255, 255));
        emailfield.setBounds(150, 125, 270, 30);
        profilePanel.add(emailfield);


        JLabel label04 = new JLabel("Address ");
        label04.setBounds(50, 160, 350, 60);
        label04.setFont(new Font("Arial", Font.BOLD, 20));
        label04.setForeground(new Color(9, 8, 7));
        profilePanel.add(label04);

        adderessfield= new JTextField();
        adderessfield.setFont(new Font("Arial", Font.PLAIN, 18));
        adderessfield.setBackground(new Color(255, 255, 255));
        adderessfield.setBounds(150, 175, 270, 30);
       profilePanel.add(adderessfield);

        JLabel label05 = new JLabel("Pincode ");
        label05.setBounds(50, 220, 350, 60);
        label05.setFont(new Font("Arial", Font.BOLD, 20));
        label05.setForeground(new Color(9, 8, 7));
        profilePanel.add(label05);

        pinCodefield= new JTextField();
        pinCodefield.setFont(new Font("Arial", Font.PLAIN, 18));
        pinCodefield.setBackground(new Color(255, 255, 255));
        pinCodefield.setBounds(150, 235, 270, 30);
        profilePanel.add(pinCodefield);


        JLabel label06 = new JLabel("State ");
        label06.setBounds(50, 280, 350, 60);
        label06.setFont(new Font("Arial", Font.BOLD, 20));
        label06.setForeground(new Color(9, 8, 7));
        profilePanel.add(label06);

        statefield= new JTextField();
        statefield.setFont(new Font("Arial", Font.PLAIN, 18));
        statefield.setBackground(new Color(255, 255, 255));
        statefield.setBounds(150, 295, 270, 30);
        profilePanel.add(statefield);


        JLabel label07 = new JLabel("Guardian ");
        label07.setBounds(50, 340, 350, 60);
        label07.setFont(new Font("Arial", Font.BOLD, 20));
        label07.setForeground(new Color(9, 8, 7));
        profilePanel.add(label07);

        guardianfield= new JTextField();
        guardianfield.setFont(new Font("Arial", Font.PLAIN, 18));
        guardianfield.setBackground(new Color(255, 255, 255));
        guardianfield.setBounds(150, 355, 270, 30);
        profilePanel.add(guardianfield);




        ImageIcon profileImage = new ImageIcon(ClassLoader.getSystemResource("icon/signup.jpeg")); // ADDING IMAGE LOCATION PATH IN THE QUOTES
        Image profileimage1 = profileImage.getImage().getScaledInstance(150,150, Image.SCALE_DEFAULT);
        ImageIcon profilephoto = new ImageIcon(profileimage1);
        JLabel login_images = new JLabel(profilephoto);
        login_images.setBounds(600,30,150,150);
       profilePanel.add(login_images);


        JLabel label = new JLabel("Account No  : ");
        label.setBounds(500, 200, 350, 60);
        label.setFont(new Font("Arial", Font.PLAIN, 18));
        label.setForeground(new Color(9, 8, 7));
        profilePanel.add(label);



        accountNumber= new JLabel("X X X X X X x xx x x x");
        accountNumber.setFont(new Font("Arial", Font.PLAIN, 18));
        accountNumber.setBackground(new Color(255, 255, 255));
        accountNumber.setBounds(620, 215, 270, 30);
       profilePanel.add(accountNumber);



        JLabel labeleifsc = new JLabel("IFSC             :");
        labeleifsc.setBounds(500, 230, 350, 60);
        labeleifsc.setFont(new Font("Arial", Font.PLAIN, 18));
        labeleifsc.setForeground(new Color(9, 8, 7));
        profilePanel.add(labeleifsc);

        accountIfscNumber = new JLabel("IS+FSCD");
        accountIfscNumber.setFont(new Font("Arial", Font.PLAIN, 18));
        accountIfscNumber.setBackground(new Color(255, 255, 255));
        accountIfscNumber.setBounds(620, 245, 270, 30);
        profilePanel.add(accountIfscNumber);



        EditBtn = new JButton("Edit");
        EditBtn.setForeground(new Color(0, 0, 0));
        EditBtn.setBackground(new Color(0xFDFDFD));
        EditBtn.setFont(new Font("Arial", Font.PLAIN, 18));
        EditBtn.setBounds(550, 350, 100, 30);
//        accountSeeBtn.addActionListener(this);
        profilePanel.add(EditBtn);


        SaveBtn = new JButton("Save");
        SaveBtn.setForeground(new Color(0, 0, 0));
        SaveBtn.setBackground(new Color(0xFDFDFD));
        SaveBtn.setFont(new Font("Arial", Font.PLAIN, 18));
        SaveBtn.setBounds(670, 350, 100, 30);
//        accountSeeBtn.addActionListener(this);
        profilePanel.add(SaveBtn);




        getContentPane().setBackground(new Color(52, 111, 195));
        setLayout(null);
        setSize(1050, 650);
        setLocation(280, 100);
        setBackground(new Color(255, 255, 255));
        setVisible(true);



    }


    public static void main(String a [])
    {
        new UserHomePage();
    }
}

