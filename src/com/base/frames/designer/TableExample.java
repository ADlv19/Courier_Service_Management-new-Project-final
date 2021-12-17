package com.base.frames.designer;

import com.base.dao.CustomerDAO;
import com.base.models.CustomerInfo;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TableExample extends JFrame {

    
    static CustomerInfo csi = new CustomerInfo();
    JTable jt;
    JScrollPane sp;
    CustomerDAO dao = new CustomerDAO();
    String[] column = {"Order ID", "NAME", "Address", "Reciever Name","Reciever Address","Item","Weight","Toatal Cost"};
    JButton back;
    
    public static void main(String[] args) {
        new TableExample(csi);
    }
    
    TableExample(CustomerInfo csi) {
        TableExample.csi = csi;
        Object [][] data = dao.getPreviousOrderDetails(TableExample.csi.getCustomerID());
        jt = new JTable(data, column);
        jt.setBounds(0, 500, 200, 300);
        sp = new JScrollPane(jt);
        add(sp);

        setSize(800, 800);
        setLocation(200, 200);
        setVisible(true);
        setLayout(null);
        setTitle("Previous Order Details");
    }
    
    
}