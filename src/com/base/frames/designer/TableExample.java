package com.base.frames.designer;

import com.base.dao.CustomerDAO;
import com.base.models.CustomerInfo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TableExample extends JFrame implements ActionListener {
    
    static CustomerInfo csi = new CustomerInfo();
    JTable jt;
    JButton back;
    JScrollPane sp;
    CustomerDAO dao = new CustomerDAO();
    String[] column = {"Order ID", "NAME", "Address", "Reciever Name","Reciever Address","Item","Weight","Toatal Cost"};
    
    public static void main(String[] args) {
        new TableExample(csi);
    }
    
    TableExample(CustomerInfo csi) {
        TableExample.csi = csi;
        Object [][] data = dao.getPreviousOrderDetails(TableExample.csi.getCustomerID());
        jt = new JTable(data, column);
        jt.setBounds(0, 500, 200, 300);
        sp = new JScrollPane(jt);
        
        
        back = new JButton("Back");
        back.setBounds(500, 700, 140, 50);
        back.setBackground(Color.black);
        back.setForeground(Color.white);
        back.addActionListener(this);
        
        add(back);
        add(sp);
        
        setSize(1000, 800);
        setLocation(200, 30);
        setVisible(true);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Previous Order Details");
    }
    
    /**
     * Invoked when an action occurs.
     *
     * @param e the event to be processed
     */
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == back) {
            new CustomerDashboard(csi).setVisible(true);
            this.setVisible(false);
        }
    }
    
}