package Banking.Software;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Open_new_account extends JFrame implements ActionListener {
JButton button,exitbtn;
    Open_new_account() {


        JPanel panel = new JPanel();
        panel.setBackground(new Color(255, 255, 255)); // Set the desired background color
        panel.setLayout(null); // Set layout to null for absolute positioning
        setContentPane(panel); // Set the panel as the content pane of the JFrame

        button = new JButton("Open New Account");
        button.setForeground(new Color(255, 255, 255));
        button.setBackground(new Color(0x5757BC));
        button.setFont(new Font("Arial", Font.BOLD, 25));
        button.setBounds(500, 320, 290, 70);
        button.addActionListener(this);
        add(button);



       exitbtn = new JButton("Exit");
       exitbtn.setForeground(new Color(0, 0, 0));
       exitbtn.setBackground(Color.white);
       exitbtn.setFont(new Font("Arial", Font.BOLD, 11));
       exitbtn.setBounds(960, 560, 60, 40);
       exitbtn.addActionListener(this);
       add(exitbtn);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/man2-showing-image-transformed.jpeg")); // ADDING IMAGE LOCATION PATH IN THE QUOTES
        Image i2 = i1.getImage().getScaledInstance(850, 450, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel login_images = new JLabel(i3);
        login_images.setBounds(0, 30, 650, 350);
        add(login_images);


        setLayout(null);
        setSize(1050, 650);
        setLocation(280, 100);
        setBackground(new Color(149, 14, 14));
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        try
        {
            if(e.getSource() == button)
            {

            }
        }catch (Exception E){
            E.fillInStackTrace();
        }
    }

    public static void main(String [] a){
        new Open_new_account();
    }
}

