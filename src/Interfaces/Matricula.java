/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Interfaces;

import List.CourAndSubjList;
import Modelos.CourseM;
import Modelos.SubjectM;
import Modelos.TeacherM;
import UserInterfaces.Course;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import UserInterfaces.Subject;
import java.util.ArrayList;
import schoolsystem.users.Student;
import schoolsystem.users.Teacher;
import schoolsystem.users.UserList;

/**
 *
 * @author maria
 */
public class Matricula extends javax.swing.JPanel {

    DefaultComboBoxModel modelG = new DefaultComboBoxModel();
    DefaultComboBoxModel modelS = new DefaultComboBoxModel();
    DefaultComboBoxModel modelT = new DefaultComboBoxModel();

    public Vector listaT = UserList.getTeacherList();
    public Teacher teacher;
    
    public Vector listaC = CourAndSubjList.getCourseList();
    public Course course;
    
    public Vector listaS = CourAndSubjList.getSubjectList();
    public Subject subject;
    
    

    public Matricula() {
        loadCourse(courses);
        loadSubjects(subjects);
        loadTeacher(teachers);
        initComponents();
    }

    private void loadTeacher(JComboBox teachers) {

        try {
            for (int i = 0; i < listaT.size(); i++) {
                teacher = (Teacher) listaT.elementAt(i);
                if (teacher.getName() != null) {
                    modelT.addElement(new TeacherM(teacher.getName(),teacher.getUser()));
                } else {
                    modelT.addElement(i);
                }
            }
            
        } catch (NullPointerException n) {
            JOptionPane.showMessageDialog(null, "ERROR", "", JOptionPane.ERROR_MESSAGE);
        }

    }

    private void loadCourse(JComboBox courses) {
        try {
            for (int i = 0; i < listaC.size(); i++) {
                course = (Course) listaC.elementAt(i);
                if (course.getCourseName()!= null) {
                    modelG.addElement(new CourseM(course.getCourseName()));
                } else {
                    modelG.addElement(i);
                }
            }
            
        } catch (NullPointerException n) {
            JOptionPane.showMessageDialog(null, "ERROR", "", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void loadSubjects(JComboBox subjects) {
        try {
            for (int i = 0; i < listaS.size(); i++) {
                subject = (Subject) listaS.elementAt(i);
                if (subject.getSubjectName()!= null) {
                    modelS.addElement(new SubjectM(subject.getSubjectName()));
                } else {
                    modelS.addElement(i);
                }
            }
            
        } catch (NullPointerException n) {
            JOptionPane.showMessageDialog(null, "ERROR", "", JOptionPane.ERROR_MESSAGE);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        teachers = new javax.swing.JComboBox<>();
        courses = new javax.swing.JComboBox<>();
        subjects = new javax.swing.JComboBox<>();
        btnCrear = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(840, 480));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Teacher");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("Course");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setText("Subject");

        teachers.setModel(modelT);

        courses.setModel(modelG);

        subjects.setModel(modelS);

        btnCrear.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnCrear.setText("Create");
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel4.setText("Create Matricule");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(191, 191, 191)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(teachers, 0, 186, Short.MAX_VALUE)
                            .addComponent(courses, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(subjects, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(239, 239, 239)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(280, 280, 280)
                        .addComponent(btnCrear)))
                .addContainerGap(306, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(teachers, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(courses, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(subjects, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addComponent(btnCrear)
                .addContainerGap(126, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
        
        TeacherM selectedTeacher =  (TeacherM) teachers.getSelectedItem();
        SubjectM selectedSubject = (SubjectM) subjects.getSelectedItem();
        CourseM selectedCourse = (CourseM) courses.getSelectedItem();
        
        for (int i = 0; i < listaT.size(); i++) {
           Teacher listTeacher =  (Teacher) listaT.elementAt(i);
           if(selectedTeacher.getId().equals(listTeacher.getUser())) {
               for (int j = 0; j < listaS.size(); j++) {
                   Subject listSubject = (Subject) listaS.elementAt(j);
                   if(selectedSubject.getName().equals(listSubject.getSubjectName())) {
                       listTeacher.setSubject(listSubject);
                       break;
                   }
               }
               for (int j = 0; j < listaC.size(); j++) {
                   Course listCourse = (Course) listaC.elementAt(j);
                   if (selectedCourse.getName().equals(listCourse.getCourseName())) {
                       listTeacher.setCourses(listCourse);
                       break;
                   }
                   
               }
               break;
           }
        }
        for (int i = 0; i < listaT.size(); i++) {
           Teacher listTeacher =  (Teacher) listaT.elementAt(i);
           if(selectedTeacher.getId().equals(listTeacher.getUser())) {
               ArrayList coursesList = listTeacher.getCourses();
               for (int j = 0; j < coursesList.size(); j++) {
                   Course cursito = (Course) coursesList.get(j);
                   System.out.println(cursito.getCourseName());
               }
           }
        }
        JOptionPane.showMessageDialog(null, "The teacher has been synced successfully");
    }//GEN-LAST:event_btnCrearActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrear;
    private javax.swing.JComboBox<String> courses;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JComboBox<String> subjects;
    private javax.swing.JComboBox<String> teachers;
    // End of variables declaration//GEN-END:variables
}
