package schoolsystem.users;

import java.util.Vector;

public class Student extends User{

    private String nombrePadres;
    private String observaciones;
    private String fechaIngreso;

    public Student(String nombre, int edad, char genero, String correo, String contraseña, String usuario, String nombrePadres, String observaciones, String fechaIngreso) {
        super(nombre, edad, genero, correo, contraseña, usuario);
        this.nombrePadres = nombrePadres;
        this.observaciones = observaciones;
        this.fechaIngreso = fechaIngreso;
    }

    public String getNombrePadres() {
        return nombrePadres;
    }

    public void setNombrePadres(String nombrePadres) {
        this.nombrePadres = nombrePadres;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public static Vector mostrar(){
        return UserList.mostrarEstudiante();
    }

    public static int verificarUsuarioNuevo(String usuario){
        Vector lista = mostrar();
        Student obj;
        for (int i = 0; i < lista.size(); i++){
            obj = (Student)lista.elementAt(i);
            if(obj.getUsuario().equals(usuario)){
                return i;
            }
        }
        return -1;
    }

    public static int verificarLogeo(String usuario, String contraseña){
        Vector lista = mostrar();
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
