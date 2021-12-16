package com.base.frames;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame implements ActionListener {

    public static void main(String[] args) {
        new MainFrame();
    }

    JButton login;
    JButton signUP;
    //JButton seePreviousOrders;

    public MainFrame() {
        ImageIcon img = new ImageIcon("courierMan.png");
        ImageIcon loginpic = new ImageIcon("LoginButton.jpg");
        ImageIcon signUppic = new ImageIcon("SignUpButton.png");
        JLabel label = new JLabel();
        login = new JButton("", loginpic);
        signUP = new JButton("", signUppic);
        //seePreviousOrders = new JButton("See Previous Orders");
        Border border = BorderFactory.createLineBorder(Color.YELLOW, 5);

        label.setIcon(img);
        label.setText("Welcome to Our Courier Services");
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setForeground(Color.black);
        label.setFont(new Font("Times New Roman", Font.BOLD, 45));
        label.setIconTextGap(-90);
        label.setBackground(Color.RED);
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
        
        login.setBounds(200, 650, 100, 50);
        signUP.setBounds(650, 650, 100, 50);
        //seePreviousOrders.setBounds(400, 650, 150, 50);
        login.addActionListener(this);
        signUP.addActionListener(this);
        //seePreviousOrders.addActionListener(this);

        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setSize(1000, 800);
        this.add(login);
        this.add(signUP);
        //this.add(seePreviousOrders);
        this.add(label);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == login) {
            this.setVisible(false);
            new Login();
        } else if (e.getSource() == signUP) {
            this.setVisible(false);
            new SignUp();
        }
    }
}

