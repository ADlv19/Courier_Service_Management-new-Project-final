/*
 * Created by JFormDesigner on Sun Dec 12 19:20:08 IST 2021
 */

package com.base.frames.designer;

import com.base.frames.Login;
import com.base.frames.SRDetails;
import com.base.models.CustomerInfo;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.border.*;

/**
 * @author Adwait
 */

public class CustomerDashboard extends JFrame {
    
    static CustomerInfo csi= new CustomerInfo();
    
    public CustomerDashboard(CustomerInfo csi) {
        CustomerDashboard.csi = csi;
        initComponents();
    }

    private void settingsButtom(ActionEvent e) {
        dispose();
        new UpdateInfo().setVisible(true);
    }

    private void newOrder(ActionEvent e) {
        dispose();
        new SRDetails(csi).setVisible(true);
    }

    private void cancelButton(ActionEvent e) {
        dispose();
        new Login().setVisible(true);
    }

    private void previousOrder(ActionEvent e) {
        setVisible(false);
        new TableExample(csi).setVisible(true);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Adwait
        dialogPane = new JPanel();
        contentPanel = new JPanel();
        label1 = new JLabel();
        userName = new JLabel();
        previousOrderButton = new JButton();
        newOrderButton = new JButton();
        settingsButtom = new JButton();
        buttonBar = new JPanel();
        cancelButton = new JButton();

        //======== this ========
        var contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        //======== dialogPane ========
        {
            dialogPane.setBorder(new EmptyBorder(12, 12, 12, 12));
            dialogPane.setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new
            javax. swing. border. EmptyBorder( 0, 0, 0, 0) , "", javax
            . swing. border. TitledBorder. CENTER, javax. swing. border. TitledBorder. BOTTOM, new java
            .awt .Font ("D\u0069alog" ,java .awt .Font .BOLD ,12 ), java. awt
            . Color. red) ,dialogPane. getBorder( )) ); dialogPane. addPropertyChangeListener (new java. beans.
            PropertyChangeListener( ){ @Override public void propertyChange (java .beans .PropertyChangeEvent e) {if ("\u0062order" .
            equals (e .getPropertyName () )) throw new RuntimeException( ); }} );
            dialogPane.setLayout(new BorderLayout());

            //======== contentPanel ========
            {

                //---- label1 ----
                label1.setText("Welcome");
                label1.setFont(new Font(".AppleSystemUIFont", Font.BOLD | Font.ITALIC, 28));

                //---- userName ----
                userName.setFont(new Font(".AppleSystemUIFont", Font.BOLD | Font.ITALIC, 28));
                userName.setText("User");

                //---- previousOrderButton ----
                previousOrderButton.setText("See Previous Orders");
                previousOrderButton.setFont(new Font(".AppleSystemUIFont", Font.PLAIN, 20));
                previousOrderButton.addActionListener(e -> previousOrder(e));

                //---- newOrderButton ----
                newOrderButton.setText("Place New Order");
                newOrderButton.setFont(new Font(".AppleSystemUIFont", Font.PLAIN, 20));
                newOrderButton.addActionListener(e -> newOrder(e));

                //---- settingsButtom ----
                settingsButtom.setText("Settings");
                settingsButtom.setFont(new Font(".AppleSystemUIFont", Font.PLAIN, 20));
                settingsButtom.addActionListener(e -> settingsButtom(e));

                GroupLayout contentPanelLayout = new GroupLayout(contentPanel);
                contentPanel.setLayout(contentPanelLayout);
                contentPanelLayout.setHorizontalGroup(
                    contentPanelLayout.createParallelGroup()
                        .addGroup(contentPanelLayout.createSequentialGroup()
                            .addGap(18, 18, 18)
                            .addComponent(label1, GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(userName, GroupLayout.PREFERRED_SIZE, 337, GroupLayout.PREFERRED_SIZE)
                            .addContainerGap(18, Short.MAX_VALUE))
                        .addGroup(GroupLayout.Alignment.TRAILING, contentPanelLayout.createSequentialGroup()
                            .addGap(0, 157, Short.MAX_VALUE)
                            .addGroup(contentPanelLayout.createParallelGroup()
                                .addComponent(newOrderButton, GroupLayout.PREFERRED_SIZE, 231, GroupLayout.PREFERRED_SIZE)
                                .addComponent(previousOrderButton, GroupLayout.PREFERRED_SIZE, 231, GroupLayout.PREFERRED_SIZE)
                                .addComponent(settingsButtom, GroupLayout.PREFERRED_SIZE, 231, GroupLayout.PREFERRED_SIZE))
                            .addGap(131, 131, 131))
                );
                contentPanelLayout.setVerticalGroup(
                    contentPanelLayout.createParallelGroup()
                        .addGroup(contentPanelLayout.createSequentialGroup()
                            .addGap(26, 26, 26)
                            .addGroup(contentPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(label1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(userName, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE))
                            .addGap(96, 96, 96)
                            .addComponent(previousOrderButton, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
                            .addGap(31, 31, 31)
                            .addComponent(newOrderButton, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                            .addGap(37, 37, 37)
                            .addComponent(settingsButtom, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                            .addContainerGap(181, Short.MAX_VALUE))
                );
            }
            dialogPane.add(contentPanel, BorderLayout.CENTER);

            //======== buttonBar ========
            {
                buttonBar.setBorder(new EmptyBorder(12, 0, 0, 0));
                buttonBar.setLayout(new GridBagLayout());
                ((GridBagLayout)buttonBar.getLayout()).columnWidths = new int[] {0, 85, 80};
                ((GridBagLayout)buttonBar.getLayout()).columnWeights = new double[] {1.0, 0.0, 0.0};

                //---- cancelButton ----
                cancelButton.setText("Cancel");
                cancelButton.addActionListener(e -> cancelButton(e));
                buttonBar.add(cancelButton, new GridBagConstraints(2, 0, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 0, 0), 0, 0));
            }
            dialogPane.add(buttonBar, BorderLayout.SOUTH);
        }
        contentPane.add(dialogPane, BorderLayout.CENTER);
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
        
        userName.setText(csi.getFirstName() + " " + csi.getLastName());
        
        cancelButton.setBackground(Color.BLACK);
        cancelButton.setForeground(Color.WHITE);
        
        newOrderButton.setBackground(Color.BLACK);
        newOrderButton.setForeground(Color.WHITE);
        
        previousOrderButton.setBackground(Color.BLACK);
        previousOrderButton.setForeground(Color.WHITE);
        
        settingsButtom.setBackground(Color.BLACK);
        settingsButtom.setForeground(Color.WHITE);
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Adwait
    private JPanel dialogPane;
    private JPanel contentPanel;
    private JLabel label1;
    private JLabel userName;
    private JButton previousOrderButton;
    private JButton newOrderButton;
    private JButton settingsButtom;
    private JPanel buttonBar;
    private JButton cancelButton;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
