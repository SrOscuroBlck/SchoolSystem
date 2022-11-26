/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package schoolsystem.userInterface.TSInterface.StudentInterface;

import UserInterfaces.Subject;
import schoolsystem.users.Student;

/**
 *
 * @author gustavocamargo
 */
public class Grade {
    private Student student;
    private Subject subject;
    private double grade;

    public Grade(Student student, Subject subject, double grade) {
        this.student = student;
        this.subject = subject;
        this.grade = grade;
    }

    public Grade() {
        this.grade = 0.0;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }
}
