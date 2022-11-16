/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package schoolsystem.userInterface;

/**
 *
 * @author gustavocamargo
 */
import java.util.ArrayList;

public class Student {
    private char gender;
    private ArrayList<String> legalTutorList;
    private String observations;
    private String initDate;
//    private ArrayList<Grade> gradeList;


    public Student(char gender, ArrayList<String> legalTutorList, String observations, String initDate) {
        this.gender = gender;
        this.legalTutorList = legalTutorList;
        this.observations = observations;
        this.initDate = initDate;
    }

    public Student() {
        this.gender = 'n';
        this.observations = "";
        this.initDate = "";
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public ArrayList<String> getLegalTutorList() {
        return legalTutorList;
    }

    public void setLegalTutorList(ArrayList<String> legalTutorList) {
        this.legalTutorList = legalTutorList;
    }

    public String getObservations() {
        return observations;
    }

    public void setObservations(String observations) {
        this.observations = observations;
    }

    public String getInitDate() {
        return initDate;
    }

    public void setInitDate(String initDate) {
        this.initDate = initDate;
    }
}

