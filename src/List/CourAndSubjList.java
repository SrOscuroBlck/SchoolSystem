/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package List;

import UserInterfaces.Course;
import java.util.Vector;
import UserInterfaces.Subject;

/**
 *
 * @author dillan
 */
public class CourAndSubjList {
    
    private static Vector<Course> courseVector = new Vector<Course>();
    private static Vector<Subject> subjectVector = new Vector<Subject>();
    
    // ---------------------------------------
    
    public static void addCourse(Course obj){
        courseVector.addElement(obj);
    }
    
    public static void deleteCourse(int pos){        
        courseVector.removeElementAt(pos);
    }
    
    public static Vector getCourseList(){
        return courseVector;
    }
    
    // -----------------------------------------
    
    public static void addSubject(Subject obj){
        subjectVector.addElement(obj);
    }
    
    public static void deleteSubject(int pos){        
        subjectVector.removeElementAt(pos);
    }
    
    public static Vector getSubjectList(){
        return subjectVector;
    }
   
    
}
