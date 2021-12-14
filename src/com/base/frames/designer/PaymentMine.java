/*
 * Created by JFormDesigner on Fri Dec 10 20:26:08 IST 2021
 */

package com.base.frames.designer;

import com.base.models.CustomerInfo;

import javax.swing.*;
import java.awt.*;

/**
 * @author Adwait
 */
public class PaymentMine extends JFrame {

    static CustomerInfo csi;

    public static void main(String[] args) {
        new PaymentMine(csi).setVisible(true);
    }

    public PaymentMine(CustomerInfo csi) {
        PaymentMine.csi = csi;
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
        label8 = new JLabel();
        label9 = new JLabel();
        label10 = new JLabel();
        label11 = new JLabel();
        label12 = new JLabel();
        label13 = new JLabel();
        label14 = new JLabel();
        scrollPane1 = new JScrollPane();
        addressTextArea = new JTextArea();
        label15 = new JLabel();
        label1 = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();
        label4 = new JLabel();
        label16 = new JLabel();
        label17 = new JLabel();
        label18 = new JLabel();
        label19 = new JLabel();
        scrollPane2 = new JScrollPane();
        textArea1 = new JTextArea();

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
        customerInfoLabel.setText("Customer Information :");
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

        //---- label8 ----
        label8.setText("Phone Label");
        label8.setFont(new Font(".AppleSystemUIFont", Font.PLAIN, 16));

        //---- label9 ----
        label9.setText("Phone");
        label9.setFont(new Font(".AppleSystemUIFont", Font.BOLD, 16));

        //---- label10 ----
        label10.setText("Email");
        label10.setFont(new Font(".AppleSystemUIFont", Font.PLAIN, 16));

        //---- label11 ----
        label11.setText("Name");
        label11.setFont(new Font(".AppleSystemUIFont", Font.PLAIN, 16));

        //---- label12 ----
        label12.setText("Delivery Date");
        label12.setFont(new Font(".AppleSystemUIFont", Font.BOLD, 16));

        //---- label13 ----
        label13.setText("16-12-1996");
        label13.setFont(new Font(".AppleSystemUIFont", Font.PLAIN, 16));

        //---- label14 ----
        label14.setText("Delivery Address");
        label14.setFont(new Font(".AppleSystemUIFont", Font.BOLD, 16));
        label14.setLabelFor(addressTextArea);

        //======== scrollPane1 ========
        {

            //---- addressTextArea ----
            addressTextArea.setLineWrap(true);
            addressTextArea.setText("ikebavreg erhgo54gj wfgbruitc34 c94cht 953opth4ct 4fhrg c598th498rohcrg9prc g3rtg v58t54t");
            scrollPane1.setViewportView(addressTextArea);
        }

        //---- label15 ----
        label15.setText("Order Details");
        label15.setFont(new Font(".AppleSystemUIFont", Font.BOLD | Font.ITALIC, 28));

        //---- label1 ----
        label1.setText("Received By");
        label1.setFont(new Font(".AppleSystemUIFont", Font.BOLD, 16));

        //---- label2 ----
        label2.setText("Name");

        //---- label3 ----
        label3.setText("Subtotal");
        label3.setFont(new Font(".AppleSystemUIFont", Font.BOLD, 16));

        //---- label4 ----
        label4.setText("text");

        //---- label16 ----
        label16.setText("Total");

        //---- label17 ----
        label17.setText("Item Type");
        label17.setFont(new Font(".AppleSystemUIFont", Font.BOLD, 16));

        //---- label18 ----
        label18.setText("Type");

        //---- label19 ----
        label19.setText("Address");
        label19.setFont(new Font(".AppleSystemUIFont", Font.BOLD, 16));

        //======== scrollPane2 ========
        {

            //---- textArea1 ----
            textArea1.setLineWrap(true);
            textArea1.setWrapStyleWord(true);
            textArea1.setText("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum of Lorem Ipsum.");
            textArea1.setEditable(false);
            scrollPane2.setViewportView(textArea1);
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
                                    .addComponent(label10, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE))
                                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                                    .addComponent(label9, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(label8, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(contentPaneLayout.createParallelGroup()
                                .addComponent(label14, GroupLayout.PREFERRED_SIZE, 151, GroupLayout.PREFERRED_SIZE)
                                .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 273, GroupLayout.PREFERRED_SIZE)))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                .addGroup(GroupLayout.Alignment.LEADING, contentPaneLayout.createSequentialGroup()
                                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                            .addComponent(label1, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(label2, GroupLayout.PREFERRED_SIZE, 179, GroupLayout.PREFERRED_SIZE))
                                        .addComponent(label19, GroupLayout.PREFERRED_SIZE, 149, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(scrollPane2))
                                    .addGroup(contentPaneLayout.createParallelGroup()
                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                            .addGap(75, 75, 75)
                                            .addComponent(label4)
                                            .addGap(0, 0, Short.MAX_VALUE))
                                        .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                                            .addGroup(contentPaneLayout.createParallelGroup()
                                                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                                                    .addComponent(label17, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(label18, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE))
                                                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                                                    .addComponent(label3, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(label16, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE))))))
                                .addGroup(GroupLayout.Alignment.LEADING, contentPaneLayout.createSequentialGroup()
                                    .addComponent(label6, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(contentPaneLayout.createParallelGroup()
                                        .addComponent(customerInfoLabel, GroupLayout.PREFERRED_SIZE, 418, GroupLayout.PREFERRED_SIZE)
                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                            .addComponent(label11, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(label12)
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(label13, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)))))))
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
                        .addComponent(label11, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                        .addComponent(label6, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                        .addComponent(label13, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label7, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
                        .addComponent(label10, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
                        .addComponent(label14, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE))
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGroup(contentPaneLayout.createParallelGroup()
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addGap(16, 16, 16)
                                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(label9, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(label8, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)))
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
                        .addComponent(label18, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
                        .addComponent(label17, GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                        .addComponent(label2, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(32, 32, 32)
                            .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                .addComponent(label3, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                                .addComponent(label16, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(label19, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(scrollPane2, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)))
                    .addGap(59, 59, 59))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
        addressTextArea.setEditable(false);

    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Adwait
    private JLabel receiptNumLabel;
    private JLabel receiptNumberLabel;
    private JLabel customerInfoLabel;
    private JLabel label5;
    private JLabel label6;
    private JLabel label7;
    private JLabel label8;
    private JLabel label9;
    private JLabel label10;
    private JLabel label11;
    private JLabel label12;
    private JLabel label13;
    private JLabel label14;
    private JScrollPane scrollPane1;
    private JTextArea addressTextArea;
    private JLabel label15;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JLabel label16;
    private JLabel label17;
    private JLabel label18;
    private JLabel label19;
    private JScrollPane scrollPane2;
    private JTextArea textArea1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables


}
