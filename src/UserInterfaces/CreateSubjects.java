/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterfaces;

import List.CourAndSubjList;
import javax.swing.JOptionPane;


/**
 *
 * @author dillan
 */
public class CreateSubjects extends javax.swing.JPanel {

    /**
     * Creates new form CreateM
     */
    public CreateSubjects() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        MattersList = new javax.swing.JComboBox<>();
        CreateMatterButton = new javax.swing.JButton();

        Background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tlwg Typo", 1, 24)); // NOI18N
        jLabel2.setText("Name:");

        jLabel3.setFont(new java.awt.Font("Tlwg Typo", 1, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Create Subject");

        MattersList.setFont(new java.awt.Font("TlwgTypewriter", 3, 15)); // NOI18N
        MattersList.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Maths", "English", "Chemistry", "Philosophy", "Physical", "Physical Education", "Natural Sciences", "Social Sciences" }));

        CreateMatterButton.setFont(new java.awt.Font("TlwgTypewriter", 1, 18)); // NOI18N
        CreateMatterButton.setText("Create");
        CreateMatterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateMatterButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(180, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(MattersList, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(205, 205, 205)
                        .addComponent(CreateMatterButton)))
                .addGap(315, 315, 315))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(312, 312, 312)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(64, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MattersList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addComponent(CreateMatterButton)
                .addGap(131, 131, 131))
        );

        Background.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 410));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void CreateMatterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateMatterButtonActionPerformed

        String name = MattersList.getSelectedItem().toString();
        
        if(Subject.verifyNewSubject(name) == -1){
            Subject subject = new Subject(name);
            CourAndSubjList.addSubject(subject);
            JOptionPane.showMessageDialog(null, "Course created successfully");
        } else {
            JOptionPane.showMessageDialog(null, "The course already exists.");

        }

    }//GEN-LAST:event_CreateMatterButtonActionPerformed

//    public void writeFile(Subject matter){
//        File file = new File("src/Files/Matters.txt");
//
//        try {
//            PrintWriter exit =  new PrintWriter(new FileWriter(file, true));
//            exit.println(matter.getNameMater());
//            exit.close();
//        } catch (FileNotFoundException ex){
//            ex.printStackTrace(System.out);
//        } catch (IOException ex) {
//            ex.printStackTrace(System.out);
//        }
//
//    }
//    
//    public boolean checkCourses(Subject matter){
//        File file = new File("src/Files/Matters.txt");
//
//        boolean cheak = true;
//
//        try {
//            BufferedReader entry = new BufferedReader(new FileReader(file));
//            String reading = entry.readLine();
//            while (reading != null){
//                if (reading.equals(matter.getNameMater())){
//                    cheak = false;
//                }
//                reading = entry.readLine();
//            }
//            entry.close();
//        } catch (FileNotFoundException ex){
//            ex.printStackTrace();
//        } catch (IOException ex){
//            ex.printStackTrace();
//        }
//        return cheak;
//        
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JButton CreateMatterButton;
    private javax.swing.JComboBox<String> MattersList;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
