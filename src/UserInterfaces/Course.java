/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UserInterfaces;

import List.CourAndSubjList;
import java.util.ArrayList;
import java.util.Vector;

/**
 *
 * @author dillan
 */
public class Course {
    
    private String nameGrade;
    private ArrayList <String> students; // El String debe ser cambiado por la clase Students

    public Course(){
        this.nameGrade = "";
        this.students = new ArrayList<>();
    }
    public Course(String nameGrade) {
        this.nameGrade = nameGrade;
        this.students = new ArrayList<>();
    }

    public String getNameCourse() {
        return nameGrade;
    }

    public void setNameCourse(String nameGrade) {
        this.nameGrade = nameGrade;
    }
    
    public static Vector getList(){
        return CourAndSubjList.getCourseList();
    }
    
    public static int verifyNewCourse(String name){
        Vector courses = getList();
        Course obj;
        for (int i = 0; i < courses.size(); i++){
            obj = (Course) courses.elementAt(i);
            if(obj.getNameCourse().equals(name)){
                return i;
            }
        }
        return -1;
    }
    
}
