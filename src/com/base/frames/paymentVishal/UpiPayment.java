package com.base.frames.paymentVishal;

import com.base.frames.designer.PaymentMine;
import com.base.models.CustomerInfo;
import com.base.models.OrderDetails;
import com.base.models.Product;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class UpiPayment extends JFrame implements ActionListener {

    static CustomerInfo csi;
    static Product product;
    static OrderDetails sender;
    static OrderDetails receiver;
    
    public static void main(String[] args) {
        new UpiPayment(csi,product,sender,receiver);
    }
    
    JLabel l1;
    JTextField tf1,tf2;
    JButton b1 , b2;

    UpiPayment(CustomerInfo csi, Product product, OrderDetails sender, OrderDetails receiver){
        UpiPayment.csi = csi;
        UpiPayment.product=product;
        UpiPayment.sender=sender;
        UpiPayment.receiver= receiver;

        l1 = new JLabel("Enter UPI ID");
        l1.setFont(new Font("Osward",Font.BOLD,20));
        l1.setBounds(50,20,200,50);
        add(l1);

        l1 = new JLabel("Enter pin");
        l1.setFont(new Font("Osward",Font.BOLD,22));
        l1.setBounds(50,100,200,50);
        add(l1);

        tf1 = new JTextField();
        tf1.setFont(new Font("Arial", Font.BOLD,16));
        tf1.setBounds(180,30,230,33);
        add(tf1);

        tf2 = new JTextField();
        tf2.setFont(new Font("Arial", Font.BOLD,16));
        tf2.setBounds(180,110,230,33);
        add(tf2);

        b1 = new JButton("BACK");
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.BLACK);

        b2 = new JButton("NEXT");
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.BLACK);

        setLayout(null);

        b1.setFont(new Font("Arail",Font.BOLD,14));
        b1.setBounds(100,220,100,30);
        b1.setFocusable(false);
        add(b1);

        b2.setFont(new Font("Arail",Font.BOLD,14));
        b2.setBounds(350,220,100,30);
        b2.setFocusable(false);
        add(b2);

        b1.addActionListener(this);
        b2.addActionListener(this);
        getContentPane().setBackground(Color.WHITE);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(520, 320);
        this.setLocation(500,250);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b2  ) {
            JOptionPane.showMessageDialog(null,"ORDER PLACED SUCCESSFULLY","PAYMENT WINDOW", JOptionPane.PLAIN_MESSAGE);
            setVisible(false);
            new PaymentMine(UpiPayment.csi).setVisible(true);
        }else if (e.getSource()==b1){
            dispose();
        }
    }
}