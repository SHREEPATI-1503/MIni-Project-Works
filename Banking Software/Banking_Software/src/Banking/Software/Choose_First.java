package Banking.Software;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Choose_First extends JFrame implements ActionListener {
 JButton login_btn, Emp_btn,reg_btn;
    Choose_First() {



        //ADDING THE ADMIN BUTTON
        login_btn = new JButton("Admin");
        login_btn.setForeground(new Color(255, 255, 255));
        login_btn.setBackground(new Color(0x0000B5));
        login_btn.setFont(new Font("Arial", Font.BOLD, 15));
        login_btn.setBounds(470, 390, 100, 40);
        login_btn.addActionListener(this);
        add(login_btn);


        //ADDING THE SIGN IN BUTTON
        Emp_btn = new JButton("Sign in");
        Emp_btn.setForeground(new Color(255, 255, 255));
        Emp_btn.setBackground(new Color(0x6262DD));
        Emp_btn.setFont(new Font("Arial", Font.BOLD, 30));
        Emp_btn.setBounds(370, 220, 300, 60);
        Emp_btn.addActionListener(this);
        add(Emp_btn);


        //ADDING THE SIGN UP BUTTON
        reg_btn = new JButton("Sign up");
        reg_btn.setForeground(new Color(255, 255, 255));
        reg_btn.setBackground(new Color(0x6262DD));
        reg_btn.setFont(new Font("Arial", Font.BOLD, 30));
        reg_btn.setBounds(370, 305, 300, 60);
        reg_btn.addActionListener(this);
        add(reg_btn);





        //ADDING THE BACKGROUND IMAGE
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/image-first-back.jpg")); // ADDING IMAGE LOCATION PATH IN THE QUOTES
        Image i2 = i1.getImage().getScaledInstance(1050,650, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel login_images = new JLabel(i3);
        login_images.setBounds(0,0,1050,650);
        add(login_images);




        setLayout(null);
        setSize(1050, 650);
        setLocation(280, 100);
        setBackground(new Color(255, 255, 255));
        setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            if(e.getSource() == login_btn)
            {

            }
        }catch (Exception E){
            E.fillInStackTrace();
        }
    }

    public static void main(String [] a){
        new Choose_First();
;    }
}
