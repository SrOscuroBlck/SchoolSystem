package UserInterfaces;


import List.CourAndSubjList;
import java.util.ArrayList;
import java.util.Vector;
import schoolsystem.users.Teacher;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dillan
 */
public class Subject {
    
    private String subjectName;
    private ArrayList <Teacher> teachers; // El string debe ser cambiado por la clase Teacher

    public Subject(){
        this.subjectName = "";
        this.teachers = new ArrayList<>();
    }
    public Subject(String nameMater) {
        this.subjectName = nameMater;
        this.teachers = new ArrayList<>();
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }
    
    public void setTeacher(Teacher teacher) {
        teachers.add(teacher);
    }
    
    public static Vector getList(){
        return CourAndSubjList.getSubjectList();
    }
    
    public static int verifyNewSubject(String name){
        Vector subjects = getList();
        Subject obj;
        for (int i = 0; i < subjects.size(); i++){
            obj = (Subject) subjects.elementAt(i);
            if(obj.getSubjectName().equals(name)){
                return i;
            }
        }
        return -1;
    }
    
}
