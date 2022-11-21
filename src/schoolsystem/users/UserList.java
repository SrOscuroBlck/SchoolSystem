package schoolsystem.users;

import java.util.Vector;

public class UserList {
    private static Vector<Student> estudianteVector = new Vector<Student>();
    private static Vector<Teacher> profesorVector = new Vector<Teacher>();
    private static Vector<Admin> adminVector = new Vector<Admin>();

    public static void agregarEstudiante(Student obj){
        estudianteVector.addElement(obj);
    }
    public static void eliminarEstudiante(int pos){        
        estudianteVector.removeElementAt(pos);
    }
    public static Vector mostrarEstudiante(){
        return estudianteVector;
    }
    public static Student getSpecificStudent(int pos) {
        return estudianteVector.elementAt(pos);
    }

    //--------------------------------------------------------

    public static void agregarProfesor(Teacher obj){
        profesorVector.addElement(obj);      
    }
    public static void eliminarProfesor(int pos){
        profesorVector.removeElementAt(pos);
    }
    public static Vector mostrarProfesor(){
        return profesorVector;
    }

    //-------------------------------------------------------

    public static void agregarAdmin(Admin obj){
        adminVector.addElement(obj);
    }
    public static void eliminarAdmin(int pos){
        adminVector.removeElementAt(pos);
    }
    public static Vector mostrarAdmin(){
        return adminVector;
    }
}
