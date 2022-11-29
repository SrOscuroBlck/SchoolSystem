/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package schoolsystem.userInterface.TSInterface.TeacherInterface;

import DataControl.DataControl;
import java.awt.BorderLayout;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.logging.Level;
import java.util.logging.Logger;
import schoolsystem.userInterface.Pages.PrincipalPage;


/**
 *
 * @author gustavocamargo
 */
public class UserGUI extends javax.swing.JFrame {
    
    DataControl data = new DataControl();
    
    public int position;
   
    public UserGUI() {
        initComponents();
        this.setLocationRelativeTo(null);
        setTitle("Teacher Control Panel [ School System ]");
    }
    
     /**
     * Creates new form UserGUI
     * @param pos
     */
    public UserGUI(int pos) {
        this.position = pos;
        System.out.println("UserGUI: " + this.position);
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        sideBarPanel = new javax.swing.JPanel();
        gradesButton = new javax.swing.JButton();
        profileButton = new javax.swing.JButton();
        outButton = new javax.swing.JButton();
        reportsButton = new javax.swing.JButton();
        headerPanel = new javax.swing.JPanel();
        logoLabel = new javax.swing.JLabel();
        principalPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        mainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sideBarPanel.setBackground(new java.awt.Color(207, 102, 0));

        gradesButton.setBackground(new java.awt.Color(0, 0, 0));
        gradesButton.setForeground(new java.awt.Color(255, 255, 255));
        gradesButton.setText("Set Grades");
        gradesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gradesButtonActionPerformed(evt);
            }
        });

        profileButton.setBackground(new java.awt.Color(0, 0, 0));
        profileButton.setForeground(new java.awt.Color(255, 255, 255));
        profileButton.setText("View Profile");
        profileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profileButtonActionPerformed(evt);
            }
        });

        outButton.setBackground(new java.awt.Color(0, 0, 0));
        outButton.setForeground(new java.awt.Color(255, 255, 255));
        outButton.setText("Log Out");
        outButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                outButtonActionPerformed(evt);
            }
        });

        reportsButton.setBackground(new java.awt.Color(0, 0, 0));
        reportsButton.setForeground(new java.awt.Color(255, 255, 255));
        reportsButton.setText("View Reports");
        reportsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportsButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout sideBarPanelLayout = new javax.swing.GroupLayout(sideBarPanel);
        sideBarPanel.setLayout(sideBarPanelLayout);
        sideBarPanelLayout.setHorizontalGroup(
            sideBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sideBarPanelLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(sideBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(gradesButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(profileButton, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(outButton, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reportsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(61, 61, 61))
        );
        sideBarPanelLayout.setVerticalGroup(
            sideBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sideBarPanelLayout.createSequentialGroup()
                .addContainerGap(160, Short.MAX_VALUE)
                .addComponent(gradesButton)
                .addGap(64, 64, 64)
                .addComponent(reportsButton)
                .addGap(68, 68, 68)
                .addComponent(profileButton)
                .addGap(98, 98, 98)
                .addComponent(outButton)
                .addGap(14, 14, 14))
        );

        mainPanel.add(sideBarPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 500));
        sideBarPanel.getAccessibleContext().setAccessibleName("");

        headerPanel.setBackground(new java.awt.Color(0, 0, 0));

        logoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schoolsystem/multimedia/logo-grupo-investigacion.png"))); // NOI18N

        javax.swing.GroupLayout headerPanelLayout = new javax.swing.GroupLayout(headerPanel);
        headerPanel.setLayout(headerPanelLayout);
        headerPanelLayout.setHorizontalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerPanelLayout.createSequentialGroup()
                .addContainerGap(193, Short.MAX_VALUE)
                .addComponent(logoLabel)
                .addGap(174, 174, 174))
        );
        headerPanelLayout.setVerticalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(logoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 130, Short.MAX_VALUE)
        );

        mainPanel.add(headerPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 0, 680, 130));

        javax.swing.GroupLayout principalPanelLayout = new javax.swing.GroupLayout(principalPanel);
        principalPanel.setLayout(principalPanelLayout);
        principalPanelLayout.setHorizontalGroup(
            principalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 640, Short.MAX_VALUE)
        );
        principalPanelLayout.setVerticalGroup(
            principalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 370, Short.MAX_VALUE)
        );

        mainPanel.add(principalPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, 640, 370));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void gradesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gradesButtonActionPerformed
       gradeCreation grades = new gradeCreation(position);
       
       grades.setSize(640,370);
       grades.setLocation(0,0);
       principalPanel.removeAll();
       principalPanel.add(grades,BorderLayout.CENTER);
       principalPanel.revalidate();
       principalPanel.repaint();
       
    }//GEN-LAST:event_gradesButtonActionPerformed

    private void profileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profileButtonActionPerformed
        profilePanel profile = new profilePanel(position);
        
        profile.setSize(640,370);
        profile.setLocation(0,0);
        principalPanel.removeAll();
        principalPanel.add(profile,BorderLayout.CENTER);
        principalPanel.revalidate();
        principalPanel.repaint();
        
    }//GEN-LAST:event_profileButtonActionPerformed

    private void outButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_outButtonActionPerformed
        PrincipalPage pp = new PrincipalPage();
        this.setVisible(false);
        pp.setVisible(true);
    }//GEN-LAST:event_outButtonActionPerformed

    private void reportsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportsButtonActionPerformed
        reportPanel report = new reportPanel(position);
        
        report.setSize(640,370);
        report.setLocation(0,0);
        principalPanel.removeAll();
        principalPanel.add(report,BorderLayout.CENTER);
        principalPanel.revalidate();
        principalPanel.repaint();
    }//GEN-LAST:event_reportsButtonActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        Path directory = Path.of("src/DataControl/Files");
        try {
            DataControl.deleteDirectory(directory);
        } catch (IOException ex) {
            Logger.getLogger(PrincipalPage.class.getName()).log(Level.SEVERE, null, ex);
        }
        data.saveData();
    }//GEN-LAST:event_formWindowClosing

    public void refreshProfile(profilePanel profile) {
        profile.setSize(640,370);
        profile.setLocation(0,0);
        
        principalPanel.removeAll();
        principalPanel.add(profile,BorderLayout.CENTER);
        principalPanel.revalidate();
        principalPanel.repaint();
    };
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UserGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton gradesButton;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JLabel logoLabel;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JButton outButton;
    private javax.swing.JPanel principalPanel;
    private javax.swing.JButton profileButton;
    private javax.swing.JButton reportsButton;
    private javax.swing.JPanel sideBarPanel;
    // End of variables declaration//GEN-END:variables
}
