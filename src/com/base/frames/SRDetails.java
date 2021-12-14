package com.base.frames;

import com.base.frames.paymentVishal.PaymentWindow;
import com.base.models.CustomerInfo;
import com.base.models.OrderDetails;
import com.base.models.Product;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class SRDetails<data> extends JFrame implements ActionListener {

    static CustomerInfo csi;

    JLabel l1, l2, l3, l4, l5, l6, sender, reciever, l7, l8, l9;
    JButton submit, clearSen, clearRec, back;
    //JButton addItem;
    JComboBox<String> jcbFrom;
    JComboBox<String> jcbTo;
    JComboBox<String> jcbParcelType;
    JComboBox<String> jcbWeigt;
    JComboBox<String> jcbDimensions;
    JTextField tfl21, tfl22, tfl31, tfl32, tfl51, tfl52, tfl61, tfl62;
    //JList<? extends Object> list;
    //DefaultListModel<Object> model;
    //JTable table;
    //JScrollPane jsp;

    // 2 dimensional array to store the data of 5 2 dimensional arrays with initializations
    String[][] data = new String[5][2];

    String[] column;

    public static void main(String[] args) {
        new SRDetails(csi);
    }

    public SRDetails(CustomerInfo csi) {
        SRDetails.csi = csi;
        /** model = new DefaultListModel<>();
        list = new JList<>(model);
        list.setBounds(655, 430, 300, 200);

        column = new String[]{"Type", "Weight"};
        table = new JTable(data, column);
        table.setBounds(30, 40, 200, 300);
        jsp = new JScrollPane(table);
        jsp.setBounds(690, 430, 300, 300);*/
        // BackGround Label Gradient
        {
            ImageIcon ic = new ImageIcon("neon_gradient.jpg");
            l1 = new JLabel();
            l1.setIcon(ic);
            l1.setHorizontalAlignment(JLabel.CENTER);
            l1.setVerticalAlignment(JLabel.CENTER);
            l1.setHorizontalTextPosition(JLabel.CENTER);
            l1.setVerticalTextPosition(JLabel.TOP);
            l1.setFont(new Font("Osward", Font.BOLD, 30));
            l1.setBounds(0, 0, 1000, 800);
            l1.setIconTextGap(-50);
            l1.setForeground(Color.white);
            l1.setOpaque(true);
        }
        // Sender Reciever Label
        sender = new JLabel("Sender");
        sender.setFont(new Font("Osward", Font.BOLD, 35));
        sender.setBounds(400, -70, 200, 200);
        sender.setForeground(Color.white);

        reciever = new JLabel("Receiver");
        reciever.setFont(new Font("Osward", Font.BOLD, 35));
        reciever.setBounds(700, -70, 200, 200);
        reciever.setForeground(Color.white);
        
        // All Labels and their Text Fields
        l2 = new JLabel("Name :");
        l2.setFont(new Font("Osward", Font.BOLD, 30));
        l2.setBounds(50, 0, 200, 200);
        l2.setForeground(Color.white);

        // Name text Fields l2 both
        {
            tfl21 = new JTextField("Name");
            tfl21.setFont(new Font("Arial", Font.ITALIC, 20));
            tfl21.setBounds(350, 90, 300, 30);
            tfl22 = new JTextField("Name");
            tfl22.setFont(new Font("Arial", Font.ITALIC, 20));
            tfl22.setBounds(670, 90, 300, 30);
        }

        l3 = new JLabel("Pincode :");
        l3.setFont(new Font("Osward", Font.BOLD, 30));
        l3.setForeground(Color.white);
        l3.setBounds(50, 65, 200, 200);

        // Pincode Text Fields l3 both
        {
            tfl31 = new JTextField("Pincode");
            tfl31.setFont(new Font("Arial", Font.ITALIC, 20));
            tfl31.setBounds(350, 150, 300, 30);
            tfl32 = new JTextField("Pincode");
            tfl32.setFont(new Font("Arial", Font.ITALIC, 20));
            tfl32.setBounds(670, 150, 300, 30);
        }

        l4 = new JLabel("City :");
        l4.setFont(new Font("Osward", Font.BOLD, 30));
        l4.setForeground(Color.white);
        l4.setBounds(50, 130, 200, 200);

        // City Drop Down Menu using l1
        {
            String[] from = {"Thane", "Kalyan", "Panvel", "Nerul", "Belapur CBD"};
            jcbFrom = new JComboBox<>(from);
            jcbFrom.setBounds(350, 215, 300, 30);
            l1.add(jcbFrom);

            String[] to = {"Thane", "Kalyan", "Panvel", "Nerul", "Belapur CBD"};
            jcbTo = new JComboBox<>(to);
            jcbTo.setBounds(670, 215, 300, 30);
            l1.add(jcbTo);
        }

        l5 = new JLabel("Address :");
        l5.setFont(new Font("Osward", Font.BOLD, 30));
        l5.setForeground(Color.white);
        l5.setBounds(50, 200, 200, 200);

        // Address Text Field l5 for both
        {
            tfl51 = new JTextField("Address");
            tfl51.setFont(new Font("Arial", Font.ITALIC, 20));
            tfl51.setBounds(350, 285, 300, 30);
            tfl52 = new JTextField("Address");
            tfl52.setFont(new Font("Arial", Font.ITALIC, 20));
            tfl52.setBounds(670, 285, 300, 30);
        }

        l6 = new JLabel("Phone Number :");
        l6.setFont(new Font("Osward", Font.BOLD, 30));
        l6.setForeground(Color.white);
        l6.setBounds(50, 310, 300, 100);

        // Phone Number Text Filed l6 for both
        {
            tfl61 = new JTextField("Phone");
            tfl61.setFont(new Font("Arial", Font.ITALIC, 20));
            tfl61.setBounds(350, 350, 300, 30);
            tfl62 = new JTextField("Phone");
            tfl62.setFont(new Font("Arial", Font.ITALIC, 20));
            tfl62.setBounds(670, 350, 300, 30);
        }

        {
            l7 = new JLabel("Parcel Type :");
            l7.setFont(new Font("Osward", Font.BOLD, 30));
            l7.setForeground(Color.white);
            l7.setBounds(50, 380, 300, 100);

            String[] parcelTypeOP = {"Electronics", "Books", "Machine", "Fabrics", "Medicines"};
            jcbParcelType = new JComboBox<>(parcelTypeOP);
            jcbParcelType.setBounds(350, 415, 300, 30);
            l1.add(jcbParcelType);
        }

        {
            l8 = new JLabel("Weight :");
            l8.setFont(new Font("Osward", Font.BOLD, 30));
            l8.setForeground(Color.white);
            l8.setBounds(50, 440, 300, 100);

            String[] weightOP = {"1 to 5 kg", "5 to 10 kg", "10 to 15 kg", "15 to 20 kg", "20 to 25 kg"};
            jcbWeigt = new JComboBox<>(weightOP);
            jcbWeigt.setBounds(350, 475, 300, 30);
            l1.add(jcbWeigt);
        }

        {
            l9 = new JLabel("Dimensions :");
            l9.setFont(new Font("Osward", Font.BOLD, 30));
            l9.setForeground(Color.white);
            l9.setBounds(50, 510, 300, 100);

            String[] dimensionOfParcel = {"1m"};
            jcbDimensions = new JComboBox<>(dimensionOfParcel);
            jcbDimensions.setBounds(350, 475, 300, 30);
            l1.add(jcbDimensions);

        }
        // Buttons
        {
            clearSen = new JButton("Clear");
            clearSen.setFont(new Font("Arial", Font.ITALIC, 30));
            clearSen.setBounds(425, 520, 140, 40);
            clearSen.setBackground(Color.black);
            clearSen.setForeground(Color.white);

            clearRec = new JButton("Clear");
            clearRec.setFont(new Font("Arial", Font.ITALIC, 30));
            clearRec.setBounds(750, 530, 140, 40);
            clearRec.setBackground(Color.black);
            clearRec.setForeground(Color.white);

            submit = new JButton("Submit");
            submit.setFont(new Font("Arial", Font.ITALIC, 30));
            submit.setBounds(600, 700, 140, 60);
            submit.setBackground(Color.black);
            submit.setForeground(Color.white);

            back = new JButton("Back");
            back.setFont(new Font("Arial", Font.ITALIC, 30));
            back.setBounds(750, 700, 140, 60);
            back.setBackground(Color.black);
            back.setForeground(Color.white);

            /*addItem = new JButton("Add Item");
            addItem.setFont(new Font("Arial", Font.ITALIC, 22));
            addItem.setBounds(750, 400, 140, 30);
            addItem.setBackground(Color.black);
            addItem.setForeground(Color.black);*/
        }
        // Frame Related Basics
        {
            this.setVisible(true);
            this.setDefaultCloseOperation(EXIT_ON_CLOSE);
            this.setResizable(false);
            this.setSize(1000, 800);
            this.setLocation(200, 30);
            this.setLayout(null);
            this.getContentPane().setBackground(Color.cyan);
            this.setTitle("Order Details");
        }
        // This.Adding buttons + ActionListner
        {
            this.add(submit);
            this.add(back);
            this.add(clearSen);
            //this.add(clearRec);
            //this.add(addItem);

            clearRec.addActionListener(this);
            clearSen.addActionListener(this);
            submit.addActionListener(this);
            back.addActionListener(this);
            //addItem.addActionListener(this);
        }
        {
            this.add(tfl21);
            this.add(tfl22);
            this.add(tfl31);
            this.add(tfl32);
            this.add(tfl51);
            this.add(tfl52);
            this.add(tfl61);
            this.add(tfl62);
            //this.add(jsp);
        }
        // This.adding Labels
        {
            this.add(l2);
            this.add(l3);
            this.add(l4);
            this.add(l5);
            this.add(l6);
            this.add(sender);
            this.add(reciever);
            this.add(l7);
            this.add(l8);
            //this.add(l9);
        }
        // This should be after Label
        this.add(l1);
        // This.adding Text Fields
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == clearRec) {
            tfl22.setText("");
            tfl32.setText("");
            tfl52.setText("");
            tfl62.setText("");
            tfl21.setText("");
            tfl31.setText("");
            tfl51.setText("");
            tfl61.setText("");
        } else if (e.getSource() == back) {
            this.setVisible(false);
            new Login();

        } else if (e.getSource() == submit) {

            /** Product p1 = new Product();
            p1.setFee(calculation().getFee());
            p1.setDistance(calculation().getDistance());
            p1.setPaymentType("Not Updated");
            p1.setEstDeliveryDate(calculateEstDeliveryDate(p1.getDistance()));

            double weight = weightOfParcel(String.valueOf(jcbWeigt.getSelectedItem()));

            Product productin = new Product(csi.getCustomerID(), String.valueOf(jcbParcelType.getSelectedItem()),weight,
                    p1.getDistance(),getCurrentDate(),p1.getEstDeliveryDate(),p1.getFee(),p1.getPaymentType());
            */

            Product productObjToPass = new Product();
            productObjToPass.setCustomerID(SRDetails.csi.getCustomerID());
            productObjToPass.setParcelType(String.valueOf(jcbParcelType.getSelectedItem()));
            productObjToPass.setParcelWeightInKG(weightOfParcel(String.valueOf(jcbWeigt)));
            productObjToPass.setDistance(calculation().getDistance());
            productObjToPass.setOrderDate(getCurrentDate());
            productObjToPass.setEstDeliveryDate(calculateEstDeliveryDate(calculation().getDistance()));
            productObjToPass.setFee(calculation().getFee());
            productObjToPass.setPaymentType("N/A");
            System.out.println(productObjToPass);
            System.out.println();

            OrderDetails sender = new OrderDetails(SRDetails.csi.getCustomerID(),tfl21.getText(),tfl31.getText(),
                    String.valueOf(jcbFrom.getSelectedItem()),tfl51.getText(),tfl61.getText());

            OrderDetails receiver = new OrderDetails(SRDetails.csi.getCustomerID(),tfl22.getText(),tfl32.getText(),
                    String.valueOf(jcbTo.getSelectedItem()),tfl52.getText(), tfl62.getText());

            System.out.println(sender);
            System.out.println();
            System.out.println(receiver);

            new PaymentWindow(SRDetails.csi,productObjToPass,sender,receiver).setVisible(true);
        }
    }
    private Double weightOfParcel(String str){
        double weight =0;
        if (str.equalsIgnoreCase("1 to 5 kg")){
            weight =5;
        }else if(str.equalsIgnoreCase("5 to 10 kg")){
            weight =10;
        }else if(str.equalsIgnoreCase("10 to 15 kg")){
            weight=15;
        }else if(str.equalsIgnoreCase("15 to 20 kg")){
            weight=20;
        }else if(str.equalsIgnoreCase("20 to 25 kg")){
            weight=25;
        }
        return weight;
    }
    private Product calculation() {
        Product product = new Product();
        String from = String.valueOf(jcbFrom.getSelectedItem());
        String to = String.valueOf(jcbTo.getSelectedItem());

        if ("thane".equalsIgnoreCase(from) && "panvel".equalsIgnoreCase(to) ||
                "thane".equalsIgnoreCase(to) && "panvel".equalsIgnoreCase(from)) {
            product.setFee(450);
            product.setDistance(36);
        } else if ("thane".equalsIgnoreCase(from) && "nerul".equalsIgnoreCase(to) ||
                "thane".equalsIgnoreCase(to) && "nerul".equalsIgnoreCase(from)) {
            product.setFee(300);
            product.setDistance(23);

        } else if ("thane".equalsIgnoreCase(from) && "Belapur CBD".equalsIgnoreCase(to) ||
                "thane".equalsIgnoreCase(to) && "Belapur CBD".equalsIgnoreCase(from)) {
            product.setFee(350);
            product.setDistance(28);

        } else if ("thane".equalsIgnoreCase(from) && "Kalyan".equalsIgnoreCase(to) ||
                "thane".equalsIgnoreCase(to) && "Kalyan".equalsIgnoreCase(from)) {
            product.setFee(300);
            product.setDistance(21);

        } else if ("Thane".equalsIgnoreCase(from) && "Thane".equalsIgnoreCase(to) ||
                "Thane".equalsIgnoreCase(to) && "Thane".equalsIgnoreCase(from)) {
            product.setFee(200);
            product.setDistance(5);

        } else if ("panvel".equalsIgnoreCase(from) && "Kalyan".equalsIgnoreCase(to) ||
                "panvel".equalsIgnoreCase(to) && "Kalyan".equalsIgnoreCase(from)) {
            product.setFee(450);
            product.setDistance(35.6);

        } else if ("panvel".equalsIgnoreCase(from) && "panvel".equalsIgnoreCase(to) ||
                "panvel".equalsIgnoreCase(to) && "panvel".equalsIgnoreCase(from)) {
            product.setFee(100);
            product.setDistance(5);

        } else if ("panvel".equalsIgnoreCase(from) && "nerul".equalsIgnoreCase(to) ||
                "panvel".equalsIgnoreCase(to) && "nerul".equalsIgnoreCase(from)) {
            product.setFee(175);
            product.setDistance(15);

        } else if ("panvel".equalsIgnoreCase(from) && "Belapur CBD".equalsIgnoreCase(to) ||
                "panvel".equalsIgnoreCase(to) && "Belapur CBD".equalsIgnoreCase(from)) {
            product.setFee(150);
            product.setDistance(12);

        } else if ("Belapur CBD".equalsIgnoreCase(from) && "Kalyan".equalsIgnoreCase(to) ||
                "Belapur CBD".equalsIgnoreCase(to) && "Kalyan".equalsIgnoreCase(from)) {
            product.setFee(450);
            product.setDistance(37.5);

        } else if ("Belapur CBD".equalsIgnoreCase(from) && "nerul".equalsIgnoreCase(to) ||
                "Belapur CBD".equalsIgnoreCase(to) && "nerul".equalsIgnoreCase(from)) {
            product.setFee(125);
            product.setDistance(11.5);

        } else if ("Belapur CBD".equalsIgnoreCase(from) && "Belapur CBD".equalsIgnoreCase(to) ||
                "Belapur CBD".equalsIgnoreCase(to) && "Belapur CBD".equalsIgnoreCase(from)) {
            product.setFee(100);
            product.setDistance(5);

        } else if ("nerul".equalsIgnoreCase(from) && "Kalyan".equalsIgnoreCase(to) ||
                "nerul".equalsIgnoreCase(to) && "Kalyan".equalsIgnoreCase(from)) {
            product.setFee(450);
            product.setDistance(32.6);

        } else if ("nerul".equalsIgnoreCase(from) && "nerul".equalsIgnoreCase(to) ||
                "nerul".equalsIgnoreCase(to) && "nerul".equalsIgnoreCase(from)) {
            product.setFee(100);
            product.setDistance(5);

        } else if ("Kalyan".equalsIgnoreCase(from) && "Kalyan".equalsIgnoreCase(to) ||
                "Kalyan".equalsIgnoreCase(to) && "Kalyan".equalsIgnoreCase(from)) {
            product.setFee(100);
            product.setDistance(5);
        }
        return product;
    }
    private String getCurrentDate(){
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yy");
        Date date = new Date();
        return formatter.format(date);
    }
    private String calculateEstDeliveryDate(Double dist) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy");
        Calendar cal = Calendar.getInstance();
        String date = "";
        if (dist < 10) {
            cal.add(Calendar.DAY_OF_MONTH, 1);
            date = sdf.format(cal.getTime());
        }else if (dist >= 10 && dist < 20) {
            cal.add(Calendar.DAY_OF_MONTH, 3);
             date = sdf.format(cal.getTime());
        } else if (dist >= 20) {
            cal.add(Calendar.DAY_OF_MONTH, 5);
            date = sdf.format(cal.getTime());
        }
        return date;
    }
}
