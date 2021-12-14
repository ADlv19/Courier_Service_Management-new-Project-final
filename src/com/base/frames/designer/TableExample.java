package com.base.frames.designer;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TableExample extends JFrame {

    JTable jt;
    JScrollPane sp;


    String data[][] = {};
    String column[] = {"Order ID", "NAME", "Address", "Reciever Name","Reciever Address","Item","Weight","Toatal Cost"};

    JButton back;

    public static void main(String[] args) {
        new TableExample();
    }


    TableExample() {

        data = new String[][]{
                {"1", "Rajesh", "Kathmandu", "Rajesh", "Kathmandu","Bread", "1.5", "100"},
                {"2", "Rajesh", "Kathmandu", "Rajesh", "Kathmandu","Bread", "1.5", "100"},
                {"3", "Rajesh", "Kathmandu", "Rajesh", "Kathmandu","Bread", "1.5", "100"},
                {"4", "Rajesh", "Kathmandu", "Rajesh", "Kathmandu","Bread", "1.5", "100"},
                {"5", "Rajesh", "Kathmandu", "Rajesh", "Kathmandu","Bread", "1.5", "100"},
                {"6", "Rajesh", "Kathmandu", "Rajesh", "Kathmandu","Bread", "1.5", "100"},
        };

        jt = new JTable(data, column);
        jt.setBounds(0, 500, 200, 300);
        sp = new JScrollPane(jt);
        add(sp);

        setSize(800, 800);
        setLocation(200, 200);
        setVisible(true);
        setLayout(null);
    }

}