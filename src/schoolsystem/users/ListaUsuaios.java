package schoolsystem.users;

import java.util.Vector;

public class ListaUsuaios {
    private static Vector<Estudiante> estudianteVector = new Vector<Estudiante>();
    private static Vector<Profesor> profesorVector = new Vector<Profesor>();
    private static Vector<Admin> adminVector = new Vector<Admin>();

    public static void agregarEstudiante(Estudiante obj){
        estudianteVector.addElement(obj);
    }
    public static void eliminarEstudiante(int pos){        
        estudianteVector.removeElementAt(pos);
    }
    public static Vector mostrarEstudiante(){
        return estudianteVector;
    }

    //--------------------------------------------------------

    public static void agregarProfesor(Profesor obj){
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
