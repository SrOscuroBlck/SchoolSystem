/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UserInterface;

import java.util.ArrayList;

/**
 *
 * @author dillan
 */
public class Grade {
    
    private String nameGrade;
    private ArrayList <String> students; // El String debe ser cambiado por la clase Students

    public Grade(){
        this.nameGrade = "";
        this.students = new ArrayList<>();
    }
    public Grade(String nameGrade) {
        this.nameGrade = nameGrade;
        this.students = new ArrayList<>();
    }

    public String getNameGrade() {
        return nameGrade;
    }

    public void setNameGrade(String nameGrade) {
        this.nameGrade = nameGrade;
    }
    
}
