package schoolsystem.users;

import UserInterfaces.Course;
import UserInterfaces.Subject;
import java.util.ArrayList;
import java.util.Vector;

public class Teacher extends User{

    private ArrayList<Subject> subjects; //Cambiar String por clase materia
    private ArrayList<Course> courses; //Cambiar String por clase curso

    public Teacher(String nombre, int edad, char genero, String correo, String contraseña, String usuario) {
        super(nombre, edad, genero, correo, contraseña, usuario);
        this.subjects = new ArrayList();
        this.courses = new ArrayList();

    }

    public ArrayList<Subject> getSubjects() {
        return subjects;
    }

    public void setSubject(Subject subject) {
        subjects.add(subject);
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void setCourses(Course course) {
        courses.add(course);
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