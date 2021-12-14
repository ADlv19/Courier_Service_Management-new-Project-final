package com.base.frames.designer;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TableExample extends JFrame {

    JTable jt;
    JScrollPane sp;


    String[][] data = new String[100][8];
    String[] column = {"Order ID", "NAME", "Address", "Reciever Name","Reciever Address","Item","Weight","Toatal Cost"};
    JButton back;
    
    public static void main(String[] args) {
        new TableExample();
    }
    
    TableExample() {
        
        setDataInJTable(data);
        jt = new JTable(data, column);
        jt.setBounds(0, 500, 200, 300);
        sp = new JScrollPane(jt);
        add(sp);

        setSize(800, 800);
        setLocation(200, 200);
        setVisible(true);
        setLayout(null);
    }
    
    public String[][] setDataInJTable(String[][] data){
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < data[j].length; j++) {
                data[i][j] = "hi";
            }
        }
        return data;
    }
}