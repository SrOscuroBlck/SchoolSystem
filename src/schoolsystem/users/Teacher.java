package schoolsystem.users;

import java.util.ArrayList;
import java.util.Vector;

public class Teacher extends User{

    private ArrayList<String> subjects; //Cambiar String por clase materia
    private ArrayList<String> courses; //Cambiar String por clase curso

    public Teacher(String nombre, int edad, char genero, String correo, String contraseña, String usuario) {
        super(nombre, edad, genero, correo, contraseña, usuario);
        this.subjects = new ArrayList<>();
        this.courses = new ArrayList<>();
    }

    public ArrayList<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(ArrayList<String> subjects) {
        this.subjects = subjects;
    }

    public ArrayList<String> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<String> courses) {
        this.courses = courses;
    }


    public static Vector getList(){
        return UserList.getTeacherList();
    }

    public static int verifyNewUser(String user){
        Vector teachers = getList();
        Teacher obj;
        for (int i = 0; i < teachers.size(); i++){
            obj = (Teacher) teachers.elementAt(i);
            if(obj.getUser().equals(user)){
                return i;
            }
        }
        return -1;
    }

    public static int verifyLogin(String user, String password){
        Vector teachers = getList();
        Teacher obj;
        for (int i = 0; i < teachers.size(); i++){
            obj = (Teacher) teachers.elementAt(i);
            if (obj.getUser().equalsIgnoreCase(user) && obj.getPassword().equalsIgnoreCase(password)){
                return i;
            }
        }
        return -1;
    }
}