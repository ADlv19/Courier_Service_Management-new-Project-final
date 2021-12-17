package com.base.frames.paymentVishal;

import com.base.dao.CustomerDAO;
import com.base.frames.designer.PaymentMine;
import com.base.models.CustomerInfo;
import com.base.models.OrderDetails;
import com.base.models.Product;

import javax.management.timer.Timer;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.TimeUnit;

public class PaymentWindow extends JFrame implements ActionListener {
    
    
    
    
    CustomerDAO dao = new CustomerDAO();
    
    static CustomerInfo csi = new CustomerInfo();
    static Product product = new Product();
    static OrderDetails sender = new OrderDetails();
    static OrderDetails receiver = new OrderDetails();
    
    public static void main(String[] args) {
        new PaymentWindow(csi,product, sender, receiver);
    }
    
    JLabel l1, totalFee;
    JButton b1, b2;
    JRadioButton r1, r2, r3, r4;

    public PaymentWindow(CustomerInfo csi, Product product, OrderDetails sender, OrderDetails receiver) {

        PaymentWindow.csi = csi;
        PaymentWindow.product = product;
        PaymentWindow.sender = sender;
        PaymentWindow.receiver = receiver;

        l1 = new JLabel("SELECT PAYMENT METHOD");
        l1.setFont(new Font("Osward", Font.BOLD, 34));

        totalFee = new JLabel("Total fee " + PaymentWindow.product.getFee());
        totalFee.setFont(new Font("Osward", Font.BOLD, 20));
        totalFee.setBounds(400,100,500,100);
        add(totalFee);

        b1 = new JButton("BACK");
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.white);

        b2 = new JButton("NEXT");
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.white);

        setLayout(null);

        l1.setBounds(225, 25, 750, 100);
        add(l1);

        b1.setFont(new Font("Arail", Font.BOLD, 14));
        b1.setBounds(300, 600, 100, 30);
        b1.setFocusable(false);
        add(b1);

        b2.setFont(new Font("Arail", Font.BOLD, 14));
        b2.setBounds(580, 600, 100, 30);
        b2.setFocusable(false);
        add(b2);

        r1 = new JRadioButton("UPI");
        r1.setFont(new Font("Raleway", Font.BOLD, 24));
        r1.setBackground(Color.white);

        r2 = new JRadioButton("Credit / Debit / ATM Card");
        r2.setFont(new Font("Raleway", Font.BOLD, 24));
        r2.setBackground(Color.white);

        r3 = new JRadioButton("NetBanking");
        r3.setFont(new Font("Raleway", Font.BOLD, 24));
        r3.setBackground(Color.white);

        r4 = new JRadioButton("Pay In Cash");
        r4.setFont(new Font("Raleway", Font.BOLD, 24));
        r4.setBackground(Color.white);

        r1.setBounds(200, 170, 700, 30);
        r1.setFocusable(false);
        add(r1);

        r2.setBounds(200, 270, 700, 30);
        r2.setFocusable(false);
        add(r2);

        r3.setBounds(200, 370, 700, 30);
        r3.setFocusable(false);
        add(r3);

        r4.setBounds(200, 470, 700, 30);
        r4.setFocusable(false);
        add(r4);

        ButtonGroup group = new ButtonGroup();
        group.add(r1);
        group.add(r2);
        group.add(r3);
        group.add(r4);

        b1.addActionListener(this);
        b2.addActionListener(this);
        r1.addActionListener(this);
        r2.addActionListener(this);
        r3.addActionListener(this);
        r4.addActionListener(this);

        getContentPane().setBackground(Color.CYAN);
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1020, 720);
        this.setLocation(200, 50);
        this.setVisible(true);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == r1) {
            setVisible(false);
            new UpiPayment(PaymentWindow.csi,PaymentWindow.product,PaymentWindow.sender,PaymentWindow.receiver).setVisible(true);
        }
        
        else if (e.getSource() == r2) {
            setVisible(false);
            new CardPayment(csi,product,sender,receiver).setVisible(true);
        }
        
        else if (e.getSource() == r4) {
            // Cash Payment
            boolean flag1 = dao.addOrderDetailsToDB(csi,product);
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            
            boolean flag2 = dao.addSenderDetailsToDB(csi,sender);
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            
            boolean flag3 = dao.addReceiverDetailsToDB(csi,receiver);
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            
            if (flag1 && flag2 && flag3) {
                JOptionPane.showMessageDialog(null, "ORDER PLACED SUCCESSFULLY", "PAYMENT WINDOW", JOptionPane.PLAIN_MESSAGE);
                setVisible(false);
                new PaymentMine(PaymentWindow.csi, PaymentWindow.product,PaymentWindow.sender,PaymentWindow.receiver).setVisible(true);
            }
            else {
                JOptionPane.showMessageDialog(null, "ORDER NOT PLACED", "PAYMENT WINDOW", JOptionPane.PLAIN_MESSAGE);
            }
        }
    }
}
