package schoolsystem.users;

import java.util.Vector;

public class UserList {
    private static Vector<Student> studentVector = new Vector<Student>();
    private static Vector<Teacher> teacherVector = new Vector<Teacher>();
    private static Vector<Admin> adminVector = new Vector<Admin>();

    public static void addStudent(Student obj){
        studentVector.addElement(obj);
    }
    public static void deleteStudent(int pos){        
        studentVector.removeElementAt(pos);
    }
    public static Vector getStudentList(){
        return studentVector;
    }

    //--------------------------------------------------------

    public static void addTeacher(Teacher obj){
        teacherVector.addElement(obj);      
    }
    public static void deleteTeacher(int pos){
        teacherVector.removeElementAt(pos);
    }
    public static Vector getTeacherList(){
        return teacherVector;
    }

    //-------------------------------------------------------

    public static void addAdmin(Admin obj){
        adminVector.addElement(obj);
    }
    public static void deleteAdmin(int pos){
        adminVector.removeElementAt(pos);
    }
    public static Vector getAdminList(){
        return adminVector;
    }
}
