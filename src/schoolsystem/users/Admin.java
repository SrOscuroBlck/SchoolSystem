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

    public static Vector getList(){
        return UserList.getAdminList();
    }

    public static int verifyNewUser(String user){
        Vector admins = getList();
        Admin obj;
        for (int i = 0; i < admins.size(); i++){
            obj = (Admin) admins.elementAt(i);
            if(obj.getUsername().equals(user)){
                return i;
            }
        }
        return -1;
    }

    public static int verifyLogin(String user, String password){
        Vector admins = getList();
        Admin obj;
        for (int i = 0; i < admins.size(); i++){
            obj = (Admin) admins.elementAt(i);
            if (obj.getUsername().equalsIgnoreCase(user) && obj.getPassword().equalsIgnoreCase(password)){
                return i;
            }
        }
        return -1;
    }
}
