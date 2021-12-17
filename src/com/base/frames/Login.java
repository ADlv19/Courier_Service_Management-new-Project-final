package com.base.frames;

import com.base.dao.CustomerDAO;
import com.base.frames.designer.CustomerDashboard;
import com.base.models.CustomerInfo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame implements ActionListener {

    static String email_ID;
    
    JLabel l1, l2, l3;
    JTextField emailID;
    JPasswordField pf;
    JButton b1, b2, b3;

    public Login() {

        ImageIcon loginPagePic = new ImageIcon("truck pic for login page.jpg");
        l1 = new JLabel("Welcome back to our Courier Service");
        l1.setIcon(loginPagePic);
        l1.setFont(new Font("Arial", Font.BOLD, 40));
        l1.setBounds(0, 0, 1000, 800);
        l1.setIconTextGap(-60);
        l1.setForeground(Color.YELLOW);
        l1.setHorizontalAlignment(JLabel.CENTER);
        l1.setVerticalAlignment(JLabel.CENTER);
        l1.setHorizontalTextPosition(JLabel.CENTER);
        l1.setVerticalTextPosition(JLabel.TOP);

        l2 = new JLabel("Email ID :");
        l2.setFont(new Font("Osward", Font.BOLD, 28));
        l2.setBounds(170, 200, 200, 200);
        l2.setForeground(Color.GREEN);

        l3 = new JLabel("Password :");
        l3.setFont(new Font("Osward", Font.BOLD, 28));
        l3.setBounds(150, 300, 200, 200);
        l3.setForeground(Color.green);

        emailID = new JTextField(50);
        emailID.setFont(new Font("Arial", Font.ITALIC, 20));
        emailID.setBounds(310, 285, 300, 30);

        pf = new JPasswordField(50);
        pf.setFont(new Font("Arial", Font.ITALIC, 20));
        pf.setBounds(310, 390, 300, 30);

        b1 = new JButton("Login");
        b1.setFont(new Font("Arial", Font.ITALIC, 30));
        b1.setBounds(250, 500, 140, 60);
        b1.setBackground(Color.black);
        b1.setForeground(Color.white);

        b2 = new JButton("Clear");
        b2.setFont(new Font("Arial", Font.ITALIC, 30));
        b2.setBounds(500, 500, 140, 60);
        b2.setBackground(Color.black);
        b2.setForeground(Color.white);

        b3 = new JButton("Back");
        b3.setFont(new Font("Arial", Font.ITALIC, 30));
        b3.setBounds(700, 650, 140, 60);
        b3.setBackground(Color.black);
        b3.setForeground(Color.white);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);

        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setLayout(null);
        this.getContentPane().setBackground(Color.cyan);
        this.setLocation(200, 30);
        this.setSize(1000, 800);
        this.setTitle("Login Page");

        this.add(l2);
        this.add(l3);

        this.add(b1);
        this.add(b2);
        this.add(b3);

        this.add(emailID);
        this.add(pf);

        this.add(l1);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            if (String.valueOf(emailID.getText()).equals("") || String.valueOf(pf.getPassword()).equals("")) {
                JOptionPane.showMessageDialog(null, "All fields are required");
            } else {
                CustomerDAO cdao = new CustomerDAO();
                email_ID = emailID.getText();
                String passwordTF = String.valueOf(pf.getPassword());
                String passwordDB = cdao.findCustomerByEmailID(email_ID).getPassword();
                CustomerInfo csi = cdao.findCustomerByEmailID(email_ID);
                if (passwordDB == null) {
                    passwordDB = "";
                }
                if (passwordDB.equalsIgnoreCase(passwordTF)) {
                    JOptionPane.showMessageDialog(null, "Login Successful");
                    this.setVisible(false);
                    new CustomerDashboard(csi).setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "Incorrect Password or Email ID");
                }
            }
        } else if (e.getSource() == b2) {
            emailID.setText("");
            pf.setText("");
        } else if (e.getSource() == b3) {
            this.setVisible(false);
            new MainFrame();
        }
    }
}
