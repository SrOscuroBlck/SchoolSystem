package schoolsystem.users;

import java.util.ArrayList;
import java.util.Vector;

public class Profesor extends Usuario{

    private ArrayList<String> materias; //Cambiar String por clase materia
    private ArrayList<String> cursos; //Cambiar String por clase curso

    public Profesor(String nombre, int edad, char genero, String correo, String contraseña, String usuario) {
        super(nombre, edad, genero, correo, contraseña, usuario);
        this.materias = new ArrayList<>();
        this.cursos = new ArrayList<>();
    }

    public ArrayList<String> getMaterias() {
        return materias;
    }

    public void setMaterias(ArrayList<String> materias) {
        this.materias = materias;
    }

    public ArrayList<String> getCursos() {
        return cursos;
    }

    public void setCursos(ArrayList<String> cursos) {
        this.cursos = cursos;
    }

    public static Vector mostrar(){
        return ListaUsuaios.mostrarProfesor();
    }

    public static int verificarUsuarioNuevo(String usuario){
        Vector lista = mostrar();
        Profesor obj;
        for (int i = 0; i < lista.size(); i++){
            obj = (Profesor) lista.elementAt(i);
            if(obj.getUsuario().equals(usuario)){
                return i;
            }
        }
        return -1;
    }

    public static int verificarLogeo(String usuario, String contraseña){
        Vector lista = mostrar();
        Profesor obj;
        for (int i = 0; i < lista.size(); i++){
            obj = (Profesor) lista.elementAt(i);
            if (obj.getUsuario().equalsIgnoreCase(usuario) && obj.getContraseña().equalsIgnoreCase(contraseña)){
                return i;
            }
        }
        return -1;
    }
}