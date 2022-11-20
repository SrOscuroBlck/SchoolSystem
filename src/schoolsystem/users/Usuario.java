package schoolsystem.users;

public class Usuario {

    private String nombre;
    private int edad;
    private char genero;
    private String correo;
    private String contraseña;
    private String usuario;

    public Usuario(String nombre, int edad, char genero, String correo, String contraseña, String usuario) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.correo = correo;
        this.contraseña = contraseña;
        this.usuario = usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
}

