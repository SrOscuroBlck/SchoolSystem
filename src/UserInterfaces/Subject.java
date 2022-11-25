package UserInterfaces;


import List.CourAndSubjList;
import java.util.ArrayList;
import java.util.Vector;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dillan
 */
public class Subject {
    
    private String nameMater;
    private ArrayList <String> teachers; // El string debe ser cambiado por la clase Teacher

    public Subject(){
        this.nameMater = "";
        this.teachers = new ArrayList<>();
    }
    public Subject(String nameMater) {
        this.nameMater = nameMater;
        this.teachers = new ArrayList<>();
    }

    public String getNameSubject() {
        return nameMater;
    }

    public void setNameSubject(String nameMater) {
        this.nameMater = nameMater;
    }
    
    public static Vector getList(){
        return CourAndSubjList.getSubjectList();
    }
    
    public static int verifyNewSubject(String name){
        Vector subjects = getList();
        Subject obj;
        for (int i = 0; i < subjects.size(); i++){
            obj = (Subject) subjects.elementAt(i);
            if(obj.getNameSubject().equals(name)){
                return i;
            }
        }
        return -1;
    }
    
}
