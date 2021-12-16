/*
 * Created by JFormDesigner on Fri Dec 10 20:26:08 IST 2021
 */

package com.base.frames.designer;

import com.base.models.CustomerInfo;
import com.base.models.OrderDetails;
import com.base.models.Product;

import javax.swing.*;
import java.awt.*;

/**
 * @author Adwait
 */
public class PaymentMine extends JFrame {

    static CustomerInfo csi;
    static Product product;
    static OrderDetails sender;
    static OrderDetails receiver;

    public static void main(String[] args) {
        new PaymentMine(csi,product,sender,receiver).setVisible(true);
    }

    public PaymentMine(CustomerInfo csi, Product product, OrderDetails sender, OrderDetails receiver) {
        PaymentMine.csi = csi;
        PaymentMine.product = product;
        PaymentMine.sender = sender;
        PaymentMine.receiver = receiver;
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Adwait
        receiptNumLabel = new JLabel();
        receiptNumberLabel = new JLabel();
        customerInfoLabel = new JLabel();
        label5 = new JLabel();
        label6 = new JLabel();
        label7 = new JLabel();
        phoneLabelToGetData = new JLabel();
        label9 = new JLabel();
        emailLabelToGetData = new JLabel();
        nameLabelToGetData = new JLabel();
        label12 = new JLabel();
        dateLabelToGetData = new JLabel();
        label14 = new JLabel();
        scrollPane1 = new JScrollPane();
        addressTextAreaToGetData = new JTextArea();
        label15 = new JLabel();
        label1 = new JLabel();
        receiverNameLabelToGetData = new JLabel();
        label3 = new JLabel();
        label4 = new JLabel();
        totalCostLabelToGetData = new JLabel();
        label17 = new JLabel();
        itemTypeLabelToGetData = new JLabel();
        label19 = new JLabel();
        scrollPane2 = new JScrollPane();
        receiverAddressLabelToGetData = new JTextArea();

        //======== this ========
        setFont(new Font(".AppleSystemUIFont", Font.PLAIN, 20));
        setAutoRequestFocus(false);
        setResizable(false);
        var contentPane = getContentPane();

        //---- receiptNumLabel ----
        receiptNumLabel.setText("Receipt :");
        receiptNumLabel.setFont(new Font(".AppleSystemUIFont", Font.PLAIN, 20));

        //---- receiptNumberLabel ----
        receiptNumberLabel.setText("Error");
        receiptNumberLabel.setFont(new Font(".AppleSystemUIFont", Font.PLAIN, 20));
        receiptNumberLabel.setForeground(new Color(255, 153, 153));

        //---- customerInfoLabel ----
        customerInfoLabel.setText("Customer Information");
        customerInfoLabel.setFont(new Font(".AppleSystemUIFont", Font.BOLD | Font.ITALIC, 28));

        //---- label5 ----
        label5.setText("Delivery Receipt");
        label5.setFont(new Font("Academy Engraved LET", Font.PLAIN, 36));

        //---- label6 ----
        label6.setText("Name");
        label6.setFont(new Font(".AppleSystemUIFont", Font.BOLD, 16));

        //---- label7 ----
        label7.setText("Email");
        label7.setFont(new Font(".AppleSystemUIFont", Font.BOLD, 16));
        label7.setForeground(Color.black);

        //---- phoneLabelToGetData ----
        phoneLabelToGetData.setText("Phone Label");
        phoneLabelToGetData.setFont(new Font(".AppleSystemUIFont", Font.PLAIN, 16));

        //---- label9 ----
        label9.setText("Phone");
        label9.setFont(new Font(".AppleSystemUIFont", Font.BOLD, 16));

        //---- emailLabelToGetData ----
        emailLabelToGetData.setText("Email");
        emailLabelToGetData.setFont(new Font(".AppleSystemUIFont", Font.PLAIN, 16));

        //---- nameLabelToGetData ----
        nameLabelToGetData.setText("Name");
        nameLabelToGetData.setFont(new Font(".AppleSystemUIFont", Font.PLAIN, 16));

        //---- label12 ----
        label12.setText("Delivery Date");
        label12.setFont(new Font(".AppleSystemUIFont", Font.BOLD, 16));

        //---- dateLabelToGetData ----
        dateLabelToGetData.setText("16-12-1996");
        dateLabelToGetData.setFont(new Font(".AppleSystemUIFont", Font.PLAIN, 16));

        //---- label14 ----
        label14.setText("Delivery Address");
        label14.setFont(new Font(".AppleSystemUIFont", Font.BOLD, 16));
        label14.setLabelFor(addressTextAreaToGetData);

        //======== scrollPane1 ========
        {

            //---- addressTextAreaToGetData ----
            addressTextAreaToGetData.setLineWrap(true);
            addressTextAreaToGetData.setText("ikebavreg erhgo54gj wfgbruitc34 c94cht 953opth4ct 4fhrg c598th498rohcrg9prc g3rtg v58t54t");
            scrollPane1.setViewportView(addressTextAreaToGetData);
        }

        //---- label15 ----
        label15.setText("Order Details");
        label15.setFont(new Font(".AppleSystemUIFont", Font.BOLD | Font.ITALIC, 28));

        //---- label1 ----
        label1.setText("Received By");
        label1.setFont(new Font(".AppleSystemUIFont", Font.BOLD, 16));

        //---- receiverNameLabelToGetData ----
        receiverNameLabelToGetData.setText("Name");
        receiverNameLabelToGetData.setFont(new Font("Segoe UI", Font.PLAIN, 16));

        //---- label3 ----
        label3.setText("Subtotal");
        label3.setFont(new Font(".AppleSystemUIFont", Font.BOLD, 16));

        //---- label4 ----
        label4.setText("text");

        //---- totalCostLabelToGetData ----
        totalCostLabelToGetData.setText("Total");
        totalCostLabelToGetData.setFont(new Font("Segoe UI", Font.PLAIN, 16));

        //---- label17 ----
        label17.setText("Item Type");
        label17.setFont(new Font(".AppleSystemUIFont", Font.BOLD, 16));

        //---- itemTypeLabelToGetData ----
        itemTypeLabelToGetData.setText("Type");
        itemTypeLabelToGetData.setFont(new Font("Segoe UI", Font.PLAIN, 16));

        //---- label19 ----
        label19.setText("Address");
        label19.setFont(new Font(".AppleSystemUIFont", Font.BOLD, 16));

        //======== scrollPane2 ========
        {

            //---- receiverAddressLabelToGetData ----
            receiverAddressLabelToGetData.setLineWrap(true);
            receiverAddressLabelToGetData.setWrapStyleWord(true);
            receiverAddressLabelToGetData.setText("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum of Lorem Ipsum.");
            receiverAddressLabelToGetData.setEditable(false);
            scrollPane2.setViewportView(receiverAddressLabelToGetData);
        }

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                            .addComponent(label5, GroupLayout.PREFERRED_SIZE, 304, GroupLayout.PREFERRED_SIZE)
                            .addGap(82, 82, 82))
                        .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                            .addComponent(label15, GroupLayout.PREFERRED_SIZE, 268, GroupLayout.PREFERRED_SIZE)
                            .addGap(108, 108, 108))))
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(147, 147, 147)
                            .addComponent(receiptNumLabel, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(receiptNumberLabel, GroupLayout.PREFERRED_SIZE, 183, GroupLayout.PREFERRED_SIZE))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addComponent(label7, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(emailLabelToGetData, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE))
                                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                                    .addComponent(label9, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(phoneLabelToGetData, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(contentPaneLayout.createParallelGroup()
                                .addComponent(label14, GroupLayout.PREFERRED_SIZE, 151, GroupLayout.PREFERRED_SIZE)
                                .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 273, GroupLayout.PREFERRED_SIZE)))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                .addGroup(GroupLayout.Alignment.LEADING, contentPaneLayout.createSequentialGroup()
                                    .addGroup(contentPaneLayout.createParallelGroup()
                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                            .addComponent(label1, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(receiverNameLabelToGetData, GroupLayout.PREFERRED_SIZE, 179, GroupLayout.PREFERRED_SIZE))
                                        .addComponent(label19, GroupLayout.PREFERRED_SIZE, 149, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(scrollPane2, GroupLayout.PREFERRED_SIZE, 273, GroupLayout.PREFERRED_SIZE))
                                    .addGroup(contentPaneLayout.createParallelGroup()
                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                            .addGap(75, 75, 75)
                                            .addComponent(label4)
                                            .addGap(0, 0, Short.MAX_VALUE))
                                        .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(contentPaneLayout.createParallelGroup()
                                                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                                                    .addComponent(label17, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                                                    .addComponent(itemTypeLabelToGetData, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE))
                                                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                                                    .addComponent(label3, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(totalCostLabelToGetData, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE))))))
                                .addGroup(GroupLayout.Alignment.LEADING, contentPaneLayout.createSequentialGroup()
                                    .addComponent(label6, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(contentPaneLayout.createParallelGroup()
                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                            .addComponent(nameLabelToGetData, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(label12)
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(dateLabelToGetData, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE))
                                        .addComponent(customerInfoLabel, GroupLayout.PREFERRED_SIZE, 328, GroupLayout.PREFERRED_SIZE))
                                    .addGap(64, 64, 64)))))
                    .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(label5, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(receiptNumberLabel, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
                        .addComponent(receiptNumLabel, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(customerInfoLabel, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                    .addGap(22, 22, 22)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label12, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                        .addComponent(nameLabelToGetData, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                        .addComponent(label6, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                        .addComponent(dateLabelToGetData, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label7, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
                        .addComponent(emailLabelToGetData, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
                        .addComponent(label14, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE))
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGroup(contentPaneLayout.createParallelGroup()
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addGap(16, 16, 16)
                                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(label9, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(phoneLabelToGetData, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)))
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)))
                            .addGap(30, 30, 30)
                            .addComponent(label15, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(label4)))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label1, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                        .addComponent(itemTypeLabelToGetData, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
                        .addComponent(receiverNameLabelToGetData, GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                        .addComponent(label17, GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE))
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(32, 32, 32)
                            .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                .addComponent(label3, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                                .addComponent(totalCostLabelToGetData, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(label19, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(scrollPane2, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)))
                    .addGap(60, 60, 60))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
        receiverAddressLabelToGetData.setEditable(false);
        addressTextAreaToGetData.setEditable(false);
        receiptNumberLabel.setText(String.valueOf(sender.getOrderId()));
        nameLabelToGetData.setText(sender.getName());
        emailLabelToGetData.setText(csi.geteMailID());
        phoneLabelToGetData.setText(sender.getPhone());
        dateLabelToGetData.setText(product.getEstDeliveryDate());
        addressTextAreaToGetData.setText(sender.getAddress());
        
        receiverNameLabelToGetData.setText(receiver.getName());
        receiverAddressLabelToGetData.setText(receiver.getAddress());
        itemTypeLabelToGetData.setText(product.getParcelType());
        totalCostLabelToGetData.setText(String.valueOf(product.getFee()));
        
        
        
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Adwait
    private JLabel receiptNumLabel;
    private JLabel receiptNumberLabel;
    private JLabel customerInfoLabel;
    private JLabel label5;
    private JLabel label6;
    private JLabel label7;
    private JLabel phoneLabelToGetData;
    private JLabel label9;
    private JLabel emailLabelToGetData;
    private JLabel nameLabelToGetData;
    private JLabel label12;
    private JLabel dateLabelToGetData;
    private JLabel label14;
    private JScrollPane scrollPane1;
    private JTextArea addressTextAreaToGetData;
    private JLabel label15;
    private JLabel label1;
    private JLabel receiverNameLabelToGetData;
    private JLabel label3;
    private JLabel label4;
    private JLabel totalCostLabelToGetData;
    private JLabel label17;
    private JLabel itemTypeLabelToGetData;
    private JLabel label19;
    private JScrollPane scrollPane2;
    private JTextArea receiverAddressLabelToGetData;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
    
}
