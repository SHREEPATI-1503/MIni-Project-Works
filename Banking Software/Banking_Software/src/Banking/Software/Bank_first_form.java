package Banking.Software;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;

public class Bank_first_form extends JFrame implements ActionListener {

    Random ran = new Random();
    long first4 = (ran.nextLong() % 9000L) + 1000L;
    String first = " " + Math.abs(first4);

    JTextField textName, textM_name, textL_name, text_father_n, text_mother_n;
    JButton Nxt_btn, clr_btn;

    JDateChooser datefield; // Declare the JDateChooser at class level

    JRadioButton r1,r2,r3;

    Bank_first_form() {
        JLabel label1 = new JLabel("Personal Details");
        label1.setBounds(380, 30, 350, 60);
        label1.setFont(new Font("Arial", Font.BOLD, 35));
        label1.setForeground(new Color(9, 8, 7));
        add(label1);

        JLabel label2 = new JLabel("(form no : " + first + ")");
        label2.setBounds(440, 70, 350, 50);
        label2.setFont(new Font("Arial", Font.BOLD, 18));
        label2.setForeground(new Color(41, 40, 40));
        add(label2);

        JLabel label3 = new JLabel("Page: 1");
        label3.setBounds(900, 30, 350, 50);
        label3.setFont(new Font("Arial", Font.BOLD, 18));
        label3.setForeground(new Color(41, 40, 40));
        add(label3);

        JLabel label4 = new JLabel("First Name: ");
        label4.setBounds(250, 125, 350, 50);
        label4.setFont(new Font("Arial", Font.BOLD, 20));
        label4.setForeground(new Color(41, 40, 40));
        add(label4);

        textName = new JTextField();
        textName.setFont(new Font("Arial", Font.PLAIN, 20));
        textName.setBackground(new Color(255, 255, 255));
        textName.setBounds(450, 135, 380, 40);
        add(textName);

        JLabel label5 = new JLabel("Middle Name:");
        label5.setBounds(250, 186, 350, 50);
        label5.setFont(new Font("Arial", Font.BOLD, 20));
        label5.setForeground(new Color(41, 40, 40));
        add(label5);

        textM_name = new JTextField();
        textM_name.setFont(new Font("Arial", Font.PLAIN, 20));
        textM_name.setBackground(new Color(255, 255, 255));
        textM_name.setBounds(450, 195, 380, 40);
        add(textM_name);

        JLabel label6 = new JLabel("Last Name: ");
        label6.setBounds(250, 245, 350, 50);
        label6.setFont(new Font("Arial", Font.BOLD, 20));
        label6.setForeground(new Color(41, 40, 40));
        add(label6);


        textL_name = new JTextField();
        textL_name.setFont(new Font("Arial", Font.PLAIN, 20));
        textL_name.setBackground(new Color(255, 255, 255));
        textL_name.setBounds(450, 257, 380, 40);
        add(textL_name);

        JLabel genderl = new JLabel("Gender:  ");
        genderl.setBounds(250, 310, 350, 50);
        genderl.setFont(new Font("Arial", Font.BOLD, 20));
        genderl.setForeground(new Color(41, 40, 40));
        add(genderl);

        r1 = new JRadioButton("Male");
        r1.setFont(new Font("Arial", Font.BOLD, 18));
        r1.setBounds(460, 310, 110, 50);
        r1.setBackground(new Color(220, 148, 148));
        add(r1);


        r2 = new JRadioButton("Female");
        r2.setBackground(new Color(220, 148, 148));
        r2.setFont(new Font("Arial", Font.BOLD, 18));
        r2.setBounds(585, 310, 110, 50);
        add(r2);

        r3 = new JRadioButton("Other");
        r3.setBackground(new Color(220, 148, 148));
        r3.setFont(new Font("Arial", Font.BOLD, 18));
        r3.setBounds(710, 310, 150, 50);
        add(r3);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);
        buttonGroup.add(r3);

        JLabel dob = new JLabel("Date of Birth: ");
        dob.setBounds(250, 370, 350, 50);
        dob.setFont(new Font("Arial", Font.BOLD, 20));
        dob.setForeground(new Color(41, 40, 40));
        add(dob);

        datefield = new JDateChooser(); // Initialize here
        datefield.setForeground(new Color(132, 250, 68));
        datefield.setBounds(450, 373, 380, 40);
        add(datefield);

        JLabel label8 = new JLabel("Father's Name:  ");
        label8.setBounds(250, 420, 350, 50);
        label8.setFont(new Font("Arial", Font.BOLD, 20));
        label8.setForeground(new Color(41, 40, 40));
        add(label8);

        text_father_n = new JTextField();
        text_father_n.setFont(new Font("Arial", Font.PLAIN, 20));
        text_father_n.setBackground(new Color(255, 255, 255));
        text_father_n.setBounds(450, 427, 380, 40);
        add(text_father_n);

        JLabel label9 = new JLabel("Mother's Name:  ");
        label9.setBounds(250, 475, 350, 50);
        label9.setFont(new Font("Arial", Font.BOLD, 20));
        label9.setForeground(new Color(41, 40, 40));
        add(label9);

        text_mother_n = new JTextField();
        text_mother_n.setFont(new Font("Arial", Font.PLAIN, 20));
        text_mother_n.setBackground(new Color(255, 255, 255));
        text_mother_n.setBounds(450, 480, 380, 40);
        add(text_mother_n);

        clr_btn = new JButton("Clear");
        clr_btn.setForeground(new Color(0, 0, 0));
        clr_btn.setBackground(new Color(0xFDFDFD));
        clr_btn.setFont(new Font("Arial", Font.PLAIN, 18));
        clr_btn.setBounds(395, 545, 90, 40);
        clr_btn.addActionListener(this);
        add(clr_btn);

        Nxt_btn = new JButton("Next");
        Nxt_btn.setForeground(new Color(255, 255, 255));
        Nxt_btn.setBackground(new Color(0x6262DD));
        Nxt_btn.setFont(new Font("Arial", Font.BOLD, 25));
        Nxt_btn.setBounds(550, 545, 150, 40);
        Nxt_btn.addActionListener(this);
        add(Nxt_btn);

        getContentPane().setBackground(new Color(220, 148, 148));
        setLayout(null);
        setSize(1050, 650);
        setLocation(280, 100);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String Fname = textName.getText().trim();
        String Mname = textM_name.getText().trim();
        String Lname = textL_name.getText().trim();
        String Father_name = text_father_n.getText().trim();
        String Mother_name = text_mother_n.getText().trim();
        Date dateOfBirth = datefield.getDate();// Get the selected date

        try {
            if (e.getSource() == clr_btn) {
                textName.setText("");
                textM_name.setText("");
                textL_name.setText("");
                text_father_n.setText("");
                text_mother_n.setText("");
                datefield.setDate(null); // Clear the date field
            } else if (e.getSource() == Nxt_btn) {

                if (Fname.isEmpty())  {
                    JOptionPane.showMessageDialog(this, "Please Enter First name");
                    return;
                }


                if (!r1.isSelected() && !r2.isSelected() && !r3.isSelected())
                {
                    JOptionPane.showMessageDialog(this, "Please Choose the Gender");
                    return;
                }
                if (Lname.isEmpty())  {
                    JOptionPane.showMessageDialog(this, "Please Enter Last name");
                    return;
                }

                if (Father_name.isEmpty() && Mother_name.isEmpty())  {
                    JOptionPane.showMessageDialog(this, "Please Enter Parent details");
                    return;
                }

                if (dateOfBirth == null)  {
                    JOptionPane.showMessageDialog(this, "Please Enter Date of Birth");
                    return;
                }
                // Proceed with the next steps

                if (r1.isEnabled() && r2.isSelected() && r3.isSelected())
                {
                    JOptionPane.showMessageDialog(this, "Please Enter Your Gender");
                    return;
                }
            }
        } catch (Exception E) {
            E.fillInStackTrace();
        }
    }

    public static void main(String[] a) {
        new Bank_first_form();
    }
}
