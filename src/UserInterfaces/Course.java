/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UserInterfaces;

import List.CourAndSubjList;
import java.util.ArrayList;
import java.util.Vector;
import schoolsystem.users.Student;

/**
 *
 * @author dillan
 */
public class Course {
    
    private String courseName;
    private ArrayList <Student> students; // El String debe ser cambiado por la clase Students

    public Course(){
        this.courseName = "";
        this.students = new ArrayList<>();
    }
    public Course(String nameGrade) {
        this.courseName = nameGrade;
        this.students = new ArrayList<>();
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudent(Student student) {
        students.add(student);
    }
    
    public static Vector getList(){
        return CourAndSubjList.getCourseList();
    }
    
    public static int verifyNewCourse(String name){
        Vector courses = getList();
        Course obj;
        for (int i = 0; i < courses.size(); i++){
            obj = (Course) courses.elementAt(i);
            if(obj.getCourseName().equals(name)){
                return i;
            }
        }
        return -1;
    }
    
}
