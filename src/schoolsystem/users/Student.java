package schoolsystem.users;

import java.util.Vector;

public class Student extends User{

    private String parentsName;
    private String observations;
    private String initDate;

    public Student(String name, int age, char gender, String email, String password, String user, String parentsName, String observations, String initDate) {
        super(name, age, gender, email, password, user);
        this.parentsName = parentsName;
        this.observations = observations;
        this.initDate = initDate;
    }

    public String getParentsName() {
        return parentsName;
    }

    public void setParentsName(String parentsName) {
        this.parentsName = parentsName;
    }

    public String getObservations() {
        return observations;
    }

    public void setObservations(String observations) {
        this.observations = observations;
    }

    public String getInitDate() {
        return initDate;
    }

    public void setInitDate(String initDate) {
        this.initDate = initDate;
    }

    public static Vector getList(){
        return UserList.mostrarEstudiante();
    }

    public static int verifyNewUser(String usuario){
        Vector teachers = getList();
        Student obj;
        for (int i = 0; i < teachers.size(); i++){
            obj = (Student)teachers.elementAt(i);
            if(obj.getUsuario().equals(usuario)){
                return i;
            }
        }
        return -1;
    }

    public static int verificarLogeo(String usuario, String contraseña){
        Vector lista = getList();
        Student obj;
        for (int i = 0; i < lista.size(); i++){
            obj = (Student)lista.elementAt(i);
            if (obj.getUsuario().equalsIgnoreCase(usuario) && obj.getContraseña().equalsIgnoreCase(contraseña)){
                return i;
            }
        }
        return -1;
    }
    
}
