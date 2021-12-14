package com.base.frames;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame implements ActionListener{
    JLabel l1;
    JButton b1,b2;
    JRadioButton r1,r2,r3,r4;

    public static void main(String[] args) {
        new Main();
    }

    Main(){

        l1 = new JLabel("SELECT PAYMENT METHOD");
        l1.setFont(new Font("Osward",Font.BOLD,34));

        b1 = new JButton("BACK");
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);

        b2 = new JButton("NEXT");
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);

        setLayout(null);

        l1.setBounds(225,25,750,100);
        add(l1);

        b1.setFont(new Font("Arail",Font.BOLD,14));
        b1.setBounds(300,600,100,30);
        b1.setFocusable(false);
        add(b1);

        b2.setFont(new Font("Arail",Font.BOLD,14));
        b2.setBounds(580,600,100,30);
        b2.setFocusable(false);
        add(b2);

        r1 = new JRadioButton("UPI");
        r1.setFont(new Font("Raleway",Font.BOLD,24));
        r1.setBackground(Color.white);

        r2 = new JRadioButton("Credit / Debit / ATM Card");;
        r2.setFont(new Font("Raleway",Font.BOLD,24));
        r2.setBackground(Color.white);

        r3 = new JRadioButton("NetBanking");
        r3.setFont(new Font("Raleway",Font.BOLD,24));
        r3.setBackground(Color.white);

        r4 = new JRadioButton("Cash On Delivery");
        r4.setFont(new Font("Raleway",Font.BOLD,24));
        r4.setBackground(Color.white);

        r1.setBounds(200,170,700,30);
        r1.setFocusable(false);
        add(r1);

        r2.setBounds(200,270,700,30);
        r2.setFocusable(false);
        add(r2);

        r3.setBounds(200,370,700,30);
        r3.setFocusable(false);
        add(r3);

        r4.setBounds(200,470,700,30);
        r4.setFocusable(false);
        add(r4);

        ButtonGroup group = new ButtonGroup();
        group.add(r1);
        group.add(r2);
        group.add(r3);
        group.add(r4);

        b1.addActionListener(this);

        getContentPane().setBackground(Color.WHITE);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1020, 720);
        this.setLocation(200,50);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        /** if (e.getSource() == r1 && e.getSource()==b2 ){
           // new Main1().setVisible(true);
            setVisible(false);
        }
         if (e.getSource() == r2 && e.getSource()==b2){
            // new Main1().setVisible(true);
            setVisible(false);

        }
         if (e.getSource() == r3 && e.getSource()==b2 ) {
            // new Main1().setVisible(true);
            setVisible(false);
        }*/

         if (e.getSource() == r4  ){
                JOptionPane.showMessageDialog(null,"ORDER PLACED SUCCESSFULLY","PAYMENT WINDOW", JOptionPane.PLAIN_MESSAGE);
                setVisible(false);
        }
    }
}