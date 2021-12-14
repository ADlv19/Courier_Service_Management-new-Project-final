package com.base.frames;

import com.base.dao.CustomerDAO;
import com.base.models.CustomerInfo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SignUp extends JFrame implements ActionListener {

    public static void main(String[] args) {
        new SignUp();
    }

    JFrame jf;
    JLabel l1, l2, l3, l4, l5, l6;
    JTextField fName, lName, phoneNumber, emailID;
    JPasswordField pf;
    JButton b1, b2, b3;
    CustomerDAO customerDAO = new CustomerDAO();

    public SignUp() {
        jf = new JFrame();
        ImageIcon ic = new ImageIcon("gradienta-LeG68PrXA6Y-unsplash.jpg");
        l1 = new JLabel("Welcome to our Courier Service");
        l1.setIcon(ic);
        l1.setHorizontalAlignment(JLabel.CENTER);
        l1.setVerticalAlignment(JLabel.CENTER);
        l1.setHorizontalTextPosition(JLabel.CENTER);
        l1.setVerticalTextPosition(JLabel.TOP);
        l1.setIconTextGap(-100);

        l1.setFont(new Font("Osward", Font.BOLD, 30));
        l1.setBounds(-9, -17, 1000, 800);

        l2 = new JLabel("First Name :");
        l2.setFont(new Font("Osward", Font.BOLD, 28));
        l2.setBounds(20, 70, 200, 200);

        l3 = new JLabel("Last Name :");
        l3.setFont(new Font("Osward", Font.BOLD, 28));
        l3.setBounds(20, 150, 200, 200);

        l4 = new JLabel("Phone Number :");
        l4.setFont(new Font("Osward", Font.BOLD, 28));
        l4.setBounds(20, 220, 250, 200);

        l5 = new JLabel("Email ID :");
        l5.setFont(new Font("Osward", Font.BOLD, 28));
        l5.setBounds(20, 290, 200, 200);

        l6 = new JLabel("Password :");
        l6.setFont(new Font("Osward", Font.BOLD, 28));
        l6.setBounds(20, 360, 200, 200);

        fName = new JTextField(50); //First Name
        fName.setFont(new Font("Arial", Font.ITALIC, 20));
        fName.setBounds(250, 155, 300, 30);

        lName = new JTextField(50); //Last Name
        lName.setFont(new Font("Arial", Font.ITALIC, 20));
        lName.setBounds(250, 235, 300, 30);

        phoneNumber = new JTextField(50); // Phone Number
        phoneNumber.setFont(new Font("Arial", Font.ITALIC, 20));
        phoneNumber.setBounds(250, 305, 300, 30);

        emailID = new JTextField(50); // Email ID
        emailID.setFont(new Font("Arial", Font.ITALIC, 20));
        emailID.setBounds(250, 375, 300, 30);

        pf = new JPasswordField(50);
        pf.setFont(new Font("Arial", Font.ITALIC, 20));
        pf.setBounds(250, 445, 300, 30);

        b1 = new JButton("Sign Up");
        b1.setFont(new Font("Arial", Font.ITALIC, 30));
        b1.setBounds(250, 650, 140, 60);
        b1.setBackground(Color.black);
        b1.setForeground(Color.white);

        b2 = new JButton("Clear");
        b2.setFont(new Font("Arial", Font.ITALIC, 30));
        b2.setBounds(500, 650, 140, 60);
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


        jf.setVisible(true);
        jf.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jf.setResizable(false);
        jf.setLayout(null);
        jf.getContentPane().setBackground(Color.cyan);
        jf.setLocation(200, 30);
        jf.setSize(1000, 800);

        jf.add(pf);
        jf.add(b1);
        jf.add(b2);
        jf.add(b3);

        jf.getContentPane().setBackground(Color.cyan);
        jf.setLocation(200, 30);
        jf.setSize(1000, 800);

        jf.add(l2);
        jf.add(l3);
        jf.add(l4);
        jf.add(l5);
        jf.add(l6);
        jf.add(l1);
        jf.add(fName);
        jf.add(lName);
        jf.add(phoneNumber);
        jf.add(emailID);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            if (String.valueOf(fName.getText()).equals("") || String.valueOf(lName.getText()).equals("") || String.valueOf(phoneNumber.getText()).equals("") || String.valueOf(emailID.getText()).equals("") || String.valueOf(pf.getPassword()).equals("")) {
                JOptionPane.showMessageDialog(null, "All fields required");
            } else {
                CustomerInfo csiS = new CustomerInfo(fName.getText(), lName.getText(), phoneNumber.getText(), emailID.getText(), String.valueOf(pf.getPassword()));
                if (customerDAO.checkIfMailAlreadyRegistered(csiS.geteMailID())) {
                    JOptionPane.showMessageDialog(null, "Account already exists");
                } else {
                    boolean status = customerDAO.addCustomerToDB(csiS);
                    if (status) {
                        jf.setVisible(false);
                        JOptionPane.showMessageDialog(null, "Account Creation Successful");
                        new Login();
                    }
                }
            }
        } else if (e.getSource() == b2) {
            fName.setText("");
            lName.setText("");
            phoneNumber.setText("");
            emailID.setText("");
            pf.setText("");
        } else if (e.getSource() == b3) {
            jf.setVisible(false);
            new MainFrame();
        }
    }
}