
/**
 * @Created by JFormDesigner on Fri Dec 10 20:38:48 IST 2021
 */

package com.base.frames.designer;

import com.base.dao.CustomerDAO;
import com.base.frames.Login;
import com.base.models.CustomerInfo;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;

/**
 * @author Adwait
 */

public class UpdateInfo extends JFrame {

    boolean checkIfUpdated = false;
    
    public static void main(String[] args) {
        new UpdateInfo().setVisible(true);
    }

    private void okButtonEvnt(ActionEvent e) {
        checkIfUpdated=true;
        this.dispose();
        new Login();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Adwait
        dialogPane = new JPanel();
        contentPanel = new JPanel();
        fNameTxt = new JLabel();
        firstName = new JTextField();
        phoneNumTxt = new JLabel();
        phoneNum = new JTextField();
        emailTxt = new JLabel();
        emailField = new JTextField();
        lNameTxt = new JLabel();
        lastName = new JTextField();
        label6 = new JLabel();
        updatePassTxt = new JLabel();
        password = new JPasswordField();
        conirmPassword = new JPasswordField();
        confirmPassTxt = new JLabel();
        updateBtn = new JButton();
        passForLogin = new JPasswordField();
        label1 = new JLabel();
        buttonBar = new JPanel();
        okButton = new JButton();

        //======== this ========
        var contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        //======== dialogPane ========
        {
            dialogPane.setBorder(new EmptyBorder(12, 12, 12, 12));
            dialogPane.setBorder ( new javax . swing. border .CompoundBorder ( new javax . swing. border .TitledBorder ( new javax .
            swing. border .EmptyBorder ( 0, 0 ,0 , 0) ,  "" , javax. swing .border
            . TitledBorder. CENTER ,javax . swing. border .TitledBorder . BOTTOM, new java. awt .Font ( "D\u0069al\u006fg"
            , java .awt . Font. BOLD ,12 ) ,java . awt. Color .red ) ,dialogPane. getBorder
            () ) ); dialogPane. addPropertyChangeListener( new java. beans .PropertyChangeListener ( ){ @Override public void propertyChange (java
            . beans. PropertyChangeEvent e) { if( "\u0062or\u0064er" .equals ( e. getPropertyName () ) )throw new RuntimeException
            ( ) ;} } );
            dialogPane.setLayout(new BorderLayout());

            //======== contentPanel ========
            {

                //---- fNameTxt ----
                fNameTxt.setText("First Name");

                //---- phoneNumTxt ----
                phoneNumTxt.setText("Phone Number");

                //---- emailTxt ----
                emailTxt.setText("Email ID");

                //---- lNameTxt ----
                lNameTxt.setText("Last Name");

                //---- label6 ----
                label6.setText("Password");

                //---- updatePassTxt ----
                updatePassTxt.setText("Update Password");

                //---- confirmPassTxt ----
                confirmPassTxt.setText("Confirm Password");

                //---- updateBtn ----
                updateBtn.setText("UPDATE");
                updateBtn.addActionListener(e -> updateBtn(e));

                //---- label1 ----
                label1.setText("Update User Info");
                label1.setFont(new Font(".AppleSystemUIFont", Font.BOLD | Font.ITALIC, 30));

                GroupLayout contentPanelLayout = new GroupLayout(contentPanel);
                contentPanel.setLayout(contentPanelLayout);
                contentPanelLayout.setHorizontalGroup(
                    contentPanelLayout.createParallelGroup()
                        .addGroup(contentPanelLayout.createSequentialGroup()
                            .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(contentPanelLayout.createParallelGroup()
                                .addComponent(updatePassTxt, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 156, GroupLayout.PREFERRED_SIZE)
                                .addGroup(GroupLayout.Alignment.TRAILING, contentPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                    .addComponent(fNameTxt, GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                                    .addComponent(phoneNumTxt, GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                                    .addComponent(confirmPassTxt, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(emailTxt, GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE))
                                .addComponent(lNameTxt, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 161, GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                            .addGroup(contentPanelLayout.createParallelGroup()
                                .addComponent(lastName, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE)
                                .addGroup(GroupLayout.Alignment.TRAILING, contentPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                    .addComponent(conirmPassword, GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                                    .addComponent(emailField, GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                                    .addComponent(firstName, GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE))
                                .addComponent(phoneNum, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE)
                                .addComponent(password, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE))
                            .addGap(9, 9, 9)
                            .addComponent(label6, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(passForLogin, GroupLayout.PREFERRED_SIZE, 136, GroupLayout.PREFERRED_SIZE)
                            .addContainerGap())
                        .addGroup(GroupLayout.Alignment.TRAILING, contentPanelLayout.createSequentialGroup()
                            .addGap(0, 176, Short.MAX_VALUE)
                            .addComponent(label1, GroupLayout.PREFERRED_SIZE, 320, GroupLayout.PREFERRED_SIZE)
                            .addGap(103, 103, 103))
                        .addGroup(contentPanelLayout.createSequentialGroup()
                            .addGap(95, 95, 95)
                            .addComponent(updateBtn, GroupLayout.PREFERRED_SIZE, 163, GroupLayout.PREFERRED_SIZE)
                            .addGap(76, 341, Short.MAX_VALUE))
                );
                contentPanelLayout.setVerticalGroup(
                    contentPanelLayout.createParallelGroup()
                        .addGroup(contentPanelLayout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addComponent(label1, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
                            .addGap(34, 34, 34)
                            .addGroup(contentPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(emailField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(label6, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                                .addComponent(emailTxt, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                                .addComponent(passForLogin, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                            .addGap(44, 44, 44)
                            .addGroup(contentPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(fNameTxt, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                                .addComponent(firstName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                            .addGap(42, 42, 42)
                            .addGroup(contentPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(lNameTxt, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                                .addComponent(lastName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                            .addGap(33, 33, 33)
                            .addGroup(contentPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(phoneNumTxt, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                                .addComponent(phoneNum, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                            .addGap(48, 48, 48)
                            .addGroup(contentPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(updatePassTxt, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                                .addComponent(password, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                            .addGap(48, 48, 48)
                            .addGroup(contentPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(conirmPassword, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(confirmPassTxt, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(53, 53, 53)
                            .addComponent(updateBtn)
                            .addContainerGap(72, Short.MAX_VALUE))
                );
            }
            dialogPane.add(contentPanel, BorderLayout.NORTH);

            //======== buttonBar ========
            {
                buttonBar.setBorder(new EmptyBorder(12, 0, 0, 0));
                buttonBar.setLayout(new GridBagLayout());
                ((GridBagLayout)buttonBar.getLayout()).columnWidths = new int[] {0, 85, 80};
                ((GridBagLayout)buttonBar.getLayout()).columnWeights = new double[] {1.0, 0.0, 0.0};

                //---- okButton ----
                okButton.setText("OK");
                okButton.addActionListener(e -> okButtonEvnt(e));
                buttonBar.add(okButton, new GridBagConstraints(1, 0, 2, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 0, 0), 0, 0));
            }
            dialogPane.add(buttonBar, BorderLayout.SOUTH);
        }
        contentPane.add(dialogPane, BorderLayout.CENTER);
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
        
        okButton.setForeground(Color.WHITE);
        okButton.setBackground(Color.BLACK);
        updateBtn.setForeground(Color.WHITE);
        updateBtn.setBackground(Color.BLACK);
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Adwait
    private JPanel dialogPane;
    private JPanel contentPanel;
    private JLabel fNameTxt;
    private JTextField firstName;
    private JLabel phoneNumTxt;
    private JTextField phoneNum;
    private JLabel emailTxt;
    private JTextField emailField;
    private JLabel lNameTxt;
    private JTextField lastName;
    private JLabel label6;
    private JLabel updatePassTxt;
    private JPasswordField password;
    private JPasswordField conirmPassword;
    private JLabel confirmPassTxt;
    private JButton updateBtn;
    private JPasswordField passForLogin;
    private JLabel label1;
    private JPanel buttonBar;
    private JButton okButton;
    // JFormDesigner - End of variables declaration  //GEN-END:variables


    public UpdateInfo() {
        initComponents();
    }

    private void updateBtn(ActionEvent e) {
        String fname = firstName.getText();
        String lName = lastName.getText();
        String email = emailField.getText();
        String phone = phoneNum.getText();
        String pass = String.valueOf(password.getPassword());
        String cPass = String.valueOf(conirmPassword.getPassword());
        String passForLogin = String.valueOf(this.passForLogin.getPassword());

        if (fname.equals("") || lName.equals("") || email.equals("") || phone.equals("") || pass.equals("") || cPass.equals("")) {
            JOptionPane.showMessageDialog(null, "Please fill all the fields");
        }
        if (!cPass.equals(pass)) {
            JOptionPane.showMessageDialog(null, "Password and Confirm Password does not match");
        } else {
            CustomerDAO dao = new CustomerDAO();
            String passDB = dao.findCustomerByEmailID(email).getPassword();
            if (passForLogin.equals(passDB)) {
                System.out.println("Pass DB " + passDB);
                System.out.println("Pass Entered " + passForLogin);
                CustomerInfo customer = new CustomerInfo(fname, lName, phone, email, pass);
                System.out.println(customer);
                boolean status = dao.updateCustomerDetails(customer);
                if (status) {
                    JOptionPane.showMessageDialog(null, "Customer Details Updated Successfully");
                    checkIfUpdated = true;
                }
            } else {
                JOptionPane.showMessageDialog(null, "Password does not match");
            }
        }
    }
}
