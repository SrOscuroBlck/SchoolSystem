package schoolsystem.users;

import java.util.Vector;

public class Admin{
    private String username;
    private String password;

    public Admin(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static Vector mostrar(){
        return UserList.mostrarAdmin();
    }

    public static int verificarUsuarioNuevo(String usuario){
        Vector lista = mostrar();
        Admin obj;
        for (int i = 0; i < lista.size(); i++){
            obj = (Admin) lista.elementAt(i);
            if(obj.getUsername().equals(usuario)){
                return i;
            }
        }
        return -1;
    }

    public static int verificarLogeo(String usuario, String contraseña){
        Vector lista = mostrar();
        Admin obj;
        for (int i = 0; i < lista.size(); i++){
            obj = (Admin) lista.elementAt(i);
            if (obj.getUsername().equalsIgnoreCase(usuario) && obj.getPassword().equalsIgnoreCase(contraseña)){
                return i;
            }
        }
        return -1;
    }
}
