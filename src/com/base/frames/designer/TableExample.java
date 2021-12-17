package com.base.frames.designer;

import com.base.dao.CustomerDAO;
import com.base.models.CustomerInfo;

import javax.swing.*;

public class TableExample extends JFrame {
    
    static CustomerInfo csi = new CustomerInfo();
    JTable jt;
    JScrollPane sp;
    CustomerDAO dao = new CustomerDAO();
    String[] column = {"Order ID", "NAME", "Address", "Reciever Name","Reciever Address","Item","Weight","Toatal Cost"};
    
    TableExample(CustomerInfo csi) {
        TableExample.csi = csi;
        Object [][] data = dao.getPreviousOrderDetails(TableExample.csi.getCustomerID());
        jt = new JTable(data, column);
        jt.setBounds(0, 500, 200, 300);
        sp = new JScrollPane(jt);
        add(sp);

        setSize(1000, 800);
        setLocation(200, 200);
        setVisible(true);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Previous Order Details");
    }
    
    
}